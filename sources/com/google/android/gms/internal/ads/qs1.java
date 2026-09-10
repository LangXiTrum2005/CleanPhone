package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qs1 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss1 f19192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ss1 f19193b;

    public qs1(ss1 ss1Var) {
        this.f19192a = ss1Var;
        if (ss1Var.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19193b = ss1Var.p();
    }

    public static void g(int i10, List list) {
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

    public final void a(byte[] bArr, ks1 ks1Var) throws et1 {
        int length = bArr.length;
        b();
        try {
            vt1.f21267c.a(this.f19193b.getClass()).h(this.f19193b, bArr, 0, length, new ur1(ks1Var));
        } catch (et1 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void b() {
        if (this.f19193b.h()) {
            return;
        }
        ss1 ss1VarP = this.f19192a.p();
        vt1.f21267c.a(ss1VarP.getClass()).b(ss1VarP, this.f19193b);
        this.f19193b = ss1VarP;
    }

    public final ss1 c() {
        if (!this.f19193b.h()) {
            return this.f19193b;
        }
        ss1 ss1Var = this.f19193b;
        ss1Var.getClass();
        vt1.f21267c.a(ss1Var.getClass()).a(ss1Var);
        ss1Var.i();
        return this.f19193b;
    }

    public final Object clone() {
        qs1 qs1Var = (qs1) this.f19192a.v(5, null);
        qs1Var.f19193b = c();
        return qs1Var;
    }

    public final ss1 e() {
        ss1 ss1VarC = c();
        ss1VarC.getClass();
        if (ss1.w(ss1VarC, true)) {
            return ss1VarC;
        }
        throw new hu1();
    }

    public final qs1 f(ss1 ss1Var) {
        if (this.f19192a.equals(ss1Var)) {
            return this;
        }
        b();
        ss1 ss1Var2 = this.f19193b;
        vt1.f21267c.a(ss1Var2.getClass()).b(ss1Var2, ss1Var);
        return this;
    }
}
