package com.bytedance.sdk.openadsdk.core.lk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.OY.QAg;
import com.bytedance.sdk.openadsdk.core.OY.brP;
import com.bytedance.sdk.openadsdk.core.OY.tD;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.BcA;
import com.bytedance.sdk.openadsdk.utils.KPU;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends PAGBannerAd {
    private boolean JVA;
    TTDislikeDialogAbstract JXs;
    protected final Context LD;
    protected lk Lxb;
    private PAGBannerAdWrapperListener OY;
    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc QAg;
    private tD STP;
    private boolean VVE;
    protected AdSlot ZU;
    private final boolean ebl;
    protected com.bytedance.sdk.openadsdk.core.model.tD lk;
    private boolean sLN;
    private final Queue<Long> nBu = new LinkedList();
    private String NXR = "banner_ad";
    private final AtomicBoolean IeN = new AtomicBoolean(false);
    protected final View.OnAttachStateChangeListener lc = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.ZU.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (ZU.this.VVE) {
                return;
            }
            ZU zu = ZU.this;
            zu.Lxb(zu.Lxb.getCurView(), ZU.this.lk);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ZU.this.Lxb.lk();
        }
    };

    public static class LD extends OY {
        com.bytedance.sdk.openadsdk.core.model.tD LD;
        boolean Lxb;
        WeakReference<ZU> lk;

        public LD(boolean z, com.bytedance.sdk.openadsdk.core.model.tD tDVar, ZU zu) {
            super("ReportWindowFocusChangedAdShow");
            this.Lxb = z;
            this.LD = tDVar;
            this.lk = new WeakReference<>(zu);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<ZU> weakReference = this.lk;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.lk.get().LD(this.Lxb, this.LD);
        }
    }

    public interface Lxb {
        void Lxb();
    }

    public ZU(Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot) {
        this.LD = context;
        this.lk = tDVar;
        this.ZU = adSlot;
        Lxb(context, tDVar, adSlot);
        this.ebl = false;
        this.VVE = false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            try {
                lkVar.lk();
                this.Lxb.removeOnAttachStateChangeListener(this.lc);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.LD.Lxb(this.lk);
        IPMiBroadcastReceiver.Lxb(this.LD, this.lk);
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
        if (tDVar == null || tDVar.Hu() == null) {
            return null;
        }
        try {
            return this.lk.Hu().get(str);
        } catch (Throwable th) {
            sLN.Lxb("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
        if (tDVar != null) {
            return tDVar.Hu();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.sLN) {
            return;
        }
        KPU.Lxb(this.lk, d, str, str2);
        this.sLN = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        JXs jXs = new JXs(pAGBannerAdInteractionCallback);
        this.OY = jXs;
        this.Lxb.setExpressInteractionListener(jXs);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        JXs jXs = new JXs(pAGBannerAdInteractionListener);
        this.OY = jXs;
        this.Lxb.setExpressInteractionListener(jXs);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.JVA) {
            return;
        }
        KPU.Lxb(this.lk, d);
        this.JVA = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk() {
        LD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(boolean z, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        Long lPoll;
        try {
            if (z) {
                this.nBu.offer(Long.valueOf(System.currentTimeMillis()));
            } else {
                if (this.nBu.size() <= 0 || this.STP == null || (lPoll = this.nBu.poll()) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(String.valueOf(System.currentTimeMillis() - lPoll.longValue()), tDVar, this.NXR, this.STP.getAdShowTime());
            }
        } catch (Exception e) {
            sLN.Lxb("PAGBannerAdImpl", e.getMessage());
        }
    }

    public void Lxb(Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot) {
        lk lkVar = new lk(context, tDVar, adSlot);
        this.Lxb = lkVar;
        lkVar.addOnAttachStateChangeListener(this.lc);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Lxb(@NonNull final tD tDVar, @NonNull final com.bytedance.sdk.openadsdk.core.model.tD tDVar2) {
        final com.bytedance.sdk.openadsdk.core.ebl eblVar;
        if (tDVar == null || tDVar2 == null) {
            return;
        }
        this.lk = tDVar2;
        this.QAg = Lxb(tDVar2);
        this.STP = tDVar;
        final String strLxb = eK.Lxb();
        final Lxb Lxb2 = Lxb();
        tDVar.setClosedListenerKey(strLxb);
        tDVar.setBannerClickClosedListener(Lxb2);
        tDVar.setBackupListener(new com.bytedance.sdk.component.adexpress.LD.lk() { // from class: com.bytedance.sdk.openadsdk.core.lk.ZU.2
            @Override // com.bytedance.sdk.component.adexpress.LD.lk
            public boolean Lxb(ViewGroup viewGroup, int i) {
                try {
                    tDVar.sLN();
                    if (!ZU.this.lk.chu()) {
                        com.bytedance.sdk.openadsdk.core.lk.Lxb lxb = new com.bytedance.sdk.openadsdk.core.lk.Lxb(tDVar.getContext());
                        lxb.setClosedListenerKey(strLxb);
                        ZU zu = ZU.this;
                        lxb.Lxb(zu.lk, tDVar, zu.QAg);
                        lxb.setDislikeOuter(ZU.this.JXs);
                        lxb.setAdInteractionListener(ZU.this.OY);
                        return true;
                    }
                    ebl eblVar2 = new ebl(tDVar.getContext());
                    eblVar2.setClosedListenerKey(strLxb);
                    ZU zu2 = ZU.this;
                    eblVar2.Lxb(zu2.lk, tDVar, zu2.QAg);
                    eblVar2.setDislikeOuter(ZU.this.JXs);
                    eblVar2.setAdInteractionListener(ZU.this.OY);
                    tDVar.setVastVideoHelper(eblVar2);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.ebl) {
            com.bytedance.sdk.openadsdk.core.ebl eblVarLxb = Lxb(tDVar);
            if (eblVarLxb == null) {
                eblVarLxb = new com.bytedance.sdk.openadsdk.core.ebl(this.LD, tDVar);
                tDVar.addView(eblVarLxb);
            }
            eblVar = eblVarLxb;
            eblVar.setCallback(new com.bytedance.sdk.openadsdk.core.ebl.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.lk.ZU.3
                @Override // com.bytedance.sdk.openadsdk.core.ebl.Lxb
                public void LD() {
                    ZU.this.Lxb(eblVar, false, tDVar2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.ebl.Lxb
                public void Lxb(boolean z) {
                    ZU.this.Lxb(z, tDVar2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.ebl.Lxb
                public void Lxb() {
                    ZU.this.lk();
                }

                @Override // com.bytedance.sdk.openadsdk.core.ebl.Lxb
                public void Lxb(View view) {
                    if (ZU.this.IeN.compareAndSet(false, true)) {
                        ZU.this.Lxb(view, tDVar, tDVar2, strLxb, Lxb2);
                    }
                }
            });
        } else {
            BcA.Lxb(tDVar, true, 1, new BcA.LD() { // from class: com.bytedance.sdk.openadsdk.core.lk.ZU.4
                @Override // com.bytedance.sdk.openadsdk.utils.BcA.LD
                public void LD() {
                    ZU.this.Lxb((com.bytedance.sdk.openadsdk.core.ebl) null, true, tDVar2);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.BcA.LD
                public void Lxb(boolean z) {
                    ZU.this.Lxb(z, tDVar2);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.BcA.LD
                public void Lxb() {
                    ZU.this.lk();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.BcA.LD
                public void Lxb(View view, boolean z) {
                    if (!z) {
                        com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(ZU.this.lk, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(ZU.this.lk, 4);
                    if (ZU.this.IeN.compareAndSet(false, true)) {
                        ZU.this.Lxb(view, tDVar, tDVar2, strLxb, Lxb2);
                    }
                }
            }, null);
            eblVar = null;
        }
        Context contextLxb = com.bytedance.sdk.component.utils.LD.Lxb(tDVar);
        if (contextLxb == null) {
            contextLxb = this.LD;
        }
        QAg qAg = new QAg(contextLxb, tDVar2, this.NXR, 2);
        qAg.Lxb(tDVar);
        qAg.Lxb(this);
        qAg.Lxb(this.QAg);
        qAg.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.lk.ZU.5
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view, int i) {
                if (ZU.this.OY != null) {
                    ZU.this.OY.onAdClicked();
                }
            }
        });
        tDVar.setClickListener(qAg);
        com.bytedance.sdk.openadsdk.core.OY.OY oy = new com.bytedance.sdk.openadsdk.core.OY.OY(this.LD, tDVar2, this.NXR, 2);
        oy.Lxb((View) tDVar);
        oy.Lxb(this);
        oy.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.lk.ZU.6
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view, int i) {
                if (ZU.this.OY != null) {
                    ZU.this.OY.onAdClicked();
                }
            }
        });
        tD tDVar3 = this.STP;
        if (tDVar3 instanceof brP) {
            oy.Lxb(((brP) tDVar3).getVideoController());
        }
        oy.Lxb(this.QAg);
        tDVar.setClickCreativeListener(oy);
        if (this.ebl) {
            return;
        }
        eblVar.setNeedCheckingShow(true);
    }

    private void LD(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        Queue<Long> queue = this.nBu;
        if (queue == null || queue.size() <= 0 || tDVar == null) {
            return;
        }
        try {
            long jLongValue = this.nBu.poll().longValue();
            if (jLongValue <= 0 || this.STP == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(String.valueOf(System.currentTimeMillis() - jLongValue), tDVar, this.NXR, this.STP.getAdShowTime());
        } catch (Exception e) {
            sLN.Lxb("PAGBannerAdImpl", e.getMessage());
        }
    }

    public void LD() {
        this.lk.Lxb(SystemClock.elapsedRealtime());
        this.Lxb.LD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(boolean z, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (z && this.lk.wVL() && !this.lk.aE()) {
            this.lk.ebl(true);
            com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.lk;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar2, this.NXR, tDVar2.Kue());
        }
        hg.LD(new LD(z, tDVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(com.bytedance.sdk.openadsdk.core.ebl eblVar, boolean z, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        LD(tDVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(View view, tD tDVar, com.bytedance.sdk.openadsdk.core.model.tD tDVar2, String str, Lxb lxb) {
        com.bytedance.sdk.openadsdk.core.QAg.LD().Lxb(str, lxb);
        Queue<Long> queue = this.nBu;
        if (queue != null) {
            queue.offer(Long.valueOf(System.currentTimeMillis()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (tDVar != null) {
                jSONObject.put("dynamic_show_type", tDVar.getDynamicShowType());
                tDVar.Lxb(jSONObject, tDVar2);
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
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar2, this.NXR, jSONObject);
            com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(tDVar2);
        } catch (JSONException unused2) {
            sLN.Lxb("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.OY;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, tDVar2.sRq());
        }
        if (tDVar2.gS()) {
            nJ.Lxb(tDVar2, view);
        }
        lk lkVar = this.Lxb;
        if (lkVar == null || lkVar.getCurView() == null) {
            return;
        }
        this.Lxb.getCurView().nBu();
        this.Lxb.getCurView().OY();
    }

    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar.sRq() == 4) {
            return com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(this.LD, tDVar, this.NXR);
        }
        return null;
    }

    private com.bytedance.sdk.openadsdk.core.ebl Lxb(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.ebl) {
                    return (com.bytedance.sdk.openadsdk.core.ebl) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Lxb Lxb() {
        return new Lxb() { // from class: com.bytedance.sdk.openadsdk.core.lk.ZU.7
            @Override // com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb
            public void Lxb() {
                int width = ZU.this.STP.getWidth();
                int height = ZU.this.STP.getHeight();
                View viewLxb = Lxb(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                ZU.this.STP.STP();
                ZU.this.STP.removeAllViews();
                ZU.this.STP.addView(viewLxb, new ViewGroup.LayoutParams(width, height));
                ZU.this.STP.setClickCreativeListener(null);
                ZU.this.STP.setClickListener(null);
                if (ZU.this.OY != null) {
                    ZU.this.OY.onAdDismissed();
                }
                ZU.this.VVE = true;
            }

            private View Lxb(boolean z) {
                com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(ZU.this.LD);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                lkVar.setBackgroundColor(-1);
                lkVar.setLayoutParams(layoutParams);
                View view = new View(ZU.this.LD);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                lkVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.JXs.lk lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(ZU.this.LD);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z) {
                    lkVar2.setBackground(com.bytedance.sdk.component.utils.tD.lk(ZU.this.LD, "tt_ad_closed_background_300_250"));
                } else {
                    lkVar2.setBackground(com.bytedance.sdk.component.utils.tD.lk(ZU.this.LD, "tt_ad_closed_background_320_50"));
                }
                lkVar.addView(lkVar2, layoutParams3);
                com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(ZU.this.LD);
                zu.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z) {
                    int iLk = le.lk(ZU.this.LD, 16.0f);
                    layoutParams4.width = le.lk(ZU.this.LD, 77.0f);
                    layoutParams4.height = le.lk(ZU.this.LD, 14.0f);
                    layoutParams4.leftMargin = iLk;
                    layoutParams4.topMargin = iLk;
                } else {
                    int iLk2 = le.lk(ZU.this.LD, 8.0f);
                    layoutParams4.width = le.lk(ZU.this.LD, 45.0f);
                    layoutParams4.height = le.lk(ZU.this.LD, 8.18f);
                    layoutParams4.leftMargin = iLk2;
                    layoutParams4.topMargin = iLk2;
                }
                zu.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(ZU.this.LD, "tt_ad_closed_logo_red"));
                lkVar2.addView(zu, layoutParams4);
                com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(ZU.this.LD);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                oy.setAlpha(0.5f);
                oy.setLines(1);
                oy.setText(com.bytedance.sdk.component.utils.tD.Lxb(ZU.this.LD, "tt_ad_is_closed"));
                if (z) {
                    oy.setTextSize(18.0f);
                } else {
                    oy.setTextSize(12.0f);
                }
                lkVar2.addView(oy, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.ZU.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        ZU zu2 = ZU.this;
                        TTWebsiteActivity.Lxb(zu2.LD, zu2.lk, zu2.NXR);
                    }
                };
                zu.setOnClickListener(onClickListener);
                oy.setOnClickListener(onClickListener);
                return lkVar;
            }
        };
    }
}
