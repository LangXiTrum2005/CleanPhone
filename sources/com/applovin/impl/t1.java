package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9731c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9729a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9732d = System.currentTimeMillis();

    public t1(String str, Map map) {
        this.f9730b = str;
        this.f9731c = map;
    }

    public long a() {
        return this.f9732d;
    }

    public String b() {
        return this.f9729a;
    }

    public String c() {
        return this.f9730b;
    }

    public Map d() {
        return this.f9731c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (this.f9732d == t1Var.f9732d && Objects.equals(this.f9730b, t1Var.f9730b) && Objects.equals(this.f9731c, t1Var.f9731c)) {
            return Objects.equals(this.f9729a, t1Var.f9729a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9730b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f9731c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f9732d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f9729a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f9730b + "', id='" + this.f9729a + "', creationTimestampMillis=" + this.f9732d + ", parameters=" + this.f9731c + '}';
    }
}
