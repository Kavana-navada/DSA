import re

# myString="Hello kavana navada. How are you?are  you ok?"
# ans=re.findall("are",myString)
# print(ans)

myString="Hello kavana navada. How are you?are  you ok?"
ans=re.search(r"kavana|navada.",myString)
print(ans.group())

# myString="Hello kavana navada. How are you?are  you ok?"
# ans=re.split("are",myString,1)
# print(ans)

# ans=re.sub("are","ARE",myString,1)
# print(ans)

# ans=re.match()
