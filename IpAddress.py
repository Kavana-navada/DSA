import re
# def checkIp(ipv4):
#     ip_pattern="^([0-9]{1,3}\.){3}[0-9]{1,3}$"
#     if(re.match(ip_pattern,ipv4)):
#         parts=ipv4.split(".")
#         if(all(0<=int(part)<=255 for part in parts)):
#             print("valid")
#         else:
#             print("invalid")
#     else:
#         print("invalid")
# ipv4=input("ip:")
# checkIp(ipv4)

def checkIp(ipv6):
    ip_pattern="([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4})"
    if(re.match(ip_pattern,ipv6)):
        print("valid")
    else:
        print("invalid")
ipv6=input("enter ip:")
checkIp(ipv6)