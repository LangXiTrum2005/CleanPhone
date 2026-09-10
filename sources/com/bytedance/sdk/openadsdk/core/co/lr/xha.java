package com.bytedance.sdk.openadsdk.core.co.lr;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.bu;
import com.bytedance.sdk.component.adexpress.lr.aw;
import com.bytedance.sdk.component.adexpress.lr.bgr;
import com.bytedance.sdk.component.adexpress.lr.mj;
import com.bytedance.sdk.component.adexpress.lr.qt;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.jbs.vr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements qt {
    private vr di;
    private AtomicBoolean fi = new AtomicBoolean(false);
    private aw ik;
    private ScheduledFuture<?> ka;
    private com.bytedance.sdk.openadsdk.core.co.di.ka lr;
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
                xha.this.lr.ri(true);
                xha.this.ri(this.ri, 137, "real time out" + xha.this.ik.di());
            }
        }
    }

    public xha(Context context, com.bytedance.sdk.openadsdk.core.co.di.ka kaVar, mj mjVar, aw awVar) {
        this.ri = context;
        this.lr = kaVar;
        this.ik = awVar;
        this.lr.ri(mjVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt
    public void ri() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        try {
            ScheduledFuture<?> scheduledFuture = this.ka;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.ka.cancel(false);
            this.ka = null;
        } catch (Throwable th) {
            ac.ik("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }

    public void ri(vr vrVar) {
        this.di = vrVar;
        this.lr.ri(vrVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt
    public boolean ri(final qt.ri riVar) {
        int iDi = this.ik.di();
        if (iDi < 0) {
            ri(riVar, 137, "time is ".concat(String.valueOf(iDi)));
        } else {
            if (!(this.lr instanceof com.bytedance.sdk.openadsdk.core.co.di.ri.di)) {
                this.ka = dzy.ri().schedule(new ri(1, riVar), iDi, TimeUnit.MILLISECONDS);
            }
            this.lr.ri(new com.bytedance.sdk.component.adexpress.lr.xha() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.xha.1
                @Override // com.bytedance.sdk.component.adexpress.lr.xha
                public void ri(View view, bgr bgrVar) {
                    xha.this.lr();
                    if (riVar.ik()) {
                        return;
                    }
                    bu buVar = new bu();
                    buVar.ri(0);
                    if (xha.this.lr instanceof com.bytedance.sdk.openadsdk.core.co.di.ri.di) {
                        xha.this.ik.fi().di();
                    } else {
                        ((com.bytedance.sdk.openadsdk.core.co.di.ri) xha.this.ik).oh().ri(buVar);
                    }
                    xha.this.ik.fi().jbs();
                    com.bytedance.sdk.component.adexpress.lr.vr vrVarLr = riVar.lr();
                    if (vrVarLr == null) {
                        return;
                    }
                    vrVarLr.ri(xha.this.lr, bgrVar);
                    riVar.ri(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.lr.xha
                public void ri(int i, String str) {
                    xha.this.ri(riVar, i, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(qt.ri riVar, int i, String str) {
        com.bytedance.sdk.component.adexpress.lr.vr vrVarLr;
        if (riVar.ik() || this.fi.get()) {
            return;
        }
        lr();
        bu buVar = new bu();
        buVar.ri(i);
        buVar.ri(str);
        ((com.bytedance.sdk.openadsdk.core.co.di.ri) this.ik).oh().ri(buVar);
        if (riVar.lr(this)) {
            riVar.ri(this);
        } else {
            if (riVar.ik() || (vrVarLr = riVar.lr()) == null) {
                return;
            }
            riVar.ri(true);
            vrVarLr.a_(i);
        }
        this.fi.getAndSet(true);
    }
}
