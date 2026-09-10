package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/BundleJSONConverter;", "", "Setter", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class BundleJSONConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f16262a;

    /* JADX INFO: renamed from: com.facebook.internal.BundleJSONConverter$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/internal/BundleJSONConverter$1", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 implements Setter {
        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void b(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.BundleJSONConverter$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/internal/BundleJSONConverter$2", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass2 implements Setter {
        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void b(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.BundleJSONConverter$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/internal/BundleJSONConverter$3", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass3 implements Setter {
        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void b(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.BundleJSONConverter$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/internal/BundleJSONConverter$4", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass4 implements Setter {
        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void b(Bundle bundle, String str, Object obj) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.BundleJSONConverter$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/internal/BundleJSONConverter$5", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass5 implements Setter {
        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void b(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.BundleJSONConverter$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/internal/BundleJSONConverter$6", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass6 implements Setter {
        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }

        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void b(Bundle bundle, String str, Object obj) {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.BundleJSONConverter$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/internal/BundleJSONConverter$7", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass7 implements Setter {
        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void a(JSONObject jSONObject, String str, Object obj) {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.BundleJSONConverter.Setter
        public final void b(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = jSONArray.get(i2);
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
                arrayList.add(obj2);
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/BundleJSONConverter$Setter;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Setter {
        void a(JSONObject jSONObject, String str, Object obj);

        void b(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap map = new HashMap();
        f16262a = map;
        map.put(Boolean.class, new AnonymousClass1());
        map.put(Integer.class, new AnonymousClass2());
        map.put(Long.class, new AnonymousClass3());
        map.put(Double.class, new AnonymousClass4());
        map.put(String.class, new AnonymousClass5());
        map.put(String[].class, new AnonymousClass6());
        map.put(JSONArray.class, new AnonymousClass7());
    }

    public static final Bundle a(JSONObject jsonObject) throws JSONException {
        Intrinsics.f(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object obj = jsonObject.get(key);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) obj));
                } else {
                    Setter setter = (Setter) f16262a.get(obj.getClass());
                    if (setter == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    Intrinsics.e(key, "key");
                    setter.b(bundle, key, obj);
                }
            }
        }
        return bundle;
    }

    public static final JSONObject b(Bundle bundle) throws JSONException {
        Intrinsics.f(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String key : bundle.keySet()) {
            Object obj = bundle.get(key);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put(key, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(key, b((Bundle) obj));
                } else {
                    Setter setter = (Setter) f16262a.get(obj.getClass());
                    if (setter == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    Intrinsics.e(key, "key");
                    setter.a(jSONObject, key, obj);
                }
            }
        }
        return jSONObject;
    }
}
