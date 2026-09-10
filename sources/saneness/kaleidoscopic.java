package saneness;

import ads_mobile_sdk.gd;
import ads_mobile_sdk.id;
import ads_mobile_sdk.jd;
import ads_mobile_sdk.kd;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class kaleidoscopic {
    public static byte[] apical(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }

    public static int attabal(int i, int i2) {
        int iCutely = cutely(i);
        int iCutely2 = cutely(i2);
        if (iCutely == 1) {
            if (iCutely2 == 1) {
                return 0;
            }
            if (iCutely2 == 2) {
                return -1;
            }
            throw new IllegalArgumentException(rotissomat.attabal("Unknown digestAlgorithm2: ", iCutely2));
        }
        if (iCutely != 2) {
            throw new IllegalArgumentException(rotissomat.attabal("Unknown digestAlgorithm1: ", iCutely));
        }
        if (iCutely2 == 1) {
            return 1;
        }
        if (iCutely2 == 2) {
            return 0;
        }
        throw new IllegalArgumentException(rotissomat.attabal("Unknown digestAlgorithm2: ", iCutely2));
    }

    public static X509Certificate[] beachfront(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferDern = dern(byteBuffer);
        ByteBuffer byteBufferDern2 = dern(byteBuffer);
        byte[] bArrApical = apical(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrApical2 = null;
        int i = 0;
        int i2 = -1;
        byte[] bArrApical3 = null;
        while (byteBufferDern2.hasRemaining()) {
            i++;
            try {
                ByteBuffer byteBufferDern3 = dern(byteBufferDern2);
                if (byteBufferDern3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferDern3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i2 == -1 || attabal(i3, i2) > 0) {
                    bArrApical3 = apical(byteBufferDern3);
                    i2 = i3;
                }
            } catch (IOException e) {
                e = e;
                throw new SecurityException(rotissomat.attabal("Failed to parse signature record #", i), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(rotissomat.attabal("Failed to parse signature record #", i), e);
            }
        }
        if (i2 == -1) {
            if (i == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i2));
            }
        } else {
            str = "DSA";
        }
        if (i2 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i2 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i2));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrApical));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferDern);
            if (!signature.verify(bArrApical3)) {
                throw new SecurityException(str2 + " signature did not verify");
            }
            byteBufferDern.clear();
            ByteBuffer byteBufferDern4 = dern(byteBufferDern);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferDern4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferDern5 = dern(byteBufferDern4);
                    if (byteBufferDern5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferDern5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i2) {
                        bArrApical2 = apical(byteBufferDern5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IOException(rotissomat.attabal("Failed to parse digest record #", i4), e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    throw new IOException(rotissomat.attabal("Failed to parse digest record #", i4), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iCutely = cutely(i2);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iCutely), bArrApical2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrApical2)) {
                throw new SecurityException(saneness(iCutely).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferDern6 = dern(byteBufferDern);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferDern6.hasRemaining()) {
                i6++;
                byte[] bArrApical4 = apical(byteBufferDern6);
                try {
                    arrayList3.add(new kd((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrApical4)), bArrApical4));
                } catch (CertificateException e5) {
                    throw new SecurityException(rotissomat.attabal("Failed to decode certificate #", i6), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrApical, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }

    public static byte[][] competently(int[] iArr, vintage[] vintageVarArr) throws DigestException {
        long j;
        int i;
        int i2;
        vintage[] vintageVarArr2 = vintageVarArr;
        int length = vintageVarArr2.length;
        int i3 = 0;
        long size = 0;
        while (true) {
            j = 1048576;
            if (i3 >= length) {
                break;
            }
            size += (vintageVarArr2[i3].size() + 1048575) / 1048576;
            i3++;
        }
        if (size >= 2097151) {
            throw new DigestException("Too many chunks: " + size);
        }
        int i4 = (int) size;
        byte[][] bArr = new byte[iArr.length][];
        int i5 = 0;
        while (true) {
            char c = 5;
            if (i5 >= iArr.length) {
                byte[] bArr2 = new byte[5];
                bArr2[0] = -91;
                int length2 = iArr.length;
                MessageDigest[] messageDigestArr = new MessageDigest[length2];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    String strSaneness = saneness(iArr[i6]);
                    try {
                        messageDigestArr[i6] = MessageDigest.getInstance(strSaneness);
                    } catch (NoSuchAlgorithmException e) {
                        throw new RuntimeException(strSaneness.concat(" digest not supported"), e);
                    }
                }
                int length3 = vintageVarArr2.length;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < length3) {
                    char c2 = c;
                    vintage vintageVar = vintageVarArr2[i7];
                    vintage vintageVar2 = vintageVar;
                    long size2 = vintageVar.size();
                    long j2 = 0;
                    int i10 = i9;
                    while (size2 > 0) {
                        int iMin = (int) Math.min(size2, j);
                        marial(bArr2, iMin);
                        length2 = length2;
                        for (int i11 = 0; i11 < length2; i11++) {
                            messageDigestArr[i11].update(bArr2);
                        }
                        byte[] bArr3 = bArr2;
                        vintage vintageVar3 = vintageVar2;
                        long j3 = j2;
                        try {
                            vintageVar3.a(messageDigestArr, j3, iMin);
                            int i12 = 0;
                            while (i12 < iArr.length) {
                                int i13 = iArr[i12];
                                int i14 = i12;
                                byte[] bArr4 = bArr[i14];
                                int i15 = length2;
                                if (i13 == 1) {
                                    i = 32;
                                } else {
                                    if (i13 != 2) {
                                        throw new IllegalArgumentException(rotissomat.attabal("Unknown content digest algorthm: ", i13));
                                    }
                                    i = 64;
                                }
                                MessageDigest messageDigest = messageDigestArr[i14];
                                int i16 = length3;
                                int i17 = i10;
                                byte[][] bArr5 = bArr;
                                int iDigest = messageDigest.digest(bArr4, (i17 * i) + 5, i);
                                if (iDigest != i) {
                                    throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                                }
                                i12 = i14 + 1;
                                i10 = i17;
                                length2 = i15;
                                length3 = i16;
                                bArr = bArr5;
                            }
                            long j4 = iMin;
                            j2 = j3 + j4;
                            size2 -= j4;
                            i10++;
                            vintageVar2 = vintageVar3;
                            bArr2 = bArr3;
                            length3 = length3;
                            j = 1048576;
                        } catch (IOException e2) {
                            throw new DigestException("Failed to digest chunk #" + i10 + " of section #" + i8, e2);
                        }
                    }
                    i8++;
                    i7++;
                    vintageVarArr2 = vintageVarArr;
                    i9 = i10;
                    c = c2;
                    length3 = length3;
                    j = 1048576;
                }
                byte[][] bArr6 = bArr;
                byte[][] bArr7 = new byte[iArr.length][];
                for (int i18 = 0; i18 < iArr.length; i18++) {
                    int i19 = iArr[i18];
                    byte[] bArr8 = bArr6[i18];
                    String strSaneness2 = saneness(i19);
                    try {
                        bArr7[i18] = MessageDigest.getInstance(strSaneness2).digest(bArr8);
                    } catch (NoSuchAlgorithmException e3) {
                        throw new RuntimeException(strSaneness2.concat(" digest not supported"), e3);
                    }
                }
                return bArr7;
            }
            int i20 = iArr[i5];
            if (i20 == 1) {
                i2 = 32;
            } else {
                if (i20 != 2) {
                    throw new IllegalArgumentException(rotissomat.attabal("Unknown content digest algorthm: ", i20));
                }
                i2 = 64;
            }
            byte[] bArr9 = new byte[(i2 * i4) + 5];
            bArr9[0] = 90;
            marial(bArr9, i4);
            bArr[i5] = bArr9;
            i5++;
        }
    }

    public static int cutely(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
        }
    }

    public static ByteBuffer dern(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return wireman(byteBuffer, i);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    public static X509Certificate[][] impromptu(RandomAccessFile randomAccessFile) throws jd, IOException {
        Pair pairAttabal;
        if (randomAccessFile.length() < 22) {
            pairAttabal = null;
        } else {
            pairAttabal = burglary.attabal(randomAccessFile, 0);
            if (pairAttabal == null) {
                pairAttabal = burglary.attabal(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        if (pairAttabal == null) {
            throw new jd("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        }
        ByteBuffer byteBuffer = (ByteBuffer) pairAttabal.first;
        long jLongValue = ((Long) pairAttabal.second).longValue();
        long j = jLongValue - 20;
        if (j >= 0) {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == 1347094023) {
                throw new jd("ZIP64 APK not supported");
            }
        }
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (byteOrderOrder != byteOrder) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        long j2 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
        if (j2 >= jLongValue) {
            throw new jd("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + jLongValue);
        }
        if (byteBuffer.order() != byteOrder) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        if (j2 + (((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) != jLongValue) {
            throw new jd("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        if (j2 < 32) {
            throw new jd("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j2 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new jd("No APK Signing Block before ZIP Central Directory");
        }
        long j3 = byteBufferAllocate.getLong(0);
        if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
            throw new jd("APK Signing Block size out of range: " + j3);
        }
        int i = (int) (8 + j3);
        long j4 = j2 - ((long) i);
        if (j4 < 0) {
            throw new jd("APK Signing Block offset out of range: " + j4);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j4);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j5 = byteBufferAllocate2.getLong(0);
        if (j5 != j3) {
            throw new jd("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
        }
        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
        long jLongValue2 = ((Long) pairCreate.second).longValue();
        if (byteBuffer2.order() != byteOrder) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        int iCapacity = byteBuffer2.capacity() - 24;
        if (iCapacity < 8) {
            throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
        }
        int iCapacity2 = byteBuffer2.capacity();
        if (iCapacity > byteBuffer2.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
        }
        int iLimit = byteBuffer2.limit();
        int iPosition = byteBuffer2.position();
        try {
            byteBuffer2.position(0);
            byteBuffer2.limit(iCapacity);
            byteBuffer2.position(8);
            ByteBuffer byteBufferSlice = byteBuffer2.slice();
            byteBufferSlice.order(byteBuffer2.order());
            byteBuffer2.position(0);
            byteBuffer2.limit(iLimit);
            byteBuffer2.position(iPosition);
            int i2 = 0;
            while (byteBufferSlice.hasRemaining()) {
                i2++;
                if (byteBufferSlice.remaining() < 8) {
                    throw new jd(rotissomat.attabal("Insufficient data to read size of APK Signing Block entry #", i2));
                }
                long j6 = byteBufferSlice.getLong();
                if (j6 < 4 || j6 > 2147483647L) {
                    throw new jd("APK Signing Block entry #" + i2 + " size out of range: " + j6);
                }
                int i3 = (int) j6;
                int iPosition2 = byteBufferSlice.position() + i3;
                if (i3 > byteBufferSlice.remaining()) {
                    throw new jd("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                }
                if (byteBufferSlice.getInt() == 1896449818) {
                    ByteBuffer byteBufferWireman = wireman(byteBufferSlice, i3 - 4);
                    FileChannel channel = randomAccessFile.getChannel();
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    try {
                        CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                        try {
                            ByteBuffer byteBufferDern = dern(byteBufferWireman);
                            int i4 = 0;
                            while (byteBufferDern.hasRemaining()) {
                                i4++;
                                try {
                                    arrayList.add(beachfront(dern(byteBufferDern), map, certificateFactory));
                                } catch (IOException | SecurityException | BufferUnderflowException e) {
                                    throw new SecurityException("Failed to parse/verify signer #" + i4 + " block", e);
                                }
                            }
                            if (i4 < 1) {
                                throw new SecurityException("No signers found");
                            }
                            if (map.isEmpty()) {
                                throw new SecurityException("No content digests found");
                            }
                            if (map.isEmpty()) {
                                throw new SecurityException("No digests provided");
                            }
                            id idVar = new id(channel, 0L, jLongValue2);
                            id idVar2 = new id(channel, j2, jLongValue - j2);
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                            byteBufferDuplicate.order(byteOrder2);
                            if (byteBufferDuplicate.order() != byteOrder2) {
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            int iPosition3 = byteBufferDuplicate.position() + 16;
                            if (jLongValue2 < 0 || jLongValue2 > 4294967295L) {
                                throw new IllegalArgumentException("uint32 value of out range: " + jLongValue2);
                            }
                            byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition3, (int) jLongValue2);
                            gd gdVar = new gd(byteBufferDuplicate);
                            int size = map.size();
                            int[] iArr = new int[size];
                            Iterator it = map.keySet().iterator();
                            int i5 = 0;
                            while (it.hasNext()) {
                                iArr[i5] = ((Integer) it.next()).intValue();
                                i5++;
                            }
                            try {
                                byte[][] bArrCompetently = competently(iArr, new vintage[]{idVar, idVar2, gdVar});
                                for (int i6 = 0; i6 < size; i6++) {
                                    int i7 = iArr[i6];
                                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i7)), bArrCompetently[i6])) {
                                        throw new SecurityException(saneness(i7).concat(" digest of contents did not verify"));
                                    }
                                }
                                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                            } catch (DigestException e2) {
                                throw new SecurityException("Failed to compute digest(s) of contents", e2);
                            }
                        } catch (IOException e3) {
                            throw new SecurityException("Failed to read list of signers", e3);
                        }
                    } catch (CertificateException e4) {
                        throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
                    }
                }
                byteBufferSlice.position(iPosition2);
            }
            throw new jd("No APK Signature Scheme v2 block in APK Signing Block");
        } catch (Throwable th) {
            byteBuffer2.position(0);
            byteBuffer2.limit(iLimit);
            byteBuffer2.position(iPosition);
            throw th;
        }
    }

    public static void marial(byte[] bArr, int i) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) ((i >>> 24) & 255);
    }

    public static String saneness(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(rotissomat.attabal("Unknown content digest algorthm: ", i));
    }

    public static X509Certificate[][] taiyuan(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            X509Certificate[][] x509CertificateArrImpromptu = impromptu(randomAccessFile);
            randomAccessFile.close();
            return x509CertificateArrImpromptu;
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ByteBuffer wireman(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(rotissomat.attabal("size: ", i));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }
}
