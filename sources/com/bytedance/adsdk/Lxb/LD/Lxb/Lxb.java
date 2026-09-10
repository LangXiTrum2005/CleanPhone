package com.bytedance.adsdk.Lxb.LD.Lxb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Lxb {
    private Object[] LD;
    private String Lxb;

    public Object[] LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.Lxb + "', args=" + Arrays.toString(this.LD) + '}';
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void Lxb(Object[] objArr) {
        this.LD = objArr;
    }
}
