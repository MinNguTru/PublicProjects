<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Creative
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.btnStart = New System.Windows.Forms.Button()
        Me.lblName = New System.Windows.Forms.Label()
        Me.txtNameEnter = New System.Windows.Forms.TextBox()
        Me.lblMessage = New System.Windows.Forms.Label()
        Me.btnID = New System.Windows.Forms.Button()
        Me.btnBuy = New System.Windows.Forms.Button()
        Me.btnCheckout = New System.Windows.Forms.Button()
        Me.cmbItems = New System.Windows.Forms.ComboBox()
        Me.rbtnExpress = New System.Windows.Forms.RadioButton()
        Me.rbtnFree = New System.Windows.Forms.RadioButton()
        Me.cmbAmount = New System.Windows.Forms.ComboBox()
        Me.lblAmount = New System.Windows.Forms.Label()
        Me.lblItems = New System.Windows.Forms.Label()
        Me.lblUserDisplay = New System.Windows.Forms.Label()
        Me.btnAddCart = New System.Windows.Forms.Button()
        Me.btnDoneBuy = New System.Windows.Forms.Button()
        Me.btnRemove = New System.Windows.Forms.Button()
        Me.btnComplete = New System.Windows.Forms.Button()
        Me.chkRemoveGP = New System.Windows.Forms.CheckBox()
        Me.chkRemoveS = New System.Windows.Forms.CheckBox()
        Me.chkRemoveW = New System.Windows.Forms.CheckBox()
        Me.chkRemovePP = New System.Windows.Forms.CheckBox()
        Me.chkRemoveN = New System.Windows.Forms.CheckBox()
        Me.lblTotalPrice = New System.Windows.Forms.Label()
        Me.lblTotalEnd = New System.Windows.Forms.Label()
        Me.diaSaveReceipt = New System.Windows.Forms.SaveFileDialog()
        Me.pbxAvatar = New System.Windows.Forms.PictureBox()
        Me.btnAvatar = New System.Windows.Forms.Button()
        Me.lblImage = New System.Windows.Forms.Label()
        Me.diaLoadProfile = New System.Windows.Forms.OpenFileDialog()
        CType(Me.pbxAvatar, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnStart
        '
        Me.btnStart.Location = New System.Drawing.Point(360, 190)
        Me.btnStart.Name = "btnStart"
        Me.btnStart.Size = New System.Drawing.Size(81, 42)
        Me.btnStart.TabIndex = 1
        Me.btnStart.Text = "Begin Shopping"
        Me.btnStart.UseVisualStyleBackColor = True
        '
        'lblName
        '
        Me.lblName.AutoSize = True
        Me.lblName.Location = New System.Drawing.Point(307, 148)
        Me.lblName.Name = "lblName"
        Me.lblName.Size = New System.Drawing.Size(35, 13)
        Me.lblName.TabIndex = 4
        Me.lblName.Text = "Name"
        '
        'txtNameEnter
        '
        Me.txtNameEnter.Location = New System.Drawing.Point(310, 164)
        Me.txtNameEnter.Name = "txtNameEnter"
        Me.txtNameEnter.Size = New System.Drawing.Size(180, 20)
        Me.txtNameEnter.TabIndex = 5
        '
        'lblMessage
        '
        Me.lblMessage.AutoSize = True
        Me.lblMessage.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.0!)
        Me.lblMessage.Location = New System.Drawing.Point(282, 112)
        Me.lblMessage.Name = "lblMessage"
        Me.lblMessage.Size = New System.Drawing.Size(257, 25)
        Me.lblMessage.TabIndex = 6
        Me.lblMessage.Text = "You must enter a username!"
        '
        'btnID
        '
        Me.btnID.Location = New System.Drawing.Point(0, -3)
        Me.btnID.Name = "btnID"
        Me.btnID.Size = New System.Drawing.Size(62, 29)
        Me.btnID.TabIndex = 7
        Me.btnID.Text = "User"
        Me.btnID.UseVisualStyleBackColor = True
        '
        'btnBuy
        '
        Me.btnBuy.Location = New System.Drawing.Point(56, -3)
        Me.btnBuy.Name = "btnBuy"
        Me.btnBuy.Size = New System.Drawing.Size(62, 29)
        Me.btnBuy.TabIndex = 8
        Me.btnBuy.Text = "Shop"
        Me.btnBuy.UseVisualStyleBackColor = True
        '
        'btnCheckout
        '
        Me.btnCheckout.Location = New System.Drawing.Point(112, -3)
        Me.btnCheckout.Name = "btnCheckout"
        Me.btnCheckout.Size = New System.Drawing.Size(62, 29)
        Me.btnCheckout.TabIndex = 9
        Me.btnCheckout.Text = "Checkout"
        Me.btnCheckout.UseVisualStyleBackColor = True
        '
        'cmbItems
        '
        Me.cmbItems.FormattingEnabled = True
        Me.cmbItems.Items.AddRange(New Object() {"Notebooks - $1.49", "Printing Paper - $ .49", "Watercolor - $2.99", "Sharpies - $7.49", "Graph Paper - $3.49"})
        Me.cmbItems.Location = New System.Drawing.Point(414, 108)
        Me.cmbItems.Name = "cmbItems"
        Me.cmbItems.Size = New System.Drawing.Size(103, 21)
        Me.cmbItems.TabIndex = 10
        '
        'rbtnExpress
        '
        Me.rbtnExpress.AutoSize = True
        Me.rbtnExpress.Location = New System.Drawing.Point(376, 261)
        Me.rbtnExpress.Name = "rbtnExpress"
        Me.rbtnExpress.Size = New System.Drawing.Size(163, 17)
        Me.rbtnExpress.TabIndex = 11
        Me.rbtnExpress.TabStop = True
        Me.rbtnExpress.Text = "24 Hours Shipping (+ $14.99)"
        Me.rbtnExpress.UseVisualStyleBackColor = True
        '
        'rbtnFree
        '
        Me.rbtnFree.AutoSize = True
        Me.rbtnFree.Location = New System.Drawing.Point(376, 284)
        Me.rbtnFree.Name = "rbtnFree"
        Me.rbtnFree.Size = New System.Drawing.Size(121, 17)
        Me.rbtnFree.TabIndex = 12
        Me.rbtnFree.TabStop = True
        Me.rbtnFree.Text = "7-Day Free Shipping"
        Me.rbtnFree.UseVisualStyleBackColor = True
        '
        'cmbAmount
        '
        Me.cmbAmount.FormattingEnabled = True
        Me.cmbAmount.Location = New System.Drawing.Point(414, 148)
        Me.cmbAmount.Name = "cmbAmount"
        Me.cmbAmount.Size = New System.Drawing.Size(103, 21)
        Me.cmbAmount.TabIndex = 13
        '
        'lblAmount
        '
        Me.lblAmount.AutoSize = True
        Me.lblAmount.Location = New System.Drawing.Point(411, 132)
        Me.lblAmount.Name = "lblAmount"
        Me.lblAmount.Size = New System.Drawing.Size(46, 13)
        Me.lblAmount.TabIndex = 14
        Me.lblAmount.Text = "Amount:"
        '
        'lblItems
        '
        Me.lblItems.AutoSize = True
        Me.lblItems.Location = New System.Drawing.Point(411, 92)
        Me.lblItems.Name = "lblItems"
        Me.lblItems.Size = New System.Drawing.Size(35, 13)
        Me.lblItems.TabIndex = 15
        Me.lblItems.Text = "Items:"
        '
        'lblUserDisplay
        '
        Me.lblUserDisplay.AutoSize = True
        Me.lblUserDisplay.Location = New System.Drawing.Point(12, 389)
        Me.lblUserDisplay.Name = "lblUserDisplay"
        Me.lblUserDisplay.Size = New System.Drawing.Size(32, 13)
        Me.lblUserDisplay.TabIndex = 16
        Me.lblUserDisplay.Text = "User:"
        '
        'btnAddCart
        '
        Me.btnAddCart.Location = New System.Drawing.Point(447, 190)
        Me.btnAddCart.Name = "btnAddCart"
        Me.btnAddCart.Size = New System.Drawing.Size(70, 23)
        Me.btnAddCart.TabIndex = 17
        Me.btnAddCart.Text = "Add to Cart"
        Me.btnAddCart.UseVisualStyleBackColor = True
        '
        'btnDoneBuy
        '
        Me.btnDoneBuy.Location = New System.Drawing.Point(447, 219)
        Me.btnDoneBuy.Name = "btnDoneBuy"
        Me.btnDoneBuy.Size = New System.Drawing.Size(70, 36)
        Me.btnDoneBuy.TabIndex = 18
        Me.btnDoneBuy.Text = "Checkout Now"
        Me.btnDoneBuy.UseVisualStyleBackColor = True
        '
        'btnRemove
        '
        Me.btnRemove.Location = New System.Drawing.Point(284, 219)
        Me.btnRemove.Name = "btnRemove"
        Me.btnRemove.Size = New System.Drawing.Size(70, 36)
        Me.btnRemove.TabIndex = 19
        Me.btnRemove.Text = "Remove Item"
        Me.btnRemove.UseVisualStyleBackColor = True
        '
        'btnComplete
        '
        Me.btnComplete.Location = New System.Drawing.Point(284, 261)
        Me.btnComplete.Name = "btnComplete"
        Me.btnComplete.Size = New System.Drawing.Size(70, 36)
        Me.btnComplete.TabIndex = 20
        Me.btnComplete.Text = "Order (Receipt)"
        Me.btnComplete.UseVisualStyleBackColor = True
        '
        'chkRemoveGP
        '
        Me.chkRemoveGP.AutoSize = True
        Me.chkRemoveGP.Location = New System.Drawing.Point(376, 219)
        Me.chkRemoveGP.Name = "chkRemoveGP"
        Me.chkRemoveGP.Size = New System.Drawing.Size(81, 17)
        Me.chkRemoveGP.TabIndex = 22
        Me.chkRemoveGP.Text = "CheckBox1"
        Me.chkRemoveGP.UseVisualStyleBackColor = True
        '
        'chkRemoveS
        '
        Me.chkRemoveS.AutoSize = True
        Me.chkRemoveS.Location = New System.Drawing.Point(376, 194)
        Me.chkRemoveS.Name = "chkRemoveS"
        Me.chkRemoveS.Size = New System.Drawing.Size(81, 17)
        Me.chkRemoveS.TabIndex = 23
        Me.chkRemoveS.Text = "CheckBox2"
        Me.chkRemoveS.UseVisualStyleBackColor = True
        '
        'chkRemoveW
        '
        Me.chkRemoveW.AutoSize = True
        Me.chkRemoveW.Location = New System.Drawing.Point(376, 166)
        Me.chkRemoveW.Name = "chkRemoveW"
        Me.chkRemoveW.Size = New System.Drawing.Size(81, 17)
        Me.chkRemoveW.TabIndex = 24
        Me.chkRemoveW.Text = "CheckBox3"
        Me.chkRemoveW.UseVisualStyleBackColor = True
        '
        'chkRemovePP
        '
        Me.chkRemovePP.AutoSize = True
        Me.chkRemovePP.Location = New System.Drawing.Point(376, 140)
        Me.chkRemovePP.Name = "chkRemovePP"
        Me.chkRemovePP.Size = New System.Drawing.Size(81, 17)
        Me.chkRemovePP.TabIndex = 25
        Me.chkRemovePP.Text = "CheckBox4"
        Me.chkRemovePP.UseVisualStyleBackColor = True
        '
        'chkRemoveN
        '
        Me.chkRemoveN.AutoSize = True
        Me.chkRemoveN.Location = New System.Drawing.Point(376, 117)
        Me.chkRemoveN.Name = "chkRemoveN"
        Me.chkRemoveN.Size = New System.Drawing.Size(81, 17)
        Me.chkRemoveN.TabIndex = 26
        Me.chkRemoveN.Text = "CheckBox4"
        Me.chkRemoveN.UseVisualStyleBackColor = True
        '
        'lblTotalPrice
        '
        Me.lblTotalPrice.AutoSize = True
        Me.lblTotalPrice.Cursor = System.Windows.Forms.Cursors.Default
        Me.lblTotalPrice.Location = New System.Drawing.Point(373, 242)
        Me.lblTotalPrice.Name = "lblTotalPrice"
        Me.lblTotalPrice.Size = New System.Drawing.Size(19, 13)
        Me.lblTotalPrice.TabIndex = 27
        Me.lblTotalPrice.Text = "$0"
        '
        'lblTotalEnd
        '
        Me.lblTotalEnd.AutoSize = True
        Me.lblTotalEnd.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.0!)
        Me.lblTotalEnd.Location = New System.Drawing.Point(282, 139)
        Me.lblTotalEnd.Name = "lblTotalEnd"
        Me.lblTotalEnd.Size = New System.Drawing.Size(23, 25)
        Me.lblTotalEnd.TabIndex = 28
        Me.lblTotalEnd.Text = "a"
        '
        'pbxAvatar
        '
        Me.pbxAvatar.Location = New System.Drawing.Point(16, 328)
        Me.pbxAvatar.Name = "pbxAvatar"
        Me.pbxAvatar.Size = New System.Drawing.Size(50, 50)
        Me.pbxAvatar.TabIndex = 29
        Me.pbxAvatar.TabStop = False
        '
        'btnAvatar
        '
        Me.btnAvatar.Location = New System.Drawing.Point(72, 338)
        Me.btnAvatar.Name = "btnAvatar"
        Me.btnAvatar.Size = New System.Drawing.Size(67, 40)
        Me.btnAvatar.TabIndex = 30
        Me.btnAvatar.Text = "Upload Avatar"
        Me.btnAvatar.UseVisualStyleBackColor = True
        '
        'lblImage
        '
        Me.lblImage.AutoSize = True
        Me.lblImage.Location = New System.Drawing.Point(72, 322)
        Me.lblImage.Name = "lblImage"
        Me.lblImage.Size = New System.Drawing.Size(66, 13)
        Me.lblImage.TabIndex = 31
        Me.lblImage.Text = "50 x 50 Only"
        '
        'diaLoadProfile
        '
        Me.diaLoadProfile.FileName = "Picture"
        '
        'Creative
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(784, 411)
        Me.Controls.Add(Me.lblImage)
        Me.Controls.Add(Me.btnAvatar)
        Me.Controls.Add(Me.pbxAvatar)
        Me.Controls.Add(Me.lblTotalEnd)
        Me.Controls.Add(Me.lblTotalPrice)
        Me.Controls.Add(Me.chkRemoveN)
        Me.Controls.Add(Me.chkRemovePP)
        Me.Controls.Add(Me.chkRemoveW)
        Me.Controls.Add(Me.chkRemoveS)
        Me.Controls.Add(Me.chkRemoveGP)
        Me.Controls.Add(Me.btnComplete)
        Me.Controls.Add(Me.btnRemove)
        Me.Controls.Add(Me.btnDoneBuy)
        Me.Controls.Add(Me.btnAddCart)
        Me.Controls.Add(Me.lblUserDisplay)
        Me.Controls.Add(Me.lblItems)
        Me.Controls.Add(Me.lblAmount)
        Me.Controls.Add(Me.cmbAmount)
        Me.Controls.Add(Me.rbtnFree)
        Me.Controls.Add(Me.rbtnExpress)
        Me.Controls.Add(Me.cmbItems)
        Me.Controls.Add(Me.btnCheckout)
        Me.Controls.Add(Me.btnBuy)
        Me.Controls.Add(Me.btnID)
        Me.Controls.Add(Me.lblMessage)
        Me.Controls.Add(Me.txtNameEnter)
        Me.Controls.Add(Me.lblName)
        Me.Controls.Add(Me.btnStart)
        Me.Name = "Creative"
        Me.Text = "Creative"
        CType(Me.pbxAvatar, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnStart As Button
    Friend WithEvents lblName As Label
    Friend WithEvents txtNameEnter As TextBox
    Friend WithEvents lblMessage As Label
    Friend WithEvents btnID As Button
    Friend WithEvents btnBuy As Button
    Friend WithEvents btnCheckout As Button
    Friend WithEvents cmbItems As ComboBox
    Friend WithEvents rbtnExpress As RadioButton
    Friend WithEvents rbtnFree As RadioButton
    Friend WithEvents cmbAmount As ComboBox
    Friend WithEvents lblAmount As Label
    Friend WithEvents lblItems As Label
    Friend WithEvents lblUserDisplay As Label
    Friend WithEvents btnAddCart As Button
    Friend WithEvents btnDoneBuy As Button
    Friend WithEvents btnRemove As Button
    Friend WithEvents btnComplete As Button
    Friend WithEvents chkRemoveGP As CheckBox
    Friend WithEvents chkRemoveS As CheckBox
    Friend WithEvents chkRemoveW As CheckBox
    Friend WithEvents chkRemovePP As CheckBox
    Friend WithEvents chkRemoveN As CheckBox
    Friend WithEvents lblTotalPrice As Label
    Friend WithEvents lblTotalEnd As Label
    Friend WithEvents diaSaveReceipt As SaveFileDialog
    Friend WithEvents pbxAvatar As PictureBox
    Friend WithEvents btnAvatar As Button
    Friend WithEvents lblImage As Label
    Friend WithEvents diaLoadProfile As OpenFileDialog
End Class
