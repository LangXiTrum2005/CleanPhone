package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public final int X;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.NullValue$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<NullValue> {
    }

    public static final class NullValueVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i2) {
            return (i2 != 0 ? null : NullValue.NULL_VALUE) != null;
        }
    }

    NullValue(int i2) {
        this.X = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.X;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
