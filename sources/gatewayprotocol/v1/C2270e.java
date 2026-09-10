package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: gatewayprotocol.v1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2270e implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i) {
        return ClientInfoOuterClass.Platform.forNumber(i);
    }
}
