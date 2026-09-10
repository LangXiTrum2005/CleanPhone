package com.chartboost.sdk.ads;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.impl.a5;
import com.chartboost.sdk.impl.jf;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.kf;
import com.chartboost.sdk.impl.p8;
import com.chartboost.sdk.impl.w3;
import com.chartboost.sdk.impl.za;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/chartboost/sdk/ads/Rewarded;", "Lcom/chartboost/sdk/ads/Ad;", "", "postSessionNotStartedInMainThread", "()V", com.smartdigimkt.q0.b.O, "", "bidResponse", "(Ljava/lang/String;)V", "show", "clearCache", "", "isCached", "()Z", "location", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "Lcom/chartboost/sdk/callbacks/RewardedCallback;", "callback", "Lcom/chartboost/sdk/callbacks/RewardedCallback;", "Lcom/chartboost/sdk/Mediation;", "mediation", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "Lcom/chartboost/sdk/impl/jf;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/chartboost/sdk/impl/jf;", "api", "Lcom/chartboost/sdk/impl/p8;", "adController", "Lcom/chartboost/sdk/impl/p8;", "<init>", "(Ljava/lang/String;Lcom/chartboost/sdk/callbacks/RewardedCallback;Lcom/chartboost/sdk/Mediation;)V", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class Rewarded implements Ad {
    private final p8 adController;

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    private final Lazy api;
    private final RewardedCallback callback;
    private final String location;
    private final Mediation mediation;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jf invoke() {
            return k.c(Rewarded.this.getMediation());
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13376b;
        public final /* synthetic */ Context d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f13378e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.d = context;
            this.f13378e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Rewarded.this.new b(this.d, this.f13378e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13376b;
            if (i2 == 0) {
                ResultKt.b(obj);
                p8 p8Var = Rewarded.this.adController;
                Context context = this.d;
                String str = this.f13378e;
                this.f13376b = 1;
                if (p8Var.a(context, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                ((Result) obj).getClass();
            }
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        public final void a() {
            Rewarded.this.callback.onAdLoaded(new CacheEvent(null, Rewarded.this), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13380b;
        public final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, Continuation continuation) {
            super(2, continuation);
            this.d = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Rewarded.this.new d(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13380b;
            if (i2 == 0) {
                ResultKt.b(obj);
                p8 p8Var = Rewarded.this.adController;
                Context context = this.d;
                this.f13380b = 1;
                if (p8Var.a(context, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                ((Result) obj).getClass();
            }
            return Unit.f43263a;
        }
    }

    public Rewarded(String location, RewardedCallback callback, Mediation mediation) {
        Intrinsics.f(location, "location");
        Intrinsics.f(callback, "callback");
        this.location = location;
        this.callback = callback;
        this.mediation = mediation;
        this.api = LazyKt.b(new a());
        this.adController = new kf(getApi(), callback, this, w3.f15454b);
    }

    private final jf getApi() {
        return (jf) this.api.getX();
    }

    private final void postSessionNotStartedInMainThread() {
        try {
            w3.f15454b.d().c().a(new c());
        } catch (Exception e2) {
            za.b("Rewarded ad cannot post session not started callback " + e2, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache() {
        if (Chartboost.isSdkStarted()) {
            getApi().a(this, this.callback);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void clearCache() {
        this.adController.c();
    }

    @Override // com.chartboost.sdk.ads.Ad
    public String getLocation() {
        return this.location;
    }

    @Override // com.chartboost.sdk.ads.Ad
    public Mediation getMediation() {
        return this.mediation;
    }

    @Override // com.chartboost.sdk.ads.Ad
    @Deprecated
    public boolean isCached() {
        return this.adController.a();
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void show() {
        Context contextA = a5.f13402a.a();
        if (contextA == null) {
            postSessionNotStartedInMainThread();
        } else {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new d(contextA, null), 3);
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache(String bidResponse) {
        Context contextA = a5.f13402a.a();
        if (contextA == null) {
            postSessionNotStartedInMainThread();
        } else {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new b(contextA, bidResponse, null), 3);
        }
    }

    public /* synthetic */ Rewarded(String str, RewardedCallback rewardedCallback, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rewardedCallback, (i2 & 4) != 0 ? null : mediation);
    }
}
