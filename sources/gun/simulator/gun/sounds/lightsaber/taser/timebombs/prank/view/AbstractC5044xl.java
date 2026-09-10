package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.badlogic.gdx.files.FileHandle;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5044xl {
    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "SOURCE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "NONE";
        }
        return "TRANSFORMED";
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
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

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "PRE_COMP";
            case 2:
                return "SOLID";
            case 3:
                return "IMAGE";
            case 4:
                return "NULL";
            case 5:
                return "SHAPE";
            case 6:
                return "TEXT";
            case 7:
                return "UNKNOWN";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "ctv";
        }
        if (i == 2) {
            return "mobile";
        }
        if (i == 3) {
            return "other";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "ctv";
        }
        if (i == 2) {
            return "mobile";
        }
        if (i == 3) {
            return "other";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "ctv";
        }
        if (i == 2) {
            return "mobile";
        }
        if (i == 3) {
            return "other";
        }
        throw null;
    }

    public static float d(float f, float f2, float f3, float f4) {
        return (f * f2) + f3 + f4;
    }

    public static String e(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String f(String str) {
        String string = UUID.randomUUID().toString();
        AbstractC2995aW.p(string, str);
        return string;
    }

    public static String g(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String h(String str, long j) {
        return str + j;
    }

    public static String i(String str, long j, String str2) {
        return str + j + str2;
    }

    public static String j(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String k(String str, FileHandle fileHandle) {
        return str + fileHandle;
    }

    public static String l(String str, String str2, int i, String str3, String str4) {
        AbstractC2995aW.q(str, str2);
        String strSubstring = str.substring(i);
        AbstractC2995aW.p(strSubstring, str3);
        return str4.concat(strSubstring);
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String n(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String o(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder q(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void r(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void s(String str, String str2, String str3) {
        com.mbridge.msdk.foundation.tools.o0.b(str3, str + str2);
    }

    public static void t(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean u(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, String str) {
        return TextUtils.equals(oy.nBu().LD(), str);
    }

    public static boolean v(InterfaceC4596sh interfaceC4596sh, String str, D40 d40, String str2, D40 d41) {
        AbstractC2995aW.q(interfaceC4596sh, str);
        AbstractC2995aW.q(d40, str2);
        return interfaceC4596sh.j(d41);
    }

    public static float w(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static float x(float f, float f2, float f3, float f4) {
        return f4 - ((f * f2) * f3);
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "INITIALIZE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DECODE_DATA";
        }
        return "SWITCH_TO_SOURCE_SERVICE";
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
