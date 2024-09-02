import re
def checkValid(email):
    email_pattern="^[a-zA-Z0-9_+-.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$"
    if(re.match(email_pattern,email)):
        print("valid")
    else:
        print("invalid")
email=input("enter email address:")
checkValid(email)