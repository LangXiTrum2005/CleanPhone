package com.bytedance.sdk.openadsdk.Lxb.LD;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.OY.QAg;
import com.bytedance.sdk.openadsdk.core.OY.brP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.IeN;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.utils.le;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private com.bytedance.sdk.openadsdk.core.LD.Lxb JVA;
    private WeakReference<com.bytedance.sdk.openadsdk.core.NXR.LD.lc> JXs;
    private final Context LD;
    protected final tD Lxb;
    private boolean NXR = false;
    private PAGMediaView OY;
    private com.bytedance.sdk.openadsdk.core.OY.tD QAg;
    private WeakReference<com.bytedance.sdk.openadsdk.core.sLN.lc> STP;
    private boolean ZU;
    private com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk ebl;
    private LD lc;
    private final String lk;
    private PAGMediaView nBu;
    private com.bytedance.sdk.openadsdk.core.LD.LD sLN;

    public Lxb(Context context, tD tDVar, String str) {
        this.LD = context;
        this.Lxb = tDVar;
        this.lk = str;
    }

    private PAGMediaView STP() {
        if (!tD.JXs(this.Lxb)) {
            com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk lkVar = this.ebl;
            if (lkVar == null) {
                return null;
            }
            com.bytedance.sdk.openadsdk.core.OY.tD tDVarZU = lkVar.ZU();
            tDVarZU.setTag(520093762, Boolean.TRUE);
            if (!this.NXR) {
                this.ebl.JXs();
            }
            this.NXR = true;
            return Lxb(tDVarZU);
        }
        com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk lkVar2 = this.ebl;
        if (lkVar2 == null || !(lkVar2 instanceof com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.LD)) {
            return null;
        }
        brP brp = (brP) lkVar2.ZU();
        brp.setTag(520093762, Boolean.TRUE);
        if (!this.NXR) {
            this.ebl.JXs();
        }
        this.NXR = true;
        return Lxb(brp);
    }

    public View JVA() {
        tD tDVar;
        if (kqm.Lxb() == null || (tDVar = this.Lxb) == null) {
            sLN.Lxb("TTNativeAdImpl", "getAdChoicesView mContext == null");
            return null;
        }
        if (!tDVar.chu() || !this.Lxb.OY()) {
            return null;
        }
        ImageView imageView = new ImageView(kqm.Lxb());
        com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb((int) le.Lxb(kqm.Lxb(), 14.0f, true), imageView, this.Lxb);
        return imageView;
    }

    public String JXs() {
        tD tDVar = this.Lxb;
        if (tDVar != null) {
            return LD(tDVar);
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.OY.tD LD() {
        return this.QAg;
    }

    public void Lxb(LD ld) {
        this.lc = ld;
    }

    public void NXR() {
        com.bytedance.sdk.openadsdk.core.sLN.lc lcVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.sLN.lc> weakReference = this.STP;
        if (weakReference == null || (lcVar = weakReference.get()) == null) {
            return;
        }
        lcVar.Lxb(13);
    }

    public PAGMediaView OY() {
        return this.nBu;
    }

    public PAGMediaView QAg() {
        if (!tD.JXs(this.Lxb)) {
            List<IeN> listUxf = this.Lxb.uxf();
            if (listUxf == null || listUxf.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.LD);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            IeN ieN = listUxf.get(0);
            if (ieN != null) {
                com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(ieN).lk(2).Lxb(com.bytedance.sdk.openadsdk.QAg.lk.Lxb(this.Lxb, ieN.Lxb(), imageView));
            }
            PAGMediaView pAGMediaViewLxb = Lxb(imageView);
            if (this.JVA == null || !VVE.TA().ZU(String.valueOf(this.Lxb.Td()))) {
                pAGMediaViewLxb.setOnClickListener(null);
                pAGMediaViewLxb.setOnTouchListener(null);
            } else {
                pAGMediaViewLxb.setOnClickListener(this.JVA);
                pAGMediaViewLxb.setOnTouchListener(this.JVA);
            }
            pAGMediaViewLxb.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.OY;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.OY.setOnTouchListener(null);
            }
            this.OY = pAGMediaViewLxb;
            return pAGMediaViewLxb;
        }
        LD ld = this.lc;
        if (ld == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewJXs = ld.JXs();
        if (viewJXs == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewJXs.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewJXs.getParent()).removeView(viewJXs);
        }
        PAGMediaView pAGMediaView2 = this.OY;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.OY.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.LD, viewJXs, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.JVA == null || !VVE.TA().ZU(String.valueOf(this.Lxb.Td()))) {
            com.bytedance.sdk.openadsdk.core.LD.lk lkVar = new com.bytedance.sdk.openadsdk.core.LD.lk() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.2
                @Override // com.bytedance.sdk.openadsdk.core.LD.lk
                public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, boolean z) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(lkVar);
            pAGVideoMediaView.setOnTouchListener(lkVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.JVA);
            pAGVideoMediaView.setOnTouchListener(this.JVA);
        }
        this.OY = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    public String ZU() {
        tD tDVar = this.Lxb;
        if (tDVar != null) {
            return Lxb(tDVar);
        }
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PAGMediaView ebl() {
        PAGMediaView pAGMediaViewQAg;
        com.bytedance.sdk.openadsdk.utils.LD.Lxb(this.Lxb);
        if (this.Lxb.eK() == 2) {
            pAGMediaViewQAg = STP();
            Lxb(pAGMediaViewQAg);
        } else {
            pAGMediaViewQAg = QAg();
        }
        if (pAGMediaViewQAg != null) {
            pAGMediaViewQAg.setMrcTrackerKey(com.bytedance.sdk.openadsdk.eK.LD.JXs.LD(this.Lxb));
        } else {
            pAGMediaViewQAg = new PAGMediaView(this.LD) { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.lk.Lxb(this, Lxb.this.Lxb);
                }
            };
        }
        if (pAGMediaViewQAg instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewQAg).setMaterialMeta(this.Lxb);
        }
        this.nBu = pAGMediaViewQAg;
        return pAGMediaViewQAg;
    }

    public String lc() {
        tD tDVar = this.Lxb;
        if (tDVar != null) {
            return tDVar.xr();
        }
        return null;
    }

    public PAGImageItem lk() {
        tD tDVar = this.Lxb;
        if (tDVar == null || tDVar.Lpq() == null) {
            return null;
        }
        return new PAGImageItem(this.Lxb.Lpq().lk(), this.Lxb.Lpq().LD(), this.Lxb.Lpq().Lxb(), (float) this.Lxb.Lpq().ZU());
    }

    public View nBu() {
        if (kqm.Lxb() == null) {
            sLN.Lxb("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(kqm.Lxb());
        imageView.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(kqm.Lxb(), "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Lxb.this.sLN();
            }
        });
        return imageView;
    }

    public void sLN() {
        Context context = this.LD;
        if (context != null) {
            TTWebsiteActivity.Lxb(context, this.Lxb, this.lk);
        }
    }

    private String LD(tD tDVar) {
        if (TextUtils.isEmpty(tDVar.FD())) {
            return !TextUtils.isEmpty(tDVar.ae()) ? tDVar.ae() : "";
        }
        return tDVar.FD();
    }

    public void Lxb(com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk lkVar) {
        this.ebl = lkVar;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar) {
        this.JXs = new WeakReference<>(lcVar);
    }

    public void Lxb(boolean z) {
        this.ZU = z;
    }

    public PAGMediaView Lxb() {
        return this.OY;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.Lxb lxb) {
        this.JVA = lxb;
    }

    private lk LD(final PAGVideoAdListener pAGVideoAdListener) {
        return new lk() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.5
            @Override // com.bytedance.sdk.openadsdk.Lxb.LD.lk
            public void LD(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.Lxb.LD.lk
            public void Lxb(int i, int i2) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.Lxb.LD.lk
            public void lk(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.Lxb.LD.lk
            public void Lxb(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    private String Lxb(tD tDVar) {
        if (tDVar.MGT() != null && !TextUtils.isEmpty(tDVar.MGT().LD())) {
            return tDVar.MGT().LD();
        }
        if (!TextUtils.isEmpty(tDVar.VU())) {
            return tDVar.VU();
        }
        if (!TextUtils.isEmpty(tDVar.FD())) {
            return tDVar.FD();
        }
        return "";
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.LD ld) {
        this.sLN = ld;
    }

    private void Lxb(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView Lxb(final View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        com.bytedance.sdk.openadsdk.core.OY.tD tDVar = this.QAg;
        if (tDVar != null) {
            tDVar.setClickListener(null);
            this.QAg.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.LD.LD ld = this.sLN;
        if (ld != null && (ld instanceof QAg) && (view instanceof com.bytedance.sdk.openadsdk.core.OY.tD)) {
            ((com.bytedance.sdk.openadsdk.core.OY.tD) view).setClickListener((QAg) ld);
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = this.JVA;
        if (lxb != null && (lxb instanceof com.bytedance.sdk.openadsdk.core.OY.OY) && (view instanceof com.bytedance.sdk.openadsdk.core.OY.tD)) {
            ((com.bytedance.sdk.openadsdk.core.OY.tD) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.OY.OY) lxb);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.LD) { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.3
            private void Lxb(boolean z) {
                Integer num = this.Lxb;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(num), z ? 4 : 8);
                }
                tD tDVar2 = Lxb.this.Lxb;
                if (tDVar2 != null) {
                    com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(tDVar2, z);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.lk.Lxb(this, Lxb.this.Lxb);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof com.bytedance.sdk.openadsdk.core.OY.tD) {
                    return;
                }
                Lxb(z);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                Lxb.this.Lxb(pAGVideoAdListener);
            }
        };
        int i2 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.width;
            i = layoutParams.height;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof com.bytedance.sdk.openadsdk.core.OY.tD) {
            this.QAg = (com.bytedance.sdk.openadsdk.core.OY.tD) view;
        }
        return pAGMediaView;
    }

    public void Lxb(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk lkVar;
        if (this.Lxb.eK() == 2 && tD.JXs(this.Lxb) && (lkVar = this.ebl) != null && (lkVar instanceof com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.LD)) {
            brP brp = (brP) lkVar.ZU();
            if (brp != null) {
                brp.setVideoAdListener(LD(pAGVideoAdListener));
                return;
            }
            return;
        }
        LD ld = this.lc;
        if (ld != null) {
            ld.Lxb(LD(pAGVideoAdListener));
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.sLN.lc lcVar) {
        this.STP = new WeakReference<>(lcVar);
    }
}
