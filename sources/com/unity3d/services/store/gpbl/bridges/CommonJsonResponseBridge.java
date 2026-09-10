package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.JsonSerializable;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CommonJsonResponseBridge extends GenericBridge implements BillingOriginalJsonResponse, JsonSerializable {
    private static final String getOriginalJsonMethodName = "getOriginalJson";
    private final Object _internalBridgeRef;

    public CommonJsonResponseBridge(Object obj) {
        this(obj, new HashMap());
    }

    private static Map<String, Class<?>[]> appendCommonResponseMethods(Map<String, Class<?>[]> map) {
        map.putAll(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge.1
            {
                put("getOriginalJson", new Class[0]);
            }
        });
        return map;
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public JSONObject getOriginalJson() {
        try {
            return new JSONObject((String) callNonVoidMethod("getOriginalJson", this._internalBridgeRef, new Object[0]));
        } catch (JSONException e10) {
            DeviceLog.error("Couldn't parse BillingResponse JSON : %s", e10.getMessage());
            return null;
        }
    }

    @Override // com.unity3d.services.store.JsonSerializable
    public JSONObject toJson() {
        return getOriginalJson();
    }

    public CommonJsonResponseBridge(Object obj, Map<String, Class<?>[]> map) {
        super(appendCommonResponseMethods(map));
        this._internalBridgeRef = obj;
    }
}
