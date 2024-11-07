```c
void main()
{
    char ch ;
    printf("Enter a lowercase, upper case letter or a number : ") ;
    scanf("%c" , &ch) ;

    if(ch>='A' && ch<='Z')
        printf("%c is a uppercase letter", ch) ;

    else if(ch>='a' && ch<='z')
        printf("%c is a lowercase letter" , ch) ;

    else if(ch>='0' && ch<='9')
        printf("%c is a number", ch) ;

    else
        printf("Invalid input") ;
}

```
