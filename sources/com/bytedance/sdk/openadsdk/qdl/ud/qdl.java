package com.bytedance.sdk.openadsdk.qdl.ud;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.model.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.exc;
import com.bytedance.sdk.openadsdk.core.tvp.tvp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private boolean exu = false;
    private com.bytedance.sdk.openadsdk.core.lnr.ud fs;
    private PAGMediaView jpc;
    private final String lnr;
    private boolean mml;
    private ud mo;
    private WeakReference<com.bytedance.sdk.openadsdk.core.exu.ud.mo> mzz;
    protected final ljh qdl;
    private WeakReference<com.bytedance.sdk.openadsdk.core.fs.mo> rdp;
    private com.bytedance.sdk.openadsdk.core.lnr.qdl rq;
    private PAGMediaView to;
    private aaj tvp;
    private final Context ud;
    private com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr wd;

    public qdl(Context context, ljh ljhVar, String str) {
        this.ud = context;
        this.qdl = ljhVar;
        this.lnr = str;
    }

    private PAGMediaView rdp() {
        if (!ljh.mzz(this.qdl)) {
            com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr lnrVar = this.wd;
            if (lnrVar == null) {
                return null;
            }
            aaj aajVarMml = lnrVar.mml();
            aajVarMml.setTag(520093762, Boolean.TRUE);
            if (!this.exu) {
                this.wd.mzz();
            }
            this.exu = true;
            return qdl(aajVarMml);
        }
        com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr lnrVar2 = this.wd;
        if (lnrVar2 == null || !(lnrVar2 instanceof com.bytedance.sdk.openadsdk.qdl.ud.qdl.ud)) {
            return null;
        }
        exc excVar = (exc) lnrVar2.mml();
        excVar.setTag(520093762, Boolean.TRUE);
        if (!this.exu) {
            this.wd.mzz();
        }
        this.exu = true;
        return qdl(excVar);
    }

    public void exu() {
        com.bytedance.sdk.openadsdk.core.fs.mo moVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.fs.mo> weakReference = this.rdp;
        if (weakReference == null || (moVar = weakReference.get()) == null) {
            return;
        }
        moVar.qdl(13);
    }

    public void fs() {
        Context context = this.ud;
        if (context != null) {
            TTWebsiteActivity.qdl(context, this.qdl, this.lnr);
        }
    }

    public PAGMediaView jpc() {
        return this.to;
    }

    public PAGImageItem lnr() {
        ljh ljhVar = this.qdl;
        if (ljhVar == null || ljhVar.hcs() == null) {
            return null;
        }
        return new PAGImageItem(this.qdl.hcs().lnr(), this.qdl.hcs().ud(), this.qdl.hcs().qdl(), (float) this.qdl.hcs().mml());
    }

    public String mml() {
        ljh ljhVar = this.qdl;
        if (ljhVar != null) {
            return qdl(ljhVar);
        }
        return null;
    }

    public String mo() {
        ljh ljhVar = this.qdl;
        if (ljhVar != null) {
            return ljhVar.uvi();
        }
        return null;
    }

    public String mzz() {
        ljh ljhVar = this.qdl;
        if (ljhVar != null) {
            return ud(ljhVar);
        }
        return null;
    }

    public void qdl(ud udVar) {
        this.mo = udVar;
    }

    public View rq() {
        ljh ljhVar;
        if (yt.qdl() == null || (ljhVar = this.qdl) == null || !ljhVar.uj() || !this.qdl.exc()) {
            return null;
        }
        ImageView imageView = new ImageView(yt.qdl());
        com.bytedance.sdk.openadsdk.jl.ud.ud().qdl((int) ax.qdl(yt.qdl(), 14.0f, true), imageView, this.qdl);
        return imageView;
    }

    public View to() {
        if (yt.qdl() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(yt.qdl()) { // from class: com.bytedance.sdk.openadsdk.qdl.ud.qdl.4
            int qdl = 0;
            int ud = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                super.onLayout(z2, i2, i3, i4, i5);
                try {
                    Object parent = getParent();
                    if (parent == null || this.qdl == 0 || this.ud == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i6 = this.qdl;
                    if (width < i6 || height < this.ud) {
                        float fMin = Math.min(height / this.ud, width / i6);
                        int i7 = (width - this.qdl) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i7);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public void onMeasure(int i2, int i3) {
                if (this.qdl == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i3);
                    this.qdl = getMeasuredWidth();
                    this.ud = this.containerHeight;
                }
                setMeasuredDimension(this.qdl, this.ud);
            }
        };
        pAGLogoView.initData(this.qdl);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.qdl.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qdl.this.fs();
            }
        });
        return pAGLogoView;
    }

    public PAGMediaView tvp() {
        if (!ljh.mzz(this.qdl)) {
            List<jl> listVm = this.qdl.vm();
            if (listVm == null || listVm.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.ud);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            jl jlVar = listVm.get(0);
            if (jlVar != null) {
                com.bytedance.sdk.openadsdk.tvp.mml.qdl(jlVar).lnr(1).qdl(com.bytedance.sdk.openadsdk.tvp.lnr.qdl(this.qdl, jlVar.qdl(), imageView));
            }
            PAGMediaView pAGMediaViewQdl = qdl(imageView);
            if (this.rq == null || !rq.lnr().mml(String.valueOf(this.qdl.fz()))) {
                pAGMediaViewQdl.setOnClickListener(null);
                pAGMediaViewQdl.setOnTouchListener(null);
            } else {
                pAGMediaViewQdl.setOnClickListener(this.rq);
                pAGMediaViewQdl.setOnTouchListener(this.rq);
            }
            pAGMediaViewQdl.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.jpc;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.jpc.setOnTouchListener(null);
            }
            this.jpc = pAGMediaViewQdl;
            return pAGMediaViewQdl;
        }
        ud udVar = this.mo;
        if (udVar == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewMzz = udVar.mzz();
        if (viewMzz == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewMzz.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewMzz.getParent()).removeView(viewMzz);
        }
        PAGMediaView pAGMediaView2 = this.jpc;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.jpc.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.ud, viewMzz, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.rq == null || !rq.lnr().mml(String.valueOf(this.qdl.fz()))) {
            com.bytedance.sdk.openadsdk.core.lnr.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.lnr.lnr() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.qdl.2
                @Override // com.bytedance.sdk.openadsdk.core.lnr.lnr
                public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, boolean z2) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(lnrVar);
            pAGVideoMediaView.setOnTouchListener(lnrVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.rq);
            pAGVideoMediaView.setOnTouchListener(this.rq);
        }
        this.jpc = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    public aaj ud() {
        return this.tvp;
    }

    public PAGMediaView wd() {
        PAGMediaView pAGMediaViewTvp;
        com.bytedance.sdk.openadsdk.utils.ud.qdl(this.qdl);
        if (this.qdl.dk() == 2) {
            pAGMediaViewTvp = rdp();
            qdl(pAGMediaViewTvp);
        } else {
            pAGMediaViewTvp = tvp();
        }
        if (pAGMediaViewTvp != null) {
            pAGMediaViewTvp.setMrcTrackerKey(com.bytedance.sdk.openadsdk.bch.ud.mzz.ud(this.qdl));
        } else {
            pAGMediaViewTvp = new PAGMediaView(this.ud) { // from class: com.bytedance.sdk.openadsdk.qdl.ud.qdl.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.mml.qdl(this, qdl.this.qdl);
                }
            };
        }
        if (pAGMediaViewTvp instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewTvp).setMaterialMeta(this.qdl);
        }
        this.to = pAGMediaViewTvp;
        return pAGMediaViewTvp;
    }

    private String ud(ljh ljhVar) {
        if (TextUtils.isEmpty(ljhVar.gsv())) {
            return !TextUtils.isEmpty(ljhVar.hvi()) ? ljhVar.hvi() : "";
        }
        return ljhVar.gsv();
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr lnrVar) {
        this.wd = lnrVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar) {
        this.mzz = new WeakReference<>(moVar);
    }

    public void qdl(boolean z2) {
        this.mml = z2;
    }

    public PAGMediaView qdl() {
        return this.jpc;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar) {
        this.rq = qdlVar;
    }

    private String qdl(ljh ljhVar) {
        if (ljhVar.fhs() != null && !TextUtils.isEmpty(ljhVar.fhs().ud())) {
            return ljhVar.fhs().ud();
        }
        if (!TextUtils.isEmpty(ljhVar.ca())) {
            return ljhVar.ca();
        }
        if (!TextUtils.isEmpty(ljhVar.gsv())) {
            return ljhVar.gsv();
        }
        return "";
    }

    private lnr ud(final PAGVideoAdListener pAGVideoAdListener) {
        return new lnr() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.qdl.6
            @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
            public void lnr(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
            public void qdl(int i2, int i3) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
            public void ud(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.qdl.ud.lnr
            public void qdl(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.ud udVar) {
        this.fs = udVar;
    }

    private void qdl(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView qdl(final View view) {
        int i2;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        aaj aajVar = this.tvp;
        if (aajVar != null) {
            aajVar.setClickListener(null);
            this.tvp.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.lnr.ud udVar = this.fs;
        if (udVar != null && (udVar instanceof tvp) && (view instanceof aaj)) {
            ((aaj) view).setClickListener((tvp) udVar);
        }
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar = this.rq;
        if (qdlVar != null && (qdlVar instanceof com.bytedance.sdk.openadsdk.core.tvp.jpc) && (view instanceof aaj)) {
            ((aaj) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.tvp.jpc) qdlVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.ud) { // from class: com.bytedance.sdk.openadsdk.qdl.ud.qdl.3
            private void qdl(boolean z2) {
                Integer num = this.qdl;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(num), z2 ? 4 : 8);
                }
                ljh ljhVar = qdl.this.qdl;
                if (ljhVar != null) {
                    com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(ljhVar, z2);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.mml.qdl(this, qdl.this.qdl);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z2) {
                super.onWindowFocusChanged(z2);
                if (view instanceof aaj) {
                    return;
                }
                qdl(z2);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                qdl.this.qdl(pAGVideoAdListener);
            }
        };
        int i3 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i3 = layoutParams.width;
            i2 = layoutParams.height;
        } else {
            i2 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, i2);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof aaj) {
            this.tvp = (aaj) view;
        }
        return pAGMediaView;
    }

    public void qdl(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr lnrVar;
        if (this.qdl.dk() == 2 && ljh.mzz(this.qdl) && (lnrVar = this.wd) != null && (lnrVar instanceof com.bytedance.sdk.openadsdk.qdl.ud.qdl.ud)) {
            exc excVar = (exc) lnrVar.mml();
            if (excVar != null) {
                excVar.setVideoAdListener(ud(pAGVideoAdListener));
                return;
            }
            return;
        }
        ud udVar = this.mo;
        if (udVar != null) {
            udVar.qdl(ud(pAGVideoAdListener));
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.fs.mo moVar) {
        this.rdp = new WeakReference<>(moVar);
    }
}
