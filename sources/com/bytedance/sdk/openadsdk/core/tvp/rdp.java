package com.bytedance.sdk.openadsdk.core.tvp;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class rdp {
    /* JADX INFO: Access modifiers changed from: private */
    public static void lnr(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String strOptString = jSONArray.optString(i2);
            if (!TextUtils.isEmpty(strOptString)) {
                String strQdl = com.bytedance.sdk.openadsdk.core.rq.lnr.qdl(strOptString, str);
                File fileQdl = qdl(strQdl);
                if (fileQdl != null && fileQdl.exists() && fileQdl.length() > 0) {
                    return;
                } else {
                    lnr(strQdl);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mml(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String strOptString = jSONArray.optString(i2);
            if (!TextUtils.isEmpty(strOptString)) {
                String strQdl = com.bytedance.sdk.openadsdk.core.rq.lnr.qdl(strOptString, str);
                File fileQdl = qdl(strQdl);
                if (fileQdl != null && fileQdl.exists() && fileQdl.length() > 0) {
                    return;
                } else {
                    lnr(strQdl);
                }
            }
        }
    }

    public static void qdl(final com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        fco.ud(new com.bytedance.sdk.component.jpc.jpc("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.tvp.rdp.1
            @Override // java.lang.Runnable
            public void run() {
                ekw ekwVarKr;
                ekw.qdl qdlVarMo;
                com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 = ljhVar;
                if (ljhVar2 == null || (ekwVarKr = ljhVar2.kr()) == null || (qdlVarMo = ekwVarKr.mo()) == null) {
                    return;
                }
                String strOth = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().oth();
                rdp.qdl(ljhVar, qdlVarMo.qdl(), strOth);
                rdp.lnr(qdlVarMo.ud(), strOth);
                rdp.mml(qdlVarMo.lnr(), strOth);
            }
        });
    }

    public static boolean ud(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        ekw ekwVarKr;
        return (ljhVar == null || (ekwVarKr = ljhVar.kr()) == null || ekwVarKr.mo() == null) ? false : true;
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String strOptString = jSONArray.optString(i2);
            if (!TextUtils.isEmpty(strOptString)) {
                String strQdl = com.bytedance.sdk.openadsdk.core.rq.lnr.qdl(strOptString, str);
                String strQdl2 = com.bytedance.sdk.component.utils.mzz.qdl(strQdl);
                InputStream inputStreamQdl = com.bytedance.sdk.openadsdk.tvp.mml.qdl(strQdl, strQdl2);
                if (inputStreamQdl != null) {
                    try {
                        inputStreamQdl.close();
                    } catch (IOException unused) {
                    }
                } else {
                    com.bytedance.sdk.openadsdk.tvp.mml.qdl(strQdl).lnr(1).qdl(strQdl2).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, strQdl, new com.bytedance.sdk.component.mzz.jtx() { // from class: com.bytedance.sdk.openadsdk.core.tvp.rdp.2
                        @Override // com.bytedance.sdk.component.mzz.jtx
                        public void qdl(int i3, String str2, Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.mzz.jtx
                        public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
                            rqVar.qdl();
                        }
                    }), 4);
                }
            }
        }
    }

    public static InputStream ud(String str) {
        File fileQdl = qdl(str);
        if (fileQdl == null || !fileQdl.exists() || fileQdl.length() <= 0) {
            return null;
        }
        try {
            return new FileInputStream(fileQdl);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("ExpressStaticResPreload", th.getMessage());
            return null;
        }
    }

    private static void lnr(String str) {
        File fileQdl = qdl(str);
        if (fileQdl == null) {
            return;
        }
        File file = new File(fileQdl + ".tmp");
        com.bytedance.sdk.component.wd.ud.qdl qdlVarMml = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().mml();
        qdlVarMml.qdl(8);
        qdlVarMml.qdl("preloadStaticRes");
        qdlVarMml.ud(str);
        qdlVarMml.qdl(fileQdl.getParent(), fileQdl.getName());
        com.bytedance.sdk.component.wd.ud udVarQdl = qdlVarMml.qdl();
        if (udVarQdl != null && udVarQdl.mo() && udVarQdl.mzz() != null && udVarQdl.mzz().exists()) {
            com.bytedance.sdk.component.utils.aaj.qdl("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (fileQdl.exists()) {
            try {
                fileQdl.delete();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.lnr("ExpressStaticResPreload", th.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.aaj.lnr("ExpressStaticResPreload", th2.getMessage());
            }
        }
    }

    public static File qdl(String str) {
        String strM;
        String strQdl = com.bytedance.sdk.component.utils.mzz.qdl(str);
        if (strQdl == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            strM = a.m(name, "/express_static_res/");
        } else {
            strM = a.m(name, "/express_static_res/");
        }
        return com.bytedance.sdk.component.utils.wd.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), com.bytedance.sdk.openadsdk.multipro.ud.lnr(), strM, strQdl);
    }
}
