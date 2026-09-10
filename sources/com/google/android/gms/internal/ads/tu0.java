package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f20515a;

    public tu0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) zzba.zzc().a(am.U7));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f20515a = patternCompile;
    }
}
