package com.unity3d.ads.core.data.datasource;

import ak.f;
import ck.e;
import ck.i;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import fn.g;
import fn.k;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import s0.b;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "universalRequestStoreProvider", "<init>", "(Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;)V", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "get", "(Lak/f;)Ljava/lang/Object;", "", X3.i.W, "Lcom/google/protobuf/ByteString;", "data", "Lwj/r;", "set", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lak/f;)Ljava/lang/Object;", "remove", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UniversalRequestDataSource {
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "", "exception", "Lwj/r;", "<anonymous>", "(Lfn/f;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements d {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(f fVar) {
            super(3, fVar);
        }

        @Override // jk.d
        public final Object invoke(fn.f fVar, Throwable th2, f fVar2) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar2);
            anonymousClass2.L$0 = fVar;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                fn.f fVar = (fn.f) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                if (!(th2 instanceof b)) {
                    throw th2;
                }
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                n.e(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                Object objEmit = fVar.emit(defaultInstance, this);
                bk.a aVar = bk.a.f5708a;
                if (objEmit == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @e(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C07392 extends i implements c {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07392(String str, f fVar) {
            super(2, fVar);
            this.$key = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            C07392 c07392 = new C07392(this.$key, fVar);
            c07392.L$0 = obj;
            return c07392;
        }

        @Override // jk.c
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, f fVar) {
            return ((C07392) create(universalRequestStore, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            n.e(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @e(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C07402 extends i implements c {
        final /* synthetic */ ByteString $data;
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07402(String str, ByteString byteString, f fVar) {
            super(2, fVar);
            this.$key = str;
            this.$data = byteString;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            C07402 c07402 = new C07402(this.$key, this.$data, fVar);
            c07402.L$0 = obj;
            return c07402;
        }

        @Override // jk.c
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, f fVar) {
            return ((C07402) create(universalRequestStore, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            n.e(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    public UniversalRequestDataSource(UniversalRequestDataStoreProvider universalRequestStoreProvider) {
        n.f(universalRequestStoreProvider, "universalRequestStoreProvider");
        this.universalRequestStoreProvider = universalRequestStoreProvider;
    }

    public final Object get(f fVar) {
        return g.k(new k(this.universalRequestStoreProvider.invoke().getData(), new AnonymousClass2(null), 2), fVar);
    }

    public final Object remove(String str, f fVar) {
        Object objA = this.universalRequestStoreProvider.invoke().a(new C07392(str, null), fVar);
        return objA == bk.a.f5708a ? objA : r.f53297a;
    }

    public final Object set(String str, ByteString byteString, f fVar) {
        Object objA = this.universalRequestStoreProvider.invoke().a(new C07402(str, byteString, null), fVar);
        return objA == bk.a.f5708a ? objA : r.f53297a;
    }
}
