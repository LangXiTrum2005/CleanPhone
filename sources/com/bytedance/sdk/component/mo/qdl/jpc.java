package com.bytedance.sdk.component.mo.qdl;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class jpc {
    private static jpc exu;
    private static volatile com.bytedance.sdk.component.mo.qdl.mzz.qdl to;
    private long bjy;
    private volatile Map<Integer, com.bytedance.sdk.component.mo.qdl.ud.lnr> fs;
    private volatile boolean jpc;
    private volatile com.bytedance.sdk.component.mo.qdl.mml.ud.qdl lnr;
    private volatile com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mml;
    private volatile com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mo;
    private volatile com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mzz;
    private volatile Context qdl;
    private final AtomicBoolean rdp = new AtomicBoolean(false);
    private volatile com.bytedance.sdk.component.mo.qdl.ud.lnr rq;
    private volatile mzz tvp;
    private volatile com.bytedance.sdk.component.mo.qdl.mml.ud.qdl ud;
    private volatile com.bytedance.sdk.component.mo.qdl.qdl.mzz wd;

    private jpc() {
    }

    public static com.bytedance.sdk.component.mo.qdl.mzz.qdl mzz() {
        if (to == null) {
            synchronized (jpc.class) {
                try {
                    if (to == null) {
                        to = new com.bytedance.sdk.component.mo.qdl.mzz.ud();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return to;
    }

    public static synchronized jpc wd() {
        try {
            if (exu == null) {
                exu = new jpc();
            }
        } catch (Throwable th) {
            throw th;
        }
        return exu;
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl bjy() {
        return this.mzz;
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl exu() {
        return this.lnr;
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl fs() {
        return this.ud;
    }

    public com.bytedance.sdk.component.mo.qdl.ud.lnr jpc() {
        return this.rq;
    }

    public mzz jtx() {
        return this.tvp;
    }

    public Map<Integer, com.bytedance.sdk.component.mo.qdl.ud.lnr> lnr() {
        return this.fs;
    }

    public com.bytedance.sdk.component.mo.qdl.qdl.mzz mml() {
        return this.wd;
    }

    public Context mo() {
        return this.qdl;
    }

    public boolean qdl() {
        return this.rdp.get();
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl rdp() {
        return this.mml;
    }

    public void rq() {
        com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.lnr();
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl to() {
        return this.mo;
    }

    public void tvp() {
        com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.ud();
    }

    public boolean ud() {
        return this.jpc;
    }

    public long yt() {
        return this.bjy * 86400000;
    }

    public void lnr(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        this.lnr = qdlVar;
    }

    public void mml(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        this.mml = qdlVar;
    }

    public void qdl(boolean z2) {
        this.rdp.set(z2);
    }

    public void ud(boolean z2) {
        this.jpc = z2;
    }

    public void qdl(com.bytedance.sdk.component.mo.qdl.qdl.mzz mzzVar) {
        this.wd = mzzVar;
    }

    public void ud(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        this.ud = qdlVar;
    }

    public void qdl(Context context) {
        this.qdl = context;
    }

    public void qdl(com.bytedance.sdk.component.mo.qdl.ud.lnr lnrVar) {
        this.rq = lnrVar;
    }

    public void qdl(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        this.mo = qdlVar;
    }

    public void mzz(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        this.mzz = qdlVar;
    }

    public void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        qdlVar.qdl(System.currentTimeMillis());
        com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.qdl(qdlVar, qdlVar.mml());
    }

    public void qdl(String str, boolean z2) {
        com.bytedance.sdk.component.mo.qdl.mo.qdl.qdl().qdl(str, z2);
    }

    public void qdl(String str, List<String> list, boolean z2, Map<String, String> map, int i2, String str2) {
        com.bytedance.sdk.component.mo.qdl.mo.qdl.qdl().qdl(str, list, z2, map, i2, str2);
    }

    public void qdl(mzz mzzVar) {
        this.tvp = mzzVar;
    }

    public void qdl(long j) {
        this.bjy = j;
    }
}
