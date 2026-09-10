package com.apm.insight.l;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.fl;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.n.mo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f10228c;
    private byte[] d;

    public f(int i2) {
        this.f10226a = i2;
    }

    public static void a(File file, String str, boolean z2) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z2);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                com.apm.insight.a.a((Closeable) fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                com.apm.insight.a.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String b(File file, String str) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        com.apm.insight.a.a((Closeable) bufferedReader2);
                        return sb.toString();
                    }
                    if (sb.length() != 0 && str != null) {
                        sb.append(str);
                    }
                    sb.append(line);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Map<String, String> c(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    properties.load(fileInputStream);
                    Set<String> setStringPropertyNames = properties.stringPropertyNames();
                    HashMap map = new HashMap();
                    for (String str : setStringPropertyNames) {
                        map.put(str, properties.getProperty(str));
                    }
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    return map;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    com.apm.insight.a.a((Closeable) fileInputStream2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                com.apm.insight.a.b((Throwable) e);
                com.apm.insight.a.a((Closeable) fileInputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.apm.insight.a.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    public static void d(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.c(file2.getAbsolutePath());
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        }
    }

    public static boolean e(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int iC = NativeImpl.c(file.getAbsolutePath());
            if (iC > 0) {
                NativeImpl.a(iC);
                return false;
            }
            if (iC < 0) {
                return true;
            }
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        }
        return false;
    }

    private static com.apm.insight.entity.a f(File file) {
        com.apm.insight.entity.a aVarA = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z2 = false;
        for (int i2 = 0; i2 < 6; i2++) {
            File fileA = j.a(file, mo.ono.concat(String.valueOf(i2)));
            if (fileA.exists()) {
                try {
                    aVarA.c(new JSONObject(a(fileA.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX)));
                    z2 = true;
                } catch (Throwable unused) {
                }
            }
        }
        aVarA.a("crash_type", z2 ? "step" : "simple");
        JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject(com.smartdigimkt.x.g.f39716B);
        com.apm.insight.e.g();
        JSONObject jSONObjectF = Header.a(aVarA.c().optLong("crash_time", 0L)).f();
        if (jSONObjectOptJSONObject == null) {
            aVarA.a(jSONObjectF);
        } else {
            com.apm.insight.a.a(jSONObjectOptJSONObject, jSONObjectF);
        }
        return aVarA;
    }

    public f(byte[] bArr) {
        this.f10226a = 204;
        this.d = bArr;
    }

    public f(int i2, Throwable th) {
        this.f10226a = i2;
        this.f10227b = th.getMessage();
    }

    public static void a(File file, JSONObject jSONObject) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                h.a(jSONObject, bufferedWriter);
                com.apm.insight.a.a((Closeable) bufferedWriter);
            } catch (Throwable unused) {
                com.apm.insight.a.a((Closeable) bufferedWriter);
            }
        } catch (Throwable unused2) {
            bufferedWriter = null;
        }
    }

    public f(String str) {
        this.f10226a = 206;
        this.f10227b = str;
    }

    public static boolean b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    public static void a(File file, JSONArray jSONArray) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                h.a(jSONArray, bufferedWriter);
                com.apm.insight.a.a((Closeable) bufferedWriter);
            } catch (Throwable unused) {
                com.apm.insight.a.a((Closeable) bufferedWriter);
            }
        } catch (Throwable unused2) {
            bufferedWriter = null;
        }
    }

    public static com.apm.insight.f.b c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(a(str, IOUtils.LINE_SEPARATOR_UNIX));
            com.apm.insight.f.b bVar = new com.apm.insight.f.b();
            bVar.d(jSONObject.optString(fl.SESSION_HISTORY_KEY_AD_ID));
            bVar.c(jSONObject.optString("did"));
            bVar.e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alogFiles");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i2));
                }
                bVar.a(arrayList);
            }
            return bVar;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public f(JSONObject jSONObject) {
        this.f10226a = 0;
        this.f10228c = jSONObject;
    }

    private static String b(File file, String str, String str2, JSONObject jSONObject, boolean z2) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", z2);
            a(file2, jSONObject2);
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    public static boolean a(File file) {
        boolean zA;
        boolean z2 = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        for (int i2 = 0; fileArrListFiles != null && i2 < fileArrListFiles.length; i2++) {
            if (fileArrListFiles[i2].isFile()) {
                if (fileArrListFiles[i2].canWrite()) {
                    zA = fileArrListFiles[i2].delete();
                } else {
                    z2 = false;
                }
            } else {
                zA = a(fileArrListFiles[i2]);
            }
            z2 &= zA;
        }
        return file.delete() & z2;
    }

    public static void b(String str, String str2) throws Exception {
        ZipOutputStream zipOutputStream;
        Throwable th;
        File file = new File(str);
        try {
            new File(str2).getParentFile().mkdirs();
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
            try {
                a(zipOutputStream, file, "");
                com.apm.insight.a.a((Closeable) zipOutputStream);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.a.a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            zipOutputStream = null;
            th = th3;
        }
    }

    public static String a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(new File(str), str2);
    }

    public static com.apm.insight.f.b b(String str) {
        try {
            String strA = a(str, IOUtils.LINE_SEPARATOR_UNIX);
            if (strA == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strA);
            com.apm.insight.f.b bVar = new com.apm.insight.f.b();
            bVar.a(jSONObject.optString("url"));
            bVar.a(jSONObject.optJSONObject("body"));
            bVar.b(jSONObject.optString("dump_file"));
            bVar.a(jSONObject.optBoolean("encrypt", false));
            return bVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(File file, String str) throws IOException {
        return b(file, str);
    }

    public static JSONArray a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), -1L);
    }

    public static JSONArray a(File file, long j) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line != null) {
                    jSONArray.put(line);
                } else {
                    com.apm.insight.a.a((Closeable) bufferedReader2);
                    return jSONArray;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final byte[] b() {
        return this.d;
    }

    public static com.apm.insight.f.b a(File file, CrashType crashType) {
        String strC;
        com.apm.insight.entity.a aVarF = f(file);
        String name = file.getName();
        String strSubstring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject jSONObjectOptJSONObject = aVarF.c().optJSONObject(com.smartdigimkt.x.g.f39716B);
        if (jSONObjectOptJSONObject.optString("unique_key", null) == null) {
            try {
                jSONObjectOptJSONObject.put("unique_key", "android_" + com.apm.insight.e.c().a() + "_" + strSubstring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        com.apm.insight.f.b bVar = new com.apm.insight.f.b();
        if (crashType == CrashType.LAUNCH) {
            strC = com.apm.insight.k.e.e();
        } else {
            strC = com.apm.insight.k.e.c();
        }
        bVar.a(strC);
        bVar.a(aVarF.c());
        bVar.a(com.apm.insight.k.e.a());
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    private static com.apm.insight.entity.a a(File file, boolean z2) {
        String strA;
        String str;
        String str2;
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        String string = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
        if (file.exists()) {
            try {
                strA = a(file.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
            } catch (IOException unused) {
                strA = null;
            }
            if (TextUtils.isEmpty(strA)) {
                if (z2) {
                    string = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
                }
                str2 = null;
                str = null;
            } else {
                String[] strArrSplit = strA.split(IOUtils.LINE_SEPARATOR_UNIX);
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                boolean z3 = false;
                boolean z4 = false;
                for (String str3 : strArrSplit) {
                    if (!z3 && str3.startsWith("stack:")) {
                        z3 = true;
                    } else if (!z4 && str3.startsWith("err:")) {
                        z4 = true;
                    } else if (z4) {
                        sb2.append(str3);
                        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    } else if (z3) {
                        sb.append(str3);
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    } else {
                        arrayList.add(str3);
                    }
                }
                String str4 = arrayList.size() > 0 ? (String) arrayList.get(0) : null;
                String str5 = arrayList.size() >= 2 ? (String) arrayList.get(1) : null;
                String str6 = arrayList.size() >= 3 ? (String) arrayList.get(2) : null;
                String str7 = arrayList.size() >= 4 ? (String) arrayList.get(3) : null;
                if (z3 && sb.length() > 0) {
                    string = sb.toString();
                } else if (str6 != null) {
                    StringBuilder sbX = android.support.v4.media.a.x(str6, "\nCaused by: ");
                    sbX.append(z2 ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n");
                    string = sbX.toString();
                } else if (str5 != null) {
                    StringBuilder sbX2 = android.support.v4.media.a.x(str5, "\nCaused by: ");
                    sbX2.append(z2 ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n");
                    string = sbX2.toString();
                } else if (z2) {
                    string = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
                }
                if (z4 && sb2.length() > 0) {
                    string = string + "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth error when dumpping the stack:\n" + ((Object) sb2);
                }
                str = str4;
                str2 = str7;
            }
        } else {
            if (z2) {
                string = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
            }
            str2 = null;
            str = null;
        }
        aVar.a("data", (Object) string);
        aVar.a("process_name", (Object) str);
        aVar.a("crash_thread_name", (Object) str2);
        aVar.a("isOOM", Boolean.valueOf(z2));
        return aVar;
    }

    public static void a(File file, Map<String, String> map) throws Throwable {
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    com.apm.insight.a.a((Closeable) fileOutputStream2);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    com.apm.insight.a.b((Throwable) e);
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, boolean z2) {
        return b(file, str, str2, jSONObject, z2);
    }

    public static void a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file2 == null) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[Segment.SIZE];
                    while (true) {
                        int i2 = fileInputStream2.read(bArr);
                        if (i2 <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i2);
                        }
                    }
                    com.apm.insight.a.a((Closeable) fileInputStream2);
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        com.apm.insight.a.a((Closeable) fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        com.apm.insight.a.a((Closeable) fileInputStream);
                        com.apm.insight.a.a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        com.apm.insight.a.a((Closeable) fileOutputStream);
    }

    public static void a(OutputStream outputStream, File... fileArr) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File file : fileArr) {
                    a(zipOutputStream2, file);
                }
                com.apm.insight.a.a((Closeable) zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                com.apm.insight.a.a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            a(zipOutputStream, file2, file2.getName());
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(android.support.v4.media.a.m(str, "/")));
            String strConcat = str.length() == 0 ? "" : str.concat("/");
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                File file2 = fileArrListFiles[i2];
                StringBuilder sbW = android.support.v4.media.a.w(strConcat);
                sbW.append(fileArrListFiles[i2].getName());
                a(zipOutputStream, file2, sbW.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i3 = fileInputStream2.read(bArr);
                    if (-1 != i3) {
                        zipOutputStream.write(bArr, 0, i3);
                    } else {
                        com.apm.insight.a.a((Closeable) fileInputStream2);
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                com.apm.insight.a.a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean a() {
        return this.f10226a != 207;
    }
}
