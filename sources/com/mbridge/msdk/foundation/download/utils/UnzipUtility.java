package com.mbridge.msdk.foundation.download.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "UnzipUtility";

    private void extractFile(ZipInputStream zipInputStream, String str) throws Throwable {
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
                        int i10 = zipInputStream.read(bArr);
                        if (i10 == -1) {
                            bufferedOutputStream.close();
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i10);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    public int unzip(String str, String str2) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
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
                                } catch (IOException e10) {
                                    q0.b(TAG, e10.getMessage());
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e11) {
                                    q0.b(TAG, e11.getMessage());
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
                                    } catch (IOException e12) {
                                        e = e12;
                                        try {
                                            q0.b(TAG, e.getMessage());
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e13) {
                                                    q0.b(TAG, e13.getMessage());
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                return 3;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                return 3;
                                            } catch (IOException e14) {
                                                q0.b(TAG, e14.getMessage());
                                                return 3;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = inputStream3;
                                            fileOutputStream2 = fileOutputStream;
                                            fileOutputStream = fileOutputStream2;
                                            inputStream3 = inputStream;
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e15) {
                                                    q0.b(TAG, e15.getMessage());
                                                }
                                            }
                                            if (fileOutputStream == null) {
                                                throw th;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                throw th;
                                            } catch (IOException e16) {
                                                q0.b(TAG, e16.getMessage());
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (inputStream3 != null) {
                                            inputStream3.close();
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        fileOutputStream.close();
                                        throw th;
                                    }
                                }
                            }
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e17) {
                                    q0.b(TAG, e17.getMessage());
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e18) {
                                    q0.b(TAG, e18.getMessage());
                                }
                            }
                            return 2;
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e19) {
                                q0.b(TAG, e19.getMessage());
                            }
                        }
                        if (fileOutputStream4 != null) {
                            try {
                                fileOutputStream4.close();
                            } catch (IOException e20) {
                                q0.b(TAG, e20.getMessage());
                            }
                        }
                        return 2;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream3;
                        fileOutputStream2 = fileOutputStream4;
                        fileOutputStream = fileOutputStream2;
                        inputStream3 = inputStream;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (IOException e21) {
                    e = e21;
                    inputStream2 = inputStream3;
                    fileOutputStream3 = fileOutputStream4;
                    fileOutputStream = fileOutputStream3;
                    inputStream3 = inputStream2;
                    q0.b(TAG, e.getMessage());
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (fileOutputStream != null) {
                        return 3;
                    }
                    fileOutputStream.close();
                    return 3;
                }
            }
            zipFile.close();
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException e22) {
                    q0.b(TAG, e22.getMessage());
                }
            }
            if (fileOutputStream4 != null) {
                try {
                    fileOutputStream4.close();
                } catch (IOException e23) {
                    q0.b(TAG, e23.getMessage());
                }
            }
            return 0;
        } catch (IOException e24) {
            e = e24;
            inputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
    }
}
