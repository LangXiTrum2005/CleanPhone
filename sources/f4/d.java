package f4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import d5.u;
import ea.a0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f40634a = new a0(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f40635b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f40636c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f40637d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f40638e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f40639f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f40640g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f40641h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f40642i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f40643j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (b bVar : bVarArr) {
            length += ((((bVar.f40631g * 2) + 7) & (-8)) / 8) + (bVar.f40629e * 2) + d(bVar.f40625a, bArr, bVar.f40626b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f40630f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f40639f)) {
            int length2 = bVarArr.length;
            while (i10 < length2) {
                b bVar2 = bVarArr[i10];
                q(byteArrayOutputStream, bVar2, d(bVar2.f40625a, bArr, bVar2.f40626b));
                p(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                q(byteArrayOutputStream, bVar3, d(bVar3.f40625a, bArr, bVar3.f40626b));
            }
            int length3 = bVarArr.length;
            while (i10 < length3) {
                p(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, byte[] bArr, String str2) {
        byte[] bArr2 = f40641h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f40640g;
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
                return defpackage.e.q((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2, u.i(str));
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(l1.d.e(i10, "Not enough bytes to read: "));
            }
            i11 += i12;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iM = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i11] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[com.ironsource.mediationsdk.metadata.a.f29616n];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) throws IOException {
        byte[] bArr3 = f40642i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f40643j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                b[] bVarArrK = k(byteArrayInputStream, bArr2, iM, bVarArr);
                byteArrayInputStream.close();
                return bVarArrK;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f40637d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            b[] bVarArrJ = j(byteArrayInputStream2, iM2, bVarArr);
            byteArrayInputStream2.close();
            return bVarArrJ;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i11] = (int) m(byteArrayInputStream, 2);
            strArr[i11] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            if (!bVar.f40626b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            bVar.f40629e = i13;
            bVar.f40632h = g(byteArrayInputStream, i13);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i12 = 0; i12 < bVarArr.length; i12++) {
                    if (bVarArr[i12].f40626b.equals(strSubstring)) {
                        bVar = bVarArr[i12];
                        break;
                    }
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f40628d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f40641h)) {
                bVar.f40629e = iM;
                bVar.f40632h = iArrG;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f40638e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            b[] bVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return bVarArrN;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(InputStream inputStream, int i10) throws IOException {
        byte[] bArrF = f(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrF[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            bVarArr[i12] = new b(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            b bVar = bVarArr[i13];
            int iAvailable = byteArrayInputStream.available();
            int i14 = bVar.f40630f;
            int i15 = bVar.f40631g;
            TreeMap treeMap = bVar.f40633i;
            int i16 = iAvailable - i14;
            int iM3 = i11;
            while (byteArrayInputStream.available() > i16) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i17 = i11;
                            int i18 = i13;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i11 = i17;
                            i13 = i18;
                        }
                    }
                    iM4--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i19 = i11;
            int i20 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f40632h = g(byteArrayInputStream, bVar.f40629e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i15; i21++) {
                int i22 = bitSetValueOf.get(i21) ? 2 : i19;
                if (bitSetValueOf.get(i21 + i15)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | numValueOf.intValue()));
                }
            }
            i13 = i20 + 1;
            i11 = i19;
        }
        return bVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) throws IOException {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f40637d;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f40638e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(bVarArr, bArr3);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f40640g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f40633i.size() * 4;
                    String strD = d(bVar.f40625a, bArr4, bVar.f40626b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, bVar.f40632h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, bVar.f40627c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = bVar.f40633i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i11 : bVar.f40632h) {
                        v(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f40639f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(bVarArr, bArr5);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f40641h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f40625a;
                TreeMap treeMap = bVar2.f40633i;
                String strD2 = d(str, bArr6, bVar2.f40626b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, bVar2.f40632h.length);
                u(byteArrayOutputStream, bVar2.f40627c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : bVar2.f40632h) {
                    v(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, bVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (b bVar3 : bVarArr) {
                u(byteArrayOutputStream2, bVar3.f40627c, 4);
                u(byteArrayOutputStream2, bVar3.f40628d, 4);
                u(byteArrayOutputStream2, bVar3.f40631g, 4);
                String strD3 = d(bVar3.f40625a, bArr2, bVar3.f40626b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i15];
                    v(byteArrayOutputStream3, i15);
                    v(byteArrayOutputStream3, bVar4.f40629e);
                    i16 = i16 + 4 + (bVar4.f40629e * i13);
                    int[] iArr = bVar4.f40632h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        v(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i21];
                    Iterator it3 = bVar5.f40633i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i21);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i22 = i23 + length4;
                            i21++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i22 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i22 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList2.add(iVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i24);
                int i25 = iVar4.f40652a;
                byte[] bArr7 = iVar4.f40653b;
                if (i25 == 1) {
                    j10 = 0;
                } else if (i25 == 2) {
                    j10 = 1;
                } else if (i25 == 3) {
                    j10 = 2;
                } else if (i25 == 4) {
                    j10 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                u(byteArrayOutputStream, j10, 4);
                u(byteArrayOutputStream, size2, 4);
                if (iVar4.f40654c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th10) {
            try {
                byteArrayOutputStream2.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        s(byteArrayOutputStream, bVar);
        int i10 = bVar.f40631g;
        int[] iArr = bVar.f40632h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            v(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f40633i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, bVar.f40629e);
        u(byteArrayOutputStream, bVar.f40630f, 4);
        u(byteArrayOutputStream, bVar.f40627c, 4);
        u(byteArrayOutputStream, bVar.f40631g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i10, b bVar) throws IOException {
        int i11 = bVar.f40631g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f40633i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : bVar.f40633i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i10);
                v(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0186 A[Catch: all -> 0x0183, TRY_ENTER, TryCatch #25 {all -> 0x0183, blocks: (B:88:0x0162, B:90:0x016e, B:101:0x0186, B:102:0x018b), top: B:273:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0197 A[Catch: IllegalStateException -> 0x017d, IOException -> 0x017f, FileNotFoundException -> 0x0181, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x0181, IOException -> 0x017f, IllegalStateException -> 0x017d, blocks: (B:86:0x015a, B:91:0x0178, B:109:0x0197, B:107:0x0194, B:106:0x0191), top: B:293:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d7 A[Catch: all -> 0x01e5, TRY_LEAVE, TryCatch #6 {all -> 0x01e5, blocks: (B:124:0x01cb, B:126:0x01d7, B:135:0x01e8), top: B:256:0x01cb, outer: #35 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01e8 A[Catch: all -> 0x01e5, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x01e5, blocks: (B:124:0x01cb, B:126:0x01d7, B:135:0x01e8), top: B:256:0x01cb, outer: #35 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0205  */
    /* JADX WARN: Code duplicated, block: B:150:0x0211  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237 A[Catch: all -> 0x0275, TryCatch #19 {all -> 0x0275, blocks: (B:158:0x0231, B:160:0x0237, B:161:0x023b, B:163:0x0241), top: B:267:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0241 A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #19 {all -> 0x0275, blocks: (B:158:0x0231, B:160:0x0237, B:161:0x023b, B:163:0x0241), top: B:267:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:240:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:267:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0246 A[EDGE_INSN: B:294:0x0246->B:165:0x0246 BREAK  A[LOOP:0: B:161:0x023b->B:295:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0124, IllegalStateException -> 0x0127, IOException -> 0x0129, TRY_LEAVE, TryCatch #21 {IllegalStateException -> 0x0127, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012b, B:67:0x0130), top: B:271:0x0107, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012b A[Catch: all -> 0x0124, IllegalStateException -> 0x0127, IOException -> 0x0129, TRY_ENTER, TryCatch #21 {IllegalStateException -> 0x0127, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012b, B:67:0x0130), top: B:271:0x0107, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x016e A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #25 {all -> 0x0183, blocks: (B:88:0x0162, B:90:0x016e, B:101:0x0186, B:102:0x018b), top: B:273:0x0162 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [f4.b[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Serializable] */
    public static void t(Context context, Executor executor, c cVar, boolean z10) {
        boolean z11;
        ?? M;
        byte[] bArr;
        ?? r10;
        b[] bVarArrL;
        b[] bVarArr;
        c cVar2;
        b[] bVarArr2;
        byte[] bArr2;
        ?? r11;
        byte[] bArr3;
        ?? r12;
        boolean z12;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i10;
        ?? r13;
        boolean z13;
        ?? byteArrayOutputStream;
        ?? r14;
        a aVar;
        ?? r15;
        String str;
        FileInputStream fileInputStreamM;
        ?? r16;
        ?? r17;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = j10 == packageInfo.lastUpdateTime;
                            if (z14) {
                                cVar.g(2, null);
                            }
                        } catch (Throwable th4) {
                            try {
                                dataInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (IOException unused) {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    h.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            a aVar2 = new a(assets, executor, cVar, name, file2);
            byte[] bArr5 = (byte[]) aVar2.f40621e;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            aVar2.f40617a = true;
                            M = aVar2.m(assets, "dexopt/baseline.prof");
                            bArr = f40635b;
                            if (M != 0) {
                                if (Arrays.equals(bArr, f(M, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                bVarArrL = l(M, f(M, 4), aVar2.f40618b);
                                M.close();
                                r10 = bVarArrL;
                                aVar2.f40624h = r10;
                            }
                            bVarArr = (b[]) aVar2.f40624h;
                            if (bVarArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM = aVar2.m(assets, "dexopt/baseline.profm");
                                r15 = str;
                                if (fileInputStreamM == null) {
                                    if (fileInputStreamM != null) {
                                        fileInputStreamM.close();
                                        r15 = str;
                                    }
                                    aVar = null;
                                    M = r15;
                                } else {
                                    if (Arrays.equals(f40636c, f(fileInputStreamM, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrF = f(fileInputStreamM, 4);
                                    aVar2.f40624h = i(fileInputStreamM, bArrF, bArr5, bVarArr);
                                    fileInputStreamM.close();
                                    aVar = aVar2;
                                    M = bArrF;
                                }
                                if (aVar != null) {
                                    aVar2 = aVar;
                                }
                            }
                            cVar2 = (c) aVar2.f40620d;
                            bVarArr2 = (b[]) aVar2.f40624h;
                            bArr2 = (byte[]) aVar2.f40621e;
                            r11 = M;
                            r11 = M;
                            if (bVarArr2 != null) {
                                byteArrayOutputStream = aVar2.f40617a;
                                if (byteArrayOutputStream != 0) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (o(byteArrayOutputStream, bArr2, bVarArr2)) {
                                    aVar2.f40622f = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r14 = byteArrayOutputStream;
                                    aVar2.f40624h = null;
                                    r11 = r14;
                                } else {
                                    cVar2.g(5, null);
                                    aVar2.f40624h = null;
                                    byteArrayOutputStream.close();
                                    r11 = byteArrayOutputStream;
                                }
                            }
                            bArr3 = (byte[]) aVar2.f40622f;
                            if (bArr3 != null) {
                                if (aVar2.f40617a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream((File) aVar2.f40623g);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i10 = byteArrayInputStream.read(bArr4);
                                            if (i10 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i10);
                                        }
                                        r13 = 1;
                                        aVar2.n(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        aVar2.f40622f = null;
                                        aVar2.f40624h = null;
                                        z12 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z12 = false;
                            r13 = 1;
                            if (z12) {
                                e(packageInfo, filesDir);
                            }
                            z13 = z12;
                            r16 = r13;
                        } else {
                            aVar2.n(4, null);
                        }
                    } catch (IOException unused2) {
                        z11 = true;
                        aVar2.n(4, null);
                    }
                } else if (file2.canWrite()) {
                    aVar2.f40617a = true;
                    try {
                        M = aVar2.m(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        cVar.g(6, e10);
                        M = 0;
                    } catch (IOException e11) {
                        cVar.g(7, e11);
                        M = 0;
                    }
                    bArr = f40635b;
                    try {
                        if (M != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr, f(M, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVarArrL = l(M, f(M, 4), aVar2.f40618b);
                                    try {
                                        M.close();
                                        r10 = bVarArrL;
                                    } catch (IOException e12) {
                                        cVar.g(7, e12);
                                        r10 = bVarArrL;
                                    }
                                    aVar2.f40624h = r10;
                                } catch (IOException e13) {
                                    cVar.g(7, e13);
                                    try {
                                        M.close();
                                    } catch (IOException e14) {
                                        cVar.g(7, e14);
                                    }
                                    r10 = 0;
                                }
                            } catch (IllegalStateException e15) {
                                cVar.g(8, e15);
                                M.close();
                                r10 = 0;
                            }
                        }
                        bVarArr = (b[]) aVar2.f40624h;
                        if (bVarArr != null && (M = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM = aVar2.m(assets, "dexopt/baseline.profm");
                                r15 = str;
                                if (fileInputStreamM == null) {
                                    try {
                                        if (Arrays.equals(f40636c, f(fileInputStreamM, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrF2 = f(fileInputStreamM, 4);
                                        aVar2.f40624h = i(fileInputStreamM, bArrF2, bArr5, bVarArr);
                                        fileInputStreamM.close();
                                        aVar = aVar2;
                                        M = bArrF2;
                                    } catch (Throwable th6) {
                                        try {
                                            fileInputStreamM.close();
                                            throw th6;
                                        } catch (Throwable th7) {
                                            th6.addSuppressed(th7);
                                            throw th6;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamM != null) {
                                        fileInputStreamM.close();
                                        r15 = str;
                                    }
                                    aVar = null;
                                    M = r15;
                                }
                            } catch (FileNotFoundException e16) {
                                cVar.g(9, e16);
                                r15 = M;
                            } catch (IOException e17) {
                                cVar.g(7, e17);
                                r15 = M;
                            } catch (IllegalStateException e18) {
                                aVar2.f40624h = null;
                                cVar.g(8, e18);
                                r15 = M;
                            }
                            if (aVar != null) {
                                aVar2 = aVar;
                            }
                        }
                        cVar2 = (c) aVar2.f40620d;
                        bVarArr2 = (b[]) aVar2.f40624h;
                        bArr2 = (byte[]) aVar2.f40621e;
                        r11 = M;
                        r11 = M;
                        if (bVarArr2 != null && bArr2 != null) {
                            byteArrayOutputStream = aVar2.f40617a;
                            if (byteArrayOutputStream != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (o(byteArrayOutputStream, bArr2, bVarArr2)) {
                                        cVar2.g(5, null);
                                        aVar2.f40624h = null;
                                        byteArrayOutputStream.close();
                                        r11 = byteArrayOutputStream;
                                    } else {
                                        aVar2.f40622f = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r14 = byteArrayOutputStream;
                                        aVar2.f40624h = null;
                                        r11 = r14;
                                    }
                                } catch (Throwable th8) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th8;
                                    } catch (Throwable th9) {
                                        th8.addSuppressed(th9);
                                        throw th8;
                                    }
                                }
                            } catch (IOException e19) {
                                cVar2.g(7, e19);
                                r14 = byteArrayOutputStream;
                            } catch (IllegalStateException e20) {
                                cVar2.g(8, e20);
                                r14 = byteArrayOutputStream;
                            }
                        }
                        bArr3 = (byte[]) aVar2.f40622f;
                        if (bArr3 != null) {
                            z12 = false;
                            r13 = 1;
                        } else {
                            try {
                                if (aVar2.f40617a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) aVar2.f40623g);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i10 = byteArrayInputStream.read(bArr4);
                                                                                    if (i10 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i10);
                                                                                    }
                                                                                }
                                                                                r13 = 1;
                                                                                aVar2.n(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                aVar2.f40622f = null;
                                                                                aVar2.f40624h = null;
                                                                                z12 = true;
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            Throwable th11 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th11;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th11;
                                                                            } catch (Throwable th12) {
                                                                                th11.addSuppressed(th12);
                                                                                throw th11;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th13) {
                                                                    th = th13;
                                                                }
                                                            } catch (Throwable th14) {
                                                                th = th14;
                                                                Throwable th15 = th;
                                                                if (channel == null) {
                                                                    throw th15;
                                                                }
                                                                try {
                                                                    channel.close();
                                                                    throw th15;
                                                                } catch (Throwable th16) {
                                                                    th15.addSuppressed(th16);
                                                                    throw th15;
                                                                }
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                        }
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        th3 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th3;
                                                        } catch (Throwable th19) {
                                                            th3.addSuppressed(th19);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th20) {
                                                    th = th20;
                                                    th3 = th;
                                                    fileOutputStream.close();
                                                    throw th3;
                                                }
                                            } catch (Throwable th21) {
                                                th = th21;
                                                th2 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th22) {
                                                    th2.addSuppressed(th22);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                            th2 = th;
                                            byteArrayInputStream.close();
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e21) {
                                        e = e21;
                                        r11 = 1;
                                        aVar2.n(6, e);
                                        r12 = r11;
                                        aVar2.f40622f = null;
                                        aVar2.f40624h = null;
                                        z12 = false;
                                        r13 = r12;
                                    } catch (IOException e22) {
                                        e = e22;
                                        r11 = 1;
                                        aVar2.n(7, e);
                                        r12 = r11;
                                        aVar2.f40622f = null;
                                        aVar2.f40624h = null;
                                        z12 = false;
                                        r13 = r12;
                                    }
                                } catch (FileNotFoundException e23) {
                                    e = e23;
                                    aVar2.n(6, e);
                                    r12 = r11;
                                    aVar2.f40622f = null;
                                    aVar2.f40624h = null;
                                    z12 = false;
                                    r13 = r12;
                                } catch (IOException e24) {
                                    e = e24;
                                    aVar2.n(7, e);
                                    r12 = r11;
                                    aVar2.f40622f = null;
                                    aVar2.f40624h = null;
                                    z12 = false;
                                    r13 = r12;
                                }
                            } catch (Throwable th24) {
                                aVar2.f40622f = null;
                                aVar2.f40624h = null;
                                throw th24;
                            }
                        }
                        if (z12) {
                            e(packageInfo, filesDir);
                        }
                        z13 = z12;
                        r16 = r13;
                    } catch (Throwable th25) {
                        try {
                            M.close();
                            throw th25;
                        } catch (IOException e25) {
                            cVar.g(7, e25);
                            throw th25;
                        }
                    }
                } else {
                    aVar2.n(4, null);
                }
                if (z13 || !z10) {
                    r17 = 0;
                } else {
                    r17 = r16;
                }
                h.c(context, r17);
            }
            aVar2.n(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z11 = true;
            z13 = false;
            r16 = z11;
            if (z13) {
                r17 = 0;
            } else {
                r17 = 0;
            }
            h.c(context, r17);
        } catch (PackageManager.NameNotFoundException e26) {
            cVar.g(7, e26);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        u(byteArrayOutputStream, i10, 2);
    }
}
