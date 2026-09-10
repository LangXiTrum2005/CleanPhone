package com.bytedance.sdk.openadsdk.core.jbs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.oh;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class bgr {
    /* JADX INFO: Access modifiers changed from: private */
    public static void ik(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                String strRi = com.bytedance.sdk.openadsdk.core.co.ka.ri(strOptString, str);
                File fileRi = ri(strRi);
                if (fileRi != null && fileRi.exists() && fileRi.length() > 0) {
                    return;
                } else {
                    ik(strRi);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ka(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                String strRi = com.bytedance.sdk.openadsdk.core.co.ka.ri(strOptString, str);
                File fileRi = ri(strRi);
                if (fileRi != null && fileRi.exists() && fileRi.length() > 0) {
                    return;
                } else {
                    ik(strRi);
                }
            }
        }
    }

    public static boolean lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        oh ohVarZv;
        return (wjvVar == null || (ohVarZv = wjvVar.zv()) == null || ohVarZv.di() == null) ? false : true;
    }

    public static void ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.jbs.bgr.1
            @Override // java.lang.Runnable
            public void run() {
                oh ohVarZv;
                oh.ri riVarDi;
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = wjvVar;
                if (wjvVar2 == null || (ohVarZv = wjvVar2.zv()) == null || (riVarDi = ohVarZv.di()) == null) {
                    return;
                }
                String strAc = com.bytedance.sdk.openadsdk.core.settings.sf.lr().ac();
                bgr.ri(wjvVar, riVarDi.ri(), strAc);
                bgr.ik(riVarDi.lr(), strAc);
                bgr.ka(riVarDi.ik(), strAc);
            }
        });
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                String strRi = com.bytedance.sdk.openadsdk.core.co.ka.ri(strOptString, str);
                String strRi2 = com.bytedance.sdk.component.utils.fi.ri(strRi);
                InputStream inputStreamRi = com.bytedance.sdk.openadsdk.qt.ka.ri(strRi, strRi2);
                if (inputStreamRi != null) {
                    try {
                        inputStreamRi.close();
                    } catch (IOException unused) {
                    }
                } else {
                    com.bytedance.sdk.openadsdk.qt.ka.ri(strRi).ik(1).ri(strRi2).ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, strRi, new com.bytedance.sdk.component.fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.jbs.bgr.2
                        @Override // com.bytedance.sdk.component.fi.slm
                        public void ri(int i2, String str2, Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.fi.slm
                        public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
                            sfVar.ri();
                        }
                    }), 4);
                }
            }
        }
    }

    public static InputStream lr(String str) {
        File fileRi = ri(str);
        if (fileRi == null || !fileRi.exists() || fileRi.length() <= 0) {
            return null;
        }
        try {
            return new FileInputStream(fileRi);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("ExpressStaticResPreload", th.getMessage());
            return null;
        }
    }

    private static void ik(String str) {
        File fileRi = ri(str);
        if (fileRi == null) {
            return;
        }
        File file = new File(fileRi + ".tmp");
        com.bytedance.sdk.component.xha.lr.ri riVarKa = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ka();
        riVarKa.ri(8);
        riVarKa.lr("preloadStaticRes");
        riVarKa.ik(str);
        riVarKa.ri(fileRi.getParent(), fileRi.getName());
        com.bytedance.sdk.component.xha.lr lrVarRi = riVarKa.ri();
        if (lrVarRi != null && lrVarRi.di() && lrVarRi.fi() != null && lrVarRi.fi().exists()) {
            com.bytedance.sdk.component.utils.ac.ri("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (fileRi.exists()) {
            try {
                fileRi.delete();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik("ExpressStaticResPreload", th.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ac.ik("ExpressStaticResPreload", th2.getMessage());
            }
        }
    }

    public static File ri(String str) {
        String strRi = com.bytedance.sdk.component.utils.fi.ri(str);
        if (strRi == null) {
            return null;
        }
        return new File(com.bytedance.sdk.component.utils.xha.lr(com.bytedance.sdk.openadsdk.core.nr.ri(), new File(CacheDirFactory.getRootDir()).getName() + "/express_static_res"), strRi);
    }
}
