package ads_mobile_sdk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import saneness.attraction;
import saneness.salutatory;
import saneness.shent;
import saneness.transpositive;

/* JADX INFO: loaded from: classes.dex */
public final class hg0 {
    public final uu2 a;
    public boolean b;

    static {
        new hg0(new shent()).a();
    }

    public hg0() {
        this.a = uu2.d();
    }

    public static int a(ib3 ib3Var, int i, Object obj) {
        int iH = mr.h(i);
        if (ib3Var == ib3.e) {
            iH *= 2;
        }
        return a(ib3Var, obj) + iH;
    }

    public final Object clone() {
        hg0 hg0Var = new hg0();
        uu2 uu2Var = this.a;
        if (uu2Var.b > 0) {
            uu2Var.a(0).a.getClass();
            throw new ClassCastException();
        }
        Iterator it = uu2Var.b().iterator();
        if (!it.hasNext()) {
            return hg0Var;
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
        if (obj instanceof hg0) {
            return this.a.equals(((hg0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public hg0(shent shentVar) {
        this.a = shentVar;
        a();
    }

    public static int a(ib3 ib3Var, Object obj) {
        int iA;
        int i;
        switch (ib3Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = mr.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = mr.b;
                return 4;
            case 2:
                return mr.a(((Long) obj).longValue());
            case 3:
                return mr.a(((Long) obj).longValue());
            case 4:
                return mr.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                boolean z3 = mr.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = mr.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = mr.b;
                return 1;
            case 8:
                if (obj instanceof kn) {
                    return mr.a((kn) obj);
                }
                boolean z6 = mr.b;
                iA = t63.a((String) obj);
                i = mr.i(iA);
                break;
                break;
            case 9:
                return ((xm0) ((transpositive) obj)).a((attraction) null);
            case 10:
                return mr.a((transpositive) obj);
            case 11:
                if (obj instanceof kn) {
                    return mr.a((kn) obj);
                }
                boolean z7 = mr.b;
                iA = ((byte[]) obj).length;
                i = mr.i(iA);
                break;
                break;
            case 12:
                return mr.i(((Integer) obj).intValue());
            case 13:
                if (obj instanceof salutatory) {
                    return mr.a(((salutatory) obj).getNumber());
                }
                return mr.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z8 = mr.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z9 = mr.b;
                return 8;
            case 16:
                return mr.i(mr.j(((Integer) obj).intValue()));
            case 17:
                return mr.a(mr.b(((Long) obj).longValue()));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i + iA;
    }

    public final void a() {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        if (this.b) {
            return;
        }
        int i = this.a.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.a.a(i2).b;
            if (obj instanceof xm0) {
                ((xm0) obj).k();
            }
        }
        Iterator it = this.a.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof xm0) {
                ((xm0) value).k();
            }
        }
        shent shentVar = (shent) this.a;
        if (!shentVar.d) {
            if (shentVar.b <= 0) {
                Iterator it2 = shentVar.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                shentVar.a(0).a.getClass();
                throw new ClassCastException();
            }
        }
        if (!shentVar.d) {
            if (shentVar.c.isEmpty()) {
                mapUnmodifiableMap = Collections.EMPTY_MAP;
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(shentVar.c);
            }
            shentVar.c = mapUnmodifiableMap;
            if (shentVar.f.isEmpty()) {
                mapUnmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(shentVar.f);
            }
            shentVar.f = mapUnmodifiableMap2;
            shentVar.d = true;
        }
        this.b = true;
    }

    public static void a(mr mrVar, ib3 ib3Var, int i, Object obj) {
        if (ib3Var == ib3.e) {
            mrVar.g(i, 3);
            ((xm0) ((transpositive) obj)).a(mrVar);
            mrVar.g(i, 4);
        }
        mrVar.g(i, ib3Var.b);
        switch (ib3Var.ordinal()) {
            case 0:
                mrVar.c(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                mrVar.k(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                mrVar.d(((Long) obj).longValue());
                break;
            case 3:
                mrVar.d(((Long) obj).longValue());
                break;
            case 4:
                mrVar.l(((Integer) obj).intValue());
                break;
            case 5:
                mrVar.c(((Long) obj).longValue());
                break;
            case 6:
                mrVar.k(((Integer) obj).intValue());
                break;
            case 7:
                mrVar.a(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (obj instanceof kn) {
                    mrVar.b((kn) obj);
                } else {
                    mrVar.a((String) obj);
                }
                break;
            case 9:
                ((xm0) ((transpositive) obj)).a(mrVar);
                break;
            case 10:
                mrVar.b((transpositive) obj);
                break;
            case 11:
                if (obj instanceof kn) {
                    mrVar.b((kn) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    mrVar.a(bArr, bArr.length);
                }
                break;
            case 12:
                mrVar.m(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof salutatory) {
                    mrVar.l(((salutatory) obj).getNumber());
                } else {
                    mrVar.l(((Integer) obj).intValue());
                }
                break;
            case 14:
                mrVar.k(((Integer) obj).intValue());
                break;
            case 15:
                mrVar.c(((Long) obj).longValue());
                break;
            case 16:
                mrVar.m(mr.j(((Integer) obj).intValue()));
                break;
            case 17:
                mrVar.d(mr.b(((Long) obj).longValue()));
                break;
        }
    }
}
