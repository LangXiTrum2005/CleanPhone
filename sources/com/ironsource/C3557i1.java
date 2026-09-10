package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3557i1 {
    private final EnumC3427af a;
    private final Q7 b;
    private final String c;
    private final long d;

    public C3557i1(EnumC3427af recordType, Q7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = adProvider;
        this.c = adInstanceId;
        this.d = Calendar.getInstance().getTimeInMillis() / ((long) 1000);
    }

    public final String a() {
        return this.c;
    }

    public final Q7 b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal(C3724ra.c, Integer.valueOf(this.b.b())), patroclinal.formularize.attabal("ts", String.valueOf(this.d)));
    }

    public final Map<String, Object> d() {
        return p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal(C3724ra.b, this.c), patroclinal.formularize.attabal(C3724ra.c, Integer.valueOf(this.b.b())), patroclinal.formularize.attabal("ts", String.valueOf(this.d)), patroclinal.formularize.attabal("rt", Integer.valueOf(this.a.ordinal())));
    }

    public final EnumC3427af e() {
        return this.a;
    }

    public final long f() {
        return this.d;
    }
}
