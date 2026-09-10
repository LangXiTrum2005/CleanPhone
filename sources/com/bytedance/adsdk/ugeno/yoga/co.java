package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes2.dex */
public class co extends YogaNodeJNIBase {
    public void aw() {
        long j = this.ri;
        if (j != 0) {
            this.ri = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }

    public void finalize() throws Throwable {
        try {
            aw();
        } finally {
            super.finalize();
        }
    }
}
