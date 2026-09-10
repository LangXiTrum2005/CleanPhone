package com.bytedance.sdk.component.adexpress.dynamic.mml;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class tvp {
    public float qdl;
    public float ud;

    public tvp(float f, float f2) {
        this.qdl = f;
        this.ud = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tvp tvpVar = (tvp) obj;
            if (Float.compare(tvpVar.qdl, this.qdl) == 0 && Float.compare(tvpVar.ud, this.ud) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.qdl), Float.valueOf(this.ud)});
    }
}
