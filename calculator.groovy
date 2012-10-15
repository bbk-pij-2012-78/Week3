int num1 = 1;
int num2 = 2;
intFunction = 0

print('Enter the first number: ')
num1 = Integer.parseInt(System.console().readLine())

print('Enter the second number: ')
num2 = Integer.parseInt(System.console().readLine())

println('1. Add')
println('2. Subtract')
println('3. Multiply')
println('4. Divide')
print('Choose the calculation:')
intFunction = Integer.parseInt(System.console().readLine())

switch (intFunction) {
	case 1:
		println(num1 + num2);
		break;
	case 2:
		println(num1 - num2);
		break;
	case 3:
		println(num1 * num2);
		break;
	case 4:
		println(num1 / num2);
}