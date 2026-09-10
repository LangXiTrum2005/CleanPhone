package com.unity3d.ads.core.data.datasource;

import ak.f;
import ck.e;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import fn.g;
import fn.k;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import s0.b;
import s0.i;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "", "Ls0/i;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "webviewConfigurationStore", "<init>", "(Ls0/i;)V", "get", "(Lak/f;)Ljava/lang/Object;", "data", "Lwj/r;", "set", "(Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;Lak/f;)Ljava/lang/Object;", "Ls0/i;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class WebviewConfigurationDataSource {
    private final i webviewConfigurationStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "", "exception", "Lwj/r;", "<anonymous>", "(Lfn/f;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends ck.i implements d {
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
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "it"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @e(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C07412 extends ck.i implements c {
        final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07412(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, f fVar) {
            super(2, fVar);
            this.$data = webViewConfigurationStore;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new C07412(this.$data, fVar);
        }

        @Override // jk.c
        public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, f fVar) {
            return ((C07412) create(webViewConfigurationStore, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return this.$data;
        }
    }

    public WebviewConfigurationDataSource(i webviewConfigurationStore) {
        n.f(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    public final Object get(f fVar) {
        return g.k(new k(this.webviewConfigurationStore.getData(), new AnonymousClass2(null), 2), fVar);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, f fVar) {
        Object objA = this.webviewConfigurationStore.a(new C07412(webViewConfigurationStore, null), fVar);
        return objA == bk.a.f5708a ? objA : r.f53297a;
    }
}
