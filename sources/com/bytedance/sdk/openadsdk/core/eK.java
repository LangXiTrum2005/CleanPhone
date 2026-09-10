package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class eK {
    public static ConcurrentHashMap<Integer, eK> Lxb = new ConcurrentHashMap<>();
    private int JXs;
    private int ZU;
    private String lc;
    private String LD = "";
    private String lk = "";

    private void lc() {
        this.LD = "";
        this.lk = "";
        this.ZU = 0;
        this.JXs = 0;
    }

    public int JXs() {
        return this.JXs;
    }

    public String LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.lc;
    }

    public int ZU() {
        return this.ZU;
    }

    public String lk() {
        return this.lk;
    }

    public static void lk(int i) {
        eK eKVar;
        if (i == 0) {
            return;
        }
        if (Lxb == null) {
            Lxb = new ConcurrentHashMap<>();
        }
        if (!Lxb.containsKey(Integer.valueOf(i)) || (eKVar = Lxb.get(Integer.valueOf(i))) == null) {
            return;
        }
        eKVar.LD(1);
    }

    public void LD(int i) {
        this.JXs = i;
    }

    public void Lxb(int i) {
        this.ZU = i;
    }

    public static void LD(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar == null || TextUtils.isEmpty(tDVar.Lv())) {
            return;
        }
        int iTd = tDVar.Td();
        Integer numValueOf = Integer.valueOf(iTd);
        if (iTd == 0) {
            return;
        }
        if (Lxb == null) {
            Lxb = new ConcurrentHashMap<>();
        }
        eK eKVar = Lxb.containsKey(numValueOf) ? Lxb.get(numValueOf) : null;
        if (eKVar == null) {
            eKVar = new eK();
        }
        String strXNP = tDVar.xNP();
        if (TextUtils.isEmpty(strXNP) || !strXNP.equals(eKVar.Lxb())) {
            eKVar.lc();
            eKVar.Lxb(tDVar);
            Lxb.put(numValueOf, eKVar);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar != null) {
            String strXNP = tDVar.xNP();
            if (!TextUtils.isEmpty(strXNP)) {
                this.lc = strXNP;
            }
            String strSv = tDVar.Sv();
            if (TextUtils.isEmpty(strSv) && tDVar.chu()) {
                strSv = tDVar.SlV().QAg();
            }
            if (!TextUtils.isEmpty(strSv)) {
                String[] strArrSplit = strSv.split("/");
                if (strArrSplit.length >= 3) {
                    this.LD = strArrSplit[2];
                }
            }
            if (tDVar.MGT() == null || TextUtils.isEmpty(tDVar.MGT().lk())) {
                return;
            }
            this.lk = tDVar.MGT().lk();
        }
    }

    public static void lk(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        eK eKVar;
        if (tDVar == null) {
            return;
        }
        int iTd = tDVar.Td();
        Integer numValueOf = Integer.valueOf(iTd);
        if (iTd == 0) {
            return;
        }
        if (Lxb == null) {
            Lxb = new ConcurrentHashMap<>();
        }
        if (!Lxb.containsKey(numValueOf) || (eKVar = Lxb.get(numValueOf)) == null) {
            return;
        }
        eKVar.Lxb(1);
    }
}
