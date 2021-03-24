package com.mungolab.utils;

public class ByteUtils {
    public static byte or(byte left, byte right) {
        return (byte)(left | right);
    }

    public static byte and(byte left, byte right) {
        return (byte)(left & right);
    }

    public static byte shiftLeft(byte data, int shift) {
        return (byte)(data << shift);
    }
}    
