package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public class STP extends YogaNodeJNIBase {
    public void finalize() throws Throwable {
        try {
            sLN();
        } finally {
            super.finalize();
        }
    }

    public void sLN() {
        long j = this.Lxb;
        if (j != 0) {
            this.Lxb = 0L;
            YogaNative.jni_YGNodeDeallocateJNI(j);
        }
    }
}
