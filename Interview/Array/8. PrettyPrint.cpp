/*

Print concentric rectangular pattern in a 2d matrix.
Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.
Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
Example 2:

Input: A = 3.
Output:

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 
The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.

You will be given A as an argument to the function you need to implement, and you need to return a 2D array.

*/


vector<vector<int> > Solution::prettyPrint(int A) {
    int n = 2*A - 1;
    int limit = n;
    int temp = 0;
    
    vector<vector<int>> ans(n, vector<int> (n));
    
    while(A>0){
        for(int i = temp; i<limit; i++){
            for(int j=temp;j<limit;j++){
                ans[i][j] = A;
            }
        }
        
        A--;
        limit--;
        temp++;
    }
    
    return ans;
}
