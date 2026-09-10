package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f41809a = new y0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i10) {
        return OperativeEventRequestOuterClass.OperativeEventType.forNumber(i10) != null;
    }
}
