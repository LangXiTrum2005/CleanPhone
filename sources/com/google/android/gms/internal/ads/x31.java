package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.InterfaceC0435l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe1 f21722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y31 f21723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f21724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xd f21726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h41 f21727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a71 f21728g;

    public x31(fe1 fe1Var, y31 y31Var, h41 h41Var, p21 p21Var, String str, xd xdVar, lx1 lx1Var, lx1 lx1Var2, lx1 lx1Var3, a71 a71Var) {
        this.f21722a = fe1Var;
        this.f21723b = y31Var;
        this.f21725d = str;
        this.f21727f = h41Var;
        this.f21726e = xdVar;
        this.f21728g = a71Var;
        int iOrdinal = p21Var.ordinal();
        if (iOrdinal == 0) {
            this.f21724c = lx1Var.zzb();
        } else if (iOrdinal == 1) {
            this.f21724c = lx1Var2.zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.f21724c = lx1Var3.zzb();
        }
    }

    public final ListenableFuture a() {
        boolean z10;
        boolean z11;
        y31 y31Var = this.f21723b;
        synchronized (y31Var) {
            z10 = y31Var.f22096d;
        }
        if (!z10) {
            return zw1.d(Integer.toString(7));
        }
        h41 h41Var = this.f21727f;
        synchronized (h41Var) {
            z11 = h41Var.f15122j;
        }
        if (!z11) {
            final int i10 = 1;
            return zw1.o(this.f21722a, new Callable(this) { // from class: com.google.android.gms.internal.ads.w31

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x31 f21399b;

                {
                    this.f21399b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strEncodeToString;
                    switch (i10) {
                        case 0:
                            x31 x31Var = this.f21399b;
                            y61 y61VarA = x31Var.f21728g.a(InterfaceC0435l1.d.b.f29105b);
                            try {
                                y61VarA.a();
                                je jeVar = (je) x31Var.f21726e.e();
                                String str = x31Var.f21725d;
                                y31 y31Var2 = x31Var.f21723b;
                                try {
                                    strEncodeToString = Base64.encodeToString(((ve) y31Var2.d(str, jeVar.b()).e()).b(), 11);
                                    break;
                                } catch (IllegalArgumentException unused) {
                                    y31Var2.getClass();
                                    xd xdVarA0 = je.A0();
                                    xdVarA0.i(4096);
                                    strEncodeToString = Base64.encodeToString(y31Var2.b(((je) xdVarA0.e()).b(), str, true), 11);
                                }
                                y61VarA.c();
                                return strEncodeToString;
                            } catch (Throwable th2) {
                                try {
                                    y61VarA.b(th2);
                                    throw th2;
                                } catch (Throwable th3) {
                                    y61VarA.c();
                                    throw th3;
                                }
                            }
                        default:
                            x31 x31Var2 = this.f21399b;
                            String str2 = x31Var2.f21725d;
                            y31 y31Var3 = x31Var2.f21723b;
                            y31Var3.getClass();
                            xd xdVarA1 = je.A0();
                            xdVarA1.i(Http2.INITIAL_MAX_FRAME_SIZE);
                            return Base64.encodeToString(y31Var3.b(((je) xdVarA1.e()).b(), str2, true), 11);
                    }
                }
            });
        }
        Set set = this.f21724c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((k00) this.f21722a).b((t41) it.next()));
        }
        ca1 ca1VarY = ca1.y(arrayList);
        final int i11 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.w31

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x31 f21399b;

            {
                this.f21399b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strEncodeToString;
                switch (i11) {
                    case 0:
                        x31 x31Var = this.f21399b;
                        y61 y61VarA = x31Var.f21728g.a(InterfaceC0435l1.d.b.f29105b);
                        try {
                            y61VarA.a();
                            je jeVar = (je) x31Var.f21726e.e();
                            String str = x31Var.f21725d;
                            y31 y31Var2 = x31Var.f21723b;
                            try {
                                strEncodeToString = Base64.encodeToString(((ve) y31Var2.d(str, jeVar.b()).e()).b(), 11);
                                break;
                            } catch (IllegalArgumentException unused) {
                                y31Var2.getClass();
                                xd xdVarA0 = je.A0();
                                xdVarA0.i(4096);
                                strEncodeToString = Base64.encodeToString(y31Var2.b(((je) xdVarA0.e()).b(), str, true), 11);
                            }
                            y61VarA.c();
                            return strEncodeToString;
                        } catch (Throwable th2) {
                            try {
                                y61VarA.b(th2);
                                throw th2;
                            } catch (Throwable th3) {
                                y61VarA.c();
                                throw th3;
                            }
                        }
                    default:
                        x31 x31Var2 = this.f21399b;
                        String str2 = x31Var2.f21725d;
                        y31 y31Var3 = x31Var2.f21723b;
                        y31Var3.getClass();
                        xd xdVarA1 = je.A0();
                        xdVarA1.i(Http2.INITIAL_MAX_FRAME_SIZE);
                        return Base64.encodeToString(y31Var3.b(((je) xdVarA1.e()).b(), str2, true), 11);
                }
            }
        };
        td1 td1Var = td1.f20333a;
        sd1 sd1Var = new sd1(ca1VarY, false, false);
        sd1Var.f19937p = new rd1(sd1Var, callable, td1Var);
        sd1Var.v();
        return sd1Var;
    }
}
