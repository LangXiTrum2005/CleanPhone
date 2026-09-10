package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c81 extends a81 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13093b = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c81 f13094c = new c81("CharMatcher.whitespace()");

    @Override // com.google.android.gms.internal.ads.y71
    public final boolean a(char c4) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c4) >>> f13093b) == c4;
    }
}
