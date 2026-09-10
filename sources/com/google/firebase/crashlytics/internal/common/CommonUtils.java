package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import com.google.firebase.crashlytics.internal.Logger;
import com.inmobi.commons.core.configs.AdConfig;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Scanner;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f20310a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Architecture {
        public static final Architecture X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final HashMap f20311Y;
        public static final /* synthetic */ Architecture[] Z;

        /* JADX INFO: Fake field, exist only in values array */
        Architecture EF0;

        static {
            Architecture architecture = new Architecture("X86_32", 0);
            Architecture architecture2 = new Architecture("X86_64", 1);
            Architecture architecture3 = new Architecture("ARM_UNKNOWN", 2);
            Architecture architecture4 = new Architecture("PPC", 3);
            Architecture architecture5 = new Architecture("PPC64", 4);
            Architecture architecture6 = new Architecture("ARMV6", 5);
            Architecture architecture7 = new Architecture("ARMV7", 6);
            Architecture architecture8 = new Architecture("UNKNOWN", 7);
            X = architecture8;
            Architecture architecture9 = new Architecture("ARMV7S", 8);
            Architecture architecture10 = new Architecture("ARM64", 9);
            Z = new Architecture[]{architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10};
            HashMap map = new HashMap(4);
            f20311Y = map;
            map.put("armeabi-v7a", architecture7);
            map.put("armeabi", architecture6);
            map.put("arm64-v8a", architecture10);
            map.put("x86", architecture);
        }

        public static Architecture valueOf(String str) {
            return (Architecture) Enum.valueOf(Architecture.class, str);
        }

        public static Architecture[] values() {
            return (Architecture[]) Z.clone();
        }
    }

    public static synchronized long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static void b(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Logger.f20289a.c(e2, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int c() {
        boolean zF = f();
        ?? r0 = zF;
        if (g()) {
            r0 = (zF ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static int d(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String e(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i4 = i2 * 2;
            char[] cArr2 = f20310a;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean f() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean g() {
        boolean zF = f();
        String str = Build.TAGS;
        if ((zF || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zF && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String h(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bytes);
            return e(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            Logger.f20289a.c(e2, "Could not create hashing algorithm: SHA-1, returning empty string.");
            return "";
        }
    }

    public static String i(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
