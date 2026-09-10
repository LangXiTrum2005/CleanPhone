package ads_mobile_sdk;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.base.triweekly;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.rajahmundry;

/* JADX INFO: loaded from: classes.dex */
public final class cb1 {
    public static final cb1 a = new cb1();

    public static boolean a(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter("isSuccessful", X3.i.W);
        return jsonObject.get("isSuccessful").getAsBoolean();
    }

    public static Bundle b(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Bundle bundleE = e(jsonObject);
        return bundleE == null ? new Bundle() : bundleE;
    }

    public static double c(JsonObject jsonObject, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (jsonObject == null) {
            return 1.0d;
        }
        try {
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            return jsonObject.get(key).getAsDouble();
        } catch (Exception unused) {
            return 1.0d;
        }
    }

    public static JsonArray d(JsonObject jsonObject, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (jsonObject == null) {
            return null;
        }
        try {
            return jsonObject.getAsJsonArray(key);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long e(JsonObject jsonObject, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (jsonObject == null) {
            return 0L;
        }
        try {
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            return jsonObject.get(key).getAsLong();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static Object a(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isBoolean()) {
            return Boolean.valueOf(jsonPrimitive.getAsBoolean());
        }
        if (jsonPrimitive.isNumber()) {
            Number asNumber = jsonPrimitive.getAsNumber();
            int iIntValue = asNumber.intValue();
            double dDoubleValue = asNumber.doubleValue();
            if (iIntValue == dDoubleValue) {
                return Integer.valueOf(iIntValue);
            }
            return Double.valueOf(dDoubleValue);
        }
        if (jsonPrimitive.isString()) {
            return jsonPrimitive.getAsString();
        }
        triweekly triweeklyVar = kn0.a;
        kn0.c("Unexpected primitive json type: " + jsonPrimitive, null);
        return null;
    }

    public static Bundle e(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        try {
            Bundle bundle = new Bundle();
            for (String str : jsonObject.keySet()) {
                JsonElement jsonElement = jsonObject.get(str);
                if (jsonElement.isJsonPrimitive()) {
                    JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    Intrinsics.checkNotNullExpressionValue(asJsonPrimitive, "getAsJsonPrimitive(...)");
                    Intrinsics.beachfront(str);
                    a(asJsonPrimitive, bundle, str);
                } else if (jsonElement.isJsonArray()) {
                    JsonArray asJsonArray = jsonElement.getAsJsonArray();
                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
                    Intrinsics.beachfront(str);
                    a(asJsonArray, bundle, str);
                } else if (jsonElement.isJsonObject()) {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                    bundle.putBundle(str, b(asJsonObject));
                }
            }
            return bundle;
        } catch (Exception e) {
            List list = rajahmundry.attabal(e, "t", e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            Intrinsics.beachfront(message);
            list.add(message);
            return null;
        }
    }

    public static String a(JsonObject jsonObject, String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String asString = jsonObject.get(key).getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        return asString;
    }

    public static Bundle a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
            return e(asJsonObject);
        } catch (Exception e) {
            List list = rajahmundry.attabal(e, "t", e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            Intrinsics.beachfront(message);
            list.add(message);
            return null;
        }
    }

    public static JsonObject a(JsonElement jsonElement) {
        if (jsonElement == null) {
            return null;
        }
        try {
            return jsonElement.getAsJsonObject();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(JsonObject jsonObject, String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (jsonObject != null) {
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "<this>");
                Intrinsics.checkNotNullParameter(key, "key");
                return jsonObject.get(key).getAsBoolean();
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public static int a(JsonObject jsonObject, String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (jsonObject != null) {
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "<this>");
                Intrinsics.checkNotNullParameter(key, "key");
                return jsonObject.get(key).getAsInt();
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static JsonObject a(JsonObject jsonObject, String key, JsonObject jsonObject2) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (jsonObject == null) {
            return jsonObject2;
        }
        try {
            return jsonObject.getAsJsonObject(key);
        } catch (Exception unused) {
            return jsonObject2;
        }
    }

    public static JsonObject a(JsonArray jsonArray, int i) {
        if (jsonArray == null || i >= jsonArray.size()) {
            return null;
        }
        try {
            return jsonArray.get(i).getAsJsonObject();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(JsonObject jsonObject, String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        if (jsonObject != null) {
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "<this>");
                Intrinsics.checkNotNullParameter(key, "key");
                String asString = jsonObject.get(key).getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                return asString;
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static void a(JsonArray jsonArray, Bundle bundle, String str) {
        if (jsonArray.isEmpty()) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Unable to parse empty JsonArray for key: " + str, null);
            return;
        }
        JsonElement jsonElement = (JsonElement) CollectionsKt.coffeecake(jsonArray);
        int i = 0;
        if (jsonElement.isJsonObject()) {
            ArrayList arrayList = new ArrayList(dovishness.gintrap(jsonArray, 10));
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject = it.next().getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                arrayList.add(b(asJsonObject));
            }
            bundle.putParcelableArray(str, (Parcelable[]) arrayList.toArray(new Bundle[0]));
            return;
        }
        if (jsonElement.isJsonPrimitive()) {
            ArrayList arrayList2 = new ArrayList(dovishness.gintrap(jsonArray, 10));
            Iterator<JsonElement> it2 = jsonArray.iterator();
            while (it2.hasNext()) {
                JsonPrimitive asJsonPrimitive = it2.next().getAsJsonPrimitive();
                Intrinsics.checkNotNullExpressionValue(asJsonPrimitive, "getAsJsonPrimitive(...)");
                Object objA = a(asJsonPrimitive);
                Intrinsics.beachfront(objA);
                arrayList2.add(objA);
            }
            if (CollectionsKt.lerp(arrayList2) instanceof String) {
                ArrayList arrayList3 = new ArrayList(dovishness.gintrap(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(it3.next().toString());
                }
                bundle.putStringArray(str, (String[]) arrayList3.toArray(new String[0]));
                return;
            }
            if (CollectionsKt.lerp(arrayList2) instanceof Integer) {
                int size = arrayList2.size();
                int[] iArr = new int[size];
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i] = ((Integer) obj).intValue();
                    i++;
                }
                bundle.putIntArray(str, iArr);
                return;
            }
            if (CollectionsKt.lerp(arrayList2) instanceof Double) {
                int size2 = arrayList2.size();
                double[] dArr = new double[size2];
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i] = ((Double) obj2).doubleValue();
                    i++;
                }
                bundle.putDoubleArray(str, dArr);
                return;
            }
            if (CollectionsKt.lerp(arrayList2) instanceof Boolean) {
                int size3 = arrayList2.size();
                boolean[] zArr = new boolean[size3];
                while (i < size3) {
                    Object obj3 = arrayList2.get(i);
                    Intrinsics.competently(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i] = ((Boolean) obj3).booleanValue();
                    i++;
                }
                bundle.putBooleanArray(str, zArr);
                return;
            }
            triweekly triweeklyVar2 = kn0.a;
            kn0.c("Unable to parse array element type: " + CollectionsKt.lerp(arrayList2), null);
            return;
        }
        triweekly triweeklyVar3 = kn0.a;
        kn0.c("Unable to parse array element type: " + jsonElement, null);
    }

    public static void a(JsonPrimitive jsonPrimitive, Bundle bundle, String str) {
        if (jsonPrimitive.isBoolean()) {
            bundle.putBoolean(str, jsonPrimitive.getAsBoolean());
            return;
        }
        if (jsonPrimitive.isNumber()) {
            Number asNumber = jsonPrimitive.getAsNumber();
            int iIntValue = asNumber.intValue();
            double dDoubleValue = asNumber.doubleValue();
            if (iIntValue == dDoubleValue) {
                bundle.putInt(str, iIntValue);
                return;
            } else {
                bundle.putDouble(str, dDoubleValue);
                return;
            }
        }
        if (jsonPrimitive.isString()) {
            bundle.putString(str, jsonPrimitive.getAsString());
            return;
        }
        triweekly triweeklyVar = kn0.a;
        kn0.c("Unexpected primitive json type: " + jsonPrimitive, null);
    }
}
