package chap06.sec02.test02;

public class MemberExample {
    public static void main(String[] args){
        Member member = new Member();

        /* 
        System.out.println("name:" + member.name);
        System.out.println("id:" + member.id);
        System.out.println("password:" + member.password);
        System.out.println("age:" + member.age);
        */

        member.name = '홍';
        member.id = 'a';
        member.password = '1';
    }

}
