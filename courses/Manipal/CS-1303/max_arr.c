#include <stdio.h>

int* max_search(int arr[], int size, int *ret) {
  int max = 0;
  int i;
  for (i = 0; i < size; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  ret[0] = i-1;
  ret[1] = max;
  return ret;
}

/*
Generalizing : sizeof(arr[0]); (this will take the size of first element)
This will again fail if the array is of mixed type. (edge case)
*/

void main() {
  int arr[] = {2,3,5,10,40};
  int size = sizeof(arr) / sizeof(int);
  int ret[2];
  int* ptr_result = max_search(arr, size, ret);
  printf("Max element found at index[%d] is : %d\n", ptr_result[0], ptr_result[1]);
}
