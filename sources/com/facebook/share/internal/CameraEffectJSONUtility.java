package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CameraEffectJSONUtility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f16530a;

    /* JADX INFO: renamed from: com.facebook.share.internal.CameraEffectJSONUtility$1, reason: invalid class name */
    public static class AnonymousClass1 implements Setter {
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.CameraEffectJSONUtility$2, reason: invalid class name */
    public static class AnonymousClass2 implements Setter {
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.CameraEffectJSONUtility$3, reason: invalid class name */
    public static class AnonymousClass3 implements Setter {
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    public interface Setter {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    static {
        HashMap map = new HashMap();
        f16530a = map;
        map.put(String.class, new AnonymousClass1());
        map.put(String[].class, new AnonymousClass2());
        map.put(JSONArray.class, new AnonymousClass3());
    }

    public static JSONObject a(CameraEffectArguments cameraEffectArguments) {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = cameraEffectArguments.X;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                Setter setter = (Setter) f16530a.get(obj.getClass());
                if (setter == null) {
                    throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                }
                setter.a(jSONObject, str, obj);
            }
        }
        return jSONObject;
    }
}
