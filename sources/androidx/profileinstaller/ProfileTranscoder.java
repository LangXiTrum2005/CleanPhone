package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class ProfileTranscoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7981a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f7982b = {112, 114, 109, 0};

    public static byte[] a(DexProfileData[] dexProfileDataArr, byte[] bArr) throws IOException {
        int length = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            length += ((((dexProfileData.g * 2) + 7) & (-8)) / 8) + (dexProfileData.f7974e * 2) + b(dexProfileData.f7971a, dexProfileData.f7972b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dexProfileData.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ProfileVersion.f7991c)) {
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                j(byteArrayOutputStream, dexProfileData2, b(dexProfileData2.f7971a, dexProfileData2.f7972b, bArr));
                l(byteArrayOutputStream, dexProfileData2);
                int[] iArr = dexProfileData2.f7975h;
                int length2 = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = iArr[i2];
                    Encoding.f(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                k(byteArrayOutputStream, dexProfileData2);
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                j(byteArrayOutputStream, dexProfileData3, b(dexProfileData3.f7971a, dexProfileData3.f7972b, bArr));
            }
            for (DexProfileData dexProfileData4 : dexProfileDataArr) {
                l(byteArrayOutputStream, dexProfileData4);
                int[] iArr2 = dexProfileData4.f7975h;
                int length3 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length3) {
                    int i7 = iArr2[i5];
                    Encoding.f(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                k(byteArrayOutputStream, dexProfileData4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = ProfileVersion.f7992e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = ProfileVersion.d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return android.support.v4.media.a.r(android.support.v4.media.a.w(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iD = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iD += (int) Encoding.d(byteArrayInputStream, 2);
            iArr[i3] = iD;
        }
        return iArr;
    }

    public static DexProfileData[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] bArr3 = ProfileVersion.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ProfileVersion.g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iD = (int) Encoding.d(fileInputStream, 2);
            byte[] bArrC = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                DexProfileData[] dexProfileDataArrF = f(byteArrayInputStream, bArr2, iD, dexProfileDataArr);
                byteArrayInputStream.close();
                return dexProfileDataArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ProfileVersion.f7989a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iD2 = (int) Encoding.d(fileInputStream, 1);
        byte[] bArrC2 = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            DexProfileData[] dexProfileDataArrE = e(byteArrayInputStream2, iD2, dexProfileDataArr);
            byteArrayInputStream2.close();
            return dexProfileDataArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static DexProfileData[] e(ByteArrayInputStream byteArrayInputStream, int i2, DexProfileData[] dexProfileDataArr) {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 != dexProfileDataArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iD = (int) Encoding.d(byteArrayInputStream, 2);
            iArr[i3] = (int) Encoding.d(byteArrayInputStream, 2);
            strArr[i3] = new String(Encoding.b(byteArrayInputStream, iD), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            DexProfileData dexProfileData = dexProfileDataArr[i4];
            if (!dexProfileData.f7972b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            dexProfileData.f7974e = i5;
            dexProfileData.f7975h = c(byteArrayInputStream, i5);
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, DexProfileData[] dexProfileDataArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 != dexProfileDataArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            Encoding.d(byteArrayInputStream, 2);
            String str = new String(Encoding.b(byteArrayInputStream, (int) Encoding.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jD = Encoding.d(byteArrayInputStream, 4);
            int iD = (int) Encoding.d(byteArrayInputStream, 2);
            DexProfileData dexProfileData = null;
            if (dexProfileDataArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < dexProfileDataArr.length; i4++) {
                    if (dexProfileDataArr[i4].f7972b.equals(strSubstring)) {
                        dexProfileData = dexProfileDataArr[i4];
                        break;
                    }
                }
            }
            if (dexProfileData == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            dexProfileData.d = jD;
            int[] iArrC = c(byteArrayInputStream, iD);
            if (Arrays.equals(bArr, ProfileVersion.f7992e)) {
                dexProfileData.f7974e = iD;
                dexProfileData.f7975h = iArrC;
            }
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.f7990b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iD = (int) Encoding.d(fileInputStream, 1);
        byte[] bArrC = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            DexProfileData[] dexProfileDataArrH = h(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return dexProfileDataArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static DexProfileData[] h(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iD = (int) Encoding.d(byteArrayInputStream, 2);
            int iD2 = (int) Encoding.d(byteArrayInputStream, 2);
            dexProfileDataArr[i3] = new DexProfileData(str, new String(Encoding.b(byteArrayInputStream, iD), StandardCharsets.UTF_8), Encoding.d(byteArrayInputStream, 4), iD2, (int) Encoding.d(byteArrayInputStream, 4), (int) Encoding.d(byteArrayInputStream, 4), new int[iD2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            DexProfileData dexProfileData = dexProfileDataArr[i4];
            int iAvailable = byteArrayInputStream.available() - dexProfileData.f;
            int iD3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = dexProfileData.f7976i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iD3 += (int) Encoding.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iD3), 1);
                for (int iD4 = (int) Encoding.d(byteArrayInputStream, 2); iD4 > 0; iD4--) {
                    Encoding.d(byteArrayInputStream, 2);
                    int iD5 = (int) Encoding.d(byteArrayInputStream, 1);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            Encoding.d(byteArrayInputStream, 1);
                            for (int iD6 = (int) Encoding.d(byteArrayInputStream, 1); iD6 > 0; iD6--) {
                                Encoding.d(byteArrayInputStream, 2);
                            }
                            iD5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            dexProfileData.f7975h = c(byteArrayInputStream, dexProfileData.f7974e);
            int i5 = dexProfileData.g;
            BitSet bitSetValueOf = BitSet.valueOf(Encoding.b(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(i6) ? 2 : 0;
                if (bitSetValueOf.get(i6 + i5)) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return dexProfileDataArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = ProfileVersion.f7989a;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = ProfileVersion.f7990b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(dexProfileDataArr, bArr3);
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = Encoding.a(bArrA);
                Encoding.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = ProfileVersion.d;
            if (Arrays.equals(bArr, bArr4)) {
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                for (DexProfileData dexProfileData : dexProfileDataArr) {
                    int size = dexProfileData.f7976i.size() * 4;
                    String strB = b(dexProfileData.f7971a, dexProfileData.f7972b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    Encoding.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    Encoding.f(byteArrayOutputStream, dexProfileData.f7975h.length);
                    Encoding.e(byteArrayOutputStream, size, 4);
                    Encoding.e(byteArrayOutputStream, dexProfileData.f7973c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator it = dexProfileData.f7976i.keySet().iterator();
                    while (it.hasNext()) {
                        Encoding.f(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        Encoding.f(byteArrayOutputStream, 0);
                    }
                    for (int i3 : dexProfileData.f7975h) {
                        Encoding.f(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = ProfileVersion.f7991c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(dexProfileDataArr, bArr5);
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = Encoding.a(bArrA3);
                Encoding.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = ProfileVersion.f7992e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            Encoding.f(byteArrayOutputStream, dexProfileDataArr.length);
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                String strB2 = b(dexProfileData2.f7971a, dexProfileData2.f7972b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                Encoding.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                TreeMap treeMap = dexProfileData2.f7976i;
                Encoding.f(byteArrayOutputStream, treeMap.size());
                Encoding.f(byteArrayOutputStream, dexProfileData2.f7975h.length);
                Encoding.e(byteArrayOutputStream, dexProfileData2.f7973c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    Encoding.f(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : dexProfileData2.f7975h) {
                    Encoding.f(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            Encoding.f(byteArrayOutputStream2, dexProfileDataArr.length);
            int i5 = 2;
            int i6 = 2;
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                Encoding.e(byteArrayOutputStream2, dexProfileData3.f7973c, 4);
                Encoding.e(byteArrayOutputStream2, dexProfileData3.d, 4);
                Encoding.e(byteArrayOutputStream2, dexProfileData3.g, 4);
                String strB3 = b(dexProfileData3.f7971a, dexProfileData3.f7972b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                Encoding.f(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(writableFileSection);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            for (int i8 = 0; i8 < dexProfileDataArr.length; i8++) {
                try {
                    DexProfileData dexProfileData4 = dexProfileDataArr[i8];
                    Encoding.f(byteArrayOutputStream3, i8);
                    Encoding.f(byteArrayOutputStream3, dexProfileData4.f7974e);
                    i7 = i7 + 4 + (dexProfileData4.f7974e * i5);
                    int[] iArr = dexProfileData4.f7975h;
                    int length3 = iArr.length;
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < length3) {
                        int i11 = iArr[i9];
                        Encoding.f(byteArrayOutputStream3, i11 - i10);
                        i9++;
                        i5 = i5;
                        i10 = i11;
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            WritableFileSection writableFileSection2 = new WritableFileSection(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < dexProfileDataArr.length) {
                try {
                    DexProfileData dexProfileData5 = dexProfileDataArr[i12];
                    Iterator it3 = dexProfileData5.f7976i.entrySet().iterator();
                    int iIntValue = i2;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        k(byteArrayOutputStream5, dexProfileData5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            l(byteArrayOutputStream6, dexProfileData5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            Encoding.f(byteArrayOutputStream4, i12);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            Encoding.e(byteArrayOutputStream4, length4, 4);
                            Encoding.f(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                            i2 = 0;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            WritableFileSection writableFileSection3 = new WritableFileSection(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(writableFileSection3);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList2.size() * 16));
            Encoding.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                WritableFileSection writableFileSection4 = (WritableFileSection) arrayList2.get(i15);
                Encoding.e(byteArrayOutputStream, writableFileSection4.f7993a.X, 4);
                Encoding.e(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = writableFileSection4.f7994b;
                if (writableFileSection4.f7995c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = Encoding.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    Encoding.e(byteArrayOutputStream, bArrA5.length, 4);
                    Encoding.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    Encoding.e(byteArrayOutputStream, bArr7.length, 4);
                    Encoding.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        Encoding.f(byteArrayOutputStream, str.getBytes(charset).length);
        Encoding.f(byteArrayOutputStream, dexProfileData.f7974e);
        Encoding.e(byteArrayOutputStream, dexProfileData.f, 4);
        Encoding.e(byteArrayOutputStream, dexProfileData.f7973c, 4);
        Encoding.e(byteArrayOutputStream, dexProfileData.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) throws IOException {
        byte[] bArr = new byte[(((dexProfileData.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.f7976i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i2 = iIntValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i3 = iIntValue + dexProfileData.g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : dexProfileData.f7976i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                Encoding.f(byteArrayOutputStream, iIntValue - i2);
                Encoding.f(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }
}
