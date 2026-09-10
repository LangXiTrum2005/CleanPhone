package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: gatewayprotocol.v1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2266a implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i) {
        return AdRequestOuterClass.AdRequestType.forNumber(i);
    }
}
