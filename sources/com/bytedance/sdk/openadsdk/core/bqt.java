package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class bqt {
    public static ConcurrentHashMap<Integer, bqt> qdl = new ConcurrentHashMap<>();
    private int mml;
    private String mo;
    private int mzz;
    private String ud = "";
    private String lnr = "";

    private void mo() {
        this.ud = "";
        this.lnr = "";
        this.mml = 0;
        this.mzz = 0;
    }

    public String lnr() {
        return this.lnr;
    }

    public int mml() {
        return this.mml;
    }

    public int mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.mo;
    }

    public String ud() {
        return this.ud;
    }

    public static void lnr(int i2) {
        bqt bqtVar;
        if (i2 == 0) {
            return;
        }
        if (qdl == null) {
            qdl = new ConcurrentHashMap<>();
        }
        if (!qdl.containsKey(Integer.valueOf(i2)) || (bqtVar = qdl.get(Integer.valueOf(i2))) == null) {
            return;
        }
        bqtVar.ud(1);
    }

    public void qdl(int i2) {
        this.mml = i2;
    }

    public void ud(int i2) {
        this.mzz = i2;
    }

    public static void ud(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar == null || TextUtils.isEmpty(ljhVar.ir())) {
            return;
        }
        int iFz = ljhVar.fz();
        Integer numValueOf = Integer.valueOf(iFz);
        if (iFz == 0) {
            return;
        }
        if (qdl == null) {
            qdl = new ConcurrentHashMap<>();
        }
        bqt bqtVar = qdl.containsKey(numValueOf) ? qdl.get(numValueOf) : null;
        if (bqtVar == null) {
            bqtVar = new bqt();
        }
        String strCev = ljhVar.cev();
        if (TextUtils.isEmpty(strCev) || !strCev.equals(bqtVar.qdl())) {
            bqtVar.mo();
            bqtVar.qdl(ljhVar);
            qdl.put(numValueOf, bqtVar);
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar != null) {
            String strCev = ljhVar.cev();
            if (!TextUtils.isEmpty(strCev)) {
                this.mo = strCev;
            }
            String strOd = ljhVar.od();
            if (TextUtils.isEmpty(strOd) && ljhVar.uj()) {
                strOd = ljhVar.aoy().tvp();
            }
            if (!TextUtils.isEmpty(strOd)) {
                String[] strArrSplit = strOd.split("/");
                if (strArrSplit.length >= 3) {
                    this.ud = strArrSplit[2];
                }
            }
            if (ljhVar.fhs() == null || TextUtils.isEmpty(ljhVar.fhs().lnr())) {
                return;
            }
            this.lnr = ljhVar.fhs().lnr();
        }
    }

    public static void lnr(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        bqt bqtVar;
        if (ljhVar == null) {
            return;
        }
        int iFz = ljhVar.fz();
        Integer numValueOf = Integer.valueOf(iFz);
        if (iFz == 0) {
            return;
        }
        if (qdl == null) {
            qdl = new ConcurrentHashMap<>();
        }
        if (!qdl.containsKey(numValueOf) || (bqtVar = qdl.get(numValueOf)) == null) {
            return;
        }
        bqtVar.qdl(1);
    }
}
