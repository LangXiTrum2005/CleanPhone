package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2150x0 implements Internal.EnumVerifier {
    static final Internal.EnumVerifier INSTANCE = new C2150x0();

    private C2150x0() {
    }

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i) {
        return NullValue.forNumber(i) != null;
    }
}
