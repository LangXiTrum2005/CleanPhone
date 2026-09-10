package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class FieldInfo implements Comparable<FieldInfo> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4835a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f4835a = iArr;
            try {
                iArr[FieldType.f4842Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4835a[FieldType.Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4835a[FieldType.e0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4835a[FieldType.h0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {
    }

    @Override // java.lang.Comparable
    public final int compareTo(FieldInfo fieldInfo) {
        fieldInfo.getClass();
        return 0;
    }
}
