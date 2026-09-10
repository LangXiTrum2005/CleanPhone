package com.google.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gintrap {
    private static final adultoid FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final adultoid LITE_SCHEMA = new dovishness();

    public static adultoid full() {
        return FULL_SCHEMA;
    }

    public static adultoid lite() {
        return LITE_SCHEMA;
    }

    private static adultoid loadSchemaForFullRuntime() {
        try {
            return (adultoid) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
