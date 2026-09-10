package com.bytedance.sdk.component.adexpress.ri.lr;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.ka.jbs;
import com.ironsource.A5;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    static Object ri = new Object();

    private static String di() {
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarKa = ka();
        if (riVarKa == null) {
            return null;
        }
        return riVarKa.ka();
    }

    public static boolean fi() {
        return fi.lr().fi();
    }

    public static String ik() {
        return di.ik();
    }

    public static com.bytedance.sdk.component.adexpress.ri.ik.ri ka() {
        return fi.lr().di();
    }

    public static void lr() {
        try {
            mj.ka();
            File fileMj = fi.mj();
            if (fileMj == null || !fileMj.exists()) {
                return;
            }
            if (fileMj.getParentFile() != null) {
                com.bytedance.sdk.component.utils.xha.ik(fileMj.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.xha.ik(fileMj);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ri() {
        fi.lr();
    }

    private static File xha(String str) {
        List<Pair<String, String>> listLr;
        com.bytedance.sdk.component.adexpress.ri.ik.ri.lr lrVarFi = ka().fi();
        if (lrVarFi != null && (listLr = lrVarFi.lr()) != null && listLr.size() > 0) {
            for (Pair<String, String> pair : listLr) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(fi.mj(), (String) pair.first);
                }
            }
        }
        return null;
    }

    private static boolean fi(String str) {
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarKa;
        List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> listDi;
        if (!fi() || (riVarKa = ka()) == null || (listDi = riVarKa.di()) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri : listDi) {
            if (c0207ri != null && TextUtils.equals(str, c0207ri.ri())) {
                return true;
            }
        }
        return false;
    }

    public static com.bytedance.sdk.component.adexpress.ri.ik.lr ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.ri.ik.lr lrVarRi = xha.ri().ri(str);
        if (lrVarRi != null) {
            lrVarRi.ri(Long.valueOf(System.currentTimeMillis()));
            ri(lrVarRi);
        }
        return lrVarRi;
    }

    public static String ka(String str) {
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVar;
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarKa = ka();
        if (riVarKa == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return di();
        }
        Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi = riVarKa.ri();
        if (mapRi == null || mapRi.size() <= 0 || (riVar = mapRi.get(str)) == null) {
            return null;
        }
        return riVar.ka();
    }

    public static com.bytedance.sdk.component.adexpress.ri.ik.lr ri(String str) {
        return xha.ri().ri(str);
    }

    private static File di(String str) {
        if (fi()) {
            for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri : ka().di()) {
                if (c0207ri.ri() != null && c0207ri.ri().equals(str)) {
                    File file = new File(fi.mj(), com.bytedance.sdk.component.utils.fi.ri(c0207ri.ri()));
                    String strRi = com.bytedance.sdk.component.utils.fi.ri(file);
                    if (c0207ri.lr() == null || !c0207ri.lr().equals(strRi)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    public static void ri(com.bytedance.sdk.component.adexpress.ri.ik.ka kaVar) {
        xha.ri().ri(kaVar, kaVar.di);
    }

    private static void ri(final com.bytedance.sdk.component.adexpress.ri.ik.lr lrVar) {
        com.bytedance.sdk.component.adexpress.ka.ka.ri(new com.bytedance.sdk.component.mj.lr.ik("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.ri.lr.lr.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (lr.ri) {
                    di.ri().ri(lrVar, true);
                }
            }
        }, 10);
    }

    public static ri ri(String str, jbs.ri riVar, String str2, String str3) {
        File fileDi;
        ri riVar2 = new ri();
        if (TextUtils.isEmpty(str3)) {
            fileDi = null;
        } else {
            fileDi = lr(str3, str);
            if (fileDi != null) {
                riVar2.ri(1);
            }
        }
        if (fileDi == null && (fileDi = xha(str)) != null) {
            riVar2.ri(3);
        }
        if (fileDi == null && (fileDi = di(str)) != null) {
            riVar2.ri(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!ri(str, str3)) {
                riVar2.ri(4);
            }
        } else if (!fi(str)) {
            riVar2.ri(6);
        }
        riVar2.lr();
        if (fileDi != null) {
            try {
                riVar2.ri(new WebResourceResponse(riVar.ri(), A5.O, new FileInputStream(fileDi)));
            } catch (Throwable unused) {
            }
        }
        return riVar2;
    }

    public static Set<String> lr(String str) {
        return xha.ri().lr(str);
    }

    private static File lr(String str, String str2) {
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVar;
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarKa = ka();
        if (riVarKa != null && fi()) {
            Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi = riVarKa.ri();
            if (mapRi.size() != 0 && (riVar = mapRi.get(str)) != null) {
                for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri : riVar.di()) {
                    if (c0207ri.ri() != null && c0207ri.ri().equals(str2)) {
                        File file = new File(fi.mj(), com.bytedance.sdk.component.utils.fi.ri(c0207ri.ri()));
                        String strRi = com.bytedance.sdk.component.utils.fi.ri(file);
                        if (c0207ri.lr() == null || !c0207ri.lr().equals(strRi)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static boolean lr(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean ri(String str, String str2) {
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarKa;
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVar;
        if (!fi() || (riVarKa = ka()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi = riVarKa.ri();
        if (mapRi.size() == 0 || (riVar = mapRi.get(str2)) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri c0207ri : riVar.di()) {
            if (c0207ri != null && TextUtils.equals(str, c0207ri.ri())) {
                return true;
            }
        }
        return false;
    }

    public static boolean ri(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}
