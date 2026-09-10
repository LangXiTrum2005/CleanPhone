package com.facebook.share.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenGraphJSONUtility {

    public interface PhotoJSONProcessor {
        JSONObject a(SharePhoto sharePhoto);
    }

    public static JSONObject a(ShareOpenGraphAction shareOpenGraphAction, PhotoJSONProcessor photoJSONProcessor) {
        if (CrashShieldHandler.b(OpenGraphJSONUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphAction.X.keySet()) {
                jSONObject.put(str, c(shareOpenGraphAction.X.get(str), photoJSONProcessor));
            }
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.a(OpenGraphJSONUtility.class, th);
            return null;
        }
    }

    public static JSONObject b(ShareOpenGraphObject shareOpenGraphObject, PhotoJSONProcessor photoJSONProcessor) {
        if (CrashShieldHandler.b(OpenGraphJSONUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphObject.X.keySet()) {
                jSONObject.put(str, c(shareOpenGraphObject.X.get(str), photoJSONProcessor));
            }
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.a(OpenGraphJSONUtility.class, th);
            return null;
        }
    }

    public static Object c(Object obj, PhotoJSONProcessor photoJSONProcessor) {
        if (!CrashShieldHandler.b(OpenGraphJSONUtility.class)) {
            try {
                if (obj == null) {
                    return JSONObject.NULL;
                }
                if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
                    return obj;
                }
                if (obj instanceof SharePhoto) {
                    return photoJSONProcessor.a((SharePhoto) obj);
                }
                if (obj instanceof ShareOpenGraphObject) {
                    return b((ShareOpenGraphObject) obj, photoJSONProcessor);
                }
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
                }
                List list = (List) obj;
                if (!CrashShieldHandler.b(OpenGraphJSONUtility.class)) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(c(it.next(), photoJSONProcessor));
                        }
                        return jSONArray;
                    } catch (Throwable th) {
                        CrashShieldHandler.a(OpenGraphJSONUtility.class, th);
                    }
                }
            } catch (Throwable th2) {
                CrashShieldHandler.a(OpenGraphJSONUtility.class, th2);
                return null;
            }
        }
        return null;
    }
}
