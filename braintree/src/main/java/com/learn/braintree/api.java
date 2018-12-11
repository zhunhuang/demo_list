package com.learn.braintree;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.ClientTokenRequest;
import com.braintreegateway.Environment;

public class api {
    private static BraintreeGateway gateway = new BraintreeGateway(
            Environment.SANDBOX,
            "9krkbcrtgy7tbpdh",
            "nkrbc3k2fh52fvpz",
            "64c112a8e4345e7b8f3ad82117e23a14");

    public static void main(String[] args) {
        generateClientToken();

    }



    public static String generateClientToken() {
        String aCustomerId = "15150503373";
        String generate = gateway.clientToken().generate();
        System.out.println(generate);
        return generate;
    }

}
