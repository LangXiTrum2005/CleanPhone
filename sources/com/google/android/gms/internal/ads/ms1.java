package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ms1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17537c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du1 f17538a = new du1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17539b;

    static {
        new ms1(0);
    }

    public ms1() {
    }

    public static void b(is1 is1Var, qu1 qu1Var, int i10, Object obj) {
        if (qu1Var == qu1.f19209d) {
            is1Var.s(i10, 3);
            ((ss1) ((rr1) obj)).u(is1Var);
            is1Var.s(i10, 4);
            return;
        }
        is1Var.s(i10, qu1Var.f19213b);
        ru1 ru1Var = ru1.f19674a;
        switch (qu1Var.ordinal()) {
            case 0:
                is1Var.J(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                is1Var.H(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                is1Var.I(((Long) obj).longValue());
                break;
            case 3:
                is1Var.I(((Long) obj).longValue());
                break;
            case 4:
                is1Var.F(((Integer) obj).intValue());
                break;
            case 5:
                is1Var.J(((Long) obj).longValue());
                break;
            case 6:
                is1Var.H(((Integer) obj).intValue());
                break;
            case 7:
                is1Var.E(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof cs1)) {
                    is1Var.K((String) obj);
                } else {
                    is1Var.B((cs1) obj);
                }
                break;
            case 9:
                ((ss1) ((rr1) obj)).u(is1Var);
                break;
            case 10:
                is1Var.D((rr1) obj);
                break;
            case 11:
                if (!(obj instanceof cs1)) {
                    byte[] bArr = (byte[]) obj;
                    is1Var.C(bArr.length, bArr);
                } else {
                    is1Var.B((cs1) obj);
                }
                break;
            case 12:
                is1Var.G(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof us1)) {
                    is1Var.F(((Integer) obj).intValue());
                } else {
                    is1Var.F(((us1) obj).zza());
                }
                break;
            case 14:
                is1Var.H(((Integer) obj).intValue());
                break;
            case 15:
                is1Var.J(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                is1Var.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                is1Var.I((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f17539b) {
            return;
        }
        du1 du1Var = this.f17538a;
        int i10 = du1Var.f13724b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = du1Var.a(i11).f14083b;
            if (obj instanceof ss1) {
                ss1 ss1Var = (ss1) obj;
                vt1.f21267c.a(ss1Var.getClass()).a(ss1Var);
                ss1Var.i();
            }
        }
        Iterator it = du1Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof ss1) {
                ss1 ss1Var2 = (ss1) value;
                vt1.f21267c.a(ss1Var2.getClass()).a(ss1Var2);
                ss1Var2.i();
            }
        }
        if (!du1Var.f13726d) {
            if (du1Var.f13724b > 0) {
                du1Var.a(0).f14082a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = du1Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!du1Var.f13726d) {
            du1Var.f13725c = du1Var.f13725c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(du1Var.f13725c);
            du1Var.f13728f = du1Var.f13728f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(du1Var.f13728f);
            du1Var.f13726d = true;
        }
        this.f17539b = true;
    }

    public final Object clone() {
        ms1 ms1Var = new ms1();
        du1 du1Var = this.f17538a;
        if (du1Var.f13724b > 0) {
            du1Var.a(0).f14082a.getClass();
            throw new ClassCastException();
        }
        Iterator it = du1Var.b().iterator();
        if (!it.hasNext()) {
            return ms1Var;
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
        if (obj instanceof ms1) {
            return this.f17538a.equals(((ms1) obj).f17538a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17538a.hashCode();
    }

    public ms1(int i10) {
        a();
        a();
    }
}
