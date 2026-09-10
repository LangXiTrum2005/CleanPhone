package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public class fs extends YogaNodeJNIBase {
    public void exu() {
        long j = this.qdl;
        if (j != 0) {
            this.qdl = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }

    public void finalize() throws Throwable {
        try {
            exu();
        } finally {
            super.finalize();
        }
    }
}
