package com.ironsource;

import java.util.Calendar;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0382i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0485nf f28834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S7 f28835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f28837d;

    public C0382i1(EnumC0485nf recordType, S7 adProvider, String adInstanceId) {
        kotlin.jvm.internal.n.f(recordType, "recordType");
        kotlin.jvm.internal.n.f(adProvider, "adProvider");
        kotlin.jvm.internal.n.f(adInstanceId, "adInstanceId");
        this.f28834a = recordType;
        this.f28835b = adProvider;
        this.f28836c = adInstanceId;
        this.f28837d = Calendar.getInstance().getTimeInMillis() / ((long) 1000);
    }

    public final String a() {
        return this.f28836c;
    }

    public final S7 b() {
        return this.f28835b;
    }

    public final Map<String, Object> c() {
        return xj.b0.Q(new wj.f(C0605ua.f30807c, Integer.valueOf(this.f28835b.b())), new wj.f("ts", String.valueOf(this.f28837d)));
    }

    public final Map<String, Object> d() {
        return xj.b0.Q(new wj.f(C0605ua.f30806b, this.f28836c), new wj.f(C0605ua.f30807c, Integer.valueOf(this.f28835b.b())), new wj.f("ts", String.valueOf(this.f28837d)), new wj.f("rt", Integer.valueOf(this.f28834a.ordinal())));
    }

    public final EnumC0485nf e() {
        return this.f28834a;
    }

    public final long f() {
        return this.f28837d;
    }
}
