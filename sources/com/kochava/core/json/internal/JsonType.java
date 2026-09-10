package com.kochava.core.json.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class JsonType {
    public static final JsonType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final JsonType f28022Y;
    public static final JsonType Z;
    public static final JsonType e0;
    public static final JsonType f0;
    public static final JsonType g0;
    public static final JsonType h0;
    public static final JsonType i0;
    public static final JsonType j0;
    public static final JsonType k0;
    public static final /* synthetic */ JsonType[] l0;

    static {
        JsonType jsonType = new JsonType("Invalid", 0);
        X = jsonType;
        JsonType jsonType2 = new JsonType("Null", 1);
        f28022Y = jsonType2;
        JsonType jsonType3 = new JsonType("String", 2);
        Z = jsonType3;
        JsonType jsonType4 = new JsonType("Boolean", 3);
        e0 = jsonType4;
        JsonType jsonType5 = new JsonType("Int", 4);
        f0 = jsonType5;
        JsonType jsonType6 = new JsonType("Long", 5);
        g0 = jsonType6;
        JsonType jsonType7 = new JsonType("Float", 6);
        h0 = jsonType7;
        JsonType jsonType8 = new JsonType("Double", 7);
        i0 = jsonType8;
        JsonType jsonType9 = new JsonType("JsonObject", 8);
        j0 = jsonType9;
        JsonType jsonType10 = new JsonType("JsonArray", 9);
        k0 = jsonType10;
        l0 = new JsonType[]{jsonType, jsonType2, jsonType3, jsonType4, jsonType5, jsonType6, jsonType7, jsonType8, jsonType9, jsonType10};
    }

    public static JsonType a(Object obj) {
        if (obj == null || obj == JsonElement.f28017b) {
            return f28022Y;
        }
        Object obj2 = JsonElement.f28018c;
        JsonType jsonType = X;
        if (obj == obj2) {
            return jsonType;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return Z;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return e0;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return f0;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return g0;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return h0;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return i0;
        }
        if (cls == JsonObjectApi.class || cls == JsonObject.class) {
            return j0;
        }
        return (cls == JsonArrayApi.class || cls == JsonArray.class) ? k0 : jsonType;
    }

    public static JsonType valueOf(String str) {
        return (JsonType) Enum.valueOf(JsonType.class, str);
    }

    public static JsonType[] values() {
        return (JsonType[]) l0.clone();
    }
}
