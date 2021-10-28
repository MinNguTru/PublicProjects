'Minh Nguyen
'CS 115
'Allison Obourn

'Programming Assignment #8 Creative Project

'Program allows user to shop for school supplies online
Public Class Creative
    Dim UserConfirm As Boolean = False
    Dim Quantities(4) As Integer
    Dim Prices(4) As Double
    Dim dblTotalPrice As Double
    Dim bmp As New System.Drawing.Bitmap(450, 450)
    Dim g As Graphics = Graphics.FromImage(bmp)
    'Starts users at first tab and load values
    Sub Start() Handles Me.Load
        TabUser()
        ConfirmedUser()
        ItemAmounts()
        PriceValues()
    End Sub
    'Requires a username from the user to shop
    Sub QuickShop() Handles btnStart.Click
        Dim strUser As String = txtNameEnter.Text
        If strUser = "" Then
            lblMessage.Show()
            lblUserDisplay.Text = "User: "
            UserConfirm = False
            ConfirmedUser()
        Else
            lblUserDisplay.Text = "User: " & strUser
            HideGUI(2)
            UserConfirm = True
        End If
        ConfirmedUser()
    End Sub
    'Add items to list of user's cumlative items
    Sub AddItem() Handles btnAddCart.Click
        Dim ChoosenQuantity As Integer = cmbAmount.SelectedItem
        If cmbItems.SelectedItem = "Notebooks - $1.49" Then
            Quantities(0) = Quantities(0) + ChoosenQuantity
        ElseIf cmbItems.SelectedItem = "Printing Paper - $0.49" Then
            Quantities(1) = Quantities(1) + ChoosenQuantity
        ElseIf cmbItems.SelectedItem = "Watercolor - $2.99" Then
            Quantities(2) = Quantities(2) + ChoosenQuantity
        ElseIf cmbItems.SelectedItem = "Sharpies - $7.49" Then
            Quantities(3) = Quantities(3) + ChoosenQuantity
        Else
            Quantities(4) = Quantities(4) + ChoosenQuantity
        End If
    End Sub
    'Remove all checked items from list
    Sub Remove() Handles btnRemove.Click
        If chkRemoveN.Checked Then
            Quantities(0) = 0
        End If
        If chkRemovePP.Checked Then
            Quantities(1) = 0
        End If
        If chkRemoveW.Checked Then
            Quantities(2) = 0
        End If
        If chkRemoveS.Checked Then
            Quantities(3) = 0
        End If
        If chkRemoveGP.Checked Then
            Quantities(4) = 0
        End If
        TotalPrice()
        CheckoutUpdater()
    End Sub
    'Thanks customer, gives total price plus shipping, and allows user to save a receipt
    Sub FinalScreen() Handles btnComplete.Click
        HideGUI(0)
        btnBuy.Enabled = False
        btnCheckout.Enabled = False
        If rbtnExpress.Checked Then
            dblTotalPrice = dblTotalPrice + 14.99
        End If
        lblTotalPrice.Text = "$" & dblTotalPrice
        If dblTotalPrice > 0 Then
            lblMessage.Text = "Thank you " & txtNameEnter.Text & "!"
        Else
            lblMessage.Text = "See you next time " & txtNameEnter.Text & "!"
        End If
        lblMessage.Show()
        lblTotalEnd.Text = "Total: $" & dblTotalPrice
        lblTotalEnd.Show()
        Dim result As DialogResult = diaSaveReceipt.ShowDialog
        If result = Windows.Forms.DialogResult.OK Then
            FileOpen(1, diaSaveReceipt.FileName, OpenMode.Output)
            WriteLine(1, "Receipt")
            WriteLine(1, chkRemoveN.Text)
            WriteLine(1, chkRemovePP.Text)
            WriteLine(1, chkRemoveW.Text)
            WriteLine(1, chkRemoveS.Text)
            WriteLine(1, chkRemoveGP.Text)
            WriteLine(1, "$" & dblTotalPrice)
            FileClose(1)
        End If
    End Sub
    'Transfer user to checkout page from shopping page
    Sub QuickCheckout() Handles btnDoneBuy.Click
        CheckoutUpdater()
        HideGUI(3)
        TotalPrice()
    End Sub
    'Transfer user to entry page through tabs
    Sub TabUser() Handles btnID.Click
        lblMessage.Text = "You must enter a username!"
        HideGUI(1)
        g.DrawRectangle(Pens.Black, 0, 0, 49, 49)
        pbxAvatar.Image = bmp
    End Sub
    'Transfer user to shopping page through tabs
    Sub TabShop() Handles btnBuy.Click
        HideGUI(2)
        ItemAmounts()
    End Sub
    'Transfer user to checkout page though tabs
    Sub TabCheckout() Handles btnCheckout.Click
        CheckoutUpdater()
        HideGUI(3)
        TotalPrice()
    End Sub
    'Determines if user should be locked out or have full access
    Sub ConfirmedUser()
        If UserConfirm = False Then
            btnCheckout.Enabled = False
            btnBuy.Enabled = False
        Else
            btnCheckout.Enabled = True
            btnBuy.Enabled = True
        End If
    End Sub
    'Adds quantities for purchasing items
    Sub ItemAmounts()
        For i As Integer = 0 To 50
            cmbAmount.Items.Add(i)
        Next
    End Sub
    'Allows user to upload a personal avatar less than 50x50
    Sub ProfilePicture() Handles btnAvatar.Click
        Dim result As DialogResult = diaLoadProfile.ShowDialog
        If result = Windows.Forms.DialogResult.OK Then
            Dim strName As String = diaLoadProfile.FileName
            Dim picNewImage As Image = Image.FromFile(strName)
            pbxAvatar.Image = picNewImage
            bmp = picNewImage
            g = Graphics.FromImage(bmp)
        End If
    End Sub
    'Sets the values of items
    Sub PriceValues()
        Prices(0) = 1.49
        Prices(1) = 0.49
        Prices(2) = 2.99
        Prices(3) = 7.49
        Prices(4) = 3.49
    End Sub
    'Updates the final list when items are added or subtracted
    Sub CheckoutUpdater()
        chkRemoveN.Text = "(" & Quantities(0) & ")($" & Prices(0) & ") Notebooks"
        chkRemovePP.Text = "(" & Quantities(1) & ")($" & Prices(1) & ") Printing Paper"
        chkRemoveW.Text = "(" & Quantities(2) & ")($" & Prices(2) & ") Watercolor"
        chkRemoveS.Text = "(" & Quantities(3) & ")($" & Prices(3) & ") Sharpies"
        chkRemoveGP.Text = "(" & Quantities(4) & ")($" & Prices(4) & ") Graphing Paper"
    End Sub
    'Determines the total price of all items
    Sub TotalPrice()
        dblTotalPrice = 0
        For i As Integer = 0 To Quantities.Length - 1
            dblTotalPrice = dblTotalPrice + Calculator(i)
        Next
        lblTotalPrice.Text = "$" & dblTotalPrice
    End Sub
    'Calculates the total prices of each item
    Function Calculator(intItemNumber As Integer)
        Dim dblItemCost As Double = 0
        dblItemCost = Quantities(intItemNumber) * Prices(intItemNumber)
        Return dblItemCost
    End Function
    'Hides and shows interfaces based on user's shopping stage
    Sub HideGUI(intDetermine As Integer)
        lblMessage.Hide()
        lblTotalEnd.Hide()
        If intDetermine = 0 Then
            rbtnFree.Hide()
            rbtnExpress.Hide()
            btnRemove.Hide()
            btnComplete.Hide()
            chkRemoveN.Hide()
            chkRemoveGP.Hide()
            chkRemovePP.Hide()
            chkRemoveS.Hide()
            chkRemoveW.Hide()
            lblTotalPrice.Hide()
            cmbAmount.Hide()
            cmbItems.Hide()
            lblAmount.Hide()
            lblItems.Hide()
            btnAddCart.Hide()
            btnDoneBuy.Hide()
            lblName.Hide()
            txtNameEnter.Hide()
            btnStart.Hide()
            btnAvatar.Hide()
            lblImage.Hide()
        End If
        If intDetermine = 1 Then
            lblName.Show()
            txtNameEnter.Show()
            btnStart.Show()
            btnAvatar.Show()
        Else
            lblName.Hide()
            txtNameEnter.Hide()
            btnStart.Hide()
            btnAvatar.Hide()
            lblImage.Hide()
        End If
        If intDetermine = 2 Then
            cmbAmount.Show()
            cmbItems.Show()
            lblAmount.Show()
            lblItems.Show()
            btnAddCart.Show()
            btnDoneBuy.Show()
        Else
            cmbAmount.Hide()
            cmbItems.Hide()
            lblAmount.Hide()
            lblItems.Hide()
            btnAddCart.Hide()
            btnDoneBuy.Hide()
        End If
        If intDetermine = 3 Then
            rbtnExpress.Show()
            rbtnFree.Show()
            btnRemove.Show()
            btnComplete.Show()
            chkRemoveN.Show()
            chkRemoveGP.Show()
            chkRemovePP.Show()
            chkRemoveS.Show()
            chkRemoveW.Show()
            lblTotalPrice.Show()
        Else
            rbtnFree.Hide()
            rbtnExpress.Hide()
            btnRemove.Hide()
            btnComplete.Hide()
            chkRemoveN.Hide()
            chkRemoveGP.Hide()
            chkRemovePP.Hide()
            chkRemoveS.Hide()
            chkRemoveW.Hide()
            lblTotalPrice.Hide()
        End If
    End Sub
End Class
