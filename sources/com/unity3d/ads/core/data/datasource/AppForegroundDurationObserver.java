package com.unity3d.ads.core.data.datasource;

import ak.f;
import android.os.SystemClock;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import cn.x;
import com.unity3d.services.core.properties.SdkProperties;
import fn.a1;
import fn.g;
import fn.n0;
import fn.s;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\r¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AppForegroundDurationObserver;", "Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Lcn/w;", "defaultDispatcher", "Lkotlin/Function0;", "", "elapsedRealtimeProvider", "initTimeProvider", "<init>", "(Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcn/w;Ljk/a;Ljk/a;)V", "currentAccumulatedBackgroundMs", "()J", "Lwj/r;", "onBackground", "()V", "onForeground", "invoke", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Lcn/w;", "Ljk/a;", "Lfn/n0;", "", "isRunning", "Lfn/n0;", "Ljava/util/concurrent/atomic/AtomicLong;", "accumulatedBackgroundMs", "Ljava/util/concurrent/atomic/AtomicLong;", "backgroundStartMs", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInBackground", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcn/a0;", "scope", "Lcn/a0;", "getSessionDurationInForegroundMs", "sessionDurationInForegroundMs", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppForegroundDurationObserver implements ForegroundDurationReader {
    private final AtomicLong accumulatedBackgroundMs;
    private final AtomicLong backgroundStartMs;
    private final w defaultDispatcher;
    private final jk.a elapsedRealtimeProvider;
    private final jk.a initTimeProvider;
    private final AtomicBoolean isInBackground;
    private final n0 isRunning;
    private final LifecycleDataSource lifecycleDataSource;
    private final a0 scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends o implements jk.a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // jk.a
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass2 extends o implements jk.a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // jk.a
        public final Long invoke() {
            return Long.valueOf(SdkProperties.getInitializationTime());
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$invoke$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "active", "Lwj/r;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$invoke$2", f = "AppForegroundDurationObserver.kt", l = {}, m = "invokeSuspend")
    public static final class C07372 extends i implements c {
        /* synthetic */ boolean Z$0;
        int label;

        public C07372(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            C07372 c07372 = AppForegroundDurationObserver.this.new C07372(fVar);
            c07372.Z$0 = ((Boolean) obj).booleanValue();
            return c07372;
        }

        @Override // jk.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (f) obj2);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            boolean z10 = this.Z$0;
            AppForegroundDurationObserver appForegroundDurationObserver = AppForegroundDurationObserver.this;
            if (z10) {
                appForegroundDurationObserver.onForeground();
            } else {
                appForegroundDurationObserver.onBackground();
            }
            return r.f53297a;
        }

        public final Object invoke(boolean z10, f fVar) {
            return ((C07372) create(Boolean.valueOf(z10), fVar)).invokeSuspend(r.f53297a);
        }
    }

    public AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, w defaultDispatcher, jk.a elapsedRealtimeProvider, jk.a initTimeProvider) {
        n.f(lifecycleDataSource, "lifecycleDataSource");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(elapsedRealtimeProvider, "elapsedRealtimeProvider");
        n.f(initTimeProvider, "initTimeProvider");
        this.lifecycleDataSource = lifecycleDataSource;
        this.defaultDispatcher = defaultDispatcher;
        this.elapsedRealtimeProvider = elapsedRealtimeProvider;
        this.initTimeProvider = initTimeProvider;
        this.isRunning = g.c(Boolean.FALSE);
        this.accumulatedBackgroundMs = new AtomicLong(0L);
        this.backgroundStartMs = new AtomicLong(0L);
        this.isInBackground = new AtomicBoolean(false);
        this.scope = d0.b(defaultDispatcher.plus(new AppForegroundDurationObserver$special$$inlined$CoroutineExceptionHandler$1(x.f6783a)));
    }

    private final long currentAccumulatedBackgroundMs() {
        long j10 = this.accumulatedBackgroundMs.get();
        if (!this.isInBackground.get()) {
            return j10;
        }
        return (((Number) this.elapsedRealtimeProvider.invoke()).longValue() - this.backgroundStartMs.get()) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackground() {
        if (this.isInBackground.compareAndSet(false, true)) {
            this.backgroundStartMs.set(((Number) this.elapsedRealtimeProvider.invoke()).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onForeground() {
        if (this.isInBackground.compareAndSet(true, false)) {
            long j10 = this.backgroundStartMs.get();
            this.accumulatedBackgroundMs.addAndGet(((Number) this.elapsedRealtimeProvider.invoke()).longValue() - j10);
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.ForegroundDurationReader
    public long getSessionDurationInForegroundMs() {
        long jLongValue = ((Number) this.initTimeProvider.invoke()).longValue();
        if (jLongValue == 0) {
            return 0L;
        }
        return Math.max(0L, (((Number) this.elapsedRealtimeProvider.invoke()).longValue() - jLongValue) - currentAccumulatedBackgroundMs());
    }

    public final void invoke() {
        a1 a1Var;
        Object value;
        Boolean bool;
        n0 n0Var = this.isRunning;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!a1Var.c0(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        if (!this.lifecycleDataSource.appIsForeground()) {
            this.isInBackground.set(true);
            this.backgroundStartMs.set(((Number) this.initTimeProvider.invoke()).longValue());
        }
        g.o(new s(this.lifecycleDataSource.getAppActive(), new C07372(null), 2), this.scope);
    }

    public /* synthetic */ AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, w wVar, jk.a aVar, jk.a aVar2, int i10, kotlin.jvm.internal.g gVar) {
        this(lifecycleDataSource, wVar, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : aVar, (i10 & 8) != 0 ? AnonymousClass2.INSTANCE : aVar2);
    }
}
