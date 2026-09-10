package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f23587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f23590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f23591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f23594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sc f23595k;

    public ie(boolean z10, oa.j0 enabledBackings, s0 secret, String dirPath, String gmsCoreDirPath, oa.j0 includeStaticConfigPackages, oa.j0 excludeStaticConfigPackages, boolean z11, boolean z12, boolean z13, sc clientFlags) {
        kotlin.jvm.internal.n.f(enabledBackings, "enabledBackings");
        kotlin.jvm.internal.n.f(secret, "secret");
        kotlin.jvm.internal.n.f(dirPath, "dirPath");
        kotlin.jvm.internal.n.f(gmsCoreDirPath, "gmsCoreDirPath");
        kotlin.jvm.internal.n.f(includeStaticConfigPackages, "includeStaticConfigPackages");
        kotlin.jvm.internal.n.f(excludeStaticConfigPackages, "excludeStaticConfigPackages");
        kotlin.jvm.internal.n.f(clientFlags, "clientFlags");
        this.f23585a = z10;
        this.f23586b = enabledBackings;
        this.f23587c = secret;
        this.f23588d = dirPath;
        this.f23589e = gmsCoreDirPath;
        this.f23590f = includeStaticConfigPackages;
        this.f23591g = excludeStaticConfigPackages;
        this.f23592h = z11;
        this.f23593i = z12;
        this.f23594j = z13;
        this.f23595k = clientFlags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return this.f23585a == ieVar.f23585a && kotlin.jvm.internal.n.a(this.f23586b, ieVar.f23586b) && kotlin.jvm.internal.n.a(this.f23587c, ieVar.f23587c) && kotlin.jvm.internal.n.a(this.f23588d, ieVar.f23588d) && kotlin.jvm.internal.n.a(this.f23589e, ieVar.f23589e) && kotlin.jvm.internal.n.a(this.f23590f, ieVar.f23590f) && kotlin.jvm.internal.n.a(this.f23591g, ieVar.f23591g) && this.f23592h == ieVar.f23592h && this.f23593i == ieVar.f23593i && this.f23594j == ieVar.f23594j && kotlin.jvm.internal.n.a(this.f23595k, ieVar.f23595k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f23585a), this.f23586b, this.f23587c, this.f23588d, this.f23589e, this.f23590f, this.f23591g, Boolean.valueOf(this.f23592h), Boolean.valueOf(this.f23593i), Boolean.valueOf(this.f23594j));
    }

    public final String toString() {
        boolean z10 = this.f23585a;
        int length = String.valueOf(z10).length();
        List list = this.f23586b;
        int length2 = String.valueOf(list).length();
        s0 s0Var = this.f23587c;
        int length3 = String.valueOf(s0Var).length();
        String str = this.f23588d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f23589e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f23590f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.f23591g;
        int length7 = String.valueOf(list3).length();
        boolean z11 = this.f23592h;
        int length8 = String.valueOf(z11).length();
        boolean z12 = this.f23593i;
        int length9 = String.valueOf(z12).length();
        boolean z13 = this.f23594j;
        int length10 = String.valueOf(z13).length();
        sc scVar = this.f23595k;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(scVar).length() + 1);
        sb2.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb2.append(z10);
        sb2.append(", enabledBackings=");
        sb2.append(list);
        sb2.append(", secret=");
        sb2.append(s0Var);
        sb2.append(", dirPath=");
        sb2.append(str);
        sb2.append(", gmsCoreDirPath=");
        sb2.append(str2);
        sb2.append(", includeStaticConfigPackages=");
        sb2.append(list2);
        sb2.append(", excludeStaticConfigPackages=");
        sb2.append(list3);
        sb2.append(", hasStorageInfoFromGms=");
        sb2.append(z11);
        sb2.append(", allowEmptySnapshotToken=");
        sb2.append(z12);
        sb2.append(", enableCommitV2Api=");
        sb2.append(z13);
        sb2.append(", clientFlags=");
        sb2.append(scVar);
        sb2.append(")");
        return sb2.toString();
    }
}
