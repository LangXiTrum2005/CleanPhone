package com.google.gson.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonToken {
    public static final JsonToken X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final JsonToken f21327Y;
    public static final JsonToken Z;
    public static final JsonToken e0;
    public static final JsonToken f0;
    public static final JsonToken g0;
    public static final JsonToken h0;
    public static final JsonToken i0;
    public static final JsonToken j0;
    public static final JsonToken k0;
    public static final /* synthetic */ JsonToken[] l0;

    static {
        JsonToken jsonToken = new JsonToken("BEGIN_ARRAY", 0);
        X = jsonToken;
        JsonToken jsonToken2 = new JsonToken("END_ARRAY", 1);
        f21327Y = jsonToken2;
        JsonToken jsonToken3 = new JsonToken("BEGIN_OBJECT", 2);
        Z = jsonToken3;
        JsonToken jsonToken4 = new JsonToken("END_OBJECT", 3);
        e0 = jsonToken4;
        JsonToken jsonToken5 = new JsonToken("NAME", 4);
        f0 = jsonToken5;
        JsonToken jsonToken6 = new JsonToken("STRING", 5);
        g0 = jsonToken6;
        JsonToken jsonToken7 = new JsonToken("NUMBER", 6);
        h0 = jsonToken7;
        JsonToken jsonToken8 = new JsonToken("BOOLEAN", 7);
        i0 = jsonToken8;
        JsonToken jsonToken9 = new JsonToken("NULL", 8);
        j0 = jsonToken9;
        JsonToken jsonToken10 = new JsonToken("END_DOCUMENT", 9);
        k0 = jsonToken10;
        l0 = new JsonToken[]{jsonToken, jsonToken2, jsonToken3, jsonToken4, jsonToken5, jsonToken6, jsonToken7, jsonToken8, jsonToken9, jsonToken10};
    }

    public static JsonToken valueOf(String str) {
        return (JsonToken) Enum.valueOf(JsonToken.class, str);
    }

    public static JsonToken[] values() {
        return (JsonToken[]) l0.clone();
    }
}
