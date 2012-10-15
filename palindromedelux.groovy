String sSentence = 'It was a dark and stormy night'
int x = 0;

while (x < sSentence.length()) {
    print(sSentence.charAt(x));
    x++;
}

x = sSentence.length() - 1;
while (x >= 0) {
    print(sSentence.charAt(x));
    x--;
}