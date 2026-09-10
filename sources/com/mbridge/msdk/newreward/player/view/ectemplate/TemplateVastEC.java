package com.mbridge.msdk.newreward.player.view.ectemplate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.presenter.ECVastPresenter;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes2.dex */
public class TemplateVastEC extends FrameLayout implements IBaseView {
    private final String TAG;
    private final View.OnClickListener buttonClickListener;
    ImageView closeImageView;
    ImageView confirmImageView;
    ECVastPresenter mVastPresenter;

    public TemplateVastEC(@NonNull Context context) {
        super(context);
        this.TAG = "TemplateVastEC";
        this.buttonClickListener = new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.TemplateVastEC.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ECVastPresenter eCVastPresenter = TemplateVastEC.this.mVastPresenter;
                if (eCVastPresenter != null) {
                    eCVastPresenter.click(view);
                }
            }
        };
        initPresenter();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void addViewToCurrentViewGroup(View view) {
    }

    public void initPresenter() {
        ECVastPresenter eCVastPresenter = new ECVastPresenter(this);
        this.mVastPresenter = eCVastPresenter;
        eCVastPresenter.getView();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public boolean initViews(boolean z) {
        setBackgroundColor(-1442840576);
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.TemplateVastEC.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        View viewInflate = LayoutInflater.from(getContext()).inflate(g0.a(getContext(), "mbridge_reward_endcard_vast", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        if (viewInflate != null) {
            this.closeImageView = (ImageView) viewInflate.findViewById(g0.a(getContext(), "mbridge_iv_vastclose", "id"));
            this.confirmImageView = (ImageView) viewInflate.findViewById(g0.a(getContext(), "mbridge_iv_vastok", "id"));
            ImageView imageView = this.closeImageView;
            if (imageView != null) {
                imageView.setOnClickListener(this.buttonClickListener);
            }
            ImageView imageView2 = this.confirmImageView;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this.buttonClickListener);
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void onActivityLifeCycleCallback(String str) {
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void removeTempleFromSuperView(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void show(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.addView(this);
        }
    }

    public TemplateVastEC(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "TemplateVastEC";
        this.buttonClickListener = new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.TemplateVastEC.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ECVastPresenter eCVastPresenter = TemplateVastEC.this.mVastPresenter;
                if (eCVastPresenter != null) {
                    eCVastPresenter.click(view);
                }
            }
        };
        initPresenter();
    }

    public TemplateVastEC(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "TemplateVastEC";
        this.buttonClickListener = new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.TemplateVastEC.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ECVastPresenter eCVastPresenter = TemplateVastEC.this.mVastPresenter;
                if (eCVastPresenter != null) {
                    eCVastPresenter.click(view);
                }
            }
        };
        initPresenter();
    }

    @RequiresApi(api = 21)
    public TemplateVastEC(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.TAG = "TemplateVastEC";
        this.buttonClickListener = new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.TemplateVastEC.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ECVastPresenter eCVastPresenter = TemplateVastEC.this.mVastPresenter;
                if (eCVastPresenter != null) {
                    eCVastPresenter.click(view);
                }
            }
        };
        initPresenter();
    }
}
