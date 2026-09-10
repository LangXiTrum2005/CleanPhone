package com.bytedance.sdk.openadsdk.core.JVA.Lxb;

import android.text.TextUtils;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static volatile LD Lxb;

    public interface Lxb {
        void Lxb(int i, String str, String str2);

        void Lxb(JSONObject jSONObject, String str);
    }

    private void LD(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb lxb = new com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb();
        lxb.lk(str).JXs(str3).ZU(str4).LD(str2).Lxb(str5).Lxb(Long.valueOf(System.currentTimeMillis()));
        lk.Lxb().Lxb(lxb);
        LD();
    }

    public static LD Lxb() {
        if (Lxb == null) {
            synchronized (LD.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new LD();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb, String str) {
        if (lxb == null) {
            return;
        }
        if (TextUtils.isEmpty(lxb.Lxb())) {
            sLN.Lxb("UGTemplateManager", "save ugen template error : tmpId is empty");
            return;
        }
        StringBuilder sbQ = DM.q(str, "_");
        sbQ.append(lxb.Lxb());
        final String string = sbQ.toString();
        final String strLk = lxb.lk();
        final String strLD = lxb.LD();
        final String strZU = lxb.ZU();
        String strJXs = lxb.JXs();
        if (TextUtils.isEmpty(strJXs)) {
            if (str.equals(bc.aC)) {
                strJXs = QAg.LD().ZU();
            } else if (str.equals("adv3")) {
                strJXs = QAg.LD().ZU() + "_v3";
            }
        }
        final String str2 = strJXs;
        hg.Lxb(new OY("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.1
            @Override // java.lang.Runnable
            public void run() {
                LD.this.Lxb(string, strLk, strLD, strZU, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD() {
        int iZU = kqm.ZU().ZU();
        if (iZU <= 0) {
            iZU = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb> listLD = lk.Lxb().LD();
        if (listLD == null || listLD.isEmpty() || iZU >= listLD.size()) {
            if (listLD == null) {
                return;
            }
            listLD.size();
            return;
        }
        int size = (int) (listLD.size() - (iZU * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb lxb : listLD) {
            treeMap.put(lxb.ZU(), lxb);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb lxb2 = (com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb) entry.getValue();
                if (lxb2 != null) {
                    hashSet.add(lxb2.Lxb());
                }
            }
        }
        Lxb(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str, String str2, String str3, String str4, String str5) {
        if (Lxb(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            LD(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            Lxb(str2, str, str3, str5, (Lxb) null);
        } else {
            LD(str2, str3, str5, str4, str);
        }
    }

    public void Lxb(String str, String str2, String str3, String str4, String str5, final Lxb lxb) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (lxb != null) {
                lxb.Lxb(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String strI = DM.i(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb Lxb2 = Lxb(strI, str4);
        if (Lxb2 != null && !TextUtils.isEmpty(Lxb2.JXs())) {
            Lxb(Lxb2);
            if (lxb != null) {
                try {
                    lxb.Lxb(new JSONObject(Lxb2.JXs()), "local");
                    return;
                } catch (JSONException unused) {
                    lxb.Lxb(2, "parse json exception data is " + Lxb2.JXs(), "local");
                    return;
                }
            }
            return;
        }
        Lxb(str2, strI, str4, str5, new Lxb() { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.2
            @Override // com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb
            public void Lxb(JSONObject jSONObject, String str6) {
                Lxb lxb2 = lxb;
                if (lxb2 != null) {
                    lxb2.Lxb(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb
            public void Lxb(int i, String str6, String str7) {
                Lxb lxb2 = lxb;
                if (lxb2 != null) {
                    lxb2.Lxb(i, str6, str7);
                }
            }
        });
    }

    private void Lxb(final String str, final String str2, final String str3, final String str4, final Lxb lxb) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (lxb != null) {
                lxb.Lxb(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
            ldLk.LD(str);
            ldLk.Lxb(7);
            ldLk.Lxb("load_ug_t");
            ldLk.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.3
                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                    if (ld == null) {
                        return;
                    }
                    if (!ld.lc()) {
                        Lxb lxb2 = lxb;
                        if (lxb2 != null) {
                            lxb2.Lxb(3, "net code error code is " + ld.Lxb() + " message is " + ld.LD(), "net");
                            return;
                        }
                        return;
                    }
                    String strZU = ld.ZU();
                    if (TextUtils.isEmpty(strZU)) {
                        Lxb lxb3 = lxb;
                        if (lxb3 != null) {
                            lxb3.Lxb(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    lk.Lxb().Lxb(new com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb().Lxb(str2).LD(str3).lk(str).JXs(str4).ZU(strZU).Lxb(Long.valueOf(System.currentTimeMillis())));
                    LD.this.LD();
                    if (lxb != null) {
                        try {
                            lxb.Lxb(new JSONObject(strZU), "net");
                        } catch (JSONException unused) {
                            lxb.Lxb(2, "parse json exception data is".concat(String.valueOf(strZU)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                    Lxb lxb2 = lxb;
                    if (lxb2 != null) {
                        lxb2.Lxb(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb> Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return lk.Lxb().Lxb(str);
    }

    public String Lxb(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb Lxb2 = Lxb(DM.i(str, "_", str2), str3);
        if (Lxb2 == null) {
            return null;
        }
        Lxb(Lxb2);
        return Lxb2.JXs();
    }

    private com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb Lxb(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return lk.Lxb().Lxb(str, str2);
    }

    private void Lxb(final com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb lxb) {
        lxb.Lxb(Long.valueOf(System.currentTimeMillis()));
        hg.Lxb(new OY("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.4
            @Override // java.lang.Runnable
            public void run() {
                lk.Lxb().Lxb(lxb);
            }
        }, 10);
    }

    public void Lxb(Set<String> set) {
        try {
            lk.Lxb().Lxb(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
