package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f21396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f21397c;

    public w3(int i10) {
        this.f21395a = i10;
        switch (i10) {
            case 1:
                this.f21396b = new np0(4);
                this.f21397c = new c3(-1, -1, "image/webp");
                break;
            default:
                this.f21396b = new np0(4);
                this.f21397c = new c3(-1, -1, "image/avif");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) throws EOFException, InterruptedIOException {
        switch (this.f21395a) {
            case 0:
                h2 h2Var = (h2) n2Var;
                h2Var.a(4, false);
                np0 np0Var = this.f21396b;
                np0Var.y(4);
                h2Var.m(np0Var.f17880a, 0, 4, false);
                if (np0Var.P() != 1718909296) {
                    return false;
                }
                np0Var.y(4);
                h2Var.m(np0Var.f17880a, 0, 4, false);
                return np0Var.P() == ((long) 1635150182);
            default:
                np0 np0Var2 = this.f21396b;
                np0Var2.y(4);
                h2 h2Var2 = (h2) n2Var;
                h2Var2.m(np0Var2.f17880a, 0, 4, false);
                if (np0Var2.P() != 1380533830) {
                    return false;
                }
                h2Var2.a(4, false);
                np0Var2.y(4);
                h2Var2.m(np0Var2.f17880a, 0, 4, false);
                return np0Var2.P() == 1464156752;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        switch (this.f21395a) {
            case 0:
                this.f21397c.e(j10, j11);
                break;
            default:
                this.f21397c.e(j10, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        switch (this.f21395a) {
            case 0:
                break;
        }
        return this.f21397c.f(n2Var, q2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        switch (this.f21395a) {
            case 0:
                this.f21397c.g(o2Var);
                break;
            default:
                this.f21397c.g(o2Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
        int i10 = this.f21395a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
