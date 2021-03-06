/*

A hotel manager has to process N advance bookings of rooms for the next season. His hotel has K rooms. Bookings contain an arrival date and a departure date. He wants to find out whether there are enough rooms in the hotel to satisfy the demand. Write a program that solves this problem in time O(N log N) .

Input:


First list for arrival time of booking.
Second list for departure time of booking.
Third is K which denotes count of rooms.

Output:

A boolean which tells whether its possible to make a booking. 
Return 0/1 for C programs.
O -> No there are not enough rooms for N booking.
1 -> Yes there are enough rooms for N booking.
Example :

Input : 
        Arrivals :   [1 3 5]
        Departures : [2 6 8]
        K : 1

Return : False / 0 

At day = 5, there are 2 guests in the hotel. But I have only one room. 

*/


public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
       
        if(arrive == null || depart == null)
            return false;
        Collections.sort(arrive);
        Collections.sort(depart);
        for(int i = 0 ; i < arrive.size() ; i++ )
        {
            if(arrive.get(i) >= depart.get(0))
                depart.remove(0);
        }
        return depart.size()<=K ? true : false ;
    }
}

/*

// CPP

bool Solution::hotel(vector<int> &arrive, vector<int> &depart, int K) {
    vector<pair<int,int>> v;
    int size = arrive.size();
    for(int i = 0; i<size; i++) {
        v.push_back(make_pair(arrive[i], 1));
        v.push_back(make_pair(depart[i], -1));
    }
    sort(v.begin(), v.end());
    int cnt = 0;
    for(int i=0;i<2*size;i++) {
        cnt += v[i].second;
        if(cnt>K)
            return false;
    }
    return true;
}

*/
