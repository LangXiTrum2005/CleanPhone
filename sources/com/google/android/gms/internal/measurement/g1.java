package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.ur1;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f23488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i1 f23489b;

    public g1(i1 i1Var) {
        this.f23488a = i1Var;
        if (i1Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f23489b = i1Var.i();
    }

    public static void a(int i10, List list) {
        int size = list.size() - i10;
        String strM = com.applovin.impl.ca.m(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(strM);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.f23489b.g()) {
            return;
        }
        i1 i1VarI = this.f23488a.i();
        l2.f23690c.a(i1VarI.getClass()).b(i1VarI, this.f23489b);
        this.f23489b = i1VarI;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g1 clone() {
        g1 g1Var = (g1) this.f23488a.t(5);
        g1Var.f23489b = e();
        return g1Var;
    }

    public final i1 e() {
        if (!this.f23489b.g()) {
            return this.f23489b;
        }
        this.f23489b.j();
        return this.f23489b;
    }

    public final i1 f() {
        i1 i1VarE = e();
        i1VarE.getClass();
        if (i1.r(i1VarE, true)) {
            return i1VarE;
        }
        throw new s2();
    }

    public final void g(i1 i1Var) {
        i1 i1Var2 = this.f23488a;
        if (i1Var2.equals(i1Var)) {
            return;
        }
        if (!this.f23489b.g()) {
            i1 i1VarI = i1Var2.i();
            l2.f23690c.a(i1VarI.getClass()).b(i1VarI, this.f23489b);
            this.f23489b = i1VarI;
        }
        i1 i1Var3 = this.f23489b;
        l2.f23690c.a(i1Var3.getClass()).b(i1Var3, i1Var);
    }

    public final void h(byte[] bArr, int i10, z0 z0Var) throws u1 {
        if (!this.f23489b.g()) {
            i1 i1VarI = this.f23488a.i();
            l2.f23690c.a(i1VarI.getClass()).b(i1VarI, this.f23489b);
            this.f23489b = i1VarI;
        }
        try {
            l2.f23690c.a(this.f23489b.getClass()).f(this.f23489b, bArr, 0, i10, new ur1(z0Var));
        } catch (u1 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
