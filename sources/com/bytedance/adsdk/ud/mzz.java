package com.bytedance.adsdk.ud;

import android.content.Context;
import android.os.Trace;
import android.support.v4.media.a;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    private static volatile com.bytedance.adsdk.ud.mml.wd fs = null;
    private static int jpc = 0;
    private static boolean lnr = true;
    private static boolean mml = true;
    private static long[] mo = null;
    private static String[] mzz = null;
    public static boolean qdl = false;
    private static volatile com.bytedance.adsdk.ud.mml.jpc rq = null;
    private static com.bytedance.adsdk.ud.mml.mzz to = null;
    private static com.bytedance.adsdk.ud.mml.mo tvp = null;
    private static boolean ud = false;
    private static int wd;

    public static void qdl(String str) {
        if (ud) {
            int i2 = wd;
            if (i2 == 20) {
                jpc++;
                return;
            }
            mzz[i2] = str;
            mo[i2] = System.nanoTime();
            Trace.beginSection(str);
            wd++;
        }
    }

    public static float ud(String str) {
        int i2 = jpc;
        if (i2 > 0) {
            jpc = i2 - 1;
            return 0.0f;
        }
        if (!ud) {
            return 0.0f;
        }
        int i3 = wd - 1;
        wd = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(mzz[i3])) {
            throw new IllegalStateException(a.r(a.y("Unbalanced trace call ", str, ". Expected "), mzz[wd], com.thinkup.core.common.n.mo.ono));
        }
        Trace.endSection();
        return (System.nanoTime() - mo[wd]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.ud.mml.jpc qdl(Context context) {
        com.bytedance.adsdk.ud.mml.jpc jpcVar;
        com.bytedance.adsdk.ud.mml.jpc jpcVar2 = rq;
        if (jpcVar2 != null) {
            return jpcVar2;
        }
        synchronized (com.bytedance.adsdk.ud.mml.jpc.class) {
            try {
                jpcVar = rq;
                if (jpcVar == null) {
                    com.bytedance.adsdk.ud.mml.wd wdVarUd = ud(context);
                    com.bytedance.adsdk.ud.mml.mo udVar = tvp;
                    if (udVar == null) {
                        udVar = new com.bytedance.adsdk.ud.mml.ud();
                    }
                    jpcVar = new com.bytedance.adsdk.ud.mml.jpc(wdVarUd, udVar);
                    rq = jpcVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jpcVar;
    }

    public static boolean qdl() {
        return mml;
    }

    public static com.bytedance.adsdk.ud.mml.wd ud(Context context) {
        com.bytedance.adsdk.ud.mml.wd wdVar;
        if (!lnr) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.ud.mml.wd wdVar2 = fs;
        if (wdVar2 != null) {
            return wdVar2;
        }
        synchronized (com.bytedance.adsdk.ud.mml.wd.class) {
            try {
                wdVar = fs;
                if (wdVar == null) {
                    com.bytedance.adsdk.ud.mml.mzz mzzVar = to;
                    if (mzzVar == null) {
                        mzzVar = new com.bytedance.adsdk.ud.mml.mzz() { // from class: com.bytedance.adsdk.ud.mzz.1
                            @Override // com.bytedance.adsdk.ud.mml.mzz
                            public File qdl() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    wdVar = new com.bytedance.adsdk.ud.mml.wd(mzzVar);
                    fs = wdVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wdVar;
    }
}
