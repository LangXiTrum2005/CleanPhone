package com.ironsource;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P3 f27193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gd f27194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, C0497o9> f27195c;

    public Se(P3 configurations, Gd providerOrder, Map<String, C0497o9> providerSettings) {
        kotlin.jvm.internal.n.f(configurations, "configurations");
        kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        this.f27193a = configurations;
        this.f27194b = providerOrder;
        this.f27195c = providerSettings;
    }

    public final P3 a() {
        return this.f27193a;
    }

    public final Gd b() {
        return this.f27194b;
    }

    public final Map<String, C0497o9> c() {
        return this.f27195c;
    }

    public final P3 d() {
        return this.f27193a;
    }

    public final Gd e() {
        return this.f27194b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Se)) {
            return false;
        }
        Se se2 = (Se) obj;
        return kotlin.jvm.internal.n.a(this.f27193a, se2.f27193a) && kotlin.jvm.internal.n.a(this.f27194b, se2.f27194b) && kotlin.jvm.internal.n.a(this.f27195c, se2.f27195c);
    }

    public final Map<String, C0497o9> f() {
        return this.f27195c;
    }

    public int hashCode() {
        return this.f27195c.hashCode() + ((this.f27194b.hashCode() + (this.f27193a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ServerResponse2(configurations=" + this.f27193a + ", providerOrder=" + this.f27194b + ", providerSettings=" + this.f27195c + ")";
    }

    public final Se a(P3 configurations, Gd providerOrder, Map<String, C0497o9> providerSettings) {
        kotlin.jvm.internal.n.f(configurations, "configurations");
        kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        return new Se(configurations, providerOrder, providerSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Se a(Se se2, P3 p10, Gd gd2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p10 = se2.f27193a;
        }
        if ((i10 & 2) != 0) {
            gd2 = se2.f27194b;
        }
        if ((i10 & 4) != 0) {
            map = se2.f27195c;
        }
        return se2.a(p10, gd2, map);
    }
}
