package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.support.v4.media.a;
import com.bytedance.sdk.component.mo.qdl.jpc;

/* JADX INFO: loaded from: classes.dex */
public class wd {
    public static String qdl = "com.bytedance.openadsdk";
    public static String ud = a.r(new StringBuilder("content://"), qdl, ".TTMultiProvider");

    static {
        qdl();
    }

    public static void qdl() {
        if (jpc.wd().mo() != null) {
            qdl = jpc.wd().mo().getPackageName();
            ud = a.r(new StringBuilder("content://"), qdl, ".TTMultiProvider");
        }
    }
}
