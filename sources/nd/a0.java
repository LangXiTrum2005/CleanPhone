package nd;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f46664a = new a0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i10) {
        b0 b0Var;
        if (i10 != 0) {
            b0Var = i10 != 1 ? null : b0.GENERIC_CLIENT_ERROR;
        } else {
            b0Var = b0.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }
        return b0Var != null;
    }
}
