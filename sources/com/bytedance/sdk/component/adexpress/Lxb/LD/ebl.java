package com.bytedance.sdk.component.adexpress.Lxb.LD;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sLN;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private static volatile ebl Lxb;
    private AtomicBoolean LD = new AtomicBoolean(false);

    private ebl() {
    }

    private JSONObject lk(String str) {
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
        if (lkVarLk == null) {
            return null;
        }
        com.bytedance.sdk.component.ebl.LD.LD ldEbl = lkVarLk.ebl();
        ldEbl.LD(str);
        com.bytedance.sdk.component.ebl.LD ldLxb = ldEbl.Lxb();
        if (ldLxb != null) {
            try {
                if (ldLxb.lc() && ldLxb.ZU() != null) {
                    return new JSONObject(ldLxb.ZU());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> LD(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return lc.Lxb().LD(str);
    }

    public static ebl Lxb() {
        if (Lxb == null) {
            synchronized (ebl.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new ebl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    private void LD() {
        if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk() == null) {
            return;
        }
        int iLxb = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().Lxb();
        if (iLxb <= 0) {
            iLxb = 100;
        }
        List<com.bytedance.sdk.component.adexpress.Lxb.lk.LD> listLD = lc.Lxb().LD();
        if (listLD == null || listLD.isEmpty() || iLxb >= listLD.size()) {
            if (listLD == null) {
                return;
            }
            listLD.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.Lxb.lk.LD ld : listLD) {
            treeMap.put(ld.ebl(), ld);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listLD.size() - (iLxb * 0.75f));
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.Lxb.lk.LD ld2 = (com.bytedance.sdk.component.adexpress.Lxb.lk.LD) entry.getValue();
                if (ld2 != null) {
                    hashSet.add(ld2.LD());
                }
            }
        }
        Lxb(hashSet);
        this.LD.set(false);
    }

    public com.bytedance.sdk.component.adexpress.Lxb.lk.LD Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return lc.Lxb().Lxb(str);
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.Lxb.lk.ZU zu, String str) {
        String strOY;
        if (zu == null) {
            sLN.Lxb("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = zu.Lxb;
        final String str3 = zu.lk;
        final String str4 = zu.LD;
        final String str5 = zu.ZU;
        final String str6 = zu.JXs;
        if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk() != null) {
            strOY = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().OY();
        } else {
            strOY = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strOY : str;
        if (TextUtils.isEmpty(str2)) {
            sLN.Lxb("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            com.bytedance.sdk.component.adexpress.ZU.ZU.Lxb(new com.bytedance.sdk.component.OY.OY("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.Lxb.LD.ebl.1
                @Override // java.lang.Runnable
                public void run() {
                    ebl.this.Lxb(str2, str3, str4, str5, str6, str7);
                }
            }, 10);
        }
    }

    private void LD(String str, String str2, String str3, String str4, String str5, String str6) {
        lc.Lxb().Lxb(new com.bytedance.sdk.component.adexpress.Lxb.lk.LD().Lxb(str).LD(str2).lk(str3).ZU(str4).JXs(str5).lc(str6).Lxb(Long.valueOf(System.currentTimeMillis())), false);
        LD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Lxb(String str, String str2, String str3, String str4, String str5, String str6) {
        if (Lxb(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                LD(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
            Lxb(str2, str6, str);
        } else {
            LD(str6, str, str3, str2, str4, str5);
        }
        boolean zLxb = OY.Lxb(str5);
        if (!LD.JXs() || zLxb) {
            JXs.LD().Lxb(true);
        }
    }

    private void Lxb(String str, String str2, String str3) {
        JSONObject jSONObjectLk;
        if (TextUtils.isEmpty(str) || (jSONObjectLk = lk(str)) == null) {
            return;
        }
        String strOptString = jSONObjectLk.optString("md5");
        String strOptString2 = jSONObjectLk.optString("version");
        String strOptString3 = jSONObjectLk.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.Lxb.lk.LD ldLxb = new com.bytedance.sdk.component.adexpress.Lxb.lk.LD().Lxb(str2).LD(str3).lk(strOptString).ZU(str).JXs(strOptString3).lc(strOptString2).Lxb(Long.valueOf(System.currentTimeMillis()));
        lc.Lxb().Lxb(ldLxb, false);
        LD();
        if (OY.Lxb(strOptString2)) {
            ldLxb.lc(strOptString2);
            JXs.LD().Lxb(true);
        }
    }

    public void Lxb(Set<String> set) {
        try {
            lc.Lxb().Lxb(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
