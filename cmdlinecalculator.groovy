String strOperation = '';
int num1 = 0;
int num2 = 0;

print('Enter the operation: ')
strOperation = System.console().readLine();

if (strOperation.contains('+')) {
    println('Adding');
    num1 = Integer.parseInt(strOperation.substring(0, strOperation.indexOf('+')))
    num2 = Integer.parseInt(strOperation.substring(strOperation.indexOf('+') + 1, strOperation.length()))
    println(num1 + num2);
}
else if (strOperation.contains('-')) {
    println('Subtracting');
    num1 = Integer.parseInt(strOperation.substring(0, strOperation.indexOf('-')))
    num2 = Integer.parseInt(strOperation.substring(strOperation.indexOf('-') + 1, strOperation.length()))
    println(num1 - num2);    
}
else if (strOperation.contains('*')) {
    println('Multiplying');
    num1 = Integer.parseInt(strOperation.substring(0, strOperation.indexOf('*')))
    num2 = Integer.parseInt(strOperation.substring(strOperation.indexOf('*') + 1, strOperation.length()))
    println(num1 * num2);    
}
else if (strOperation.contains('/')) {
    println('Dividing');
    num1 = Integer.parseInt(strOperation.substring(0, strOperation.indexOf('/')))
    num2 = Integer.parseInt(strOperation.substring(strOperation.indexOf('/') + 1, strOperation.length()))
    println(num1 / num2);    
}