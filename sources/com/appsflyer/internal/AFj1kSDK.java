package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p002kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1kSDK {
    public static long AFAdRevenueData(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    public static boolean L_(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    public static Map<String, String> M_(PackageInfo packageInfo, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            if (!it.hasNext()) {
                try {
                    if (!map.containsKey("install_time")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        long j = packageInfo.firstInstallTime;
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        map.put("install_time", simpleDateFormat.format(new Date(j)));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e);
                }
                if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
                    map.put("af_status", "Non-organic");
                }
                if (map.containsKey("agency")) {
                    map.remove("media_source");
                }
                String path = uri.getPath();
                if (path != null) {
                    map.put("path", path);
                }
                String scheme = uri.getScheme();
                if (scheme != null) {
                    map.put("scheme", scheme);
                }
                String host = uri.getHost();
                if (host != null) {
                    map.put("host", host);
                }
                return map;
            }
            String next = it.next();
            String queryParameter = uri.getQueryParameter(next);
            if (!map.containsKey(next)) {
                next.getClass();
                switch (next) {
                    case "af_prt":
                        str = "agency";
                        break;
                    case "c":
                        str = MBInterstitialActivity.INTENT_CAMAPIGN;
                        break;
                    case "pid":
                        break;
                    default:
                        str = next;
                        break;
                }
            } else {
                str = next;
            }
            map.put(str, queryParameter);
        }
    }

    public static String N_(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static Application O_(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getMediationNetwork(Context context) {
        if (context != null) {
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AppSet.getClient(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getRevenue(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return androidx.privacysandbox.ads.adservices.measurement.marial.attabal(context.getApplicationContext().getSystemService(androidx.privacysandbox.ads.adservices.measurement.wireman.attabal())) != null;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : "", th, false, false);
            }
        }
        return false;
    }

    public static boolean getMonetizationNetwork(Context context, String str) {
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(iCheckPermission);
        AFLogger.afRDLog(sb.toString());
        return iCheckPermission == 0;
    }

    public static Pair<Long, String> getMediationNetwork(Context context, String str) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
            } else {
                longVersionCode = packageInfo.versionCode;
            }
            return new Pair<>(Long.valueOf(longVersionCode), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return new Pair<>(0L, "");
        }
    }

    public static boolean getRevenue() {
        return Build.BRAND.equals("OPPO");
    }

    public static String getRevenue(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }
}
