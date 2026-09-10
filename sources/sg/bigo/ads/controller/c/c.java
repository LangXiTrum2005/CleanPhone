package sg.bigo.ads.controller.c;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:45:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x006f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.InputStream, java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.zip.GZIPInputStream] */
    public static String a(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        BufferedReader bufferedReader;
        ?? gZIPInputStream;
        Throwable th;
        ?? sb;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader((InputStream) gZIPInputStream, "UTF-8"));
                    try {
                        try {
                            sb = new StringBuilder();
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line != null) {
                                        sb.append(line);
                                    } else {
                                        try {
                                            break;
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Exception unused2) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    if (gZIPInputStream != 0) {
                                        try {
                                            gZIPInputStream.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    if (byteArrayInputStream != null) {
                                    }
                                    if (sb == 0) {
                                        return null;
                                    }
                                    return sb.toString();
                                }
                            }
                            bufferedReader.close();
                            try {
                                gZIPInputStream.close();
                            } catch (IOException unused5) {
                            }
                        } catch (Exception unused6) {
                            sb = 0;
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused7) {
                        }
                        if (sb == 0) {
                            return null;
                        }
                        return sb.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused8) {
                            }
                        }
                        if (gZIPInputStream != 0) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException unused9) {
                            }
                        }
                        if (byteArrayInputStream != null) {
                            throw th;
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException unused10) {
                            throw th;
                        }
                    }
                } catch (Exception unused11) {
                    bufferedReader = null;
                    gZIPInputStream = gZIPInputStream;
                    sb = bufferedReader;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (gZIPInputStream != 0) {
                        gZIPInputStream.close();
                    }
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    if (sb == 0) {
                        return null;
                    }
                    return sb.toString();
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Exception unused12) {
                gZIPInputStream = 0;
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                th = th;
                gZIPInputStream = bufferedReader;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (gZIPInputStream != 0) {
                    gZIPInputStream.close();
                }
                if (byteArrayInputStream != null) {
                    throw th;
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (Exception unused13) {
            gZIPInputStream = 0;
            byteArrayInputStream = null;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayInputStream = null;
            bufferedReader = null;
        }
    }
}
