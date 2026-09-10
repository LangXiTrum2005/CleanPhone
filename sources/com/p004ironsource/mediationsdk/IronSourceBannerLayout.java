package com.p004ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.p004ironsource.t5;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class IronSourceBannerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ISBannerSize f25716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f25718c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f25719e;

    public interface a {
        void onWindowFocusChanged(boolean z2);
    }

    @Deprecated
    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.d = false;
        this.f25718c = activity;
        this.f25716a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public void a() {
        this.d = true;
        this.f25718c = null;
        this.f25716a = null;
        this.f25717b = null;
        this.f25719e = null;
        removeBannerListener();
    }

    public IronSourceBannerLayout b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(getContext(), this.f25716a);
        ironSourceBannerLayout.setPlacementName(this.f25717b);
        return ironSourceBannerLayout;
    }

    @Deprecated
    public Activity getActivity() {
        return this.f25718c;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return t5.a().b();
    }

    public String getPlacementName() {
        return this.f25717b;
    }

    public ISBannerSize getSize() {
        return this.f25716a;
    }

    public a getWindowFocusChangedListener() {
        return this.f25719e;
    }

    public boolean isDestroyed() {
        return this.d;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        a aVar = this.f25719e;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z2);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        t5.a().a((LevelPlayBannerListener) null);
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f25716a = iSBannerSize;
    }

    @Deprecated
    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info();
        t5.a().a(levelPlayBannerListener);
    }

    public void setPlacementName(String str) {
        this.f25717b = str;
    }

    public void setWindowFocusChangedListener(a aVar) {
        this.f25719e = aVar;
    }

    public IronSourceBannerLayout(Context context) {
        super(context);
        this.d = false;
    }

    public IronSourceBannerLayout(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.d = false;
        this.f25716a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }
}
