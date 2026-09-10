package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23194c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u6 f23195a = new u6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23196b;

    static {
        new s5(0);
    }

    public s5() {
    }

    public static void b(o5 o5Var, g7 g7Var, int i10, Object obj) throws IOException {
        if (g7Var == g7.f23026e) {
            o5Var.z(i10, 3);
            ((i5) obj).a(o5Var);
            o5Var.z(i10, 4);
            return;
        }
        o5Var.z(i10, g7Var.f23029b);
        h7 h7Var = h7.f23037a;
        switch (g7Var.ordinal()) {
            case 0:
                o5Var.v(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                o5Var.t(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                o5Var.D(((Long) obj).longValue());
                break;
            case 3:
                o5Var.D(((Long) obj).longValue());
                break;
            case 4:
                o5Var.x(((Integer) obj).intValue());
                break;
            case 5:
                o5Var.v(((Long) obj).longValue());
                break;
            case 6:
                o5Var.t(((Integer) obj).intValue());
                break;
            case 7:
                byte bBooleanValue = ((Boolean) obj).booleanValue();
                if (o5Var.f23155e == o5Var.f23154d) {
                    o5Var.k();
                }
                byte[] bArr = o5Var.f23153c;
                int i11 = o5Var.f23155e;
                bArr[i11] = bBooleanValue;
                o5Var.f23155e = i11 + 1;
                break;
            case 8:
                if (!(obj instanceof n5)) {
                    o5Var.y((String) obj);
                } else {
                    o5Var.r((n5) obj);
                }
                break;
            case 9:
                ((i5) obj).a(o5Var);
                break;
            case 10:
                i5 i5Var = (i5) obj;
                o5Var.B(i5Var.c());
                i5Var.a(o5Var);
                break;
            case 11:
                if (!(obj instanceof n5)) {
                    byte[] bArr2 = (byte[]) obj;
                    int length = bArr2.length;
                    o5Var.B(length);
                    o5Var.E(length, bArr2);
                } else {
                    o5Var.r((n5) obj);
                }
                break;
            case 12:
                o5Var.B(((Integer) obj).intValue());
                break;
            case 13:
                o5Var.x(((Integer) obj).intValue());
                break;
            case 14:
                o5Var.t(((Integer) obj).intValue());
                break;
            case 15:
                o5Var.v(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                o5Var.B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                o5Var.D((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f23196b) {
            return;
        }
        u6 u6Var = this.f23195a;
        int i10 = u6Var.f23214b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = u6Var.c(i11).f23225b;
            if (obj instanceof w5) {
                ((w5) obj).j();
            }
        }
        Iterator it = u6Var.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof w5) {
                ((w5) value).j();
            }
        }
        if (!u6Var.f23216d) {
            if (u6Var.f23214b > 0) {
                u6Var.c(0).f23224a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = u6Var.a().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!u6Var.f23216d) {
            u6Var.f23215c = u6Var.f23215c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(u6Var.f23215c);
            u6Var.f23218f = u6Var.f23218f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(u6Var.f23218f);
            u6Var.f23216d = true;
        }
        this.f23196b = true;
    }

    public final Object clone() {
        s5 s5Var = new s5();
        u6 u6Var = this.f23195a;
        if (u6Var.f23214b > 0) {
            u6Var.c(0).f23224a.getClass();
            throw new ClassCastException();
        }
        Iterator it = u6Var.a().iterator();
        if (!it.hasNext()) {
            return s5Var;
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
        if (obj instanceof s5) {
            return this.f23195a.equals(((s5) obj).f23195a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23195a.hashCode();
    }

    public s5(int i10) {
        a();
        a();
    }
}
