#include<iostream>
using namespace std;

void BoardPathCon(int target, string ans, int cs, int &count){ // cs = surrent sum
    if(cs == target){
        cout<<ans<<endl;
        count++;
        return;
    }
    if(cs>target){
        return;
    }

    for(int i=1;i<=3;i++){
        BoardPathCon(target, ans + to_string(i), cs + i, count);

    }

}