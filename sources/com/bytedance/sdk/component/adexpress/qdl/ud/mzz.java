package com.bytedance.sdk.component.adexpress.qdl.ud;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jyq;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.p004ironsource.d9;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends lnr {
    private static File qdl;
    private static volatile mzz ud;
    private AtomicBoolean lnr = new AtomicBoolean(true);
    private AtomicBoolean mml = new AtomicBoolean(false);
    private boolean mzz = false;
    private AtomicBoolean mo = new AtomicBoolean(false);
    private AtomicInteger wd = new AtomicInteger(0);
    private AtomicLong jpc = new AtomicLong();

    private mzz() {
        to();
    }

    public static File jpc() {
        if (qdl == null) {
            try {
                File file = new File(new File(mml.qdl(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                qdl = file;
            } catch (Throwable unused) {
            }
        }
        return qdl;
    }

    private void rq() {
        if (this.wd.getAndSet(0) <= 0 || System.currentTimeMillis() - this.jpc.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        wd();
    }

    private void to() {
        com.bytedance.sdk.component.adexpress.mml.mml.ud(new com.bytedance.sdk.component.jpc.jpc(d9.a.f) { // from class: com.bytedance.sdk.component.adexpress.qdl.ud.mzz.1
            @Override // java.lang.Runnable
            public void run() {
                jpc.qdl();
                mzz.this.lnr.set(false);
                mzz.this.mml();
                mzz.this.wd();
                if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr() == null || !jyq.qdl(com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().ud()) || com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().mml();
            }
        }, 10);
    }

    public static mzz ud() {
        if (ud == null) {
            synchronized (mzz.class) {
                try {
                    if (ud == null) {
                        ud = new mzz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ud;
    }

    public void lnr() {
        to();
    }

    public void mml() {
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarUd = jpc.ud();
        if (qdlVarUd == null || !qdlVarUd.jpc()) {
            return;
        }
        boolean zQdl = qdl(qdlVarUd);
        if (!zQdl) {
            jpc.mml();
        }
        this.mzz = zQdl;
    }

    public com.bytedance.sdk.component.adexpress.qdl.lnr.qdl mo() {
        return jpc.ud();
    }

    public boolean mzz() {
        return this.mzz;
    }

    public void tvp() {
        this.mo.set(true);
        this.mzz = false;
        this.mml.set(false);
    }

    public void wd() {
        qdl(false);
    }

    public boolean qdl(com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar) {
        if (qdlVar == null) {
            return false;
        }
        return qdl(qdlVar.qdl()) || qdl(qdlVar.mzz()) || qdl(qdlVar.mo());
    }

    @Override // com.bytedance.sdk.component.adexpress.qdl.ud.lnr
    public File qdl() {
        return jpc();
    }

    public void qdl(boolean z2) {
        List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> listQdl;
        boolean z3;
        if (this.lnr.get()) {
            return;
        }
        try {
            if (this.mml.get()) {
                if (z2) {
                    this.wd.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z4 = true;
            this.mml.set(true);
            com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarMzz = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().mzz();
            com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarUd = jpc.ud();
            if (qdlVarMzz != null && qdlVarMzz.jpc()) {
                if (!jpc.ud(qdlVarMzz)) {
                    this.mml.set(false);
                    this.jpc.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr() != null) {
                    com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().lnr().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.qdl.ud.mzz.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().ud();
                        }
                    });
                }
                jpc.qdl(qdlVarMzz);
                boolean zQdl = (qdlVarMzz.mzz() == null || TextUtils.isEmpty(qdlVarMzz.mzz().qdl())) ? false : qdl(qdlVarMzz.mzz().qdl());
                if (qdlVarMzz.qdl().size() != 0) {
                    listQdl = qdl(qdlVarMzz, qdlVarUd);
                    z3 = listQdl != null;
                } else {
                    listQdl = null;
                    z3 = zQdl;
                }
                if (!zQdl) {
                    List<com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.C0081qdl> listUd = ud(qdlVarMzz, qdlVarUd);
                    if (listQdl == null || listUd == null) {
                        listQdl = listUd;
                    } else {
                        listQdl.addAll(listUd);
                    }
                    if (listUd == null) {
                        z4 = false;
                    }
                    if (listUd == null) {
                        this.mml.set(false);
                    }
                    z3 = z4;
                }
                if (z3 && qdl(qdlVarMzz)) {
                    jpc.qdl(qdlVarMzz);
                    jpc.lnr();
                    ud(listQdl);
                }
                mml();
                this.mml.set(false);
                this.jpc.set(System.currentTimeMillis());
                rq();
                return;
            }
            this.mml.set(false);
            qdl(109);
        } catch (Throwable unused) {
        }
    }

    public void ud(boolean z2) {
        this.mo.set(z2);
    }
}
