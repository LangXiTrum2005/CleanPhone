package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3923l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4625a = AbstractC3375el.P(AbstractApplicationC2673Ph.m.getPackageName());

    public static String a(String str, String str2) {
        SecretKeySpec secretKeySpecC = c(d(str2));
        byte[] bArr = {127, -114, com.umeng.analytics.pro.cw.n};
        byte[] bArr2 = {62, -53, 67, -65, 19, 61, 48, -39};
        int i = 0;
        int i2 = 0;
        while (i < 3) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        Cipher cipher = Cipher.getInstance(new String(bArr, StandardCharsets.UTF_8));
        cipher.init(2, secretKeySpecC);
        return new String(cipher.doFinal(Base64.decode(str, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Bitmap b(File file, String str) {
        Cipher cipher;
        Throwable th;
        CipherInputStream cipherInputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        CipherInputStream cipherInputStream2 = null;
        try {
            try {
                SecretKeySpec secretKeySpecC = c(d(str));
                byte[] bArr = {com.umeng.analytics.pro.cw.k, -50, -16};
                byte[] bArr2 = {76, -117, -93, 113, 12, 116, -82, 113};
                int i = 0;
                int i2 = 0;
                while (i < 3) {
                    if (i2 >= 8) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                cipher = Cipher.getInstance(new String(bArr, StandardCharsets.UTF_8));
                try {
                    cipher.init(2, secretKeySpecC);
                } catch (InvalidKeyException e) {
                    e = e;
                    e.printStackTrace();
                } catch (NoSuchAlgorithmException e2) {
                    e = e2;
                    e.printStackTrace();
                } catch (NoSuchPaddingException e3) {
                    e = e3;
                    e.printStackTrace();
                }
            } catch (InvalidKeyException e4) {
                e = e4;
                cipher = null;
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                cipher = null;
            } catch (NoSuchPaddingException e6) {
                e = e6;
                cipher = null;
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    cipherInputStream = new CipherInputStream(fileInputStream, cipher);
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(cipherInputStream);
                        try {
                            cipherInputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        return bitmapDecodeStream;
                    } catch (Exception e8) {
                        e = e8;
                        try {
                            e.printStackTrace();
                            if (cipherInputStream != null) {
                                try {
                                    cipherInputStream.close();
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                }
                            } else if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream2 = fileInputStream;
                            fileInputStream = fileInputStream2;
                            cipherInputStream2 = cipherInputStream;
                            if (cipherInputStream2 == null) {
                                try {
                                    cipherInputStream2.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            } else if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cipherInputStream2 = cipherInputStream;
                        if (cipherInputStream2 == null) {
                            cipherInputStream2.close();
                        } else if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    cipherInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    if (cipherInputStream2 == null) {
                        cipherInputStream2.close();
                    } else if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
                cipherInputStream = null;
                fileInputStream = null;
            } catch (Throwable th5) {
                th = th5;
                cipherInputStream = null;
                fileInputStream = fileInputStream2;
                cipherInputStream2 = cipherInputStream;
                if (cipherInputStream2 == null) {
                    cipherInputStream2.close();
                } else if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Exception e15) {
            throw new RuntimeException(e15);
        }
    }

    public static SecretKeySpec c(String str) {
        byte[] bArrDecode = Base64.decode(str, 1);
        int length = bArrDecode.length;
        byte[] bArr = {-96, 113, 1};
        byte[] bArr2 = {-31, 52, 82, 11, 72, 76, -127, -2};
        int length2 = bArr.length;
        int length3 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            if (i2 >= length3) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new SecretKeySpec(bArrDecode, 0, length, new String(bArr, StandardCharsets.UTF_8));
    }

    public static String d(String str) {
        byte[] bArr = {-79, 18, 109, -13, 62, 58, -103};
        byte[] bArr2 = {-30, 90, 44, -34, 12, com.umeng.analytics.pro.cw.m, -81, 38};
        int i = 0;
        int i2 = 0;
        while (i < 7) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        Charset charset = StandardCharsets.UTF_8;
        return Base64.encodeToString(Arrays.copyOf(MessageDigest.getInstance(new String(bArr, charset)).digest(str.getBytes(charset)), 16), 1);
    }
}
