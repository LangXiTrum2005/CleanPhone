package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oa.u0 f23304d = oa.u0.u(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23307c;

    public b(String str, long j10, HashMap map) {
        this.f23305a = str;
        this.f23306b = j10;
        HashMap map2 = new HashMap();
        this.f23307c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(String str, Object obj, Object obj2) {
        if (f23304d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f23305a, this.f23306b, new HashMap(this.f23307c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f23306b == bVar.f23306b && this.f23305a.equals(bVar.f23305a)) {
            return this.f23307c.equals(bVar.f23307c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23305a.hashCode() * 31;
        long j10 = this.f23306b;
        return this.f23307c.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f23305a;
        String string = this.f23307c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f23306b;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 25, String.valueOf(j10).length(), 9, string.length()) + 1);
        wi.d.m(sb2, "Event{name='", str, "', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
