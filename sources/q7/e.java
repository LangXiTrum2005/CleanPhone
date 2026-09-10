package q7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f48676a;

    static {
        HashMap map = new HashMap();
        f48676a = map;
        map.put(Boolean.class, new d(0));
        map.put(Integer.class, new d(1));
        map.put(Long.class, new d(2));
        map.put(Double.class, new d(3));
        map.put(String.class, new d(4));
        map.put(String[].class, new d(5));
        map.put(JSONArray.class, new d(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object obj = jSONObject.get(key);
            if (obj != JSONObject.NULL) {
                if (!(obj instanceof JSONObject)) {
                    d dVar = (d) f48676a.get(obj.getClass());
                    if (dVar == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    kotlin.jvm.internal.n.e(key, "key");
                    switch (dVar.f48675a) {
                        case 0:
                            bundle.putBoolean(key, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(key, ((Integer) obj).intValue());
                            break;
                        case 2:
                            bundle.putLong(key, ((Long) obj).longValue());
                            break;
                        case 3:
                            bundle.putDouble(key, ((Double) obj).doubleValue());
                            break;
                        case 4:
                            bundle.putString(key, (String) obj);
                            break;
                        case 5:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() == 0) {
                                bundle.putStringArrayList(key, arrayList);
                            } else {
                                int length = jSONArray.length();
                                for (int i10 = 0; i10 < length; i10++) {
                                    Object obj2 = jSONArray.get(i10);
                                    if (!(obj2 instanceof String)) {
                                        throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                                    }
                                    arrayList.add(obj2);
                                }
                                bundle.putStringArrayList(key, arrayList);
                            }
                            break;
                    }
                } else {
                    bundle.putBundle(key, a((JSONObject) obj));
                }
            }
        }
        return bundle;
    }
}
