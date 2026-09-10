package com.smartdigimkt.n6;

import android.os.Bundle;
import android.util.Log;
import com.smartdigimkt.sdk.core.bridge.entity.BaseInfoEntity;
import com.smartdigimkt.sdk.core.bridge.entity.BiddingResultInfoEntity;
import com.smartdigimkt.sdk.core.bridge.entity.DataField;
import com.smartdigimkt.sdk.core.bridge.entity.OfferInfoEntity;
import com.smartdigimkt.sdk.core.bridge.entity.RequestInfoEntity;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37109a = "EntityParser";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, List<a>> f37110b = new ConcurrentHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Field f37111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f37112b;

        public a(Field field, String str) {
            this.f37111a = field;
            this.f37112b = str;
        }
    }

    public static Bundle a(Object obj) {
        Bundle bundle = new Bundle();
        try {
            for (a aVar : a(obj.getClass())) {
                try {
                    Object obj2 = aVar.f37111a.get(obj);
                    if (obj2 != null) {
                        a(bundle, aVar.f37112b, obj2);
                    }
                } catch (Throwable th) {
                    Log.e(f37109a, "toBundle() >>> field get failed.", th);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    public static <T extends BaseInfoEntity> T a(Bundle bundle, Class<T> cls) {
        try {
            T tNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            for (a aVar : a((Class<?>) cls)) {
                Object objA = a(bundle, aVar.f37112b, aVar.f37111a.getType());
                if (objA != null) {
                    try {
                        if (objA instanceof Bundle) {
                            objA = a((Bundle) objA, aVar.f37111a.getType());
                        }
                        aVar.f37111a.set(tNewInstance, objA);
                    } catch (Throwable th) {
                        Log.e(f37109a, "parse() >>> field set failed.", th);
                    }
                }
            }
            return tNewInstance;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<a> a(Class<?> cls) {
        List<a> list = f37110b.get(cls);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            DataField dataField = (DataField) field.getAnnotation(DataField.class);
            if (dataField != null) {
                field.setAccessible(true);
                arrayList.add(new a(field, dataField.value()));
            }
        }
        f37110b.put(cls, arrayList);
        return arrayList;
    }

    private static void a(Bundle bundle, String str, Object obj) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof String[]) {
            bundle.putStringArray(str, (String[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Byte) {
            bundle.putByte(str, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
        } else if (obj instanceof Bundle) {
            bundle.putBundle(str, (Bundle) obj);
        } else {
            Log.e(f37109a, "putToBundle() >>> unsupported type.");
        }
    }

    private static Object a(Bundle bundle, String str, Class<?> cls) {
        if (cls == String.class) {
            return bundle.getString(str);
        }
        if (cls == String[].class) {
            return bundle.getStringArray(str);
        }
        if (cls != Integer.TYPE && cls != Integer.class) {
            if (cls != Boolean.TYPE && cls != Boolean.class) {
                if (cls != Long.TYPE && cls != Long.class) {
                    if (cls != Double.TYPE && cls != Double.class) {
                        if (cls != Float.TYPE && cls != Float.class) {
                            if (cls != Byte.TYPE && cls != Byte.class) {
                                if (cls != Short.TYPE && cls != Short.class) {
                                    if (cls != Bundle.class && cls != RequestInfoEntity.class && cls != OfferInfoEntity.class) {
                                        if (cls == BiddingResultInfoEntity.class) {
                                            return bundle.getBundle(str);
                                        }
                                        Log.e(f37109a, "getFromBundle() >>> unsupported type: " + cls);
                                        return null;
                                    }
                                    return bundle.getBundle(str);
                                }
                                return Short.valueOf(bundle.getShort(str));
                            }
                            return Byte.valueOf(bundle.getByte(str));
                        }
                        return Float.valueOf(bundle.getFloat(str));
                    }
                    return Double.valueOf(bundle.getDouble(str));
                }
                return Long.valueOf(bundle.getLong(str));
            }
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        return Integer.valueOf(bundle.getInt(str));
    }
}
