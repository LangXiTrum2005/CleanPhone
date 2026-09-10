package nd;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum b0 implements Internal.EnumLite {
    NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
    GENERIC_CLIENT_ERROR(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46668a;

    b0(int i10) {
        this.f46668a = i10;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f46668a;
    }
}
