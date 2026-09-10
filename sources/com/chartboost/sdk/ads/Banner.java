package com.chartboost.sdk.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.impl.a2;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.p8;
import com.chartboost.sdk.impl.w3;
import com.chartboost.sdk.impl.z1;
import com.chartboost.sdk.impl.za;
import com.p004ironsource.mediationsdk.l;
import com.vungle.ads.internal.protos.Sdk;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B3\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/chartboost/sdk/ads/Banner;", "Landroid/widget/FrameLayout;", "Lcom/chartboost/sdk/ads/Ad;", "", "postSessionNotStartedInMainThread", "()V", com.smartdigimkt.q0.b.O, "", "bidResponse", "(Ljava/lang/String;)V", "show", "clearCache", "", "isCached", "()Z", "", "getBannerWidth", "()I", "getBannerHeight", "detach", "location", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "Lcom/chartboost/sdk/ads/Banner$BannerSize;", "size", "Lcom/chartboost/sdk/ads/Banner$BannerSize;", "Lcom/chartboost/sdk/callbacks/BannerCallback;", "callback", "Lcom/chartboost/sdk/callbacks/BannerCallback;", "Lcom/chartboost/sdk/Mediation;", "mediation", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "Lcom/chartboost/sdk/impl/z1;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/chartboost/sdk/impl/z1;", "api", "Lcom/chartboost/sdk/impl/p8;", "adController", "Lcom/chartboost/sdk/impl/p8;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/chartboost/sdk/ads/Banner$BannerSize;Lcom/chartboost/sdk/callbacks/BannerCallback;Lcom/chartboost/sdk/Mediation;)V", "BannerSize", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class Banner extends FrameLayout implements Ad {
    private final p8 adController;

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    private final Lazy api;
    private final BannerCallback callback;
    private final String location;
    private final Mediation mediation;
    private final BannerSize size;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/chartboost/sdk/ads/Banner$BannerSize;", "", "width", "", "height", "(Ljava/lang/String;III)V", "getHeight", "()I", "getWidth", "STANDARD", "MEDIUM", l.d, "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum BannerSize {
        STANDARD(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
        MEDIUM(300, 250),
        LEADERBOARD(728, 90);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
        private final int height;
        private final int width;

        BannerSize(int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }

        public static EnumEntries<BannerSize> getEntries() {
            return $ENTRIES;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z1 invoke() {
            return k.a(Banner.this.getMediation());
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13363b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Banner.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13363b;
            if (i2 == 0) {
                ResultKt.b(obj);
                p8 p8Var = Banner.this.adController;
                Context context = Banner.this.getContext();
                Intrinsics.e(context, "getContext(...)");
                String str = this.d;
                this.f13363b = 1;
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
            Banner.this.callback.onAdLoaded(new CacheEvent(null, Banner.this), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13366b;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Banner.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13366b;
            if (i2 == 0) {
                ResultKt.b(obj);
                p8 p8Var = Banner.this.adController;
                Context context = Banner.this.getContext();
                Intrinsics.e(context, "getContext(...)");
                this.f13366b = 1;
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

    public /* synthetic */ Banner(Context context, String str, BannerSize bannerSize, BannerCallback bannerCallback, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bannerSize, bannerCallback, (i2 & 16) != 0 ? null : mediation);
    }

    private final z1 getApi() {
        return (z1) this.api.getX();
    }

    private final void postSessionNotStartedInMainThread() {
        try {
            w3.f15454b.d().c().a(new c());
        } catch (Exception e2) {
            za.b("Banner ad cannot post session not started callback " + e2, (Throwable) null, 2, (Object) null);
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

    public final void detach() {
        if (Chartboost.isSdkStarted()) {
            this.adController.b();
        }
    }

    public final int getBannerHeight() {
        return this.size.getHeight();
    }

    public final int getBannerWidth() {
        return this.size.getWidth();
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
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new d(null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(Context context, String location, BannerSize size, BannerCallback callback, Mediation mediation) {
        super(context);
        Intrinsics.f(context, "context");
        Intrinsics.f(location, "location");
        Intrinsics.f(size, "size");
        Intrinsics.f(callback, "callback");
        this.location = location;
        this.size = size;
        this.callback = callback;
        this.mediation = mediation;
        this.api = LazyKt.b(new a());
        this.adController = new a2(getApi(), callback, this, w3.f15454b);
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache(String bidResponse) {
        if (!Chartboost.isSdkStarted()) {
            postSessionNotStartedInMainThread();
        } else {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new b(bidResponse, null), 3);
        }
    }
}
