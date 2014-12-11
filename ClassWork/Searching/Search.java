import java.util.*;
import java.io.*;

//send in string with name
//easier to write
Search(ArrayList<Character> A, String name)

//send in instance of a class with a name set
//uses compareTo
Character c = new Character("fred");
Search(ArrayList<Character> A, c)

/*
Loop through array until we find the element or until we run out of space
Run Time- n

If the list is sorted, start in the middle of the list, so you can get rid of 
the upper half or the lower half as an option:
BINARY SEARCH
mid = length/2
a[mid] is where we start
if (a[mid] == what we want) we're done;
if (what we want < a[mid])
   h = mid - 1;
else 
   l = mid + ;


lsearch: linear search; just go through the list to find the element
bsearch: binary search
rbsearch: recursive binary search
*/
