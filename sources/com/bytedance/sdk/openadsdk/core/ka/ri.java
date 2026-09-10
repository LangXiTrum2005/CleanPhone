package com.bytedance.sdk.openadsdk.core.ka;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.srn;
import com.bytedance.sdk.openadsdk.utils.su;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private boolean bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private xha f18130co;
    private final Context di;
    private PAGBannerAdWrapperListener fi;
    private boolean jbs;
    private wjv ka;
    protected AdSlot lr;
    private final boolean mj;
    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik qt;
    protected ka ri;
    private ac sf;
    private long tan;
    private String ik = "banner_ad";
    private long xha = 0;
    private final AtomicBoolean aw = new AtomicBoolean(false);
    private final int vr = 1;
    private final int slm = 0;
    private int bu = -1;
    private final View.OnAttachStateChangeListener nr = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (ri.this.bu == 0 || ri.this.jbs) {
                return;
            }
            ri riVar = ri.this;
            riVar.ri(riVar.ri.getCurView(), ri.this.ka);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (ri.this.bgr) {
                ri.this.bu = 0;
            } else {
                ri.this.di();
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.ri$ri, reason: collision with other inner class name */
    public static class C0254ri extends com.bytedance.sdk.component.mj.lr.ik {
        WeakReference<ri> ik;
        wjv lr;
        boolean ri;

        public C0254ri(boolean z, wjv wjvVar, ri riVar) {
            super("ReportWindowFocusChangedAdShow");
            this.ri = z;
            this.lr = wjvVar;
            this.ik = new WeakReference<>(riVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<ri> weakReference = this.ik;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.ik.get().lr(this.ri, this.lr);
        }
    }

    public ri(Context context, wjv wjvVar, AdSlot adSlot, xha xhaVar, boolean z) {
        this.bgr = false;
        this.di = context;
        this.ka = wjvVar;
        this.lr = adSlot;
        this.f18130co = xhaVar;
        this.bgr = z;
        ri(context, wjvVar, adSlot);
        this.mj = false;
        this.jbs = false;
    }

    private void co() {
        this.ka.ri(SystemClock.elapsedRealtime());
        this.ri.fi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qt() {
        co();
    }

    private xha.ri sf() {
        return new xha.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.7
            @Override // com.bytedance.sdk.openadsdk.core.ka.xha.ri
            public void ri() {
                int width = ri.this.sf.getWidth();
                int height = ri.this.sf.getHeight();
                View viewRi = ri(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                ri.this.sf.uq();
                ri.this.sf.removeAllViews();
                ri.this.sf.addView(viewRi, new ViewGroup.LayoutParams(width, height));
                ri.this.sf.setClickCreativeListener(null);
                ri.this.sf.setClickListener(null);
                if (ri.this.fi != null) {
                    ri.this.fi.onAdDismissed();
                }
                ri.this.jbs = true;
            }

            private View ri(boolean z) {
                com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(ri.this.di);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                ikVar.setBackgroundColor(-1);
                ikVar.setLayoutParams(layoutParams);
                View view = new View(ri.this.di);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                ikVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.di.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(ri.this.di);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z) {
                    ikVar2.setBackground(uq.ik(ri.this.di, "tt_ad_closed_background_300_250"));
                } else {
                    ikVar2.setBackground(uq.ik(ri.this.di, "tt_ad_closed_background_320_50"));
                }
                ikVar.addView(ikVar2, layoutParams3);
                PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(ri.this.di, ri.this.ka);
                pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z) {
                    int iLr = qd.lr(ri.this.di, 16.0f);
                    layoutParams4.width = qd.lr(ri.this.di, 77.0f);
                    layoutParams4.height = qd.lr(ri.this.di, 14.0f);
                    layoutParams4.leftMargin = iLr;
                    layoutParams4.topMargin = iLr;
                } else {
                    int iLr2 = qd.lr(ri.this.di, 8.0f);
                    layoutParams4.width = qd.lr(ri.this.di, 45.0f);
                    layoutParams4.height = qd.lr(ri.this.di, 8.18f);
                    layoutParams4.leftMargin = iLr2;
                    layoutParams4.topMargin = iLr2;
                }
                ikVar2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(ri.this.di);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                mjVar.setAlpha(0.5f);
                mjVar.setLines(1);
                mjVar.setText(uq.ri(ri.this.di, "tt_ad_is_closed"));
                if (z) {
                    mjVar.setTextSize(18.0f);
                } else {
                    mjVar.setTextSize(12.0f);
                }
                ikVar2.addView(mjVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.ri(ri.this.di, ri.this.ka, ri.this.ik);
                    }
                };
                pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                mjVar.setOnClickListener(onClickListener);
                return ikVar;
            }
        };
    }

    public void di() {
        this.bu = 1;
        this.ri.ka();
    }

    public void fi() {
        this.xha = System.currentTimeMillis();
    }

    public com.bytedance.sdk.openadsdk.tan.ik.ri ik() {
        ka kaVar = this.ri;
        if (kaVar instanceof ik) {
            return ((ik) kaVar).getVideoModel();
        }
        return null;
    }

    public void jbs() {
        ka kaVar = this.ri;
        if (kaVar instanceof ik) {
            ((ik) kaVar).ri();
        }
    }

    public void ka() {
        lr(this.ka);
        this.xha = 0L;
    }

    public void mj() {
        ka kaVar = this.ri;
        if (kaVar instanceof ik) {
            ((ik) kaVar).lr();
        }
    }

    public void xha() {
        if (this.ri != null) {
            try {
                di();
                this.ri.removeOnAttachStateChangeListener(this.nr);
            } catch (Throwable unused) {
            }
        }
    }

    public boolean lr() {
        return this.ri instanceof ik;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(boolean z, wjv wjvVar) {
        try {
            if (z) {
                this.xha = System.currentTimeMillis();
            } else {
                if (this.xha <= 0 || this.sf == null) {
                    return;
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.xha);
                this.xha = 0L;
                com.bytedance.sdk.openadsdk.ka.ik.ri(strValueOf, wjvVar, this.ik, this.sf.getAdShowTime());
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik("PAGBannerAdImpl", e.getMessage());
        }
    }

    public void ri(int i) {
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.setCurrentIndex(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(wjv wjvVar) {
        if (this.xha <= 0 || wjvVar == null) {
            return;
        }
        try {
            if (this.sf != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.xha);
                this.xha = 0L;
                com.bytedance.sdk.openadsdk.ka.ik.ri(strValueOf, wjvVar, this.ik, this.sf.getAdShowTime());
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik("PAGBannerAdImpl", e.getMessage());
        }
    }

    public void ri(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        mj mjVar = new mj(pAGBannerAdInteractionCallback);
        this.fi = mjVar;
        this.ri.setExpressInteractionListener(mjVar);
    }

    public void ri(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        mj mjVar = new mj(pAGBannerAdInteractionListener);
        this.fi = mjVar;
        this.ri.setExpressInteractionListener(mjVar);
    }

    public View ri() {
        com.bytedance.sdk.openadsdk.utils.lr.ri(this.ka);
        IPBroadcastReceiver.lr(this.di, this.ka);
        return this.ri;
    }

    private void ri(Context context, wjv wjvVar, AdSlot adSlot) {
        if (wjvVar.eu() != null) {
            ik ikVar = new ik(context, wjvVar, adSlot, this.bgr);
            this.ri = ikVar;
            ikVar.addOnAttachStateChangeListener(this.nr);
        } else {
            ka kaVar = new ka(context, wjvVar, adSlot, this.bgr);
            this.ri = kaVar;
            kaVar.addOnAttachStateChangeListener(this.nr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(boolean z, wjv wjvVar) {
        if (z && this.ka.nhl() && !this.ka.igq()) {
            this.ka.xha(true);
            wjv wjvVar2 = this.ka;
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar2, this.ik, wjvVar2.wzv());
        }
        dzy.lr(new C0254ri(z, wjvVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(View view, ac acVar, wjv wjvVar, String str, xha.ri riVar) {
        qt.lr().ri(str, riVar);
        this.xha = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (acVar != null) {
                jSONObject.put("dynamic_show_type", acVar.getDynamicShowType());
                acVar.ri(jSONObject, wjvVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, this.ik, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.ay.ri.ik.ri(wjvVar);
        } catch (JSONException unused2) {
            com.bytedance.sdk.component.utils.ac.ik("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.fi;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, wjvVar.adz());
        }
        if (wjvVar.du()) {
            ig.ri(wjvVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ri(wjv wjvVar) {
        if (wjvVar.adz() == 4) {
            return com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this.di, this.ik);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final ac acVar, final wjv wjvVar) {
        ri riVar;
        wjv wjvVar2;
        final ac acVar2;
        com.bytedance.sdk.openadsdk.core.mj mjVar;
        if (acVar == null || wjvVar == null) {
            return;
        }
        this.ka = wjvVar;
        this.qt = ri(wjvVar);
        this.sf = acVar;
        final String strRi = su.ri();
        final xha.ri riVarSf = sf();
        acVar.setClosedListenerKey(strRi);
        acVar.setBannerClickClosedListener(riVarSf);
        acVar.setBackupListener(new com.bytedance.sdk.component.adexpress.lr.ik() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.2
            @Override // com.bytedance.sdk.component.adexpress.lr.ik
            public boolean ri(ViewGroup viewGroup, int i) {
                try {
                    acVar.ac();
                    if (!ri.this.ka.zz()) {
                        lr lrVar = new lr(acVar.getContext());
                        lrVar.setClosedListenerKey(strRi);
                        lrVar.ri(ri.this.ka, acVar, ri.this.qt);
                        lrVar.setAdInteractionListener(ri.this.fi);
                        return true;
                    }
                    jbs jbsVar = new jbs(acVar.getContext());
                    jbsVar.setClosedListenerKey(strRi);
                    jbsVar.ri(ri.this.ka, acVar, ri.this.qt);
                    jbsVar.setAdInteractionListener(ri.this.fi);
                    acVar.setVastVideoHelper(jbsVar);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.mj) {
            com.bytedance.sdk.openadsdk.core.mj mjVarRi = ri(acVar);
            if (mjVarRi == null) {
                mjVarRi = new com.bytedance.sdk.openadsdk.core.mj(this.di, acVar, this.f18130co.ri());
                acVar.addView(mjVarRi);
            }
            mjVarRi.setAdType(1);
            acVar2 = acVar;
            mjVarRi.setCallback(new com.bytedance.sdk.openadsdk.core.mj.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.3
                @Override // com.bytedance.sdk.openadsdk.core.mj.ri
                public void lr() {
                    ri riVar2 = ri.this;
                    riVar2.lr(riVar2.ka);
                }

                @Override // com.bytedance.sdk.openadsdk.core.mj.ri
                public void ri(boolean z) {
                    ri.this.ri(z, wjvVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.mj.ri
                public void ri() {
                    if (ri.this.bu != 0) {
                        ri.this.qt();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.mj.ri
                public void ri(View view) {
                    if (ri.this.aw.compareAndSet(false, true)) {
                        ri.this.ri(view, acVar2, wjvVar, strRi, riVarSf);
                    }
                    ka kaVar = ri.this.ri;
                    if (kaVar == null || kaVar.getCurView() == null) {
                        return;
                    }
                    ri.this.ri.getCurView().qt();
                    ri.this.ri.getCurView().nr();
                    ri.this.ri.setIsShow(true);
                }
            });
            mjVar = mjVarRi;
            riVar = this;
            wjvVar2 = wjvVar;
        } else {
            boolean zRi = this.f18130co.ri();
            srn.lr lrVar = new srn.lr() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.4
                @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
                public void lr() {
                    ri riVar2 = ri.this;
                    riVar2.lr(riVar2.ka);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
                public void ri(boolean z) {
                    ri.this.ri(z, wjvVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
                public void ri() {
                    if (ri.this.bu != 0) {
                        ri.this.qt();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
                public void ri(View view, boolean z) {
                    if (!z) {
                        com.bytedance.sdk.openadsdk.ay.ri.ik.ri(ri.this.ka, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.ay.ri.ik.ri(ri.this.ka, 4);
                    if (ri.this.aw.compareAndSet(false, true)) {
                        ri.this.ri(view, acVar, wjvVar, strRi, riVarSf);
                    }
                    ka kaVar = ri.this.ri;
                    if (kaVar == null || kaVar.getCurView() == null) {
                        return;
                    }
                    ri.this.ri.getCurView().qt();
                    ri.this.ri.getCurView().nr();
                    ri.this.ri.setIsShow(true);
                }
            };
            riVar = this;
            wjvVar2 = wjvVar;
            srn.ri(acVar, true, 1, zRi, lrVar, null);
            acVar2 = acVar;
            mjVar = null;
        }
        Context contextRi = com.bytedance.sdk.component.utils.lr.ri(acVar2);
        if (contextRi == null) {
            contextRi = riVar.di;
        }
        com.bytedance.sdk.openadsdk.core.jbs.jbs jbsVar = new com.bytedance.sdk.openadsdk.core.jbs.jbs(contextRi, wjvVar2, riVar.ik, 2);
        jbsVar.ri(acVar2);
        jbsVar.ri(this);
        jbsVar.ri(riVar.qt);
        jbsVar.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.5
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i) {
                if (ri.this.fi != null) {
                    ri.this.fi.onAdClicked();
                }
            }
        });
        acVar2.setClickListener(jbsVar);
        com.bytedance.sdk.openadsdk.core.jbs.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.jbs.mj(riVar.di, wjvVar2, riVar.ik, 2);
        mjVar2.ri((View) acVar2);
        mjVar2.ri(this);
        mjVar2.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.6
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i) {
                if (ri.this.fi != null) {
                    ri.this.fi.onAdClicked();
                }
            }
        });
        ac acVar3 = riVar.sf;
        if (acVar3 instanceof tan) {
            mjVar2.ri(((tan) acVar3).getVideoController());
        }
        mjVar2.ri(riVar.qt);
        acVar2.setClickCreativeListener(mjVar2);
        if (riVar.mj) {
            return;
        }
        mjVar.setNeedCheckingShow(true);
    }

    private com.bytedance.sdk.openadsdk.core.mj ri(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.mj) {
                    return (com.bytedance.sdk.openadsdk.core.mj) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void ri(final com.bytedance.sdk.openadsdk.ri.ri.lr lrVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.tan > 500) {
            this.tan = jCurrentTimeMillis;
            ka kaVar = this.ri;
            if (kaVar instanceof ik) {
                kaVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((ik) ri.this.ri).ri(lrVar);
                    }
                }, 500L);
            }
        }
    }
}
