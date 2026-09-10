package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface P4 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f26992a;

        public a(String providerName) {
            kotlin.jvm.internal.n.f(providerName, "providerName");
            this.f26992a = xj.b0.R(new wj.f(IronSourceConstants.EVENTS_PROVIDER, providerName), new wj.f(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(String key, Object value) {
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            this.f26992a.put(key, value);
        }

        public final Map<String, Object> a() {
            return xj.b0.Y(this.f26992a);
        }
    }

    void a(EnumC0672y5 enumC0672y5, De de2);

    void a(EnumC0672y5 enumC0672y5, String str);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements P4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C7 f26993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f26994b;

        public b(C7 eventManager, a eventBaseData) {
            kotlin.jvm.internal.n.f(eventManager, "eventManager");
            kotlin.jvm.internal.n.f(eventBaseData, "eventBaseData");
            this.f26993a = eventManager;
            this.f26994b = eventBaseData;
        }

        @Override // com.ironsource.P4
        public void a(EnumC0672y5 eventName, String instanceId) {
            kotlin.jvm.internal.n.f(eventName, "eventName");
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            Map<String, Object> mapA = this.f26994b.a();
            mapA.put("spId", instanceId);
            this.f26993a.a(new C0654x5(eventName, new JSONObject(xj.b0.X(mapA))));
        }

        @Override // com.ironsource.P4
        public void a(EnumC0672y5 eventName, De de2) {
            kotlin.jvm.internal.n.f(eventName, "eventName");
            Map<String, Object> mapA = this.f26994b.a();
            if (de2 != null) {
                mapA.put(IronSourceConstants.EVENTS_EXT1, de2.toString());
            }
            this.f26993a.a(new C0654x5(eventName, new JSONObject(xj.b0.X(mapA))));
        }
    }
}
