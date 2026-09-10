package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0966v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f11947a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f11948b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collection f11949c = new HashSet();
    private static boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f11950e = null;

    /* JADX INFO: renamed from: com.applovin.impl.v$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11952b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EnumC0043a f11953c = EnumC0043a.NOT_SET;

        /* JADX INFO: renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC0043a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f11957a;

            EnumC0043a(String str) {
                this.f11957a = str;
            }

            public String b() {
                return this.f11957a;
            }
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0043a b() {
            return this.f11953c;
        }

        public boolean c() {
            return this.f11951a;
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
            EnumC0043a enumC0043aB = b();
            EnumC0043a enumC0043aB2 = aVar.b();
            return enumC0043aB != null ? enumC0043aB.equals(enumC0043aB2) : enumC0043aB2 == null;
        }

        public int hashCode() {
            int i2 = c() ? 79 : 97;
            String strA = a();
            int iHashCode = ((i2 + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            EnumC0043a enumC0043aB = b();
            return (iHashCode * 59) + (enumC0043aB != null ? enumC0043aB.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z2) {
            this.f11951a = z2;
        }

        public void a(String str) {
            this.f11952b = str;
        }

        public void a(EnumC0043a enumC0043a) {
            this.f11953c = enumC0043a;
        }

        public String a() {
            return this.f11952b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        n7.a();
        Object obj = f11948b;
        synchronized (obj) {
            try {
                if (d) {
                    return f11950e;
                }
                Collection collection = f11949c;
                boolean zIsEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (zIsEmpty) {
                    a aVarC = c(context);
                    synchronized (obj) {
                        d = true;
                        f11950e = aVarC;
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
                        com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e2) {
                    com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e2);
                }
                synchronized (f11948b) {
                    aVar = f11950e;
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
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

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f11947a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z2);
                aVar.a(z2 ? a.EnumC0043a.ON : a.EnumC0043a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e2) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e2);
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f11947a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        n7.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0043a.ON : a.EnumC0043a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    public static boolean a() {
        return n7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
