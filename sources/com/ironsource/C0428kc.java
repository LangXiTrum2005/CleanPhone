package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.kc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0428kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, JSONObject> f29052a;

    public C0428kc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.f29052a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0428kc) && kotlin.jvm.internal.n.a(this.f29052a, ((C0428kc) obj).f29052a);
    }

    public int hashCode() {
        return this.f29052a.hashCode();
    }

    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f29052a + ")";
    }

    public C0428kc(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        kotlin.jvm.internal.n.f(networkDataMap, "networkDataMap");
        this.f29052a = networkDataMap;
    }

    public final C0428kc a(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        kotlin.jvm.internal.n.f(networkDataMap, "networkDataMap");
        return new C0428kc(networkDataMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0428kc a(C0428kc c0428kc, ConcurrentHashMap concurrentHashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            concurrentHashMap = c0428kc.f29052a;
        }
        return c0428kc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C0428kc(ConcurrentHashMap concurrentHashMap, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(com.ironsource.mediationsdk.t networkData) {
        kotlin.jvm.internal.n.f(networkData, "networkData");
        if (!this.f29052a.containsKey(networkData.a())) {
            this.f29052a.put(networkData.a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f29052a;
            String strA = networkData.a();
            JSONObject jSONObject = this.f29052a.get(networkData.a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectA = IronSourceUtils.a(jSONObject, networkData.allData());
            kotlin.jvm.internal.n.e(jSONObjectA, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(strA, jSONObjectA);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while merging network data: " + e10.getMessage());
        }
    }

    public final void a(AbstractAdapter adapter) {
        kotlin.jvm.internal.n.f(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f29052a.entrySet();
        kotlin.jvm.internal.n.e(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            kotlin.jvm.internal.n.e(key, "it.key");
            Object value = entry.getValue();
            kotlin.jvm.internal.n.e(value, "it.value");
            adapter.setNetworkData(new com.ironsource.mediationsdk.t((String) key, (JSONObject) value));
        }
    }

    public final void a(AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f29052a.entrySet();
        kotlin.jvm.internal.n.e(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            kotlin.jvm.internal.n.d(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            kotlin.jvm.internal.n.e(key, "it.key");
            Object value = entry.getValue();
            kotlin.jvm.internal.n.e(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.t((String) key, (JSONObject) value));
        }
    }
}
