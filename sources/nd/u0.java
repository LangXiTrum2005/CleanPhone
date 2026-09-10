package nd;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f46693a = new u0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i10) {
        v0 v0Var;
        if (i10 != 0) {
            v0Var = i10 != 1 ? null : v0.FL_LEGACY_V1;
        } else {
            v0Var = v0.SOURCE_UNKNOWN;
        }
        return v0Var != null;
    }
}
