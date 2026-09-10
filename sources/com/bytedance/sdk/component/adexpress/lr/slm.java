package com.bytedance.sdk.component.adexpress.lr;

import android.content.Context;
import android.view.View;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class slm implements qt {
    private AtomicBoolean di = new AtomicBoolean(false);
    private ScheduledFuture<?> fi;
    private mj ik;
    private aw ka;
    private com.bytedance.sdk.component.adexpress.fi.ri lr;
    private Context ri;

    public class ri implements Runnable {
        private int ik;
        qt.ri ri;

        public ri(int i, qt.ri riVar) {
            this.ik = i;
            this.ri = riVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ik == 1) {
                slm.this.lr.ri(true);
                slm.this.ri(this.ri, 107, null);
            }
        }
    }

    public slm(Context context, aw awVar, com.bytedance.sdk.component.adexpress.fi.ri riVar, mj mjVar) {
        this.ri = context;
        this.ka = awVar;
        this.ik = mjVar;
        this.lr = riVar;
        riVar.ri(this.ik);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik() {
        try {
            ScheduledFuture<?> scheduledFuture = this.fi;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.fi.cancel(false);
            this.fi = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.fi.ri lr() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt
    public boolean ri(final qt.ri riVar) {
        int iDi = this.ka.di();
        if (iDi < 0) {
            ri(riVar, 107, "time is ".concat(String.valueOf(iDi)));
        } else {
            this.fi = com.bytedance.sdk.component.adexpress.ka.ka.ri(new ri(1, riVar), iDi, TimeUnit.MILLISECONDS);
            this.lr.ri(new xha() { // from class: com.bytedance.sdk.component.adexpress.lr.slm.1
                @Override // com.bytedance.sdk.component.adexpress.lr.xha
                public void ri(View view, bgr bgrVar) {
                    vr vrVarLr;
                    slm.this.ik();
                    if (riVar.ik() || (vrVarLr = riVar.lr()) == null) {
                        return;
                    }
                    vrVarLr.ri(slm.this.lr, bgrVar);
                    riVar.ri(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.lr.xha
                public void ri(int i, String str) {
                    slm.this.ri(riVar, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt
    public void ri() {
        this.lr.ka();
        ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(qt.ri riVar, int i, String str) {
        vr vrVarLr;
        if (riVar.ik() || this.di.get()) {
            return;
        }
        ik();
        this.ka.fi().ri(i, str);
        if (riVar.lr(this)) {
            riVar.ri(this);
        } else {
            if (riVar.ik() || (vrVarLr = riVar.lr()) == null) {
                return;
            }
            riVar.ri(true);
            vrVarLr.a_(i);
        }
        this.di.getAndSet(true);
    }
}
