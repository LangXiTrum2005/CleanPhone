package ads_mobile_sdk;

import android.app.Activity;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Process;
import android.webkit.CookieManager;
import com.ironsource.X3;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import saneness.laky;
import saneness.manhattanization;
import saneness.nhl;
import saneness.sunback;

/* JADX INFO: loaded from: classes.dex */
public final class ip0 {
    public static final laky f = new laky();
    public static final AtomicReference g;
    public final Context a;
    public final x b;
    public final jk0 c;
    public final c0 d;
    public final Class e;

    static {
        adultoid.kowloon("/aclk", "/pcs/click", "/dbm/clk");
        g = new AtomicReference(null);
    }

    public ip0(Context applicationContext, x activityTracker, jk0 flags, c0 adActivityDelegateMap, Class adActivityClass) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(adActivityDelegateMap, "adActivityDelegateMap");
        Intrinsics.checkNotNullParameter(adActivityClass, "adActivityClass");
        this.a = applicationContext;
        this.b = activityTracker;
        this.c = flags;
        this.d = adActivityDelegateMap;
        this.e = adActivityClass;
    }

    public final Intent a(Context context, sunback delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "adActivityDelegate");
        Intent intent = new Intent(context, (Class<?>) this.e);
        Bundle bundle = new Bundle();
        c0 c0Var = this.d;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        int andIncrement = c0Var.c.getAndIncrement();
        saran saranVar = c0Var.a;
        b0 block = new b0(c0Var, andIncrement, null);
        EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        monroe monroeVarWireman = cutely.wireman(saranVar, context2, null, new x13(block, null), 2, null);
        c0Var.d.put(Integer.valueOf(andIncrement), new a0(delegate, monroeVarWireman));
        bundle.putInt("ad_activity_delegate", andIncrement);
        intent.putExtra("ad_activity_delegate_bundle", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public final boolean b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        if (host != null) {
            jk0 jk0Var = this.c;
            jk0Var.getClass();
            List defaultValue = adultoid.kowloon(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com");
            Intrinsics.checkNotNullParameter("gads:google_ad_domain_suffixes", X3.i.W);
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            List list = (List) jk0Var.a("gads:google_ad_domain_suffixes", defaultValue, zk.g);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (dovishness.cuirassed(host, (String) it.next(), false, 2, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!b(uri)) {
            return false;
        }
        String string = uri.toString();
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        List defaultValue = graveside.marial("^[^?]*(/adview|/pcs/view).*");
        Intrinsics.checkNotNullParameter("gads:impression_url_pattern_match", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        List list = (List) jk0Var.a("gads:impression_url_pattern_match", defaultValue, zk.g);
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Regex regex = new Regex((String) it.next());
            Intrinsics.beachfront(string);
            if (regex.containsMatchIn(string)) {
                return true;
            }
        }
        return false;
    }

    public final Map d(Uri uri) {
        String encodedQuery;
        String strDecode;
        Intrinsics.checkNotNullParameter(uri, "uri");
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:uri_query_to_map:enabled", X3.i.W);
        if (!((Boolean) jk0Var.a("gads:uri_query_to_map:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            return laky.beachfront(uri);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int length = encodedQuery.length();
            int i = 0;
            while (true) {
                int iNosophobia = StringsKt.nosophobia(encodedQuery, '&', i, false, 4, null);
                int i2 = iNosophobia != -1 ? iNosophobia : length;
                int iNosophobia2 = StringsKt.nosophobia(encodedQuery, '=', i, false, 4, null);
                if (iNosophobia2 > i2 || iNosophobia2 == -1) {
                    iNosophobia2 = i2;
                }
                String strSubstring = encodedQuery.substring(i, iNosophobia2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strDecode2 = Uri.decode(strSubstring);
                if (iNosophobia2 == i2) {
                    strDecode = "";
                } else {
                    String strSubstring2 = encodedQuery.substring(iNosophobia2 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    strDecode = Uri.decode(strSubstring2);
                }
                Intrinsics.beachfront(strDecode2);
                Intrinsics.beachfront(strDecode);
                linkedHashMap.put(strDecode2, strDecode);
                if (iNosophobia == -1) {
                    break;
                }
                i = iNosophobia + 1;
            }
        }
        return linkedHashMap;
    }

    public static CookieManager b() {
        int iMyUid = Process.myUid();
        if (iMyUid == 0 || iMyUid == 1000 || iMyUid == 1001 || iMyUid == 1002 || iMyUid == 1027) {
            return null;
        }
        return CookieManager.getInstance();
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 26) {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null) {
                return packageManager.isInstantApp();
            }
            return false;
        }
        try {
            this.a.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public static hp0 a(Context context) {
        Configuration configuration;
        LocaleList locales;
        Intrinsics.checkNotNullParameter(context, "context");
        hp0 hp0Var = new hp0(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        if (Build.VERSION.SDK_INT >= 33) {
            LocaleManager localeManagerAttabal = manhattanization.attabal(context.getSystemService(nhl.attabal()));
            if (localeManagerAttabal != null) {
                locales = localeManagerAttabal.getSystemLocales();
            } else {
                locales = null;
            }
        } else {
            Resources resources = context.getResources();
            if (resources == null || (configuration = resources.getConfiguration()) == null) {
                locales = null;
            } else {
                locales = configuration.getLocales();
            }
        }
        if (locales == null || locales.isEmpty()) {
            return hp0Var;
        }
        Locale locale = locales.get(0);
        return new hp0(locale.getLanguage(), locale.getCountry());
    }

    public final boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!b(uri)) {
            return false;
        }
        String string = uri.toString();
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        List defaultValue = graveside.marial("^[^?]*(/aclk|/pcs/click|/dbm/clk).*");
        Intrinsics.checkNotNullParameter("gads:click_url_pattern_match", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        List list = (List) jk0Var.a("gads:click_url_pattern_match", defaultValue, zk.g);
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Regex regex = new Regex((String) it.next());
            Intrinsics.beachfront(string);
            if (regex.containsMatchIn(string)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Context contextB = this.b.b();
        if (contextB == null) {
            contextB = this.a;
        }
        if (!(contextB instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            contextB.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            y13.a("Exception starting Activity: " + e, null, 6);
            return false;
        }
    }

    public final long a() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (packageInfo2 = packageManager.getPackageInfo(this.a.getPackageName(), PackageManager.PackageInfoFlags.of(128L))) == null) {
                return 0L;
            }
            return packageInfo2.getLongVersionCode();
        }
        PackageManager packageManager2 = this.a.getPackageManager();
        return (packageManager2 == null || (packageInfo = packageManager2.getPackageInfo(this.a.getPackageName(), 128)) == null) ? 0 : packageInfo.versionCode;
    }
}
