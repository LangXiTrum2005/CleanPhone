package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23309c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f23310a = new q2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23311b;

    static {
        new b1(0);
    }

    public b1() {
    }

    public static void b(x0 x0Var, c3 c3Var, int i10, Object obj) {
        if (c3Var == c3.f23343d) {
            x0Var.r(i10, 3);
            ((i1) ((l0) obj)).f(x0Var);
            x0Var.r(i10, 4);
            return;
        }
        x0Var.r(i10, c3Var.f23347b);
        d3 d3Var = d3.f23371a;
        switch (c3Var.ordinal()) {
            case 0:
                x0Var.I(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                x0Var.G(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                x0Var.H(((Long) obj).longValue());
                break;
            case 3:
                x0Var.H(((Long) obj).longValue());
                break;
            case 4:
                x0Var.E(((Integer) obj).intValue());
                break;
            case 5:
                x0Var.I(((Long) obj).longValue());
                break;
            case 6:
                x0Var.G(((Integer) obj).intValue());
                break;
            case 7:
                x0Var.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof s0)) {
                    x0Var.J((String) obj);
                } else {
                    x0Var.A((s0) obj);
                }
                break;
            case 9:
                ((i1) ((l0) obj)).f(x0Var);
                break;
            case 10:
                x0Var.C((l0) obj);
                break;
            case 11:
                if (!(obj instanceof s0)) {
                    byte[] bArr = (byte[]) obj;
                    x0Var.B(bArr.length, bArr);
                } else {
                    x0Var.A((s0) obj);
                }
                break;
            case 12:
                x0Var.F(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof k1)) {
                    x0Var.E(((Integer) obj).intValue());
                } else {
                    x0Var.E(((k1) obj).zza());
                }
                break;
            case 14:
                x0Var.G(((Integer) obj).intValue());
                break;
            case 15:
                x0Var.I(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                x0Var.F((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                x0Var.H((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f23311b) {
            return;
        }
        q2 q2Var = this.f23310a;
        int i10 = q2Var.f23879b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = q2Var.a(i11).f23914b;
            if (obj instanceof i1) {
                ((i1) obj).j();
            }
        }
        Iterator it = q2Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof i1) {
                ((i1) value).j();
            }
        }
        if (!q2Var.f23881d) {
            if (q2Var.f23879b > 0) {
                q2Var.a(0).f23913a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = q2Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!q2Var.f23881d) {
            q2Var.f23880c = q2Var.f23880c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(q2Var.f23880c);
            q2Var.f23883f = q2Var.f23883f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(q2Var.f23883f);
            q2Var.f23881d = true;
        }
        this.f23311b = true;
    }

    public final Object clone() {
        b1 b1Var = new b1();
        q2 q2Var = this.f23310a;
        if (q2Var.f23879b > 0) {
            q2Var.a(0).f23913a.getClass();
            throw new ClassCastException();
        }
        Iterator it = q2Var.b().iterator();
        if (!it.hasNext()) {
            return b1Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            return this.f23310a.equals(((b1) obj).f23310a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23310a.hashCode();
    }

    public b1(int i10) {
        a();
        a();
    }
}
