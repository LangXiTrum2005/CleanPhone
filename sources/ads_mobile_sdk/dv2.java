package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.common.base.triweekly;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.Locale;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dv2 extends hv2 {
    public final Context d;
    public final qc0 e;
    public final jk0 f;
    public final ip0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv2(Context context, qc0 deviceProperties, jk0 flags, ip0 gmaUtil) {
        super(no0.CUI_NAME_SDKINIT_INIT_DEVICE_SIGNAL);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.d = context;
        this.e = deviceProperties;
        this.f = flags;
        this.g = gmaUtil;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.STATIC_DEVICE;
    }

    public final boolean b() {
        int identifier = this.d.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, "android");
        int identifier2 = this.d.getResources().getIdentifier("Theme.GoogleMobileAds", TtmlNode.TAG_STYLE, this.d.getPackageName());
        if (identifier == 0 && identifier2 == 0) {
            kn0.b("Please set theme of AdActivity to @style/Theme.GoogleMobileAds to enable\n      transparent background interstitial ads.", null);
            return false;
        }
        try {
            int i = this.d.getPackageManager().getActivityInfo(new ComponentName(this.d.getPackageName(), "com.google.android.libraries.ads.mobile.sdk.common.AdActivity"), 0).theme;
            if (i != identifier && i != identifier2) {
                kn0.b("Please set theme of AdActivity to @style/Theme.GoogleMobileAds to enable\n      transparent background interstitial ads.", null);
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Failed to fetch AdActivity theme: " + e, null);
            kn0.b("Please set theme of AdActivity to @style/Theme.GoogleMobileAds to enable\n      transparent background interstitial ads.", null);
            return false;
        }
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        String str;
        String str2;
        String str3 = Build.FINGERPRINT;
        PackageManager packageManager = this.e.c.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        boolean z = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536) != null;
        PackageManager packageManager2 = this.e.c.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager2, "getPackageManager(...)");
        boolean z2 = packageManager2.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536) != null;
        String country = Locale.getDefault().getCountry();
        boolean zBooleanValue = ((Boolean) this.e.f.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.e.k.getValue()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) this.e.h.getValue()).booleanValue();
        boolean zBooleanValue4 = ((Boolean) this.e.g.getValue()).booleanValue();
        String language = Locale.getDefault().getLanguage();
        List listDern = graveside.dern();
        LocaleList localeList = LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList, "getDefault(...)");
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            String language2 = localeList.get(i).getLanguage();
            Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
            listDern.add(language2);
        }
        List listAttabal = graveside.attabal(listDern);
        String str4 = (String) this.e.j.getValue();
        String str5 = (String) this.e.i.getValue();
        this.e.getClass();
        boolean z3 = z;
        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / ((long) 1024);
        boolean zBooleanValue5 = ((Boolean) this.e.m.getValue()).booleanValue();
        jk0 jk0Var = this.f;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:add_system_default_locale", X3.i.W);
        if (((Boolean) jk0Var.a("gads:add_system_default_locale", Boolean.FALSE, zk.b)).booleanValue()) {
            ip0 ip0Var = this.g;
            Context context = this.d;
            ip0Var.getClass();
            hp0 hp0VarA = ip0.a(context);
            str = hp0VarA.b;
            str2 = hp0VarA.a;
        } else {
            str = null;
            str2 = null;
        }
        String str6 = Build.MODEL;
        int i2 = Build.VERSION.SDK_INT;
        boolean zB = b();
        Intrinsics.beachfront(country);
        Intrinsics.beachfront(language);
        Intrinsics.beachfront(str6);
        Intrinsics.beachfront(str3);
        return new tn0(new cv2(z3, z2, country, str, zBooleanValue3, zBooleanValue4, language, listAttabal, str2, str4, str6, str3, availableBytes, zBooleanValue2, str5, zBooleanValue, i2, zB, zBooleanValue5));
    }
}
