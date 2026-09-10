package com.bytedance.sdk.component.adexpress.dynamic.ZU;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class QAg {
    public float LD;
    public float Lxb;

    public QAg(float f, float f2) {
        this.Lxb = f;
        this.LD = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            QAg qAg = (QAg) obj;
            if (Float.compare(qAg.Lxb, this.Lxb) == 0 && Float.compare(qAg.LD, this.LD) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.Lxb), Float.valueOf(this.LD)});
    }
}
