//string compression problem...

package com.company;

import java.util.HashSet;
import java.util.Set;

public class string_compression {
    static int compress(char[] chars){
        int count=0;

        Set<Character> s=new HashSet<>();
        for(int i=0;i<chars.length;i++){
            s.add(chars[i]);
        }

        StringBuilder str=new StringBuilder();
        for (int i=0;i< chars.length;i++){
            for (int j=i+1;j< chars.length;j++){
                if(chars[i]==chars[j]){
                    count++;
                }
            }
        }
        str.append(count);
        int res=str.length()+s.size()+1;
        return res;
    }
    public static void main(String[] args) {
        string_compression ob=new string_compression();

        char[] ch={'a'};
        System.out.println(compress(ch));
    }
}