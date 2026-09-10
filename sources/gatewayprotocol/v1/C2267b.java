package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: gatewayprotocol.v1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2267b implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2267b f2763a = new C2267b();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return AdRequestOuterClass.AdRequestType.forNumber(i) != null;
    }
}
