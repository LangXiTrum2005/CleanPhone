package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.Ba;
import com.ironsource.C0651x2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class o extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ISBannerSize f29636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f29639d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void onWindowFocusChanged(boolean z10);
    }

    public o(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f29638c = false;
        this.f29636a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public void a() {
        this.f29638c = true;
        this.f29636a = null;
        this.f29637b = null;
        this.f29639d = null;
        C0651x2.a().a((Ba) null);
    }

    public boolean b() {
        return this.f29638c;
    }

    public o c() {
        o oVar = new o(getContext(), this.f29636a);
        oVar.f29637b = this.f29637b;
        return oVar;
    }

    public ISBannerSize getSize() {
        return this.f29636a;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.f29639d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z10);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f29636a = iSBannerSize;
    }

    public o(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f29638c = false;
        this.f29636a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public o(Context context) {
        super(context);
        this.f29638c = false;
    }
}
