package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C0633w2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f29372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ISBannerSize f29373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f29375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0633w2 f29377f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f29379b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f29378a = view;
            this.f29379b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f29378a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f29378a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f29378a;
            iSDemandOnlyBannerLayout.f29372a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f29379b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f29376e = false;
        this.f29375d = activity;
        this.f29373b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f29377f = new C0633w2();
    }

    public Activity getActivity() {
        return this.f29375d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f29377f.a();
    }

    public View getBannerView() {
        return this.f29372a;
    }

    public C0633w2 getListener() {
        return this.f29377f;
    }

    public String getPlacementName() {
        return this.f29374c;
    }

    public ISBannerSize getSize() {
        return this.f29373b;
    }

    public boolean isDestroyed() {
        return this.f29376e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f29377f.b((Object) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f29377f.b(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f29374c = str;
    }

    public void a() {
        this.f29376e = true;
        this.f29375d = null;
        this.f29373b = null;
        this.f29374c = null;
        this.f29372a = null;
        removeBannerListener();
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f29376e = false;
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }
}
