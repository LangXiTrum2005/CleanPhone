package com.bytedance.sdk.openadsdk.component.QAg;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.VVE;
import com.bytedance.sdk.openadsdk.core.widget.kqm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lk extends com.bytedance.sdk.openadsdk.core.JXs.ebl {
    com.bytedance.sdk.openadsdk.core.JXs.OY JVA;
    com.bytedance.sdk.openadsdk.core.JXs.OY JXs;
    com.bytedance.sdk.openadsdk.core.JXs.lk LD;
    com.bytedance.sdk.openadsdk.core.JXs.ZU Lxb;
    final ebl OY;
    kqm QAg;
    PAGLogoView ZU;
    com.bytedance.sdk.openadsdk.core.JXs.OY ebl;
    kqm lc;
    com.bytedance.sdk.openadsdk.core.JXs.ZU lk;
    com.bytedance.sdk.openadsdk.core.JXs.OY nBu;
    com.bytedance.sdk.openadsdk.core.widget.lk sLN;

    public lk(Context context) {
        super(context);
        this.OY = new ebl(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.JXs.ZU getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.ZU;
    }

    public abstract com.bytedance.sdk.openadsdk.core.JXs.OY getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.JXs.ZU getBackImage() {
        return this.Lxb;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.OY getClickButton() {
        return this.JXs;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.OY getContent() {
        return this.JVA;
    }

    public com.bytedance.sdk.openadsdk.core.widget.lk getDspAdChoice() {
        return this.sLN;
    }

    public kqm getHostAppIcon() {
        return this.lc;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.OY getHostAppName() {
        return this.ebl;
    }

    public kqm getIconOnlyView() {
        return this.QAg;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.ZU getImageView() {
        return this.lk;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.JXs getOverlayLayout() {
        return null;
    }

    public abstract VVE getScoreBar();

    public com.bytedance.sdk.openadsdk.core.JXs.OY getTitle() {
        return this.nBu;
    }

    public View getTopDisLike() {
        ebl eblVar = this.OY;
        if (eblVar != null) {
            return eblVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.ZU getTopSkip() {
        ebl eblVar = this.OY;
        if (eblVar != null) {
            return eblVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.JXs.lk getVideoContainer() {
        return this.LD;
    }
}
