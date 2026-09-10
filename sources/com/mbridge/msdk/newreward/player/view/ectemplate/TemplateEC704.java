package com.mbridge.msdk.newreward.player.view.ectemplate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.player.iview.ICusECTemplateView;
import com.mbridge.msdk.newreward.player.presenter.ECPresenter704;

/* JADX INFO: loaded from: classes2.dex */
public class TemplateEC704 extends BaseECTemplate implements ICusECTemplateView {
    public TemplateEC704(@NonNull Context context) throws Throwable {
        super(context);
        ECPresenter704 eCPresenter704 = new ECPresenter704(this);
        this.ecPresenter = eCPresenter704;
        eCPresenter704.getView();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IECTempleView
    public void addShakeView(View view) {
        if (view != null) {
            View view2 = this.ctaView;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            RelativeLayout relativeLayout = this.nativeECLayout;
            if (relativeLayout != null) {
                relativeLayout.addView(view);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.iview.ICusECTemplateView
    public void reSetEndCardWidthAndHeight(final int i) {
        post(new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.ectemplate.TemplateEC704.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) TemplateEC704.this.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.setMargins(0, 0, 0, i);
                        TemplateEC704.this.setLayoutParams(layoutParams);
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newreward.player.view.ectemplate.BaseECTemplate, com.mbridge.msdk.newreward.player.iview.IBaseView
    public void show(ViewGroup viewGroup) {
        super.show(viewGroup);
        ((ECPresenter704) this.ecPresenter).addMoreOfferView(this);
    }

    public TemplateEC704(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
