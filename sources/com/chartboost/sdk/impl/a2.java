package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import java.net.URL;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends e2 {
    public vj o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BannerCallback f13394p;
    public final l q;

    public static final class a implements BannerCallback {
        public a() {
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.f(event, "event");
            a2.this.a(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.f(event, "event");
            a2.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.f(event, "event");
            a2.this.a(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.f(event, "event");
            a2.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.f(event, "event");
            a2.this.a(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.f(event, "event");
            a2.this.a(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(z1 api, BannerCallback callback, Banner banner, u5 dependencyContainer) {
        super(banner, api, callback, dependencyContainer, new j(r.BANNER, null, 2, null));
        Intrinsics.f(api, "api");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(banner, "banner");
        Intrinsics.f(dependencyContainer, "dependencyContainer");
        this.f13394p = new a();
        this.q = new e2.b();
    }

    @Override // com.chartboost.sdk.impl.e2
    public void a(View view, ShowEvent showEvent) {
        Intrinsics.f(showEvent, "showEvent");
        Unit unit = null;
        if (view != null) {
            ((BannerCallback) k()).onAdShown(showEvent, null);
            vj vjVar = this.o;
            if (vjVar != null) {
                vjVar.b();
            }
            Context context = ((Banner) e()).getContext();
            Intrinsics.e(context, "getContext(...)");
            View viewA = vj.r.a(((Banner) e()).getContext(), view);
            if (viewA == null) {
                viewA = view.getRootView();
            }
            View view2 = viewA;
            Intrinsics.c(view2);
            vj vjVar2 = new vj(context, view, view2, 1, 0, 100L, 25, false, 128, null);
            this.o = vjVar2;
            vjVar2.a(new p008p.b(0, this, showEvent));
            vj vjVar3 = this.o;
            if (vjVar3 != null) {
                vjVar3.i();
            }
            ((Banner) e()).removeAllViews();
            ((Banner) e()).addView(view);
            unit = Unit.f43263a;
        }
        if (unit == null) {
            a(ChartboostError.Show.NoAd.INSTANCE, showEvent);
        }
    }

    @Override // com.chartboost.sdk.impl.e2, com.chartboost.sdk.impl.p8
    public void b() {
        vj vjVar = this.o;
        if (vjVar != null) {
            vjVar.b();
        }
        this.o = null;
        ((z1) h()).d();
        super.b();
    }

    @Override // com.chartboost.sdk.impl.e2
    public l f() {
        return this.q;
    }

    @Override // com.chartboost.sdk.impl.e2
    public URL l() {
        return null;
    }

    @Override // com.chartboost.sdk.impl.e2
    public void o() {
        BannerCallback bannerCallbackI = i();
        ya yaVarF = g().f();
        bannerCallbackI.onAdLoaded(new CacheEvent(yaVarF != null ? yaVarF.b() : null, e()), null);
    }

    @Override // com.chartboost.sdk.impl.e2
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public BannerCallback i() {
        return this.f13394p;
    }

    @Override // com.chartboost.sdk.impl.e2
    public Object b(Context context, Continuation continuation) {
        ((z1) h()).b((Banner) e(), i());
        return e();
    }

    public static final void a(a2 this$0, ShowEvent showEvent) {
        Unit unit;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(showEvent, "$showEvent");
        ((BannerCallback) this$0.k()).onImpressionRecorded(new ImpressionEvent(showEvent.getAdID(), this$0.e()));
        ya yaVarF = this$0.g().f();
        if (yaVarF != null) {
            this$0.g().c(yaVarF);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.e("Cannot track impression: currentAd is null for location " + ((Banner) this$0.e()).getLocation(), null, 2, null);
        }
    }

    @Override // com.chartboost.sdk.impl.e2
    public void a(String str) {
        ((z1) h()).a((Banner) e(), i(), str);
    }

    @Override // com.chartboost.sdk.impl.e2
    public void a(Context context) {
        Intrinsics.f(context, "context");
        ((z1) h()).a((Banner) e());
    }
}
