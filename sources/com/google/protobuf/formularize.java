package com.google.protobuf;

/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes3.dex */
public final class formularize {
    private static final cutely<?> LITE_SCHEMA = new apical();
    private static final cutely<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    public static cutely<?> full() {
        cutely<?> cutelyVar = FULL_SCHEMA;
        if (cutelyVar != null) {
            return cutelyVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static cutely<?> lite() {
        return LITE_SCHEMA;
    }

    private static cutely<?> loadSchemaForFullRuntime() {
        try {
            return (cutely) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
