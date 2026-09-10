package com.bytedance.adsdk.lr;

import android.content.Context;
import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class fi {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private static volatile com.bytedance.adsdk.lr.ka.xha f17988co = null;
    private static long[] di = null;
    private static String[] fi = null;
    private static boolean ik = true;
    private static com.bytedance.adsdk.lr.ka.di jbs = null;
    private static boolean ka = true;
    private static boolean lr = false;
    private static int mj = 0;
    private static com.bytedance.adsdk.lr.ka.fi qt = null;
    public static boolean ri = false;
    private static volatile com.bytedance.adsdk.lr.ka.mj sf;
    private static int xha;

    public static float lr(String str) {
        int i = mj;
        if (i > 0) {
            mj = i - 1;
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (!lr) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i2 = xha - 1;
        xha = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(fi[i2])) {
            Trace.endSection();
            return (System.nanoTime() - di[xha]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + fi[xha] + ".");
    }

    public static void ri(String str) {
        if (lr) {
            int i = xha;
            if (i == 20) {
                mj++;
                return;
            }
            fi[i] = str;
            di[i] = System.nanoTime();
            Trace.beginSection(str);
            xha++;
        }
    }

    public static com.bytedance.adsdk.lr.ka.mj ri(Context context) {
        com.bytedance.adsdk.lr.ka.mj mjVar;
        com.bytedance.adsdk.lr.ka.mj mjVar2 = sf;
        if (mjVar2 != null) {
            return mjVar2;
        }
        synchronized (com.bytedance.adsdk.lr.ka.mj.class) {
            try {
                mjVar = sf;
                if (mjVar == null) {
                    com.bytedance.adsdk.lr.ka.xha xhaVarLr = lr(context);
                    com.bytedance.adsdk.lr.ka.di lrVar = jbs;
                    if (lrVar == null) {
                        lrVar = new com.bytedance.adsdk.lr.ka.lr();
                    }
                    mjVar = new com.bytedance.adsdk.lr.ka.mj(xhaVarLr, lrVar);
                    sf = mjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mjVar;
    }

    public static com.bytedance.adsdk.lr.ka.xha lr(Context context) {
        com.bytedance.adsdk.lr.ka.xha xhaVar;
        if (!ik) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.lr.ka.xha xhaVar2 = f17988co;
        if (xhaVar2 != null) {
            return xhaVar2;
        }
        synchronized (com.bytedance.adsdk.lr.ka.xha.class) {
            try {
                xhaVar = f17988co;
                if (xhaVar == null) {
                    com.bytedance.adsdk.lr.ka.fi fiVar = qt;
                    if (fiVar == null) {
                        fiVar = new com.bytedance.adsdk.lr.ka.fi() { // from class: com.bytedance.adsdk.lr.fi.1
                            @Override // com.bytedance.adsdk.lr.ka.fi
                            public File ri() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    xhaVar = new com.bytedance.adsdk.lr.ka.xha(fiVar);
                    f17988co = xhaVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xhaVar;
    }

    public static boolean ri() {
        return ka;
    }
}
