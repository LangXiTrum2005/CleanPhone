package com.unity3d.ads.core.data.datasource;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import cn.x;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hn.d;
import java.util.concurrent.atomic.AtomicBoolean;
import jk.b;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/CachedFIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "Lcn/w;", "dispatcher", "dataSource", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/data/datasource/FIdDataSource;)V", "", "invoke", "()Ljava/lang/String;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "Ljava/util/concurrent/atomic/AtomicBoolean;", X3.i.f27812r, "Ljava/util/concurrent/atomic/AtomicBoolean;", X3.i.X, "Ljava/lang/String;", "Lcn/a0;", "scope", "Lcn/a0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CachedFIdDataSource implements FIdDataSource {
    private final FIdDataSource dataSource;
    private AtomicBoolean loaded;
    private a0 scope;
    private volatile String value;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1", f = "CachedFIdDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        int label;

        public AnonymousClass1(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return CachedFIdDataSource.this.new AnonymousClass1(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            CachedFIdDataSource cachedFIdDataSource = CachedFIdDataSource.this;
            cachedFIdDataSource.value = cachedFIdDataSource.dataSource.invoke();
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lwj/r;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends o implements b {
        public AnonymousClass2() {
            super(1);
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return r.f53297a;
        }

        public final void invoke(Throwable th2) {
            d0.j(CachedFIdDataSource.this.scope);
            CachedFIdDataSource.this.loaded.set(true);
        }
    }

    public CachedFIdDataSource(w dispatcher, FIdDataSource dataSource) {
        n.f(dispatcher, "dispatcher");
        n.f(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.loaded = new AtomicBoolean(false);
        d dVarY = d0.y(d0.b(dispatcher), new CachedFIdDataSource$special$$inlined$CoroutineExceptionHandler$1(x.f6783a));
        this.scope = dVarY;
        d0.w(dVarY, null, new AnonymousClass1(null), 3).n(new AnonymousClass2());
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    public String invoke() {
        if (this.loaded.get()) {
            return this.value;
        }
        return null;
    }
}
