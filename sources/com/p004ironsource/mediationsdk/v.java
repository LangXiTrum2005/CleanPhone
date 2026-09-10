package com.p004ironsource.mediationsdk;

import android.support.v4.media.a;
import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.ac;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.wj;
import com.p004ironsource.zb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J-\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0010H\u0016J&\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002J\u0006\u0010\t\u001a\u00020\u0005R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/ironsource/mediationsdk/v;", "Lcom/ironsource/mediationsdk/AdapterNetworkData;", "", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "adapters", "", "a", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseWrapper;", "networkAdapters", "b", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Lorg/json/JSONObject;", "networkDataByAdUnit", "allData", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "desiredKey", "Ljava/lang/Class;", "valueType", "dataByKeyIgnoreCase", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "toString", "Ljava/lang/String;", "()Ljava/lang/String;", "networkName", "Lorg/json/JSONObject;", "networkData", "data", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class v implements AdapterNetworkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String networkName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSONObject networkData;

    public v(String networkName, JSONObject data) {
        Intrinsics.f(networkName, "networkName");
        Intrinsics.f(data, "data");
        this.networkName = networkName;
        this.networkData = new JSONObject(data.toString());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    @Override // com.p004ironsource.mediationsdk.AdapterNetworkData
    /* JADX INFO: renamed from: allData, reason: from getter */
    public JSONObject getNetworkData() {
        return this.networkData;
    }

    public final void b() {
        Iterator<String> itKeys = this.networkData.keys();
        Intrinsics.e(itKeys, "networkData.keys()");
        wj.i().a(new zb(ac.SET_NETWORK_DATA, IronSourceUtils.getMediationAdditionalData(false).put(IronSourceConstants.EVENTS_EXT1, a.s(new StringBuilder(), this.networkName, " - ", CollectionsKt.D(SequencesKt.v(SequencesKt.b(itKeys)), ",", null, null, null, 62)))));
    }

    @Override // com.p004ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(String desiredKey, Class<T> valueType) {
        Object next;
        Intrinsics.f(desiredKey, "desiredKey");
        Intrinsics.f(valueType, "valueType");
        Iterator<String> itKeys = getNetworkData().keys();
        Intrinsics.e(itKeys, "allData()\n          .keys()");
        Iterator f44671a = ((ConstrainedOnceSequence) SequencesKt.b(itKeys)).getF44671a();
        do {
            if (!f44671a.hasNext()) {
                next = null;
                break;
            }
            next = f44671a.next();
        } while (!StringsKt.r((String) next, desiredKey, true));
        String str = (String) next;
        if (str != null) {
            Object objOpt = getNetworkData().opt(str);
            if (!valueType.isInstance(objOpt)) {
                objOpt = null;
            }
            if (objOpt != null) {
                return valueType.cast(objOpt);
            }
        }
        return null;
    }

    @Override // com.p004ironsource.mediationsdk.AdapterNetworkData
    public JSONObject networkDataByAdUnit(IronSource.AD_UNIT adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        JSONObject jSONObjectOptJSONObject = this.networkData.optJSONObject(adUnit.toString());
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public String toString() {
        return "NetworkData(networkName=" + this.networkName + ", networkData=" + this.networkData + ')';
    }

    private final void a(Collection<? extends AbstractAdapter> adapters) {
        ArrayList arrayListU = CollectionsKt.u(adapters);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListU) {
            if (c.a(this.networkName, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    public final void a(Collection<? extends AbstractAdapter> adapters, Collection<? extends AdapterBaseWrapper> networkAdapters) {
        Intrinsics.f(adapters, "adapters");
        Intrinsics.f(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (Exception e2) {
            IronLog.INTERNAL.error("error while setting network data: " + e2.getMessage());
        }
    }

    private final void b(Collection<? extends AdapterBaseWrapper> networkAdapters) {
        ArrayList arrayListU = CollectionsKt.u(networkAdapters);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListU) {
            if (c.a(this.networkName, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
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
}
