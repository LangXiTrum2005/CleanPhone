package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzll extends IOException {
    public zzll() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzll(long j, long j2, int i2, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbV = a.v(j, "Pos: ", ", limit: ");
        sbV.append(j2);
        sbV.append(", len: ");
        sbV.append(i2);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbV.toString()), th);
    }

    public zzll(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
