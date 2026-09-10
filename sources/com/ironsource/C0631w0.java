package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0631w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<NetworkSettings> f30878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0462ma f30879c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0631w0(String str, List<? extends NetworkSettings> providerList, C0462ma publisherDataHolder) {
        kotlin.jvm.internal.n.f(providerList, "providerList");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        this.f30877a = str;
        this.f30878b = providerList;
        this.f30879c = publisherDataHolder;
    }

    public final String a() {
        return this.f30877a;
    }

    public final List<NetworkSettings> b() {
        return this.f30878b;
    }

    public final C0462ma c() {
        return this.f30879c;
    }

    public final List<NetworkSettings> d() {
        return this.f30878b;
    }

    public final C0462ma e() {
        return this.f30879c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0631w0)) {
            return false;
        }
        C0631w0 c0631w0 = (C0631w0) obj;
        return kotlin.jvm.internal.n.a(this.f30877a, c0631w0.f30877a) && kotlin.jvm.internal.n.a(this.f30878b, c0631w0.f30878b) && kotlin.jvm.internal.n.a(this.f30879c, c0631w0.f30879c);
    }

    public final String f() {
        return this.f30877a;
    }

    public int hashCode() {
        String str = this.f30877a;
        return this.f30879c.hashCode() + q4.a.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f30878b);
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.f30877a + ", providerList=" + this.f30878b + ", publisherDataHolder=" + this.f30879c + ")";
    }

    public final C0631w0 a(String str, List<? extends NetworkSettings> providerList, C0462ma publisherDataHolder) {
        kotlin.jvm.internal.n.f(providerList, "providerList");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        return new C0631w0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0631w0 a(C0631w0 c0631w0, String str, List list, C0462ma c0462ma, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0631w0.f30877a;
        }
        if ((i10 & 2) != 0) {
            list = c0631w0.f30878b;
        }
        if ((i10 & 4) != 0) {
            c0462ma = c0631w0.f30879c;
        }
        return c0631w0.a(str, list, c0462ma);
    }
}
