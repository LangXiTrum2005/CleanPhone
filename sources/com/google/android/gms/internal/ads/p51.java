package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p51 implements n51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o01 f18531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d61 f18532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l61 f18533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a71 f18534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f18535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f18536f = new AtomicReference("2.893135394.-1");

    public p51(o01 o01Var, d61 d61Var, l61 l61Var, a71 a71Var, ExecutorService executorService) {
        this.f18531a = o01Var;
        this.f18532b = d61Var;
        this.f18533c = l61Var;
        this.f18534d = a71Var;
        this.f18535e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final pe1 a(Context context) {
        return zw1.o(this.f18535e, new ze(12, this, context));
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final pe1 b(Context context, View view, Activity activity) {
        return zw1.o(this.f18535e, new of0(this, context, view, activity, 3));
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final pe1 c(Context context, String str, View view) {
        return zw1.o(this.f18535e, new of0(this, context, str, view, 4));
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final void d(InputEvent inputEvent) {
        m01 m01VarB = this.f18531a.b();
        a71 a71Var = this.f18534d;
        if (m01VarB == null) {
            a71Var.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                m01VarB.h((MotionEvent) inputEvent);
            } catch (n01 e10) {
                a71Var.d(e10, 15005);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final String zza() {
        return (String) this.f18536f.get();
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final vd1 zzb() {
        vd1 vd1VarR = vd1.r(this.f18532b.zzb());
        i6 i6Var = i6.C;
        td1 td1Var = td1.f20333a;
        final int i10 = 0;
        fd1 fd1VarX = zw1.x(zw1.z(zw1.t(vd1VarR, Throwable.class, i6Var, td1Var), new d81(this) { // from class: com.google.android.gms.internal.ads.o51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p51 f18150b;

            {
                this.f18150b = this;
            }

            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                switch (i10) {
                    case 0:
                        l31 l31Var = (l31) obj;
                        p51 p51Var = this.f18150b;
                        if (p51Var.f18533c.a(l31Var) && l31Var != null) {
                            return new Boolean(true);
                        }
                        p51Var.f18534d.b(15003);
                        throw new aa.b(1);
                    default:
                        i01 i01Var = (i01) obj;
                        if (i01Var == null) {
                            throw new aa.b(3);
                        }
                        File file = i01Var.f15464b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        p51 p51Var2 = this.f18150b;
                        p51Var2.f18534d.f(15002, new gm0(18, p51Var2, i01Var));
                        return new Boolean(true);
                }
            }
        }, td1Var), new rr(this, 15), td1Var);
        final int i11 = 1;
        return zw1.z(zw1.z(fd1VarX, new d81(this) { // from class: com.google.android.gms.internal.ads.o51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p51 f18150b;

            {
                this.f18150b = this;
            }

            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                switch (i11) {
                    case 0:
                        l31 l31Var = (l31) obj;
                        p51 p51Var = this.f18150b;
                        if (p51Var.f18533c.a(l31Var) && l31Var != null) {
                            return new Boolean(true);
                        }
                        p51Var.f18534d.b(15003);
                        throw new aa.b(1);
                    default:
                        i01 i01Var = (i01) obj;
                        if (i01Var == null) {
                            throw new aa.b(3);
                        }
                        File file = i01Var.f15464b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        p51 p51Var2 = this.f18150b;
                        p51Var2.f18534d.f(15002, new gm0(18, p51Var2, i01Var));
                        return new Boolean(true);
                }
            }
        }, td1Var), i6.B, td1Var);
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final int zzg() {
        return 3;
    }
}
