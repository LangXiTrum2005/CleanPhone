package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;
import androidx.preference.PreferenceManager;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ExecutorService f9500a = h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Handler f9501b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9504c;

        public a(Context context, String str, int i2) {
            this.f9502a = context;
            this.f9503b = str;
            this.f9504c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.f9502a, this.f9503b, this.f9504c).show();
        }
    }

    public interface b extends Runnable {
        boolean a();
    }

    public static boolean a(ExecutorService executorService, Runnable runnable) {
        try {
            executorService.execute(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    public static String b(Context context, String str) {
        return b(c(context), str);
    }

    public static SharedPreferences c(Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    @Deprecated
    public static int d() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return 0;
        }
        try {
            return contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            new e0.a().a("Failed to retrieve package info.").a(e0.f9132i);
            return 0;
        }
    }

    private static Handler e() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        if (f9501b == null) {
            f9501b = new Handler(mainLooper);
        }
        return f9501b;
    }

    public static int f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            new e0.a().a("Unable to parse '").a(str).a("' as a color.").a(e0.g);
            return -16777216;
        }
    }

    public static boolean g() {
        Context contextA = com.adcolony.sdk.a.a();
        return contextA != null && (contextA instanceof Activity) && ((Activity) contextA).isInMultiWindowMode();
    }

    public static ExecutorService h() {
        return new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f9506b = System.currentTimeMillis();

        public c(long j) {
            a(j);
        }

        public void a(long j) {
            this.f9505a = j;
            this.f9506b = System.currentTimeMillis() + this.f9505a;
        }

        public long b() {
            return this.f9505a;
        }

        public long c() {
            return this.f9506b - this.f9505a;
        }

        public long d() {
            long jCurrentTimeMillis = this.f9506b - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                return 0L;
            }
            return jCurrentTimeMillis;
        }

        public String toString() {
            return String.valueOf(d() / 1000.0d);
        }

        public boolean a() {
            return d() == 0;
        }
    }

    public static boolean a(Runnable runnable) {
        return a(f9500a, runnable);
    }

    public static String b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, null);
        } catch (ClassCastException unused) {
            new e0.a().a(android.support.v4.media.a.n("Key ", str, " in SharedPreferences ")).a("does not have a String value.").a(e0.g);
            return null;
        }
    }

    public static int a(Context context, String str) {
        return a(c(context), str);
    }

    public static Date g(String str) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", locale);
        try {
            try {
                try {
                    return simpleDateFormat.parse(str);
                } catch (Exception unused) {
                    return new SimpleDateFormat(com.smartdigimkt.n8.g.f37186b, locale).parse(str);
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).parse(str);
        }
    }

    public static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            new e0.a().a(android.support.v4.media.a.n("Key ", str, " in SharedPreferences ")).a("does not have an int value.").a(e0.g);
            return -1;
        }
    }

    public static f1 c(f1 f1Var) {
        f1Var.a(new String[]{"ads_to_restore"});
        return f1Var;
    }

    public static boolean e(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        new e0.a().a("String must be non-null and the max length is 128 characters.").a(e0.f);
        return false;
    }

    public static int f(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean c(String str) {
        Application application;
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        try {
            if (contextA instanceof Application) {
                application = (Application) contextA;
            } else {
                application = ((Activity) contextA).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String d(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static String f() {
        Context contextA = com.adcolony.sdk.a.a();
        return ((contextA instanceof Activity) && contextA.getResources().getConfiguration().orientation == 1) ? d9.h.D : d9.h.C;
    }

    public static int d(String str) {
        str.getClass();
        if (str.equals(d9.h.D)) {
            return 0;
        }
        return !str.equals(d9.h.C) ? -1 : 1;
    }

    public static e1 e(Context context) {
        e1 e1VarA = c0.a();
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    e1VarA = c0.a();
                    int i2 = 0;
                    while (true) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        e1VarA.b(strArr[i2]);
                        i2++;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return e1VarA;
    }

    public static String c() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return "1.0";
        }
        try {
            return contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            new e0.a().a("Failed to retrieve package info.").a(e0.f9132i);
            return "1.0";
        }
    }

    public static f1 b(f1 f1Var) {
        f1Var.r("launch_metadata");
        return f1Var;
    }

    public static String b() {
        Application application;
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return "";
        }
        if (contextA instanceof Application) {
            application = (Application) contextA;
        } else {
            application = ((Activity) contextA).getApplication();
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(contextA.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            new e0.a().a("Failed to retrieve application label.").a(e0.f9132i);
            return "";
        }
    }

    public static f1 a(f1 f1Var) {
        f1Var.a(new String[]{"data_path", "media_path", "temp_storage_path", "device_api", "display_dpi", "mac_address", "memory_class", "memory_used_mb", "model", "arch", "timezone_ietf", "timezone_gmt_m", "timezone_dst_m", "density", "dark_mode", "launch_metadata"});
        return f1Var;
    }

    public static int a(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            crc32.update(str.charAt(i2));
        }
        return (int) crc32.getValue();
    }

    public static boolean c(Runnable runnable) {
        Handler handlerE;
        if (runnable == null || (handlerE = e()) == null) {
            return false;
        }
        handlerE.removeCallbacks(runnable);
        return true;
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    public static e1 a(int i2) {
        e1 e1VarA = c0.a();
        for (int i3 = 0; i3 < i2; i3++) {
            c0.a(e1VarA, a());
        }
        return e1VarA;
    }

    public static boolean a(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        if (j <= 0) {
            return b(runnable);
        }
        Handler handlerE = e();
        if (handlerE != null) {
            return handlerE.postDelayed(runnable, j);
        }
        return false;
    }

    public static String b(String str) {
        try {
            return d1.a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b(Runnable runnable) {
        Handler handlerE;
        if (runnable == null || (handlerE = e()) == null) {
            return false;
        }
        if (handlerE.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handlerE.post(runnable);
    }

    public static boolean a(b bVar) {
        Handler handlerE;
        if (bVar == null || (handlerE = e()) == null) {
            return false;
        }
        handlerE.removeCallbacks(bVar);
        if (bVar.a()) {
            return true;
        }
        if (handlerE.getLooper() == Looper.myLooper()) {
            bVar.run();
            return true;
        }
        handlerE.post(bVar);
        return true;
    }

    public static boolean b(AudioManager audioManager) {
        if (audioManager == null) {
            new e0.a().a("isAudioEnabled() called with a null AudioManager").a(e0.f9132i);
            return false;
        }
        try {
            return audioManager.getStreamVolume(3) > 0;
        } catch (Exception e2) {
            new e0.a().a("Exception occurred when accessing AudioManager.getStreamVolume: ").a(e2.toString()).a(e0.f9132i);
            return false;
        }
    }

    public static double a(AudioManager audioManager) {
        if (audioManager == null) {
            new e0.a().a("getAudioVolume() called with a null AudioManager").a(e0.f9132i);
            return 0.0d;
        }
        try {
            double streamVolume = audioManager.getStreamVolume(3);
            double streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            return streamVolume / streamMaxVolume;
        } catch (Exception e2) {
            new e0.a().a("Exception occurred when accessing AudioManager: ").a(e2.toString()).a(e0.f9132i);
            return 0.0d;
        }
    }

    public static int b(Context context) {
        int identifier;
        if (context == null) {
            return 0;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        } else {
            identifier = context.getResources().getIdentifier("navigation_bar_height_landscape", "dimen", "android");
        }
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static AudioManager a(Context context) {
        if (context == null) {
            new e0.a().a("getAudioManager called with a null Context").a(e0.f9132i);
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    public static String b(e1 e1Var) throws JSONException {
        String string = "";
        for (int i2 = 0; i2 < e1Var.b(); i2++) {
            if (i2 > 0) {
                string = android.support.v4.media.a.m(string, ",");
            }
            StringBuilder sbW = android.support.v4.media.a.w(string);
            sbW.append(e1Var.b(i2));
            string = sbW.toString();
        }
        return string;
    }

    public static boolean a(String str, File file) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    try {
                        try {
                            int i2 = fileInputStream.read(bArr);
                            if (i2 > 0) {
                                messageDigest.update(bArr, 0, i2);
                            } else {
                                boolean zEquals = str.equals(String.format("%40s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0'));
                                try {
                                    fileInputStream.close();
                                    return zEquals;
                                } catch (IOException unused) {
                                    new e0.a().a("Exception on closing MD5 input stream").a(e0.f9132i);
                                    return zEquals;
                                }
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException("Unable to process file for MD5", e2);
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                            new e0.a().a("Exception on closing MD5 input stream").a(e0.f9132i);
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException unused3) {
                new e0.a().a("Exception while getting FileInputStream").a(e0.f9132i);
                return false;
            }
        } catch (NoSuchAlgorithmException unused4) {
            new e0.a().a("Exception while getting Digest").a(e0.f9132i);
            return false;
        }
    }

    public static int b(v0 v0Var) {
        boolean z2 = false;
        try {
            Context contextA = com.adcolony.sdk.a.a();
            if (contextA == null) {
                return 0;
            }
            int i2 = (int) (contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).lastUpdateTime / 1000);
            f1 f1VarG = v0Var.g();
            int i3 = 1;
            if (!f1VarG.a("last_update")) {
                i3 = 2;
                z2 = true;
            } else if (c0.d(f1VarG, "last_update") != i2) {
                z2 = true;
            } else {
                i3 = 0;
            }
            if (!z2) {
                return i3;
            }
            try {
                c0.b(f1VarG, "last_update", i2);
                v0Var.a(f1VarG);
                return i3;
            } catch (Exception unused) {
                return i3;
            }
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (iArr[1] / com.adcolony.sdk.a.b().n().s());
    }

    private static void b(Vibrator vibrator, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            a(vibrator, j);
        } else {
            vibrator.vibrate(j);
        }
    }

    public static String a(e1 e1Var) throws JSONException {
        String strM = "";
        for (int i2 = 0; i2 < e1Var.b(); i2++) {
            if (i2 > 0) {
                strM = android.support.v4.media.a.m(strM, ",");
            }
            switch (e1Var.b(i2)) {
                case 1:
                    strM = android.support.v4.media.a.m(strM, "MO");
                    break;
                case 2:
                    strM = android.support.v4.media.a.m(strM, "TU");
                    break;
                case 3:
                    strM = android.support.v4.media.a.m(strM, "WE");
                    break;
                case 4:
                    strM = android.support.v4.media.a.m(strM, "TH");
                    break;
                case 5:
                    strM = android.support.v4.media.a.m(strM, "FR");
                    break;
                case 6:
                    strM = android.support.v4.media.a.m(strM, "SA");
                    break;
                case 7:
                    strM = android.support.v4.media.a.m(strM, "SU");
                    break;
            }
        }
        return strM;
    }

    public static boolean a(Intent intent, boolean z2) {
        try {
            Context contextA = com.adcolony.sdk.a.a();
            if (contextA == null) {
                return false;
            }
            if (!(contextA instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AdColonyInterstitial adColonyInterstitialJ = com.adcolony.sdk.a.b().j();
            if (adColonyInterstitialJ != null && adColonyInterstitialJ.i()) {
                adColonyInterstitialJ.e().f();
            }
            if (z2) {
                contextA.startActivity(Intent.createChooser(intent, "Handle this via..."));
                return true;
            }
            contextA.startActivity(intent);
            return true;
        } catch (Exception e2) {
            new e0.a().a(e2.toString()).a(e0.g);
            return false;
        }
    }

    public static boolean a(Intent intent) {
        return a(intent, false);
    }

    public static boolean a(String str, int i2) {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        b(new a(contextA, str, i2));
        return true;
    }

    public static String a(v0 v0Var) {
        f1 f1VarG = v0Var.g();
        String strH = c0.h(f1VarG, "adc_alt_id");
        if (!strH.isEmpty()) {
            return strH;
        }
        String strA = a();
        c0.a(f1VarG, "adc_alt_id", strA);
        v0Var.a(f1VarG);
        return strA;
    }

    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (iArr[0] / com.adcolony.sdk.a.b().n().s());
    }

    public static boolean a(Context context, long j) {
        try {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator == null || !vibrator.hasVibrator()) {
                return false;
            }
            b(vibrator, j);
            return true;
        } catch (Exception unused) {
            new e0.a().a("Vibrate command failed.").a(e0.f);
            return false;
        }
    }

    private static void a(Vibrator vibrator, long j) {
        vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
    }
}
