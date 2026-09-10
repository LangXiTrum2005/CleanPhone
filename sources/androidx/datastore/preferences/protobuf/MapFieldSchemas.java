package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class MapFieldSchemas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MapFieldSchema f4881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MapFieldSchemaLite f4882b;

    static {
        MapFieldSchema mapFieldSchema;
        Protobuf protobuf = Protobuf.f4904c;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            mapFieldSchema = null;
        }
        f4881a = mapFieldSchema;
        f4882b = new MapFieldSchemaLite();
    }
}
