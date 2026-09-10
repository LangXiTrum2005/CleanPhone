package com.bytedance.adsdk.LD;

import android.content.Context;
import android.os.Trace;
import com.bytedance.component.sdk.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class JXs {
    private static volatile com.bytedance.adsdk.LD.ZU.OY JVA = null;
    private static String[] JXs = null;
    private static boolean LD = false;
    public static boolean Lxb = false;
    private static int OY = 0;
    private static com.bytedance.adsdk.LD.ZU.lc QAg = null;
    private static boolean ZU = true;
    private static int ebl = 0;
    private static long[] lc = null;
    private static boolean lk = true;
    private static com.bytedance.adsdk.LD.ZU.JXs nBu;
    private static volatile com.bytedance.adsdk.LD.ZU.ebl sLN;

    public static float LD(String str) {
        int i = OY;
        if (i > 0) {
            OY = i - 1;
            return 0.0f;
        }
        if (!LD) {
            return 0.0f;
        }
        int i2 = ebl - 1;
        ebl = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(JXs[i2])) {
            throw new IllegalStateException(DM.m(AbstractC3950lJ.u("Unbalanced trace call ", str, ". Expected "), JXs[ebl], "."));
        }
        Trace.endSection();
        return (System.nanoTime() - lc[ebl]) / 1000000.0f;
    }

    public static void Lxb(String str) {
        if (LD) {
            int i = ebl;
            if (i == 20) {
                OY++;
                return;
            }
            JXs[i] = str;
            lc[i] = System.nanoTime();
            Trace.beginSection(str);
            ebl++;
        }
    }

    public static com.bytedance.adsdk.LD.ZU.OY Lxb(Context context) {
        com.bytedance.adsdk.LD.ZU.OY oy;
        com.bytedance.adsdk.LD.ZU.OY oy2 = JVA;
        if (oy2 != null) {
            return oy2;
        }
        synchronized (com.bytedance.adsdk.LD.ZU.OY.class) {
            try {
                oy = JVA;
                if (oy == null) {
                    com.bytedance.adsdk.LD.ZU.ebl eblVarLD = LD(context);
                    com.bytedance.adsdk.LD.ZU.lc ld = QAg;
                    if (ld == null) {
                        ld = new com.bytedance.adsdk.LD.ZU.LD();
                    }
                    oy = new com.bytedance.adsdk.LD.ZU.OY(eblVarLD, ld);
                    JVA = oy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oy;
    }

    public static boolean Lxb() {
        return ZU;
    }

    public static com.bytedance.adsdk.LD.ZU.ebl LD(Context context) {
        com.bytedance.adsdk.LD.ZU.ebl eblVar;
        if (!lk) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.LD.ZU.ebl eblVar2 = sLN;
        if (eblVar2 != null) {
            return eblVar2;
        }
        synchronized (com.bytedance.adsdk.LD.ZU.ebl.class) {
            try {
                eblVar = sLN;
                if (eblVar == null) {
                    com.bytedance.adsdk.LD.ZU.JXs jXs = nBu;
                    if (jXs == null) {
                        jXs = new com.bytedance.adsdk.LD.ZU.JXs() { // from class: com.bytedance.adsdk.LD.JXs.1
                            @Override // com.bytedance.adsdk.LD.ZU.JXs
                            public File Lxb() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    eblVar = new com.bytedance.adsdk.LD.ZU.ebl(jXs);
                    sLN = eblVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eblVar;
    }
}
