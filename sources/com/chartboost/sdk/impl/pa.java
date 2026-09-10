package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pa extends e2 {
    public final InterstitialCallback o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f14827p;

    public static final class a implements InterstitialCallback {
        public a() {
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.f(event, "event");
            pa.this.a(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(DismissEvent event) {
            Intrinsics.f(event, "event");
            ((InterstitialCallback) pa.this.k()).onAdDismiss(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.f(event, "event");
            pa.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.f(event, "event");
            pa.this.a(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.f(event, "event");
            pa.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.f(event, "event");
            pa.this.a(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.f(event, "event");
            pa.this.a(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(oa api, InterstitialCallback callback, Interstitial interstitial, u5 dependencyContainer) {
        super(interstitial, api, callback, dependencyContainer, new j(r.INTERSTITIAL, null, 2, null));
        Intrinsics.f(api, "api");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(interstitial, "interstitial");
        Intrinsics.f(dependencyContainer, "dependencyContainer");
        this.o = new a();
        this.f14827p = e2.a(this, (DismissibleAdCallback) k(), null, 2, null);
    }

    @Override // com.chartboost.sdk.impl.e2
    public void a(String str) {
        ((oa) h()).a((Interstitial) e(), i(), str);
    }

    @Override // com.chartboost.sdk.impl.e2
    public Object b(Context context, Continuation continuation) {
        ((oa) h()).b((Interstitial) e(), i());
        return null;
    }

    @Override // com.chartboost.sdk.impl.e2
    public l f() {
        return this.f14827p;
    }

    @Override // com.chartboost.sdk.impl.e2
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public InterstitialCallback i() {
        return this.o;
    }
}
