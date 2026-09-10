package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18664c;

    public pi(int i10, long j10, String str) {
        this.f18662a = j10;
        this.f18663b = str;
        this.f18664c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pi)) {
            return false;
        }
        pi piVar = (pi) obj;
        return piVar.f18662a == this.f18662a && piVar.f18664c == this.f18664c;
    }

    public final int hashCode() {
        return (int) this.f18662a;
    }
}
