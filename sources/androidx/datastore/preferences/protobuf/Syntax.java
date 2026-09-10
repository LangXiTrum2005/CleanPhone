package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public final int X;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Syntax$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<Syntax> {
    }

    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i2) {
            Syntax syntax;
            if (i2 == 0) {
                syntax = Syntax.SYNTAX_PROTO2;
            } else if (i2 != 1) {
                syntax = i2 != 2 ? null : Syntax.SYNTAX_EDITIONS;
            } else {
                syntax = Syntax.SYNTAX_PROTO3;
            }
            return syntax != null;
        }
    }

    Syntax(int i2) {
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
