package hello.core.order;

import hello.core.member.*;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long meberId = 1L;
        Member member = new Member(meberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(meberId, "itemA", 10000);

        System.out.println("order = " + order);

        System.out.println("order.caculatePrice() = " + order.caculatePrice());
    }
}
