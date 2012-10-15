String sInput = 'how many letters in this sentence';
String sToFind = 'e'
int counter = 0;
int x = 0;

while (x < sInput.length()) {
    if (sInput.charAt(x) == sToFind) {
        counter ++;
    }
    x++;
}

println(counter);