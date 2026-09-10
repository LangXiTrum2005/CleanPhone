package com.bytedance.sdk.component.adexpress.ri.lr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.X3;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends ik {
    private static volatile fi lr;
    private static File ri;
    private AtomicBoolean ik = new AtomicBoolean(true);
    private AtomicBoolean ka = new AtomicBoolean(false);
    private boolean fi = false;
    private AtomicBoolean di = new AtomicBoolean(false);
    private AtomicInteger xha = new AtomicInteger(0);
    private AtomicLong mj = new AtomicLong();

    private fi() {
        jbs();
    }

    private void jbs() {
        com.bytedance.sdk.component.adexpress.ka.ka.lr(new com.bytedance.sdk.component.mj.lr.ik(X3.a.f) { // from class: com.bytedance.sdk.component.adexpress.ri.lr.fi.1
            @Override // java.lang.Runnable
            public void run() {
                mj.ri();
                fi.this.ik.set(false);
                fi.this.ka();
                fi.this.xha();
                if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik() == null || !ihz.ri(com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().lr()) || com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().ka();
            }
        }, 10);
    }

    public static fi lr() {
        if (lr == null) {
            synchronized (fi.class) {
                try {
                    if (lr == null) {
                        lr = new fi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public static File mj() {
        if (ri == null) {
            try {
                File fileRi = ka.ri();
                Context contextLr = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().lr();
                File file = new File(contextLr != null ? com.bytedance.sdk.component.utils.xha.ri(contextLr, "tt_tmpl_pkg") : new File(fileRi, "tt_tmpl_pkg"), "template");
                file.mkdirs();
                ri = file;
            } catch (Throwable unused) {
            }
        }
        return ri;
    }

    private void qt() {
        if (this.xha.getAndSet(0) <= 0 || System.currentTimeMillis() - this.mj.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        xha();
    }

    public com.bytedance.sdk.component.adexpress.ri.ik.ri di() {
        return mj.lr();
    }

    public boolean fi() {
        return this.fi;
    }

    public void ik() {
        jbs();
    }

    public void ka() {
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarLr = mj.lr();
        if (riVarLr == null || !riVarLr.mj()) {
            return;
        }
        boolean zRi = ri(riVarLr);
        if (!zRi) {
            mj.ka();
        }
        this.fi = zRi;
    }

    public void xha() {
        ri(false);
    }

    public boolean ri(com.bytedance.sdk.component.adexpress.ri.ik.ri riVar) {
        if (riVar == null) {
            return false;
        }
        return ri(riVar.ri()) || ri(riVar.fi()) || ri(riVar.di());
    }

    @Override // com.bytedance.sdk.component.adexpress.ri.lr.ik
    public File ri() {
        return mj();
    }

    public void ri(boolean z) {
        List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> listRi;
        boolean z2;
        if (this.ik.get()) {
            return;
        }
        try {
            if (this.ka.get()) {
                if (z) {
                    this.xha.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.ka.set(true);
            com.bytedance.sdk.component.adexpress.ri.ik.ri riVarFi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().fi();
            com.bytedance.sdk.component.adexpress.ri.ik.ri riVarLr = mj.lr();
            if (riVarFi != null && riVarFi.mj()) {
                if (!mj.lr(riVarFi)) {
                    this.ka.set(false);
                    this.mj.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik() != null) {
                    com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().ik().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ri.lr.fi.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.fi.fi.ri().lr();
                        }
                    });
                }
                mj.ri(riVarFi);
                boolean zRi = (riVarFi.fi() == null || TextUtils.isEmpty(riVarFi.fi().ri())) ? false : ri(riVarFi.fi().ri());
                if (riVarFi.ri().size() != 0) {
                    listRi = ri(riVarFi, riVarLr);
                    z2 = listRi != null;
                } else {
                    listRi = null;
                    z2 = zRi;
                }
                if (!zRi) {
                    List<com.bytedance.sdk.component.adexpress.ri.ik.ri.C0207ri> listLr = lr(riVarFi, riVarLr);
                    if (listRi == null || listLr == null) {
                        listRi = listLr;
                    } else {
                        listRi.addAll(listLr);
                    }
                    if (listLr == null) {
                        z3 = false;
                    }
                    if (listLr == null) {
                        this.ka.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && ri(riVarFi)) {
                    mj.ri(riVarFi);
                    mj.ik();
                    lr(listRi);
                }
                ka();
                this.ka.set(false);
                this.mj.set(System.currentTimeMillis());
                qt();
                return;
            }
            this.ka.set(false);
            ri(109);
        } catch (Throwable unused) {
        }
    }
}
