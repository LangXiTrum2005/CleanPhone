package com.bytedance.sdk.component.adexpress.dynamic.ka;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    public float lr;
    public float ri;

    public jbs(float f, float f2) {
        this.ri = f;
        this.lr = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jbs jbsVar = (jbs) obj;
            if (Float.compare(jbsVar.ri, this.ri) == 0 && Float.compare(jbsVar.lr, this.lr) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.ri), Float.valueOf(this.lr)});
    }
}
