package b2;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z extends IOException {
    public /* synthetic */ z(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(long j10, long j11, int i10, IndexOutOfBoundsException indexOutOfBoundsException, int i11) {
        switch (i11) {
            case 5:
                Locale locale = Locale.US;
                StringBuilder sbL = wi.d.l(j10, "Pos: ", ", limit: ");
                sbL.append(j11);
                sbL.append(", len: ");
                sbL.append(i10);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbL.toString()), indexOutOfBoundsException);
                break;
            case 8:
                Locale locale2 = Locale.US;
                StringBuilder sbL2 = wi.d.l(j10, "Pos: ", ", limit: ");
                sbL2.append(j11);
                sbL2.append(", len: ");
                sbL2.append(i10);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbL2.toString()), indexOutOfBoundsException);
                break;
            default:
                Locale locale3 = Locale.US;
                StringBuilder sbL3 = wi.d.l(j10, "Pos: ", ", limit: ");
                sbL3.append(j11);
                sbL3.append(", len: ");
                sbL3.append(i10);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbL3.toString()), indexOutOfBoundsException);
                break;
        }
    }

    public z(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        sb2.append(": ".concat(str));
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "toString(...)");
        super(string);
    }
}
