package com.bytedance.sdk.component.adexpress.dynamic.ri;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy;
import com.bytedance.sdk.component.adexpress.dynamic.ka.di;
import com.bytedance.sdk.component.adexpress.ik;
import com.bytedance.sdk.component.adexpress.lr.aw;
import com.bytedance.sdk.component.adexpress.lr.bgr;
import com.bytedance.sdk.component.adexpress.lr.ka;
import com.bytedance.sdk.component.adexpress.lr.mj;
import com.bytedance.sdk.component.adexpress.lr.sf;
import com.bytedance.sdk.component.adexpress.lr.xha;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.jbs;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements ka<DynamicRootView>, sf {
    private aw di;
    private mj fi;
    private Context ik;
    private xha ka;
    private com.bytedance.sdk.component.adexpress.dynamic.fi.mj lr;
    private AtomicBoolean mj = new AtomicBoolean(false);
    private DynamicRootView ri;
    private ScheduledFuture<?> xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ri.ri$ri, reason: collision with other inner class name */
    public class RunnableC0206ri implements Runnable {
        private int lr;

        public RunnableC0206ri(int i) {
            this.lr = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.lr == 2) {
                ri.this.ri.callBackRenderFail(ri.this.lr instanceof com.bytedance.sdk.component.adexpress.dynamic.fi.xha ? 127 : 117, null);
            }
        }
    }

    public ri(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.fi.mj mjVar, aw awVar, com.bytedance.sdk.component.adexpress.dynamic.di.ri riVar) {
        this.ik = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, awVar, riVar);
        this.ri = dynamicRootView;
        this.lr = mjVar;
        this.di = awVar;
        dynamicRootView.setRenderListener(this);
        this.di = awVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void di() {
        this.di.fi().lr(ik());
        JSONObject jSONObjectIk = this.di.ik();
        if (com.bytedance.sdk.component.adexpress.ri.lr.lr.ri(jSONObjectIk)) {
            this.lr.ri(new com.bytedance.sdk.component.adexpress.dynamic.di.lr() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ri.ri.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.di.lr
                public void ri(final com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
                    ri.this.mj();
                    ri.this.di.fi().ik(ri.this.ik());
                    ri.this.ri(mjVar);
                    ri.this.lr(mjVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        ri.this.ik(mjVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ri.ri.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ri.this.ik(mjVar);
                            }
                        });
                    }
                    if (ri.this.ri == null || mjVar == null) {
                        return;
                    }
                    ri.this.ri.setBgColor(mjVar.ri());
                    ri.this.ri.setBgMaterialCenterCalcColor(mjVar.lr());
                }
            });
            this.lr.ri(this.di);
            return;
        }
        int i = this.lr instanceof com.bytedance.sdk.component.adexpress.dynamic.fi.xha ? 123 : 113;
        DynamicRootView dynamicRootView = this.ri;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(jSONObjectIk == null);
        dynamicRootView.callBackRenderFail(i, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mj() {
        try {
            ScheduledFuture<?> scheduledFuture = this.xha;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.xha.cancel(false);
            this.xha = null;
        } catch (Throwable unused) {
        }
    }

    private boolean xha() {
        DynamicRootView dynamicRootView = this.ri;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    public DynamicRootView ka() {
        return this.ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        float fXha;
        float fDi;
        List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> listSf;
        if (mjVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> listSf2 = mjVar.sf();
        if (listSf2 == null || listSf2.size() <= 0) {
            fXha = 0.0f;
        } else {
            fXha = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar2 : listSf2) {
                if (mjVar2.xha() > mjVar.xha() - mjVar2.jbs() || (listSf = mjVar2.sf()) == null || listSf.size() <= 0) {
                    fDi = 0.0f;
                } else {
                    fDi = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar3 : listSf) {
                        if (mjVar3.qt().lr().equals("logo-union")) {
                            fDi = mjVar3.qt().di();
                            fXha = (((-fDi) + mjVar.xha()) - mjVar2.xha()) + mjVar2.qt().fi().zxp();
                        }
                    }
                }
                lr(mjVar2);
                if (fDi <= -15.0f) {
                    mjVar2.di(mjVar2.jbs() - fDi);
                    mjVar2.ka(mjVar2.xha() + fDi);
                    for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar4 : mjVar2.sf()) {
                        mjVar4.ka(mjVar4.xha() - fDi);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVarCo = mjVar.co();
        if (mjVarCo == null) {
            return;
        }
        float fDi2 = mjVar.di() - mjVarCo.di();
        float fXha2 = mjVar.xha() - mjVarCo.xha();
        mjVar.ik(fDi2);
        mjVar.ka(fXha2);
        if (fXha > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            mjVar.ka(mjVar.xha() - fXha);
            mjVar.di(mjVar.jbs() + fXha);
            for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar5 : mjVar.sf()) {
                mjVar5.ka(mjVar5.xha() + fXha);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    public int ik() {
        return this.lr instanceof com.bytedance.sdk.component.adexpress.dynamic.fi.xha ? 3 : 2;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    public void ri(xha xhaVar) {
        this.ka = xhaVar;
        int iDi = this.di.di();
        if (iDi < 0) {
            this.ri.callBackRenderFail(this.lr instanceof com.bytedance.sdk.component.adexpress.dynamic.fi.xha ? 127 : 117, "time is ".concat(String.valueOf(iDi)));
            return;
        }
        this.xha = com.bytedance.sdk.component.adexpress.ka.ka.ri(new RunnableC0206ri(2), iDi, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.di.jbs() <= 0) {
            di();
        } else {
            jbs.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.this.di();
                }
            }, this.di.jbs());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        if (mjVar == null) {
            this.ri.callBackRenderFail(this.lr instanceof com.bytedance.sdk.component.adexpress.dynamic.fi.xha ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.di.fi().ka(ik());
        try {
            this.ri.render(mjVar, ik());
        } catch (Exception e) {
            int i = this.lr instanceof com.bytedance.sdk.component.adexpress.dynamic.fi.xha ? 128 : 118;
            this.ri.callBackRenderFail(i, "exception is " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> listSf;
        if (mjVar == null || (listSf = mjVar.sf()) == null || listSf.size() <= 0) {
            return;
        }
        Collections.sort(listSf, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.ka.mj>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ri.ri.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar2, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar3) {
                di diVarFi = mjVar2.qt().fi();
                di diVarFi2 = mjVar3.qt().fi();
                if (diVarFi == null || diVarFi2 == null) {
                    return 0;
                }
                return diVarFi.nh() >= diVarFi2.nh() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar2 : listSf) {
            if (mjVar2 != null) {
                ri(mjVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public DynamicRootView fi() {
        return ka();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ri(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                ri(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof dzy) {
            ((dzy) view).lr();
        }
    }

    public void ri(mj mjVar) {
        this.fi = mjVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.sf
    public void ri(bgr bgrVar) {
        if (this.mj.get()) {
            return;
        }
        this.mj.set(true);
        if (bgrVar.lr() && xha()) {
            this.ri.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.ka.ri(fi(), bgrVar);
            return;
        }
        this.ka.ri(bgrVar.qt(), bgrVar.jbs());
    }

    public void lr() {
        ri(fi());
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.sf
    public void ri(View view, int i, ik ikVar) {
        mj mjVar = this.fi;
        if (mjVar != null) {
            mjVar.ri(view, i, ikVar);
        }
    }
}
