package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.fl;
import com.p004ironsource.ne;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f33487a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f33488b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f33489c = false;
    private static String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f33490e = null;
    private static String f = null;
    private static int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f33491h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f33492i = 0;
    private static volatile long j = -1;

    public static void a(File file, boolean z2) throws Throwable {
        e eVarA;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    if (TextUtils.isEmpty(f33487a) && (eVarA = a(file)) != null) {
                        f33487a = a(eVarA.a());
                        d = eVarA.b();
                        if (z2) {
                            a();
                            randomAccessFile2.close();
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(f33490e)) {
                        f33490e = a(randomAccessFile2);
                    }
                    if (f33491h == 0) {
                        f33491h = randomAccessFile2.length() / 1024;
                    }
                    if (f33492i == 0) {
                        f33492i = b(file);
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException unused2) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused6) {
        }
    }

    public static String b() throws Throwable {
        long j2;
        boolean z2;
        String string;
        String string2;
        String string3;
        String string4;
        long j3;
        long j4;
        int i2;
        String str;
        if (TextUtils.isEmpty(f33487a) || TextUtils.isEmpty(f33490e) || g == -1) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            long j5 = -1;
            if (sharedPreferencesA != null) {
                j5 = sharedPreferencesA.getLong(ne.Y0, -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j3 = sharedPreferencesA.getLong("as", 0L);
                j4 = sharedPreferencesA.getLong("ds", 0L);
                z2 = true;
                i2 = sharedPreferencesA.getInt("cpc", -1);
                j2 = 0;
                string = sharedPreferencesA.getString(fl.SESSION_HISTORY_KEY_AD_PROVIDER, null);
            } else {
                j2 = 0;
                z2 = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j3 = 0;
                j4 = 0;
                i2 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            str = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), strC);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z2 ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j5 || string2 == null || i2 == -1) {
                j = jLastModified;
                if (str2 != null) {
                    f = str2;
                }
                if (num != null) {
                    g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f33487a = string2;
                d = string3;
                f33491h = j3;
                f33492i = j4;
                f33490e = string4;
                g = i2;
                f = string;
            }
        } else {
            j2 = 0;
            str = null;
            z2 = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f33487a)) {
                jSONObject.put("sign", f33487a);
            }
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put("subject", d);
            }
            if (!TextUtils.isEmpty(f33490e)) {
                jSONObject.put("md5", f33490e);
            }
            if (!TextUtils.isEmpty(f)) {
                jSONObject.put("path", f);
            }
            long j6 = f33491h;
            if (j6 != j2) {
                jSONObject.put("apkSize", j6);
            }
            long j7 = f33492i;
            if (j7 != j2) {
                jSONObject.put("dexSize", j7);
            }
            int i3 = g;
            if (i3 != -1) {
                jSONObject.put("code", i3);
            }
            e();
            jSONObject.put("signpm", f33488b);
            if (!TextUtils.isEmpty(f33488b) && !TextUtils.isEmpty(f33487a)) {
                if (!f33488b.equals(f33487a)) {
                    f33489c = z2;
                }
                jSONObject.put("rebud", f33489c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String c() {
        if (z.a() == null) {
            return null;
        }
        String packageCodePath = z.a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f33487a)) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            String string = null;
            long j2 = -1;
            if (sharedPreferencesA != null) {
                j2 = sharedPreferencesA.getLong(ne.Y0, -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j2 || string == null) {
                j = jLastModified;
                a(file, true);
                a();
            } else {
                f33487a = string;
            }
        }
        e();
        if (TextUtils.isEmpty(f33488b) || TextUtils.isEmpty(f33487a) || f33488b.equals(f33487a)) {
            return;
        }
        f33489c = true;
    }

    public static String e() {
        if (!TextUtils.isEmpty(f33488b)) {
            return f33488b;
        }
        try {
            String strA = a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
            f33488b = strA;
            return strA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f() throws Throwable {
        d();
        return f33489c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f33487a)) {
                sharedPreferencesA.edit().putString("sa", f33487a).apply();
            }
            if (!TextUtils.isEmpty(f33490e)) {
                sharedPreferencesA.edit().putString("md5", f33490e).apply();
            }
            if (!TextUtils.isEmpty(d)) {
                sharedPreferencesA.edit().putString("sj", d).apply();
            }
            if (f33491h != 0) {
                sharedPreferencesA.edit().putLong("as", f33491h).apply();
            }
            if (f33492i != 0) {
                sharedPreferencesA.edit().putLong("ds", f33492i).apply();
            }
            if (j != -1) {
                sharedPreferencesA.edit().putLong(ne.Y0, j).apply();
            }
            if (g != -1) {
                sharedPreferencesA.edit().putInt("cpc", g).apply();
            }
            if (TextUtils.isEmpty(f)) {
                return;
            }
            sharedPreferencesA.edit().putString(fl.SESSION_HISTORY_KEY_AD_PROVIDER, f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @DungeonFlag
    private static e a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        List<e> listA;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    q qVarA = r.a(randomAccessFile, 0L, randomAccessFile.length());
                    listA = l.a(qVarA, c.a(qVarA));
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                } catch (g.a unused2) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                } catch (Throwable unused3) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                }
            } catch (g.a unused4) {
                randomAccessFile = null;
            } catch (Throwable unused5) {
                randomAccessFile = null;
            }
        } catch (IOException unused6) {
            listA = null;
        }
        if (listA == null || listA.isEmpty()) {
            listA = k.a(file);
        }
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return listA.get(0);
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i2 = 0;
                int size = 0;
                while (true) {
                    if (i2 == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i2));
                    }
                    try {
                        ZipEntry entry = zipFile2.getEntry(str);
                        if (entry == null) {
                            break;
                        }
                        size = (int) (((long) size) + entry.getSize());
                        i2++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j2 = size / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j2;
            } catch (ZipException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused7) {
            return 0L;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i2 = randomAccessFile.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(string);
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
