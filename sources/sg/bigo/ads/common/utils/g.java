package sg.bigo.ads.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public static File a(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0055: MOVE (r7 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:19:0x0055 */
    public static byte[] b(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        File fileA = a(file);
        if (fileA.exists()) {
            file.delete();
            fileA.renameTo(file);
        }
        FileInputStream fileInputStream3 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            try {
                int length = (int) file.length();
                if (length != 0) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[length];
                        if (fileInputStream.read(bArr) == length) {
                            try {
                                fileInputStream.close();
                                return bArr;
                            } catch (IOException unused) {
                                sg.bigo.ads.common.t.a.b("IOUtils", "close file " + file.getPath() + " failed");
                                return bArr;
                            }
                        }
                    } catch (Exception unused2) {
                        sg.bigo.ads.common.t.a.a(0, "IOUtils", "read file " + file.getPath() + " failed");
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused3) {
                                sg.bigo.ads.common.t.a.b("IOUtils", "close file " + file.getPath() + " failed");
                            }
                        }
                        return null;
                    }
                } else {
                    fileInputStream = null;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "IOUtils", "readFileLocked length=" + length + ", fileName=" + file.getName());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                FileInputStream fileInputStream4 = new FileInputStream(file);
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int i2 = fileInputStream4.read(bArr2);
                        if (i2 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i2);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    sg.bigo.ads.common.t.a.a(0, 3, "IOUtils", "readFileLocked data=" + byteArray.length + ", fileName=" + file.getName());
                    if (byteArray.length != 0) {
                        try {
                            fileInputStream4.close();
                            return byteArray;
                        } catch (IOException unused4) {
                            sg.bigo.ads.common.t.a.b("IOUtils", "close file " + file.getPath() + " failed");
                            return byteArray;
                        }
                    }
                    sg.bigo.ads.common.t.a.a(0, "IOUtils", "read " + file.getName() + " failed, data's length is 0.");
                    throw new Exception("read " + file.getName() + " failed, data's length is 0.");
                } catch (Exception unused5) {
                    fileInputStream = fileInputStream4;
                    sg.bigo.ads.common.t.a.a(0, "IOUtils", "read file " + file.getPath() + " failed");
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream3 = fileInputStream4;
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (IOException unused6) {
                            sg.bigo.ads.common.t.a.b("IOUtils", "close file " + file.getPath() + " failed");
                        }
                    }
                    throw th;
                }
            } catch (Exception unused7) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream3 = fileInputStream2;
        }
    }

    public static String a(InputStream inputStream) throws Throwable {
        if (inputStream == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        String string = byteArrayOutputStream2.toString();
                        a((Closeable) inputStream);
                        a(byteArrayOutputStream2);
                        return string;
                    }
                    byteArrayOutputStream2.write(bArr, 0, i2);
                }
            } catch (IOException unused) {
                byteArrayOutputStream = byteArrayOutputStream2;
                a((Closeable) inputStream);
                if (byteArrayOutputStream != null) {
                    a(byteArrayOutputStream);
                }
                return "";
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                a((Closeable) inputStream);
                if (byteArrayOutputStream != null) {
                    a(byteArrayOutputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
