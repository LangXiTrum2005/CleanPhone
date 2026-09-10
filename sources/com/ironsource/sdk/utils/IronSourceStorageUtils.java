package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.Bf;
import com.ironsource.C0474n4;
import com.ironsource.C0693z8;
import com.ironsource.InterfaceC0674y7;
import com.ironsource.Kb;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import d5.u;
import defpackage.e;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class IronSourceStorageUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30678a = "supersonicads";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Bf f30679b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f30680c = false;

    private static void a(Context context) {
        Bf bf2 = f30679b;
        if (bf2 != null && bf2.b()) {
            deleteCacheDirectories(context);
        }
        Bf bf3 = f30679b;
        if (bf3 == null || !bf3.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static File b(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        Bf bf2 = f30679b;
        return (bf2 == null || !bf2.d()) ? interfaceC0674y7A.g(context) : interfaceC0674y7A.m(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return e.q(File.separator, str2, u.i(str));
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Object objC = c(file2);
                    if (objC instanceof JSONArray) {
                        jSONObject.put("files", c(file2));
                    } else if (objC instanceof JSONObject) {
                        jSONObject.put(file2.getName(), c(file2));
                    }
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(C0693z8 c0693z8, JSONObject jSONObject) throws Exception {
        if (c0693z8 == null || !c0693z8.isDirectory()) {
            return new JSONObject();
        }
        File[] fileArrListFiles = c0693z8.listFiles();
        if (fileArrListFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : fileArrListFiles) {
            C0693z8 c0693z9 = new C0693z8(file.getPath());
            if (c0693z9.isFile()) {
                String name = c0693z9.getName();
                JSONObject jSONObjectA = c0693z9.a();
                if (jSONObject.has(name)) {
                    jSONObject2.put(name, SDKUtils.mergeJSONObjects(jSONObjectA, jSONObject.getJSONObject(name)));
                } else {
                    jSONObject2.put(name, jSONObjectA);
                }
            } else if (c0693z9.isDirectory()) {
                jSONObject2.put(c0693z9.getName(), buildFilesMapOfDirectory(c0693z9, jSONObject));
            }
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        Bf bf2 = f30679b;
        return (bf2 == null || !bf2.d()) ? interfaceC0674y7A.k(context) : interfaceC0674y7A.C(context);
    }

    public static void deleteCacheDirectories(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        a(interfaceC0674y7A.m(context));
        a(interfaceC0674y7A.C(context));
    }

    public static synchronized boolean deleteFile(C0693z8 c0693z8) {
        if (!c0693z8.exists()) {
            return false;
        }
        return c0693z8.delete();
    }

    public static void deleteFilesDirectories(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        a(interfaceC0674y7A.g(context));
        a(interfaceC0674y7A.k(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        File file;
        file = new File(str);
        return deleteFolderContentRecursive(file) && file.delete();
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        Bf bf2 = f30679b;
        if (bf2 == null || !bf2.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new Exception(X3.c.f27710u.concat(canonicalPath2));
            }
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileB;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (fileB = b(context)) == null || !fileB.canWrite()) {
            return c(context).getPath();
        }
        f30680c = true;
        return fileB.getPath();
    }

    public static ArrayList<C0693z8> getFilesInFolderRecursive(C0693z8 c0693z8) {
        if (c0693z8 == null || !c0693z8.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C0693z8> arrayList = new ArrayList<>();
        File[] fileArrListFiles = c0693z8.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                C0693z8 c0693z9 = new C0693z8(file.getPath());
                if (c0693z9.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c0693z9));
                }
                if (c0693z9.isFile()) {
                    arrayList.add(c0693z9);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileB = b(new File(getDiskCacheDirPath(context)));
        if (!fileB.exists()) {
            fileB.mkdir();
        }
        return fileB.getPath();
    }

    public static long getTotalSizeOfDir(C0693z8 c0693z8) {
        long totalSizeOfDir;
        long j10 = 0;
        if (c0693z8 != null && c0693z8.isDirectory()) {
            File[] fileArrListFiles = c0693z8.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                C0693z8 c0693z9 = new C0693z8(file.getPath());
                if (c0693z9.isFile()) {
                    totalSizeOfDir = c0693z9.length();
                } else {
                    if (c0693z9.isDirectory()) {
                        totalSizeOfDir = getTotalSizeOfDir(c0693z9);
                    }
                }
                j10 = totalSizeOfDir + j10;
            }
        }
        return j10;
    }

    public static void initializeCacheDirectory(Context context, Bf bf2) {
        f30679b = bf2;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f30680c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C0693z8 c0693z8) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c0693z8));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(line);
            sb2.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        File file = new File(str);
        File file2 = new File(str2);
        File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return 0;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i10 = 0;
            while (true) {
                int i11 = byteArrayInputStream.read(bArr2);
                if (i11 == -1) {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return i10;
                }
                fileOutputStream.write(bArr2, 0, i11);
                i10 += i11;
            }
        } catch (Throwable th2) {
            fileOutputStream.close();
            byteArrayInputStream.close();
            throw th2;
        }
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        String str = File.separator;
        return new File(a.j(sb2, str, f30678a, str));
    }

    private static Object c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (file.isFile()) {
                jSONArray.put(file.getName());
                return jSONArray;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    jSONObject.put(file2.getName(), c(file2));
                } else {
                    jSONArray.put(file2.getName());
                    jSONObject.put("files", jSONArray);
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    private static boolean a() {
        Bf bf2 = f30679b;
        return bf2 != null && bf2.a();
    }
}
