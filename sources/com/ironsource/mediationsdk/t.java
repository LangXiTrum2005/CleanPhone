package com.ironsource.mediationsdk;

import com.ironsource.C0654x5;
import com.ironsource.EnumC0672y5;
import com.ironsource.G9;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements AdapterNetworkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f29717b;

    public t(String networkName, JSONObject data) {
        kotlin.jvm.internal.n.f(networkName, "networkName");
        kotlin.jvm.internal.n.f(data, "data");
        this.f29716a = networkName;
        this.f29717b = new JSONObject(data.toString());
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        ArrayList arrayListM0 = xj.n.m0(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM0) {
            if (c.a(this.f29716a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((AdapterNetworkDataInterface) it2.next()).setNetworkData(this);
        }
    }

    public final String a() {
        return this.f29716a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject allData() {
        return this.f29717b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(String desiredKey, Class<T> valueType) {
        Object next;
        kotlin.jvm.internal.n.f(desiredKey, "desiredKey");
        kotlin.jvm.internal.n.f(valueType, "valueType");
        Iterator<String> itKeys = allData().keys();
        kotlin.jvm.internal.n.e(itKeys, "allData()\n          .keys()");
        Iterator it = ((zm.a) zm.l.M(itKeys)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!an.p.i0((String) next, desiredKey));
        String str = (String) next;
        if (str != null) {
            Object objOpt = allData().opt(str);
            if (!valueType.isInstance(objOpt)) {
                objOpt = null;
            }
            if (objOpt != null) {
                return valueType.cast(objOpt);
            }
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject networkDataByAdUnit(IronSource.a adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        JSONObject jSONObjectOptJSONObject = this.f29717b.optJSONObject(adUnit.toString());
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public String toString() {
        return "NetworkData(networkName=" + this.f29716a + ", networkData=" + this.f29717b + ")";
    }

    public final void a(Collection<? extends AbstractAdapter> adapters, Collection<? extends AdapterBaseWrapper> networkAdapters) {
        kotlin.jvm.internal.n.f(adapters, "adapters");
        kotlin.jvm.internal.n.f(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while setting network data: " + e10.getMessage());
        }
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        ArrayList arrayListM0 = xj.n.m0(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM0) {
            if (c.a(this.f29716a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    public final void b() {
        Iterator<String> itKeys = this.f29717b.keys();
        kotlin.jvm.internal.n.e(itKeys, "networkData.keys()");
        String strU0 = xj.n.u0(zm.l.W(zm.l.M(itKeys)), ",", null, null, null, 62);
        G9.i().a(new C0654x5(EnumC0672y5.SET_NETWORK_DATA, IronSourceUtils.b(false).put(IronSourceConstants.EVENTS_EXT1, this.f29716a + " - " + strU0)));
    }
}
