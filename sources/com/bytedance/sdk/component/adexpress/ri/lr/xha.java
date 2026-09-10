package com.bytedance.sdk.component.adexpress.ri.lr;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private static volatile xha ri;
    private AtomicBoolean lr = new AtomicBoolean(false);

    private xha() {
    }

    private JSONObject ik(String str) {
        com.bytedance.sdk.component.adexpress.ri.ri.ik ikVarIk = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik();
        if (ikVarIk == null) {
            return null;
        }
        com.bytedance.sdk.component.xha.lr.lr lrVarXha = ikVarIk.xha();
        lrVarXha.ik(str);
        com.bytedance.sdk.component.xha.lr lrVarRi = lrVarXha.ri();
        if (lrVarRi != null) {
            try {
                if (lrVarRi.di() && lrVarRi.ka() != null) {
                    return new JSONObject(lrVarRi.ka());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return di.ri().lr(str);
    }

    public static xha ri() {
        if (ri == null) {
            synchronized (xha.class) {
                try {
                    if (ri == null) {
                        ri = new xha();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    private void lr() {
        if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik() == null) {
            return;
        }
        int iRi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().ri();
        if (iRi <= 0) {
            iRi = 100;
        }
        List<com.bytedance.sdk.component.adexpress.ri.ik.lr> listLr = di.ri().lr();
        if (listLr == null || listLr.isEmpty() || iRi >= listLr.size()) {
            if (listLr == null) {
                return;
            }
            listLr.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.ri.ik.lr lrVar : listLr) {
            treeMap.put(lrVar.xha(), lrVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listLr.size() - (iRi * 0.75f));
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.ri.ik.lr lrVar2 = (com.bytedance.sdk.component.adexpress.ri.ik.lr) entry.getValue();
                if (lrVar2 != null) {
                    hashSet.add(lrVar2.lr());
                }
            }
        }
        ri(hashSet);
        this.lr.set(false);
    }

    public com.bytedance.sdk.component.adexpress.ri.ik.lr ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return di.ri().ri(str);
    }

    public void ri(com.bytedance.sdk.component.adexpress.ri.ik.ka kaVar, String str) {
        String strMj;
        if (kaVar == null) {
            return;
        }
        final String str2 = kaVar.ri;
        final String str3 = kaVar.ik;
        final String str4 = kaVar.lr;
        final String str5 = kaVar.ka;
        final String str6 = kaVar.fi;
        if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik() != null) {
            strMj = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().mj();
        } else {
            strMj = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strMj : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ka.ka.ri(new com.bytedance.sdk.component.mj.lr.ik("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.ri.lr.xha.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                xha.this.ri(str2, str3, str4, str5, str6, str7);
            }
        }, 10);
    }

    private void lr(String str, String str2, String str3, String str4, String str5, String str6) {
        di.ri().ri(new com.bytedance.sdk.component.adexpress.ri.ik.lr().ri(str).lr(str2).ik(str3).ka(str4).fi(str5).di(str6).ri(Long.valueOf(System.currentTimeMillis())), false);
        lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ri(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (ri(str) != null) {
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    str7 = str5;
                    lr(str6, str, str3, str2, str4, str7);
                } else {
                    str7 = str5;
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        ri(str2, str6, str);
                    } else {
                        lr(str6, str, str3, str2, str4, str7);
                    }
                }
                boolean zRi = mj.ri(str7);
                if (!lr.fi() || zRi) {
                    fi.lr().ri(true);
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

    private void ri(String str, String str2, String str3) {
        JSONObject jSONObjectIk;
        if (TextUtils.isEmpty(str) || (jSONObjectIk = ik(str)) == null) {
            return;
        }
        String strOptString = jSONObjectIk.optString("md5");
        String strOptString2 = jSONObjectIk.optString("version");
        String strOptString3 = jSONObjectIk.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ri.ik.lr lrVarRi = new com.bytedance.sdk.component.adexpress.ri.ik.lr().ri(str2).lr(str3).ik(strOptString).ka(str).fi(strOptString3).di(strOptString2).ri(Long.valueOf(System.currentTimeMillis()));
        di.ri().ri(lrVarRi, false);
        lr();
        if (mj.ri(strOptString2)) {
            lrVarRi.di(strOptString2);
            fi.lr().ri(true);
        }
    }

    public void ri(Set<String> set) {
        try {
            di.ri().ri(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
