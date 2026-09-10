package q4;

import android.graphics.Color;
import defpackage.e;
import i1.o;
import i1.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import n2.a0;
import tj.g;
import v0.i;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(int i10) {
        for (int i11 : i.d(4)) {
            if (e(i11) == i10) {
                return i11;
            }
        }
        throw new IllegalArgumentException(l1.d.e(i10, "Invalid rotation degrees specified: "));
    }

    public static int b(String str) throws NoSuchFieldException {
        String str2;
        for (int i10 : i.d(2)) {
            if (i10 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i10 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i10;
            }
        }
        throw new NoSuchFieldException(e.n("No such Brightness: ", str));
    }

    public static int c(String str) throws NoSuchFieldException {
        for (int i10 : i.d(8)) {
            String str2 = null;
            switch (i10) {
                case 1:
                    break;
                case 2:
                    str2 = "HapticFeedbackType.lightImpact";
                    break;
                case 3:
                    str2 = "HapticFeedbackType.mediumImpact";
                    break;
                case 4:
                    str2 = "HapticFeedbackType.heavyImpact";
                    break;
                case 5:
                    str2 = "HapticFeedbackType.selectionClick";
                    break;
                case 6:
                    str2 = "HapticFeedbackType.successNotification";
                    break;
                case 7:
                    str2 = "HapticFeedbackType.warningNotification";
                    break;
                case 8:
                    str2 = "HapticFeedbackType.errorNotification";
                    break;
                default:
                    throw null;
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i10;
            }
        }
        throw new NoSuchFieldException(e.n("No such HapticFeedbackType: ", str));
    }

    public static int d(String str) throws NoSuchFieldException {
        String str2;
        for (int i10 : i.d(3)) {
            if (i10 == 1) {
                str2 = "SystemSoundType.click";
            } else if (i10 == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i10 != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i10;
            }
        }
        throw new NoSuchFieldException(e.n("No such SoundType: ", str));
    }

    public static /* synthetic */ int e(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 90;
        }
        if (i10 == 3) {
            return 180;
        }
        if (i10 == 4) {
            return 270;
        }
        throw null;
    }

    public static /* synthetic */ boolean f(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static int g(int i10, int i11, List list) {
        return (list.hashCode() + i10) * i11;
    }

    public static ClassCastException h(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String j(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String k(e0 e0Var, Class cls, StringBuilder sb2) {
        sb2.append(e0Var.b(cls));
        return sb2.toString();
    }

    public static HashMap l(Class cls, pc.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map m(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void n(int i10, int i11, int i12, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i10, i11, i12)));
    }

    public static void o(o oVar, a0 a0Var) {
        a0Var.b(new p(oVar));
    }

    public static void p(String str, String str2, String str3) {
        t9.e.c(new tj.a(str, str2, str3));
    }

    public static void q(String str, String str2, String str3, String str4, Object obj) {
        g.m(str4, obj, h.a(t9.e.c(new tj.a(str, str2, str3))));
    }

    public static void r(StringBuilder sb2, String str, long j10, String str2) {
        sb2.append(str);
        sb2.append(j10);
        sb2.append(str2);
    }

    public static void s(tj.a aVar, String str, Object obj) {
        g.m(str, obj, h.a(t9.e.c(aVar)));
    }
}
