package com.mbridge.msdk.newreward.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.player.iview.ICusTemplateView;
import com.mbridge.msdk.newreward.player.presenter.PlayPresenter102;
import com.mbridge.msdk.playercommon.PlayerView;

/* JADX INFO: loaded from: classes2.dex */
public class Template102 extends BaseTemplate implements ICusTemplateView {
    public Template102(@NonNull Context context) {
        super(context);
        PlayPresenter102 playPresenter102 = new PlayPresenter102(this);
        this.presenter = playPresenter102;
        playPresenter102.getView();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.ICusTemplateView
    public void addCTAViewToLayout(View view, int i) {
        FrameLayout frameLayout = this.mCtaLayout;
        if (frameLayout == null) {
            return;
        }
        if (i == 8) {
            frameLayout.setVisibility(i);
            return;
        }
        try {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.mCtaLayout.addView(view);
            this.mCtaLayout.setVisibility(i);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.BaseTemplate
    public void addClickEvent() {
        super.addClickEvent();
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            playerView.setOnClickListener(this);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.ICusTemplateView
    public int getCTAViewState() {
        FrameLayout frameLayout = this.mCtaLayout;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return -1;
    }

    @Override // com.mbridge.msdk.newreward.player.view.BaseTemplate, com.mbridge.msdk.newreward.player.iview.IBaseView
    public void show(ViewGroup viewGroup) {
        super.show(viewGroup);
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    public Template102(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
