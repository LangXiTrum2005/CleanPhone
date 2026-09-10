package com.bytedance.sdk.component.adexpress.dynamic.qdl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hzv;
import com.bytedance.sdk.component.adexpress.dynamic.mml.mo;
import com.bytedance.sdk.component.adexpress.lnr;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.ud.exu;
import com.bytedance.sdk.component.adexpress.ud.jpc;
import com.bytedance.sdk.component.adexpress.ud.mml;
import com.bytedance.sdk.component.adexpress.ud.rdp;
import com.bytedance.sdk.component.adexpress.ud.rq;
import com.bytedance.sdk.component.adexpress.ud.wd;
import com.bytedance.sdk.component.utils.tvp;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements mml<DynamicRootView>, rq {
    private AtomicBoolean jpc = new AtomicBoolean(false);
    private Context lnr;
    private wd mml;
    private exu mo;
    private jpc mzz;
    private DynamicRootView qdl;
    private com.bytedance.sdk.component.adexpress.dynamic.mzz.jpc ud;
    private ScheduledFuture<?> wd;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl$qdl, reason: collision with other inner class name */
    public class RunnableC0075qdl implements Runnable {
        private int ud;

        public RunnableC0075qdl(int i2) {
            this.ud = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ud == 2) {
                qdl.this.qdl.callBackRenderFail(qdl.this.ud instanceof com.bytedance.sdk.component.adexpress.dynamic.mzz.wd ? 127 : 117, null);
            }
        }
    }

    public qdl(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z2, com.bytedance.sdk.component.adexpress.dynamic.mzz.jpc jpcVar, exu exuVar, com.bytedance.sdk.component.adexpress.dynamic.mo.qdl qdlVar) {
        this.lnr = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z2, exuVar, qdlVar);
        this.qdl = dynamicRootView;
        this.ud = jpcVar;
        this.mo = exuVar;
        dynamicRootView.setRenderListener(this);
        this.mo = exuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpc() {
        try {
            ScheduledFuture<?> scheduledFuture = this.wd;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.wd.cancel(false);
            this.wd = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo() {
        this.mo.mzz().ud(lnr());
        JSONObject jSONObjectLnr = this.mo.lnr();
        if (com.bytedance.sdk.component.adexpress.qdl.ud.ud.qdl(jSONObjectLnr)) {
            this.ud.qdl(new com.bytedance.sdk.component.adexpress.dynamic.mo.ud() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.mo.ud
                public void qdl(final com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
                    qdl.this.jpc();
                    qdl.this.mo.mzz().lnr(qdl.this.lnr());
                    qdl.this.qdl(jpcVar);
                    qdl.this.ud(jpcVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        qdl.this.lnr(jpcVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                qdl.this.lnr(jpcVar);
                            }
                        });
                    }
                    if (qdl.this.qdl == null || jpcVar == null) {
                        return;
                    }
                    qdl.this.qdl.setBgColor(jpcVar.qdl());
                    qdl.this.qdl.setBgMaterialCenterCalcColor(jpcVar.ud());
                }
            });
            this.ud.qdl(this.mo);
            return;
        }
        int i2 = this.ud instanceof com.bytedance.sdk.component.adexpress.dynamic.mzz.wd ? 123 : 113;
        DynamicRootView dynamicRootView = this.qdl;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(jSONObjectLnr == null);
        dynamicRootView.callBackRenderFail(i2, sb.toString());
    }

    private boolean wd() {
        DynamicRootView dynamicRootView = this.qdl;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    public DynamicRootView mml() {
        return this.qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        float fWd;
        float fMo;
        List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> listRq;
        if (jpcVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> listRq2 = jpcVar.rq();
        if (listRq2 == null || listRq2.size() <= 0) {
            fWd = 0.0f;
        } else {
            fWd = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar2 : listRq2) {
                if (jpcVar2.wd() > jpcVar.wd() - jpcVar2.tvp() || (listRq = jpcVar2.rq()) == null || listRq.size() <= 0) {
                    fMo = 0.0f;
                } else {
                    fMo = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar3 : listRq) {
                        if (jpcVar3.to().ud().equals("logo-union")) {
                            fMo = jpcVar3.to().mo();
                            fWd = ((jpcVar.wd() + (-fMo)) - jpcVar2.wd()) + jpcVar2.to().mzz().xx();
                        }
                    }
                }
                ud(jpcVar2);
                if (fMo <= -15.0f) {
                    jpcVar2.mo(jpcVar2.tvp() - fMo);
                    jpcVar2.mml(jpcVar2.wd() + fMo);
                    for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar4 : jpcVar2.rq()) {
                        jpcVar4.mml(jpcVar4.wd() - fMo);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVarFs = jpcVar.fs();
        if (jpcVarFs == null) {
            return;
        }
        float fMo2 = jpcVar.mo() - jpcVarFs.mo();
        float fWd2 = jpcVar.wd() - jpcVarFs.wd();
        jpcVar.lnr(fMo2);
        jpcVar.mml(fWd2);
        if (fWd > 0.0f) {
            jpcVar.mml(jpcVar.wd() - fWd);
            jpcVar.mo(jpcVar.tvp() + fWd);
            for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar5 : jpcVar.rq()) {
                jpcVar5.mml(jpcVar5.wd() + fWd);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    public int lnr() {
        return this.ud instanceof com.bytedance.sdk.component.adexpress.dynamic.mzz.wd ? 3 : 2;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    public void qdl(wd wdVar) {
        this.mml = wdVar;
        int iMo = this.mo.mo();
        if (iMo < 0) {
            this.qdl.callBackRenderFail(this.ud instanceof com.bytedance.sdk.component.adexpress.dynamic.mzz.wd ? 127 : 117, "time is ".concat(String.valueOf(iMo)));
            return;
        }
        this.wd = com.bytedance.sdk.component.adexpress.mml.mml.qdl(new RunnableC0075qdl(2), iMo, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.mo.tvp() <= 0) {
            mo();
        } else {
            tvp.ud().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.mo();
                }
            }, this.mo.tvp());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        if (jpcVar == null) {
            this.qdl.callBackRenderFail(this.ud instanceof com.bytedance.sdk.component.adexpress.dynamic.mzz.wd ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.mo.mzz().mml(lnr());
        try {
            this.qdl.render(jpcVar, lnr());
        } catch (Exception e2) {
            int i2 = this.ud instanceof com.bytedance.sdk.component.adexpress.dynamic.mzz.wd ? 128 : 118;
            this.qdl.callBackRenderFail(i2, "exception is " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> listRq;
        if (jpcVar == null || (listRq = jpcVar.rq()) == null || listRq.size() <= 0) {
            return;
        }
        Collections.sort(listRq, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar2, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar3) {
                mo moVarMzz = jpcVar2.to().mzz();
                mo moVarMzz2 = jpcVar3.to().mzz();
                if (moVarMzz == null || moVarMzz2 == null) {
                    return 0;
                }
                return moVarMzz.ew() >= moVarMzz2.ew() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar2 : listRq) {
            if (jpcVar2 != null) {
                qdl(jpcVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public DynamicRootView mzz() {
        return mml();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void qdl(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i2 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                qdl(viewGroup.getChildAt(i2));
                i2++;
            }
        }
        if (view instanceof hzv) {
            ((hzv) view).ud();
        }
    }

    public void qdl(jpc jpcVar) {
        this.mzz = jpcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.rq
    public void qdl(rdp rdpVar) {
        if (this.jpc.get()) {
            return;
        }
        this.jpc.set(true);
        if (rdpVar.ud() && wd()) {
            this.qdl.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mml.qdl(mzz(), rdpVar);
            return;
        }
        this.mml.qdl(rdpVar.to(), rdpVar.tvp());
    }

    public void ud() {
        qdl(mzz());
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.rq
    public void qdl(View view, int i2, lnr lnrVar) {
        jpc jpcVar = this.mzz;
        if (jpcVar != null) {
            jpcVar.qdl(view, i2, lnrVar);
        }
    }
}
