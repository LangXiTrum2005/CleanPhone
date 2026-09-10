package com.bytedance.sdk.openadsdk.core.co.ri;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static volatile lr ri;

    public interface ri {
        void ri(int i, String str, String str2);

        void ri(JSONObject jSONObject, String str);
    }

    private void lr(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.co.ri.ri riVar = new com.bytedance.sdk.openadsdk.core.co.ri.ri();
        riVar.ik(str).fi(str3).ka(str4).lr(str2).ri(str5).ri(Long.valueOf(System.currentTimeMillis()));
        ik.ri().ri(riVar);
        lr();
    }

    public static lr ri() {
        if (ri == null) {
            synchronized (lr.class) {
                try {
                    if (ri == null) {
                        ri = new lr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.co.mj.ri riVar, String str) {
        if (riVar == null || TextUtils.isEmpty(riVar.ri())) {
            return;
        }
        final String str2 = str + "_" + riVar.ri();
        final String strIk = riVar.ik();
        final String strLr = riVar.lr();
        final String strKa = riVar.ka();
        String strFi = riVar.fi();
        if (TextUtils.isEmpty(strFi)) {
            if (str.equals("ad")) {
                strFi = qt.lr().ka();
            } else if (str.equals("adv3")) {
                strFi = qt.lr().ka() + "_v3";
            }
        }
        final String str3 = strFi;
        dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.1
            @Override // java.lang.Runnable
            public void run() {
                lr.this.ri(str2, strIk, strLr, strKa, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        int iFi = nr.ka().fi();
        if (iFi <= 0) {
            iFi = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.co.ri.ri> listLr = ik.ri().lr();
        if (listLr == null || listLr.isEmpty() || iFi >= listLr.size()) {
            if (listLr == null) {
                return;
            }
            listLr.size();
            return;
        }
        int size = (int) (listLr.size() - (iFi * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.co.ri.ri riVar : listLr) {
            treeMap.put(riVar.ka(), riVar);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.co.ri.ri riVar2 = (com.bytedance.sdk.openadsdk.core.co.ri.ri) entry.getValue();
                if (riVar2 != null) {
                    hashSet.add(riVar2.ri());
                }
            }
        }
        ri(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(String str, String str2, String str3, String str4, String str5) {
        if (ri(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            lr(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            ri(str2, str, str3, str5, (ri) null);
        } else {
            lr(str2, str3, str5, str4, str);
        }
    }

    public void ri(String str, String str2, String str3, String str4, String str5, final ri riVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (riVar != null) {
                riVar.ri(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String str6 = str + "_" + str3;
        com.bytedance.sdk.openadsdk.core.co.ri.ri riVarRi = ri(str6, str4);
        if (riVarRi != null && !TextUtils.isEmpty(riVarRi.fi())) {
            ri(riVarRi);
            if (riVar != null) {
                try {
                    riVar.ri(new JSONObject(riVarRi.fi()), "local");
                    return;
                } catch (JSONException unused) {
                    riVar.ri(2, "parse json exception data is " + riVarRi.fi(), "local");
                    return;
                }
            }
            return;
        }
        ri(str2, str6, str4, str5, new ri() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.2
            @Override // com.bytedance.sdk.openadsdk.core.co.ri.lr.ri
            public void ri(JSONObject jSONObject, String str7) {
                ri riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.ri(jSONObject, str7);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.ri.lr.ri
            public void ri(int i, String str7, String str8) {
                ri riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.ri(i, str7, str8);
                }
            }
        });
    }

    private void ri(final String str, final String str2, final String str3, final String str4, final ri riVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (riVar != null) {
                riVar.ri(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
            lrVarIk.ik(str);
            lrVarIk.ri(7);
            lrVarIk.lr("load_ug_t");
            lrVarIk.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.3
                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                    if (lrVar == null) {
                        return;
                    }
                    if (!lrVar.di()) {
                        ri riVar2 = riVar;
                        if (riVar2 != null) {
                            riVar2.ri(3, "net code error code is " + lrVar.ri() + " message is " + lrVar.lr(), "net");
                            return;
                        }
                        return;
                    }
                    String strKa = lrVar.ka();
                    if (TextUtils.isEmpty(strKa)) {
                        ri riVar3 = riVar;
                        if (riVar3 != null) {
                            riVar3.ri(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    ik.ri().ri(new com.bytedance.sdk.openadsdk.core.co.ri.ri().ri(str2).lr(str3).ik(str).fi(str4).ka(strKa).ri(Long.valueOf(System.currentTimeMillis())));
                    lr.this.lr();
                    if (riVar != null) {
                        try {
                            riVar.ri(new JSONObject(strKa), "net");
                        } catch (JSONException unused) {
                            riVar.ri(2, "parse json exception data is".concat(String.valueOf(strKa)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                    ri riVar2 = riVar;
                    if (riVar2 != null) {
                        riVar2.ri(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.co.ri.ri> ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ik.ri().ri(str);
    }

    public String ri(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.co.ri.ri riVarRi = ri(str + "_" + str2, str3);
        if (riVarRi == null) {
            return null;
        }
        ri(riVarRi);
        return riVarRi.fi();
    }

    private com.bytedance.sdk.openadsdk.core.co.ri.ri ri(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return ik.ri().ri(str, str2);
    }

    private void ri(final com.bytedance.sdk.openadsdk.core.co.ri.ri riVar) {
        riVar.ri(Long.valueOf(System.currentTimeMillis()));
        dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.4
            @Override // java.lang.Runnable
            public void run() {
                ik.ri().ri(riVar);
            }
        }, 10);
    }

    public void ri(Set<String> set) {
        try {
            ik.ri().ri(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
