package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C0526q2;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import qk.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/unity3d/services/core/di/IServicesRegistry;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/unity3d/services/core/di/ServiceKey;", X3.i.W, "Lwj/d;", C0526q2.f30050p, "Lwj/r;", "updateService", "(Lcom/unity3d/services/core/di/ServiceKey;Lwj/d;)V", "resolveService", "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "", "named", "Lqk/d;", "getService", "(Ljava/lang/String;Lqk/d;)Ljava/lang/Object;", "", "getServices", "()Ljava/util/Map;", "services", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface IServicesRegistry {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i10 & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, dVar);
        }
    }

    <T> T getService(String named, d instance);

    Map<ServiceKey, wj.d> getServices();

    <T> T resolveService(ServiceKey key);

    <T> T resolveServiceOrNull(ServiceKey key);

    <T> void updateService(ServiceKey key, wj.d instance);
}
