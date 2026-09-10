package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.ac, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0249ac extends W {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f28210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f28211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Qb f28212u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0249ac(String str, List<? extends NetworkSettings> list, Qb configs) {
        super(IronSource.a.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / ((long) 1000)), configs.a(), configs.f(), -1, new O0(O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new J0(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        kotlin.jvm.internal.n.f(configs, "configs");
        this.f28210s = str;
        this.f28211t = list;
        this.f28212u = configs;
    }

    public final C0249ac a(String str, List<? extends NetworkSettings> list, Qb configs) {
        kotlin.jvm.internal.n.f(configs, "configs");
        return new C0249ac(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0249ac)) {
            return false;
        }
        C0249ac c0249ac = (C0249ac) obj;
        return kotlin.jvm.internal.n.a(this.f28210s, c0249ac.f28210s) && kotlin.jvm.internal.n.a(this.f28211t, c0249ac.f28211t) && kotlin.jvm.internal.n.a(this.f28212u, c0249ac.f28212u);
    }

    public int hashCode() {
        String str = this.f28210s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f28211t;
        return this.f28212u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.W
    public List<NetworkSettings> j() {
        return this.f28211t;
    }

    @Override // com.ironsource.W
    public String o() {
        return this.f28210s;
    }

    public final String s() {
        return this.f28210s;
    }

    public final List<NetworkSettings> t() {
        return this.f28211t;
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + this.f28210s + ", providerList=" + this.f28211t + ", configs=" + this.f28212u + ")";
    }

    public final Qb u() {
        return this.f28212u;
    }

    public final Qb v() {
        return this.f28212u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0249ac a(C0249ac c0249ac, String str, List list, Qb qb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0249ac.f28210s;
        }
        if ((i10 & 2) != 0) {
            list = c0249ac.f28211t;
        }
        if ((i10 & 4) != 0) {
            qb2 = c0249ac.f28212u;
        }
        return c0249ac.a(str, list, qb2);
    }
}
