package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: gatewayprotocol.v1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2271f implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2271f f2765a = new C2271f();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return ClientInfoOuterClass.Platform.forNumber(i) != null;
    }
}
