package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class zf {
    public static ConcurrentHashMap<Integer, zf> ri = new ConcurrentHashMap<>();
    private String di;
    private int fi;
    private int ka;
    private String lr = "";
    private String ik = "";

    private void di() {
        this.lr = "";
        this.ik = "";
        this.ka = 0;
        this.fi = 0;
    }

    public int fi() {
        return this.fi;
    }

    public String ik() {
        return this.ik;
    }

    public int ka() {
        return this.ka;
    }

    public String lr() {
        return this.lr;
    }

    public String ri() {
        return this.di;
    }

    public static void ik(int i) {
        zf zfVar;
        if (i == 0) {
            return;
        }
        if (ri == null) {
            ri = new ConcurrentHashMap<>();
        }
        if (!ri.containsKey(Integer.valueOf(i)) || (zfVar = ri.get(Integer.valueOf(i))) == null) {
            return;
        }
        zfVar.lr(1);
    }

    public void lr(int i) {
        this.fi = i;
    }

    public void ri(int i) {
        this.ka = i;
    }

    public static void lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null || TextUtils.isEmpty(wjvVar.yjg())) {
            return;
        }
        int iUr = wjvVar.ur();
        Integer numValueOf = Integer.valueOf(iUr);
        if (iUr == 0) {
            return;
        }
        if (ri == null) {
            ri = new ConcurrentHashMap<>();
        }
        zf zfVar = ri.containsKey(numValueOf) ? ri.get(numValueOf) : null;
        if (zfVar == null) {
            zfVar = new zf();
        }
        String strJf = wjvVar.jf();
        if (TextUtils.isEmpty(strJf) || !strJf.equals(zfVar.ri())) {
            zfVar.di();
            zfVar.ri(wjvVar);
            ri.put(numValueOf, zfVar);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar != null) {
            String strJf = wjvVar.jf();
            if (!TextUtils.isEmpty(strJf)) {
                this.di = strJf;
            }
            String strSmj = wjvVar.smj();
            if (TextUtils.isEmpty(strSmj) && wjvVar.zz()) {
                strSmj = wjvVar.sr().jbs();
            }
            if (!TextUtils.isEmpty(strSmj)) {
                String[] strArrSplit = strSmj.split("/");
                if (strArrSplit.length >= 3) {
                    this.lr = strArrSplit[2];
                }
            }
            if (wjvVar.tyz() == null || TextUtils.isEmpty(wjvVar.tyz().ik())) {
                return;
            }
            this.ik = wjvVar.tyz().ik();
        }
    }

    public static void ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        zf zfVar;
        if (wjvVar == null) {
            return;
        }
        int iUr = wjvVar.ur();
        Integer numValueOf = Integer.valueOf(iUr);
        if (iUr == 0) {
            return;
        }
        if (ri == null) {
            ri = new ConcurrentHashMap<>();
        }
        if (!ri.containsKey(numValueOf) || (zfVar = ri.get(numValueOf)) == null) {
            return;
        }
        zfVar.ri(1);
    }
}
