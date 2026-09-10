package l1;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ long a(int i10) {
        if (i10 == 1) {
            return 1099511627776L;
        }
        if (i10 == 2) {
            return 1073741824L;
        }
        if (i10 == 3) {
            return 1048576L;
        }
        if (i10 == 4) {
            return RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
        if (i10 == 5) {
            return 1L;
        }
        throw null;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return i13 - ((i10 + i11) * i12);
    }

    public static int c(int i10, int i11, String str) {
        return (t9.e.e(str) + i10) * i11;
    }

    public static Object d(ArrayList arrayList, int i10) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String e(int i10, String str) {
        return str + i10;
    }

    public static String f(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static String g(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String i(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public static StringBuilder l(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static void m(int i10, SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13) {
        spannableStringBuilder.setSpan(new StyleSpan(i10), i11, i12, i13);
    }

    public static void n(String str, String str2, ArrayList arrayList) {
        arrayList.add(new Pair(str, str2));
    }

    public static void o(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static void p(StringBuilder sb2, String str, int i10, String str2, int i11) {
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
    }

    public static void q(HashMap map, String str, Integer num, int i10, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i10));
    }

    public static int r(int i10, int i11, int i12, int i13) {
        return i10 + i11 + i12 + i13;
    }

    public static /* synthetic */ String s(int i10) {
        if (i10 == 1) {
            return "surface";
        }
        if (i10 == 2) {
            return "texture";
        }
        if (i10 == 3) {
            return "image";
        }
        throw null;
    }

    public static /* synthetic */ String t(int i10) {
        if (i10 == 1) {
            return "opaque";
        }
        if (i10 == 2) {
            return X3.i.T;
        }
        throw null;
    }

    public static /* synthetic */ String u(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String v(int i10) {
        if (i10 == 1) {
            return "INVARIANT";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "OUT_VARIANCE";
        }
        return "IN_VARIANCE";
    }

    public static /* synthetic */ int w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("opaque")) {
            return 1;
        }
        if (str.equals(X3.i.T)) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(str));
    }
}
