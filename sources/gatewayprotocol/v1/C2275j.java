package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: gatewayprotocol.v1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2275j implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2275j f2767a = new C2275j();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DeveloperConsentOuterClass.DeveloperConsentType.forNumber(i) != null;
    }
}
