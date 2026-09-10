package com.thinkup.core.common.ooo;

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
public final class o {
    private static final String m = "ATUnzipUtility";
    private static final int o = 4096;

    private static void o(ZipInputStream zipInputStream, String str) throws Throwable {
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i2 = zipInputStream.read(bArr);
                        if (i2 == -1) {
                            bufferedOutputStream2.close();
                            return;
                        }
                        bufferedOutputStream2.write(bArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
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
        }
    }

    public static int o(String str, String str2) {
        FileOutputStream fileOutputStream;
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
        InputStream inputStream = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            fileOutputStream = null;
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (zipEntryNextElement == null) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th2.getMessage();
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
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                inputStream = zipFile.getInputStream(zipEntryNextElement);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i2 = inputStream.read(bArr, 0, 1024);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, i2);
                                    fileOutputStream2.flush();
                                }
                                fileOutputStream = fileOutputStream2;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = fileOutputStream2;
                                try {
                                    th.getMessage();
                                    if (fileOutputStream == null) {
                                        return 3;
                                    }
                                    try {
                                        return 3;
                                    } catch (Throwable th4) {
                                        return 3;
                                    }
                                } finally {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th5) {
                                            th5.getMessage();
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th6) {
                                            th6.getMessage();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
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
                    return 2;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th9) {
                        th9.getMessage();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th10) {
                        th10.getMessage();
                    }
                }
                return 2;
            }
            zipFile.close();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th11) {
                    th11.getMessage();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th12) {
                    th12.getMessage();
                }
            }
            return 0;
        } catch (Throwable th13) {
            th = th13;
            fileOutputStream = null;
        }
    }
}
