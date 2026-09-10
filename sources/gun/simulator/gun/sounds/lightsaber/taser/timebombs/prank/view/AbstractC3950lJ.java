package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import com.bytedance.sdk.openadsdk.VVE.LD.Lxb;
import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3950lJ {
    public static void A(String str, int i, RelativeLayout.LayoutParams layoutParams, int i2) {
        layoutParams.addRule(i2, str.substring(i).hashCode());
    }

    public static float B(float f, float f2, float f3, float f4) {
        return ((f + f2) * f3) + f4;
    }

    public static float C(float f, float f2, float f3, float f4, float f5) {
        return f5 - (((f * f2) * f3) * f4);
    }

    public static int D(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static /* synthetic */ String E(int i) {
        if (i == 1) {
            return "MERGE";
        }
        if (i == 2) {
            return "ADD";
        }
        if (i == 3) {
            return "SUBTRACT";
        }
        if (i != 4) {
            return i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        }
        return "INTERSECT";
    }

    public static /* synthetic */ String F(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "QUEUING";
        }
        if (i != 3) {
            return i != 4 ? "null" : "RUNNING";
        }
        return "QUEUED";
    }

    public static void a(InterfaceC4326pd0 interfaceC4326pd0, JT jt, int i) {
        interfaceC4326pd0.b(i, jt);
    }

    public static int b(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    public static int c(int i) {
        return i & 384;
    }

    public static int d(int i) {
        return i & 64;
    }

    public static /* synthetic */ boolean e(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw null;
    }

    public static float g(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static float h(float f, float f2, float f3, float f4, float f5) {
        return (f * f2 * f3 * f4) + f5;
    }

    public static float i(ScaledNumericValue scaledNumericValue, float f, float f2, float f3) {
        return (scaledNumericValue.getScale(f) * f2) + f3;
    }

    public static int j(float f) {
        return com.mbridge.msdk.foundation.tools.t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), f);
    }

    public static int k(int i, int i2, int i3, int i4) {
        return CodedOutputStream.computeUInt32SizeNoTag(i) + i2 + i3 + i4;
    }

    public static Lxb l(String str) {
        Lxb lxb = new Lxb();
        lxb.LD(str);
        return lxb;
    }

    public static com.mbridge.msdk.foundation.same.report.l m(String str) {
        return new com.mbridge.msdk.foundation.same.report.l.b(str).a();
    }

    public static String n(int i, String str) {
        return i + str;
    }

    public static String o(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String p(String str, int i) {
        return str + i;
    }

    public static String q(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String r(String str, String str2, char c) {
        return str + str2 + c;
    }

    public static String s(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder t(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap v(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static /* synthetic */ Iterator w() {
        try {
            return Arrays.asList(new C4369q4()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void x(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC2995aW.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sbR = DM.r("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbR.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbR.toString());
            AbstractC2995aW.m0(AbstractC2995aW.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void y(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static /* synthetic */ void z(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }
}
