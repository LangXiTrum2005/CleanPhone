package com.bytedance.sdk.component.adexpress.Lxb.LD;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.ZU.nBu;
import com.bytedance.sdk.component.utils.sLN;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    static Object Lxb = new Object();

    public static boolean JXs() {
        return JXs.LD().JXs();
    }

    public static void LD() {
        try {
            OY.ZU();
            File fileOY = JXs.OY();
            if (fileOY == null || !fileOY.exists()) {
                return;
            }
            if (fileOY.getParentFile() != null) {
                com.bytedance.sdk.component.utils.lc.lk(fileOY.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.lc.lk(fileOY);
            }
        } catch (Throwable unused) {
        }
    }

    public static void Lxb() {
        JXs.LD();
    }

    public static com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb ZU() {
        return JXs.LD().lc();
    }

    private static File ebl(String str) {
        List<Pair<String, String>> listLD;
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.LD ldJXs = ZU().JXs();
        if (ldJXs == null || (listLD = ldJXs.LD()) == null || listLD.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : listLD) {
            Object obj = pair.second;
            if (obj != null && ((String) obj).equals(str)) {
                return new File(JXs.OY(), (String) pair.first);
            }
        }
        return null;
    }

    @Deprecated
    private static String lc() {
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbZU = ZU();
        if (lxbZU == null) {
            return null;
        }
        return lxbZU.ZU();
    }

    public static String lk() {
        return lc.lk();
    }

    private static boolean JXs(String str) {
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbZU;
        List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> listLc;
        if (!JXs() || (lxbZU = ZU()) == null || (listLc = lxbZU.lc()) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb : listLc) {
            if (c0054Lxb != null && TextUtils.equals(str, c0054Lxb.Lxb())) {
                return true;
            }
        }
        return false;
    }

    public static com.bytedance.sdk.component.adexpress.Lxb.lk.LD Lxb(String str) {
        return ebl.Lxb().Lxb(str);
    }

    public static String ZU(String str) {
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb;
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbZU = ZU();
        if (lxbZU == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return lc();
        }
        Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb = lxbZU.Lxb();
        if (mapLxb == null || mapLxb.size() <= 0 || (lxb = mapLxb.get(str)) == null) {
            return null;
        }
        return lxb.ZU();
    }

    public static com.bytedance.sdk.component.adexpress.Lxb.lk.LD lk(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.Lxb.lk.LD ldLxb = ebl.Lxb().Lxb(str);
        if (ldLxb != null) {
            ldLxb.Lxb(Long.valueOf(System.currentTimeMillis()));
            Lxb(ldLxb);
        }
        return ldLxb;
    }

    public static void Lxb(com.bytedance.sdk.component.adexpress.Lxb.lk.ZU zu) {
        ebl.Lxb().Lxb(zu, zu.lc);
    }

    private static File lc(String str) {
        if (!JXs()) {
            return null;
        }
        for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb : ZU().lc()) {
            if (c0054Lxb.Lxb() != null && c0054Lxb.Lxb().equals(str)) {
                File file = new File(JXs.OY(), com.bytedance.sdk.component.utils.JXs.Lxb(c0054Lxb.Lxb()));
                String strLxb = com.bytedance.sdk.component.utils.JXs.Lxb(file);
                if (c0054Lxb.LD() == null || !c0054Lxb.LD().equals(strLxb)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    private static void Lxb(final com.bytedance.sdk.component.adexpress.Lxb.lk.LD ld) {
        com.bytedance.sdk.component.adexpress.ZU.ZU.Lxb(new com.bytedance.sdk.component.OY.OY("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.Lxb.LD.LD.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (LD.Lxb) {
                    lc.Lxb().Lxb(ld, true);
                }
            }
        }, 10);
    }

    public static Lxb Lxb(String str, nBu.Lxb lxb, String str2, String str3) {
        File fileLc;
        Lxb lxb2 = new Lxb();
        if (TextUtils.isEmpty(str3)) {
            fileLc = null;
        } else {
            fileLc = LD(str3, str);
            if (fileLc != null) {
                lxb2.Lxb(1);
            }
        }
        if (fileLc == null && (fileLc = ebl(str)) != null) {
            lxb2.Lxb(3);
        }
        if (fileLc == null && (fileLc = lc(str)) != null) {
            lxb2.Lxb(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!Lxb(str, str3)) {
                lxb2.Lxb(4);
            }
        } else if (!JXs(str)) {
            lxb2.Lxb(6);
        }
        lxb2.LD();
        if (fileLc != null) {
            try {
                lxb2.Lxb(new WebResourceResponse(lxb.Lxb(), "utf-8", new FileInputStream(fileLc)));
            } catch (Throwable th) {
                sLN.Lxb("TTDynamic", "get html WebResourceResponse error", th);
            }
        }
        return lxb2;
    }

    public static boolean lk(JSONObject jSONObject) {
        Object objOpt;
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject == null || (objOpt = jSONObjectOptJSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Set<String> LD(String str) {
        return ebl.Lxb().LD(str);
    }

    private static File LD(String str, String str2) {
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb;
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbZU = ZU();
        if (lxbZU == null || !JXs()) {
            return null;
        }
        Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb = lxbZU.Lxb();
        if (mapLxb.size() == 0 || (lxb = mapLxb.get(str)) == null) {
            return null;
        }
        for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb : lxb.lc()) {
            if (c0054Lxb.Lxb() != null && c0054Lxb.Lxb().equals(str2)) {
                File file = new File(JXs.OY(), com.bytedance.sdk.component.utils.JXs.Lxb(c0054Lxb.Lxb()));
                String strLxb = com.bytedance.sdk.component.utils.JXs.Lxb(file);
                if (c0054Lxb.LD() == null || !c0054Lxb.LD().equals(strLxb)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static boolean LD(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean Lxb(String str, String str2) {
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbZU;
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb;
        if (!JXs() || (lxbZU = ZU()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb = lxbZU.Lxb();
        if (mapLxb.size() == 0 || (lxb = mapLxb.get(str2)) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb c0054Lxb : lxb.lc()) {
            if (c0054Lxb != null && TextUtils.equals(str, c0054Lxb.Lxb())) {
                return true;
            }
        }
        return false;
    }

    public static boolean Lxb(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}
