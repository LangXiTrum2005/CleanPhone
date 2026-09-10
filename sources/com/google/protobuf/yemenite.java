package com.google.protobuf;

/* JADX INFO: compiled from: NewInstanceSchemas.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yemenite {
    private static final trm FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final trm LITE_SCHEMA = new oilcan();

    public static trm full() {
        return FULL_SCHEMA;
    }

    public static trm lite() {
        return LITE_SCHEMA;
    }

    private static trm loadSchemaForFullRuntime() {
        try {
            return (trm) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
