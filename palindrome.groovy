int i1 = 0;
int i2 = 0;
String sWord = 'madama'
boolean bValid = true;

i2 = sWord.length() - 1;

while (i1 < i2) {
    println('i1 ' + i1);
    println('i2 ' + i2);

    if (sWord.charAt(i1) != sWord.charAt(i2)) {
        bValid = false;
    }
    i1++;
    i2 = i2 - 1;
}

if (bValid == true) {
    println('Word is a Palindrome')
}
else {
    println('Word is NOT a Palindrome')
}