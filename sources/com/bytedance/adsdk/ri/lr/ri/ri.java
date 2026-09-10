package com.bytedance.adsdk.ri.lr.ri;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private Object[] lr;
    private String ri;

    public Object[] lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.ri + "', args=" + Arrays.toString(this.lr) + '}';
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void ri(Object[] objArr) {
        this.lr = objArr;
    }
}
