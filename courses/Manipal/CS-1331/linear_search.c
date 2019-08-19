#include <stdio.h>

int linear_search(int arr[], int size, int ser) {
  for (int i = 0; i < size; i++) { // for only int array type
    if (arr[i] == ser) {
      return i;
    }
  }
  return -1;
}

/*
Generalizing : sizeof(arr[0]); (this will take the size of first element)
This will again fail if the array is of mixed type. (edge case)
*/

void main() {
  // scanf() for user input
  int arr[] = {2,3,5,10,40};
  int ser = 10;
  int size = sizeof(arr) / sizeof(int);
  int result = linear_search(arr, size, ser);
  if (result == -1) {
    printf("Element not found.\n");
  }
  else {
    printf("%d was found at index : %d\n", ser, result);
  }
}
