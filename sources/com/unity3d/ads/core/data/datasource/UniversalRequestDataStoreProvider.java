package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import cn.d0;
import cn.w;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import na.g;
import s0.i;
import s0.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "", "Landroid/content/Context;", "context", "Lcn/w;", "dispatcher", "<init>", "(Landroid/content/Context;Lcn/w;)V", "Ls0/i;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "createDataStore", "()Ls0/i;", "invoke", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcn/w;", "getDispatcher", "()Lcn/w;", "cachedDataStore", "Ls0/i;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UniversalRequestDataStoreProvider {
    private i cachedDataStore;
    private final Context context;
    private final w dispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider$createDataStore$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls0/b;", "it", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "invoke", "(Ls0/b;)Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements b {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // jk.b
        public final UniversalRequestStoreOuterClass.UniversalRequestStore invoke(s0.b it) {
            n.f(it, "it");
            return new UniversalRequestStoreSerializer().getDefaultValue();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider$createDataStore$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass2 extends o implements jk.a {
        public AnonymousClass2() {
            super(0);
        }

        @Override // jk.a
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(UniversalRequestDataStoreProvider.this.getContext(), ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
        }
    }

    public UniversalRequestDataStoreProvider(Context context, w dispatcher) {
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        this.context = context;
        this.dispatcher = dispatcher;
    }

    private final i createDataStore() {
        return j.c(new UniversalRequestStoreSerializer(), new g(AnonymousClass1.INSTANCE), null, d0.b(this.dispatcher.plus(d0.e())), new AnonymousClass2(), 4);
    }

    public final Context getContext() {
        return this.context;
    }

    public final w getDispatcher() {
        return this.dispatcher;
    }

    public final i invoke() {
        synchronized (this) {
            i iVar = this.cachedDataStore;
            if (iVar != null) {
                return iVar;
            }
            i iVarCreateDataStore = createDataStore();
            this.cachedDataStore = iVarCreateDataStore;
            return iVarCreateDataStore;
        }
    }
}
