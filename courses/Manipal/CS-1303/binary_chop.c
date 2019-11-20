#include <stdio.h>

int iter_binary_chop(int arr[], int size, int ser) {
  int left = 0;
  while (left <= size) {
    int mid = left + (size - 1) / 2;
    if (arr[mid] == ser) {
      return mid;
    }
    if (arr[mid] < ser) { 
      left = mid + 1;
    }
    else {
      size = mid - 1;
   }
  }
  return -1;
}

int recur_binary_chop(int arr[], int left, int size, int ser) {
  if (size >= left) {
    int mid = (left + size) / 2;
    if (arr[mid] == ser) {
      return mid;
    }
    if (arr[mid] > ser) { 
      return recur_binary_chop(arr, mid - 1, size, ser);
    }
    else {
      return recur_binary_chop(arr, mid + 1, size, ser);
    }
  }
  return -1;
}

int display(int result, int ser) {
  if (result == -1) {
    printf("Element not found.\n");
  }
  else {
    printf("%d was found at index : %d\n", ser, result);
  }
}

/*
Generalizing : sizeof(arr[0]); (this will take the size of first element)
This will again fail if the array is of mixed type. (edge case)
*/

void main() {
  int arr[] = {2,3,5,10,40};
  int ser = 40;
  int size = sizeof(arr) / sizeof(int);
  printf("Using iterative binary searching ...\n");
  int iresult = iter_binary_chop(arr, size, ser);
  display(iresult, ser);
  printf("Using recursive binary searching ...\n");
  int rresult = recur_binary_chop(arr, 0, size, ser);
  display(rresult, ser);
}
