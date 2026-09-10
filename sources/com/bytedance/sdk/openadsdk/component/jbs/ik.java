package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bu;
import com.bytedance.sdk.openadsdk.core.widget.slm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik extends com.bytedance.sdk.openadsdk.core.di.xha {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.widget.ik f18092co;
    bu di;
    com.bytedance.sdk.openadsdk.core.di.mj fi;
    com.bytedance.sdk.openadsdk.core.di.ka ik;
    bu jbs;
    PAGLogoView ka;
    com.bytedance.sdk.openadsdk.core.di.ik lr;
    final xha mj;
    com.bytedance.sdk.openadsdk.core.di.mj qt;
    com.bytedance.sdk.openadsdk.core.di.ka ri;
    com.bytedance.sdk.openadsdk.core.di.mj sf;
    com.bytedance.sdk.openadsdk.core.di.mj xha;

    public ik(Context context) {
        super(context);
        this.mj = new xha(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.di.ka getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.ka;
    }

    public abstract com.bytedance.sdk.openadsdk.core.di.mj getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.di.ka getBackImage() {
        return this.ri;
    }

    public com.bytedance.sdk.openadsdk.core.di.mj getClickButton() {
        return this.fi;
    }

    public com.bytedance.sdk.openadsdk.core.di.mj getContent() {
        return this.sf;
    }

    public com.bytedance.sdk.openadsdk.core.widget.ik getDspAdChoice() {
        return this.f18092co;
    }

    public bu getHostAppIcon() {
        return this.di;
    }

    public com.bytedance.sdk.openadsdk.core.di.mj getHostAppName() {
        return this.xha;
    }

    public bu getIconOnlyView() {
        return this.jbs;
    }

    public com.bytedance.sdk.openadsdk.core.di.ka getImageView() {
        return this.ik;
    }

    public com.bytedance.sdk.openadsdk.core.di.fi getOverlayLayout() {
        return null;
    }

    public abstract slm getScoreBar();

    public com.bytedance.sdk.openadsdk.core.di.mj getTitle() {
        return this.qt;
    }

    public com.bytedance.sdk.openadsdk.core.di.mj getTopCountDown() {
        xha xhaVar = this.mj;
        if (xhaVar != null) {
            return xhaVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        xha xhaVar = this.mj;
        if (xhaVar != null) {
            return xhaVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.di.ka getTopSkip() {
        xha xhaVar = this.mj;
        if (xhaVar != null) {
            return xhaVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.di.ik getVideoContainer() {
        return this.lr;
    }
}
