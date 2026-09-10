package com.smartdigimkt.v0;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes6.dex */
public class p extends com.smartdigimkt.v0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39009a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39010b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39011c = 3;
    public static final int d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39012e = "/download/.at";
    public static final String f = "/atdownload";
    public static final String g = "template_config.json";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f39013h = "SameFileTool";

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.smartdigimkt.u.a.f().d() != null) {
                    p.b(com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_VC));
                }
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
                if (aVarC == null) {
                    aVarC = com.smartdigimkt.n1.b.b().a();
                }
                p.b(com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_RES_MANAGER_DIR), aVarC.h0());
                p.b(System.currentTimeMillis() - ((long) (aVarC.l() * 1000)));
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public class c implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden() || file.isDirectory();
        }
    }

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

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f39014a = 448;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39015b = 256;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f39016c = 128;
        public static final int d = 64;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f39017e = 56;
        public static final int f = 32;
        public static final int g = 16;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f39018h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f39019i = 7;
        public static final int j = 4;
        public static final int k = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f39020l = 1;
    }

    public static void b() {
        new Thread(new a()).start();
    }

    public static double c(String str, int i2) {
        long jD;
        File file = new File(str);
        try {
            jD = file.isDirectory() ? d(file) : c(file);
        } catch (Exception e2) {
            e2.printStackTrace();
            jD = 0;
        }
        return a(jD, i2);
    }

    private static long d(File file) throws Exception {
        File[] fileArrListFiles = file.listFiles();
        long jD = 0;
        if (fileArrListFiles != null) {
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                jD += fileArrListFiles[i2].isDirectory() ? d(fileArrListFiles[i2]) : c(fileArrListFiles[i2]);
            }
        }
        return jD;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    public static String e(File file) throws Throwable {
        IOException e2;
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
                                file.append(line + IOUtils.LINE_SEPARATOR_UNIX);
                            } catch (IOException e3) {
                                e2 = e3;
                                try {
                                    e2.printStackTrace();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        file = file;
                                    }
                                    if (file != 0) {
                                        return file.toString();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
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
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    file = 0;
                }
            } catch (IOException e5) {
                e2 = e5;
                file = 0;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
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

    public static boolean f(String str) {
        if (com.smartdigimkt.f0.e.e(str)) {
            return false;
        }
        File file = new File(str);
        return file.length() > 0 && file.isFile();
    }

    public static void g(String str) {
        try {
            ArrayList<File> arrayListB = b(new File(str));
            Collections.sort(arrayListB, new d());
            int size = (arrayListB.size() - 1) / 2;
            for (int i2 = 0; i2 < size; i2++) {
                File file = arrayListB.get(i2);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    private static String a(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            return decimalFormat.format(j) + "B";
        }
        if (j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return decimalFormat.format(j / 1024.0d) + "KB";
        }
        if (j < 1073741824) {
            return decimalFormat.format(j / 1048576.0d) + "AT";
        }
        return decimalFormat.format(j / 1.073741824E9d) + "GB";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, int i2) {
        try {
            if (d(new File(str)) > i2 * 1048576) {
                g(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
    }

    public static File[] d(String str) {
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

    public static String c(String str) {
        long jC;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                jC = d(file);
            } else {
                jC = c(file);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            jC = 0;
        }
        return a(jC);
    }

    private static double a(long j, int i2) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i2 == 1) {
            return Double.valueOf(decimalFormat.format(j)).doubleValue();
        }
        if (i2 == 2) {
            return Double.valueOf(decimalFormat.format(j / 1024.0d)).doubleValue();
        }
        if (i2 == 3) {
            return Double.valueOf(decimalFormat.format(j / 1048576.0d)).doubleValue();
        }
        if (i2 != 4) {
            return 0.0d;
        }
        return Double.valueOf(decimalFormat.format(j / 1.073741824E9d)).doubleValue();
    }

    public static String e(String str) {
        return !TextUtils.isEmpty(str) ? s.a(z.b(str.trim())) : "";
    }

    public static void b(long j) {
        try {
            for (File file : b(new File(com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_RES_MANAGER_DIR)))) {
                if (file.lastModified() < j && file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
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
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = fileInputStream;
                            e.printStackTrace();
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            return 0L;
                        } catch (Throwable th) {
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                    }
                    if (fileInputStream2 == null) {
                        return jAvailable;
                    }
                    fileInputStream2.close();
                    return jAvailable;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - 1440000;
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

    public static void b(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : d(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0136 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x012c A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0120 A[Catch: all -> 0x0124, TryCatch #1 {all -> 0x0124, blocks: (B:96:0x011c, B:98:0x0120, B:101:0x0126), top: B:129:0x011c }] */
    public static String c(String str, String str2) {
        Throwable th;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Throwable th2;
        if (str != null && str2 != null) {
            if (!str2.endsWith("/")) {
                str2 = str2.concat("/");
            }
            File file = new File(str);
            if (!file.exists()) {
                return "unzip file not exists";
            }
            FileOutputStream fileOutputStream2 = null;
            InputStream inputStream2 = null;
            try {
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                FileOutputStream fileOutputStream3 = null;
                while (true) {
                    try {
                        String canonicalPath = "";
                        if (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            if (zipEntryNextElement == null) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (fileOutputStream3 != null) {
                                    try {
                                        fileOutputStream3.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                return "unzip zipEntry is null";
                            }
                            String name = zipEntryNextElement.getName();
                            if (!TextUtils.isEmpty(name) && !name.contains("../")) {
                                File file2 = new File(str2 + name);
                                try {
                                    canonicalPath = file2.getCanonicalPath();
                                } catch (IOException unused) {
                                }
                                if (!TextUtils.isEmpty(canonicalPath) && canonicalPath.startsWith(str2) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../") && !canonicalPath.contains("../")) {
                                    if (zipEntryNextElement.isDirectory()) {
                                        file2.mkdirs();
                                    } else {
                                        if (!file2.getParentFile().exists()) {
                                            file2.getParentFile().mkdirs();
                                        }
                                        fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            inputStream2 = zipFile.getInputStream(zipEntryNextElement);
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int i2 = inputStream2.read(bArr, 0, 1024);
                                                if (i2 == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i2);
                                                fileOutputStream.flush();
                                            }
                                            fileOutputStream3 = fileOutputStream;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            try {
                                                if (com.smartdigimkt.b.b.f33800a) {
                                                    th2.printStackTrace();
                                                }
                                                return th2.getMessage();
                                            } finally {
                                                if (inputStream2 != null) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (IOException e4) {
                                                        e4.printStackTrace();
                                                    }
                                                }
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (IOException e5) {
                                                        e5.printStackTrace();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (fileOutputStream3 != null) {
                                    try {
                                        fileOutputStream3.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                    }
                                }
                                return "unzip zipEntry canonicalPath is not available";
                            }
                            throw new Exception("zipEntry's name is unsafe!");
                        }
                        zipFile.close();
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        return "";
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream2;
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                        inputStream2 = inputStream;
                        th2 = th;
                        if (com.smartdigimkt.b.b.f33800a) {
                            th2.printStackTrace();
                        }
                        return th2.getMessage();
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
            }
        } else {
            return "unzip srcFile or destDir is null ";
        }
    }

    public static void a() {
        com.smartdigimkt.l7.b.a().g(new b());
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
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }

    public static boolean b(String str, String str2) {
        File[] fileArrListFiles;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2)) {
                    File file = new File(str);
                    if (file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0 && (fileArrListFiles = file.listFiles()) != null) {
                        for (File file2 : fileArrListFiles) {
                            if (file2.isFile()) {
                                if (str2.equals(file2.getName())) {
                                    return true;
                                }
                            } else {
                                b(file2.getAbsolutePath(), str2);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, String str3) throws Throwable {
        try {
            if (t.l()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str4 = File.separator;
                sb.append(str4);
                sb.append(str3);
                String string = sb.toString();
                File file = new File(string);
                if (file.exists() && file.isFile() && t.a(file.length())) {
                    File file2 = new File(str2);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    int iA = a(string, str2 + str4 + str3);
                    if (file.exists() && iA == 0) {
                        file.delete();
                        return true;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static int a(String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            if (!t.f39030c) {
                return -1;
            }
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = fileInputStream2.read(bArr);
                        if (i2 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i2);
                    }
                    File file = new File(str2);
                    if (file.exists() && file.isFile()) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return 0;
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    return -1;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        return -1;
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
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 == null) {
                        return false;
                    }
                    try {
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static boolean a(String str, int i2, int i3, int i4) {
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            Class cls2 = Integer.TYPE;
            cls.getMethod("setPermissions", String.class, cls2, cls2, cls2).invoke(null, str, Integer.valueOf(i2), -1, -1);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
