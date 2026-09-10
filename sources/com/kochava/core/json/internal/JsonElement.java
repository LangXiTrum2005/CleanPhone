package com.kochava.core.json.internal;

import com.kochava.core.util.internal.ObjectUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class JsonElement implements JsonElementApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f28017b = JSONObject.NULL;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28018c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28019a;

    public JsonElement(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        this.f28019a = obj;
    }

    public static JsonElement f(boolean z2) {
        return new JsonElement(Boolean.valueOf(z2));
    }

    public static JsonElement g(int i2) {
        return new JsonElement(Integer.valueOf(i2));
    }

    public static JsonElement h() {
        return new JsonElement(f28017b);
    }

    public static JsonElement i(Object obj) {
        JsonType jsonTypeA = JsonType.a(obj);
        if (obj == null || jsonTypeA == JsonType.f28022Y) {
            return new JsonElement(f28017b);
        }
        return jsonTypeA == JsonType.X ? new JsonElement(f28018c) : new JsonElement(obj);
    }

    @Override // com.kochava.core.json.internal.JsonElementApi
    public final String a() {
        String strN = ObjectUtil.n(this.f28019a);
        return strN != null ? strN : "";
    }

    @Override // com.kochava.core.json.internal.JsonElementApi
    public final JsonObjectApi b() {
        return ObjectUtil.l(this.f28019a, true);
    }

    @Override // com.kochava.core.json.internal.JsonElementApi
    public final boolean c() {
        return JsonType.a(this.f28019a) == JsonType.f28022Y;
    }

    @Override // com.kochava.core.json.internal.JsonElementApi
    public final Object d() {
        return this.f28019a;
    }

    @Override // com.kochava.core.json.internal.JsonElementApi
    public final JsonArrayApi e() {
        return ObjectUtil.i(this.f28019a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonElement.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f28019a;
        JsonType jsonTypeA = JsonType.a(obj2);
        Object obj3 = ((JsonElement) obj).f28019a;
        if (jsonTypeA != JsonType.a(obj3)) {
            return false;
        }
        if (jsonTypeA == JsonType.X || jsonTypeA == JsonType.f28022Y) {
            return true;
        }
        return ObjectUtil.c(obj2, obj3);
    }

    @Override // com.kochava.core.json.internal.JsonElementApi
    public final JsonType getType() {
        return JsonType.a(this.f28019a);
    }

    public final int hashCode() {
        Object obj = this.f28019a;
        JsonType jsonTypeA = JsonType.a(obj);
        StringBuilder sb = new StringBuilder();
        sb.append(jsonTypeA == JsonType.X ? "invalid" : obj.toString());
        sb.append(jsonTypeA.toString());
        return sb.toString().hashCode();
    }

    @Override // com.kochava.core.json.internal.JsonElementApi
    public final boolean isValid() {
        return JsonType.a(this.f28019a) != JsonType.X;
    }

    public final String toString() {
        Object obj = this.f28019a;
        return JsonType.a(obj) == JsonType.X ? "invalid" : obj.toString();
    }
}
