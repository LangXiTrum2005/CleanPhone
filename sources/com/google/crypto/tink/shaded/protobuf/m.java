package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public m(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(int i10, int i11, int i12, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbL = wi.d.l(i10, "Pos: ", ", limit: ");
        sbL.append(i11);
        sbL.append(", len: ");
        sbL.append(i12);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbL.toString()), indexOutOfBoundsException);
    }
}
