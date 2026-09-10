package ads_mobile_sdk;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class kr extends IOException {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kr(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        this("Pos: " + j + ", limit: " + j2 + ", len: " + i, indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public kr(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public kr(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, indexOutOfBoundsException);
    }
}
