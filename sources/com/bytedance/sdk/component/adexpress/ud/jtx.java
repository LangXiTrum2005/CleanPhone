package com.bytedance.sdk.component.adexpress.ud;

import android.content.Context;
import android.view.View;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class jtx implements to {
    private jpc lnr;
    private exu mml;
    private AtomicBoolean mo = new AtomicBoolean(false);
    private ScheduledFuture<?> mzz;
    private Context qdl;
    private com.bytedance.sdk.component.adexpress.mzz.qdl ud;

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
                jtx.this.ud.qdl(true);
                jtx.this.qdl(this.qdl, 107, null);
            }
        }
    }

    public jtx(Context context, exu exuVar, com.bytedance.sdk.component.adexpress.mzz.qdl qdlVar, jpc jpcVar) {
        this.qdl = context;
        this.mml = exuVar;
        this.lnr = jpcVar;
        this.ud = qdlVar;
        qdlVar.qdl(this.lnr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr() {
        try {
            ScheduledFuture<?> scheduledFuture = this.mzz;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.mzz.cancel(false);
            this.mzz = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.mzz.qdl ud() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public boolean qdl(final to.qdl qdlVar) {
        int iMo = this.mml.mo();
        if (iMo < 0) {
            qdl(qdlVar, 107, "time is ".concat(String.valueOf(iMo)));
        } else {
            this.mzz = com.bytedance.sdk.component.adexpress.mml.mml.qdl(new qdl(1, qdlVar), iMo, TimeUnit.MILLISECONDS);
            this.ud.qdl(new wd() { // from class: com.bytedance.sdk.component.adexpress.ud.jtx.1
                @Override // com.bytedance.sdk.component.adexpress.ud.wd
                public void qdl(View view, rdp rdpVar) {
                    bjy bjyVarUd;
                    jtx.this.lnr();
                    if (qdlVar.lnr() || (bjyVarUd = qdlVar.ud()) == null) {
                        return;
                    }
                    bjyVarUd.qdl(jtx.this.ud, rdpVar);
                    qdlVar.qdl(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.ud.wd
                public void qdl(int i2, String str) {
                    jtx.this.qdl(qdlVar, i2, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public void qdl() {
        this.ud.mml();
        lnr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(to.qdl qdlVar, int i2, String str) {
        bjy bjyVarUd;
        if (qdlVar.lnr() || this.mo.get()) {
            return;
        }
        lnr();
        this.mml.mzz().qdl(i2, str);
        if (qdlVar.ud(this)) {
            qdlVar.qdl(this);
        } else {
            if (qdlVar.lnr() || (bjyVarUd = qdlVar.ud()) == null) {
                return;
            }
            qdlVar.qdl(true);
            bjyVarUd.a_(i2);
        }
        this.mo.getAndSet(true);
    }
}
