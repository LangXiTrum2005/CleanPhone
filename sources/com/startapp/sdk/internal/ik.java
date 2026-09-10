package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ik implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotDisplayedReason f41119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f41120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.ads.nativead.f f41121c;
    public final Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f41122e;
    public final Point f;
    public final ag g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BannerOptions f41123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41124i;

    public ik(View view, Point point, ag agVar, BannerOptions bannerOptions) {
        this.f41119a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.d = new Handler(Looper.getMainLooper());
        this.f41124i = true;
        this.f41122e = new WeakReference(view);
        this.f = point;
        this.g = agVar;
        this.f41123h = bannerOptions;
    }

    public final void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            ag agVar = this.g;
            if (agVar != null && (notDisplayedReason = this.f41119a) != null) {
                agVar.a(notDisplayedReason.toString(), this.f41120b);
            }
            this.d.removeCallbacksAndMessages(null);
        } catch (Throwable unused) {
        }
    }

    public final boolean b() {
        NotDisplayedReason notDisplayedReason;
        AtomicReference atomicReference = new AtomicReference();
        NotDisplayedReason notDisplayedReason2 = hk.a((View) this.f41122e.get(), this.f, this.f41123h, atomicReference, false).d;
        if (notDisplayedReason2 != null && ((notDisplayedReason = this.f41119a) == null || notDisplayedReason.a() <= notDisplayedReason2.a())) {
            this.f41119a = notDisplayedReason2;
            this.f41120b = (JSONObject) atomicReference.get();
        }
        return notDisplayedReason2 == null;
    }

    public final boolean c() {
        ag agVar = this.g;
        return (agVar == null || agVar.j.get() != 0 || this.f41122e.get() == null) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                a();
                return;
            }
            boolean zB = b();
            if (zB && this.f41124i) {
                this.f41124i = false;
                this.g.c();
            } else if (!zB && !this.f41124i) {
                this.f41124i = true;
                this.g.a();
                com.startapp.sdk.ads.nativead.f fVar = this.f41121c;
                if (fVar != null) {
                    fVar.a();
                }
            }
            this.d.postDelayed(this, 100L);
        } catch (Throwable unused) {
            this.f41119a = NotDisplayedReason.INTERNAL_ERROR;
            a();
        }
    }

    public ik(WeakReference weakReference, ag agVar, BannerOptions bannerOptions) {
        this.f41119a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.d = new Handler(Looper.getMainLooper());
        this.f41124i = true;
        this.f41122e = weakReference;
        this.f = null;
        this.g = agVar;
        this.f41123h = bannerOptions;
    }
}
