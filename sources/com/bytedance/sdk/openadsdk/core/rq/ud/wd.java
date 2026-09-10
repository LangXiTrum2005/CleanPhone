package com.bytedance.sdk.openadsdk.core.rq.ud;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.yt;
import com.bytedance.sdk.component.adexpress.ud.exu;
import com.bytedance.sdk.component.adexpress.ud.jpc;
import com.bytedance.sdk.component.adexpress.ud.rdp;
import com.bytedance.sdk.component.adexpress.ud.to;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.bjy;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class wd implements to {
    private exu lnr;
    private ScheduledFuture<?> mml;
    private bjy mo;
    private AtomicBoolean mzz = new AtomicBoolean(false);
    private Context qdl;
    private com.bytedance.sdk.openadsdk.core.rq.mo.mml ud;

    public class qdl implements Runnable {
        private int lnr;
        to.qdl qdl;

        public qdl(int i2, to.qdl qdlVar) {
            this.lnr = i2;
            this.qdl = qdlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.lnr == 1) {
                wd.this.ud.qdl(true);
                wd.this.qdl(this.qdl, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "real time out" + wd.this.lnr.mo());
            }
        }
    }

    public wd(Context context, com.bytedance.sdk.openadsdk.core.rq.mo.mml mmlVar, jpc jpcVar, exu exuVar) {
        this.qdl = context;
        this.ud = mmlVar;
        this.lnr = exuVar;
        this.ud.qdl(jpcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public void qdl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud() {
        try {
            ScheduledFuture<?> scheduledFuture = this.mml;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.mml.cancel(false);
            this.mml = null;
        } catch (Throwable th) {
            aaj.lnr("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }

    public void qdl(bjy bjyVar) {
        this.mo = bjyVar;
        this.ud.qdl(bjyVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public boolean qdl(final to.qdl qdlVar) {
        int iMo = this.lnr.mo();
        if (iMo < 0) {
            qdl(qdlVar, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "time is ".concat(String.valueOf(iMo)));
        } else {
            if (!(this.ud instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml)) {
                this.mml = fco.qdl().schedule(new qdl(1, qdlVar), iMo, TimeUnit.MILLISECONDS);
            }
            this.ud.qdl(new com.bytedance.sdk.component.adexpress.ud.wd() { // from class: com.bytedance.sdk.openadsdk.core.rq.ud.wd.1
                @Override // com.bytedance.sdk.component.adexpress.ud.wd
                public void qdl(View view, rdp rdpVar) {
                    wd.this.ud();
                    if (qdlVar.lnr()) {
                        return;
                    }
                    yt ytVar = new yt();
                    ytVar.qdl(0);
                    if (wd.this.ud instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml) {
                        wd.this.lnr.mzz().wd();
                    } else {
                        ((com.bytedance.sdk.openadsdk.core.rq.mo.qdl) wd.this.lnr).ekw().qdl(ytVar);
                    }
                    wd.this.lnr.mzz().to();
                    com.bytedance.sdk.component.adexpress.ud.bjy bjyVarUd = qdlVar.ud();
                    if (bjyVarUd == null) {
                        return;
                    }
                    bjyVarUd.qdl(wd.this.ud, rdpVar);
                    qdlVar.qdl(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.ud.wd
                public void qdl(int i2, String str) {
                    wd.this.qdl(qdlVar, i2, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(to.qdl qdlVar, int i2, String str) {
        com.bytedance.sdk.component.adexpress.ud.bjy bjyVarUd;
        if (qdlVar.lnr() || this.mzz.get()) {
            return;
        }
        ud();
        yt ytVar = new yt();
        ytVar.qdl(i2);
        ytVar.qdl(str);
        ((com.bytedance.sdk.openadsdk.core.rq.mo.qdl) this.lnr).ekw().qdl(ytVar);
        if (qdlVar.ud(this)) {
            qdlVar.qdl(this);
        } else {
            if (qdlVar.lnr() || (bjyVarUd = qdlVar.ud()) == null) {
                return;
            }
            qdlVar.qdl(true);
            bjyVarUd.a_(i2);
        }
        this.mzz.getAndSet(true);
    }
}
