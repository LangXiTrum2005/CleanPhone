package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    public static final int UNKNOWN_ERR = 507;
    private static volatile PglCryptUtils qdl = null;
    private static volatile boolean ud = true;

    private PglCryptUtils() {
    }

    public static native byte[] bc(int i2, byte[] bArr);

    public static PglCryptUtils getInstance() {
        if (qdl == null) {
            synchronized (PglCryptUtils.class) {
                try {
                    if (qdl == null) {
                        try {
                            System.loadLibrary("pglarmor");
                        } catch (Throwable unused) {
                            ud = false;
                        }
                        qdl = new PglCryptUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064 A[Catch: Exception -> 0x0060, TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:33:0x005c, B:37:0x0064), top: B:42:0x005c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    private static byte[] qdl(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        byte[] byteArray = null;
        gZIPOutputStream = null;
        byteArray = null;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            ?? length = str.length();
            try {
                try {
                    if (length != 0) {
                        try {
                            length = new ByteArrayOutputStream();
                            try {
                                gZIPOutputStream = new GZIPOutputStream(length);
                                try {
                                    gZIPOutputStream.write(str.getBytes("utf-8"));
                                    gZIPOutputStream.close();
                                    byte[] byteArray2 = length.toByteArray();
                                    length.close();
                                    return byteArray2;
                                } catch (Exception e2) {
                                    e = e2;
                                    Log.e("ARMOR", e.toString());
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (length != 0) {
                                        byteArray = length.toByteArray();
                                        length.close();
                                    }
                                    return byteArray;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                gZIPOutputStream = null;
                            } catch (Throwable th) {
                                th = th;
                                if (gZIPOutputStream2 != null) {
                                    try {
                                        gZIPOutputStream2.close();
                                        if (length != 0) {
                                            length.toByteArray();
                                            length.close();
                                        }
                                    } catch (Exception e4) {
                                        Log.e("ARMOR", e4.toString());
                                        throw th;
                                    }
                                } else if (length != 0) {
                                    length.toByteArray();
                                    length.close();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            length = 0;
                            gZIPOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            length = 0;
                        }
                    }
                } catch (Exception e6) {
                    Log.e("ARMOR", e6.toString());
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream2 = gZIPOutputStream;
            }
        }
        return null;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) throws Throwable {
        byte[] bArrBc;
        if (!ud) {
            return new Pair<>(501, null);
        }
        if (str == null || str.length() == 0) {
            return new Pair<>(502, null);
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode == null || bArrDecode.length == 0) {
            return new Pair<>(504, null);
        }
        try {
            bArrBc = bc(1011, bArrDecode);
        } catch (Throwable th) {
            Log.e("ARMOR", th.toString());
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new Pair<>(506, null);
        }
        String strQdl = qdl(bArrBc);
        return TextUtils.isEmpty(strQdl) ? new Pair<>(503, null) : new Pair<>(0, strQdl);
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws Throwable {
        Pair<Integer, String> pairCypher4EncryptWithNoWrapBase64 = cypher4EncryptWithNoWrapBase64(jSONObject.toString());
        if (pairCypher4EncryptWithNoWrapBase64 == null) {
            return new Pair<>(507, null);
        }
        if (((Integer) pairCypher4EncryptWithNoWrapBase64.first).intValue() != 0) {
            return new Pair<>(pairCypher4EncryptWithNoWrapBase64.first, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = (String) pairCypher4EncryptWithNoWrapBase64.second;
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(504, null);
        }
        jSONObject2.put(KEY_MESSAGE, str);
        jSONObject2.put("cypher", 4);
        return new Pair<>(0, jSONObject2);
    }

    public Pair<Integer, String> cypher4EncryptWithNoWrapBase64(String str) throws Throwable {
        if (!ud) {
            return new Pair<>(501, null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(502, null);
        }
        byte[] bArrQdl = qdl(str);
        if (bArrQdl == null || bArrQdl.length == 0) {
            return new Pair<>(503, null);
        }
        Pair<Integer, byte[]> pairCypher4Encrypt = cypher4Encrypt(bArrQdl);
        if (pairCypher4Encrypt == null) {
            return new Pair<>(507, null);
        }
        if (((Integer) pairCypher4Encrypt.first).intValue() != 0) {
            return new Pair<>(pairCypher4Encrypt.first, null);
        }
        String strEncodeToString = Base64.encodeToString((byte[]) pairCypher4Encrypt.second, 2);
        return TextUtils.isEmpty(strEncodeToString) ? new Pair<>(504, null) : new Pair<>(0, strEncodeToString);
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArrBc;
        if (!ud) {
            return new Pair<>(501, null);
        }
        if (bArr != null && bArr.length != 0) {
            try {
                bArrBc = bc(1010, bArr);
            } catch (Throwable th) {
                Log.e("ARMOR", th.toString());
                bArrBc = null;
            }
            if (bArrBc != null && bArrBc.length != 0) {
                return new Pair<>(0, bArrBc);
            }
            return new Pair<>(505, null);
        }
        return new Pair<>(502, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #4 {Exception -> 0x0069, blocks: (B:33:0x0065, B:37:0x006d), top: B:56:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084 A[Catch: Exception -> 0x0080, TRY_LEAVE, TryCatch #0 {Exception -> 0x0080, blocks: (B:43:0x007c, B:47:0x0084), top: B:52:0x007c }] */
    private static String qdl(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception exc;
        String str;
        GZIPInputStream gZIPInputStream2 = null;
        String string = null;
        gZIPInputStream2 = null;
        gZIPInputStream2 = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i2 = gZIPInputStream.read(bArr2);
                            if (i2 != -1) {
                                byteArrayOutputStream.write(bArr2, 0, i2);
                            } else {
                                string = byteArrayOutputStream.toString("utf-8");
                                byteArrayInputStream.close();
                                try {
                                    gZIPInputStream.close();
                                    byteArrayOutputStream.close();
                                    return string;
                                } catch (Exception e2) {
                                    Log.e("ARMOR", e2.toString());
                                    return string;
                                }
                            }
                        }
                    } catch (Exception e3) {
                        str = string;
                        gZIPInputStream2 = gZIPInputStream;
                        exc = e3;
                        Log.e("ARMOR", exc.toString());
                        if (gZIPInputStream2 != null) {
                            try {
                                gZIPInputStream2.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                            } catch (Exception e4) {
                                Log.e("ARMOR", e4.toString());
                                return str;
                            }
                        } else if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                            } catch (Exception e5) {
                                Log.e("ARMOR", e5.toString());
                                throw th;
                            }
                        } else if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    gZIPInputStream = gZIPInputStream2;
                    th = th3;
                }
            } catch (Exception e6) {
                exc = e6;
                str = null;
            }
        } catch (Exception e7) {
            byteArrayOutputStream = null;
            exc = e7;
            str = null;
        } catch (Throwable th4) {
            gZIPInputStream = null;
            th = th4;
            byteArrayOutputStream = null;
        }
    }
}
