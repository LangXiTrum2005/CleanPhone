package com.bytedance.sdk.openadsdk.ri.lr;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.jbs;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private boolean aw = false;
    private WeakReference<com.bytedance.sdk.openadsdk.core.aw.di> bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ik.lr f18161co;
    private lr di;
    private WeakReference<com.bytedance.sdk.openadsdk.core.bgr.lr.di> fi;
    private final String ik;
    private ac jbs;
    private boolean ka;
    private final Context lr;
    private PAGMediaView mj;
    private PAGMediaView qt;
    protected final wjv ri;
    private com.bytedance.sdk.openadsdk.core.ik.ri sf;
    private com.bytedance.sdk.openadsdk.ri.lr.ri.ik xha;

    public ri(Context context, wjv wjvVar, String str) {
        this.lr = context;
        this.ri = wjvVar;
        this.ik = str;
    }

    private PAGMediaView bgr() {
        if (!wjv.fi(this.ri)) {
            com.bytedance.sdk.openadsdk.ri.lr.ri.ik ikVar = this.xha;
            if (ikVar == null) {
                return null;
            }
            ac acVarKa = ikVar.ka();
            acVarKa.setTag(520093762, Boolean.TRUE);
            if (!this.aw) {
                this.xha.fi();
            }
            this.aw = true;
            return ri(acVarKa);
        }
        com.bytedance.sdk.openadsdk.ri.lr.ri.ik ikVar2 = this.xha;
        if (ikVar2 == null || !(ikVar2 instanceof com.bytedance.sdk.openadsdk.ri.lr.ri.lr)) {
            return null;
        }
        tan tanVar = (tan) ikVar2.ka();
        tanVar.setTag(520093762, Boolean.TRUE);
        if (!this.aw) {
            this.xha.fi();
        }
        this.aw = true;
        return ri(tanVar);
    }

    public void aw() {
        com.bytedance.sdk.openadsdk.core.aw.di diVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.aw.di> weakReference = this.bgr;
        if (weakReference == null || (diVar = weakReference.get()) == null) {
            return;
        }
        diVar.ri(13);
    }

    public void co() {
        Context context = this.lr;
        if (context != null) {
            TTWebsiteActivity.ri(context, this.ri, this.ik);
        }
    }

    public String di() {
        wjv wjvVar = this.ri;
        if (wjvVar != null) {
            return wjvVar.skk();
        }
        return null;
    }

    public String fi() {
        wjv wjvVar = this.ri;
        if (wjvVar != null) {
            return lr(wjvVar);
        }
        return null;
    }

    public PAGImageItem ik() {
        wjv wjvVar = this.ri;
        if (wjvVar == null || wjvVar.fb() == null) {
            return null;
        }
        return new PAGImageItem(this.ri.fb().ik(), this.ri.fb().lr(), this.ri.fb().ri(), (float) this.ri.fb().ka());
    }

    public PAGMediaView jbs() {
        if (!wjv.fi(this.ri)) {
            List<nr> listRbz = this.ri.rbz();
            if (listRbz == null || listRbz.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.lr);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            nr nrVar = listRbz.get(0);
            if (nrVar != null) {
                com.bytedance.sdk.openadsdk.qt.ka.ri(nrVar).ik(1).ri(com.bytedance.sdk.openadsdk.qt.ik.ri(this.ri, nrVar.ri(), imageView));
            }
            PAGMediaView pAGMediaViewRi = ri(imageView);
            if (this.sf == null || !sf.lr().ka(String.valueOf(this.ri.ur()))) {
                pAGMediaViewRi.setOnClickListener(null);
                pAGMediaViewRi.setOnTouchListener(null);
            } else {
                pAGMediaViewRi.setOnClickListener(this.sf);
                pAGMediaViewRi.setOnTouchListener(this.sf);
            }
            pAGMediaViewRi.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.mj;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.mj.setOnTouchListener(null);
            }
            this.mj = pAGMediaViewRi;
            return pAGMediaViewRi;
        }
        lr lrVar = this.di;
        if (lrVar == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewFi = lrVar.fi();
        if (viewFi == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewFi.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewFi.getParent()).removeView(viewFi);
        }
        PAGMediaView pAGMediaView2 = this.mj;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.mj.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.lr, viewFi, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.sf == null || !sf.lr().ka(String.valueOf(this.ri.ur()))) {
            com.bytedance.sdk.openadsdk.core.ik.ik ikVar = new com.bytedance.sdk.openadsdk.core.ik.ik() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.2
                @Override // com.bytedance.sdk.openadsdk.core.ik.ik
                public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, boolean z) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(ikVar);
            pAGVideoMediaView.setOnTouchListener(ikVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.sf);
            pAGVideoMediaView.setOnTouchListener(this.sf);
        }
        this.mj = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    public String ka() {
        wjv wjvVar = this.ri;
        if (wjvVar != null) {
            return ri(wjvVar);
        }
        return null;
    }

    public ac lr() {
        return this.jbs;
    }

    public PAGMediaView mj() {
        return this.qt;
    }

    public View qt() {
        if (com.bytedance.sdk.openadsdk.core.nr.ri() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(com.bytedance.sdk.openadsdk.core.nr.ri()) { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.4
            int ri = 0;
            int lr = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                try {
                    Object parent = getParent();
                    if (parent == null || this.ri == 0 || this.lr == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i5 = this.ri;
                    if (width < i5 || height < this.lr) {
                        float fMin = Math.min(height / this.lr, width / i5);
                        int i6 = (width - this.ri) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i6);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public void onMeasure(int i, int i2) {
                if (this.ri == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i2);
                    this.ri = getMeasuredWidth();
                    this.lr = this.containerHeight;
                }
                setMeasuredDimension(this.ri, this.lr);
            }
        };
        pAGLogoView.initData(this.ri);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ri.this.co();
            }
        });
        return pAGLogoView;
    }

    public void ri(lr lrVar) {
        this.di = lrVar;
    }

    public View sf() {
        wjv wjvVar;
        if (com.bytedance.sdk.openadsdk.core.nr.ri() == null || (wjvVar = this.ri) == null || !wjvVar.zz() || !this.ri.wjv()) {
            return null;
        }
        ImageView imageView = new ImageView(com.bytedance.sdk.openadsdk.core.nr.ri());
        com.bytedance.sdk.openadsdk.ac.lr.lr().ri((int) qd.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), 14.0f, true), imageView, this.ri);
        return imageView;
    }

    public PAGMediaView xha() {
        PAGMediaView pAGMediaViewJbs;
        com.bytedance.sdk.openadsdk.utils.lr.ri(this.ri);
        if (this.ri.ajz() == 2) {
            pAGMediaViewJbs = bgr();
            ri(pAGMediaViewJbs);
        } else {
            pAGMediaViewJbs = jbs();
        }
        if (pAGMediaViewJbs != null) {
            pAGMediaViewJbs.setMrcTrackerKey(com.bytedance.sdk.openadsdk.ay.lr.fi.lr(this.ri));
        } else {
            pAGMediaViewJbs = new PAGMediaView(this.lr) { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.ka.ri(this, ri.this.ri);
                }
            };
        }
        if (pAGMediaViewJbs instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewJbs).setMaterialMeta(this.ri);
        }
        this.qt = pAGMediaViewJbs;
        return pAGMediaViewJbs;
    }

    private String lr(wjv wjvVar) {
        if (TextUtils.isEmpty(wjvVar.xh())) {
            return !TextUtils.isEmpty(wjvVar.tq()) ? wjvVar.tq() : "";
        }
        return wjvVar.xh();
    }

    public void ri(com.bytedance.sdk.openadsdk.ri.lr.ri.ik ikVar) {
        this.xha = ikVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar) {
        this.fi = new WeakReference<>(diVar);
    }

    public void ri(boolean z) {
        this.ka = z;
    }

    public PAGMediaView ri() {
        return this.mj;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.ri riVar) {
        this.sf = riVar;
    }

    private ik lr(final PAGVideoAdListener pAGVideoAdListener) {
        return new ik() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.6
            @Override // com.bytedance.sdk.openadsdk.ri.lr.ik
            public void ik(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ri.lr.ik
            public void lr(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ri.lr.ik
            public void ri(int i, int i2) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ri.lr.ik
            public void ri(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    private String ri(wjv wjvVar) {
        if (wjvVar.tyz() != null && !TextUtils.isEmpty(wjvVar.tyz().lr())) {
            return wjvVar.tyz().lr();
        }
        if (!TextUtils.isEmpty(wjvVar.tpb())) {
            return wjvVar.tpb();
        }
        if (!TextUtils.isEmpty(wjvVar.xh())) {
            return wjvVar.xh();
        }
        return "";
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.lr lrVar) {
        this.f18161co = lrVar;
    }

    private void ri(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView ri(final View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        ac acVar = this.jbs;
        if (acVar != null) {
            acVar.setClickListener(null);
            this.jbs.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.ik.lr lrVar = this.f18161co;
        if (lrVar != null && (lrVar instanceof jbs) && (view instanceof ac)) {
            ((ac) view).setClickListener((jbs) lrVar);
        }
        com.bytedance.sdk.openadsdk.core.ik.ri riVar = this.sf;
        if (riVar != null && (riVar instanceof com.bytedance.sdk.openadsdk.core.jbs.mj) && (view instanceof ac)) {
            ((ac) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.jbs.mj) riVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.lr) { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.3
            private void ri(boolean z) {
                Integer num = this.ri;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.ay.lr.fi.ri(com.bytedance.sdk.openadsdk.ay.lr.fi.ri(num), z ? 4 : 8);
                }
                wjv wjvVar = ri.this.ri;
                if (wjvVar != null) {
                    com.bytedance.sdk.openadsdk.ay.ri.ik.ri(wjvVar, z);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.ka.ri(this, ri.this.ri);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof ac) {
                    return;
                }
                ri(z);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                ri.this.ri(pAGVideoAdListener);
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
        if (view instanceof ac) {
            this.jbs = (ac) view;
        }
        return pAGMediaView;
    }

    public void ri(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.ri.lr.ri.ik ikVar;
        if (this.ri.ajz() == 2 && wjv.fi(this.ri) && (ikVar = this.xha) != null && (ikVar instanceof com.bytedance.sdk.openadsdk.ri.lr.ri.lr)) {
            tan tanVar = (tan) ikVar.ka();
            if (tanVar != null) {
                tanVar.setVideoAdListener(lr(pAGVideoAdListener));
                return;
            }
            return;
        }
        lr lrVar = this.di;
        if (lrVar != null) {
            lrVar.ri(lr(pAGVideoAdListener));
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.aw.di diVar) {
        this.bgr = new WeakReference<>(diVar);
    }
}
