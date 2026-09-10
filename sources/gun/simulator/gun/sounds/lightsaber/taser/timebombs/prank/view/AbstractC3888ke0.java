package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zzgww;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.measurement.internal.zzgd;
import com.umeng.commonsdk.debug.UMLogUtils;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ke0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3888ke0 {
    public static /* synthetic */ char a(int i) {
        if (i == 1) {
            return '{';
        }
        if (i == 2) {
            return '[';
        }
        if (i == 3) {
            return '{';
        }
        if (i == 4) {
            return '[';
        }
        throw null;
    }

    public static /* synthetic */ char b(int i) {
        if (i == 1) {
            return '}';
        }
        if (i == 2) {
            return ']';
        }
        if (i == 3) {
            return '}';
        }
        if (i == 4) {
            return ']';
        }
        throw null;
    }

    public static int c(int i, int i2, int i3) {
        return zzgww.zzD(i) + i2 + i3;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return zzki.zzx(i) + i2 + i3 + i4;
    }

    public static IObjectWrapper e(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static com.mbridge.msdk.setting.g f(com.mbridge.msdk.setting.h hVar) {
        return hVar.d(com.mbridge.msdk.foundation.controller.c.n().b());
    }

    public static Object g(zzbl zzblVar, int i, List list, int i2) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i2);
    }

    public static String h(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String k(String str, StringBuilder sb) {
        sb.append(UMLogUtils.makeUrl(str));
        return sb.toString();
    }

    public static String l(Throwable th, StringBuilder sb) {
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static StringBuilder m(Throwable th, com.mbridge.msdk.video.bt.component.a aVar, Object obj, String str) {
        aVar.a(obj, th.getMessage());
        return new StringBuilder(str);
    }

    public static void n(int i, int i2, int i3, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void o(Bundle bundle, String str) {
        bundle.putLong(str, zzv.zzC().currentTimeMillis());
    }

    public static void p(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzj().zza(str);
    }

    public static void q(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        com.mbridge.msdk.foundation.tools.o0.b(str, sb.toString());
    }

    public static void r(String str, int i, String str2) {
        zzdo.zzf(str2, str + i);
    }

    public static void s(String str, String str2, String str3) {
        com.mbridge.msdk.foundation.tools.o0.a(str3, str + str2);
    }

    public static void t(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void u(Throwable th, StringBuilder sb, String str) {
        sb.append(th.getMessage());
        com.mbridge.msdk.foundation.tools.o0.a(str, sb.toString());
    }

    public static int v(int i, int i2, int i3) {
        return zzki.zzx(i) + i2 + i3;
    }

    public static void w(String str, String str2, String str3) {
        zzdo.zzf(str3, str2.concat(String.valueOf(str)));
    }
}
