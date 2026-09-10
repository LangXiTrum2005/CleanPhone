package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.exc;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ag;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.uw;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private long exc;
    private wd fs;
    private final boolean jpc;
    private ljh mml;
    private final Context mo;
    private PAGBannerAdWrapperListener mzz;
    protected mml qdl;
    private boolean rdp;
    private aaj rq;
    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo to;
    private boolean tvp;
    protected AdSlot ud;
    private String lnr = "banner_ad";
    private long wd = 0;
    private final AtomicBoolean exu = new AtomicBoolean(false);
    private final int bjy = 1;
    private final int jtx = 0;
    private int yt = -1;
    private final View.OnAttachStateChangeListener jl = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (qdl.this.yt == 0 || qdl.this.tvp) {
                return;
            }
            qdl qdlVar = qdl.this;
            qdlVar.qdl(qdlVar.qdl.getCurView(), qdl.this.mml);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (qdl.this.rdp) {
                qdl.this.yt = 0;
            } else {
                qdl.this.mo();
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mml.qdl$qdl, reason: collision with other inner class name */
    public static class C0119qdl extends com.bytedance.sdk.component.jpc.jpc {
        WeakReference<qdl> lnr;
        boolean qdl;
        ljh ud;

        public C0119qdl(boolean z2, ljh ljhVar, qdl qdlVar) {
            super("ReportWindowFocusChangedAdShow");
            this.qdl = z2;
            this.ud = ljhVar;
            this.lnr = new WeakReference<>(qdlVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<qdl> weakReference = this.lnr;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.lnr.get().ud(this.qdl, this.ud);
        }
    }

    public qdl(Context context, ljh ljhVar, AdSlot adSlot, wd wdVar, boolean z2) {
        this.rdp = false;
        this.mo = context;
        this.mml = ljhVar;
        this.ud = adSlot;
        this.fs = wdVar;
        this.rdp = z2;
        qdl(context, ljhVar, adSlot);
        this.jpc = false;
        this.tvp = false;
    }

    private void fs() {
        this.mml.qdl(SystemClock.elapsedRealtime());
        this.qdl.mzz();
    }

    private wd.qdl rq() {
        return new wd.qdl() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.7
            @Override // com.bytedance.sdk.openadsdk.core.mml.wd.qdl
            public void qdl() {
                int width = qdl.this.rq.getWidth();
                int height = qdl.this.rq.getHeight();
                View viewQdl = qdl(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                qdl.this.rq.oth();
                qdl.this.rq.removeAllViews();
                qdl.this.rq.addView(viewQdl, new ViewGroup.LayoutParams(width, height));
                qdl.this.rq.setClickCreativeListener(null);
                qdl.this.rq.setClickListener(null);
                if (qdl.this.mzz != null) {
                    qdl.this.mzz.onAdDismissed();
                }
                qdl.this.tvp = true;
            }

            private View qdl(boolean z2) {
                com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(qdl.this.mo);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                lnrVar.setBackgroundColor(-1);
                lnrVar.setLayoutParams(layoutParams);
                View view = new View(qdl.this.mo);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                lnrVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(qdl.this.mo);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z2) {
                    lnrVar2.setBackground(com.bytedance.sdk.component.utils.ljh.lnr(qdl.this.mo, "tt_ad_closed_background_300_250"));
                } else {
                    lnrVar2.setBackground(com.bytedance.sdk.component.utils.ljh.lnr(qdl.this.mo, "tt_ad_closed_background_320_50"));
                }
                lnrVar.addView(lnrVar2, layoutParams3);
                PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(qdl.this.mo, qdl.this.mml);
                pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z2) {
                    int iUd = ax.ud(qdl.this.mo, 16.0f);
                    layoutParams4.width = ax.ud(qdl.this.mo, 77.0f);
                    layoutParams4.height = ax.ud(qdl.this.mo, 14.0f);
                    layoutParams4.leftMargin = iUd;
                    layoutParams4.topMargin = iUd;
                } else {
                    int iUd2 = ax.ud(qdl.this.mo, 8.0f);
                    layoutParams4.width = ax.ud(qdl.this.mo, 45.0f);
                    layoutParams4.height = ax.ud(qdl.this.mo, 8.18f);
                    layoutParams4.leftMargin = iUd2;
                    layoutParams4.topMargin = iUd2;
                }
                lnrVar2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(qdl.this.mo);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                jpcVar.setAlpha(0.5f);
                jpcVar.setLines(1);
                jpcVar.setText(com.bytedance.sdk.component.utils.ljh.qdl(qdl.this.mo, "tt_ad_is_closed"));
                if (z2) {
                    jpcVar.setTextSize(18.0f);
                } else {
                    jpcVar.setTextSize(12.0f);
                }
                lnrVar2.addView(jpcVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.qdl(qdl.this.mo, qdl.this.mml, qdl.this.lnr);
                    }
                };
                pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                jpcVar.setOnClickListener(onClickListener);
                return lnrVar;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void to() {
        fs();
    }

    public void jpc() {
        mml mmlVar = this.qdl;
        if (mmlVar instanceof lnr) {
            ((lnr) mmlVar).ud();
        }
    }

    public com.bytedance.sdk.openadsdk.multipro.ud.qdl lnr() {
        mml mmlVar = this.qdl;
        if (mmlVar instanceof lnr) {
            return ((lnr) mmlVar).getVideoModel();
        }
        return null;
    }

    public void mml() {
        ud(this.mml);
        this.wd = 0L;
    }

    public void mo() {
        this.yt = 1;
        this.qdl.mml();
    }

    public void mzz() {
        this.wd = System.currentTimeMillis();
    }

    public void tvp() {
        mml mmlVar = this.qdl;
        if (mmlVar instanceof lnr) {
            ((lnr) mmlVar).qdl();
        }
    }

    public void wd() {
        if (this.qdl != null) {
            try {
                mo();
                this.qdl.removeOnAttachStateChangeListener(this.jl);
            } catch (Throwable unused) {
            }
        }
    }

    public boolean ud() {
        return this.qdl instanceof lnr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(boolean z2, ljh ljhVar) {
        try {
            if (z2) {
                this.wd = System.currentTimeMillis();
            } else {
                if (this.wd <= 0 || this.rq == null) {
                    return;
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.wd);
                this.wd = 0L;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(strValueOf, ljhVar, this.lnr, this.rq.getAdShowTime());
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("PAGBannerAdImpl", e2.getMessage());
        }
    }

    public void qdl(int i2) {
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.setCurrentIndex(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(ljh ljhVar) {
        if (this.wd <= 0 || ljhVar == null) {
            return;
        }
        try {
            if (this.rq != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.wd);
                this.wd = 0L;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(strValueOf, ljhVar, this.lnr, this.rq.getAdShowTime());
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("PAGBannerAdImpl", e2.getMessage());
        }
    }

    public void qdl(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        jpc jpcVar = new jpc(pAGBannerAdInteractionCallback);
        this.mzz = jpcVar;
        this.qdl.setExpressInteractionListener(jpcVar);
    }

    public void qdl(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        jpc jpcVar = new jpc(pAGBannerAdInteractionListener);
        this.mzz = jpcVar;
        this.qdl.setExpressInteractionListener(jpcVar);
    }

    public View qdl() {
        com.bytedance.sdk.openadsdk.utils.ud.qdl(this.mml);
        IPMiBroadcastReceiver.qdl(this.mo, this.mml);
        return this.qdl;
    }

    private void qdl(Context context, ljh ljhVar, AdSlot adSlot) {
        if (ljhVar.tdy() != null) {
            lnr lnrVar = new lnr(context, ljhVar, adSlot, this.rdp);
            this.qdl = lnrVar;
            lnrVar.addOnAttachStateChangeListener(this.jl);
        } else {
            mml mmlVar = new mml(context, ljhVar, adSlot, this.rdp);
            this.qdl = mmlVar;
            mmlVar.addOnAttachStateChangeListener(this.jl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(boolean z2, ljh ljhVar) {
        if (z2 && this.mml.jwd() && !this.mml.ljh()) {
            this.mml.mo(true);
            ljh ljhVar2 = this.mml;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar2, this.lnr, ljhVar2.fo());
        }
        fco.ud(new C0119qdl(z2, ljhVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(View view, aaj aajVar, ljh ljhVar, String str, wd.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.core.tvp.ud().qdl(str, qdlVar);
        this.wd = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (aajVar != null) {
                jSONObject.put("dynamic_show_type", aajVar.getDynamicShowType());
                aajVar.qdl(jSONObject, ljhVar);
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
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.lnr, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(ljhVar);
        } catch (JSONException unused2) {
            com.bytedance.sdk.component.utils.aaj.lnr("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.mzz;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, ljhVar.ygv());
        }
        if (ljhVar.rfx()) {
            gy.qdl(ljhVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo qdl(ljh ljhVar) {
        if (ljhVar.ygv() == 4) {
            return com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.mo, this.lnr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final aaj aajVar, final ljh ljhVar) {
        qdl qdlVar;
        ljh ljhVar2;
        final aaj aajVar2;
        com.bytedance.sdk.openadsdk.core.wd wdVar;
        if (aajVar == null || ljhVar == null) {
            return;
        }
        this.mml = ljhVar;
        this.to = qdl(ljhVar);
        this.rq = aajVar;
        final String strQdl = uw.qdl();
        final wd.qdl qdlVarRq = rq();
        aajVar.setClosedListenerKey(strQdl);
        aajVar.setBannerClickClosedListener(qdlVarRq);
        aajVar.setBackupListener(new com.bytedance.sdk.component.adexpress.ud.lnr() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.2
            @Override // com.bytedance.sdk.component.adexpress.ud.lnr
            public boolean qdl(ViewGroup viewGroup, int i2) {
                try {
                    aajVar.aaj();
                    if (!qdl.this.mml.uj()) {
                        ud udVar = new ud(aajVar.getContext());
                        udVar.setClosedListenerKey(strQdl);
                        udVar.qdl(qdl.this.mml, aajVar, qdl.this.to);
                        udVar.setAdInteractionListener(qdl.this.mzz);
                        return true;
                    }
                    tvp tvpVar = new tvp(aajVar.getContext());
                    tvpVar.setClosedListenerKey(strQdl);
                    tvpVar.qdl(qdl.this.mml, aajVar, qdl.this.to);
                    tvpVar.setAdInteractionListener(qdl.this.mzz);
                    aajVar.setVastVideoHelper(tvpVar);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.jpc) {
            com.bytedance.sdk.openadsdk.core.wd wdVarQdl = qdl(aajVar);
            if (wdVarQdl == null) {
                wdVarQdl = new com.bytedance.sdk.openadsdk.core.wd(this.mo, aajVar, this.fs.qdl());
                aajVar.addView(wdVarQdl);
            }
            wdVarQdl.setAdType(1);
            aajVar2 = aajVar;
            wdVarQdl.setCallback(new com.bytedance.sdk.openadsdk.core.wd.qdl() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.3
                @Override // com.bytedance.sdk.openadsdk.core.wd.qdl
                public void qdl(boolean z2) {
                    qdl.this.qdl(z2, ljhVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.wd.qdl
                public void ud() {
                    qdl qdlVar2 = qdl.this;
                    qdlVar2.ud(qdlVar2.mml);
                }

                @Override // com.bytedance.sdk.openadsdk.core.wd.qdl
                public void qdl() {
                    if (qdl.this.yt != 0) {
                        qdl.this.to();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.wd.qdl
                public void qdl(View view) {
                    if (qdl.this.exu.compareAndSet(false, true)) {
                        qdl.this.qdl(view, aajVar2, ljhVar, strQdl, qdlVarRq);
                    }
                    mml mmlVar = qdl.this.qdl;
                    if (mmlVar == null || mmlVar.getCurView() == null) {
                        return;
                    }
                    qdl.this.qdl.getCurView().to();
                    qdl.this.qdl.getCurView().jl();
                    qdl.this.qdl.setIsShow(true);
                }
            });
            wdVar = wdVarQdl;
            qdlVar = this;
            ljhVar2 = ljhVar;
        } else {
            boolean zQdl = this.fs.qdl();
            ag.ud udVar = new ag.ud() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.4
                @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
                public void qdl(boolean z2) {
                    qdl.this.qdl(z2, ljhVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
                public void ud() {
                    qdl qdlVar2 = qdl.this;
                    qdlVar2.ud(qdlVar2.mml);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
                public void qdl() {
                    if (qdl.this.yt != 0) {
                        qdl.this.to();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
                public void qdl(View view, boolean z2) {
                    if (!z2) {
                        com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(qdl.this.mml, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(qdl.this.mml, 4);
                    if (qdl.this.exu.compareAndSet(false, true)) {
                        qdl.this.qdl(view, aajVar, ljhVar, strQdl, qdlVarRq);
                    }
                    mml mmlVar = qdl.this.qdl;
                    if (mmlVar == null || mmlVar.getCurView() == null) {
                        return;
                    }
                    qdl.this.qdl.getCurView().to();
                    qdl.this.qdl.getCurView().jl();
                    qdl.this.qdl.setIsShow(true);
                }
            };
            qdlVar = this;
            ljhVar2 = ljhVar;
            ag.qdl(aajVar, true, 1, zQdl, udVar, null);
            aajVar2 = aajVar;
            wdVar = null;
        }
        Context contextQdl = com.bytedance.sdk.component.utils.ud.qdl(aajVar2);
        if (contextQdl == null) {
            contextQdl = qdlVar.mo;
        }
        com.bytedance.sdk.openadsdk.core.tvp.tvp tvpVar = new com.bytedance.sdk.openadsdk.core.tvp.tvp(contextQdl, ljhVar2, qdlVar.lnr, 2);
        tvpVar.qdl(aajVar2);
        tvpVar.qdl(this);
        tvpVar.qdl(qdlVar.to);
        tvpVar.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.5
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i2) {
                if (qdl.this.mzz != null) {
                    qdl.this.mzz.onAdClicked();
                }
            }
        });
        aajVar2.setClickListener(tvpVar);
        com.bytedance.sdk.openadsdk.core.tvp.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.tvp.jpc(qdlVar.mo, ljhVar2, qdlVar.lnr, 2);
        jpcVar.qdl((View) aajVar2);
        jpcVar.qdl(this);
        jpcVar.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.6
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i2) {
                if (qdl.this.mzz != null) {
                    qdl.this.mzz.onAdClicked();
                }
            }
        });
        aaj aajVar3 = qdlVar.rq;
        if (aajVar3 instanceof exc) {
            jpcVar.qdl(((exc) aajVar3).getVideoController());
        }
        jpcVar.qdl(qdlVar.to);
        aajVar2.setClickCreativeListener(jpcVar);
        if (qdlVar.jpc) {
            return;
        }
        wdVar.setNeedCheckingShow(true);
    }

    private com.bytedance.sdk.openadsdk.core.wd qdl(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            try {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.wd) {
                    return (com.bytedance.sdk.openadsdk.core.wd) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void qdl(final com.bytedance.sdk.openadsdk.qdl.qdl.ud udVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.exc > 500) {
            this.exc = jCurrentTimeMillis;
            mml mmlVar = this.qdl;
            if (mmlVar instanceof lnr) {
                mmlVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mml.qdl.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((lnr) qdl.this.qdl).qdl(udVar);
                    }
                }, 500L);
            }
        }
    }
}
