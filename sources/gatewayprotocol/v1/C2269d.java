package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: gatewayprotocol.v1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2269d implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2269d f2764a = new C2269d();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return ClientInfoOuterClass.MediationProvider.forNumber(i) != null;
    }
}
