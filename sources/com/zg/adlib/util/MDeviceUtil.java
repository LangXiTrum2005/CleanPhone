package com.zg.adlib.util;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaDrm;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.crashlytics.internal.model.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MDeviceUtil {
    private static final X500Principal DEBUG_DN = new X500Principal("CN=Android Debug,O=Android,C=US");
    private static final String TAG = "DeviceUtilCC";

    public static <V> boolean addDistinctEntry(List<V> list, V v) {
        if (list == null || list.contains(v)) {
            return false;
        }
        return list.add(v);
    }

    public static <V> int addDistinctList(List<V> list, List<V> list2) {
        if (list == null || isEmpty(list2)) {
            return 0;
        }
        int size = list.size();
        for (V v : list2) {
            if (!list.contains(v)) {
                list.add(v);
            }
        }
        return list.size() - size;
    }

    public static <V> boolean addListNotNullValue(List<V> list, V v) {
        if (list == null || v == null) {
            return false;
        }
        return list.add(v);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                throw new RuntimeException("IOException occurred. ", e2);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static <V> int compare(V v, V v2) {
        if (v == null) {
            return v2 == null ? 0 : -1;
        }
        if (v2 == null) {
            return 1;
        }
        return ((Comparable) v).compareTo(v2);
    }

    public static <V> int distinctList(List<V> list) {
        int i2 = 0;
        if (isEmpty(list)) {
            return 0;
        }
        int size = list.size();
        int size2 = list.size();
        while (i2 < size2) {
            int i3 = i2 + 1;
            int i4 = i3;
            while (i4 < size2) {
                if (list.get(i2).equals(list.get(i4))) {
                    list.remove(i4);
                    size2 = list.size();
                    i4--;
                }
                i4++;
            }
            i2 = i3;
        }
        return size - list.size();
    }

    public static int gc(Context context) {
        int i2;
        getDeviceUsableMemory(context);
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(100);
        if (runningServices != null) {
            i2 = 0;
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.pid != Process.myPid()) {
                    try {
                        Process.killProcess(runningServiceInfo.pid);
                        i2++;
                    } catch (Exception e2) {
                        e2.getStackTrace();
                    }
                }
            }
        } else {
            i2 = 0;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance > 200) {
                    for (String str : runningAppProcessInfo.pkgList) {
                        try {
                            activityManager.killBackgroundProcesses(str);
                            i2++;
                        } catch (Exception e3) {
                            e3.getStackTrace();
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static String generateImmutableUUID() {
        String string;
        MessageDigest messageDigest = null;
        try {
            string = Build.class.getField("SERIAL").get(null).toString();
        } catch (Exception unused) {
            string = "";
        }
        String drmDeviceId = getDrmDeviceId();
        StringBuilder sb = new StringBuilder("23");
        a.r(10, Build.HOST, sb);
        a.r(10, Build.ID, sb);
        a.r(10, Build.MANUFACTURER, sb);
        a.r(10, Build.MODEL, sb);
        a.r(10, Build.PRODUCT, sb);
        a.r(10, Build.TAGS, sb);
        a.r(10, Build.TYPE, sb);
        a.r(10, Build.BOARD, sb);
        a.r(10, Build.BRAND, sb);
        a.r(10, Build.CPU_ABI, sb);
        a.r(10, Build.DEVICE, sb);
        a.r(10, Build.DISPLAY, sb);
        sb.append(Build.USER.length() % 10);
        String strD = android.support.v4.media.a.D(string, sb.toString(), drmDeviceId);
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception unused2) {
        }
        messageDigest.update(strD.getBytes(Charsets.f44691a), 0, strD.length());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (byte b2 : bArrDigest) {
            int i2 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i2 <= 15) {
                sb2.append("0");
            }
            sb2.append(Integer.toHexString(i2));
        }
        return new StringBuilder(sb2.toString().toLowerCase(Locale.getDefault())).toString();
    }

    public static List<PackageInfo> getAllApps(Context context) {
        ArrayList arrayList = new ArrayList();
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        for (int i2 = 0; i2 < installedPackages.size(); i2++) {
            PackageInfo packageInfo = installedPackages.get(i2);
            if ((packageInfo.applicationInfo.flags & 1) <= 0) {
                arrayList.add(packageInfo);
            }
        }
        return arrayList;
    }

    public static int getDeviceUsableMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    private static String getDrmDeviceId() {
        UUID uuid = new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-2129748144642739255L, 8654423357094679310L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
        try {
            return Base64.encodeToString(new MediaDrm(uuid).getPropertyByteArray("deviceUniqueId"), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getNumCores() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.zg.adlib.util.MDeviceUtil.1
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            }).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static String getSign(Context context, String str) {
        try {
            return hexdigest(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static <V> int getSize(List<V> list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static String getUUID(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String str = "" + telephonyManager.getDeviceId();
        return new UUID(("" + Settings.Secure.getString(context.getContentResolver(), "android_id")).hashCode(), ((long) ("" + telephonyManager.getSimSerialNumber()).hashCode()) | (((long) str.hashCode()) << 32)).toString();
    }

    public static int getVerCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static String getVerName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static String hexdigest(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i2 = 0;
            int i3 = 0;
            while (i2 < 16) {
                byte b2 = bArrDigest[i2];
                cArr2[i3] = cArr[(b2 >>> 4) & 15];
                cArr2[i3 + 1] = cArr[b2 & 15];
                i2++;
                i3 += 2;
            }
            return new String(cArr2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void installApk(Context context, File file) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    public static <V> List<V> invertList(List<V> list) {
        if (isEmpty(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayList.add(list.get(size));
        }
        return arrayList;
    }

    public static boolean isApplicationInBackground(Context context) {
        ComponentName componentName;
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        return (runningTasks == null || runningTasks.isEmpty() || (componentName = runningTasks.get(0).topActivity) == null || componentName.getPackageName().equals(context.getPackageName())) ? false : true;
    }

    public static boolean isDebuggable(Context context) {
        try {
            boolean zEquals = false;
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                try {
                    zEquals = ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(DEBUG_DN);
                    if (zEquals) {
                        return zEquals;
                    }
                } catch (PackageManager.NameNotFoundException | CertificateException unused) {
                    return zEquals;
                }
            }
            return zEquals;
        } catch (PackageManager.NameNotFoundException | CertificateException unused2) {
            return false;
        }
    }

    public static <V> boolean isEmpty(List<V> list) {
        return list == null || list.size() == 0;
    }

    public static boolean isMainProcess(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        String packageName = context.getPackageName();
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid && packageName.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNamedProcess(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager.getRunningAppProcesses() == null) {
                return true;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == iMyPid && str.equalsIgnoreCase(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isServiceRunning(Context context, String str) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (str.equals(it.next().service.getClassName())) {
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean isValidStrictDeviceID(String str) {
        if (str == null) {
            return false;
        }
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 36 && lowerCase.charAt(8) == '-' && lowerCase.charAt(13) == '-' && lowerCase.charAt(18) == '-' && lowerCase.charAt(23) == '-') {
                String strSubstring = lowerCase.substring(0, 8);
                String strSubstring2 = lowerCase.substring(9, 13);
                String strSubstring3 = lowerCase.substring(14, 18);
                String strSubstring4 = lowerCase.substring(19, 23);
                String strSubstring5 = lowerCase.substring(24, 36);
                if (strSubstring.matches("[0-9a-f]{8}") && strSubstring2.matches("[0-9a-f]{4}") && strSubstring3.matches("[0-9a-f]{4}") && strSubstring4.matches("[0-9a-f]{4}") && strSubstring5.matches("[0-9a-f]{12}")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String join(List<String> list, char c2) {
        return join(list, new String(new char[]{c2}));
    }

    public static String nullStrToEmpty(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj instanceof String ? (String) obj : obj.toString();
    }

    public static boolean stopRunningService(Context context, String str) {
        Intent intent;
        try {
            intent = new Intent(context, Class.forName(str));
        } catch (Exception e2) {
            e2.printStackTrace();
            intent = null;
        }
        if (intent != null) {
            return context.stopService(intent);
        }
        return false;
    }

    public static Integer[] transformIntArray(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    public static Long[] transformLongArray(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    public static void uninstallApk(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DELETE");
        intent.setData(Uri.parse("package:" + str));
        context.startActivity(intent);
    }

    public String decryptA(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("logA");
            String string2 = jSONObject.getString("hashA");
            byte[] bArrDecode = Base64.decode(string, 0);
            byte[] bArrDecode2 = Base64.decode(string2, 0);
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str2.getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArrDigest, "AES"), new IvParameterSpec(bArrDecode2));
            return new String(cipher.doFinal(bArrDecode), "UTF-8");
        } catch (Exception unused) {
            Log.e(TAG, "error");
            return AbstractJsonLexerKt.NULL;
        }
    }

    public String decryptB(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("logB");
            String string2 = jSONObject.getString("hashB");
            byte[] bArrDecode = Base64.decode(string, 0);
            byte[] bArrDecode2 = Base64.decode(string2, 0);
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str2.getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArrDigest, "AES"), new IvParameterSpec(bArrDecode2));
            return new String(cipher.doFinal(bArrDecode), "UTF-8");
        } catch (Exception unused) {
            Log.e(TAG, "error");
            return AbstractJsonLexerKt.NULL;
        }
    }

    public String decryptC(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("log");
            String string2 = jSONObject.getString("hash");
            byte[] bArrDecode = Base64.decode(string, 0);
            byte[] bArrDecode2 = Base64.decode(string2, 0);
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str2.getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArrDigest, "AES"), new IvParameterSpec(bArrDecode2));
            return new String(cipher.doFinal(bArrDecode), "UTF-8");
        } catch (Exception unused) {
            Log.e(TAG, "error");
            return "";
        }
    }

    public static String join(List<String> list, String str) {
        return list == null ? "" : TextUtils.join(str, list);
    }

    public static int[] transformIntArray(Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i2 = 0; i2 < numArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public static long[] transformLongArray(Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i2 = 0; i2 < lArr.length; i2++) {
            jArr[i2] = lArr[i2].longValue();
        }
        return jArr;
    }

    public static void installApk(Context context, Uri uri) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        context.startActivity(intent);
    }
}
