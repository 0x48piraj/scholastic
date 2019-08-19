#include <stdio.h>

int swap(int *s1, int *s2) {
  int temp = *s1;
  *s1 = *s2;
  *s2 = temp;
}

int bubble_sort(int arr[], int size) {
  int i, j;
  for (i = 0; i < size-1;i++) {
    for(j = 0; j < size-i-1; j++) {
     if (arr[j] > arr[j+1]) {
       swap(&arr[j], &arr[j+1]);
     }
    }
  }
}

/* Function to print an array */
void printArray(int arr[], int size) 
{ 
    int i; 
    for (i=0; i < size; i++) 
        printf("%d ", arr[i]); 
    printf("\n"); 
} 

void main() {
  int arr[] = {1,4,3,5,7,19,10};
  int size = sizeof(arr) / sizeof(int);
  bubble_sort(arr, size);
  printf("The largest element is : %d\n", arr[size-1]);
  printf("The second largest element is : %d\n", arr[size-2]);
  printf("Sorted Array : \n");
  printArray(arr, size);
}
