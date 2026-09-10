package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class ListFieldSchemas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ListFieldSchema f4868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ListFieldSchemaLite f4869b;

    static {
        ListFieldSchema listFieldSchema;
        Protobuf protobuf = Protobuf.f4904c;
        try {
            listFieldSchema = (ListFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            listFieldSchema = null;
        }
        f4868a = listFieldSchema;
        f4869b = new ListFieldSchemaLite();
    }
}
