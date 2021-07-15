/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoException;

/**
 *
 * @author kazaf
 */
public class DemoAssert {
    public static void main(String[] args) {
        int n=5;
        assert n>=10&&n<=100: "out of range [10-100].";
        //-ea là gì??? Enable assert
    }
}
