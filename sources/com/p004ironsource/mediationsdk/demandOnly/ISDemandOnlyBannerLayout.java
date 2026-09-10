package com.p004ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.s5;

/* JADX INFO: loaded from: classes5.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f25791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ISBannerSize f25792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25793c;
    private Activity d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25794e;
    private s5 f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f25796b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f25795a = view;
            this.f25796b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f25795a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f25795a);
            }
            ISDemandOnlyBannerLayout.this.f25791a = this.f25795a;
            ISDemandOnlyBannerLayout.this.addView(this.f25795a, 0, this.f25796b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f25794e = false;
        this.d = activity;
        this.f25792b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f = new s5();
    }

    public Activity getActivity() {
        return this.d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f.a();
    }

    public View getBannerView() {
        return this.f25791a;
    }

    public s5 getListener() {
        return this.f;
    }

    public String getPlacementName() {
        return this.f25793c;
    }

    public ISBannerSize getSize() {
        return this.f25792b;
    }

    public boolean isDestroyed() {
        return this.f25794e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f.b((Object) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f.b(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f25793c = str;
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f25794e = false;
    }

    public void a() {
        this.f25794e = true;
        this.d = null;
        this.f25792b = null;
        this.f25793c = null;
        this.f25791a = null;
        removeBannerListener();
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }
}
