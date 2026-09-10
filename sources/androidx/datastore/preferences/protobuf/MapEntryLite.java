package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class MapEntryLite<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Metadata f4875a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4876a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f4876a = iArr;
            try {
                iArr[WireFormat.FieldType.n0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4876a[WireFormat.FieldType.q0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4876a[WireFormat.FieldType.m0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Metadata<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f4877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WireFormat.FieldType f4878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GeneratedMessageLite f4879c;

        public Metadata(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
            this.f4877a = fieldType;
            this.f4878b = fieldType2;
            this.f4879c = generatedMessageLite;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
        this.f4875a = new Metadata(fieldType, fieldType2, generatedMessageLite);
    }

    public static int a(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.b(metadata.f4877a, 1, obj) + FieldSet.b(metadata.f4878b, 2, obj2);
    }

    public static void b(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.n(codedOutputStream, metadata.f4877a, 1, obj);
        FieldSet.n(codedOutputStream, metadata.f4878b, 2, obj2);
    }
}
