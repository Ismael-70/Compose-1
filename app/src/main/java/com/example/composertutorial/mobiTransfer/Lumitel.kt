package com.example.composertutorial.mobiTransfer

fun main(){
    // USSD code
    checkedUSSDCode()

}

//variable
const val myPhoneNumber = 68274651
const val registeredName = "Kwizera Ibrahim"
const val myPinCode = 1234
var myBalance = 100000

var enteredAmount: Int = 1
var phoneNumber: Int = 0
var transferContent: String = "Lumicash"
var receiverName : String = "Simbananiye Hafsa"
var pinCode = 1111
var transferFees : Int = 1000

var agentCode = 1234
var cashOutAmount = 1000
var pinCodeForCash = 1000
var cashOutFees = 1000
var agentName = "SA Lumicash Agent"

/**************************** Operation(USSD CODE AND VERIFICATION)  ******************************/

fun checkedUSSDCode(){
    println("Enter LumiCash code : ")
    println()
    val code = readLine().toString()

    // verify USSD Code
    verifiedUSSCode(code)
}
fun verifiedUSSCode(code: String) :String{
    when(code){
        "*163#"->{
            // USSD code is correct, display Menu
            displayOperationMenu()
        }
        else->{
            println("\nConnection problem or Invalid MMI code\n")
        }
    }
    return code
}
fun chooseOperationMenu(){
    val number: String = readLine().toString()

    //Verify operation
    verifiedOperationMenu(number)
}
fun displayOperationMenu(){
    println("Lumicash - pls choose :")
    println("1.Transfer")
    println("2.Cash Out")
    println("3.Buy airtime")
    println("4.Pay bills")
    println("5.Pay Merchant")
    println("6.Banking service")
    println("7.OBR")
    println("8.Mairie")
    println("9.Fertiliser")
    println("10.Utilities")
    println("0.Cancel")
    println()

    // verified if the chosen number exist
    chooseOperationMenu()
}

/**************************** BEGIN First Operation(TRANSFER)  ************************************/

fun enterPhoneNumber(){
    println("Enter Phone number:")
    println("0.Return\n\n")
    phoneNumber =readln().toInt()

    when(phoneNumber){
        in 61000000..69999999->{
            //verify  phone number is equal as username
            verifyPhoneNumber()

        }
        0->{
            displayOperationMenu()
        }
        else->{
            println("Invalid phone number.Please try\nagain!Phone number:")
            enterPhoneNumber()
        }
    }
}
fun verifyPhoneNumber(){
    if (phoneNumber != myPhoneNumber){
        enterAmount()
    }
    else{
        println("The phone number must be different your phone number")
        enterPhoneNumber()
    }
}
fun enterAmount() : Int{
    println("Enter Amount:")
    println("0.Return\n\n")
    enteredAmount = readln().toInt()

    when(enteredAmount){
        in 1000..1000000->{
            enterTransferContent()
        }
        0->{
            enterPhoneNumber()
        }
        else->{
            println("Wrong format of Amount.Please try\n check again!Enter amount:")
            enterAmount()
        }
    }
    return enteredAmount
}
fun enterTransferContent() : String {
    println("Enter Transfer Content:")
    println("0.Return\n\n")
    transferContent = readln().toString()

    when(transferContent){
        transferContent ->{
            pinCode()
        }
        "0"->{
            enterAmount()
        }
    }
    return transferContent
}
fun pinCode() : Int {
    println("Enter PIN Code:")
    println("0.Return\n\n")
    pinCode = readln().toInt()

    when(pinCode){
        in 1000..9999->{
            confirmBeforeTransfer(
                enteredAmount,
                receiverName,
                phoneNumber, transferContent, transferFees
            )
        }
        0->{
            enterTransferContent()
        }
        else->{
            println("Wrong format of Pin.Please try\ncheck again!Enter Pin:")
            pinCode()
        }
    }
    return pinCode
}
fun verifyPinCodeAndBalance(){
    if (pinCode == myPinCode){
        if(myBalance >= enteredAmount) {
            // remain balance
            var newBalance = myBalance - enteredAmount - transferFees
            println("Your new balance is $newBalance")
        }
        else{
            println("You do not have enough balance")
        }

        println("Money transfer successfully!\n")
    }
    else{
        println("Pin is not correct.Please check again")
    }
}
fun confirmBeforeTransfer(amount:Int, receiverName:String, receiverNumber:Int, contentName:String,fees:Int) {
    println(
        " Confirmation to transfer $amount " +
                "\n to $receiverName, $receiverNumber " +
                "\n for $contentName, fee: $fees FBU"
    )
    println("Pls choose")
    println("1.Yes")
    println("2.No")
    println("0.Cancel\n\n")

    when (readln().toInt()) {
        1 -> {
            verifyPinCodeAndBalance()
        }
        2 -> {
            println("Transaction is ending\n")
        }
        0 -> {
            println("Cancelled\n")
        }
        else -> {
            println("\n")
        }
    }
}

/******************* End of First Operation And Begin Second Operation(CASH OUT) ******************/

fun displayCashOutOperation(){
    println("Pls choose :")
    println("1.From Agent")
    println("2.Approve transaction")
    println("0.Return\n")

    when(readLine().toString()){
        "0"->{
            displayOperationMenu()
        }
        "1"->{
            enterAgentCode()
        }
        "2"->{
            println("Sorry this operation is under maintenance")
            displayCashOutOperation()
        }
        else->{
            println("Selecting the wrong menu")
            displayCashOutOperation()
        }
    }

}
fun enterAgentCode() : Int{
    println("Enter agent :")
    println("0.Return\n\n")
    agentCode =readln().toInt()

    when(agentCode){
        in 100001..999999->{
            enterAmountToCashOut()
        }
        0->{
            displayOperationMenu()
        }
        else->{
            println("Invalid agent code.Please try\nagain!")
            enterAgentCode()
        }
    }
    return agentCode
}
fun enterAmountToCashOut() : Int{
    println("Enter Amount:")
    println("0.Return\n\n")
    cashOutAmount = readln().toInt()

    when(cashOutAmount){
        in 1000..1000000->{
            pinCodeForCashOut()
        }
        0->{
            enterAgentCode()
        }
        else->{
            println("Wrong format of Amount.Please try\n check again!")
            enterAmount()
        }
    }
    return cashOutAmount
}
fun pinCodeForCashOut(): Int{
    println("Enter PIN Code:")
    println("0.Return\n\n")
    pinCodeForCash = readln().toInt()

    when(pinCodeForCash){
        in 1000..9999->{
            confirmBeforeCashOut(cashOutAmount, agentName, agentCode, cashOutFees)
        }
        0->{
            enterAmountToCashOut()
        }
        else->{
            println("Wrong format of Pin.Please try\ncheck again!")
            pinCodeForCashOut()
        }
    }
    return pinCode
}
fun confirmBeforeCashOut(amount:Int, name:String, code: Int, fee:Int) {
    println(
        " Confirmation to cash out $amount FBU " +
                "\n to $name- $code, fee: $fee FBU"
    )
    println("Pls choose")
    println("1.Yes")
    println("2.No")
    println("0.Cancel\n\n")

    when (readln().toInt()) {
        1 -> {
            println("Cash out successfully!\n")
        }
        2 -> {
            println("Transaction is ending\n")
        }
        0 -> {
            println("Cancelled\n")
        }
        else -> {
            println("\n")
        }
    }
}

/******************* End of Second Operation And Begin third Operation(CASH OUT) ******************/
fun displayAirTimeOperation(){
    println("Pls choose :")
    println("1.My tel number")
    println("2.Other tel number")
    println("0.Return\n")

    when(readLine().toString()){
        "0"->{
            displayOperationMenu()
        }
        "1"->{
            //verify if number exist
            //if ()
        }
        "2"->{
            println("Sorry this operation is under maintenance")
            displayCashOutOperation()
        }
        else->{
            println("Selecting the wrong menu")
            displayAirTimeOperation()
        }
    }

}

fun verifiedOperationMenu(number: String): String{
    when(number){
        "0"->{}
        "1"->{
            // Transfer
            enterPhoneNumber()
        }
        "2"->{
            // Cash out
            displayCashOutOperation()
        }
        "3"->{
            // air time
            displayAirTimeOperation()
        }
        "4"->{
            //
            println("You choose 4")
        }
        "5"->{
            //
            println("You choose 5")
        }
        "6"->{
            //
            println("You choose 6")
        }
        "7"->{
            //
            println("You choose 7")
        }
        "8"->{
            //
            println("You choose 8")
        }
        "9"->{
            //
            println("You choose 9")
        }
        "10"->{
            //
            println("You choose 10")
        }
        else->{
            println("Selecting the wrong menu")
            displayOperationMenu()
        }
    }
    return number
}