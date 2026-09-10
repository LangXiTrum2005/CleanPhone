package com.p004ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.support.v4.media.a;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.vf;
import com.p004ironsource.vh;
import com.p004ironsource.vu;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceStorageUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27159a = "supersonicads";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static vu f27160b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27161c = false;

    private static void a(Context context) {
        vu vuVar = f27160b;
        if (vuVar != null && vuVar.b()) {
            deleteCacheDirectories(context);
        }
        vu vuVar2 = f27160b;
        if (vuVar2 == null || !vuVar2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static File b(Context context) {
        vf vfVarF = on.U().f();
        vu vuVar = f27160b;
        return (vuVar == null || !vuVar.d()) ? vfVarF.u(context) : vfVarF.e(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        return str2 == null ? str : a.r(a.w(str), File.separator, str2);
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        String name;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Object objC = c(file2);
                    if (objC instanceof JSONArray) {
                        name = "files";
                    } else {
                        if (objC instanceof JSONObject) {
                            name = file2.getName();
                        }
                    }
                    jSONObject.put(name, c(file2));
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(vh vhVar, JSONObject jSONObject) throws Exception {
        String name;
        JSONObject jSONObjectBuildFilesMapOfDirectory;
        if (vhVar == null || !vhVar.isDirectory()) {
            return new JSONObject();
        }
        File[] fileArrListFiles = vhVar.listFiles();
        if (fileArrListFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : fileArrListFiles) {
            vh vhVar2 = new vh(file.getPath());
            if (vhVar2.isFile()) {
                name = vhVar2.getName();
                jSONObjectBuildFilesMapOfDirectory = vhVar2.a();
                if (jSONObject.has(name)) {
                    jSONObjectBuildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(jSONObjectBuildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                }
            } else {
                if (vhVar2.isDirectory()) {
                    name = vhVar2.getName();
                    jSONObjectBuildFilesMapOfDirectory = buildFilesMapOfDirectory(vhVar2, jSONObject);
                }
            }
            jSONObject2.put(name, jSONObjectBuildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        vf vfVarF = on.U().f();
        vu vuVar = f27160b;
        return (vuVar == null || !vuVar.d()) ? vfVarF.x(context) : vfVarF.k(context);
    }

    public static void deleteCacheDirectories(Context context) {
        vf vfVarF = on.U().f();
        a(vfVarF.e(context));
        a(vfVarF.k(context));
    }

    public static synchronized boolean deleteFile(vh vhVar) {
        if (!vhVar.exists()) {
            return false;
        }
        return vhVar.delete();
    }

    public static void deleteFilesDirectories(Context context) {
        vf vfVarF = on.U().f();
        a(vfVarF.u(context));
        a(vfVarF.x(context));
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
        vu vuVar = f27160b;
        if (vuVar == null || !vuVar.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new Exception(d9.c.f24659u.concat(canonicalPath2));
            }
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileB;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (fileB = b(context)) == null || !fileB.canWrite()) {
            return c(context).getPath();
        }
        f27161c = true;
        return fileB.getPath();
    }

    public static ArrayList<vh> getFilesInFolderRecursive(vh vhVar) {
        if (vhVar == null || !vhVar.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<vh> arrayList = new ArrayList<>();
        File[] fileArrListFiles = vhVar.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                vh vhVar2 = new vh(file.getPath());
                if (vhVar2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(vhVar2));
                }
                if (vhVar2.isFile()) {
                    arrayList.add(vhVar2);
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

    public static long getTotalSizeOfDir(vh vhVar) {
        long totalSizeOfDir;
        long j = 0;
        if (vhVar != null && vhVar.isDirectory()) {
            File[] fileArrListFiles = vhVar.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                vh vhVar2 = new vh(file.getPath());
                if (vhVar2.isFile()) {
                    totalSizeOfDir = vhVar2.length();
                } else {
                    if (vhVar2.isDirectory()) {
                        totalSizeOfDir = getTotalSizeOfDir(vhVar2);
                    }
                }
                j = totalSizeOfDir + j;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, vu vuVar) {
        f27160b = vuVar;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f27161c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(vh vhVar) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(vhVar));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i2 = 0;
            while (true) {
                int i3 = byteArrayInputStream.read(bArr2);
                if (i3 == -1) {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return i2;
                }
                fileOutputStream.write(bArr2, 0, i3);
                i2 += i3;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            byteArrayInputStream.close();
            throw th;
        }
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        return new File(a.s(sb, str, f27159a, str));
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
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static boolean a() {
        vu vuVar;
        return Build.VERSION.SDK_INT > 29 && (vuVar = f27160b) != null && vuVar.a();
    }
}
