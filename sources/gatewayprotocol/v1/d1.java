package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i10) {
        return TransactionEventRequestOuterClass.StoreType.forNumber(i10);
    }
}
