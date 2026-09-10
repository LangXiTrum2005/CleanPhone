package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<String> f2453a = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2454a;
        public String b;

        public a(int i, String... strArr) {
            this.f2454a = i;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.b = jSONArray.toString();
        }
    }

    private static File a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            p0.a(file.getAbsolutePath());
        }
        return file;
    }

    public static synchronized a b(Context context, String str) {
        if (f2453a.contains(str)) {
            return null;
        }
        try {
            System.loadLibrary(str);
            f2453a.add(str);
        } catch (UnsatisfiedLinkError e) {
            File fileA = a(context, str);
            if (fileA == null) {
                return new a(3, e.getMessage(), "output null");
            }
            if (fileA.exists()) {
                fileA.delete();
            }
            a aVarA = a(context, str, fileA);
            if (aVarA != null) {
                return aVarA;
            }
            try {
                System.load(fileA.getAbsolutePath());
                f2453a.add(str);
            } catch (Throwable th) {
                return new a(3, e.getMessage(), th.getMessage());
            }
        } catch (Throwable th2) {
            return new a(3, th2.getMessage());
        }
        return null;
    }

    private static File a(Context context, String str) {
        String strMapLibraryName = System.mapLibraryName(str);
        File fileA = a(context);
        if (fileA != null) {
            return new File(fileA, strMapLibraryName);
        }
        return null;
    }

    private static a a(Context context, String str, File file) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry zipEntryA = a(zipFile2, Build.CPU_ABI, str);
                if (zipEntryA == null) {
                    try {
                        zipEntryA = a(zipFile2, Build.CPU_ABI2, str);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = null;
                        fileOutputStream = null;
                        zipFile = zipFile2;
                        try {
                            return new a(3, th.getMessage());
                        } finally {
                            p0.a(fileOutputStream);
                            p0.a(inputStream);
                            p0.a(zipFile);
                        }
                    }
                }
                if (zipEntryA != null) {
                    file.createNewFile();
                    InputStream inputStream2 = zipFile2.getInputStream(zipEntryA);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[16384];
                            while (true) {
                                int i = inputStream2.read(bArr);
                                if (i > 0) {
                                    fileOutputStream2.write(bArr, 0, i);
                                } else {
                                    p0.a(file.getAbsolutePath(), 493);
                                    p0.a(fileOutputStream2);
                                    p0.a(inputStream2);
                                    p0.a(zipFile2);
                                    return null;
                                }
                            }
                        } catch (Throwable th2) {
                            zipFile = zipFile2;
                            inputStream = inputStream2;
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            return new a(3, th.getMessage());
                        }
                    } catch (Throwable th3) {
                        inputStream = inputStream2;
                        th = th3;
                        fileOutputStream = null;
                        zipFile = zipFile2;
                        return new a(3, th.getMessage());
                    }
                } else {
                    a aVar = new a(2, a(zipFile2, str));
                    p0.a((Closeable) null);
                    p0.a((Closeable) null);
                    p0.a(zipFile2);
                    return aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    private static String a(ZipFile zipFile, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List listAsList = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList2 = new ArrayList();
        String str3 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        String str4 = Build.CPU_ABI2;
        if (!TextUtils.isEmpty(str4)) {
            arrayList2.add(str4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", listAsList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str, String str2) {
        StringBuilder sbU = AbstractC3950lJ.u("lib/", str, "/");
        sbU.append(System.mapLibraryName(str2));
        ZipEntry entry = zipFile.getEntry(sbU.toString());
        if (entry != null) {
            return entry;
        }
        int iIndexOf = str.indexOf(45);
        StringBuilder sb = new StringBuilder("lib/");
        if (iIndexOf <= 0) {
            iIndexOf = str.length();
        }
        sb.append(str.substring(0, iIndexOf));
        sb.append("/");
        sb.append(System.mapLibraryName(str2));
        return zipFile.getEntry(sb.toString());
    }
}
