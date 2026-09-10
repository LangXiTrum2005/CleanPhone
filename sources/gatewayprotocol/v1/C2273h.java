package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: gatewayprotocol.v1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2273h implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2273h f2766a = new C2273h();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(i) != null;
    }
}
