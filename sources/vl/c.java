package vl;

import zl.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o[] f52627c;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i10, o[] oVarArr) {
        if (oVarArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i11 = 1;
        int length = oVarArr.length - 1;
        if (length != 0) {
            for (int i12 = 31; i12 >= 0; i12--) {
                if (((1 << i12) & length) != 0) {
                    i11 = 1 + i12;
                }
            }
            throw new IllegalStateException("Empty enum: " + oVarArr.getClass());
        }
        super(i10, i11);
        this.f52627c = oVarArr;
    }

    public final Object c(int i10) {
        int i11 = (1 << this.f52629b) - 1;
        int i12 = this.f52628a;
        int i13 = (i10 & (i11 << i12)) >> i12;
        for (o oVar : this.f52627c) {
            if (oVar.getNumber() == i13) {
                return oVar;
            }
        }
        return null;
    }
}
