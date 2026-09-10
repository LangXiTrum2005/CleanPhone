package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.common.inner.ui.BaseMediaTUView;
import com.thinkup.core.common.inner.ui.MediaTUView;
import com.thinkup.core.common.mn.oo.o.o0;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ui.component.RoundImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartyNativeTemplateView extends MediaTUView implements o0 {
    TUNativeAdInfo.AdPrepareInfo o0m;
    private BaseAd o0n;

    public ThirdPartyNativeTemplateView(Context context, ooo oooVar, oom oomVar, boolean z2, BaseMediaTUView.o oVar, BaseAd baseAd) {
        super(context, oooVar, oomVar, z2, oVar);
        this.o0n = baseAd;
    }

    @Override // com.thinkup.core.common.mn.oo.o.o0
    public void destroyNativeAd() {
    }

    public TUNativeAdInfo.AdPrepareInfo getAdPrepareInfo() {
        return this.o0m;
    }

    @Override // com.thinkup.core.common.inner.ui.MediaTUView, com.thinkup.core.common.inner.ui.BaseMediaTUView
    public void init(int i2, int i3, int i4) {
        super.init(i2, i3, i4);
        TUNativeAdInfo.AdPrepareInfo adPrepareInfo = new TUNativeAdInfo.AdPrepareInfo();
        this.o0m = adPrepareInfo;
        adPrepareInfo.setTitleView(((MediaTUView) this).mm);
        this.o0m.setDescView(this.nn);
        this.o0m.setIconView(this.nm);
        this.o0m.setMainImageView(this.no);
        this.o0m.setCtaView(((MediaTUView) this).mn);
        this.o0m.setParentView(this);
        this.o0m.setCloseView(this.on);
        this.o0m.setAdLogoView(this.o00);
        this.o0m.getClickViewList().clear();
        ArrayList arrayList = new ArrayList();
        arrayList.add(((MediaTUView) this).mn);
        if (this.f41836n.oo0.o0o() == 0) {
            arrayList.add(((MediaTUView) this).mm);
            arrayList.add(this.nn);
            arrayList.add(this.nm);
            arrayList.add(this.no);
            arrayList.add(this);
        }
        this.o0m.setClickViewList(arrayList);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o00.o(getContext(), 32.0f), o00.o(getContext(), 12.0f));
        layoutParams.gravity = 85;
        this.o0m.setChoiceViewLayoutParams(layoutParams);
        View adIconView = this.o0n.getAdIconView();
        RoundImageView roundImageView = this.nm;
        if (roundImageView != null && adIconView != null) {
            if (roundImageView.getParent() != null && (this.nm.getParent() instanceof ViewGroup)) {
                moo.o(adIconView);
                this.nm.setVisibility(0);
                ((ViewGroup) this.nm.getParent()).addView(adIconView, this.nm.getLayoutParams());
            }
            if (this.f41836n.oo0.o0o() != 0) {
                n.o(adIconView);
            }
        }
        View adLogoView = this.o0n.getAdLogoView();
        ImageView imageView = this.o00;
        if (imageView != null && adLogoView != null && imageView.getParent() != null && (this.o00.getParent() instanceof ViewGroup)) {
            moo.o(adLogoView);
            this.o00.setVisibility(4);
            ((ViewGroup) this.o00.getParent()).addView(adLogoView, this.o00.getLayoutParams());
        }
        if (this.mo != null) {
            com.thinkup.core.basead.m.o0 o0Var = new com.thinkup.core.basead.m.o0();
            this.mo.o(this.o0n, o0Var, true);
            this.o0m.setDomainView(o0Var.m0());
            this.o0m.setWarningView(o0Var.mo());
            this.o0m.setAdFromView(o0Var.om());
        }
    }

    @Override // com.thinkup.core.common.inner.ui.MediaTUView
    public final void o(int i2, int i3) {
        ViewGroup viewGroup = (ViewGroup) findViewById(o00.o(getContext(), "myoffer_media_ad_main_image_container", "id"));
        View adMediaView = this.o0n.getAdMediaView(viewGroup);
        if (viewGroup == null || adMediaView == null) {
            super.o(i2, i3);
        } else {
            if (this.f41836n.oo0.o0o() != 0) {
                n.o(adMediaView);
            }
            moo.o(adMediaView);
            viewGroup.addView(adMediaView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.o0n.setVideoMute(true);
        View viewFindViewById = findViewById(o00.o(getContext(), "myoffer_ad_lable", "id"));
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.MediaTUView
    public final boolean o() {
        return this.o0n.getAdIconView() == null && super.o();
    }
}
