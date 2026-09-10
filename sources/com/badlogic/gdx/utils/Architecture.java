package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public enum Architecture {
    x86,
    ARM,
    RISCV,
    LOONGARCH;

    public enum Bitness {
        _32,
        _64,
        _128;

        public String toSuffix() {
            return this == _32 ? "" : name().substring(1);
        }
    }

    public String toSuffix() {
        return this == x86 ? "" : name().toLowerCase();
    }
}
