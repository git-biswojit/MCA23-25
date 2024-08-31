# -*- coding: utf-8 -*-
"""
Created on Thu Dec 30 13:14:24 2021

@author: jaypa
"""
import numpy as np



# lst=[1,2,3,4,5,6,7,8, 9]
# matrix = np.array(lst).reshape(3, 3)
# print(matrix)


# r = int(input("Enter the number of rows:"))
# c = int(input("Enter the number of columns:"))

# print("Enter the entries in a single line (separated by space): ")

# entries1 = list(map(round, input("Enter elements:").split(",")))
# matrix1 = np.array(entries1).reshape(r, c)
# print(matrix1)

# entries2 = list(map(int, input("Enter elements:").split(",")))
# matrix2 = np.array(entries2).reshape(r, c)
# print(matrix2)

# result1=np.zeros([2, 2], dtype=int)
# print(result1)

tmatrix=np.empty([2, 2], dtype=int)
print(tmatrix)
# for i in range(0,2):
#     for j in range(0,2):
#         tmatrix[i][j]=matrix1[j][i]
        
# print(tmatrix)
        
    
# dsum=0
# for i in range(0,2):
#     dsum+=matrix1[i][i]

# print("Sum of Diagonal Elements:",dsum)
# print(result1)
        
 
# result=np.empty([2, 2], dtype=int)
# # Product
# for i in range(0,2):  
 
#     for j in range(0,2):
 
#         for k in range(0,2): 
#             result[i][j] += matrix1[i][k] * matrix2[[k]j]
 
# for r in result:
#     print(r)