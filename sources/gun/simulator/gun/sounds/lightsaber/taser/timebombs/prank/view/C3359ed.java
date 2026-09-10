package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3359ed implements Qd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NN f4324a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final InterfaceC2438Gf e;
    public final InterfaceC2438Gf f;
    public final int g;

    public C3359ed(Context context, InterfaceC2438Gf interfaceC2438Gf, InterfaceC2438Gf interfaceC2438Gf2) {
        C3684iF c3684iF = new C3684iF();
        G7.f3105a.q(c3684iF);
        c3684iF.d = true;
        this.f4324a = new NN(c3684iF, 27);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(C4235oc.c);
        this.e = interfaceC2438Gf2;
        this.f = interfaceC2438Gf;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC3888ke0.i("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x0107  */
    public final Y7 a(Y7 y7) {
        int type;
        int subtype;
        Map map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        C4092mw c4092mwC = y7.c();
        int i = Build.VERSION.SDK_INT;
        Map map2 = (Map) c4092mwC.b;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i));
        c4092mwC.a("model", Build.MODEL);
        c4092mwC.a("hardware", Build.HARDWARE);
        c4092mwC.a("device", Build.DEVICE);
        c4092mwC.a("product", Build.PRODUCT);
        c4092mwC.a("os-uild", Build.ID);
        c4092mwC.a("manufacturer", Build.MANUFACTURER);
        c4092mwC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        Map map3 = (Map) c4092mwC.b;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC4925wR.f5179a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        Map map4 = (Map) c4092mwC.b;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC4837vR.f5130a;
                subtype = 100;
            } else if (((EnumC4837vR) EnumC4837vR.f5130a.get(subtype)) == null) {
            }
            map = (Map) c4092mwC.b;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c4092mwC.a(com.umeng.analytics.pro.bc.O, Locale.getDefault().getCountry());
            c4092mwC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            c4092mwC.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC2871Wx.f0("CctTransportBackend");
            }
            c4092mwC.a("application_build", Integer.toString(i2));
            return c4092mwC.b();
        }
        SparseArray sparseArray3 = EnumC4837vR.f5130a;
        subtype = 0;
        map = (Map) c4092mwC.b;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c4092mwC.a(com.umeng.analytics.pro.bc.O, Locale.getDefault().getCountry());
        c4092mwC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        c4092mwC.a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c4092mwC.a("application_build", Integer.toString(i2));
        return c4092mwC.b();
    }
}
