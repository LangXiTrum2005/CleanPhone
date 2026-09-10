package com.bytedance.sdk.openadsdk.qt;

import android.content.Context;
import com.bytedance.sdk.component.fi.ac;
import com.bytedance.sdk.component.fi.ihz;
import com.bytedance.sdk.component.fi.vr;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.di;
import com.bytedance.sdk.component.lr.ri.sf;
import com.bytedance.sdk.component.utils.qt;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.xd;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class ka {

    public static final class ri {
        private static final vr lr = ri(nr.ri());
        private static int ik = 10;
        private static int ka = 15;
        private static int fi = 30;
        public static boolean ri = false;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.qt.ka$ri$ri, reason: collision with other inner class name */
        public static class C0272ri implements com.bytedance.sdk.component.fi.ka {
            private C0272ri() {
            }

            @Override // com.bytedance.sdk.component.fi.ka
            /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.fi.ri.ik ri(com.bytedance.sdk.component.fi.fi fiVar) {
                sf sfVarXha = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().xha();
                co coVarLr = new co.ri().lr(fiVar.ri()).ri().lr();
                bgr bgrVarLr = null;
                com.bytedance.sdk.component.fi.ri.ka kaVar = fiVar.ik() ? new com.bytedance.sdk.component.fi.ri.ka() : null;
                if (kaVar != null) {
                    kaVar.ri(System.currentTimeMillis());
                }
                try {
                    bgrVarLr = sfVarXha.ri(coVarLr).lr();
                    if (kaVar != null) {
                        kaVar.lr(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.fi.ri.ik ikVar = new com.bytedance.sdk.component.fi.ri.ik(bgrVarLr.ik(), bgrVarLr.di().ka(), "", ri(fiVar, bgrVarLr));
                    qt.ri(bgrVarLr);
                    return ikVar;
                } catch (Throwable th) {
                    try {
                        return ri(kaVar, th);
                    } finally {
                        qt.ri(bgrVarLr);
                    }
                }
            }

            private Map<String, String> ri(com.bytedance.sdk.component.fi.fi fiVar, bgr bgrVar) {
                if (!fiVar.lr()) {
                    return null;
                }
                di diVarXha = bgrVar.xha();
                HashMap map = new HashMap();
                int iRi = diVarXha.ri();
                for (int i = 0; i < iRi; i++) {
                    String strRi = diVarXha.ri(i);
                    String strLr = diVarXha.lr(i);
                    if (strRi != null) {
                        map.put(strRi, strLr);
                    }
                }
                return map;
            }

            private com.bytedance.sdk.component.fi.ri.ik ri(com.bytedance.sdk.component.fi.ri.ka kaVar, Throwable th) {
                th.getMessage();
                if (kaVar != null) {
                    kaVar.ik(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.fi.ri.ik ikVar = new com.bytedance.sdk.component.fi.ri.ik(98765, th, "net failed");
                ikVar.ri(kaVar);
                return ikVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.fi.qt lr(String str) {
            return ri(lr.ri(str).fi(qd.fi(nr.ri())).ka(qd.ik(nr.ri())));
        }

        public static void ri() {
            ik = com.bytedance.sdk.openadsdk.wjv.fi.ri("image_config", "bitmap_cache_count", 10);
            ka = com.bytedance.sdk.openadsdk.wjv.fi.ri("image_config", "data_cache_count", 15);
            fi = com.bytedance.sdk.openadsdk.wjv.fi.ri("image_config", "disk_cache_count", 30);
            ri = com.bytedance.sdk.openadsdk.wjv.fi.ri("img_need_scale", 0) == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.fi.qt lr(com.bytedance.sdk.openadsdk.core.model.nr nrVar) {
            return ri(lr.ri(nrVar.ri()).ri(nrVar.lr()).lr(nrVar.ik()).fi(qd.fi(nr.ri())).ka(qd.ik(nr.ri())).ri(nrVar.xha()));
        }

        private static vr ri(Context context) {
            ri();
            return com.bytedance.sdk.component.fi.lr.ik.lr.ri(context, new com.bytedance.sdk.component.fi.lr.ik.fi.ri().ri(new com.bytedance.sdk.component.fi.lr.ik.ri.lr(0, ik, ka, fi, new File(CacheDirFactory.getImageCacheDir("image_p")))).ri(ri).ri(new ac() { // from class: com.bytedance.sdk.openadsdk.qt.ka.ri.2
                @Override // com.bytedance.sdk.component.fi.ac
                public ExecutorService lr() {
                    return dzy.ik();
                }

                @Override // com.bytedance.sdk.component.fi.ac
                public ExecutorService ri() {
                    return dzy.lr();
                }
            }).ri(new ihz() { // from class: com.bytedance.sdk.openadsdk.qt.ka.ri.1
                @Override // com.bytedance.sdk.component.fi.ihz
                public void ri(int i, String str) {
                    com.bytedance.sdk.openadsdk.slm.ka.ri(str, true);
                }
            }).ri(new C0272ri()).ri());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream lr(String str, String str2) {
            return lr.ri(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean lr(String str, String str2, String str3) {
            return lr.ri(str, str2, str3);
        }

        private static com.bytedance.sdk.component.fi.qt ri(com.bytedance.sdk.component.fi.qt qtVar) {
            return xd.ri() ? qtVar.ri(new fi()) : qtVar;
        }
    }

    public static boolean lr() {
        return ri.ri;
    }

    public static com.bytedance.sdk.component.fi.qt ri(String str) {
        return ri.lr(str);
    }

    public static com.bytedance.sdk.component.fi.qt ri(com.bytedance.sdk.openadsdk.core.model.nr nrVar) {
        return ri.lr(nrVar);
    }

    public static InputStream ri(String str, String str2) {
        return ri.lr(str, str2);
    }

    public static boolean ri(String str, String str2, String str3) {
        return ri.lr(str, str2, str3);
    }

    public static vr ri() {
        return ri.lr;
    }
}
