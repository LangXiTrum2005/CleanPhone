package com.smartdigimkt.o8;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f37470a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37471b = "ATUnzipUtility";

    private void a(ZipInputStream zipInputStream, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i2 = zipInputStream.read(bArr);
                        if (i2 == -1) {
                            bufferedOutputStream.close();
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x012e A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0138 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    public int a(String str, String str2) {
        Throwable th;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Throwable th2;
        String canonicalPath;
        if (str == null || str2 == null) {
            return -1;
        }
        if (!str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        File file = new File(str);
        if (!file.exists()) {
            return 1;
        }
        FileOutputStream fileOutputStream2 = null;
        InputStream inputStream2 = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            FileOutputStream fileOutputStream3 = null;
            while (enumerationEntries.hasMoreElements()) {
                try {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement == null) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th3) {
                                th3.getMessage();
                            }
                        }
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (Throwable th4) {
                                th4.getMessage();
                            }
                        }
                        return 2;
                    }
                    String name = zipEntryNextElement.getName();
                    if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                        File file2 = new File(str2 + name);
                        try {
                            canonicalPath = file2.getCanonicalPath();
                        } catch (IOException unused) {
                            canonicalPath = "";
                        }
                        if (!TextUtils.isEmpty(canonicalPath) && canonicalPath.startsWith(str2) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../")) {
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
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    try {
                                        th2.getMessage();
                                        if (fileOutputStream == null) {
                                            return 3;
                                        }
                                        try {
                                            return 3;
                                        } catch (Throwable th6) {
                                            return 3;
                                        }
                                    } finally {
                                        if (inputStream2 != null) {
                                            try {
                                                inputStream2.close();
                                            } catch (Throwable th7) {
                                                th7.getMessage();
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th8) {
                                                th8.getMessage();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th9) {
                                th9.getMessage();
                            }
                        }
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (Throwable th10) {
                                th10.getMessage();
                            }
                        }
                        return 2;
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th11) {
                            th11.getMessage();
                        }
                    }
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.close();
                        } catch (Throwable th12) {
                            th12.getMessage();
                        }
                    }
                    return 2;
                } catch (Throwable th13) {
                    th = th13;
                    inputStream = inputStream2;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                    inputStream2 = inputStream;
                    th2 = th;
                    th2.getMessage();
                    if (fileOutputStream == null) {
                        return 3;
                    }
                    return 3;
                }
            }
            zipFile.close();
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th14) {
                    th14.getMessage();
                }
            }
            if (fileOutputStream3 != null) {
                try {
                    fileOutputStream3.close();
                } catch (Throwable th15) {
                    th15.getMessage();
                }
            }
            return 0;
        } catch (Throwable th16) {
            th = th16;
            inputStream = null;
        }
    }
}
