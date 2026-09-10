package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class o0 extends w {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF == null) {
                    gVarF = com.mbridge.msdk.setting.i.b().a();
                }
                o0.b(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_RES_MANAGER_DIR), gVarF.P());
                o0.a(System.currentTimeMillis() - ((long) (gVarF.e() * 1000)));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    o0.b(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden() || file.isDirectory();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Comparator<File> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, int i10) {
        try {
            if (d(new File(str)) > i10 * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) {
                f(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable unused) {
            q0.b("SameFileTool", "clean memory failed");
        }
    }

    public static File[] c(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(c1.b(str.trim())) : "";
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    public static String e(File file) throws Throwable {
        IOException e10;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            if (file == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    try {
                        file = new StringBuffer();
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                file.append(line + "\n");
                            } catch (IOException e11) {
                                e10 = e11;
                                try {
                                    e10.printStackTrace();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        file = file;
                                    }
                                    if (file != 0) {
                                        return file.toString();
                                    }
                                    return null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader2 = bufferedReader;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                        bufferedReader.close();
                        file = file;
                    } catch (Throwable th3) {
                        th = th3;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    e10 = e12;
                    file = 0;
                }
            } catch (IOException e13) {
                e10 = e13;
                file = 0;
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
        if (file != 0) {
            return file.toString();
        }
        return null;
    }

    public static void f(String str) {
        try {
            ArrayList<File> arrayListB = b(new File(str));
            Collections.sort(arrayListB, new d());
            int size = (arrayListB.size() - 1) / 2;
            for (int i10 = 0; i10 < size; i10++) {
                File file = arrayListB.get(i10);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            q0.b("SameFileTool", "del memory failed");
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF == null) {
                gVarF = com.mbridge.msdk.setting.i.b().a();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (gVarF.e() * 1000));
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.lastModified() + jCurrentTimeMillis < jCurrentTimeMillis2) {
                            a(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static long c(File file) throws Exception {
        FileInputStream fileInputStream;
        long jAvailable = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream.available();
                            fileInputStream2 = fileInputStream;
                        } catch (Exception e10) {
                            e = e10;
                            fileInputStream2 = fileInputStream;
                            e.printStackTrace();
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            return 0L;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                        q0.b("获取文件大小", "文件不存在!");
                    }
                    if (fileInputStream2 == null) {
                        return jAvailable;
                    }
                    fileInputStream2.close();
                    return jAvailable;
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e13.printStackTrace();
                return 0L;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    private static long d(File file) throws Exception {
        long jC;
        File[] fileArrListFiles = file.listFiles();
        long j10 = 0;
        if (fileArrListFiles != null) {
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                if (fileArrListFiles[i10].isDirectory()) {
                    jC = d(fileArrListFiles[i10]);
                } else {
                    jC = c(fileArrListFiles[i10]);
                }
                j10 += jC;
            }
        }
        return j10;
    }

    public static void b() {
        new Thread(new b()).start();
    }

    public static void b(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : c(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean e(String str) {
        if (com.mbridge.msdk.foundation.same.image.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    private static ArrayList<File> b(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new c())) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(b(file2));
            }
        }
        return arrayList;
    }

    public static void a() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public static void a(long j10) {
        try {
            for (File file : b(new File(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_RES_MANAGER_DIR)))) {
                if (file.lastModified() < j10 && file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Throwable th2) {
            q0.b("SameFileTool", th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0149 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:115:0x0145, B:117:0x0149, B:120:0x0152), top: B:157:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[SYNTHETIC] */
    public static String b(String str, String str2) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        IOException e10;
        Throwable th3;
        if (str != null && str2 != null) {
            if (!str2.endsWith("/")) {
                str2 = str2.concat("/");
            }
            File file = new File(str);
            if (!file.exists()) {
                return "unzip file not exists";
            }
            FileOutputStream fileOutputStream2 = null;
            InputStream inputStream3 = null;
            FileOutputStream fileOutputStream3 = null;
            try {
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                FileOutputStream fileOutputStream4 = null;
                while (true) {
                    try {
                        try {
                            String canonicalPath = "";
                            if (enumerationEntries.hasMoreElements()) {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                if (zipEntryNextElement == null) {
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (IOException e11) {
                                            q0.b("SameFileTool", "unzip error", e11);
                                        }
                                    }
                                    if (fileOutputStream4 != null) {
                                        try {
                                            fileOutputStream4.close();
                                        } catch (IOException e12) {
                                            q0.b("SameFileTool", "unzip error", e12);
                                        }
                                    }
                                    return "unzip zipEntry is null";
                                }
                                String name = zipEntryNextElement.getName();
                                if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                                    File file2 = new File(str2 + name);
                                    try {
                                        canonicalPath = file2.getCanonicalPath();
                                    } catch (IOException unused) {
                                    }
                                    if (!TextUtils.isEmpty(canonicalPath) && canonicalPath.startsWith(str2) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../")) {
                                        if (zipEntryNextElement.isDirectory()) {
                                            file2.mkdirs();
                                        } else {
                                            if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                                file2.getParentFile().mkdirs();
                                            }
                                            fileOutputStream = new FileOutputStream(file2);
                                            try {
                                                inputStream3 = zipFile.getInputStream(zipEntryNextElement);
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i10 = inputStream3.read(bArr, 0, 1024);
                                                    if (i10 == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i10);
                                                    fileOutputStream.flush();
                                                }
                                                fileOutputStream4 = fileOutputStream;
                                            } catch (IOException e13) {
                                                e10 = e13;
                                                try {
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("SameFileTool", "unzip error", e10);
                                                    }
                                                    String message = e10.getMessage();
                                                    if (inputStream3 != null) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (IOException e14) {
                                                            q0.b("SameFileTool", "unzip error", e14);
                                                        }
                                                    }
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (IOException e15) {
                                                            q0.b("SameFileTool", "unzip error", e15);
                                                        }
                                                    }
                                                    return message;
                                                } catch (Throwable th4) {
                                                    th2 = th4;
                                                    inputStream = inputStream3;
                                                    fileOutputStream2 = fileOutputStream;
                                                    fileOutputStream = fileOutputStream2;
                                                    inputStream3 = inputStream;
                                                    th3 = th2;
                                                    if (inputStream3 != null) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (IOException e16) {
                                                            q0.b("SameFileTool", "unzip error", e16);
                                                        }
                                                    }
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th3;
                                                        } catch (IOException e17) {
                                                            q0.b("SameFileTool", "unzip error", e17);
                                                            throw th3;
                                                        }
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th5) {
                                                th3 = th5;
                                            }
                                        }
                                    }
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (IOException e18) {
                                            q0.b("SameFileTool", "unzip error", e18);
                                        }
                                    }
                                    if (fileOutputStream4 != null) {
                                        try {
                                            fileOutputStream4.close();
                                        } catch (IOException e19) {
                                            q0.b("SameFileTool", "unzip error", e19);
                                        }
                                    }
                                    return "unzip zipEntry canonicalPath is not available";
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException e20) {
                                        q0.b("SameFileTool", "unzip error", e20);
                                    }
                                }
                                if (fileOutputStream4 != null) {
                                    try {
                                        fileOutputStream4.close();
                                    } catch (IOException e21) {
                                        q0.b("SameFileTool", "unzip error", e21);
                                    }
                                }
                                return "unzip zipEntry name is not available";
                            }
                            zipFile.close();
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e22) {
                                    q0.b("SameFileTool", "unzip error", e22);
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e23) {
                                    q0.b("SameFileTool", "unzip error", e23);
                                }
                            }
                            return "";
                        } catch (IOException e24) {
                            iOException = e24;
                            inputStream2 = inputStream3;
                            fileOutputStream3 = fileOutputStream4;
                            fileOutputStream = fileOutputStream3;
                            inputStream3 = inputStream2;
                            e10 = iOException;
                            if (MBridgeConstans.DEBUG) {
                                q0.b("SameFileTool", "unzip error", e10);
                            }
                            String message2 = e10.getMessage();
                            if (inputStream3 != null) {
                                inputStream3.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return message2;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        inputStream = inputStream3;
                        fileOutputStream2 = fileOutputStream4;
                        fileOutputStream = fileOutputStream2;
                        inputStream3 = inputStream;
                        th3 = th2;
                    }
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                        throw th3;
                    }
                    throw th3;
                }
            } catch (IOException e25) {
                iOException = e25;
                inputStream2 = null;
            } catch (Throwable th7) {
                th2 = th7;
                inputStream = null;
            }
        } else {
            return "unzip srcFile or destDir is null ";
        }
    }

    public static String a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        a(file2);
                    }
                    file.delete();
                    return "";
                }
                file.delete();
            }
            return "";
        } catch (Exception e10) {
            return e10.getMessage();
        }
    }

    public static List<String> a(String str, String str2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                File file = new File(str + File.separator + "template_config.json");
                if (file.isFile() && file.exists()) {
                    String strE = e(file);
                    if (!TextUtils.isEmpty(strE)) {
                        try {
                            JSONArray jSONArray = new JSONArray(strE);
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                if (jSONObject != null && str2.equals(jSONObject.optString("xml_type"))) {
                                    arrayList.add(str + File.separator + jSONObject.optString("name"));
                                    if (jSONObject.has("ext_template")) {
                                        jSONObject.put("folder_dir", str);
                                        arrayList.add(jSONObject.toString());
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } catch (JSONException e10) {
                            q0.b("SameFileTool", e10.getMessage());
                        }
                    }
                } else {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            q0.b("SameFileTool", e11.getMessage());
            return arrayList;
        }
    }

    public static boolean a(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return true;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 == null) {
                        return false;
                    }
                    try {
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }
}
