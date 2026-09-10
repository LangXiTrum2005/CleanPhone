package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2343kP implements InterfaceC1371Mh {
    public static byte[] A07;
    public static String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public C1378Mo A00;
    public boolean A01;
    public final AnonymousClass40 A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 117);
            i4++;
        }
    }

    public static void A03() {
        A07 = new byte[]{11, 15, 29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C1370Mg> map) throws IOException {
        try {
            C09163z c09163zA03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C1378Mo(c09163zA03);
            } else {
                this.A00.A00(c09163zA03);
            }
            C1378Mo c1378Mo = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c1378Mo);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) C5C.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) C5C.A0f(this.A04)).init(1, (Key) C5C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c1378Mo, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(map.size());
            int iA00 = 0;
            for (C1370Mg c1370Mg : map.values()) {
                A04(c1370Mg, dataOutputStream);
                iA00 += A00(c1370Mg, 2);
            }
            dataOutputStream.writeInt(iA00);
            this.A02.A06(dataOutputStream);
            C5C.A10(null);
        } catch (Throwable th) {
            C5C.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C1370Mg> map, SparseArray<String> sparseArray) {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i = dataInputStream.readInt();
            if (i < 0 || i > 2) {
                C5C.A10(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A04 == null) {
                    C5C.A10(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A04.init(2, (Key) C5C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int i2 = dataInputStream.readInt();
            int iA00 = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                C1370Mg c1370MgA01 = A01(i, dataInputStream);
                map.put(c1370MgA01.A02, c1370MgA01);
                sparseArray.put(c1370MgA01.A01, c1370MgA01.A02);
                iA00 += A00(c1370MgA01, i);
            }
            int i4 = dataInputStream.readInt();
            boolean z = dataInputStream.read() == -1;
            if (i4 == iA00 && z) {
                C5C.A10(dataInputStream);
                return true;
            }
            C5C.A10(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                C5C.A10(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                C5C.A10(null);
            }
            throw th;
        }
    }

    static {
        A03();
    }

    public C2343kP(File file, byte[] bArr, boolean z) {
        AbstractC09153y.A08((bArr == null && z) ? false : true);
        Cipher cipherA05 = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC09153y.A07(bArr.length == 16);
            try {
                cipherA05 = C1372Mi.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            AbstractC09153y.A07(!z);
        }
        this.A06 = z;
        this.A04 = cipherA05;
        this.A05 = secretKeySpec;
        this.A03 = z ? new SecureRandom() : null;
        this.A02 = new AnonymousClass40(file);
    }

    private int A00(C1370Mg c1370Mg, int i) {
        int result = c1370Mg.A01;
        int i2 = result * 31;
        int result2 = c1370Mg.A02.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long jA00 = AbstractC1373Mj.A00(c1370Mg.A03());
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + c1370Mg.A03().hashCode();
    }

    private C1370Mg A01(int i, DataInputStream dataInputStream) throws IOException {
        C2341kN c2341kNA02;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i >= 2) {
            c2341kNA02 = C1372Mi.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            C1375Ml c1375Ml = new C1375Ml();
            C1375Ml.A00(c1375Ml, length);
            c2341kNA02 = C2341kN.A03.A05(c1375Ml);
        }
        return new C1370Mg(i2, utf, c2341kNA02);
    }

    private void A04(C1370Mg c1370Mg, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c1370Mg.A01);
        dataOutputStream.writeUTF(c1370Mg.A02);
        C1372Mi.A08(c1370Mg.A03(), dataOutputStream);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void A5p() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final boolean A6S() {
        return this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AAF(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AAs(HashMap<String, C1370Mg> map, SparseArray<String> sparseArray) {
        AbstractC09153y.A08(!this.A01);
        if (!A06(map, sparseArray)) {
            map.clear();
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A08[7] = "LXlnn5Px";
            sparseArray.clear();
            this.A02.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AFd(C1370Mg c1370Mg, boolean z) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AGK(C1370Mg c1370Mg) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AKI(HashMap<String, C1370Mg> map) throws IOException {
        A05(map);
        this.A01 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AKJ(HashMap<String, C1370Mg> map) throws IOException {
        if (!this.A01) {
            return;
        }
        AKI(map);
    }
}
