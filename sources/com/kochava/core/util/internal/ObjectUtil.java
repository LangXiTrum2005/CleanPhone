package com.kochava.core.util.internal;

import android.net.Uri;
import android.os.Bundle;
import com.kochava.core.json.internal.JsonArray;
import com.kochava.core.json.internal.JsonArrayApi;
import com.kochava.core.json.internal.JsonElementApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ObjectUtil {
    public static HashMap a(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                map.put(str, a((Bundle) obj));
            } else {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static String b(String str, String str2, String... strArr) {
        if (str != null) {
            return str;
        }
        if (str2 != null) {
            return str2;
        }
        for (String str3 : strArr) {
            if (str3 != null) {
                return str3;
            }
        }
        return null;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != null && obj == obj2) {
            return true;
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Long) && (obj2 instanceof Long)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Float) && (obj2 instanceof Float)) {
            return ((double) Math.abs(((Float) obj).floatValue() - ((Float) obj2).floatValue())) < 1.0E-4d;
        }
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return Math.abs(((Double) obj).doubleValue() - ((Double) obj2).doubleValue()) < 1.0E-6d;
        }
        if ((obj instanceof JsonObjectApi) && (obj2 instanceof JsonObjectApi)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof JsonArrayApi) && (obj2 instanceof JsonArrayApi)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof JsonElementApi) && (obj2 instanceof JsonElementApi)) {
            return obj.equals(obj2);
        }
        return (obj instanceof Number) && (obj2 instanceof Number) && Math.abs(((Number) obj).doubleValue() - ((Number) obj2).doubleValue()) < 1.0E-4d;
    }

    public static boolean d(Uri uri) {
        return (uri == null || Uri.EMPTY.equals(uri)) ? false : true;
    }

    public static String[] e(JsonArrayApi jsonArrayApi) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jsonArrayApi.length(); i2++) {
            String string = jsonArrayApi.getString(i2);
            if (string != null) {
                arrayList.add(string);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    public static Boolean f(Object obj, Boolean bool) {
        Boolean bool2;
        Number number;
        if (obj instanceof Boolean) {
            bool2 = (Boolean) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (Boolean.toString(true).equalsIgnoreCase(str) || Integer.toString(1).equalsIgnoreCase(str)) {
                bool2 = Boolean.TRUE;
            } else if (Boolean.toString(false).equalsIgnoreCase(str) || Integer.toString(0).equalsIgnoreCase(str)) {
                bool2 = Boolean.FALSE;
            } else if (obj instanceof Number) {
                number = (Number) obj;
                if (1 == number.intValue()) {
                    bool2 = Boolean.TRUE;
                } else if (number.intValue() == 0) {
                    bool2 = Boolean.FALSE;
                } else {
                    bool2 = null;
                }
            } else {
                bool2 = null;
            }
        } else if (obj instanceof Number) {
            number = (Number) obj;
            if (1 == number.intValue()) {
                bool2 = Boolean.TRUE;
            } else if (number.intValue() == 0) {
                bool2 = Boolean.FALSE;
            } else {
                bool2 = null;
            }
        } else {
            bool2 = null;
        }
        return bool2 != null ? bool2 : bool;
    }

    public static Double g(Object obj, Double d) {
        Double dValueOf;
        if (obj instanceof Double) {
            dValueOf = (Double) obj;
        } else if (obj instanceof Number) {
            dValueOf = Double.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            try {
                dValueOf = Double.valueOf(Double.parseDouble((String) obj));
            } catch (Throwable unused) {
                dValueOf = null;
            }
        } else {
            dValueOf = null;
        }
        return dValueOf != null ? dValueOf : d;
    }

    public static Integer h(Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JsonArrayApi i(Object obj) {
        JsonArrayApi jsonArrayApiJ = j(obj);
        return jsonArrayApiJ == null ? JsonArray.g() : jsonArrayApiJ;
    }

    public static JsonArrayApi j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonArrayApi) {
            return (JsonArrayApi) obj;
        }
        if (obj instanceof JSONArray) {
            return new JsonArray((JSONArray) obj);
        }
        try {
            if (obj instanceof Collection) {
                return new JsonArray(new JSONArray((Collection) obj));
            }
            if (obj instanceof String) {
                return new JsonArray(new JSONArray((String) obj));
            }
            if (obj.getClass().isArray()) {
                JSONArray jSONArray = new JSONArray();
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    jSONArray.put(Array.get(obj, i2));
                }
                return new JsonArray(jSONArray);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public static JsonObjectApi k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonObjectApi) {
            return (JsonObjectApi) obj;
        }
        if (obj instanceof JSONObject) {
            return new JsonObject((JSONObject) obj);
        }
        try {
            if (obj instanceof String) {
                return new JsonObject(new JSONObject((String) obj));
            }
            if (obj instanceof Map) {
                return new JsonObject(new JSONObject((Map) obj));
            }
            if (obj instanceof Bundle) {
                return new JsonObject(new JSONObject(a((Bundle) obj)));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JsonObjectApi l(Object obj, boolean z2) {
        JsonObjectApi jsonObjectApiK = k(obj);
        return (jsonObjectApiK == null && z2) ? JsonObject.w() : jsonObjectApiK;
    }

    public static Long m(Long l2, Object obj) {
        Long lValueOf;
        if (obj instanceof Number) {
            lValueOf = Long.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            try {
                lValueOf = Long.valueOf(Long.parseLong((String) obj));
            } catch (Throwable unused) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf : l2;
    }

    public static String n(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof JsonObjectApi) || (obj instanceof JsonArrayApi)) {
            return obj.toString();
        }
        return null;
    }

    public static Uri o(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JsonArray p(String[] strArr) {
        JsonArray jsonArrayG = JsonArray.g();
        for (String str : strArr) {
            if (str != null) {
                synchronized (jsonArrayG) {
                    jsonArrayG.e(str);
                }
            }
        }
        return jsonArrayG;
    }

    public static ArrayList q(List list) {
        ArrayList arrayList;
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        return arrayList;
    }
}
