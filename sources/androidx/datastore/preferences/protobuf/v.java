package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4172c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f4173a = f1.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4174b;

    static {
        new v(0);
    }

    public v() {
    }

    public static void b(p pVar, y1 y1Var, int i10, Object obj) {
        if (y1Var == y1.f4202d) {
            pVar.m0(i10, 3);
            ((a) obj).b(pVar);
            pVar.m0(i10, 4);
        }
        pVar.m0(i10, y1Var.f4206b);
        switch (y1Var.ordinal()) {
            case 0:
                pVar.g0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                pVar.e0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                pVar.q0(((Long) obj).longValue());
                break;
            case 3:
                pVar.q0(((Long) obj).longValue());
                break;
            case 4:
                pVar.i0(((Integer) obj).intValue());
                break;
            case 5:
                pVar.g0(((Long) obj).longValue());
                break;
            case 6:
                pVar.e0(((Integer) obj).intValue());
                break;
            case 7:
                pVar.Y(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof j)) {
                    pVar.l0((String) obj);
                } else {
                    pVar.c0((j) obj);
                }
                break;
            case 9:
                ((a) obj).b(pVar);
                break;
            case 10:
                a aVar = (a) obj;
                pVar.getClass();
                pVar.o0(((b0) aVar).a(null));
                aVar.b(pVar);
                break;
            case 11:
                if (!(obj instanceof j)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    pVar.o0(length);
                    pVar.Z(bArr, 0, length);
                } else {
                    pVar.c0((j) obj);
                }
                break;
            case 12:
                pVar.o0(((Integer) obj).intValue());
                break;
            case 13:
                pVar.i0(((Integer) obj).intValue());
                break;
            case 14:
                pVar.e0(((Integer) obj).intValue());
                break;
            case 15:
                pVar.g0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                pVar.o0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                pVar.q0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f4174b) {
            return;
        }
        f1 f1Var = this.f4173a;
        int size = f1Var.f4074a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry entryC = f1Var.c(i10);
            if (entryC.getValue() instanceof b0) {
                b0 b0Var = (b0) entryC.getValue();
                b0Var.getClass();
                a1 a1Var = a1.f4050c;
                a1Var.getClass();
                a1Var.a(b0Var.getClass()).b(b0Var);
                b0Var.h();
            }
        }
        if (!f1Var.f4076c) {
            if (f1Var.f4074a.size() > 0) {
                f1Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = f1Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!f1Var.f4076c) {
            f1Var.f4075b = f1Var.f4075b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(f1Var.f4075b);
            f1Var.f4078e = f1Var.f4078e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(f1Var.f4078e);
            f1Var.f4076c = true;
        }
        this.f4174b = true;
    }

    public final Object clone() {
        v vVar = new v();
        f1 f1Var = this.f4173a;
        if (f1Var.f4074a.size() > 0) {
            Map.Entry entryC = f1Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = f1Var.d().iterator();
        if (!it.hasNext()) {
            return vVar;
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
        if (obj instanceof v) {
            return this.f4173a.equals(((v) obj).f4173a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4173a.hashCode();
    }

    public v(int i10) {
        a();
        a();
    }
}
