package com.ironsource;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f26476a;

    public L1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> a() {
        return this.f26476a;
    }

    public final Map<String, String> b() {
        return this.f26476a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L1) && kotlin.jvm.internal.n.a(this.f26476a, ((L1) obj).f26476a);
    }

    public int hashCode() {
        return this.f26476a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f26476a + ")";
    }

    public L1(Map<String, String> mediationTypes) {
        kotlin.jvm.internal.n.f(mediationTypes, "mediationTypes");
        this.f26476a = mediationTypes;
    }

    public final L1 a(Map<String, String> mediationTypes) {
        kotlin.jvm.internal.n.f(mediationTypes, "mediationTypes");
        return new L1(mediationTypes);
    }

    public /* synthetic */ L1(Map map, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? xj.w.f53867a : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ L1 a(L1 l10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = l10.f26476a;
        }
        return l10.a(map);
    }
}
