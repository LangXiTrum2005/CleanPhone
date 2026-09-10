package com.pgl.ssdk;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {
    private static void a(byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int i;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception unused) {
            }
        } while (i >= 4096);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:53:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    private static String a(String str) throws Throwable {
        Process processExec;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        strA = null;
        String strA = null;
        try {
            processExec = Runtime.getRuntime().exec(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH);
            try {
                bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                try {
                    bufferedInputStream = new BufferedInputStream(processExec.getInputStream());
                    try {
                        bufferedOutputStream.write(str.getBytes());
                        bufferedOutputStream.write(10);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        processExec.waitFor();
                        strA = a(bufferedInputStream);
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused) {
                        }
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    } catch (Exception unused3) {
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (processExec != null) {
                        }
                        return strA;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException unused6) {
                            }
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (processExec != null) {
                            throw th;
                        }
                        processExec.destroy();
                        throw th;
                    }
                } catch (Exception unused8) {
                    bufferedInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
            } catch (Exception unused9) {
                bufferedOutputStream = null;
                bufferedInputStream = null;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return strA;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (processExec != null) {
                    throw th;
                }
                processExec.destroy();
                throw th;
            }
        } catch (Exception unused10) {
            processExec = null;
        } catch (Throwable th4) {
            th = th4;
            processExec = null;
        }
        processExec.destroy();
        return strA;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    public static synchronized String a(Context context) {
        String strA;
        try {
            String str = context.getFilesDir().getAbsolutePath() + "/dic";
            if (new File(str).exists()) {
                a("chmod 777 ".concat(String.valueOf(str)));
                String strA2 = a(str);
                a("chmod 600 ".concat(String.valueOf(str)));
                if (strA2 != null && strA2.length() > 0) {
                    return strA2;
                }
            }
            InputStream inputStreamOpen = context.getResources().getAssets().open("dic");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStreamOpen.read(bArr, 0, 4096);
                if (i == -1) {
                    break;
                }
                a(bArr, i, "dic".getBytes(Charset.forName(C.UTF8_NAME)));
                byteArrayOutputStream.write(bArr, 0, i);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.close();
            a("chmod 777 ".concat(String.valueOf(str)));
            strA = a(str);
            if (strA == null || strA.length() == 0) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek(16L);
                randomAccessFile.write(new byte[]{2});
                randomAccessFile.close();
                strA = a(str);
            }
            a("chmod 600 ".concat(String.valueOf(str)));
        } catch (Throwable unused) {
            strA = "0[<!>]EXCEPTION[<!>]";
        }
        if (strA != null) {
            try {
                if (strA.length() == 0) {
                    strA = "0[<!>]ERROR[<!>]";
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            strA = "0[<!>]ERROR[<!>]";
        }
        return strA;
    }
}
