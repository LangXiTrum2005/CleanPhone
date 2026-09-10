package com.bytedance.sdk.component.adexpress.LD;

import android.content.Context;
import android.view.View;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class VVE implements nBu {
    private ScheduledFuture<?> JXs;
    private com.bytedance.sdk.component.adexpress.JXs.Lxb LD;
    private Context Lxb;
    private NXR ZU;
    private AtomicBoolean lc = new AtomicBoolean(false);
    private OY lk;

    public class Lxb implements Runnable {
        nBu.Lxb Lxb;
        private int lk;

        public Lxb(int i, nBu.Lxb lxb) {
            this.lk = i;
            this.Lxb = lxb;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.lk == 1) {
                VVE.this.LD.Lxb(true);
                VVE.this.Lxb(this.Lxb, 107, null);
            }
        }
    }

    public VVE(Context context, NXR nxr, com.bytedance.sdk.component.adexpress.JXs.Lxb lxb, OY oy) {
        this.Lxb = context;
        this.ZU = nxr;
        this.lk = oy;
        this.LD = lxb;
        lxb.Lxb(this.lk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk() {
        try {
            ScheduledFuture<?> scheduledFuture = this.JXs;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.JXs.cancel(false);
            this.JXs = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.JXs.Lxb LD() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu
    public boolean Lxb(final nBu.Lxb lxb) {
        int iLc = this.ZU.lc();
        if (iLc < 0) {
            Lxb(lxb, 107, "time is ".concat(String.valueOf(iLc)));
        } else {
            this.JXs = com.bytedance.sdk.component.adexpress.ZU.ZU.Lxb(new Lxb(1, lxb), iLc, TimeUnit.MILLISECONDS);
            this.LD.Lxb(new ebl() { // from class: com.bytedance.sdk.component.adexpress.LD.VVE.1
                @Override // com.bytedance.sdk.component.adexpress.LD.ebl
                public void Lxb(View view, STP stp) {
                    IeN ieNLD;
                    VVE.this.lk();
                    if (lxb.lk() || (ieNLD = lxb.LD()) == null) {
                        return;
                    }
                    ieNLD.Lxb(VVE.this.LD, stp);
                    lxb.Lxb(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.LD.ebl
                public void Lxb(int i, String str) {
                    VVE.this.Lxb(lxb, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu
    public void Lxb() {
        this.LD.ZU();
        lk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(nBu.Lxb lxb, int i, String str) {
        IeN ieNLD;
        if (lxb.lk() || this.lc.get()) {
            return;
        }
        lk();
        this.ZU.JXs().Lxb(i, str);
        if (lxb.LD(this)) {
            lxb.Lxb(this);
        } else {
            if (lxb.lk() || (ieNLD = lxb.LD()) == null) {
                return;
            }
            lxb.Lxb(true);
            ieNLD.a_(i);
        }
        this.lc.getAndSet(true);
    }
}
