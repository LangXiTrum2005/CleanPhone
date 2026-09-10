package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzps extends IOException {
    public zzps() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzps(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i))), th);
    }

    public zzps(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
