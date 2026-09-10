package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb.d0 f11668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.b f11669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11670d;

    public a(eb.d0 d0Var, j9.b bVar, String str) {
        this.f11668b = d0Var;
        this.f11669c = bVar;
        this.f11670d = str;
        this.f11667a = Arrays.hashCode(new Object[]{d0Var, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k9.c0.l(this.f11668b, aVar.f11668b) && k9.c0.l(this.f11669c, aVar.f11669c) && k9.c0.l(this.f11670d, aVar.f11670d);
    }

    public final int hashCode() {
        return this.f11667a;
    }
}
