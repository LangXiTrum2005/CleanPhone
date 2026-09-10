package com.bykv.vk.openvk.qdl.qdl.qdl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ud.qdl.rq;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private static String lnr = null;
    private static boolean mml = false;
    private static int mo = 1;
    private static rq mzz = null;
    public static boolean qdl = false;
    private static Context ud;

    public static boolean lnr() {
        return mml;
    }

    public static rq mml() {
        if (mzz == null) {
            rq.qdl qdlVar = new rq.qdl("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            mzz = qdlVar.qdl(10000L, timeUnit).ud(10000L, timeUnit).lnr(10000L, timeUnit).qdl();
        }
        return mzz;
    }

    public static int mo() {
        return mo;
    }

    public static boolean mzz() {
        return qdl;
    }

    public static Context qdl() {
        return ud;
    }

    public static String ud() {
        if (TextUtils.isEmpty(lnr)) {
            try {
                File file = new File(qdl().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                lnr = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return lnr;
    }

    public static void qdl(Context context, String str) {
        ud = context;
        lnr = str;
    }

    public static void qdl(boolean z2) {
        mml = z2;
    }

    public static void qdl(rq rqVar) {
        mzz = rqVar;
    }

    public static void qdl(int i2) {
        mo = i2;
    }
}
