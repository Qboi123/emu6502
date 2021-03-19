package com.batswen.emu6502;

public class Rom {
    private final byte[] bytecode;

    public static Rom empty() {
        return new Rom(new byte[0xffff]);
    }

    private Rom(byte[] bytecode) {
        this.bytecode = bytecode;
    }

    public void set(int index, byte val) {
        bytecode[index] = val;
    }

    public byte get(int index) {
        return bytecode[index];
    }

    public byte[] getBytecode() {
        return bytecode;
    }
}
