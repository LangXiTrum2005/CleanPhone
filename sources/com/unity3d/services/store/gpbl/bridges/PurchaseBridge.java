package com.unity3d.services.store.gpbl.bridges;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.log.DeviceLog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class PurchaseBridge extends CommonJsonResponseBridge {
    private static final String getSignatureMethodName = "getSignature";
    private final Object _purchase;

    public PurchaseBridge(Object obj) {
        super(obj, new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.PurchaseBridge.1
            {
                put(PurchaseBridge.getSignatureMethodName, new Class[0]);
            }
        });
        this._purchase = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_PURCHASE;
    }

    public String getSignature() {
        return (String) callNonVoidMethod(getSignatureMethodName, this._purchase, new Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge, com.unity3d.services.store.JsonSerializable
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseData", getOriginalJson());
            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, getSignature());
            return jSONObject;
        } catch (JSONException e10) {
            DeviceLog.warning("Could not build Purchase result Json: ", e10.getMessage());
            return jSONObject;
        }
    }
}
