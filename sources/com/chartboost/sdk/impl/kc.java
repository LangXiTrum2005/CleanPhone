package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f14349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ka f14351c;
    public ka d;

    public kc(Context context) {
        Intrinsics.f(context, "context");
        this.f14349a = context;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        this.f14351c = new ka(0, i2, i3, i4, 15, null);
        this.d = new ka(i2, i3, i4, 0, 15, null);
    }

    public final void a(ka kaVar, ka kaVar2) {
        d6 d6Var = d6.f13685a;
        kaVar2.c(d6Var.a(kaVar.c(), this.f14349a));
        kaVar2.d(d6Var.a(kaVar.d(), this.f14349a));
        kaVar2.b(d6Var.a(kaVar.b(), this.f14349a));
        kaVar2.a(d6Var.a(kaVar.a(), this.f14349a));
    }

    public final ka b() {
        return this.d;
    }

    public String toString() {
        int iB = this.d.b();
        int iA = this.d.a();
        int iC = this.d.c();
        int iD = this.d.d();
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(iB, iA, "width: ", " height: ", " + x: ");
        sbP.append(iC);
        sbP.append(" y: ");
        sbP.append(iD);
        return sbP.toString();
    }

    public final boolean a() {
        if (!this.f14350b) {
            return false;
        }
        this.f14350b = false;
        return true;
    }

    public final void a(int i2, int i3) {
        if (this.f14351c.b() == i2 && this.f14351c.a() == i3) {
            return;
        }
        ka kaVar = this.f14351c;
        kaVar.c(0);
        kaVar.d(0);
        kaVar.b(i2);
        kaVar.a(i3);
        a(this.f14351c, this.d);
        this.f14350b = true;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (new ka(i2, i3, i4, i5).equals(this.f14351c)) {
            return;
        }
        ka kaVar = this.f14351c;
        kaVar.c(i2);
        kaVar.d(i3);
        kaVar.b(i4);
        kaVar.a(i5);
        a(this.f14351c, this.d);
        this.f14350b = true;
    }
}
