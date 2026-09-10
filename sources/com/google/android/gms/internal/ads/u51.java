package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u51 implements n51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n31 f20631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l61 f20632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k61 f20633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f20634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o61 f20635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a71 f20636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20637g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20641k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c7 f20642m;

    public u51(n31 n31Var, l61 l61Var, k61 k61Var, o61 o61Var, a71 a71Var, h21 h21Var, ExecutorService executorService) {
        this.f20631a = n31Var;
        this.f20632b = l61Var;
        this.f20633c = k61Var;
        this.f20634d = executorService;
        this.f20635e = o61Var;
        this.f20636f = a71Var;
        this.f20638h = h21Var.Q();
        this.f20639i = h21Var.Y();
        this.f20640j = h21Var.X();
        this.f20641k = h21Var.O();
        this.l = h21Var.P();
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final pe1 a(Context context) {
        return zw1.o(this.f20634d, new ze(13, this, context));
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final pe1 b(Context context, View view, Activity activity) {
        return zw1.o(this.f20634d, new of0(this, context, view, activity, 5));
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final pe1 c(Context context, String str, View view) {
        return zw1.o(this.f20634d, new of0(this, context, str, view, 6));
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final void d(InputEvent inputEvent) {
        try {
            synchronized (this.f20637g) {
                try {
                    c7 c7Var = this.f20642m;
                    if (c7Var != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        ((bc.i) c7Var.f13072c).k(c7Var.f13071b, Optional.of(map));
                    } else {
                        this.f20636f.b(20105);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (fc | ic e10) {
            this.f20636f.d(e10, 20104);
        }
    }

    public final void e(HashMap map) {
        String strU0;
        map.put("v", this.f20638h);
        ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
        ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
        a71 a71Var = this.f20636f;
        byte[] bArrB = null;
        long jW0 = -1;
        if (listenableFuture != null) {
            y61 y61VarA = a71Var.a(20107);
            try {
                try {
                    y61VarA.a();
                    je jeVar = (je) listenableFuture.get(this.f20640j, TimeUnit.MILLISECONDS);
                    if (jeVar != null) {
                        bArrB = jeVar.y0().b();
                        strU0 = jeVar.u0().length() > 1 ? jeVar.u0() : "E";
                        try {
                            if (jeVar.v0()) {
                                jW0 = jeVar.w0();
                            }
                        } catch (ClassCastException | InterruptedException | TimeoutException e10) {
                            e = e10;
                            y61VarA.b(e);
                        } catch (ExecutionException e11) {
                            e = e11;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            y61VarA.b(e);
                        }
                    } else {
                        strU0 = "E";
                    }
                } catch (ClassCastException | InterruptedException | TimeoutException e12) {
                    e = e12;
                    strU0 = "E";
                } catch (ExecutionException e13) {
                    e = e13;
                    strU0 = "E";
                }
                y61VarA.c();
            } catch (Throwable th2) {
                y61VarA.c();
                throw th2;
            }
        } else {
            strU0 = "E";
        }
        if (strU0.equals("E") && listenableFuture2 != null) {
            y61 y61VarA2 = a71Var.a(20108);
            try {
                y61VarA2.a();
                String str = (String) listenableFuture2.get(this.f20639i, TimeUnit.MILLISECONDS);
                if (true != pi1.l(str)) {
                    strU0 = str;
                }
            } catch (ClassCastException | InterruptedException | TimeoutException e14) {
                y61VarA2.b(e14);
            } catch (ExecutionException e15) {
                e = e15;
                Throwable cause2 = e.getCause();
                if (cause2 != null) {
                    e = cause2;
                }
                y61VarA2.b(e);
            } finally {
                y61VarA2.c();
            }
        }
        map.put("int", strU0);
        if (bArrB != null) {
            map.put("att", bArrB);
        }
        map.put("gv", Long.valueOf(jW0));
    }

    public final void f(bc.i iVar, byte[] bArr, boolean z10) {
        y61 y61VarA = this.f20636f.a(20102);
        try {
            try {
                try {
                    y61VarA.a();
                    synchronized (this.f20637g) {
                        this.f20642m = c7.b(iVar, bArr, z10);
                    }
                    y61VarA.c();
                } catch (fc | ic e10) {
                    y61VarA.b(e10);
                    throw new aa.b(4, "r: 2", e10);
                }
            } catch (Throwable th2) {
                y61VarA.b(th2);
                throw th2;
            }
        } catch (Throwable th3) {
            y61VarA.c();
            throw th3;
        }
    }

    public final String g(HashMap map) {
        String strG;
        a71 a71Var = this.f20636f;
        y61 y61VarA = a71Var.a(20110);
        try {
            y61VarA.a();
            synchronized (this.f20637g) {
                try {
                    c7 c7Var = this.f20642m;
                    if (c7Var == null) {
                        a71Var.b(20109);
                        strG = "";
                    } else {
                        byte[] bArr = (byte[]) ((bc.i) c7Var.f13072c).k(c7Var.f13070a, Optional.of(map));
                        pb1 pb1Var = rb1.f19514e;
                        if (pb1Var.f19517b != null) {
                            pb1Var = new pb1(pb1Var.f19516a, (Character) null);
                        }
                        strG = pb1Var.g(bArr.length, bArr);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            y61VarA.c();
            return strG;
        } catch (Throwable th3) {
            try {
                y61VarA.b(th3);
                throw th3;
            } catch (Throwable th4) {
                y61VarA.c();
                throw th4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final String zza() {
        synchronized (this.f20637g) {
            try {
                c7 c7Var = this.f20642m;
                if (c7Var == null) {
                    return "3.893135394.-1";
                }
                return (String) c7Var.f13073d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final vd1 zzb() {
        boolean z10 = this.l;
        td1 td1Var = td1.f20333a;
        k61 k61Var = this.f20633c;
        if (z10) {
            pe1 pe1VarO = zw1.o(k61Var.f16346e, rl.f19608f);
            k61Var.f16345d.e(20312, pe1VarO);
            return zw1.z(pe1VarO, new s51(this, 1), td1Var);
        }
        vd1 vd1VarR = vd1.r(k61Var.zzb());
        t51 t51Var = t51.f20190b;
        ExecutorService executorService = this.f20634d;
        final int i10 = 0;
        fd1 fd1VarX = zw1.x(zw1.t(vd1VarR, Throwable.class, t51Var, executorService), new od1(this) { // from class: com.google.android.gms.internal.ads.q51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u51 f18939b;

            {
                this.f18939b = this;
            }

            @Override // com.google.android.gms.internal.ads.od1
            public final ListenableFuture zza(Object obj) {
                int i11 = i10;
                u51 u51Var = this.f18939b;
                switch (i11) {
                    case 0:
                        l31 l31Var = (l31) obj;
                        if (l31Var != null) {
                            n31 n31Var = u51Var.f20631a;
                            List listC = l31Var.C();
                            g31 g31Var = (g31) n31Var;
                            synchronized (g31Var.f14731m) {
                                ld ldVar = g31Var.f14734p;
                                ldVar.b();
                                ((md) ldVar.f19193b).M((ws1) listC);
                                break;
                            }
                        }
                        if (!u51Var.f20632b.a(l31Var)) {
                            u51Var.f20636f.b(20103);
                            throw new aa.b(1);
                        }
                        k61 k61Var2 = u51Var.f20633c;
                        z21 z21Var = k61Var2.f16343b;
                        z21Var.getClass();
                        pe1 pe1VarO2 = zw1.o(z21Var.f22477b, new ns0(z21Var, 4));
                        k61Var2.f16345d.e(20304, pe1VarO2);
                        return zw1.z(pe1VarO2, new s51(u51Var, 0), td1.f20333a);
                    default:
                        Throwable th2 = (Throwable) obj;
                        if (!u51Var.f20641k) {
                            return zw1.l(th2);
                        }
                        k61 k61Var3 = u51Var.f20633c;
                        pe1 pe1VarO3 = zw1.o(k61Var3.f16346e, rl.f19608f);
                        k61Var3.f16345d.e(20312, pe1VarO3);
                        return zw1.z(pe1VarO3, new s51(u51Var, 1), td1.f20333a);
                }
            }
        }, executorService);
        final int i11 = 1;
        return zw1.u(fd1VarX, Throwable.class, new od1(this) { // from class: com.google.android.gms.internal.ads.q51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u51 f18939b;

            {
                this.f18939b = this;
            }

            @Override // com.google.android.gms.internal.ads.od1
            public final ListenableFuture zza(Object obj) {
                int i12 = i11;
                u51 u51Var = this.f18939b;
                switch (i12) {
                    case 0:
                        l31 l31Var = (l31) obj;
                        if (l31Var != null) {
                            n31 n31Var = u51Var.f20631a;
                            List listC = l31Var.C();
                            g31 g31Var = (g31) n31Var;
                            synchronized (g31Var.f14731m) {
                                ld ldVar = g31Var.f14734p;
                                ldVar.b();
                                ((md) ldVar.f19193b).M((ws1) listC);
                                break;
                            }
                        }
                        if (!u51Var.f20632b.a(l31Var)) {
                            u51Var.f20636f.b(20103);
                            throw new aa.b(1);
                        }
                        k61 k61Var2 = u51Var.f20633c;
                        z21 z21Var = k61Var2.f16343b;
                        z21Var.getClass();
                        pe1 pe1VarO2 = zw1.o(z21Var.f22477b, new ns0(z21Var, 4));
                        k61Var2.f16345d.e(20304, pe1VarO2);
                        return zw1.z(pe1VarO2, new s51(u51Var, 0), td1.f20333a);
                    default:
                        Throwable th2 = (Throwable) obj;
                        if (!u51Var.f20641k) {
                            return zw1.l(th2);
                        }
                        k61 k61Var3 = u51Var.f20633c;
                        pe1 pe1VarO3 = zw1.o(k61Var3.f16346e, rl.f19608f);
                        k61Var3.f16345d.e(20312, pe1VarO3);
                        return zw1.z(pe1VarO3, new s51(u51Var, 1), td1.f20333a);
                }
            }
        }, td1Var);
    }

    @Override // com.google.android.gms.internal.ads.n51
    public final int zzg() {
        return 4;
    }
}
