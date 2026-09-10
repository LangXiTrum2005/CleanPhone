package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.inner.oo.o0;
import com.thinkup.core.common.inner.ui.BaseScreenTUView;
import com.thinkup.core.common.inner.ui.CloseImageView;
import com.thinkup.core.common.mn.oo.o.oo;
import com.thinkup.core.common.n.nn;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartySelfRenderScreenTUView extends BaseScreenTUView implements oo {
    private static final int mom = 0;
    private static final String moo = "ThirdPartySelfRenderScreenTUView";
    private View mm0;
    private TUNativeAdInfo.AdPrepareInfo mmm;
    private com.thinkup.core.common.mn.oo.o.m mmn;
    private BaseAd mmo;
    private boolean mn0;
    private FrameLayout mnm;
    private boolean mno;
    private View mon;

    public ThirdPartySelfRenderScreenTUView(Context context) {
        super(context);
        this.mn0 = true;
        this.mno = false;
    }

    public static /* synthetic */ boolean m(ThirdPartySelfRenderScreenTUView thirdPartySelfRenderScreenTUView) {
        thirdPartySelfRenderScreenTUView.mno = true;
        return true;
    }

    private View omm() {
        try {
            Context context = getContext();
            CloseImageView closeImageView = new CloseImageView(context, null);
            closeImageView.setBackgroundResource(o00.o(context, "myoffer_base_close_icon", k.d));
            int iO = o00.o(getContext(), 24.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iO, iO);
            layoutParams.gravity = 5;
            int iO2 = o00.o(context, 5.0f);
            if (on0()) {
                layoutParams.topMargin = iO2;
            } else {
                layoutParams.topMargin = o00.m(context) + iO2;
            }
            layoutParams.rightMargin = iO2;
            this.mnm.addView(closeImageView, layoutParams);
            return closeImageView;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private void omn() {
        moo.o(this.mon);
        BaseAd baseAd = this.mmo;
        ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
        try {
            if (this.mon.getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                if (customAdContainer != null) {
                    moo.o((View) customAdContainer);
                    customAdContainer.addView(this.mon);
                    this.mnm.addView(customAdContainer, layoutParams);
                } else {
                    this.mnm.addView(this.mon, layoutParams);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.mon.getLayoutParams();
                if (customAdContainer != null) {
                    moo.o((View) customAdContainer);
                    customAdContainer.addView(this.mon);
                    this.mnm.addView(customAdContainer, layoutParams2);
                } else {
                    this.mnm.addView(this.mon, layoutParams2);
                }
            }
            if (customAdContainer != null) {
                customAdContainer.setBackgroundColor(0);
            }
        } catch (Throwable th) {
            Log.e(moo, "addAdView() >>> failed: " + th.getMessage());
        }
    }

    private boolean on0() {
        oom oomVar = this.onn;
        return oomVar != null && oomVar.m == Integer.parseInt("2");
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView, com.thinkup.core.common.inner.ui.BaseTUView
    public void destroy() {
        super.destroy();
        BaseAd baseAd = this.mmo;
        if (baseAd != null) {
            baseAd.setNativeEventListener(null);
            this.mmo.clear(this);
            this.mmo.destroy();
        }
        RelativeLayout relativeLayout = this.nn;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        removeAllViews();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void init() {
        BaseAd baseAd = this.mmo;
        if (baseAd == null) {
            return;
        }
        baseAd.setNativeEventListener(new nn() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartySelfRenderScreenTUView.1
            @Override // com.thinkup.core.common.n.nn
            public final void o(String str, String str2) {
                ThirdPartySelfRenderScreenTUView.this.o(com.thinkup.core.common.inner.m.m.o(str, str2));
                if (ThirdPartySelfRenderScreenTUView.this.mmn != null) {
                    ThirdPartySelfRenderScreenTUView.this.mmn.onVideoError(str, str2);
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdClicked(View view) {
                if (((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0.m(new com.thinkup.core.common.inner.oo.oo().o(com.thinkup.core.common.inner.mixad.om.m.on, com.thinkup.core.common.inner.mixad.om.m.o));
                }
                if (ThirdPartySelfRenderScreenTUView.this.mmn != null) {
                    ThirdPartySelfRenderScreenTUView.this.mmn.onAdClicked(view);
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdDislikeButtonClick() {
                String unused = ThirdPartySelfRenderScreenTUView.moo;
                if (((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0.o0();
                }
                if (ThirdPartySelfRenderScreenTUView.this.mmn != null) {
                    ThirdPartySelfRenderScreenTUView.this.mmn.onClose();
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdImpressed() {
                if (ThirdPartySelfRenderScreenTUView.this.mno) {
                    return;
                }
                ThirdPartySelfRenderScreenTUView.m(ThirdPartySelfRenderScreenTUView.this);
                if (((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0.o(new com.thinkup.core.common.inner.oo.oo());
                }
                if (ThirdPartySelfRenderScreenTUView.this.mmn != null) {
                    ThirdPartySelfRenderScreenTUView.this.mmn.onAdImpressed();
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoEnd() {
                if (((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0.m();
                }
                if (ThirdPartySelfRenderScreenTUView.this.mmn != null) {
                    ThirdPartySelfRenderScreenTUView.this.mmn.onAdVideoEnd();
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoProgress(int i2) {
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoStart() {
                if (((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0.o();
                }
                if (ThirdPartySelfRenderScreenTUView.this.mmn != null) {
                    ThirdPartySelfRenderScreenTUView.this.mmn.onAdVideoStart();
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onDeeplinkCallback(boolean z2) {
                if (((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartySelfRenderScreenTUView.this).om0.o(z2);
                }
                if (ThirdPartySelfRenderScreenTUView.this.mmn != null) {
                    ThirdPartySelfRenderScreenTUView.this.mmn.onDeeplinkCallback(z2);
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
            }
        });
        this.mmo.registerListener(this.mnm, this.mmm);
        View view = this.mm0;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartySelfRenderScreenTUView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ThirdPartySelfRenderScreenTUView.this.n0();
                }
            });
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o() {
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o00() {
        TUNativeAdInfo.AdPrepareInfo adPrepareInfo = this.mmm;
        if (adPrepareInfo == null) {
            return;
        }
        View closeView = adPrepareInfo.getCloseView();
        if (closeView == null && (!on0() || this.mn0)) {
            closeView = omm();
        }
        this.mm0 = closeView;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o0o() {
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final int on() {
        return 0;
    }

    public void setMixNativeAdEventListener(com.thinkup.core.common.mn.oo.o.m mVar) {
        this.mmn = mVar;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void n0() {
        o0 o0Var = this.om0;
        if (o0Var != null) {
            o0Var.o0();
        }
        com.thinkup.core.common.mn.oo.o.m mVar = this.mmn;
        if (mVar != null) {
            mVar.onClose();
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final boolean o(int i2) {
        return false;
    }

    public ThirdPartySelfRenderScreenTUView(Context context, oom oomVar, ooo oooVar, String str, int i2, int i3, BaseAd baseAd, View view, TUNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        super(context, oomVar, oooVar, str, i2, i3);
        this.mn0 = true;
        this.mno = false;
        this.mnm = new FrameLayout(getContext());
        this.mnm.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (adPrepareInfo != null) {
            this.mmm = adPrepareInfo;
        } else {
            this.mmm = new TUNativeAdInfo.AdPrepareInfo();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o00.o(context, 32.0f), o00.o(context, 8.0f));
            layoutParams.gravity = 85;
            this.mmm.setChoiceViewLayoutParams(layoutParams);
        }
        if (oomVar != null) {
            oon oonVar = oomVar.oo0;
            if (oonVar instanceof com.thinkup.core.common.inner.mixad.oo.n) {
                this.mn0 = ((com.thinkup.core.common.inner.mixad.oo.n) oonVar).nno();
            }
        }
        this.mon = view;
        this.mmo = baseAd;
        moo.o(view);
        BaseAd baseAd2 = this.mmo;
        ViewGroup customAdContainer = baseAd2 != null ? baseAd2.getCustomAdContainer() : null;
        try {
            if (this.mon.getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 17;
                if (customAdContainer != null) {
                    moo.o((View) customAdContainer);
                    customAdContainer.addView(this.mon);
                    this.mnm.addView(customAdContainer, layoutParams2);
                } else {
                    this.mnm.addView(this.mon, layoutParams2);
                }
            } else {
                ViewGroup.LayoutParams layoutParams3 = this.mon.getLayoutParams();
                if (customAdContainer != null) {
                    moo.o((View) customAdContainer);
                    customAdContainer.addView(this.mon);
                    this.mnm.addView(customAdContainer, layoutParams3);
                } else {
                    this.mnm.addView(this.mon, layoutParams3);
                }
            }
            if (customAdContainer != null) {
                customAdContainer.setBackgroundColor(0);
            }
        } catch (Throwable th) {
            Log.e(moo, "addAdView() >>> failed: " + th.getMessage());
        }
        o00();
        setBackgroundColor(0);
        addView(this.mnm);
    }

    private void o(Context context, oom oomVar, TUNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        if (adPrepareInfo != null) {
            this.mmm = adPrepareInfo;
        } else {
            this.mmm = new TUNativeAdInfo.AdPrepareInfo();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o00.o(context, 32.0f), o00.o(context, 8.0f));
            layoutParams.gravity = 85;
            this.mmm.setChoiceViewLayoutParams(layoutParams);
        }
        if (oomVar != null) {
            oon oonVar = oomVar.oo0;
            if (oonVar instanceof com.thinkup.core.common.inner.mixad.oo.n) {
                this.mn0 = ((com.thinkup.core.common.inner.mixad.oo.n) oonVar).nno();
            }
        }
    }
}
