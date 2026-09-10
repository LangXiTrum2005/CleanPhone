package com.bytedance.sdk.component.adexpress.qdl.ud;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wd {
    private static volatile wd qdl;
    private AtomicBoolean ud = new AtomicBoolean(false);

    private wd() {
    }

    private JSONObject lnr(String str) {
        com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
        if (lnrVarLnr == null) {
            return null;
        }
        com.bytedance.sdk.component.wd.ud.ud udVarWd = lnrVarLnr.wd();
        udVarWd.ud(str);
        com.bytedance.sdk.component.wd.ud udVarQdl = udVarWd.qdl();
        if (udVarQdl != null) {
            try {
                if (udVarQdl.mo() && udVarQdl.mml() != null) {
                    return new JSONObject(udVarQdl.mml());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return mo.qdl().ud(str);
    }

    public static wd qdl() {
        if (qdl == null) {
            synchronized (wd.class) {
                try {
                    if (qdl == null) {
                        qdl = new wd();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    private void ud() {
        if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr() == null) {
            return;
        }
        int iQdl = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().qdl();
        if (iQdl <= 0) {
            iQdl = 100;
        }
        List<com.bytedance.sdk.component.adexpress.qdl.lnr.ud> listUd = mo.qdl().ud();
        if (listUd == null || listUd.isEmpty() || iQdl >= listUd.size()) {
            if (listUd == null) {
                return;
            }
            listUd.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVar : listUd) {
            treeMap.put(udVar.wd(), udVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listUd.size() - (iQdl * 0.75f));
        int i2 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i2 < size) {
                i2++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVar2 = (com.bytedance.sdk.component.adexpress.qdl.lnr.ud) entry.getValue();
                if (udVar2 != null) {
                    hashSet.add(udVar2.ud());
                }
            }
        }
        qdl(hashSet);
        this.ud.set(false);
    }

    public com.bytedance.sdk.component.adexpress.qdl.lnr.ud qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return mo.qdl().qdl(str);
    }

    public void qdl(com.bytedance.sdk.component.adexpress.qdl.lnr.mml mmlVar, String str) {
        String strJpc;
        if (mmlVar == null) {
            return;
        }
        final String str2 = mmlVar.qdl;
        final String str3 = mmlVar.lnr;
        final String str4 = mmlVar.ud;
        final String str5 = mmlVar.mml;
        final String str6 = mmlVar.mzz;
        if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr() != null) {
            strJpc = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().jpc();
        } else {
            strJpc = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strJpc : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.mml.mml.qdl(new com.bytedance.sdk.component.jpc.jpc("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.qdl.ud.wd.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                wd.this.qdl(str2, str3, str4, str5, str6, str7);
            }
        }, 10);
    }

    private void ud(String str, String str2, String str3, String str4, String str5, String str6) {
        mo.qdl().qdl(new com.bytedance.sdk.component.adexpress.qdl.lnr.ud().qdl(str).ud(str2).lnr(str3).mml(str4).mzz(str5).mo(str6).qdl(Long.valueOf(System.currentTimeMillis())), false);
        ud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (qdl(str) != null) {
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    str7 = str5;
                    ud(str6, str, str3, str2, str4, str7);
                } else {
                    str7 = str5;
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        qdl(str2, str6, str);
                    } else {
                        ud(str6, str, str3, str2, str4, str7);
                    }
                }
                boolean zQdl = jpc.qdl(str7);
                if (!ud.mzz() || zQdl) {
                    mzz.ud().qdl(true);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void qdl(String str, String str2, String str3) {
        JSONObject jSONObjectLnr;
        if (TextUtils.isEmpty(str) || (jSONObjectLnr = lnr(str)) == null) {
            return;
        }
        String strOptString = jSONObjectLnr.optString("md5");
        String strOptString2 = jSONObjectLnr.optString("version");
        String strOptString3 = jSONObjectLnr.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVarQdl = new com.bytedance.sdk.component.adexpress.qdl.lnr.ud().qdl(str2).ud(str3).lnr(strOptString).mml(str).mzz(strOptString3).mo(strOptString2).qdl(Long.valueOf(System.currentTimeMillis()));
        mo.qdl().qdl(udVarQdl, false);
        ud();
        if (jpc.qdl(strOptString2)) {
            udVarQdl.mo(strOptString2);
            mzz.ud().qdl(true);
        }
    }

    public void qdl(Set<String> set) {
        try {
            mo.qdl().qdl(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
