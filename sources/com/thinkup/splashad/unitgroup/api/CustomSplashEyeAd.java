package com.thinkup.splashad.unitgroup.api;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.splashad.api.ITUSplashEyeAd;
import com.thinkup.splashad.api.TUSplashEyeAdListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CustomSplashEyeAd implements ITUSplashEyeAd {
    protected TUBaseAdAdapter mAtBaseAdAdapter;
    protected ViewGroup mEyeAdContainer;
    protected View mSplashView;
    protected TUSplashEyeAdListener mTUSplashEyeAdListener;

    public CustomSplashEyeAd(TUBaseAdAdapter tUBaseAdAdapter) {
        this.mAtBaseAdAdapter = tUBaseAdAdapter;
    }

    public abstract void customResourceDestory();

    @Override // com.thinkup.splashad.api.ITUSplashEyeAd
    public final void destroy() {
        try {
            TUBaseAdAdapter tUBaseAdAdapter = this.mAtBaseAdAdapter;
            if (tUBaseAdAdapter != null) {
                if (tUBaseAdAdapter instanceof CustomSplashAdapter) {
                    ((CustomSplashAdapter) tUBaseAdAdapter).cleanImpressionListener();
                }
                this.mAtBaseAdAdapter.internalDestory();
                this.mAtBaseAdAdapter = null;
            }
            this.mTUSplashEyeAdListener = null;
            View view = this.mSplashView;
            if (view != null) {
                if (view.getParent() != null) {
                    ((ViewGroup) this.mSplashView.getParent()).removeView(this.mSplashView);
                }
                this.mSplashView = null;
            }
            ViewGroup viewGroup = this.mEyeAdContainer;
            if (viewGroup != null) {
                if (viewGroup.getParent() != null) {
                    ((ViewGroup) this.mEyeAdContainer.getParent()).removeView(this.mEyeAdContainer);
                }
                this.mEyeAdContainer = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            customResourceDestory();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public TUSplashEyeAdListener getSplashEyeAdListener() {
        return this.mTUSplashEyeAdListener;
    }

    @Override // com.thinkup.splashad.api.ITUSplashEyeAd
    public void setEyeAdContainer(ViewGroup viewGroup) {
        this.mEyeAdContainer = viewGroup;
    }

    public void setSplashView(View view) {
        this.mSplashView = view;
    }

    public abstract void show(Context context, Rect rect);

    @Override // com.thinkup.splashad.api.ITUSplashEyeAd
    public final void show(Context context, Rect rect, TUSplashEyeAdListener tUSplashEyeAdListener) {
        this.mTUSplashEyeAdListener = tUSplashEyeAdListener;
        show(context, rect);
    }
}
