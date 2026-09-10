package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ca1 f18889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18890b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f18891c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18892d;

    public q20(ca1 ca1Var) {
        this.f18889a = ca1Var;
        z20 z20Var = z20.f22471e;
        this.f18892d = false;
    }

    public final z20 a(z20 z20Var) {
        z20 z20Var2 = z20.f22471e;
        if (z20Var.equals(z20Var2)) {
            throw new p40("Unhandled input format:", z20Var);
        }
        int i10 = 0;
        while (true) {
            ca1 ca1Var = this.f18889a;
            if (i10 >= ca1Var.size()) {
                return z20Var;
            }
            x40 x40Var = (x40) ca1Var.get(i10);
            z20 z20VarD = x40Var.d(z20Var);
            if (x40Var.zzc()) {
                ps1.c0(!z20VarD.equals(z20Var2));
                z20Var = z20VarD;
            }
            i10++;
        }
    }

    public final boolean b() {
        return !this.f18890b.isEmpty();
    }

    public final boolean c() {
        return this.f18892d && ((x40) this.f18890b.get(e())).zzg() && !this.f18891c[e()].hasRemaining();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= e(); i10++) {
                if (!this.f18891c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f18890b;
                    x40 x40Var = (x40) arrayList.get(i10);
                    if (!x40Var.zzg()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f18891c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : x40.f21739a;
                        long jRemaining = byteBuffer2.remaining();
                        x40Var.a(byteBuffer2);
                        this.f18891c[i10] = x40Var.zzf();
                        boolean z11 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.f18891c[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.f18891c[i10].hasRemaining() && i10 < e()) {
                        ((x40) arrayList.get(i10 + 1)).zze();
                    }
                }
            }
        } while (z10);
    }

    public final int e() {
        return this.f18891c.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q20)) {
            return false;
        }
        ca1 ca1Var = this.f18889a;
        int size = ca1Var.size();
        ca1 ca1Var2 = ((q20) obj).f18889a;
        if (size != ca1Var2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < ca1Var.size(); i10++) {
            if (ca1Var.get(i10) != ca1Var2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f18889a.hashCode();
    }
}
