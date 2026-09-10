package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h3[] f13474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kj1 f13475d;

    public da(List list, int i10) {
        this.f13472a = i10;
        switch (i10) {
            case 1:
                this.f13473b = list;
                this.f13474c = new h3[list.size()];
                kj1 kj1Var = new kj1(new vf(this, 4));
                this.f13475d = kj1Var;
                kj1Var.u(3);
                break;
            default:
                this.f13473b = list;
                this.f13474c = new h3[list.size()];
                this.f13475d = new kj1(new b21(this, 4));
                break;
        }
    }

    public final void a(o2 o2Var, ga gaVar) {
        switch (this.f13472a) {
            case 0:
                int i10 = 0;
                while (true) {
                    h3[] h3VarArr = this.f13474c;
                    if (i10 < h3VarArr.length) {
                        gaVar.c();
                        gaVar.d();
                        h3 h3VarE = o2Var.e(gaVar.f14805d, 3);
                        g22 g22Var = (g22) this.f13473b.get(i10);
                        String str = g22Var.f14678o;
                        boolean z10 = true;
                        if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                            z10 = false;
                        }
                        ps1.V(z10, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = g22Var.f14665a;
                        if (str2 == null) {
                            gaVar.d();
                            str2 = gaVar.f14806e;
                        }
                        i12 i12Var = new i12();
                        i12Var.f15499a = str2;
                        i12Var.d("video/mp2t");
                        i12Var.e(str);
                        i12Var.f15503e = g22Var.f14669e;
                        i12Var.f15502d = g22Var.f14668d;
                        i12Var.L = g22Var.M;
                        i12Var.f15514q = g22Var.f14681r;
                        h3VarE.f(new g22(i12Var));
                        h3VarArr[i10] = h3VarE;
                        i10++;
                    }
                    break;
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    h3[] h3VarArr2 = this.f13474c;
                    if (i11 < h3VarArr2.length) {
                        gaVar.c();
                        gaVar.d();
                        h3 h3VarE2 = o2Var.e(gaVar.f14805d, 3);
                        g22 g22Var2 = (g22) this.f13473b.get(i11);
                        String str3 = g22Var2.f14678o;
                        boolean z11 = true;
                        if (!MimeTypes.APPLICATION_CEA608.equals(str3) && !MimeTypes.APPLICATION_CEA708.equals(str3)) {
                            z11 = false;
                        }
                        ps1.V(z11, "Invalid closed caption MIME type provided: %s", str3);
                        i12 i12Var2 = new i12();
                        gaVar.d();
                        i12Var2.f15499a = gaVar.f14806e;
                        i12Var2.d("video/mp2t");
                        i12Var2.e(str3);
                        i12Var2.f15503e = g22Var2.f14669e;
                        i12Var2.f15502d = g22Var2.f14668d;
                        i12Var2.L = g22Var2.M;
                        i12Var2.f15514q = g22Var2.f14681r;
                        h3VarE2.f(new g22(i12Var2));
                        h3VarArr2[i11] = h3VarE2;
                        i11++;
                    }
                    break;
                }
                break;
        }
    }

    public void b(long j10, np0 np0Var) {
        if (np0Var.B() < 9) {
            return;
        }
        int iB = np0Var.b();
        int iB2 = np0Var.b();
        int iK = np0Var.K();
        if (iB == 434 && iB2 == 1195456820 && iK == 3) {
            this.f13475d.v(j10, np0Var);
        }
    }
}
