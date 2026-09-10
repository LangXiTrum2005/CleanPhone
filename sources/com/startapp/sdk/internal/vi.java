package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Base64OutputStream;
import android.util.Log;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Intent f41590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Boolean f41591c;
    public static Random d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f41589a = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final si f41592e = new si();

    public static Intent a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getLaunchIntentForPackage(str);
            }
            return null;
        } catch (Throwable th) {
            g9.a(th);
            return null;
        }
    }

    public static Intent b(Context context, String str) {
        String packageName;
        Intent intent;
        if (context == null) {
            return null;
        }
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = null;
        }
        if (str == null) {
            str = packageName;
        }
        if (str == null) {
            return null;
        }
        if (str.equals(packageName) && (intent = f41590b) != null) {
            return new Intent(intent);
        }
        long j = Thread.currentThread() == Looper.getMainLooper().getThread() ? 100L : 5000L;
        Intent[] intentArr = {null};
        synchronized (intentArr) {
            try {
                new Thread(new qi(intentArr, context, str)).start();
                intentArr.wait(j);
            } catch (Throwable unused2) {
            }
        }
        Intent intent2 = intentArr[0];
        if (intent2 == null) {
            return null;
        }
        if (!str.equals(packageName)) {
            return intent2;
        }
        f41590b = intent2;
        return new Intent(intent2);
    }

    public static boolean c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.importance == 100 && packageName.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            if (!a(th, SecurityException.class) && !a(th, RemoteException.class)) {
                g9.a(th);
            }
        }
        return false;
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        try {
            String[] strArrSplit = new URL(MetaData.E().f()).getHost().split("\\.");
            if (strArrSplit.length > 1) {
                Locale locale = Locale.ENGLISH;
                return str.toLowerCase(locale).contains(strArrSplit[1].toLowerCase(locale));
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public static long e(String str) {
        long j;
        if (str == null || str.length() < 1) {
            return 0L;
        }
        int length = str.length() - 1;
        long j2 = 0;
        long j3 = 0;
        boolean z2 = true;
        char c2 = 0;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt != 'm' || c2 != 's') {
                    if (z2) {
                        if (cCharAt == 's') {
                            j = 1000;
                        } else if (cCharAt == 'm') {
                            j = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                        } else if (cCharAt == 'h') {
                            j = com.thinkup.core.common.om.n.m;
                        } else if (cCharAt == 'd') {
                            j = 86400000;
                        }
                        z2 = false;
                    }
                    return ~length;
                }
                j = 1;
                j3 = j;
                length--;
                c2 = cCharAt;
            } else {
                if (j3 == 0) {
                    return ~length;
                }
                j2 += ((long) (cCharAt - '0')) * j3;
                j3 *= 10;
                z2 = true;
                length--;
                c2 = cCharAt;
            }
        }
        return j2;
    }

    public static int[][] f(String str) {
        int i2;
        int i3;
        ArrayList arrayList = null;
        for (String str2 : str.split(",")) {
            int iIndexOf = str2.indexOf("..");
            if (iIndexOf < 0) {
                i3 = Integer.parseInt(str2);
                i2 = i3;
            } else {
                String strSubstring = str2.substring(0, iIndexOf);
                int i4 = strSubstring.length() > 0 ? Integer.parseInt(strSubstring) : Integer.MIN_VALUE;
                String strSubstring2 = str2.substring(iIndexOf + 2);
                i2 = strSubstring2.length() > 0 ? Integer.parseInt(strSubstring2) : Integer.MAX_VALUE;
                i3 = i4;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add(new int[]{Math.min(i3, i2), Math.max(i3, i2)});
        }
        if (arrayList != null) {
            return (int[][]) arrayList.toArray(new int[0][]);
        }
        return null;
    }

    public static String g(String str) {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 11);
    }

    public static String a(Activity activity) {
        ComponentName component;
        Intent intentB = b(activity, null);
        if (intentB == null || (component = intentB.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    public static boolean e(Context context) {
        try {
            Object systemService = context.getSystemService("uimode");
            return (systemService instanceof UiModeManager) && ((UiModeManager) systemService).getCurrentModeType() == 4;
        } catch (Throwable th) {
            g9.a(th);
        }
        return false;
    }

    public static boolean d(Context context) {
        Boolean boolValueOf = f41591c;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                boolValueOf = Boolean.valueOf((applicationInfo.flags & 2) != 0);
            }
        } catch (Throwable unused) {
        }
        if (boolValueOf == null) {
            boolValueOf = Boolean.FALSE;
        }
        f41591c = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static String a(String str, String str2, String str3) {
        int iIndexOf;
        int iIndexOf2;
        if (str == null || (iIndexOf = str.indexOf(str2)) == -1 || (iIndexOf2 = str.indexOf(str3, str2.length() + iIndexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + iIndexOf, iIndexOf2);
    }

    public static String c(String str) {
        return new String(a(Base64.decode(str, 8)));
    }

    public static boolean c(Context context, String str) {
        if (!str.startsWith("sms:") && !str.startsWith("smsto:")) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            g9.a(th);
            return false;
        }
    }

    public static int a(Activity activity, int i2, boolean z2) {
        if (z2) {
            WeakHashMap weakHashMap = f41589a;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, Integer.valueOf(activity.getRequestedOrientation()));
            }
            if (i2 == activity.getResources().getConfiguration().orientation) {
                return q0.a(activity, i2, false);
            }
            return q0.a(activity, i2, true);
        }
        WeakHashMap weakHashMap2 = f41589a;
        if (!weakHashMap2.containsKey(activity)) {
            return -1;
        }
        int iIntValue = ((Integer) weakHashMap2.get(activity)).intValue();
        int i3 = q0.f41381a;
        try {
            activity.setRequestedOrientation(iIntValue);
        } catch (Throwable unused) {
        }
        weakHashMap2.remove(activity);
        return iIntValue;
    }

    public static String b(String str) throws IOException {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(AbstractC3396g.a(byteArrayOutputStream.toByteArray()), 10);
    }

    public static List a(LinkedList linkedList, Class cls) {
        linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
        if (cls.getSuperclass() != null) {
            a(linkedList, cls.getSuperclass());
        }
        return linkedList;
    }

    public static boolean a(Serializable serializable, Serializable serializable2) {
        Object obj;
        boolean z2 = false;
        try {
            Class<?> cls = serializable2.getClass();
            LinkedList<Field> linkedList = new LinkedList();
            linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
            if (cls.getSuperclass() != null) {
                a(linkedList, (Class) cls.getSuperclass());
            }
            for (Field field : linkedList) {
                int modifiers = field.getModifiers();
                if (!Modifier.isTransient(modifiers) && !Modifier.isStatic(modifiers)) {
                    field.setAccessible(true);
                    if (field.get(serializable) == null && (obj = field.get(serializable2)) != null) {
                        field.set(serializable, obj);
                        z2 = true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return z2;
    }

    public static String b(Throwable th) {
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintWriter printWriter = new PrintWriter(a(byteArrayOutputStream));
                a(th, printWriter);
                printWriter.close();
                return byteArrayOutputStream.toString();
            } catch (Throwable unused) {
                return th.getMessage();
            }
        } catch (Throwable unused2) {
            return th.toString();
        }
    }

    public static String b(Context context) {
        PackageManager packageManager;
        String installingPackageName = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
            packageManager = null;
        }
        if (packageManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            try {
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(context.getPackageName());
                if (installSourceInfo != null) {
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                }
            } catch (Throwable unused2) {
            }
        }
        if (installingPackageName != null) {
            return installingPackageName;
        }
        try {
            return packageManager.getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused3) {
            return installingPackageName;
        }
    }

    public static String a(String str) {
        if (str != null) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }
        return "";
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static boolean a(double d2) {
        if (Double.compare(d2, 0.0d) <= 0) {
            return false;
        }
        return Double.compare(d2, 1.0d) >= 0 || Math.random() < d2;
    }

    public static boolean a(WebView webView, String str) {
        try {
            webView.loadDataWithBaseURL(MetaData.E().w(), str, "text/html", "utf-8", null);
            return true;
        } catch (Throwable th) {
            g9.a(th);
            return false;
        }
    }

    public static String a(Context context) {
        ActivityInfo activityInfo;
        String str = "";
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null && (str = activityInfo.packageName) != null) {
                return str.toLowerCase(Locale.ROOT);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static void a(WebView webView, boolean z2, String str, Object... objArr) {
        if (webView != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("if (typeof ");
                sb.append(str);
                sb.append(" === \"function\") {");
                sb.append(str);
                sb.append("(");
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    if (z2 && (objArr[i2] instanceof String)) {
                        sb.append("\"");
                        sb.append(((String) objArr[i2]).replaceAll("\"", "\\\\\""));
                        sb.append("\"");
                    } else {
                        sb.append(objArr[i2]);
                    }
                    if (i2 < objArr.length - 1) {
                        sb.append(",");
                    }
                }
                sb.append(");}");
                webView.loadUrl("javascript:" + ((Object) sb));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, new Inflater(true));
        inflaterOutputStream.write(bArr);
        inflaterOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(int... iArr) {
        int length = iArr.length;
        char[] cArr = new char[length];
        char c2 = (char) length;
        for (int i2 = 0; i2 < length; i2++) {
            c2 = (char) (c2 + iArr[i2]);
            cArr[i2] = c2;
        }
        return new String(cArr);
    }

    public static DeflaterOutputStream a(ByteArrayOutputStream byteArrayOutputStream) {
        return new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 10), new Deflater(9, true));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static StackTraceElement a(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        StackTraceElement[] stackTraceElementArrA = ui.a();
        if (stackTraceElementArrA == null) {
            return null;
        }
        String name = ui.class.getName();
        int length = stackTraceElementArrA.length;
        for (int i3 = 0; i3 < length; i3++) {
            StackTraceElement stackTraceElement = stackTraceElementArrA[i3];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i4 = i3 + 3 + i2;
                if (i4 < length) {
                    return stackTraceElementArrA[i4];
                }
                return null;
            }
        }
        return null;
    }

    public static String a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "none";
        }
        return stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + "()";
    }

    public static void a(int i2, Context context, String str) {
        boolean zA;
        Log.println(i2, "StartAppSDK", str);
        if (!d(context)) {
            int i3 = q0.f41381a;
            try {
                zA = v6.a(context);
            } catch (Throwable unused) {
                zA = false;
            }
            if (!zA) {
                return;
            }
        }
        g9 g9Var = new g9(h9.d);
        g9Var.d = "Log for a publisher";
        g9Var.f41002e = str;
        g9Var.a();
    }

    public static String a(Ad ad) {
        if (ad instanceof jj) {
            jj jjVar = (jj) ad;
            if (jjVar.getType() == Ad.AdType.VIDEO) {
                return "VIDEO";
            }
            if (jjVar.getType() == Ad.AdType.REWARDED_VIDEO) {
                return "REWARDED_VIDEO";
            }
            return "INTERSTITIAL";
        }
        if (ad instanceof xd) {
            return "OFFER_WALL";
        }
        if (ad instanceof wd) {
            return "OFFER_WALL_3D";
        }
        if (ad instanceof r1) {
            int i2 = ((r1) ad).t;
            if (i2 == 0) {
                return "BANNER";
            }
            if (i2 == 1) {
                return "MREC";
            }
            if (i2 == 2) {
                return "COVER";
            }
            return "BANNER_UNDEFINED";
        }
        if (ad instanceof b1) {
            return "BANNER_3D";
        }
        if (ad instanceof qd) {
            return "NATIVE";
        }
        return "UNDEFINED";
    }

    public static int[] a(Context context, String... strArr) {
        int[] iArr = new int[strArr.length];
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr2 = packageInfo.requestedPermissions;
            if (strArr2 != null) {
                int length = strArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    int length2 = strArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (strArr[i3].equals(packageInfo.requestedPermissions[i2])) {
                            if ((packageInfo.requestedPermissionsFlags[i2] & 2) == 2) {
                                iArr[i3] = 2;
                            } else {
                                iArr[i3] = 1;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public static boolean a(int i2, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (iArr2 != null && iArr2.length > 1 && iArr2[0] <= i2 && i2 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(Object obj, Throwable th) {
        if (obj.getClass().getName().startsWith("com.startapp.")) {
            g9.a(th);
        }
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        String className;
        di diVar = new di(th);
        while (diVar.hasNext()) {
            Throwable next = diVar.next();
            if (diVar.d) {
                printWriter.println('-');
            }
            printWriter.println(next.toString().trim());
            StackTraceElement[] stackTrace = next.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                StackTraceElement stackTraceElement = null;
                int i2 = 0;
                int i3 = 0;
                boolean z2 = false;
                while (i2 < length) {
                    StackTraceElement stackTraceElement2 = stackTrace[i2];
                    if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                        boolean z3 = i2 < 3;
                        boolean zStartsWith = className.startsWith("com.startapp.");
                        if (z3 || zStartsWith || z2) {
                            if (i3 > 0) {
                                printWriter.print(' ');
                                printWriter.println(i3);
                                i3 = 0;
                            }
                            if (stackTraceElement != null) {
                                printWriter.print(' ');
                                printWriter.print(stackTraceElement.getClassName());
                                printWriter.print('.');
                                printWriter.print(stackTraceElement.getMethodName());
                                printWriter.println("()");
                                stackTraceElement = null;
                            }
                            printWriter.print(' ');
                            printWriter.print(stackTraceElement2.getClassName());
                            printWriter.print('.');
                            printWriter.print(stackTraceElement2.getMethodName());
                            printWriter.println("()");
                        } else {
                            if (stackTraceElement != null) {
                                i3++;
                            }
                            stackTraceElement = stackTraceElement2;
                        }
                        z2 = zStartsWith;
                    }
                    i2++;
                }
                if (stackTraceElement != null) {
                    i3++;
                }
                if (i3 > 0) {
                    printWriter.print(' ');
                    printWriter.println(i3);
                }
            }
        }
    }

    public static StackTraceElement a(Throwable th) {
        String className;
        Throwable cause = th;
        while (true) {
            StackTraceElement stackTraceElement = null;
            if (cause == null) {
                return null;
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                for (StackTraceElement stackTraceElement2 : stackTrace) {
                    if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null && className.startsWith("com.startapp.")) {
                        stackTraceElement = stackTraceElement2;
                        break;
                    }
                }
            }
            if (stackTraceElement != null) {
                return stackTraceElement;
            }
            cause = cause.getCause();
        }
    }

    public static boolean a(Throwable th, Class cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static String a() {
        int iAbs = Math.abs(-2034744135);
        char[] charArray = "st{xI:>B?7=:CH".toCharArray();
        int length = charArray.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iAbs % (i2 + length);
            char c2 = charArray[i2];
            if (' ' <= c2 && c2 <= '~') {
                charArray[i2] = (char) (((((i3 * (-1)) + (c2 - ' ')) + 95) % 95) + 32);
            }
        }
        return new String(charArray);
    }
}
