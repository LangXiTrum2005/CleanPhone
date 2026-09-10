package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f27251d;

    public Tf(String str, boolean z10, Boolean bool, String str2) {
        this.f27248a = str2;
        this.f27249b = str;
        this.f27250c = z10;
        this.f27251d = bool;
    }

    public final String a() {
        return this.f27249b;
    }

    public final String b() {
        return this.f27248a;
    }

    public final boolean c() {
        return kotlin.jvm.internal.n.a(this.f27251d, Boolean.TRUE);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a adUnit) {
        kotlin.jvm.internal.n.f(networkSettings, "networkSettings");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        String str = this.f27249b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Wf wf2 = Wf.f27610a;
        return kotlin.jvm.internal.n.a(wf2.a(networkSettings), this.f27249b) && wf2.a(networkSettings, adUnit) == this.f27250c;
    }

    public /* synthetic */ Tf(String str, boolean z10, Boolean bool, String str2, int i10, kotlin.jvm.internal.g gVar) {
        this(str, z10, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? null : str2);
    }
}
