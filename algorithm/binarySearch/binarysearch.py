# -*- coding:utf-8 -*-
#! /usr/bin/python3

##################################################
# date: 2019/07/03
# author: liu hakuan
# description: binary search
##################################################


def binary_search(alist, key):
    """
    在alist中查找key所在位置，如果没有找到，返回-1
    """
    length = len(alist)

    low = 0
    high = length - 1
    while low <= high:
        mid = low + (high - low) // 2
        if key == alist[mid]:
            return mid
        elif key < alist[mid]:
            high = mid - 1
        else:
            low = mid + 1

    return -1

if __name__ == '__main__':
    alist = [int(i) for i in input("请输入数组：").split()]
    key = int(input("请输入要查找的数："))
    index = binary_search(alist, key)
    if index == -1:
        print("没有找到")
    else:
        print('所在位置: {}'.format(index))

