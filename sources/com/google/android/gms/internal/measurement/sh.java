package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sh implements jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh f23970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23971b;

    public sh(jh jhVar, Object obj) {
        this.f23970a = jhVar;
        gb.b(obj, "log site qualifier");
        this.f23971b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        return this.f23970a.equals(shVar.f23970a) && this.f23971b.equals(shVar.f23971b);
    }

    public final int hashCode() {
        return this.f23971b.hashCode() ^ this.f23970a.hashCode();
    }

    public final String toString() {
        String string = this.f23970a.toString();
        int length = string.length();
        String string2 = this.f23971b.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 3);
        d5.u.r(sb2, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb2.append("' }");
        return sb2.toString();
    }
}
