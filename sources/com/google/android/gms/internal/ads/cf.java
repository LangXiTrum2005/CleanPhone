package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f13145a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MessageDigest f13146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f13147c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f13148d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f13149e = new CountDownLatch(1);

    public static void a() {
        synchronized (f13148d) {
            try {
                if (!f13145a) {
                    f13145a = true;
                    new Thread(new bf(0)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ue b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length <= 0) {
            vector = null;
        } else {
            int i10 = length + 254;
            vector = new Vector();
            for (int i11 = 0; i11 < i10 / 255; i11++) {
                int i12 = i11 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i12 > 255) {
                        length2 = i12 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i12, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        ue ueVarZ = ve.z();
        int size = vector.size();
        for (int i13 = 0; i13 < size; i13++) {
            as1 as1VarD = cs1.D(d((byte[]) vector.get(i13), str, false), 0, NotificationCompat.FLAG_LOCAL_ONLY);
            ueVarZ.b();
            ((ve) ueVarZ.f19193b).A(as1VarD);
        }
        byte[] bArrC = c(bArr);
        as1 as1Var = cs1.f13248b;
        as1 as1VarD2 = cs1.D(bArrC, 0, bArrC.length);
        ueVarZ.b();
        ((ve) ueVarZ.f19193b).B(as1VarD2);
        return ueVarZ;
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f13147c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (f13149e.await(2L, TimeUnit.SECONDS) && (messageDigest = f13146b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f13146b.digest();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrDigest;
    }

    public static byte[] d(byte[] bArr, String str, boolean z10) {
        byte[] bArrArray;
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        if (length > i10) {
            xd xdVarA0 = je.A0();
            xdVarA0.i(4096L);
            bArr = ((je) xdVarA0.e()).b();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).array();
        }
        if (z10) {
            bArrArray = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        df[] dfVarArr = (df[]) new lf(0).K2;
        int length3 = dfVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            dfVarArr[i12].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            we weVar = new we(str.getBytes("UTF-8"), 0);
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < 256; i15++) {
                i13 = (i13 + 1) & 255;
                byte[] bArr4 = weVar.f21496a;
                byte b11 = bArr4[i13];
                i14 = (i14 + b11) & 255;
                bArr4[i13] = bArr4[i14];
                bArr4[i14] = b11;
                bArr3[i15] = (byte) (bArr4[(bArr4[i13] + b11) & 255] ^ bArr3[i15]);
            }
        }
        return bArr3;
    }
}
