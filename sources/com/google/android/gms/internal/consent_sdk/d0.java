package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f22990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o4 f22991b = new o4(21);

    public static synchronized String a(Context context) {
        String str;
        try {
            if (f22990a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || d()) {
                    string = "emulator";
                }
                int i10 = 0;
                while (true) {
                    if (i10 < 3) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                            messageDigest.update(string.getBytes());
                            str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                            break;
                        } catch (ArithmeticException unused) {
                            str = "";
                            break;
                        } catch (NoSuchAlgorithmException unused2) {
                            i10++;
                        }
                    }
                    str = "";
                    break;
                }
                f22990a = str;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f22990a;
    }

    public static String b(n5 n5Var) {
        StringBuilder sb2 = new StringBuilder(n5Var.m());
        for (int i10 = 0; i10 < n5Var.m(); i10++) {
            byte b10 = n5Var.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                        } else {
                            sb2.append((char) b10);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String c(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(e(objArr[i10]));
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(e(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public static String e(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String strI = wi.d.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI), (Throwable) e10);
            return l1.d.h("<", strI, " threw ", e10.getClass().getName(), ">");
        }
    }
}
