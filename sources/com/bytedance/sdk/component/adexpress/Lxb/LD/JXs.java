package com.bytedance.sdk.component.adexpress.Lxb.LD;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.kqm;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends lk {
    private static volatile JXs LD;
    private static File Lxb;
    private AtomicBoolean lk = new AtomicBoolean(true);
    private AtomicBoolean ZU = new AtomicBoolean(false);
    private boolean JXs = false;
    private AtomicBoolean lc = new AtomicBoolean(false);
    private AtomicInteger ebl = new AtomicInteger(0);
    private AtomicLong OY = new AtomicLong();

    private JXs() {
        nBu();
    }

    private void JVA() {
        if (this.ebl.getAndSet(0) <= 0 || System.currentTimeMillis() - this.OY.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        ebl();
    }

    public static JXs LD() {
        if (LD == null) {
            synchronized (JXs.class) {
                try {
                    if (LD == null) {
                        LD = new JXs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    public static File OY() {
        if (Lxb == null) {
            try {
                File file = new File(new File(ZU.Lxb(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                Lxb = file;
            } catch (Throwable th) {
                sLN.Lxb("TemplateManager", "getTemplateDir error", th);
            }
        }
        return Lxb;
    }

    private void nBu() {
        com.bytedance.sdk.component.adexpress.ZU.ZU.LD(new com.bytedance.sdk.component.OY.OY("init") { // from class: com.bytedance.sdk.component.adexpress.Lxb.LD.JXs.1
            @Override // java.lang.Runnable
            public void run() {
                OY.Lxb();
                JXs.this.lk.set(false);
                JXs.this.ZU();
                JXs.this.ebl();
                if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk() == null || !kqm.Lxb(com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().LD())) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().lk().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Lxb.LD.JXs.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk() != null) {
                            com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().ZU();
                        }
                    }
                });
            }
        }, 10);
    }

    public boolean JXs() {
        return this.JXs;
    }

    public void QAg() {
        this.lc.set(true);
        this.JXs = false;
        this.ZU.set(false);
    }

    public void ZU() {
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbLD = OY.LD();
        if (lxbLD == null || !lxbLD.ebl()) {
            return;
        }
        boolean zLxb = Lxb(lxbLD);
        if (!zLxb) {
            OY.ZU();
        }
        this.JXs = zLxb;
    }

    public void ebl() {
        Lxb(false);
    }

    public com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lc() {
        return OY.LD();
    }

    public void lk() {
        nBu();
    }

    public boolean Lxb(com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb) {
        if (lxb == null) {
            return false;
        }
        return Lxb(lxb.Lxb()) || Lxb(lxb.JXs()) || Lxb(lxb.lc());
    }

    @Override // com.bytedance.sdk.component.adexpress.Lxb.LD.lk
    public File Lxb() {
        return OY();
    }

    public void Lxb(boolean z) {
        List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> listLxb;
        boolean z2;
        if (this.lk.get()) {
            return;
        }
        try {
            if (this.ZU.get()) {
                if (z) {
                    this.ebl.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.ZU.set(true);
            com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbJXs = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().JXs();
            com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbLD = OY.LD();
            if (lxbJXs != null && lxbJXs.ebl()) {
                if (!OY.LD(lxbJXs)) {
                    this.ZU.set(false);
                    this.OY.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk() != null) {
                    com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().lk().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Lxb.LD.JXs.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().LD();
                        }
                    });
                }
                OY.Lxb(lxbJXs);
                boolean zLxb = (lxbJXs.JXs() == null || TextUtils.isEmpty(lxbJXs.JXs().Lxb())) ? false : Lxb(lxbJXs.JXs().Lxb());
                if (lxbJXs.Lxb().size() != 0) {
                    listLxb = Lxb(lxbJXs, lxbLD);
                    z2 = listLxb != null;
                } else {
                    listLxb = null;
                    z2 = zLxb;
                }
                if (!zLxb) {
                    List<com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.C0054Lxb> listLD = LD(lxbJXs, lxbLD);
                    if (listLxb == null || listLD == null) {
                        listLxb = listLD;
                    } else {
                        listLxb.addAll(listLD);
                    }
                    if (listLD == null) {
                        z3 = false;
                    }
                    if (listLD == null) {
                        this.ZU.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && Lxb(lxbJXs)) {
                    OY.Lxb(lxbJXs);
                    OY.lk();
                    LD(listLxb);
                }
                ZU();
                this.ZU.set(false);
                this.OY.set(System.currentTimeMillis());
                JVA();
                return;
            }
            this.ZU.set(false);
            Lxb(109);
        } catch (Throwable unused) {
        }
    }

    public void LD(boolean z) {
        this.lc.set(z);
    }
}
