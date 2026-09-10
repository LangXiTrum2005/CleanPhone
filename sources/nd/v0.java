package nd;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum v0 implements Internal.EnumLite {
    SOURCE_UNKNOWN(0),
    FL_LEGACY_V1(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46698a;

    v0(int i10) {
        this.f46698a = i10;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f46698a;
    }
}
