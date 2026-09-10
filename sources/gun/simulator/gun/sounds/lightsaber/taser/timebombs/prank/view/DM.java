package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.android.gms.measurement.internal.zzgd;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class DM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2967a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};

    public static float A(float f, float f2, float f3, float f4) {
        return (f * f2 * f3) + f4;
    }

    public static String B(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void C(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzk().zza(str);
    }

    public static /* synthetic */ int D(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String E(int i) {
        if (i == 1) {
            return "OK";
        }
        if (i == 2) {
            return "TRANSIENT_ERROR";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVALID_PAYLOAD";
        }
        return "FATAL_ERROR";
    }

    public static /* synthetic */ int[] F(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f2967a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "BASE";
        }
        if (i == 2) {
            return "REALTIME";
        }
        throw null;
    }

    public static float c(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static int d(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static Object e(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static Object f(List list, int i) {
        return list.get(list.size() - i);
    }

    public static String g(String str, float f) {
        return str + f;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, float f, String str) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static String k(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder p(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static HashMap s(Class cls, K6 k6) {
        HashMap map = new HashMap();
        map.put(cls, k6);
        return map;
    }

    public static /* synthetic */ Iterator t() {
        try {
            return Arrays.asList(new C4456r4()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Map u(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void v(int i, SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
        spannableStringBuilder.setSpan(new StyleSpan(i), i2, i3, i4);
    }

    public static void w(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzd().zza(str);
    }

    public static /* synthetic */ void x(Serializable serializable) {
        if (serializable != null) {
            throw new ClassCastException();
        }
    }

    public static void y(String str, Throwable th, String str2) {
        com.mbridge.msdk.foundation.tools.o0.b(str2, str + th);
    }

    public static void z(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }
}
