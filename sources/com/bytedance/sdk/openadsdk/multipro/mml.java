package com.bytedance.sdk.openadsdk.multipro;

import android.support.v4.media.a;
import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    public static String qdl = "com.bytedance.openadsdk";
    public static String ud = a.r(new StringBuilder("content://"), qdl, ".TTMultiProvider");

    static {
        qdl();
    }

    public static void qdl() {
        if (yt.qdl() != null) {
            qdl = yt.qdl().getPackageName();
            ud = a.r(new StringBuilder("content://"), qdl, ".TTMultiProvider");
        }
    }
}
