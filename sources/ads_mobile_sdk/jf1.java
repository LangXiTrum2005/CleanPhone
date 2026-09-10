package ads_mobile_sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import saneness.archipelagic;
import saneness.attraction;
import saneness.bubbles;
import saneness.extensively;
import saneness.ferrovanadium;
import saneness.gutturalization;
import saneness.imparkation;
import saneness.impromptu;
import saneness.iridectome;
import saneness.monofuel;
import saneness.odille;
import saneness.plench;
import saneness.prescient;
import saneness.salmi;
import saneness.tdb;
import saneness.transpositive;
import saneness.vavasour;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class jf1 implements attraction {
    public static final int[] n = new int[0];
    public static final Unsafe o = n53.a();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final transpositive e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final bubbles j;
    public final salmi k;
    public final odille l;
    public final imparkation m;

    public jf1(int[] iArr, Object[] objArr, int i, int i2, transpositive transpositiveVar, int[] iArr2, int i3, int i4, bubbles bubblesVar, salmi salmiVar, odille odilleVar, archipelagic archipelagicVar, imparkation imparkationVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = transpositiveVar instanceof xm0;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = bubblesVar;
        this.k = salmiVar;
        this.l = odilleVar;
        this.e = transpositiveVar;
        this.m = imparkationVar;
    }

    public static long d(int i) {
        return i & 1048575;
    }

    public static void e(Object obj) {
        if (g(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    public static z43 f(Object obj) {
        xm0 xm0Var = (xm0) obj;
        z43 z43Var = xm0Var.b;
        if (z43Var != z43.f) {
            return z43Var;
        }
        z43 z43VarB = z43.b();
        xm0Var.b = z43VarB;
        return z43VarB;
    }

    public static boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof xm0) {
            return ((xm0) obj).j();
        }
        return true;
    }

    public final boolean a(int i, Object obj, Object obj2) {
        return a(i, obj) == a(i, obj2);
    }

    @Override // saneness.attraction
    public final boolean b(Object obj, Object obj2) {
        boolean zA;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int[] iArr = this.a;
            int i2 = iArr[i + 1];
            int i3 = (267386880 & i2) >>> 20;
            if (i3 <= 50 || i3 >= 69) {
                long j = i2 & 1048575;
                switch (i3) {
                    case 0:
                        if (a(i, obj, obj2)) {
                            m53 m53Var = n53.c;
                            if (Double.doubleToLongBits(m53Var.c(obj, j)) == Double.doubleToLongBits(m53Var.c(obj2, j))) {
                                continue;
                            }
                        }
                        return false;
                    case 1:
                        if (a(i, obj, obj2)) {
                            m53 m53Var2 = n53.c;
                            if (Float.floatToIntBits(m53Var2.d(obj, j)) == Float.floatToIntBits(m53Var2.d(obj2, j))) {
                                continue;
                            }
                        }
                        return false;
                    case 2:
                        if (a(i, obj, obj2)) {
                            m53 m53Var3 = n53.c;
                            if (m53Var3.f(obj, j) == m53Var3.f(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 3:
                        if (a(i, obj, obj2)) {
                            m53 m53Var4 = n53.c;
                            if (m53Var4.f(obj, j) == m53Var4.f(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 4:
                        if (a(i, obj, obj2)) {
                            m53 m53Var5 = n53.c;
                            if (m53Var5.e(obj, j) == m53Var5.e(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 5:
                        if (a(i, obj, obj2)) {
                            m53 m53Var6 = n53.c;
                            if (m53Var6.f(obj, j) == m53Var6.f(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 6:
                        if (a(i, obj, obj2)) {
                            m53 m53Var7 = n53.c;
                            if (m53Var7.e(obj, j) == m53Var7.e(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 7:
                        if (a(i, obj, obj2)) {
                            m53 m53Var8 = n53.c;
                            if (m53Var8.a(obj, j) == m53Var8.a(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 8:
                        if (a(i, obj, obj2)) {
                            m53 m53Var9 = n53.c;
                            if (yk2.a(m53Var9.g(obj, j), m53Var9.g(obj2, j))) {
                                continue;
                            }
                        }
                        return false;
                    case 9:
                        if (a(i, obj, obj2)) {
                            m53 m53Var10 = n53.c;
                            if (yk2.a(m53Var10.g(obj, j), m53Var10.g(obj2, j))) {
                                continue;
                            }
                        }
                        return false;
                    case 10:
                        if (a(i, obj, obj2)) {
                            m53 m53Var11 = n53.c;
                            if (yk2.a(m53Var11.g(obj, j), m53Var11.g(obj2, j))) {
                                continue;
                            }
                        }
                        return false;
                    case 11:
                        if (a(i, obj, obj2)) {
                            m53 m53Var12 = n53.c;
                            if (m53Var12.e(obj, j) == m53Var12.e(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 12:
                        if (a(i, obj, obj2)) {
                            m53 m53Var13 = n53.c;
                            if (m53Var13.e(obj, j) == m53Var13.e(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 13:
                        if (a(i, obj, obj2)) {
                            m53 m53Var14 = n53.c;
                            if (m53Var14.e(obj, j) == m53Var14.e(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 14:
                        if (a(i, obj, obj2)) {
                            m53 m53Var15 = n53.c;
                            if (m53Var15.f(obj, j) == m53Var15.f(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 15:
                        if (a(i, obj, obj2)) {
                            m53 m53Var16 = n53.c;
                            if (m53Var16.e(obj, j) == m53Var16.e(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 16:
                        if (a(i, obj, obj2)) {
                            m53 m53Var17 = n53.c;
                            if (m53Var17.f(obj, j) == m53Var17.f(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 17:
                        if (a(i, obj, obj2)) {
                            m53 m53Var18 = n53.c;
                            if (yk2.a(m53Var18.g(obj, j), m53Var18.g(obj2, j))) {
                                continue;
                            }
                        }
                        return false;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        m53 m53Var19 = n53.c;
                        zA = yk2.a(m53Var19.g(obj, j), m53Var19.g(obj2, j));
                        break;
                    case 50:
                        m53 m53Var20 = n53.c;
                        zA = yk2.a(m53Var20.g(obj, j), m53Var20.g(obj2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = 1048575 & iArr[i + 2];
                        m53 m53Var21 = n53.c;
                        if (m53Var21.e(obj, j2) != m53Var21.e(obj2, j2) || !yk2.a(m53Var21.g(obj, j), m53Var21.g(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zA) {
                    return false;
                }
            }
        }
        int i4 = this.i;
        while (true) {
            int[] iArr2 = this.g;
            if (i4 >= iArr2.length) {
                ((impromptu) this.l).getClass();
                z43 z43Var = ((xm0) obj).b;
                ((impromptu) this.l).getClass();
                return z43Var.equals(((xm0) obj2).b);
            }
            int i5 = iArr2[i4];
            long j3 = this.a[i5 + 2] & 1048575;
            m53 m53Var22 = n53.c;
            if (m53Var22.e(obj, j3) != m53Var22.e(obj2, j3)) {
                return false;
            }
            if (!a(obj, 0, i5)) {
                long j4 = this.a[i5 + 1] & 1048575;
                if (!yk2.a(m53Var22.g(obj, j4), m53Var22.g(obj2, j4))) {
                    return false;
                }
            }
            i4++;
        }
    }

    public final attraction c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        attraction attractionVar = (attraction) objArr[i2];
        if (attractionVar != null) {
            return attractionVar;
        }
        attraction attractionVarA = y72.c.a((Class) objArr[i2 + 1]);
        this.b[i2] = attractionVarA;
        return attractionVarA;
    }

    public static int a(byte[] bArr, int i, int i2, ib3 ib3Var, Class cls, fh fhVar) {
        switch (ib3Var.ordinal()) {
            case 0:
                fhVar.c = Double.valueOf(Double.longBitsToDouble(plench.molybdenite(i, bArr)));
                return i + 8;
            case 1:
                fhVar.c = Float.valueOf(Float.intBitsToFloat(plench.apical(i, bArr)));
                return i + 4;
            case 2:
            case 3:
                int iPreprohormone = plench.preprohormone(bArr, i, fhVar);
                fhVar.c = Long.valueOf(fhVar.b);
                return iPreprohormone;
            case 4:
            case 12:
            case 13:
                int iDovishness = plench.dovishness(bArr, i, fhVar);
                fhVar.c = Integer.valueOf(fhVar.a);
                return iDovishness;
            case 5:
            case 15:
                fhVar.c = Long.valueOf(plench.molybdenite(i, bArr));
                return i + 8;
            case 6:
            case 14:
                fhVar.c = Integer.valueOf(plench.apical(i, bArr));
                return i + 4;
            case 7:
                int iPreprohormone2 = plench.preprohormone(bArr, i, fhVar);
                fhVar.c = Boolean.valueOf(fhVar.b != 0);
                return iPreprohormone2;
            case 8:
                return plench.monoploid(bArr, i, fhVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                attraction attractionVarA = y72.c.a(cls);
                xm0 xm0VarA = attractionVarA.a();
                int iCompetently = plench.competently(xm0VarA, attractionVarA, bArr, i, i2, fhVar);
                attractionVarA.c(xm0VarA);
                fhVar.c = xm0VarA;
                return iCompetently;
            case 11:
                return plench.taiyuan(bArr, i, fhVar);
            case 16:
                int iDovishness2 = plench.dovishness(bArr, i, fhVar);
                fhVar.c = Integer.valueOf(hr.b(fhVar.a));
                return iDovishness2;
            case 17:
                int iPreprohormone3 = plench.preprohormone(bArr, i, fhVar);
                fhVar.c = Long.valueOf(hr.a(fhVar.b));
                return iPreprohormone3;
        }
    }

    @Override // saneness.attraction
    public final int d(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int length = this.a.length;
        int iHashCode = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = this.a[i3 + 1];
            int i5 = (267386880 & i4) >>> 20;
            if (i5 <= 50 || i5 >= 69) {
                long j = 1048575 & i4;
                int iHashCode2 = 37;
                switch (i5) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(n53.c.c(obj, j));
                        byte[] bArr = r21.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(n53.c.d(obj, j));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n53.c.f(obj, j);
                        byte[] bArr2 = r21.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n53.c.f(obj, j);
                        byte[] bArr3 = r21.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.e(obj, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n53.c.f(obj, j);
                        byte[] bArr4 = r21.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.e(obj, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i2 = iHashCode * 53;
                        boolean zA = n53.c.a(obj, j);
                        byte[] bArr5 = r21.a;
                        iFloatToIntBits = zA ? 1231 : 1237;
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) n53.c.g(obj, j)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        Object objG = n53.c.g(obj, j);
                        if (objG != null) {
                            iHashCode2 = objG.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.g(obj, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.e(obj, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.e(obj, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.e(obj, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n53.c.f(obj, j);
                        byte[] bArr6 = r21.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.e(obj, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n53.c.f(obj, j);
                        byte[] bArr7 = r21.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 17:
                        Object objG2 = n53.c.g(obj, j);
                        if (objG2 != null) {
                            iHashCode2 = objG2.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.g(obj, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n53.c.g(obj, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i6 >= iArr.length) {
                ((impromptu) this.l).getClass();
                return ((xm0) obj).b.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!a(obj, 0, i7)) {
                iHashCode = n53.c.g(obj, this.a[i7 + 1] & 1048575).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[SYNTHETIC] */
    @Override // saneness.attraction
    public final void c(Object obj) {
        if (g(obj)) {
            if (obj instanceof xm0) {
                xm0 xm0Var = (xm0) obj;
                xm0Var.d();
                xm0Var.c();
                xm0Var.l();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int[] iArr = this.a;
                int i2 = iArr[i + 1];
                long j = 1048575 & i2;
                int i3 = (i2 & 267386880) >>> 20;
                if (i3 != 9) {
                    if (i3 == 60 || i3 == 68) {
                        if (a(obj, iArr[i], i)) {
                            c(i).c(o.getObject(obj, j));
                        }
                    } else {
                        switch (i3) {
                            case 17:
                                if (a(i, obj)) {
                                    c(i).c(o.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((iridectome) this.k).attabal(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, ((ferrovanadium) this.m).competently(object));
                                }
                                break;
                        }
                    }
                } else if (a(i, obj)) {
                    c(i).c(o.getObject(obj, j));
                }
            }
            this.l.wireman(obj);
        }
    }

    public final void c(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (a(obj2, i2, i)) {
            long j = this.a[i + 1] & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                attraction attractionVarC = c(i);
                if (!a(obj, i2, i)) {
                    if (!g(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        xm0 xm0VarA = attractionVarC.a();
                        attractionVarC.a(xm0VarA, object);
                        unsafe.putObject(obj, j, xm0VarA);
                    }
                    c(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!g(object2)) {
                    xm0 xm0VarA2 = attractionVarC.a();
                    attractionVarC.a(xm0VarA2, object2);
                    unsafe.putObject(obj, j, xm0VarA2);
                    object2 = xm0VarA2;
                }
                attractionVarC.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(obj2));
        }
    }

    public final Object a(Object obj, int i, Object obj2, odille odilleVar, Object obj3) {
        monofuel monofuelVarA;
        int[] iArr = this.a;
        int i2 = iArr[i];
        Object objG = n53.c.g(obj, iArr[i + 1] & 1048575);
        if (objG == null || (monofuelVarA = a(i)) == null) {
            return obj2;
        }
        ((ferrovanadium) this.m).getClass();
        imparkation imparkationVar = this.m;
        Object objB = b(i);
        ((ferrovanadium) imparkationVar).getClass();
        yc1 yc1Var = ((zc1) objB).a;
        Iterator it = ((cd1) objG).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!monofuelVarA.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = odilleVar.attabal(obj3);
                }
                int iA = zc1.a(yc1Var, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iA];
                jr jrVar = new jr(bArr, iA);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    hg0.a(jrVar, yc1Var.a, 1, key);
                    hg0.a(jrVar, yc1Var.c, 2, value);
                    jrVar.a();
                    in inVar = new in(bArr);
                    ((impromptu) odilleVar).getClass();
                    ((z43) obj2).a((i2 << 3) | 2, inVar);
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final void c(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        m53 m53Var = n53.c;
        m53Var.a((1 << (i2 >>> 20)) | m53Var.e(obj, j), j, obj);
    }

    public final void c(Object obj, int i, int i2) {
        n53.c.a(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final void d(int i, Object obj, Object obj2) {
        o.putObject(obj, this.a[i + 1] & 1048575, obj2);
        c(i, obj);
    }

    public final monofuel a(int i) {
        return (monofuel) this.b[((i / 3) * 2) + 1];
    }

    public final boolean a(int i, Object obj) {
        int[] iArr = this.a;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & n53.c.e(obj, j)) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(n53.c.c(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(n53.c.d(obj, j2)) != 0;
            case 2:
                return n53.c.f(obj, j2) != 0;
            case 3:
                return n53.c.f(obj, j2) != 0;
            case 4:
                return n53.c.e(obj, j2) != 0;
            case 5:
                return n53.c.f(obj, j2) != 0;
            case 6:
                return n53.c.e(obj, j2) != 0;
            case 7:
                return n53.c.a(obj, j2);
            case 8:
                Object objG = n53.c.g(obj, j2);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof kn) {
                    return !kn.b.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return n53.c.g(obj, j2) != null;
            case 10:
                return !kn.b.equals(n53.c.g(obj, j2));
            case 11:
                return n53.c.e(obj, j2) != 0;
            case 12:
                return n53.c.e(obj, j2) != 0;
            case 13:
                return n53.c.e(obj, j2) != 0;
            case 14:
                return n53.c.f(obj, j2) != 0;
            case 15:
                return n53.c.e(obj, j2) != 0;
            case 16:
                return n53.c.f(obj, j2) != 0;
            case 17:
                return n53.c.g(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final Object b(int i) {
        return this.b[(i / 3) * 2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:146:0x03be A[PHI: r4 r7
  0x03be: PHI (r4v20 java.lang.Object) = 
  (r4v5 java.lang.Object)
  (r4v6 java.lang.Object)
  (r4v7 java.lang.Object)
  (r4v8 java.lang.Object)
  (r4v9 java.lang.Object)
  (r4v10 java.lang.Object)
  (r4v11 java.lang.Object)
  (r4v12 java.lang.Object)
  (r4v14 java.lang.Object)
  (r4v15 java.lang.Object)
  (r4v16 java.lang.Object)
  (r4v17 java.lang.Object)
  (r4v18 java.lang.Object)
  (r4v19 java.lang.Object)
  (r4v21 java.lang.Object)
 binds: [B:193:0x04d2, B:190:0x04bf, B:187:0x04ac, B:184:0x0499, B:181:0x048a, B:178:0x047b, B:175:0x046c, B:169:0x044b, B:163:0x041f, B:160:0x040c, B:157:0x03f9, B:154:0x03ea, B:151:0x03db, B:148:0x03c8, B:144:0x03b2] A[DONT_GENERATE, DONT_INLINE]
  0x03be: PHI (r7v22 int) = 
  (r7v7 int)
  (r7v8 int)
  (r7v9 int)
  (r7v10 int)
  (r7v11 int)
  (r7v12 int)
  (r7v13 int)
  (r7v14 int)
  (r7v16 int)
  (r7v17 int)
  (r7v18 int)
  (r7v19 int)
  (r7v20 int)
  (r7v21 int)
  (r7v23 int)
 binds: [B:193:0x04d2, B:190:0x04bf, B:187:0x04ac, B:184:0x0499, B:181:0x048a, B:178:0x047b, B:175:0x046c, B:169:0x044b, B:163:0x041f, B:160:0x040c, B:157:0x03f9, B:154:0x03ea, B:151:0x03db, B:148:0x03c8, B:144:0x03b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    @Override // saneness.attraction
    public final int b(Object obj) {
        int i;
        int i2;
        int i3;
        Object obj2;
        int iB;
        int iE;
        int iD;
        int iH;
        int i4;
        Unsafe unsafe = o;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = this.a;
            if (i6 < iArr.length) {
                int i9 = iArr[i6 + 1];
                int i10 = (267386880 & i9) >>> 20;
                int i11 = iArr[i6];
                int i12 = iArr[i6 + 2];
                int i13 = i12 & 1048575;
                if (i10 <= 17) {
                    if (i13 != i8) {
                        i5 = i13 == 1048575 ? 0 : unsafe.getInt(obj, i13);
                        i8 = i13;
                    }
                    int i14 = 1 << (i12 >>> 20);
                    i = i8;
                    i2 = i14;
                } else {
                    i = i8;
                    i2 = 0;
                }
                long j = i9 & 1048575;
                if (i10 >= ig0.b.a()) {
                    ig0.c.a();
                }
                switch (i10) {
                    case 0:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iB = mr.b(i11);
                            i7 += iB;
                        }
                        break;
                    case 1:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.e(i11);
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 2:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.a(i11, unsafe.getLong(obj2, j));
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 3:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.c(i11, unsafe.getLong(obj2, j));
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 4:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.b(i11, unsafe.getInt(obj2, j));
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 5:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.d(i11);
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 6:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.c(i11);
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 7:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.a(i11);
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 8:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            Object object = unsafe.getObject(obj2, j);
                            if (object instanceof kn) {
                                iE = mr.a(i11, (kn) object);
                            } else {
                                iE = mr.a((String) object, i11);
                            }
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 9:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iB = yk2.a(i11, c(i6), unsafe.getObject(obj2, j));
                            i7 += iB;
                        }
                        break;
                    case 10:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.a(i11, (kn) unsafe.getObject(obj2, j));
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 11:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.d(i11, unsafe.getInt(obj2, j));
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 12:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.a(i11, unsafe.getInt(obj2, j));
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 13:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.f(i11);
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 14:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.g(i11);
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 15:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.c(i11, unsafe.getInt(obj2, j));
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 16:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iE = mr.b(i11, unsafe.getLong(obj2, j));
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 17:
                        i3 = i5;
                        obj2 = obj;
                        if (a(obj2, i6, i, i3, i2)) {
                            iB = yk2.a(i11, (transpositive) unsafe.getObject(obj2, j), c(i6));
                            i7 += iB;
                        }
                        break;
                    case 18:
                        iE = yk2.e(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 19:
                        iE = yk2.d(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 20:
                        iE = yk2.g(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 21:
                        iE = yk2.l(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 22:
                        iE = yk2.f(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 23:
                        iE = yk2.e(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 24:
                        iE = yk2.d(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 25:
                        iE = yk2.a(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 26:
                        iE = yk2.j(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 27:
                        iE = yk2.b(i11, (List) unsafe.getObject(obj, j), c(i6));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 28:
                        iE = yk2.b(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 29:
                        iE = yk2.k(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 30:
                        iE = yk2.c(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 31:
                        iE = yk2.d(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 32:
                        iE = yk2.e(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 33:
                        iE = yk2.h(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 34:
                        iE = yk2.i(i11, (List) unsafe.getObject(obj, j));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 35:
                        iD = yk2.d((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 36:
                        iD = yk2.c((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 37:
                        iD = yk2.f((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 38:
                        iD = yk2.j((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 39:
                        iD = yk2.e((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 40:
                        iD = yk2.d((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 41:
                        iD = yk2.c((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 42:
                        iD = yk2.a((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 43:
                        iD = yk2.i((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 44:
                        iD = yk2.b((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 45:
                        iD = yk2.c((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 46:
                        iD = yk2.d((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 47:
                        iD = yk2.g((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 48:
                        iD = yk2.h((List) unsafe.getObject(obj, j));
                        if (iD <= 0) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iH = mr.h(i11);
                            i4 = mr.i(iD);
                            iE = iD + i4 + iH;
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 49:
                        iE = yk2.a(i11, (List) unsafe.getObject(obj, j), c(i6));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 50:
                        iE = ((ferrovanadium) this.m).attabal(i11, unsafe.getObject(obj, j), b(i6));
                        i3 = i5;
                        obj2 = obj;
                        iB = iE;
                        i7 += iB;
                        break;
                    case 51:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.b(i11);
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 52:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.e(i11);
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 53:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.a(i11, b(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 54:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.c(i11, b(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 55:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.b(i11, a(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 56:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.d(i11);
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 57:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.c(i11);
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 58:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.a(i11);
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 59:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            Object object2 = unsafe.getObject(obj, j);
                            if (object2 instanceof kn) {
                                iE = mr.a(i11, (kn) object2);
                            } else {
                                iE = mr.a((String) object2, i11);
                            }
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 60:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = yk2.a(i11, c(i6), unsafe.getObject(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 61:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.a(i11, (kn) unsafe.getObject(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 62:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.d(i11, a(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 63:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.a(i11, a(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 64:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.f(i11);
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 65:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.g(i11);
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 66:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.c(i11, a(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 67:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = mr.b(i11, b(obj, j));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    case 68:
                        if (!a(obj, i11, i6)) {
                            i3 = i5;
                            obj2 = obj;
                        } else {
                            iE = yk2.a(i11, (transpositive) unsafe.getObject(obj, j), c(i6));
                            i3 = i5;
                            obj2 = obj;
                            iB = iE;
                            i7 += iB;
                        }
                        break;
                    default:
                        i3 = i5;
                        obj2 = obj;
                        break;
                }
                i6 += 3;
                obj = obj2;
                i8 = i;
                i5 = i3;
            } else {
                Object obj3 = obj;
                ((impromptu) this.l).getClass();
                return ((xm0) obj3).b.a() + i7;
            }
        }
    }

    public final boolean a(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return a(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102 A[LOOP:2: B:55:0x00f1->B:60:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x011f A[SYNTHETIC] */
    @Override // saneness.attraction
    public final boolean a(Object obj) {
        int i;
        int i2;
        List list;
        attraction attractionVarC;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int i9 = iArr[i7 + 1];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i4) {
                if (i11 != 1048575) {
                    i5 = o.getInt(obj, i11);
                }
                i2 = i5;
                i = i11;
            } else {
                int i13 = i5;
                i = i4;
                i2 = i13;
            }
            if ((268435456 & i9) != 0 && !a(obj, i7, i, i2, i12)) {
                return false;
            }
            int i14 = (267386880 & i9) >>> 20;
            if (i14 == 9 || i14 == 17) {
                if (a(obj, i7, i, i2, i12)) {
                    if (!c(i7).a(n53.c.g(obj, i9 & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (i14 == 27) {
                list = (List) n53.c.g(obj, i9 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    attractionVarC = c(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!attractionVarC.a(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i14 == 60 || i14 == 68) {
                if (a(obj, i8, i7)) {
                    if (!c(i7).a(n53.c.g(obj, i9 & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (i14 == 49) {
                list = (List) n53.c.g(obj, i9 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    attractionVarC = c(i7);
                    while (i3 < list.size()) {
                        if (!attractionVarC.a(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i14 != 50) {
                continue;
            } else {
                imparkation imparkationVar = this.m;
                Object objG = n53.c.g(obj, i9 & 1048575);
                ((ferrovanadium) imparkationVar).getClass();
                cd1 cd1Var = (cd1) objG;
                if (cd1Var.isEmpty()) {
                    continue;
                } else {
                    Object objB = b(i7);
                    ((ferrovanadium) this.m).getClass();
                    if (((zc1) objB).a.c.a != jb3.MESSAGE) {
                        continue;
                    } else {
                        attraction attractionVarA = null;
                        for (Object obj2 : cd1Var.values()) {
                            if (attractionVarA == null) {
                                attractionVarA = y72.c.a(obj2.getClass());
                            }
                            if (!attractionVarA.a(obj2)) {
                                return false;
                            }
                        }
                    }
                }
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        return true;
    }

    public final boolean a(Object obj, int i, int i2) {
        return n53.c.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    @Override // saneness.attraction
    public final void a(Object obj, gutturalization gutturalizationVar, vf0 vf0Var) {
        byte[] bArr = r21.a;
        vf0Var.getClass();
        e(obj);
        a(this.l, obj, gutturalizationVar, vf0Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // saneness.attraction
    public final void a(Object obj, Object obj2) {
        Object obj3;
        e(obj);
        byte[] bArr = r21.a;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long j = 1048575 & i2;
                int i3 = iArr[i];
                switch ((i2 & 267386880) >>> 20) {
                    case 0:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var = n53.c;
                            m53Var.a(obj3, j, m53Var.c(obj2, j));
                            c(i, obj3);
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 1:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var2 = n53.c;
                            m53Var2.a(obj3, j, m53Var2.d(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 2:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var3 = n53.c;
                            m53Var3.a(obj3, j, m53Var3.f(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 3:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var4 = n53.c;
                            m53Var4.a(obj3, j, m53Var4.f(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 4:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var5 = n53.c;
                            m53Var5.a(m53Var5.e(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 5:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var6 = n53.c;
                            m53Var6.a(obj3, j, m53Var6.f(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 6:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var7 = n53.c;
                            m53Var7.a(m53Var7.e(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 7:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var8 = n53.c;
                            m53Var8.a(obj3, j, m53Var8.a(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 8:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var9 = n53.c;
                            m53Var9.a(j, obj3, m53Var9.g(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 9:
                        obj3 = obj;
                        b(i, obj3, obj2);
                        continue;
                        i += 3;
                        obj = obj3;
                        break;
                    case 10:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var10 = n53.c;
                            m53Var10.a(j, obj3, m53Var10.g(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 11:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var11 = n53.c;
                            m53Var11.a(m53Var11.e(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 12:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var12 = n53.c;
                            m53Var12.a(m53Var12.e(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 13:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var13 = n53.c;
                            m53Var13.a(m53Var13.e(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 14:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var14 = n53.c;
                            m53Var14.a(obj3, j, m53Var14.f(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 15:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            m53 m53Var15 = n53.c;
                            m53Var15.a(m53Var15.e(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 16:
                        if (a(i, obj2)) {
                            m53 m53Var16 = n53.c;
                            obj3 = obj;
                            m53Var16.a(obj3, j, m53Var16.f(obj2, j));
                            c(i, obj3);
                        }
                        i += 3;
                        obj = obj3;
                        break;
                    case 17:
                        b(i, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        ((iridectome) this.k).getClass();
                        m53 m53Var17 = n53.c;
                        prescient prescientVarA = (prescient) m53Var17.g(obj, j);
                        prescient prescientVar = (prescient) m53Var17.g(obj2, j);
                        int size = prescientVarA.size();
                        int size2 = prescientVar.size();
                        if (size > 0 && size2 > 0) {
                            if (!((j) prescientVarA).a) {
                                prescientVarA = prescientVarA.a(size2 + size);
                            }
                            prescientVarA.addAll(prescientVar);
                        }
                        if (size > 0) {
                            prescientVar = prescientVarA;
                        }
                        m53Var17.a(j, obj, prescientVar);
                        break;
                    case 50:
                        imparkation imparkationVar = this.m;
                        Class cls = yk2.a;
                        m53 m53Var18 = n53.c;
                        m53Var18.a(j, obj, ((ferrovanadium) imparkationVar).dern(m53Var18.g(obj, j), m53Var18.g(obj2, j)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (a(obj2, i3, i)) {
                            m53 m53Var19 = n53.c;
                            m53Var19.a(j, obj, m53Var19.g(obj2, j));
                            c(obj, i3, i);
                        }
                        break;
                    case 60:
                        c(i, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (a(obj2, i3, i)) {
                            m53 m53Var20 = n53.c;
                            m53Var20.a(j, obj, m53Var20.g(obj2, j));
                            c(obj, i3, i);
                        }
                        break;
                    case 68:
                        c(i, obj, obj2);
                        break;
                }
                obj3 = obj;
                i += 3;
                obj = obj3;
            } else {
                yk2.a(this.l, obj, obj2);
                return;
            }
        }
    }

    @Override // saneness.attraction
    public final void a(Object obj, byte[] bArr, int i, int i2, fh fhVar) throws x81 {
        a(obj, bArr, i, i2, 0, fhVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void a(saneness.odille r17, java.lang.Object r18, saneness.gutturalization r19, ads_mobile_sdk.vf0 r20) {
        /*
            Method dump skipped, instruction units count: 2306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jf1.a(saneness.odille, java.lang.Object, saneness.gutturalization, ads_mobile_sdk.vf0):void");
    }

    public final void b(int i, Object obj, Object obj2) {
        if (a(i, obj2)) {
            long j = this.a[i + 1] & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                attraction attractionVarC = c(i);
                if (!a(i, obj)) {
                    if (!g(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        xm0 xm0VarA = attractionVarC.a();
                        attractionVarC.a(xm0VarA, object);
                        unsafe.putObject(obj, j, xm0VarA);
                    }
                    c(i, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!g(object2)) {
                    xm0 xm0VarA2 = attractionVarC.a();
                    attractionVarC.a(xm0VarA2, object2);
                    unsafe.putObject(obj, j, xm0VarA2);
                    object2 = xm0VarA2;
                }
                attractionVarC.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(obj2));
        }
    }

    public final Object b(int i, Object obj) {
        attraction attractionVarC = c(i);
        long j = this.a[i + 1] & 1048575;
        if (!a(i, obj)) {
            return attractionVarC.a();
        }
        Object object = o.getObject(obj, j);
        if (g(object)) {
            return object;
        }
        xm0 xm0VarA = attractionVarC.a();
        if (object != null) {
            attractionVarC.a(xm0VarA, object);
        }
        return xm0VarA;
    }

    public final Object b(Object obj, int i, int i2) {
        attraction attractionVarC = c(i2);
        if (!a(obj, i, i2)) {
            return attractionVarC.a();
        }
        Object object = o.getObject(obj, this.a[i2 + 1] & 1048575);
        if (g(object)) {
            return object;
        }
        xm0 xm0VarA = attractionVarC.a();
        if (object != null) {
            attractionVarC.a(xm0VarA, object);
        }
        return xm0VarA;
    }

    public final void b(int i, gutturalization gutturalizationVar, Object obj) throws w81 {
        if ((536870912 & i) != 0) {
            ((ir) gutturalizationVar).a(((iridectome) this.k).saneness(obj, i & 1048575), true);
        } else {
            ((ir) gutturalizationVar).a(((iridectome) this.k).saneness(obj, i & 1048575), false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(Object obj, vavasour vavasourVar) {
        int i;
        jf1 jf1Var = this;
        int length = jf1Var.a.length;
        Unsafe unsafe = o;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr = jf1Var.a;
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4];
            int i8 = (267386880 & i6) >>> 20;
            if (i8 <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & i2;
                if (i10 != i3) {
                    i5 = i10 == i2 ? 0 : unsafe.getInt(obj, i10);
                    i3 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = i6 & i2;
            switch (i8) {
                case 0:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).a(i7, n53.c.c(obj, j));
                    }
                    break;
                case 1:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).a(i7, n53.c.d(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 2:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).b(i7, unsafe.getLong(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 3:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).e(i7, unsafe.getLong(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 4:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).c(i7, unsafe.getInt(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 5:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).a(i7, unsafe.getLong(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 6:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).b(i7, unsafe.getInt(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 7:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).a(i7, n53.c.a(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 8:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((nr) vavasourVar).a.b((String) object, i7);
                        } else {
                            ((nr) vavasourVar).a.b(i7, (kn) object);
                        }
                    }
                    jf1Var = this;
                    break;
                case 9:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).b(i7, jf1Var.c(i4), unsafe.getObject(obj, j));
                    }
                    break;
                case 10:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).a(i7, (kn) unsafe.getObject(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 11:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).f(i7, unsafe.getInt(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 12:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).a(i7, unsafe.getInt(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 13:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).d(i7, unsafe.getInt(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 14:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).c(i7, unsafe.getLong(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 15:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).e(i7, unsafe.getInt(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 16:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).d(i7, unsafe.getLong(obj, j));
                    }
                    jf1Var = this;
                    break;
                case 17:
                    if (jf1Var.a(obj, i4, i3, i5, i)) {
                        ((nr) vavasourVar).a(i7, jf1Var.c(i4), unsafe.getObject(obj, j));
                    }
                    break;
                case 18:
                    yk2.b(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 19:
                    yk2.f(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 20:
                    yk2.h(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 21:
                    yk2.n(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 22:
                    yk2.g(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 23:
                    yk2.e(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 24:
                    yk2.d(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 25:
                    yk2.a(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 26:
                    yk2.b(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar);
                    i3 = i3;
                    break;
                case 27:
                    yk2.b(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, jf1Var.c(i4));
                    i3 = i3;
                    break;
                case 28:
                    yk2.a(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar);
                    i3 = i3;
                    break;
                case 29:
                    yk2.m(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 30:
                    yk2.c(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 31:
                    yk2.i(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 32:
                    yk2.j(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 33:
                    yk2.k(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 34:
                    yk2.l(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, false);
                    i3 = i3;
                    break;
                case 35:
                    yk2.b(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 36:
                    yk2.f(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 37:
                    yk2.h(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 38:
                    yk2.n(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 39:
                    yk2.g(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 40:
                    yk2.e(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 41:
                    yk2.d(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 42:
                    yk2.a(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 43:
                    yk2.m(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 44:
                    yk2.c(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 45:
                    yk2.i(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 46:
                    yk2.j(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 47:
                    yk2.k(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 48:
                    yk2.l(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, true);
                    i3 = i3;
                    break;
                case 49:
                    yk2.a(jf1Var.a[i4], (List) unsafe.getObject(obj, j), vavasourVar, jf1Var.c(i4));
                    i3 = i3;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        imparkation imparkationVar = jf1Var.m;
                        Object objB = jf1Var.b(i4);
                        ((ferrovanadium) imparkationVar).getClass();
                        yc1 yc1Var = ((zc1) objB).a;
                        ((ferrovanadium) jf1Var.m).getClass();
                        nr nrVar = (nr) vavasourVar;
                        nrVar.a.getClass();
                        for (Map.Entry entry : ((cd1) object2).entrySet()) {
                            nrVar.a.g(i7, 2);
                            nrVar.a.m(zc1.a(yc1Var, entry.getKey(), entry.getValue()));
                            mr mrVar = nrVar.a;
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            hg0.a(mrVar, yc1Var.a, 1, key);
                            hg0.a(mrVar, yc1Var.c, 2, value);
                            i3 = i3;
                        }
                    }
                    break;
                case 51:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).a(i7, ((Double) n53.c.g(obj, j)).doubleValue());
                    }
                    break;
                case 52:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).a(i7, ((Float) n53.c.g(obj, j)).floatValue());
                    }
                    break;
                case 53:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).b(i7, b(obj, j));
                    }
                    break;
                case 54:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).e(i7, b(obj, j));
                    }
                    break;
                case 55:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).c(i7, a(obj, j));
                    }
                    break;
                case 56:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).a(i7, b(obj, j));
                    }
                    break;
                case 57:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).b(i7, a(obj, j));
                    }
                    break;
                case 58:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).a(i7, ((Boolean) n53.c.g(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (jf1Var.a(obj, i7, i4)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((nr) vavasourVar).a.b((String) object3, i7);
                        } else {
                            ((nr) vavasourVar).a.b(i7, (kn) object3);
                        }
                    }
                    break;
                case 60:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).b(i7, jf1Var.c(i4), unsafe.getObject(obj, j));
                    }
                    break;
                case 61:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).a(i7, (kn) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).f(i7, a(obj, j));
                    }
                    break;
                case 63:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).a(i7, a(obj, j));
                    }
                    break;
                case 64:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).d(i7, a(obj, j));
                    }
                    break;
                case 65:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).c(i7, b(obj, j));
                    }
                    break;
                case 66:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).e(i7, a(obj, j));
                    }
                    break;
                case 67:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).d(i7, b(obj, j));
                    }
                    break;
                case 68:
                    if (jf1Var.a(obj, i7, i4)) {
                        ((nr) vavasourVar).a(i7, jf1Var.c(i4), unsafe.getObject(obj, j));
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        ((impromptu) jf1Var.l).getClass();
        ((xm0) obj).b.a(vavasourVar);
    }

    public static long b(Object obj, long j) {
        return ((Long) n53.c.g(obj, j)).longValue();
    }

    public final void a(Object obj, int i, Object obj2, vf0 vf0Var, gutturalization gutturalizationVar) throws w81 {
        long j = this.a[i + 1] & 1048575;
        m53 m53Var = n53.c;
        Object objG = m53Var.g(obj, j);
        if (objG == null) {
            ((ferrovanadium) this.m).getClass();
            objG = cd1.b.b();
            m53Var.a(j, obj, objG);
        } else if (((ferrovanadium) this.m).beachfront(objG)) {
            ((ferrovanadium) this.m).getClass();
            cd1 cd1VarB = cd1.b.b();
            ((ferrovanadium) this.m).dern(cd1VarB, objG);
            m53Var.a(j, obj, cd1VarB);
            objG = cd1VarB;
        }
        ((ferrovanadium) this.m).getClass();
        cd1 cd1Var = (cd1) objG;
        ((ferrovanadium) this.m).getClass();
        yc1 yc1Var = ((zc1) obj2).a;
        ir irVar = (ir) gutturalizationVar;
        irVar.b(2);
        int iD = irVar.a.d(irVar.a.s());
        Object objA = yc1Var.b;
        Object objA2 = yc1Var.d;
        while (true) {
            try {
                int iA = irVar.a();
                if (iA == Integer.MAX_VALUE || irVar.a.b()) {
                    break;
                }
                if (iA == 1) {
                    objA = irVar.a(yc1Var.a, (Class) null, (vf0) null);
                } else if (iA != 2) {
                    try {
                        if (!irVar.b()) {
                            throw new x81("Unable to parse map entry.");
                        }
                    } catch (w81 e) {
                        if (!irVar.b()) {
                            throw new x81(e);
                        }
                    }
                } else {
                    objA2 = irVar.a(yc1Var.c, yc1Var.d.getClass(), vf0Var);
                }
            } catch (Throwable th) {
                irVar.a.c(iD);
                throw th;
            }
        }
        cd1Var.put(objA, objA2);
        irVar.a.c(iD);
    }

    @Override // saneness.attraction
    public final xm0 a() {
        bubbles bubblesVar = this.j;
        transpositive transpositiveVar = this.e;
        ((extensively) bubblesVar).getClass();
        return (xm0) ((xm0) transpositiveVar).a(4, (xm0) null);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x023b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0241  */
    /* JADX WARN: Code duplicated, block: B:125:0x025f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0262  */
    /* JADX WARN: Code duplicated, block: B:164:0x0313  */
    /* JADX WARN: Code duplicated, block: B:182:0x0379  */
    /* JADX WARN: Code duplicated, block: B:183:0x037c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0383  */
    /* JADX WARN: Code duplicated, block: B:187:0x0386  */
    /* JADX WARN: Code duplicated, block: B:190:0x038d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0390  */
    public static jf1 a(mc2 mc2Var, bubbles bubblesVar, salmi salmiVar, odille odilleVar, archipelagic archipelagicVar, imparkation imparkationVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        char cCharAt;
        int i8;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        int i16;
        int i17;
        Object[] objArr;
        int i18;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        Field fieldA;
        int i21;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldA2;
        int i29;
        Object obj2;
        Field fieldA3;
        int i30;
        char cCharAt9;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        String strC = mc2Var.c();
        int length = strC.length();
        char c = 55296;
        if (strC.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (strC.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt4 = strC.charAt(i);
        if (iCharAt4 >= 55296) {
            int i36 = iCharAt4 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                cCharAt12 = strC.charAt(i35);
                if (cCharAt12 < 55296) {
                    break;
                }
                i36 |= (cCharAt12 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            iCharAt4 = i36 | (cCharAt12 << i37);
            i35 = i33;
        }
        if (iCharAt4 == 0) {
            iCharAt2 = 0;
            iCharAt3 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i2 = i35;
            iArr = n;
            iCharAt = 0;
        } else {
            int i38 = i35 + 1;
            iCharAt = strC.charAt(i35);
            if (iCharAt >= 55296) {
                int i39 = iCharAt & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = strC.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt = i39 | (cCharAt7 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = strC.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt6 = strC.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt5 = i42 | (cCharAt6 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = strC.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt5 = strC.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt6 = i45 | (cCharAt5 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            int iCharAt7 = strC.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = strC.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt7 = i48 | (cCharAt4 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            iCharAt2 = strC.charAt(i47);
            if (iCharAt2 >= 55296) {
                int i51 = iCharAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = strC.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt2 = i51 | (cCharAt3 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            iCharAt3 = strC.charAt(i50);
            if (iCharAt3 >= 55296) {
                int i54 = iCharAt3 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = strC.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt3 = i54 | (cCharAt2 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            if (strC.charAt(i53) >= 55296) {
                while (true) {
                    i8 = i56 + 1;
                    if (strC.charAt(i56) < 55296) {
                        break;
                    }
                    i56 = i8;
                }
                i56 = i8;
            }
            i2 = i56 + 1;
            int iCharAt8 = strC.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i7 = i2 + 1;
                    cCharAt = strC.charAt(i2);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i2 = i7;
                }
                iCharAt8 = i57 | (cCharAt << i58);
                i2 = i7;
            }
            i3 = (iCharAt * 2) + iCharAt5;
            i4 = iCharAt6;
            i5 = iCharAt7;
            i6 = iCharAt8;
            iArr = new int[iCharAt8 + iCharAt3 + iCharAt];
        }
        Unsafe unsafe = o;
        Object[] objArrB = mc2Var.b();
        Class<?> cls = mc2Var.a().getClass();
        int[] iArr2 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 * 2];
        int i59 = i6 + iCharAt3;
        int i60 = 0;
        int i61 = 0;
        int i62 = i6;
        int i63 = i59;
        while (i2 < length) {
            int i64 = i2 + 1;
            int iCharAt9 = strC.charAt(i2);
            if (iCharAt9 >= c) {
                int i65 = iCharAt9 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i32 = i66 + 1;
                    cCharAt11 = strC.charAt(i66);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i65 |= (cCharAt11 & 8191) << i67;
                    i67 += 13;
                    i66 = i32;
                }
                iCharAt9 = i65 | (cCharAt11 << i67);
                i15 = i32;
            } else {
                i15 = i64;
            }
            int i68 = i15 + 1;
            int iCharAt10 = strC.charAt(i15);
            if (iCharAt10 >= c) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt10 = strC.charAt(i70);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i69 |= (cCharAt10 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                }
                iCharAt10 = i69 | (cCharAt10 << i71);
                i16 = i31;
            } else {
                i16 = i68;
            }
            int i72 = iCharAt10 & 255;
            if ((iCharAt10 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i73 = length;
            if (i72 >= 51) {
                int i74 = i16 + 1;
                int iCharAt11 = strC.charAt(i16);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i75 = iCharAt11 & 8191;
                    int i76 = 13;
                    while (true) {
                        i30 = i74 + 1;
                        cCharAt9 = strC.charAt(i74);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i75 |= (cCharAt9 & 8191) << i76;
                        i76 += 13;
                        i74 = i30;
                        c2 = 55296;
                    }
                    iCharAt11 = i75 | (cCharAt9 << i76);
                    i74 = i30;
                }
                int i77 = i72 - 51;
                i17 = iCharAt;
                if (i77 != 9 && i77 != 17) {
                    if (i77 == 12 && (tdb.saneness(mc2Var.d(), 1) || (iCharAt10 & 2048) != 0)) {
                        i27 = i3 + 1;
                        objArr2[((i61 / 3) * 2) + 1] = objArrB[i3];
                    }
                    i28 = iCharAt11 * 2;
                    obj = objArrB[i28];
                    if (obj instanceof Field) {
                        fieldA2 = (Field) obj;
                    } else {
                        fieldA2 = a((Class) cls, (String) obj);
                        objArrB[i28] = fieldA2;
                        iArr[i63] = i61;
                        i63++;
                    }
                    objArr = objArrB;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA2);
                    i29 = i28 + 1;
                    obj2 = objArr[i29];
                    if (obj2 instanceof Field) {
                        fieldA3 = (Field) obj2;
                    } else {
                        fieldA3 = a((Class) cls, (String) obj2);
                        objArr[i29] = fieldA3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA3);
                    i20 = iObjectFieldOffset3;
                    i18 = i3;
                    iCharAt10 = iCharAt10;
                    i19 = i74;
                } else {
                    i27 = i3 + 1;
                    objArr2[((i61 / 3) * 2) + 1] = objArrB[i3];
                }
                i3 = i27;
                i28 = iCharAt11 * 2;
                obj = objArrB[i28];
                if (obj instanceof Field) {
                    fieldA2 = (Field) obj;
                } else {
                    fieldA2 = a((Class) cls, (String) obj);
                    objArrB[i28] = fieldA2;
                    iArr[i63] = i61;
                    i63++;
                }
                objArr = objArrB;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldA2);
                i29 = i28 + 1;
                obj2 = objArr[i29];
                if (obj2 instanceof Field) {
                    fieldA3 = (Field) obj2;
                } else {
                    fieldA3 = a((Class) cls, (String) obj2);
                    objArr[i29] = fieldA3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA3);
                i20 = iObjectFieldOffset4;
                i18 = i3;
                iCharAt10 = iCharAt10;
                i19 = i74;
            } else {
                i17 = iCharAt;
                objArr = objArrB;
                int i78 = i3 + 1;
                Field fieldA4 = a((Class) cls, (String) objArr[i3]);
                if (i72 == 9 || i72 == 17) {
                    i18 = i78;
                    objArr2[((i61 / 3) * 2) + 1] = fieldA4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        i23 = i3 + 2;
                        objArr2[((i61 / 3) * 2) + 1] = objArr[i78];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        i18 = i78;
                        if (mc2Var.d() == 1 || (iCharAt10 & 2048) != 0) {
                            i23 = i3 + 2;
                            objArr2[((i61 / 3) * 2) + 1] = objArr[i18];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                        if ((iCharAt10 & 4096) != 0 || i72 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i19 = i16;
                            i20 = iObjectFieldOffset;
                        } else {
                            i19 = i16 + 1;
                            int iCharAt12 = strC.charAt(i16);
                            if (iCharAt12 >= 55296) {
                                int i79 = iCharAt12 & 8191;
                                int i80 = 13;
                                while (true) {
                                    i22 = i19 + 1;
                                    cCharAt8 = strC.charAt(i19);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i79 |= (cCharAt8 & 8191) << i80;
                                    i80 += 13;
                                    i19 = i22;
                                }
                                iCharAt12 = i79 | (cCharAt8 << i80);
                                i19 = i22;
                            }
                            int i81 = (iCharAt12 / 32) + (i17 * 2);
                            Object obj3 = objArr[i81];
                            if (obj3 instanceof Field) {
                                fieldA = (Field) obj3;
                            } else {
                                fieldA = a((Class) cls, (String) obj3);
                                objArr[i81] = fieldA;
                            }
                            strC = strC;
                            i21 = iCharAt12 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA);
                            i20 = iObjectFieldOffset;
                        }
                        int i82 = i61 + 1;
                        iArr2[i61] = iCharAt9;
                        int i83 = i61 + 2;
                        int i84 = iObjectFieldOffset2;
                        if ((iCharAt10 & 512) != 0) {
                            i24 = 536870912;
                        } else {
                            i24 = 0;
                        }
                        int i85 = i24;
                        if ((iCharAt10 & 256) != 0) {
                            i25 = 268435456;
                        } else {
                            i25 = 0;
                        }
                        int i86 = i85 | i25;
                        if ((iCharAt10 & 2048) != 0) {
                            i26 = Integer.MIN_VALUE;
                        } else {
                            i26 = 0;
                        }
                        iArr2[i82] = i86 | i26 | (i72 << 20) | i20;
                        i61 += 3;
                        iArr2[i83] = (i21 << 20) | i84;
                        i2 = i19;
                        objArrB = objArr;
                        strC = strC;
                        i3 = i18;
                        length = i73;
                        iCharAt = i17;
                        c = 55296;
                    } else if (i72 == 50) {
                        int i87 = i62 + 1;
                        iArr[i62] = i61;
                        int i88 = (i61 / 3) * 2;
                        i18 = i3 + 2;
                        objArr2[i88] = objArr[i78];
                        if ((iCharAt10 & 2048) != 0) {
                            objArr2[i88 + 1] = objArr[i18];
                            i18 = i3 + 3;
                        }
                        i62 = i87;
                    } else {
                        i18 = i78;
                    }
                    i18 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                    if ((iCharAt10 & 4096) != 0) {
                    }
                    iObjectFieldOffset2 = 1048575;
                    i19 = i16;
                    i20 = iObjectFieldOffset;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                if ((iCharAt10 & 4096) != 0) {
                }
                iObjectFieldOffset2 = 1048575;
                i19 = i16;
                i20 = iObjectFieldOffset;
            }
            i21 = 0;
            int i89 = i61 + 1;
            iArr2[i61] = iCharAt9;
            int i810 = i61 + 2;
            int i811 = iObjectFieldOffset2;
            if ((iCharAt10 & 512) != 0) {
                i24 = 536870912;
            } else {
                i24 = 0;
            }
            int i812 = i24;
            if ((iCharAt10 & 256) != 0) {
                i25 = 268435456;
            } else {
                i25 = 0;
            }
            int i813 = i812 | i25;
            if ((iCharAt10 & 2048) != 0) {
                i26 = Integer.MIN_VALUE;
            } else {
                i26 = 0;
            }
            iArr2[i89] = i813 | i26 | (i72 << 20) | i20;
            i61 += 3;
            iArr2[i810] = (i21 << 20) | i811;
            i2 = i19;
            objArrB = objArr;
            strC = strC;
            i3 = i18;
            length = i73;
            iCharAt = i17;
            c = 55296;
        }
        return new jf1(iArr2, objArr2, i4, i5, mc2Var.a(), iArr, i6, i59, bubblesVar, salmiVar, odilleVar, archipelagicVar, imparkationVar);
    }

    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, long j, fh fhVar) throws x81 {
        byte[] bArr2;
        fh fhVar2;
        int i4;
        Unsafe unsafe = o;
        Object objB = b(i3);
        Object object = unsafe.getObject(obj, j);
        if (((ferrovanadium) this.m).beachfront(object)) {
            cd1 cd1VarSaneness = ((ferrovanadium) this.m).saneness();
            ((ferrovanadium) this.m).dern(cd1VarSaneness, object);
            unsafe.putObject(obj, j, cd1VarSaneness);
            object = cd1VarSaneness;
        }
        yc1 yc1VarWireman = ((ferrovanadium) this.m).wireman(objB);
        cd1 cd1VarMarial = ((ferrovanadium) this.m).marial(object);
        int iDovishness = plench.dovishness(bArr, i, fhVar);
        int i5 = fhVar.a;
        if (i5 >= 0 && i5 <= i2 - iDovishness) {
            int i6 = i5 + iDovishness;
            Object obj2 = yc1VarWireman.b;
            Object obj3 = yc1VarWireman.d;
            while (iDovishness < i6) {
                int iMarial = iDovishness + 1;
                int i7 = bArr[iDovishness];
                if (i7 < 0) {
                    iMarial = plench.marial(i7, bArr, iMarial, fhVar);
                    i7 = fhVar.a;
                }
                int i8 = iMarial;
                int i9 = i7 >>> 3;
                int i10 = i7 & 7;
                if (i9 != 1) {
                    if (i9 == 2) {
                        ib3 ib3Var = yc1VarWireman.c;
                        if (i10 == ib3Var.b) {
                            byte[] bArr3 = bArr;
                            int i11 = i2;
                            fh fhVar3 = fhVar;
                            iDovishness = a(bArr3, i8, i11, ib3Var, yc1VarWireman.d.getClass(), fhVar3);
                            obj3 = fhVar3.c;
                            i2 = i11;
                            bArr = bArr3;
                        }
                    }
                    bArr2 = bArr;
                    i4 = i2;
                    fhVar2 = fhVar;
                } else {
                    bArr2 = bArr;
                    int i12 = i2;
                    fhVar2 = fhVar;
                    ib3 ib3Var2 = yc1VarWireman.a;
                    if (i10 == ib3Var2.b) {
                        i4 = i12;
                        iDovishness = a(bArr2, i8, i4, ib3Var2, (Class) null, fhVar2);
                        obj2 = fhVar2.c;
                    } else {
                        i4 = i12;
                    }
                    bArr = bArr2;
                    i2 = i4;
                    fhVar = fhVar2;
                }
                iDovishness = plench.saneness(i7, bArr2, i8, i4, fhVar2);
                bArr = bArr2;
                i2 = i4;
                fhVar = fhVar2;
            }
            if (iDovishness == i6) {
                cd1VarMarial.put(obj2, obj3);
                return i6;
            }
            throw new x81("Failed to parse the message.");
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int a(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, ads_mobile_sdk.fh r33) throws ads_mobile_sdk.x81 {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jf1.a(java.lang.Object, byte[], int, int, int, ads_mobile_sdk.fh):int");
    }

    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, fh fhVar) throws x81 {
        Unsafe unsafe = o;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(plench.attabal(i, bArr)));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(plench.graveside(i, bArr)));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iPreprohormone = plench.preprohormone(bArr, i, fhVar);
                unsafe.putObject(obj, j, Long.valueOf(fhVar.b));
                unsafe.putInt(obj, j2, i4);
                return iPreprohormone;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iDovishness = plench.dovishness(bArr, i, fhVar);
                unsafe.putObject(obj, j, Integer.valueOf(fhVar.a));
                unsafe.putInt(obj, j2, i4);
                return iDovishness;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(plench.molybdenite(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(plench.apical(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iPreprohormone2 = plench.preprohormone(bArr, i, fhVar);
                unsafe.putObject(obj, j, Boolean.valueOf(fhVar.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iPreprohormone2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iDovishness2 = plench.dovishness(bArr, i, fhVar);
                int i13 = fhVar.a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !t63.a(bArr, iDovishness2, iDovishness2 + i13)) {
                        throw x81.a();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iDovishness2, i13, StandardCharsets.UTF_8));
                    iDovishness2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iDovishness2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objB = b(obj, i4, i8);
                int iCompetently = plench.competently(objB, c(i8), bArr, i, i2, fhVar);
                a(obj, i4, i8, objB);
                return iCompetently;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iTaiyuan = plench.taiyuan(bArr, i, fhVar);
                unsafe.putObject(obj, j, fhVar.c);
                unsafe.putInt(obj, j2, i4);
                return iTaiyuan;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iDovishness3 = plench.dovishness(bArr, i, fhVar);
                int i14 = fhVar.a;
                monofuel monofuelVarA = a(i8);
                if (monofuelVarA != null && !monofuelVarA.a(i14)) {
                    f(obj).a(i3, Long.valueOf(i14));
                    return iDovishness3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return iDovishness3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iDovishness4 = plench.dovishness(bArr, i, fhVar);
                unsafe.putObject(obj, j, Integer.valueOf(hr.b(fhVar.a)));
                unsafe.putInt(obj, j2, i4);
                return iDovishness4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iPreprohormone3 = plench.preprohormone(bArr, i, fhVar);
                unsafe.putObject(obj, j, Long.valueOf(hr.a(fhVar.b)));
                unsafe.putInt(obj, j2, i4);
                return iPreprohormone3;
            case 68:
                if (i5 == 3) {
                    Object objB2 = b(obj, i4, i8);
                    int iBeachfront = plench.beachfront(objB2, c(i8), bArr, i, i2, (i3 & (-8)) | 4, fhVar);
                    a(obj, i4, i8, objB2);
                    return iBeachfront;
                }
                break;
        }
        return i;
    }

    public final void a(Object obj, long j, gutturalization gutturalizationVar, attraction attractionVar, vf0 vf0Var) throws w81 {
        int iR;
        prescient prescientVarSaneness = ((iridectome) this.k).saneness(obj, j);
        ir irVar = (ir) gutturalizationVar;
        int i = irVar.b;
        if ((i & 7) == 3) {
            do {
                xm0 xm0VarA = attractionVar.a();
                irVar.a(xm0VarA, attractionVar, vf0Var);
                attractionVar.c(xm0VarA);
                prescientVarSaneness.add(xm0VarA);
                if (irVar.a.b() || irVar.d != 0) {
                    return;
                } else {
                    iR = irVar.a.r();
                }
            } while (iR == i);
            irVar.d = iR;
            return;
        }
        int i2 = x81.b;
        throw new w81();
    }

    public final void a(Object obj, int i, gutturalization gutturalizationVar, attraction attractionVar, vf0 vf0Var) throws x81 {
        int iR;
        prescient prescientVarSaneness = ((iridectome) this.k).saneness(obj, i & 1048575);
        ir irVar = (ir) gutturalizationVar;
        int i2 = irVar.b;
        if ((i2 & 7) == 2) {
            do {
                xm0 xm0VarA = attractionVar.a();
                irVar.b(xm0VarA, attractionVar, vf0Var);
                attractionVar.c(xm0VarA);
                prescientVarSaneness.add(xm0VarA);
                if (irVar.a.b() || irVar.d != 0) {
                    return;
                } else {
                    iR = irVar.a.r();
                }
            } while (iR == i2);
            irVar.d = iR;
            return;
        }
        int i3 = x81.b;
        throw new w81();
    }

    public final void a(int i, gutturalization gutturalizationVar, Object obj) throws w81 {
        if ((536870912 & i) != 0) {
            ir irVar = (ir) gutturalizationVar;
            irVar.b(2);
            n53.c.a(i & 1048575, obj, irVar.a.q());
            return;
        }
        if (this.f) {
            ir irVar2 = (ir) gutturalizationVar;
            irVar2.b(2);
            n53.c.a(i & 1048575, obj, irVar2.a.p());
            return;
        }
        ir irVar3 = (ir) gutturalizationVar;
        irVar3.b(2);
        n53.c.a(i & 1048575, obj, irVar3.a.d());
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    public final int a(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void a(Object obj, int i, int i2, Object obj2) {
        o.putObject(obj, this.a[i2 + 1] & 1048575, obj2);
        c(obj, i, i2);
    }

    @Override // saneness.attraction
    public final void a(Object obj, vavasour vavasourVar) {
        vavasourVar.getClass();
        b(obj, vavasourVar);
    }

    public static int a(Object obj, long j) {
        return ((Integer) n53.c.g(obj, j)).intValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, fh fhVar) {
        int iMerc;
        Unsafe unsafe = o;
        j jVar = (j) ((prescient) unsafe.getObject(obj, j2));
        boolean zB = jVar.b();
        j jVar2 = jVar;
        if (!zB) {
            prescient prescientVarA = jVar.a(jVar.size() * 2);
            unsafe.putObject(obj, j2, prescientVarA);
            jVar2 = prescientVarA;
        }
        j jVar3 = jVar2;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return plench.kowloon(bArr, i, jVar3, fhVar);
                }
                if (i5 == 1) {
                    return plench.arytenoidectomy(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return plench.cord(bArr, i, jVar3, fhVar);
                }
                if (i5 == 5) {
                    return plench.cuirassed(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return plench.supplicat(bArr, i, jVar3, fhVar);
                }
                if (i5 == 0) {
                    return plench.polder(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return plench.sealless(bArr, i, jVar3, fhVar);
                }
                if (i5 == 0) {
                    return plench.merc(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return plench.gintrap(bArr, i, jVar3, fhVar);
                }
                if (i5 == 1) {
                    return plench.rotuma(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return plench.polloi(bArr, i, jVar3, fhVar);
                }
                if (i5 == 5) {
                    return plench.adultoid(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return plench.cutely(bArr, i, jVar3, fhVar);
                }
                if (i5 == 0) {
                    return plench.wireman(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return plench.kattegat(i3, bArr, i, i2, jVar3, fhVar);
                    }
                    return plench.restrictive(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return plench.impassible(c(i6), i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return plench.formularize(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iMerc = plench.merc(i3, bArr, i, i2, jVar3, fhVar);
                    }
                    return i;
                }
                iMerc = plench.sealless(bArr, i, jVar3, fhVar);
                yk2.a(obj, i4, jVar3, a(i6), null, this.l);
                return iMerc;
            case 33:
            case 47:
                if (i5 == 2) {
                    return plench.stratoscope(bArr, i, jVar3, fhVar);
                }
                if (i5 == 0) {
                    return plench.trm(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return plench.oilcan(bArr, i, jVar3, fhVar);
                }
                if (i5 == 0) {
                    return plench.yemenite(i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return plench.impromptu(c(i6), i3, bArr, i, i2, jVar3, fhVar);
                }
                return i;
            default:
                return i;
        }
    }
}
