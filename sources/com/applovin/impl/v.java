package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f9858a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f9859b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collection f9860c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f9861d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f9862e = null;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9864b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EnumC0019a f9865c = EnumC0019a.NOT_SET;

        /* JADX INFO: renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public enum EnumC0019a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f9870a;

            EnumC0019a(String str) {
                this.f9870a = str;
            }

            public String b() {
                return this.f9870a;
            }
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0019a b() {
            return this.f9865c;
        }

        public boolean c() {
            return this.f9863a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            EnumC0019a enumC0019aB = b();
            EnumC0019a enumC0019aB2 = aVar.b();
            return enumC0019aB != null ? enumC0019aB.equals(enumC0019aB2) : enumC0019aB2 == null;
        }

        public int hashCode() {
            int i10 = c() ? 79 : 97;
            String strA = a();
            int i11 = (i10 + 59) * 59;
            int iHashCode = strA == null ? 43 : strA.hashCode();
            EnumC0019a enumC0019aB = b();
            return ((i11 + iHashCode) * 59) + (enumC0019aB != null ? enumC0019aB.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z10) {
            this.f9863a = z10;
        }

        public void a(String str) {
            this.f9864b = str;
        }

        public void a(EnumC0019a enumC0019a) {
            this.f9865c = enumC0019a;
        }

        public String a() {
            return this.f9864b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        q7.a();
        Object obj = f9859b;
        synchronized (obj) {
            try {
                if (f9861d) {
                    return f9862e;
                }
                Collection collection = f9860c;
                boolean zIsEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (zIsEmpty) {
                    a aVarC = c(context);
                    synchronized (obj) {
                        f9861d = true;
                        f9862e = aVarC;
                        hashSet = new HashSet(collection);
                        collection.clear();
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((CountDownLatch) it.next()).countDown();
                    }
                }
                try {
                    if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                        com.applovin.impl.sdk.p.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e10) {
                    com.applovin.impl.sdk.p.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
                }
                synchronized (f9859b) {
                    aVar = f9862e;
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    @Nullable
    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f9858a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z10);
                aVar.a(z10 ? a.EnumC0019a.ON : a.EnumC0019a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e10) {
                com.applovin.impl.sdk.p.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.p.c("DataCollector", "Unable to collect Fire OS IDFA", th2);
            }
        }
        f9858a = false;
        return null;
    }

    @Nullable
    private static a collectGoogleAdvertisingInfo(Context context) {
        q7.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.p.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0019a.ON : a.EnumC0019a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th2) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.p.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th2);
            return null;
        }
    }

    public static boolean a() {
        return q7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
