double dCost = 0;
double dPaid = 0;
double dChange = 0;




print('Enter the cost: ')
dCost = Double.parseDouble(System.console().readLine());

print('Enter the amount paid: ')
dPaid = Double.parseDouble(System.console().readLine());

println(dCost);
println(dPaid);

dChange = dPaid - dCost;

println('Change: ' + dChange)

    //println(dChange.mod(50));
    //println((dChange / 50).round(0));


if (dChange >= 50) {
    println('50 x ' + (dChange / 50).round(0));
    dChange = dChange - (50 * (dChange / 50).round(0)).round(2);
}

//println(dChange);

if (dChange >= 20) {
    println('20 x ' + (dChange / 20).round(0));
    dChange = dChange - (20 * (dChange / 20).round(0)).round(2);
}

//println(dChange);

if (dChange >= 10) {
    println('10 x ' + (dChange / 10).round(0));
    dChange = dChange - (10 * (dChange / 10).round(0)).round(2);
}

//println(dChange);

if (dChange >= 5) {
    println('5 x ' + (dChange / 5).round(0));
    dChange = dChange - (5 * (dChange / 5).round(0)).round(2);
}

//println(dChange);

if (dChange >= 2) {
    println('2 x ' + (dChange / 2).round(0));
    dChange = dChange - (2 * (dChange / 2).round(0)).round(2);
}

//println(dChange);

if (dChange >= 1) {
    println('1 x ' + (dChange / 1).round(0));
    dChange = dChange - (1 * (dChange / 1).round(0)).round(2);
}

println(dChange);

if (dChange >= 0.5) {
    println('50p x ' + (dChange / 0.5).round(0));
    dChange = dChange - (0.5 * (dChange / 0.5).round(0)).round(2);
}

println(dChange);

if (dChange >= 0.2) {
    println('20p x ' + (dChange / 0.2).round(0));
    dChange = dChange - (0.2 * (dChange / 0.2).round(0)).round(2);
}

println(dChange);

if (dChange >= 0.1) {
    println('10p x ' + (dChange / 0.1).round(0));
    dChange = dChange - (0.1 * (dChange / 0.1).round(0)).round(2);
}

println(dChange);

if (dChange >= 0.05) {
    println('5p x ' + (dChange / 0.05).round(0));
    dChange = dChange - (0.05 * (dChange / 0.05).round(0)).round(2);
}

println(dChange);

if (dChange >= 0.02) {
    println('2p x ' + (dChange / 0.02).round(0));
    dChange = dChange - (0.02 * (dChange / 0.02).round(0)).round(2);
}

println(dChange);

if (dChange >= 0.01) {
    println('1p x ' + (dChange / 0.01).round(0));
    dChange = dChange - (0.01 * (dChange / 0.01).round(0)).round(2);
}

println(dChange);

