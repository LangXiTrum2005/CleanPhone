package com.smartdigimkt.m3;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static int a(Context context, com.smartdigimkt.w6.f fVar) {
        int iJ = fVar.j();
        return (iJ == 1 || iJ == 4) ? com.smartdigimkt.n8.h.a(context, "myoffer_cta_install_now", com.smartdigimkt.v0.k.f38992h) : com.smartdigimkt.n8.h.a(context, "myoffer_cta_learn_more", com.smartdigimkt.v0.k.f38992h);
    }

    public static boolean b(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        if (fVar == null || aVar == null) {
            return false;
        }
        String strValueOf = String.valueOf(aVar.f39164b);
        strValueOf.getClass();
        if (strValueOf.equals("3")) {
            return !g(fVar, aVar);
        }
        return false;
    }

    public static boolean c(com.smartdigimkt.w6.f fVar) {
        return fVar != null && fVar.v0();
    }

    public static boolean d(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        if (aVar == null || fVar == null) {
            return false;
        }
        String strValueOf = String.valueOf(aVar.f39164b);
        strValueOf.getClass();
        if (strValueOf.equals("1")) {
            return !TextUtils.isEmpty(fVar.k0());
        }
        if (strValueOf.equals("3")) {
            return g(fVar, aVar);
        }
        return false;
    }

    public static boolean e(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        if (fVar != null && aVar != null) {
            String strValueOf = String.valueOf(aVar.f39164b);
            strValueOf.getClass();
            if (strValueOf.equals("4") && (fVar instanceof com.smartdigimkt.w6.l)) {
                boolean z2 = 1 == ((com.smartdigimkt.w6.l) fVar).B0();
                if (aVar.t.D1() == 1 && ((!z2 && aVar.t.m() == 2) || (z2 && aVar.t.r1() == 2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        if (fVar != null && aVar != null) {
            String strValueOf = String.valueOf(aVar.f39164b);
            strValueOf.getClass();
            if (strValueOf.equals("4") && aVar.t.A1() > 0 && (!TextUtils.isEmpty(fVar.s()) || !TextUtils.isEmpty(fVar.w()))) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        if (fVar != null && aVar != null) {
            String strValueOf = String.valueOf(aVar.f39164b);
            strValueOf.getClass();
            switch (strValueOf) {
                case "0":
                case "2":
                case "4":
                    if (!fVar.v0() && fVar.r0() && com.smartdigimkt.r3.d.a(fVar, aVar.t)) {
                        return true;
                    }
                    break;
                case "1":
                    return true;
                case "3":
                    return fVar.h0() == 1 && fVar.r0();
                default:
                    return false;
            }
        }
        return false;
    }

    public static int h(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        com.smartdigimkt.w6.g gVar;
        boolean z2 = false;
        if (aVar != null && (gVar = aVar.t) != null && fVar != null) {
            int i2 = aVar.f39164b;
            int i3 = 4;
            if ((i2 != 3 && i2 != 4) || !gVar.d()) {
                String strK = fVar.k();
                if (aVar.t.P() == 1) {
                    boolean zIsEmpty = TextUtils.isEmpty(strK);
                    int i4 = zIsEmpty ? 2 : 1;
                    boolean z3 = !zIsEmpty;
                    if (!zIsEmpty && !strK.startsWith("http")) {
                        z3 = false;
                        i4 = 3;
                    }
                    if (!z3 || fVar.j() == 2 || fVar.j() == 3) {
                        i3 = i4;
                        z2 = z3;
                    }
                    if (z2 && TextUtils.isEmpty(fVar.q())) {
                        return 5;
                    }
                    return i3;
                }
            }
        }
        return 0;
    }

    public static boolean c(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        com.smartdigimkt.w6.g gVar;
        if (aVar != null && (gVar = aVar.t) != null) {
            String strValueOf = String.valueOf(gVar.Z());
            strValueOf.getClass();
            byte b2 = -1;
            switch (strValueOf.hashCode()) {
                case 48:
                    if (strValueOf.equals("0")) {
                        b2 = 0;
                    }
                    break;
                case 50:
                    if (strValueOf.equals("2")) {
                        b2 = 1;
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (strValueOf.equals("4")) {
                        b2 = 2;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                case 2:
                    if (fVar != null && fVar.r0()) {
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        }
        return false;
    }

    public static boolean b(com.smartdigimkt.w6.f fVar) {
        return fVar != null && fVar.I() == 42;
    }

    public static int a(Context context, int i2) {
        if (i2 != 1 && i2 != 4) {
            return com.smartdigimkt.n8.h.a(context, "myoffer_shake_full_title", com.smartdigimkt.v0.k.f38992h);
        }
        return com.smartdigimkt.n8.h.a(context, "myoffer_shake_full_title_download_type", com.smartdigimkt.v0.k.f38992h);
    }

    public static boolean a(com.smartdigimkt.w6.f fVar) {
        return (TextUtils.isEmpty(fVar.w()) && TextUtils.isEmpty(fVar.g0()) && TextUtils.isEmpty(fVar.r())) ? false : true;
    }

    public static boolean a(com.smartdigimkt.v6.a aVar) {
        return (aVar == null || aVar.t == null || com.smartdigimkt.m6.b.p().a("sensor_deny") || !com.smartdigimkt.t4.a.a().c() || aVar.t.l1() != 1) ? false : true;
    }

    public static int a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        if ((!(fVar instanceof com.smartdigimkt.w6.d) || TextUtils.isEmpty(((com.smartdigimkt.w6.d) fVar).W0())) && fVar != null && aVar != null) {
            boolean zR0 = fVar.r0();
            boolean z2 = (TextUtils.isEmpty(fVar.s()) && TextUtils.isEmpty(fVar.a(fVar.i()))) ? false : true;
            int iN = fVar.N();
            if (iN == 3) {
                return zR0 ? 7 : 8;
            }
            if (iN == 2) {
                return zR0 ? 6 : 5;
            }
            if (zR0 && z2) {
                return 3;
            }
            if (zR0) {
                return 2;
            }
            if (z2) {
                return 1;
            }
        }
        return 0;
    }

    public static int a(com.smartdigimkt.v6.a aVar, Context context) {
        if (aVar == null) {
            return 1;
        }
        com.smartdigimkt.w6.g gVar = aVar.t;
        if (gVar != null && aVar.f39164b == 4) {
            return gVar.D1();
        }
        return com.smartdigimkt.n8.c.K(context);
    }

    public static boolean a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.w6.g gVar, com.smartdigimkt.v3.l lVar, int i2) {
        int i3;
        if (fVar == null || gVar == null || lVar == null || lVar.f39137i == null) {
            return false;
        }
        int iJ = fVar.j();
        if (gVar.h() != 1 || i2 != iJ) {
            return false;
        }
        com.smartdigimkt.v3.a aVar = lVar.f39137i;
        int i4 = i2 == 4 ? gVar.i() : 0;
        if (i2 == 1) {
            i4 = gVar.v0();
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return false;
                }
                if (aVar.f39068n == 0 && ((i3 = aVar.o) == 1 || i3 == 5 || i3 == 6 || i3 == 24 || i3 == 25 || i3 == 40 || i3 == 41)) {
                    return false;
                }
            }
        } else if (aVar.f39068n != 2) {
            return false;
        }
        return true;
    }
}
