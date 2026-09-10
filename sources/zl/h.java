package zl;

import com.google.android.gms.internal.ads.k3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f55041c = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f55042a = new x(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55043b;

    public h() {
    }

    public static int c(i0 i0Var, Object obj) {
        switch (i0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return k3.h(((Long) obj).longValue());
            case 3:
                return k3.h(((Long) obj).longValue());
            case 4:
                return k3.d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return k3.g(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported.", e10);
                }
            case 9:
                return ((a) obj).d();
            case 10:
                return k3.f((a) obj);
            case 11:
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return dVar.size() + k3.g(dVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return k3.g(bArr.length) + bArr.length;
            case 12:
                return k3.g(((Integer) obj).intValue());
            case 13:
                return obj instanceof o ? k3.d(((o) obj).getNumber()) : k3.d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return k3.g((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return k3.h((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(l lVar, Object obj) {
        i0 i0Var = lVar.f55068b;
        int i10 = lVar.f55067a;
        if (!lVar.f55069c) {
            int i11 = k3.i(i10);
            if (i0Var == i0.f55047e) {
                i11 *= 2;
            }
            return c(i0Var, obj) + i11;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int i12 = k3.i(i10);
            if (i0Var == i0.f55047e) {
                i12 *= 2;
            }
            iC += c(i0Var, obj2) + i12;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        l lVar = (l) entry.getKey();
        if (lVar.f55068b.f55051a != j0.MESSAGE) {
            return true;
        }
        if (!lVar.f55069c) {
            Object value = entry.getValue();
            if (value instanceof a) {
                return ((a) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(e eVar, i0 i0Var) {
        switch (i0Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(eVar.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(eVar.i()));
            case 2:
                return Long.valueOf(eVar.l());
            case 3:
                return Long.valueOf(eVar.l());
            case 4:
                return Integer.valueOf(eVar.k());
            case 5:
                return Long.valueOf(eVar.j());
            case 6:
                return Integer.valueOf(eVar.i());
            case 7:
                return Boolean.valueOf(eVar.l() != 0);
            case 8:
                int iK = eVar.k();
                int i10 = eVar.f55029b;
                int i11 = eVar.f55031d;
                if (iK > i10 - i11 || iK <= 0) {
                    return iK == 0 ? "" : new String(eVar.h(iK), "UTF-8");
                }
                String str = new String(eVar.f55028a, i11, iK, "UTF-8");
                eVar.f55031d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return eVar.e();
            case 12:
                return Integer.valueOf(eVar.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(eVar.i());
            case 15:
                return Long.valueOf(eVar.j());
            case 16:
                int iK2 = eVar.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = eVar.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(i0 i0Var, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (i0Var.f55051a) {
            case INT:
                z11 = obj instanceof Integer;
                break;
            case LONG:
                z11 = obj instanceof Long;
                break;
            case FLOAT:
                z11 = obj instanceof Float;
                break;
            case DOUBLE:
                z11 = obj instanceof Double;
                break;
            case BOOLEAN:
                z11 = obj instanceof Boolean;
                break;
            case STRING:
                z11 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof d) && !(obj instanceof byte[])) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof o)) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case MESSAGE:
                z11 = obj instanceof a;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(k3 k3Var, i0 i0Var, Object obj) {
        switch (i0Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                k3Var.getClass();
                k3Var.y(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                k3Var.getClass();
                k3Var.x(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                k3Var.A(((Long) obj).longValue());
                break;
            case 3:
                k3Var.A(((Long) obj).longValue());
                break;
            case 4:
                k3Var.r(((Integer) obj).intValue());
                break;
            case 5:
                k3Var.y(((Long) obj).longValue());
                break;
            case 6:
                k3Var.x(((Integer) obj).intValue());
                break;
            case 7:
                k3Var.u(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                k3Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                k3Var.z(bytes.length);
                k3Var.w(bytes);
                break;
            case 9:
                k3Var.getClass();
                ((a) obj).i(k3Var);
                break;
            case 10:
                k3Var.t((a) obj);
                break;
            case 11:
                if (!(obj instanceof d)) {
                    byte[] bArr = (byte[]) obj;
                    k3Var.getClass();
                    k3Var.z(bArr.length);
                    k3Var.w(bArr);
                } else {
                    d dVar = (d) obj;
                    k3Var.getClass();
                    k3Var.z(dVar.size());
                    k3Var.v(dVar);
                }
                break;
            case 12:
                k3Var.z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof o)) {
                    k3Var.r(((Integer) obj).intValue());
                } else {
                    k3Var.r(((o) obj).getNumber());
                }
                break;
            case 14:
                k3Var.x(((Integer) obj).intValue());
                break;
            case 15:
                k3Var.y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                k3Var.z((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                k3Var.A((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(l lVar, Object obj) {
        List arrayList;
        if (!lVar.f55069c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(lVar.f55068b, obj);
        x xVar = this.f55042a;
        Object obj2 = xVar.get(lVar);
        if (obj2 == null) {
            arrayList = new ArrayList();
            xVar.put(lVar, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        x xVar;
        h hVar = new h();
        int i10 = 0;
        while (true) {
            xVar = this.f55042a;
            if (i10 >= xVar.f55090b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) xVar.f55090b.get(i10);
            hVar.i((l) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : xVar.c()) {
            hVar.i((l) entry2.getKey(), entry2.getValue());
        }
        return hVar;
    }

    public final void f() {
        if (this.f55043b) {
            return;
        }
        x xVar = this.f55042a;
        if (!xVar.f55092d) {
            for (int i10 = 0; i10 < xVar.f55090b.size(); i10++) {
                Map.Entry entry = (Map.Entry) xVar.f55090b.get(i10);
                if (((l) entry.getKey()).f55069c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : xVar.c()) {
                if (((l) entry2.getKey()).f55069c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!xVar.f55092d) {
            xVar.f55091c = xVar.f55091c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(xVar.f55091c);
            xVar.f55092d = true;
        }
        this.f55043b = true;
    }

    public final void g(Map.Entry entry) {
        l lVar = (l) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = lVar.f55069c;
        x xVar = this.f55042a;
        if (z10) {
            Object arrayList = xVar.get(lVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            xVar.put(lVar, arrayList);
            return;
        }
        if (lVar.f55068b.f55051a != j0.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            xVar.put(lVar, value);
            return;
        }
        Object obj2 = xVar.get(lVar);
        if (obj2 != null) {
            xVar.put(lVar, ((a) obj2).h().c((n) ((a) value)).a());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        xVar.put(lVar, value);
    }

    public final void i(l lVar, Object obj) {
        boolean z10 = lVar.f55069c;
        i0 i0Var = lVar.f55068b;
        if (!z10) {
            j(i0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(i0Var, it.next());
            }
            obj = arrayList;
        }
        this.f55042a.put(lVar, obj);
    }

    public h(int i10) {
        f();
    }
}
