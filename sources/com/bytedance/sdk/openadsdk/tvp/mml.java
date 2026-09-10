package com.bytedance.sdk.openadsdk.tvp;

import android.content.Context;
import com.bytedance.sdk.component.mzz.aaj;
import com.bytedance.sdk.component.mzz.bjy;
import com.bytedance.sdk.component.mzz.jyq;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.mo;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.utils.to;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.jl;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.hzv;
import com.smartdigimkt.x.d;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class mml {

    public static final class qdl {
        private static final bjy ud = qdl(yt.qdl());
        public static boolean qdl = true;
        private static int lnr = 10;
        private static int mml = 15;
        private static int mzz = 30;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tvp.mml$qdl$qdl, reason: collision with other inner class name */
        public static class C0155qdl implements com.bytedance.sdk.component.mzz.mml {
            private C0155qdl() {
            }

            @Override // com.bytedance.sdk.component.mzz.mml
            /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.mzz.ud.lnr qdl(com.bytedance.sdk.component.mzz.mzz mzzVar) {
                rq rqVarMo = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().mo();
                fs fsVarUd = new fs.qdl().ud(mzzVar.qdl()).qdl().ud();
                rdp rdpVarUd = null;
                com.bytedance.sdk.component.mzz.ud.mml mmlVar = mzzVar.lnr() ? new com.bytedance.sdk.component.mzz.ud.mml() : null;
                if (mmlVar != null) {
                    mmlVar.qdl(System.currentTimeMillis());
                }
                try {
                    rdpVarUd = rqVarMo.qdl(fsVarUd).ud();
                    if (mmlVar != null) {
                        mmlVar.ud(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.mzz.ud.lnr lnrVar = new com.bytedance.sdk.component.mzz.ud.lnr(rdpVarUd.lnr(), rdpVarUd.mo().mml(), "", qdl(mzzVar, rdpVarUd));
                    to.qdl(rdpVarUd);
                    return lnrVar;
                } catch (Throwable th) {
                    try {
                        return qdl(mmlVar, th);
                    } finally {
                        to.qdl(rdpVarUd);
                    }
                }
            }

            private Map<String, String> qdl(com.bytedance.sdk.component.mzz.mzz mzzVar, rdp rdpVar) {
                if (!mzzVar.ud()) {
                    return null;
                }
                mo moVarWd = rdpVar.wd();
                HashMap map = new HashMap();
                int iQdl = moVarWd.qdl();
                for (int i2 = 0; i2 < iQdl; i2++) {
                    String strQdl = moVarWd.qdl(i2);
                    String strUd = moVarWd.ud(i2);
                    if (strQdl != null) {
                        map.put(strQdl, strUd);
                    }
                }
                return map;
            }

            private com.bytedance.sdk.component.mzz.ud.lnr qdl(com.bytedance.sdk.component.mzz.ud.mml mmlVar, Throwable th) {
                th.getMessage();
                if (mmlVar != null) {
                    mmlVar.lnr(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.mzz.ud.lnr lnrVar = new com.bytedance.sdk.component.mzz.ud.lnr(98765, th, "net failed");
                lnrVar.qdl(mmlVar);
                return lnrVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.mzz.to ud(String str) {
            return qdl(ud.qdl(str).mzz(ax.mzz(yt.qdl())).mml(ax.lnr(yt.qdl())));
        }

        public static void qdl() {
            qdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("image_config", "use_new_img", 1) == 1;
            lnr = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("image_config", "bitmap_cache_count", 10);
            mml = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("image_config", "data_cache_count", 15);
            mzz = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("image_config", "disk_cache_count", 30);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.mzz.to ud(jl jlVar) {
            return qdl(ud.qdl(jlVar.qdl()).qdl(jlVar.ud()).ud(jlVar.lnr()).mzz(ax.mzz(yt.qdl())).mml(ax.lnr(yt.qdl())).qdl(jlVar.wd()));
        }

        private static bjy qdl(Context context) {
            qdl();
            if (qdl) {
                return com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl(context, new com.bytedance.sdk.component.mzz.mml.lnr.mzz.qdl().qdl(new com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud(0, lnr, mml, mzz, new File(CacheDirFactory.getImageCacheDir("image_p")))).qdl(com.bytedance.sdk.openadsdk.multipro.ud.lnr()).qdl(new aaj() { // from class: com.bytedance.sdk.openadsdk.tvp.mml.qdl.2
                    @Override // com.bytedance.sdk.component.mzz.aaj
                    public ExecutorService qdl() {
                        return fco.ud();
                    }

                    @Override // com.bytedance.sdk.component.mzz.aaj
                    public ExecutorService ud() {
                        return fco.lnr();
                    }
                }).qdl(new jyq() { // from class: com.bytedance.sdk.openadsdk.tvp.mml.qdl.1
                    @Override // com.bytedance.sdk.component.mzz.jyq
                    public void qdl(int i2, String str) {
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(str, true);
                    }
                }).qdl(new C0155qdl()).qdl());
            }
            return com.bytedance.sdk.component.mzz.lnr.ud.qdl(context, new com.bytedance.sdk.component.mzz.lnr.mzz.qdl().qdl(new com.bytedance.sdk.component.mzz.lnr.qdl.qdl(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir(d.c.k)))).qdl(com.bytedance.sdk.openadsdk.multipro.ud.lnr()).qdl(new aaj() { // from class: com.bytedance.sdk.openadsdk.tvp.mml.qdl.4
                @Override // com.bytedance.sdk.component.mzz.aaj
                public ExecutorService qdl() {
                    return fco.ud();
                }

                @Override // com.bytedance.sdk.component.mzz.aaj
                public ExecutorService ud() {
                    return null;
                }
            }).qdl(new jyq() { // from class: com.bytedance.sdk.openadsdk.tvp.mml.qdl.3
                @Override // com.bytedance.sdk.component.mzz.jyq
                public void qdl(int i2, String str) {
                    com.bytedance.sdk.openadsdk.bjy.lnr.qdl(str, false);
                }
            }).qdl(new C0155qdl()).qdl());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream ud(String str, String str2) {
            return ud.qdl(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean ud(String str, String str2, String str3) {
            return ud.qdl(str, str2, str3);
        }

        private static com.bytedance.sdk.component.mzz.to qdl(com.bytedance.sdk.component.mzz.to toVar) {
            return hzv.qdl() ? toVar.qdl(new mzz()) : toVar;
        }
    }

    public static com.bytedance.sdk.component.mzz.to qdl(String str) {
        return qdl.ud(str);
    }

    public static boolean ud() {
        return qdl.qdl;
    }

    public static com.bytedance.sdk.component.mzz.to qdl(jl jlVar) {
        return qdl.ud(jlVar);
    }

    public static InputStream qdl(String str, String str2) {
        return qdl.ud(str, str2);
    }

    public static boolean qdl(String str, String str2, String str3) {
        return qdl.ud(str, str2, str3);
    }

    public static bjy qdl() {
        return qdl.ud;
    }
}
