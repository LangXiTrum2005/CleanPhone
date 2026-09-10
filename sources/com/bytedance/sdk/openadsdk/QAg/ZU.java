package com.bytedance.sdk.openadsdk.QAg;

import android.content.Context;
import com.bytedance.sdk.component.JXs.IeN;
import com.bytedance.sdk.component.JXs.Sfi;
import com.bytedance.sdk.component.JXs.nBu;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import com.bytedance.sdk.component.LD.Lxb.lc;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.xan;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {

    public static final class Lxb {
        private static final IeN Lxb = Lxb(kqm.Lxb());

        /* JADX INFO: Access modifiers changed from: private */
        public static nBu LD(String str) {
            return Lxb(Lxb.Lxb(str).JXs(le.ZU(kqm.Lxb())).ZU(le.lk(kqm.Lxb())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static nBu LD(com.bytedance.sdk.openadsdk.core.model.IeN ieN) {
            return Lxb(Lxb.Lxb(ieN.Lxb()).Lxb(ieN.LD()).LD(ieN.lk()).JXs(le.ZU(kqm.Lxb())).ZU(le.lk(kqm.Lxb())).Lxb(ieN.ebl()));
        }

        private static IeN Lxb(Context context) {
            return com.bytedance.sdk.component.JXs.lk.LD.Lxb(context, new com.bytedance.sdk.component.JXs.lk.JXs.Lxb().Lxb(new com.bytedance.sdk.component.JXs.lk.Lxb.Lxb(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir()))).Lxb(new Sfi() { // from class: com.bytedance.sdk.openadsdk.QAg.ZU.Lxb.2
                @Override // com.bytedance.sdk.component.JXs.Sfi
                public ExecutorService Lxb() {
                    return hg.LD();
                }
            }).Lxb(new com.bytedance.sdk.component.JXs.ZU() { // from class: com.bytedance.sdk.openadsdk.QAg.ZU.Lxb.1
                @Override // com.bytedance.sdk.component.JXs.ZU
                /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
                public com.bytedance.sdk.component.JXs.LD.ZU Lxb(com.bytedance.sdk.component.JXs.JXs jXs) {
                    JVA jvaJXs = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().JXs();
                    NXR nxrLD = new NXR.Lxb().LD(jXs.Lxb()).Lxb().LD();
                    com.bytedance.sdk.component.LD.Lxb.IeN ieNLD = null;
                    com.bytedance.sdk.component.JXs.LD.JXs jXs2 = jXs.lk() ? new com.bytedance.sdk.component.JXs.LD.JXs() : null;
                    if (jXs2 != null) {
                        jXs2.Lxb(System.currentTimeMillis());
                    }
                    try {
                        ieNLD = jvaJXs.Lxb(nxrLD).LD();
                        if (jXs2 != null) {
                            jXs2.LD(System.currentTimeMillis());
                        }
                        Map<String, String> mapLxb = Lxb(jXs, ieNLD);
                        byte[] bArrZU = ieNLD.lc().ZU();
                        if (jXs2 != null) {
                            jXs2.lk(System.currentTimeMillis());
                        }
                        com.bytedance.sdk.component.JXs.LD.ZU zu = new com.bytedance.sdk.component.JXs.LD.ZU(ieNLD.lk(), bArrZU, "", mapLxb);
                        zu.Lxb(jXs2);
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(ieNLD);
                        return zu;
                    } catch (Throwable th) {
                        try {
                            return Lxb(jXs2, th);
                        } finally {
                            com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(ieNLD);
                        }
                    }
                }

                private Map<String, String> Lxb(com.bytedance.sdk.component.JXs.JXs jXs, com.bytedance.sdk.component.LD.Lxb.IeN ieN) {
                    if (!jXs.LD()) {
                        return null;
                    }
                    lc lcVarEbl = ieN.ebl();
                    HashMap map = new HashMap();
                    int iLxb = lcVarEbl.Lxb();
                    for (int i = 0; i < iLxb; i++) {
                        String strLxb = lcVarEbl.Lxb(i);
                        String strLD = lcVarEbl.LD(i);
                        if (strLxb != null) {
                            map.put(strLxb, strLD);
                        }
                    }
                    return map;
                }

                private com.bytedance.sdk.component.JXs.LD.ZU Lxb(com.bytedance.sdk.component.JXs.LD.JXs jXs, Throwable th) {
                    th.getMessage();
                    if (jXs != null) {
                        jXs.lk(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.JXs.LD.ZU zu = new com.bytedance.sdk.component.JXs.LD.ZU(98765, th, "net failed");
                    zu.Lxb(jXs);
                    return zu;
                }
            }).Lxb());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream LD(String str, String str2) {
            return Lxb.Lxb(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean LD(String str, String str2, String str3) {
            return Lxb.Lxb(str, str2, str3);
        }

        private static nBu Lxb(nBu nbu) {
            return xan.Lxb() ? nbu.Lxb(new JXs()) : nbu;
        }
    }

    public static nBu Lxb(String str) {
        return Lxb.LD(str);
    }

    public static nBu Lxb(com.bytedance.sdk.openadsdk.core.model.IeN ieN) {
        return Lxb.LD(ieN);
    }

    public static InputStream Lxb(String str, String str2) {
        return Lxb.LD(str, str2);
    }

    public static boolean Lxb(String str, String str2, String str3) {
        return Lxb.LD(str, str2, str3);
    }

    public static IeN Lxb() {
        return Lxb.Lxb;
    }
}
