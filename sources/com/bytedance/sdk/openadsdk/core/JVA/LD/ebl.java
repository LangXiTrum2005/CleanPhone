package com.bytedance.sdk.openadsdk.core.JVA.LD;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.LD.IeN;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.bytedance.sdk.component.adexpress.LD.OY;
import com.bytedance.sdk.component.adexpress.LD.STP;
import com.bytedance.sdk.component.adexpress.LD.nBu;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ebl implements nBu {
    private AtomicBoolean JXs = new AtomicBoolean(false);
    private com.bytedance.sdk.openadsdk.core.JVA.ZU.lk LD;
    private Context Lxb;
    private ScheduledFuture<?> ZU;
    private NXR lk;

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
                ebl.this.LD.Lxb(true);
                ebl.this.Lxb(this.Lxb, 137, "real time out" + ebl.this.lk.lc());
            }
        }
    }

    public ebl(Context context, com.bytedance.sdk.openadsdk.core.JVA.ZU.lk lkVar, OY oy, NXR nxr) {
        this.Lxb = context;
        this.LD = lkVar;
        this.lk = nxr;
        this.LD.Lxb(oy);
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu
    public void Lxb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD() {
        try {
            ScheduledFuture<?> scheduledFuture = this.ZU;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.ZU.cancel(false);
            this.ZU = null;
        } catch (Throwable th) {
            sLN.Lxb("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu
    public boolean Lxb(final nBu.Lxb lxb) {
        int iLc = this.lk.lc();
        if (iLc < 0) {
            Lxb(lxb, 137, "time is ".concat(String.valueOf(iLc)));
        } else {
            this.ZU = hg.Lxb().schedule(new Lxb(1, lxb), iLc, TimeUnit.MILLISECONDS);
            this.LD.Lxb(new com.bytedance.sdk.component.adexpress.LD.ebl() { // from class: com.bytedance.sdk.openadsdk.core.JVA.LD.ebl.1
                @Override // com.bytedance.sdk.component.adexpress.LD.ebl
                public void Lxb(View view, STP stp) {
                    ebl.this.LD();
                    if (lxb.lk()) {
                        return;
                    }
                    com.bytedance.adsdk.ugeno.core.STP stp2 = new com.bytedance.adsdk.ugeno.core.STP();
                    stp2.Lxb(0);
                    ((com.bytedance.sdk.openadsdk.core.JVA.ZU.Lxb) ebl.this.lk).Ivz().Lxb(stp2);
                    ebl.this.lk.JXs().nBu();
                    IeN ieNLD = lxb.LD();
                    if (ieNLD == null) {
                        return;
                    }
                    ieNLD.Lxb(ebl.this.LD, stp);
                    lxb.Lxb(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.LD.ebl
                public void Lxb(int i, String str) {
                    ebl.this.Lxb(lxb, i, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(nBu.Lxb lxb, int i, String str) {
        IeN ieNLD;
        if (lxb.lk() || this.JXs.get()) {
            return;
        }
        LD();
        com.bytedance.adsdk.ugeno.core.STP stp = new com.bytedance.adsdk.ugeno.core.STP();
        stp.Lxb(i);
        stp.Lxb(str);
        ((com.bytedance.sdk.openadsdk.core.JVA.ZU.Lxb) this.lk).Ivz().Lxb(stp);
        if (lxb.LD(this)) {
            lxb.Lxb(this);
        } else {
            if (lxb.lk() || (ieNLD = lxb.LD()) == null) {
                return;
            }
            lxb.Lxb(true);
            ieNLD.a_(i);
        }
        this.JXs.getAndSet(true);
    }
}
