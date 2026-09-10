package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class or1 implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f18350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18351b;

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f18350a[i10];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f18350a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new String(this.f18350a, i10, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f18351b == null) {
            this.f18351b = new String(this.f18350a);
        }
        return this.f18351b;
    }
}
