package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ic extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ic(hc hcVar, gc gcVar, long j10) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j10);
        super(String.format(locale, pc.a("bk3t6gFTc30="), Long.valueOf(hcVar.f15255a), Long.valueOf(gcVar.f14834a), lValueOf));
        Optional.of(gcVar);
        Optional.of(lValueOf);
    }

    public ic(hc hcVar, Exception exc) {
        super(String.format(Locale.US, pc.a("bk0="), Long.valueOf(hcVar.f15255a)), exc);
        Optional.empty();
        Optional.empty();
    }
}
