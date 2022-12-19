package com.company;

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class side_area_volume_with_oops {
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 22;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
