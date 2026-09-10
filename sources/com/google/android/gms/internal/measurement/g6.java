package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import com.ironsource.C0375hc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23504a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23505b;

    public g6(int i10) {
        this.f23505b = i10;
    }

    public static a6 c(d8 d8Var, List list) {
        k6 k6Var = k6.ADD;
        yg.f(2, "FN", list);
        b6 b6VarE = ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(0));
        b6 b6VarE2 = ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(1));
        if (!(b6VarE2 instanceof m1)) {
            throw new IllegalArgumentException(defpackage.e.n("FN requires an ArrayValue of parameter names found ", b6VarE2.getClass().getCanonicalName()));
        }
        List listN = ((m1) b6VarE2).n();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new a6(b6VarE.zzc(), (ArrayList) listN, arrayList, d8Var);
    }

    public static boolean d(b6 b6Var, b6 b6Var2) {
        if (b6Var instanceof x5) {
            b6Var = new e6(b6Var.zzc());
        }
        if (b6Var2 instanceof x5) {
            b6Var2 = new e6(b6Var2.zzc());
        }
        if ((b6Var instanceof e6) && (b6Var2 instanceof e6)) {
            return ((e6) b6Var).f23417a.compareTo(((e6) b6Var2).f23417a) < 0;
        }
        double dDoubleValue = b6Var.zzd().doubleValue();
        double dDoubleValue2 = b6Var2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static b6 e(j6 j6Var, b6 b6Var, b6 b6Var2) {
        if (b6Var instanceof Iterable) {
            return g(j6Var, ((Iterable) b6Var).iterator(), b6Var2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(b6 b6Var, b6 b6Var2) {
        if (b6Var.getClass().equals(b6Var2.getClass())) {
            if ((b6Var instanceof f6) || (b6Var instanceof z5)) {
                return true;
            }
            if (b6Var instanceof o3) {
                return (Double.isNaN(b6Var.zzd().doubleValue()) || Double.isNaN(b6Var2.zzd().doubleValue()) || b6Var.zzd().doubleValue() != b6Var2.zzd().doubleValue()) ? false : true;
            }
            if (b6Var instanceof e6) {
                return b6Var.zzc().equals(b6Var2.zzc());
            }
            if (b6Var instanceof c2) {
                return b6Var.zze().equals(b6Var2.zze());
            }
            return b6Var == b6Var2;
        }
        if (((b6Var instanceof f6) || (b6Var instanceof z5)) && ((b6Var2 instanceof f6) || (b6Var2 instanceof z5))) {
            return true;
        }
        boolean z10 = b6Var instanceof o3;
        if (z10 && (b6Var2 instanceof e6)) {
            return f(b6Var, new o3(b6Var2.zzd()));
        }
        boolean z11 = b6Var instanceof e6;
        if (z11 && (b6Var2 instanceof o3)) {
            return f(new o3(b6Var.zzd()), b6Var2);
        }
        if (b6Var instanceof c2) {
            return f(new o3(b6Var.zzd()), b6Var2);
        }
        if (b6Var2 instanceof c2) {
            return f(b6Var, new o3(b6Var2.zzd()));
        }
        if ((z11 || z10) && (b6Var2 instanceof x5)) {
            return f(b6Var, new e6(b6Var2.zzc()));
        }
        if ((b6Var instanceof x5) && ((b6Var2 instanceof e6) || (b6Var2 instanceof o3))) {
            return f(new e6(b6Var.zzc()), b6Var2);
        }
        return false;
    }

    public static b6 g(j6 j6Var, Iterator it, b6 b6Var) {
        d8 d8VarD;
        if (it != null) {
            while (it.hasNext()) {
                b6 b6Var2 = (b6) it.next();
                switch (j6Var.f23616a) {
                    case 0:
                        d8VarD = j6Var.f23617b.d();
                        String str = j6Var.f23618c;
                        d8VarD.g(str, b6Var2);
                        ((HashMap) d8VarD.f23390e).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        d8VarD = j6Var.f23617b.d();
                        d8VarD.g(j6Var.f23618c, b6Var2);
                        break;
                    default:
                        d8VarD = j6Var.f23617b;
                        d8VarD.g(j6Var.f23618c, b6Var2);
                        break;
                }
                b6 b6VarC = d8VarD.c((m1) b6Var);
                if (b6VarC instanceof t2) {
                    t2 t2Var = (t2) b6VarC;
                    String str2 = t2Var.f23980b;
                    if ("break".equals(str2)) {
                        return b6.S8;
                    }
                    if ("return".equals(str2)) {
                        return t2Var;
                    }
                }
            }
        }
        return b6.S8;
    }

    public static boolean h(b6 b6Var, b6 b6Var2) {
        if (b6Var instanceof x5) {
            b6Var = new e6(b6Var.zzc());
        }
        if (b6Var2 instanceof x5) {
            b6Var2 = new e6(b6Var2.zzc());
        }
        return (((b6Var instanceof e6) && (b6Var2 instanceof e6)) || !(Double.isNaN(b6Var.zzd().doubleValue()) || Double.isNaN(b6Var2.zzd().doubleValue()))) && !d(b6Var2, b6Var);
    }

    /* JADX WARN: Code duplicated, block: B:306:0x091f  */
    /* JADX WARN: Code duplicated, block: B:308:0x092a  */
    /* JADX WARN: Code duplicated, block: B:311:0x0937  */
    /* JADX WARN: Code duplicated, block: B:502:0x0934 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x090f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x093e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x093e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:? A[SYNTHETIC] */
    public final b6 a(String str, d8 d8Var, ArrayList arrayList) {
        boolean zF;
        boolean zF2;
        b6 b6VarC;
        t2 t2Var;
        String str2;
        b6 e6Var;
        b6 b6VarE;
        b6 b6VarE2;
        String str3;
        int i10 = 0;
        switch (this.f23505b) {
            case 0:
                k6 k6Var = k6.ADD;
                switch (yg.i(str).ordinal()) {
                    case 4:
                        yg.c(2, "BITWISE_AND", arrayList);
                        return new o3(Double.valueOf(yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue()) & yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue())));
                    case 5:
                        yg.c(2, "BITWISE_LEFT_SHIFT", arrayList);
                        return new o3(Double.valueOf(yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue()) << ((int) (((long) yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case 6:
                        yg.c(1, "BITWISE_NOT", arrayList);
                        return new o3(Double.valueOf(~yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue())));
                    case 7:
                        yg.c(2, "BITWISE_OR", arrayList);
                        return new o3(Double.valueOf(yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue()) | yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue())));
                    case 8:
                        yg.c(2, "BITWISE_RIGHT_SHIFT", arrayList);
                        return new o3(Double.valueOf(yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue()) >> ((int) (((long) yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case 9:
                        yg.c(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                        return new o3(Double.valueOf((((long) yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue())) & 4294967295L) >>> ((int) (((long) yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case 10:
                        yg.c(2, "BITWISE_XOR", arrayList);
                        return new o3(Double.valueOf(yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue()) ^ yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                yg.c(2, yg.i(str).name(), arrayList);
                b6 b6VarE3 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                b6 b6VarE4 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                int iOrdinal = yg.i(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zF2 = f(b6VarE3, b6VarE4);
                    } else if (iOrdinal == 42) {
                        zF = d(b6VarE3, b6VarE4);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zF = d(b6VarE4, b6VarE3);
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                zF = h(b6VarE4, b6VarE3);
                                break;
                            case 39:
                                zF = yg.j(b6VarE3, b6VarE4);
                                break;
                            case 40:
                                zF2 = yg.j(b6VarE3, b6VarE4);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        zF = h(b6VarE3, b6VarE4);
                    }
                    zF = !zF2;
                } else {
                    zF = f(b6VarE3, b6VarE4);
                }
                return zF ? b6.X8 : b6.Y8;
            case 2:
                k6 k6Var2 = k6.ADD;
                int iOrdinal2 = yg.i(str).ordinal();
                if (iOrdinal2 == 2) {
                    yg.c(3, "APPLY", arrayList);
                    b6 b6Var = (b6) arrayList.get(0);
                    h6 h6Var = (h6) d8Var.f23388c;
                    h6 h6Var2 = (h6) d8Var.f23388c;
                    b6 b6VarE5 = h6Var.e(d8Var, b6Var);
                    String strZzc = h6Var2.e(d8Var, (b6) arrayList.get(1)).zzc();
                    b6 b6VarE6 = h6Var2.e(d8Var, (b6) arrayList.get(2));
                    if (!(b6VarE6 instanceof m1)) {
                        throw new IllegalArgumentException(defpackage.e.n("Function arguments for Apply are not a list found ", b6VarE6.getClass().getCanonicalName()));
                    }
                    if (strZzc.isEmpty()) {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                    return b6VarE5.m(strZzc, d8Var, (ArrayList) ((m1) b6VarE6).n());
                }
                if (iOrdinal2 == 15) {
                    yg.c(0, "BREAK", arrayList);
                    return b6.U8;
                }
                if (iOrdinal2 == 25) {
                    return c(d8Var, arrayList);
                }
                if (iOrdinal2 == 41) {
                    yg.f(2, "IF", arrayList);
                    b6 b6Var2 = (b6) arrayList.get(0);
                    h6 h6Var3 = (h6) d8Var.f23388c;
                    h6 h6Var4 = (h6) d8Var.f23388c;
                    b6 b6VarE7 = h6Var3.e(d8Var, b6Var2);
                    b6 b6VarE8 = h6Var4.e(d8Var, (b6) arrayList.get(1));
                    b6 b6VarE9 = arrayList.size() > 2 ? h6Var4.e(d8Var, (b6) arrayList.get(2)) : null;
                    b6 b6Var3 = b6.S8;
                    b6 b6VarC2 = b6VarE7.zze().booleanValue() ? d8Var.c((m1) b6VarE8) : b6VarE9 != null ? d8Var.c((m1) b6VarE9) : b6Var3;
                    return true != (b6VarC2 instanceof t2) ? b6Var3 : b6VarC2;
                }
                if (iOrdinal2 == 54) {
                    return new m1(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return b6.W8;
                    }
                    yg.c(1, "RETURN", arrayList);
                    return new t2("return", ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        yg.f(2, "DEFINE_FUNCTION", arrayList);
                        a6 a6VarC = c(d8Var, arrayList);
                        String str4 = a6VarC.f23836a;
                        if (str4 == null) {
                            d8Var.f("", a6VarC);
                            return a6VarC;
                        }
                        d8Var.f(str4, a6VarC);
                        return a6VarC;
                    }
                    if (iOrdinal2 == 60) {
                        yg.c(3, "SWITCH", arrayList);
                        b6 b6Var4 = (b6) arrayList.get(0);
                        h6 h6Var5 = (h6) d8Var.f23388c;
                        h6 h6Var6 = (h6) d8Var.f23388c;
                        b6 b6VarE10 = h6Var5.e(d8Var, b6Var4);
                        b6 b6VarE11 = h6Var6.e(d8Var, (b6) arrayList.get(1));
                        b6 b6VarE12 = h6Var6.e(d8Var, (b6) arrayList.get(2));
                        if (!(b6VarE11 instanceof m1)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if (!(b6VarE12 instanceof m1)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        m1 m1Var = (m1) b6VarE11;
                        m1 m1Var2 = (m1) b6VarE12;
                        boolean z10 = false;
                        for (int i11 = 0; i11 < m1Var.q(); i11++) {
                            if (z10 || b6VarE10.equals(h6Var6.e(d8Var, m1Var.r(i11)))) {
                                b6 b6VarE13 = h6Var6.e(d8Var, m1Var2.r(i11));
                                if (b6VarE13 instanceof t2) {
                                    return ((t2) b6VarE13).f23980b.equals("break") ? b6.S8 : b6VarE13;
                                }
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (m1Var.q() + 1 == m1Var2.q()) {
                            b6 b6VarE14 = h6Var6.e(d8Var, m1Var2.r(m1Var.q()));
                            if (b6VarE14 instanceof t2) {
                                String str5 = ((t2) b6VarE14).f23980b;
                                if (str5.equals("return") || str5.equals("continue")) {
                                    return b6VarE14;
                                }
                            }
                        }
                        return b6.S8;
                    }
                    if (iOrdinal2 == 61) {
                        yg.c(3, "TERNARY", arrayList);
                        b6 b6Var5 = (b6) arrayList.get(0);
                        h6 h6Var7 = (h6) d8Var.f23388c;
                        h6 h6Var8 = (h6) d8Var.f23388c;
                        return h6Var7.e(d8Var, b6Var5).zze().booleanValue() ? h6Var8.e(d8Var, (b6) arrayList.get(1)) : h6Var8.e(d8Var, (b6) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return d8Var.d().c(new m1(arrayList));
                        case 12:
                            yg.c(0, "BREAK", arrayList);
                            return b6.V8;
                        case 13:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return b6.S8;
                }
                b6 b6VarE15 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                return b6VarE15 instanceof m1 ? d8Var.c((m1) b6VarE15) : b6.S8;
            case 3:
                k6 k6Var3 = k6.ADD;
                int iOrdinal3 = yg.i(str).ordinal();
                if (iOrdinal3 == 1) {
                    yg.c(2, "AND", arrayList);
                    b6 b6VarE16 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                    if (b6VarE16.zze().booleanValue()) {
                        return ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                    }
                    return b6VarE16;
                }
                if (iOrdinal3 == 47) {
                    yg.c(1, "NOT", arrayList);
                    return new c2(Boolean.valueOf(!((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zze().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    b(str);
                    throw null;
                }
                yg.c(2, "OR", arrayList);
                b6 b6VarE17 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                if (b6VarE17.zze().booleanValue()) {
                    return b6VarE17;
                }
                return ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
            case 4:
                k6 k6Var4 = k6.ADD;
                int iOrdinal4 = yg.i(str).ordinal();
                if (iOrdinal4 != 65) {
                    switch (iOrdinal4) {
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                            yg.c(3, "FOR_IN", arrayList);
                            if (!(arrayList.get(0) instanceof e6)) {
                                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                            }
                            String strZzc2 = ((b6) arrayList.get(0)).zzc();
                            b6 b6VarE18 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                            b6 b6VarE19 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(2));
                            Iterator itZzf = b6VarE18.zzf();
                            if (itZzf != null) {
                                while (itZzf.hasNext()) {
                                    d8Var.g(strZzc2, (b6) itZzf.next());
                                    b6 b6VarC3 = d8Var.c((m1) b6VarE19);
                                    if (b6VarC3 instanceof t2) {
                                        t2Var = (t2) b6VarC3;
                                        String str6 = t2Var.f23980b;
                                        if ("break".equals(str6)) {
                                            return b6.S8;
                                        }
                                        if ("return".equals(str6)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return b6.S8;
                        case 27:
                            yg.c(3, "FOR_IN_CONST", arrayList);
                            if (arrayList.get(0) instanceof e6) {
                                return g(new j6(d8Var, ((b6) arrayList.get(0)).zzc(), 0), ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzf(), ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                            yg.c(3, "FOR_IN_LET", arrayList);
                            if (!(arrayList.get(0) instanceof e6)) {
                                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                            }
                            String strZzc3 = ((b6) arrayList.get(0)).zzc();
                            b6 b6VarE20 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                            b6 b6VarE21 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(2));
                            Iterator itZzf2 = b6VarE20.zzf();
                            if (itZzf2 != null) {
                                while (itZzf2.hasNext()) {
                                    b6 b6Var6 = (b6) itZzf2.next();
                                    d8 d8VarD = d8Var.d();
                                    d8VarD.g(strZzc3, b6Var6);
                                    b6 b6VarC4 = d8VarD.c((m1) b6VarE21);
                                    if (b6VarC4 instanceof t2) {
                                        t2Var = (t2) b6VarC4;
                                        String str7 = t2Var.f23980b;
                                        if ("break".equals(str7)) {
                                            return b6.S8;
                                        }
                                        if ("return".equals(str7)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return b6.S8;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                            yg.c(4, "FOR_LET", arrayList);
                            b6 b6Var7 = (b6) arrayList.get(0);
                            h6 h6Var9 = (h6) d8Var.f23388c;
                            h6 h6Var10 = (h6) d8Var.f23388c;
                            b6 b6VarE22 = h6Var9.e(d8Var, b6Var7);
                            if (!(b6VarE22 instanceof m1)) {
                                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                            }
                            m1 m1Var3 = (m1) b6VarE22;
                            b6 b6Var8 = (b6) arrayList.get(1);
                            b6 b6Var9 = (b6) arrayList.get(2);
                            b6 b6VarE23 = h6Var10.e(d8Var, (b6) arrayList.get(3));
                            d8 d8VarD2 = d8Var.d();
                            for (int i12 = 0; i12 < m1Var3.q(); i12++) {
                                String strZzc4 = m1Var3.r(i12).zzc();
                                d8VarD2.f(strZzc4, d8Var.h(strZzc4));
                            }
                            while (h6Var10.e(d8Var, b6Var8).zze().booleanValue()) {
                                b6 b6VarC5 = d8Var.c((m1) b6VarE23);
                                if (b6VarC5 instanceof t2) {
                                    t2 t2Var2 = (t2) b6VarC5;
                                    String str8 = t2Var2.f23980b;
                                    if ("break".equals(str8)) {
                                        return b6.S8;
                                    }
                                    if ("return".equals(str8)) {
                                        return t2Var2;
                                    }
                                }
                                d8 d8VarD3 = d8Var.d();
                                for (int i13 = 0; i13 < m1Var3.q(); i13++) {
                                    String strZzc5 = m1Var3.r(i13).zzc();
                                    d8VarD3.f(strZzc5, d8VarD2.h(strZzc5));
                                }
                                d8VarD3.a(b6Var9);
                                d8VarD2 = d8VarD3;
                            }
                            return b6.S8;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                            yg.c(3, "FOR_OF", arrayList);
                            if (arrayList.get(0) instanceof e6) {
                                return e(new j6(d8Var, ((b6) arrayList.get(0)).zzc(), 2), ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)), ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                        case 31:
                            yg.c(3, "FOR_OF_CONST", arrayList);
                            if (arrayList.get(0) instanceof e6) {
                                return e(new j6(d8Var, ((b6) arrayList.get(0)).zzc(), 0), ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)), ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                        case 32:
                            yg.c(3, "FOR_OF_LET", arrayList);
                            if (arrayList.get(0) instanceof e6) {
                                return e(new j6(d8Var, ((b6) arrayList.get(0)).zzc(), 1), ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)), ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                        default:
                            b(str);
                            throw null;
                    }
                }
                yg.c(4, "WHILE", arrayList);
                b6 b6Var10 = (b6) arrayList.get(0);
                b6 b6Var11 = (b6) arrayList.get(1);
                b6 b6Var12 = (b6) arrayList.get(2);
                b6 b6Var13 = (b6) arrayList.get(3);
                h6 h6Var11 = (h6) d8Var.f23388c;
                h6 h6Var12 = (h6) d8Var.f23388c;
                b6 b6VarE24 = h6Var11.e(d8Var, b6Var13);
                if (!h6Var12.e(d8Var, b6Var12).zze().booleanValue()) {
                    while (h6Var12.e(d8Var, b6Var10).zze().booleanValue()) {
                        b6VarC = d8Var.c((m1) b6VarE24);
                        if (b6VarC instanceof t2) {
                            t2Var = (t2) b6VarC;
                            str2 = t2Var.f23980b;
                            if ("break".equals(str2)) {
                                return b6.S8;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        d8Var.a(b6Var11);
                    }
                    return b6.S8;
                }
                b6 b6VarC6 = d8Var.c((m1) b6VarE24);
                if (!(b6VarC6 instanceof t2)) {
                    while (h6Var12.e(d8Var, b6Var10).zze().booleanValue()) {
                        b6VarC = d8Var.c((m1) b6VarE24);
                        if (b6VarC instanceof t2) {
                            t2Var = (t2) b6VarC;
                            str2 = t2Var.f23980b;
                            if ("break".equals(str2)) {
                                return b6.S8;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        d8Var.a(b6Var11);
                    }
                    return b6.S8;
                }
                t2Var = (t2) b6VarC6;
                String str9 = t2Var.f23980b;
                if ("break".equals(str9)) {
                    return b6.S8;
                }
                if (!"return".equals(str9)) {
                    while (h6Var12.e(d8Var, b6Var10).zze().booleanValue()) {
                        b6VarC = d8Var.c((m1) b6VarE24);
                        if (b6VarC instanceof t2) {
                            t2Var = (t2) b6VarC;
                            str2 = t2Var.f23980b;
                            if ("break".equals(str2)) {
                                return b6.S8;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        d8Var.a(b6Var11);
                    }
                    return b6.S8;
                }
                return t2Var;
            case 5:
                k6 k6Var5 = k6.ADD;
                int iOrdinal5 = yg.i(str).ordinal();
                if (iOrdinal5 == 0) {
                    yg.c(2, "ADD", arrayList);
                    b6 b6VarE25 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                    b6 b6VarE26 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                    e6Var = ((b6VarE25 instanceof x5) || (b6VarE25 instanceof e6) || (b6VarE26 instanceof x5) || (b6VarE26 instanceof e6)) ? new e6(String.valueOf(b6VarE25.zzc()).concat(String.valueOf(b6VarE26.zzc()))) : new o3(Double.valueOf(b6VarE26.zzd().doubleValue() + b6VarE25.zzd().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    yg.c(2, "DIVIDE", arrayList);
                    e6Var = new o3(Double.valueOf(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue() / ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        yg.c(2, "SUBTRACT", arrayList);
                        return new o3(Double.valueOf(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue() + (-((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        yg.c(2, str, arrayList);
                        b6 b6VarE27 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                        d8Var.a((b6) arrayList.get(1));
                        return b6VarE27;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        yg.c(1, str, arrayList);
                        return ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            yg.c(2, "MODULUS", arrayList);
                            e6Var = new o3(Double.valueOf(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue() % ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue()));
                            break;
                        case 45:
                            yg.c(2, "MULTIPLY", arrayList);
                            return new o3(Double.valueOf(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue() * ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue()));
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                            yg.c(1, "NEGATE", arrayList);
                            return new o3(Double.valueOf(-((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return e6Var;
            case 6:
                if (str == null || str.isEmpty() || !d8Var.e(str)) {
                    throw new IllegalArgumentException(defpackage.e.n("Command not found: ", str));
                }
                b6 b6VarH = d8Var.h(str);
                if (b6VarH instanceof p4) {
                    return ((p4) b6VarH).a(d8Var, arrayList);
                }
                throw new IllegalArgumentException(defpackage.e.o("Function ", str, " is not defined"));
            default:
                k6 k6Var6 = k6.ADD;
                int iOrdinal6 = yg.i(str).ordinal();
                if (iOrdinal6 != 3) {
                    if (iOrdinal6 == 14) {
                        yg.f(2, "CONST", arrayList);
                        if (arrayList.size() % 2 != 0) {
                            throw new IllegalArgumentException(l1.d.e(arrayList.size(), "CONST requires an even number of arguments, found "));
                        }
                        while (i10 < arrayList.size() - 1) {
                            b6 b6VarE28 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(i10));
                            if (!(b6VarE28 instanceof e6)) {
                                throw new IllegalArgumentException(defpackage.e.n("Expected string for const name. got ", b6VarE28.getClass().getCanonicalName()));
                            }
                            String str10 = ((e6) b6VarE28).f23417a;
                            d8Var.g(str10, ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(i10 + 1)));
                            ((HashMap) d8Var.f23390e).put(str10, Boolean.TRUE);
                            i10 += 2;
                        }
                        return b6.S8;
                    }
                    if (iOrdinal6 == 24) {
                        yg.f(1, "EXPRESSION_LIST", arrayList);
                        b6 b6VarE29 = b6.S8;
                        while (i10 < arrayList.size()) {
                            b6VarE29 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(i10));
                            if (b6VarE29 instanceof t2) {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                            i10++;
                        }
                        return b6VarE29;
                    }
                    if (iOrdinal6 == 33) {
                        yg.c(1, C0375hc.f28788a, arrayList);
                        b6 b6VarE30 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                        if (b6VarE30 instanceof e6) {
                            return d8Var.h(((e6) b6VarE30).f23417a);
                        }
                        throw new IllegalArgumentException(defpackage.e.n("Expected string for get var. got ", b6VarE30.getClass().getCanonicalName()));
                    }
                    if (iOrdinal6 == 49) {
                        yg.c(0, "NULL", arrayList);
                        return b6.T8;
                    }
                    if (iOrdinal6 == 58) {
                        yg.c(3, "SET_PROPERTY", arrayList);
                        b6 b6Var14 = (b6) arrayList.get(0);
                        h6 h6Var13 = (h6) d8Var.f23388c;
                        h6 h6Var14 = (h6) d8Var.f23388c;
                        b6 b6VarE31 = h6Var13.e(d8Var, b6Var14);
                        b6 b6VarE32 = h6Var14.e(d8Var, (b6) arrayList.get(1));
                        b6VarE2 = h6Var14.e(d8Var, (b6) arrayList.get(2));
                        if (b6VarE31 == b6.S8 || b6VarE31 == b6.T8) {
                            throw new IllegalStateException(l1.d.g("Can't set property ", b6VarE32.zzc(), " of ", b6VarE31.zzc()));
                        }
                        if ((b6VarE31 instanceof m1) && (b6VarE32 instanceof o3)) {
                            ((m1) b6VarE31).s(((o3) b6VarE32).f23794a.intValue(), b6VarE2);
                        } else if (b6VarE31 instanceof x5) {
                            ((x5) b6VarE31).b(b6VarE32.zzc(), b6VarE2);
                        }
                    } else {
                        if (iOrdinal6 == 17) {
                            if (arrayList.isEmpty()) {
                                return new m1();
                            }
                            m1 m1Var4 = new m1();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                b6 b6VarE33 = ((h6) d8Var.f23388c).e(d8Var, (b6) it.next());
                                if (b6VarE33 instanceof t2) {
                                    throw new IllegalStateException("Failed to evaluate array element");
                                }
                                m1Var4.s(i10, b6VarE33);
                                i10++;
                            }
                            return m1Var4;
                        }
                        if (iOrdinal6 == 18) {
                            if (arrayList.isEmpty()) {
                                return new y5();
                            }
                            if (arrayList.size() % 2 != 0) {
                                throw new IllegalArgumentException(l1.d.e(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            }
                            y5 y5Var = new y5();
                            while (i10 < arrayList.size() - 1) {
                                b6 b6VarE34 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(i10));
                                b6 b6VarE35 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(i10 + 1));
                                if ((b6VarE34 instanceof t2) || (b6VarE35 instanceof t2)) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                y5Var.b(b6VarE34.zzc(), b6VarE35);
                                i10 += 2;
                            }
                            return y5Var;
                        }
                        if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                            yg.c(2, "GET_PROPERTY", arrayList);
                            b6 b6VarE36 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                            b6 b6VarE37 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                            if ((b6VarE36 instanceof m1) && yg.h(b6VarE37)) {
                                return ((m1) b6VarE36).r(b6VarE37.zzd().intValue());
                            }
                            if (b6VarE36 instanceof x5) {
                                return ((x5) b6VarE36).zzk(b6VarE37.zzc());
                            }
                            if (b6VarE36 instanceof e6) {
                                if ("length".equals(b6VarE37.zzc())) {
                                    b6VarE = new o3(Double.valueOf(((e6) b6VarE36).f23417a.length()));
                                } else if (yg.h(b6VarE37)) {
                                    double dDoubleValue = b6VarE37.zzd().doubleValue();
                                    String str11 = ((e6) b6VarE36).f23417a;
                                    if (dDoubleValue < str11.length()) {
                                        b6VarE2 = new e6(String.valueOf(str11.charAt(b6VarE37.zzd().intValue())));
                                    }
                                }
                            }
                            return b6.S8;
                        }
                        switch (iOrdinal6) {
                            case 62:
                                yg.c(1, "TYPEOF", arrayList);
                                b6 b6VarE38 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                                if (b6VarE38 instanceof f6) {
                                    str3 = AdError.UNDEFINED_DOMAIN;
                                } else if (b6VarE38 instanceof c2) {
                                    str3 = "boolean";
                                } else if (b6VarE38 instanceof o3) {
                                    str3 = "number";
                                } else if (b6VarE38 instanceof e6) {
                                    str3 = "string";
                                } else if (b6VarE38 instanceof a6) {
                                    str3 = "function";
                                } else {
                                    if ((b6VarE38 instanceof c6) || (b6VarE38 instanceof t2)) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b6VarE38));
                                    }
                                    str3 = "object";
                                }
                                b6VarE = new e6(str3);
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                                yg.c(0, "UNDEFINED", arrayList);
                                return b6.S8;
                            case 64:
                                yg.f(1, "VAR", arrayList);
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    b6 b6VarE39 = ((h6) d8Var.f23388c).e(d8Var, (b6) it2.next());
                                    if (!(b6VarE39 instanceof e6)) {
                                        throw new IllegalArgumentException(defpackage.e.n("Expected string for var name. got ", b6VarE39.getClass().getCanonicalName()));
                                    }
                                    d8Var.g(((e6) b6VarE39).f23417a, b6.S8);
                                }
                                return b6.S8;
                            default:
                                b(str);
                                throw null;
                        }
                    }
                    return b6VarE2;
                }
                yg.c(2, "ASSIGN", arrayList);
                b6 b6VarE40 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                if (!(b6VarE40 instanceof e6)) {
                    throw new IllegalArgumentException(defpackage.e.n("Expected string for assign var. got ", b6VarE40.getClass().getCanonicalName()));
                }
                String str12 = ((e6) b6VarE40).f23417a;
                if (!d8Var.e(str12)) {
                    throw new IllegalArgumentException(defpackage.e.n("Attempting to assign undefined value ", str12));
                }
                b6VarE = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                d8Var.f(str12, b6VarE);
                return b6VarE;
        }
    }

    public final void b(String str) {
        if (!this.f23504a.contains(yg.i(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
