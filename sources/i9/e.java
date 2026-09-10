package i9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.ironsource.InterfaceC0435l1;
import com.storage.androidcleaner.R;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f42928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f42929b;

    static {
        int i10 = h.f42935e;
        f42928a = 12451000;
        f42929b = new e();
    }

    public static int a(Context context) {
        int i10 = h.f42935e;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (p9.c.f48281c == null) {
                p9.c.f48281c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            p9.c.f48281c.booleanValue();
            if (p9.c.l(context)) {
                Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                intent2.setPackage("com.google.android.wearable.app");
                return intent2;
            }
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f42928a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(r9.c.a(context).f(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:75:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0178, please report this as an issue */
    public int c(Context context, int i10) {
        boolean z10;
        PackageInfo packageInfo;
        int i11;
        int i12;
        ApplicationInfo applicationInfo;
        int i13 = h.f42935e;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean zC = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f42934d.get()) {
            synchronized (c0.f44399a) {
                try {
                    if (!c0.f44400b) {
                        c0.f44400b = true;
                        try {
                            Bundle bundle = r9.c.a(context).d(128, context.getPackageName()).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                c0.f44401c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i14 = c0.f44401c;
            if (i14 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i14 != 12451000) {
                int i15 = f42928a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + InterfaceC0435l1.d.b.f29108e + String.valueOf(i14).length() + 194);
                l1.d.p(sb2, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i15, " but found ", i14);
                sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb2.toString());
            }
        }
        PackageManager packageManager = context.getPackageManager();
        if (p9.c.f48281c == null) {
            p9.c.f48281c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        p9.c.f48281c.booleanValue();
        if (p9.c.l(context)) {
            z10 = false;
        } else {
            if (p9.c.f48284f == null) {
                p9.c.f48284f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (p9.c.f48284f.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        c0.b(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        int i16 = 9;
        if (z10) {
            try {
                packageInfo = packageManager2.getPackageInfo("com.android.vending", 134225984);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", 134217792);
            i.b(context);
            if (!i.e(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z10) {
                c0.h(packageInfo);
                if (!i.e(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i11 = packageInfo2.versionCode;
                    if (i11 == -1) {
                        i12 = -1;
                    } else {
                        i12 = i11 / 1000;
                    }
                    if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                        sb3.append("Google Play services out of date for ");
                        sb3.append(packageName);
                        sb3.append(".  Requires ");
                        sb3.append(i10);
                        sb3.append(" but found ");
                        sb3.append(i11);
                        Log.w("GooglePlayServicesUtil", sb3.toString());
                        i16 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager2.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                i16 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i16 = 0;
                        } else {
                            i16 = 3;
                        }
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z10) {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / 1000;
                }
                if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i10);
                    sb4.append(" but found ");
                    sb4.append(i11);
                    Log.w("GooglePlayServicesUtil", sb4.toString());
                    i16 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager2.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i16 = 3;
                    } else {
                        i16 = 0;
                    }
                }
            } else {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / 1000;
                }
                if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    sb5.append("Google Play services out of date for ");
                    sb5.append(packageName);
                    sb5.append(".  Requires ");
                    sb5.append(i10);
                    sb5.append(" but found ");
                    sb5.append(i11);
                    Log.w("GooglePlayServicesUtil", sb5.toString());
                    i16 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager2.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i16 = 3;
                    } else {
                        i16 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i16 != 18) {
            zC = i16 == 1 ? h.c(context) : false;
        }
        if (zC) {
            return 18;
        }
        return i16;
    }
}
