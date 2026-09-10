package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C0391ia;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class AdData {
    private final Map<String, Object> mAdUnitData;
    private final Map<String, Object> mConfiguration;
    private final String mServerData;

    public AdData(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.mServerData = str;
        this.mConfiguration = map;
        this.mAdUnitData = map2;
    }

    public static AdData createAdDataForNetworkAdapter(JSONObject jSONObject, IronSource.a aVar, String str) {
        return createAdDataForNetworkAdapter(jSONObject, aVar, str, null);
    }

    public Map<String, Object> getAdUnitData() {
        return this.mAdUnitData;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.mConfiguration.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.mConfiguration;
    }

    public Integer getInt(String str) {
        return (Integer) this.mConfiguration.get(str);
    }

    public String getServerData() {
        return this.mServerData;
    }

    public String getString(String str) {
        return (String) this.mConfiguration.get(str);
    }

    public static AdData createAdDataForNetworkAdapter(JSONObject jSONObject, IronSource.a aVar, String str, o oVar) {
        HashMap map = new HashMap();
        map.put("adUnit", aVar);
        if (str != null) {
            map.put("userId", str);
        }
        if (oVar != null) {
            map.put("bannerSize", oVar.getSize());
        }
        return new AdData(null, C0391ia.a(jSONObject), map);
    }
}
