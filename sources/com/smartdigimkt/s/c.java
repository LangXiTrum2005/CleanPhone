package com.smartdigimkt.s;

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
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38151a = "UnzipUtility";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f38152b = 4096;

    /* JADX WARN: Code duplicated, block: B:139:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    public int a(String str, String str2) throws Throwable {
        Throwable th;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        IOException e2;
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
        InputStream inputStream3 = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            FileOutputStream fileOutputStream4 = null;
            while (enumerationEntries.hasMoreElements()) {
                try {
                    try {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement == null) {
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e3) {
                                    e3.getMessage();
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e4) {
                                    e4.getMessage();
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
                            if (TextUtils.isEmpty(canonicalPath) || canonicalPath.startsWith("..") || canonicalPath.startsWith("../") || !canonicalPath.startsWith(str2)) {
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException e5) {
                                        e5.getMessage();
                                    }
                                }
                                if (fileOutputStream4 != null) {
                                    try {
                                        fileOutputStream4.close();
                                    } catch (IOException e6) {
                                        e6.getMessage();
                                    }
                                }
                                return 2;
                            }
                            if (zipEntryNextElement.isDirectory()) {
                                file2.mkdirs();
                            } else {
                                if (!file2.getParentFile().exists()) {
                                    file2.getParentFile().mkdirs();
                                }
                                fileOutputStream = new FileOutputStream(file2);
                                try {
                                    inputStream3 = zipFile.getInputStream(zipEntryNextElement);
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream3.read(bArr, 0, 1024);
                                        if (i2 == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, i2);
                                        fileOutputStream.flush();
                                    }
                                    fileOutputStream4 = fileOutputStream;
                                } catch (IOException e7) {
                                    e2 = e7;
                                    try {
                                        e2.getMessage();
                                        if (inputStream3 != null) {
                                            try {
                                                inputStream3.close();
                                            } catch (IOException e8) {
                                                e8.getMessage();
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            return 3;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            return 3;
                                        } catch (IOException e9) {
                                            e9.getMessage();
                                            return 3;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = inputStream3;
                                        fileOutputStream2 = fileOutputStream;
                                        fileOutputStream = fileOutputStream2;
                                        inputStream3 = inputStream;
                                        th2 = th;
                                        if (inputStream3 != null) {
                                            try {
                                                inputStream3.close();
                                            } catch (IOException e10) {
                                                e10.getMessage();
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th2;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th2;
                                        } catch (IOException e11) {
                                            e11.getMessage();
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    if (inputStream3 != null) {
                                        inputStream3.close();
                                    }
                                    if (fileOutputStream == null) {
                                        throw th2;
                                    }
                                    fileOutputStream.close();
                                    throw th2;
                                }
                            }
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e12) {
                                e12.getMessage();
                            }
                        }
                        if (fileOutputStream4 != null) {
                            try {
                                fileOutputStream4.close();
                            } catch (IOException e13) {
                                e13.getMessage();
                            }
                        }
                        return 2;
                    } catch (IOException e14) {
                        iOException = e14;
                        inputStream2 = inputStream3;
                        fileOutputStream3 = fileOutputStream4;
                        fileOutputStream = fileOutputStream3;
                        inputStream3 = inputStream2;
                        e2 = iOException;
                        e2.getMessage();
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (fileOutputStream != null) {
                            return 3;
                        }
                        fileOutputStream.close();
                        return 3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = inputStream3;
                    fileOutputStream2 = fileOutputStream4;
                    fileOutputStream = fileOutputStream2;
                    inputStream3 = inputStream;
                    th2 = th;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (fileOutputStream == null) {
                        throw th2;
                    }
                    fileOutputStream.close();
                    throw th2;
                }
            }
            zipFile.close();
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException e15) {
                    e15.getMessage();
                }
            }
            if (fileOutputStream4 != null) {
                try {
                    fileOutputStream4.close();
                } catch (IOException e16) {
                    e16.getMessage();
                }
            }
            return 0;
        } catch (IOException e17) {
            iOException = e17;
            inputStream2 = null;
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
        }
    }

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
                        if (i2 != -1) {
                            bufferedOutputStream.write(bArr, 0, i2);
                        } else {
                            bufferedOutputStream.close();
                            return;
                        }
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
}
