package com.bytedance.sdk.openadsdk.component.tvp;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jtx;
import com.bytedance.sdk.openadsdk.core.widget.yt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lnr extends com.bytedance.sdk.openadsdk.core.mo.wd {
    com.bytedance.sdk.openadsdk.core.widget.lnr fs;
    final wd jpc;
    com.bytedance.sdk.openadsdk.core.mo.mml lnr;
    PAGLogoView mml;
    yt mo;
    com.bytedance.sdk.openadsdk.core.mo.jpc mzz;
    com.bytedance.sdk.openadsdk.core.mo.mml qdl;
    com.bytedance.sdk.openadsdk.core.mo.jpc rq;
    com.bytedance.sdk.openadsdk.core.mo.jpc to;
    yt tvp;
    com.bytedance.sdk.openadsdk.core.mo.lnr ud;
    com.bytedance.sdk.openadsdk.core.mo.jpc wd;

    public lnr(Context context) {
        super(context);
        this.jpc = new wd(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.mo.mml getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.mml;
    }

    public abstract com.bytedance.sdk.openadsdk.core.mo.jpc getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.mo.mml getBackImage() {
        return this.qdl;
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc getClickButton() {
        return this.mzz;
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc getContent() {
        return this.rq;
    }

    public com.bytedance.sdk.openadsdk.core.widget.lnr getDspAdChoice() {
        return this.fs;
    }

    public yt getHostAppIcon() {
        return this.mo;
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc getHostAppName() {
        return this.wd;
    }

    public yt getIconOnlyView() {
        return this.tvp;
    }

    public com.bytedance.sdk.openadsdk.core.mo.mml getImageView() {
        return this.lnr;
    }

    public com.bytedance.sdk.openadsdk.core.mo.mzz getOverlayLayout() {
        return null;
    }

    public abstract jtx getScoreBar();

    public com.bytedance.sdk.openadsdk.core.mo.jpc getTitle() {
        return this.to;
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc getTopCountDown() {
        wd wdVar = this.jpc;
        if (wdVar != null) {
            return wdVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        wd wdVar = this.jpc;
        if (wdVar != null) {
            return wdVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.mo.mml getTopSkip() {
        wd wdVar = this.jpc;
        if (wdVar != null) {
            return wdVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.mo.lnr getVideoContainer() {
        return this.ud;
    }
}
