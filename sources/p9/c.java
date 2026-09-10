package p9;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import i9.h;
import i9.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f48279a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f48280b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f48281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f48282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f48283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f48284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f48285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f48286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f48287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f48288j;

    public static void a(Context context, Throwable th2) {
        try {
            c0.h(context);
            c0.h(th2);
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            char[] cArr2 = f48280b;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
            i10 += 2;
        }
        return new String(cArr);
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = (bArr[i10] & 240) >>> 4;
            char[] cArr = f48279a;
            sb2.append(cArr[i11]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long e(InputStream inputStream, OutputStream outputStream, boolean z10) {
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    break;
                }
                j10 += (long) i10;
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                if (z10) {
                    d(inputStream);
                    d(outputStream);
                }
                throw th2;
            }
        }
        if (z10) {
            d(inputStream);
            d(outputStream);
        }
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public static byte[] f(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoF = r9.c.a(context).f(64, str);
        Signature[] signatureArr = packageInfoF.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfoF.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoF.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean g(Context context, int i10) {
        if (k(context, i10, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                i iVarB = i.b(context);
                iVarB.getClass();
                if (packageInfo != null) {
                    if (!i.e(packageInfo, false)) {
                        if (i.e(packageInfo, true)) {
                            if (!h.b((Context) iVarB.f42938b)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean h(Context context) {
        if (f48283e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f48283e = Boolean.valueOf(z10);
        }
        return f48283e.booleanValue();
    }

    public static List i(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static byte[] j(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
            i10 = i11;
        }
        return bArr;
    }

    public static boolean k(Context context, int i10, String str) {
        f7.a aVarA = r9.c.a(context);
        aVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) aVarA.f40681b.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean l(Context context) {
        if (f48282d == null) {
            f48282d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f48282d.booleanValue();
    }
}
