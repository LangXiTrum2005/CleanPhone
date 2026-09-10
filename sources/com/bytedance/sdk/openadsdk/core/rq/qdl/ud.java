package com.bytedance.sdk.openadsdk.core.rq.qdl;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private static volatile ud qdl;

    public interface qdl {
        void qdl(int i2, String str, String str2);

        void qdl(JSONObject jSONObject, String str);
    }

    private void ud(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.rq.qdl.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.rq.qdl.qdl();
        qdlVar.lnr(str).mzz(str3).mml(str4).ud(str2).qdl(str5).qdl(Long.valueOf(System.currentTimeMillis()));
        lnr.qdl().qdl(qdlVar);
        ud();
    }

    public static ud qdl() {
        if (qdl == null) {
            synchronized (ud.class) {
                try {
                    if (qdl == null) {
                        qdl = new ud();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVar, String str) {
        if (qdlVar == null || TextUtils.isEmpty(qdlVar.qdl())) {
            return;
        }
        StringBuilder sbX = a.x(str, "_");
        sbX.append(qdlVar.qdl());
        final String string = sbX.toString();
        final String strLnr = qdlVar.lnr();
        final String strUd = qdlVar.ud();
        final String strMml = qdlVar.mml();
        String strMzz = qdlVar.mzz();
        if (TextUtils.isEmpty(strMzz)) {
            if (str.equals("ad")) {
                strMzz = tvp.ud().mml();
            } else if (str.equals("adv3")) {
                strMzz = tvp.ud().mml() + "_v3";
            }
        }
        final String str2 = strMzz;
        fco.qdl(new jpc("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.ud.1
            @Override // java.lang.Runnable
            public void run() {
                ud.this.qdl(string, strLnr, strUd, strMml, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud() {
        int iMo = yt.mml().mo();
        if (iMo <= 0) {
            iMo = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.rq.qdl.qdl> listUd = lnr.qdl().ud();
        if (listUd == null || listUd.isEmpty() || iMo >= listUd.size()) {
            if (listUd == null) {
                return;
            }
            listUd.size();
            return;
        }
        int size = (int) (listUd.size() - (iMo * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.rq.qdl.qdl qdlVar : listUd) {
            treeMap.put(qdlVar.mml(), qdlVar);
        }
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i2 < size) {
                i2++;
                com.bytedance.sdk.openadsdk.core.rq.qdl.qdl qdlVar2 = (com.bytedance.sdk.openadsdk.core.rq.qdl.qdl) entry.getValue();
                if (qdlVar2 != null) {
                    hashSet.add(qdlVar2.qdl());
                }
            }
        }
        qdl(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str, String str2, String str3, String str4, String str5) {
        if (qdl(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            ud(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            qdl(str2, str, str3, str5, (qdl) null);
        } else {
            ud(str2, str3, str5, str4, str);
        }
    }

    public void qdl(String str, String str2, String str3, String str4, String str5, final qdl qdlVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (qdlVar != null) {
                qdlVar.qdl(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String strD = a.D(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.rq.qdl.qdl qdlVarQdl = qdl(strD, str4);
        if (qdlVarQdl != null && !TextUtils.isEmpty(qdlVarQdl.mzz())) {
            qdl(qdlVarQdl);
            if (qdlVar != null) {
                try {
                    qdlVar.qdl(new JSONObject(qdlVarQdl.mzz()), "local");
                    return;
                } catch (JSONException unused) {
                    qdlVar.qdl(2, "parse json exception data is " + qdlVarQdl.mzz(), "local");
                    return;
                }
            }
            return;
        }
        qdl(str2, strD, str4, str5, new qdl() { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.ud.2
            @Override // com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl
            public void qdl(JSONObject jSONObject, String str6) {
                qdl qdlVar2 = qdlVar;
                if (qdlVar2 != null) {
                    qdlVar2.qdl(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl
            public void qdl(int i2, String str6, String str7) {
                qdl qdlVar2 = qdlVar;
                if (qdlVar2 != null) {
                    qdlVar2.qdl(i2, str6, str7);
                }
            }
        });
    }

    private void qdl(final String str, final String str2, final String str3, final String str4, final qdl qdlVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (qdlVar != null) {
                qdlVar.qdl(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
            udVarLnr.ud(str);
            udVarLnr.qdl(7);
            udVarLnr.qdl("load_ug_t");
            udVarLnr.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.ud.3
                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                    if (udVar == null) {
                        return;
                    }
                    if (!udVar.mo()) {
                        qdl qdlVar2 = qdlVar;
                        if (qdlVar2 != null) {
                            qdlVar2.qdl(3, "net code error code is " + udVar.qdl() + " message is " + udVar.ud(), "net");
                            return;
                        }
                        return;
                    }
                    String strMml = udVar.mml();
                    if (TextUtils.isEmpty(strMml)) {
                        qdl qdlVar3 = qdlVar;
                        if (qdlVar3 != null) {
                            qdlVar3.qdl(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    lnr.qdl().qdl(new com.bytedance.sdk.openadsdk.core.rq.qdl.qdl().qdl(str2).ud(str3).lnr(str).mzz(str4).mml(strMml).qdl(Long.valueOf(System.currentTimeMillis())));
                    ud.this.ud();
                    if (qdlVar != null) {
                        try {
                            qdlVar.qdl(new JSONObject(strMml), "net");
                        } catch (JSONException unused) {
                            qdlVar.qdl(2, "parse json exception data is".concat(String.valueOf(strMml)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                    qdl qdlVar2 = qdlVar;
                    if (qdlVar2 != null) {
                        qdlVar2.qdl(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.rq.qdl.qdl> qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return lnr.qdl().qdl(str);
    }

    public String qdl(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.rq.qdl.qdl qdlVarQdl = qdl(a.D(str, "_", str2), str3);
        if (qdlVarQdl == null) {
            return null;
        }
        qdl(qdlVarQdl);
        return qdlVarQdl.mzz();
    }

    private com.bytedance.sdk.openadsdk.core.rq.qdl.qdl qdl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return lnr.qdl().qdl(str, str2);
    }

    private void qdl(final com.bytedance.sdk.openadsdk.core.rq.qdl.qdl qdlVar) {
        qdlVar.qdl(Long.valueOf(System.currentTimeMillis()));
        fco.qdl(new jpc("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.ud.4
            @Override // java.lang.Runnable
            public void run() {
                lnr.qdl().qdl(qdlVar);
            }
        }, 10);
    }

    public void qdl(Set<String> set) {
        try {
            lnr.qdl().qdl(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
