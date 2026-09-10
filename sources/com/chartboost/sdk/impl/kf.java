package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class kf extends e2 {
    public final RewardedCallback o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f14356p;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        public final void a() {
            RewardedCallback rewardedCallback = (RewardedCallback) kf.this.k();
            ya yaVarF = kf.this.g().f();
            rewardedCallback.onRewardEarned(new RewardEvent(yaVarF != null ? yaVarF.b() : null, kf.this.e(), 0));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class b implements RewardedCallback {
        public b() {
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.f(event, "event");
            kf.this.a(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(DismissEvent event) {
            Intrinsics.f(event, "event");
            ((RewardedCallback) kf.this.k()).onAdDismiss(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.f(event, "event");
            kf.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.f(event, "event");
            kf.this.a(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.f(event, "event");
            kf.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.f(event, "event");
            kf.this.a(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.f(event, "event");
            kf.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.RewardedCallback
        public void onRewardEarned(RewardEvent event) {
            Intrinsics.f(event, "event");
            ((RewardedCallback) kf.this.k()).onRewardEarned(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(jf api, RewardedCallback callback, Rewarded rewarded, u5 dependencyContainer) {
        super(rewarded, api, callback, dependencyContainer, new j(r.REWARDED, null, 2, null));
        Intrinsics.f(api, "api");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(rewarded, "rewarded");
        Intrinsics.f(dependencyContainer, "dependencyContainer");
        this.o = new b();
        this.f14356p = a((DismissibleAdCallback) k(), new a());
    }

    @Override // com.chartboost.sdk.impl.e2
    public void a(String str) {
        ((jf) h()).a((Rewarded) e(), i(), str);
    }

    @Override // com.chartboost.sdk.impl.e2
    public Object b(Context context, Continuation continuation) {
        ((jf) h()).b((Rewarded) e(), i());
        return null;
    }

    @Override // com.chartboost.sdk.impl.e2
    public l f() {
        return this.f14356p;
    }

    @Override // com.chartboost.sdk.impl.e2
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public RewardedCallback i() {
        return this.o;
    }
}
