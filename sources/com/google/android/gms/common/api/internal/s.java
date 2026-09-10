package com.google.android.gms.common.api.internal;

import com.ironsource.X3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i9.c f11764b;

    public /* synthetic */ s(a aVar, i9.c cVar) {
        this.f11763a = aVar;
        this.f11764b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (k9.c0.l(this.f11763a, sVar.f11763a) && k9.c0.l(this.f11764b, sVar.f11764b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11763a, this.f11764b});
    }

    public final String toString() {
        eb.d0 d0Var = new eb.d0(this);
        d0Var.P0(this.f11763a, X3.i.W);
        d0Var.P0(this.f11764b, "feature");
        return d0Var.toString();
    }
}
