package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
public final class C1541Mi {
    public static byte[] A06;
    public static String[] A07 = {"1eaMPdLcC8DbZCkn0iIyVPFCZSdDAanS", "Exaxr4PlErBkBzdiwoicKn", "2BC", "jQaYCx7PV0mXn8Zj7H8rC7xxlui6spsC", "wp2nCKHDQcjkZqDMhhhKbFGW7G", "lMJ", "SjVm96go47njO9ADG8uLls", "QdN"};
    public InterfaceC1540Mh A00;
    public InterfaceC1540Mh A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, C1539Mg> A05;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{20, 16, 6, 122, 22, 23, 22, 122, 5, 30, 22, 6, 96, 5, 20, 17, 17, 28, 27, 18, 32, 33, 66, 101, 125, 106, 103, 98, 111, 43, 125, 106, 103, 126, 110, 43, 120, 98, 113, 110, 49, 43, AbstractJsonLexerKt.TC_INVALID, 125, AbstractJsonLexerKt.TC_INVALID, 116, 121, 120, 67, AbstractJsonLexerKt.TC_INVALID, 115, 114, 104, 121, 114, 104, 67, 117, 114, 120, 121, 100, 50, 121, 100, 117};
    }

    static {
        A07();
    }

    public C1541Mi(C5O c5o, File file, byte[] bArr, boolean z2, boolean z3) {
        AbstractC10843y.A08((c5o == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        C2513kQ c2513kQ = c5o != null ? new C2513kQ(c5o) : null;
        InterfaceC1540Mh databaseStorage = file != null ? new C2512kP(new File(file, A04(42, 24, 47)), bArr, z2) : null;
        if (c2513kQ == null || (databaseStorage != null && z3)) {
            InterfaceC1540Mh legacyStorage = (InterfaceC1540Mh) C5C.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = c2513kQ;
        } else {
            this.A01 = c2513kQ;
            this.A00 = databaseStorage;
        }
    }

    public static int A00(SparseArray<String> idToKey) {
        int id;
        int size = idToKey.size();
        if (size == 0) {
            id = 0;
        } else {
            int size2 = size - 1;
            id = idToKey.keyAt(size2) + 1;
        }
        if (id < 0) {
            id = 0;
            while (id < size) {
                int size3 = idToKey.keyAt(id);
                if (id != size3) {
                    break;
                }
                id++;
            }
        }
        return id;
    }

    private C1539Mg A01(String str) {
        int iA00 = A00(this.A02);
        C1539Mg c1539Mg = new C1539Mg(iA00, str);
        this.A05.put(str, c1539Mg);
        this.A02.put(iA00, str);
        this.A03.put(iA00, true);
        this.A01.AGK(c1539Mg);
        return c1539Mg;
    }

    public static C2510kN A02(DataInputStream dataInputStream) throws IOException {
        int i2 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < i2; nextBytesToRead++) {
            String utf = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i3 = Math.min(bytesRead, 10485760);
                byte[] bArrCopyOf = C5C.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i3;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    dataInputStream.readFully(bArrCopyOf, valueSize, i3);
                    valueSize += i3;
                    int size2 = bytesRead - valueSize;
                    i3 = Math.min(size2, 10485760);
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(A04(22, 20, 56) + bytesRead);
            }
        }
        return new C2510kN(map);
    }

    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i2 = C5C.A02;
        String strA04 = A04(0, 20, 102);
        if (i2 == 18) {
            try {
                return Cipher.getInstance(strA04, A04(20, 2, 81));
            } catch (Throwable unused) {
            }
        }
        Cipher cipher = Cipher.getInstance(strA04);
        String[] strArr = A07;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "EBBbD5OLh9DYDBrMigQNtJ";
        strArr2[1] = "xQSZ94mu2vygjBv0Ab9r12";
        return cipher;
    }

    public static void A08(C2510kN c2510kN, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setA06 = c2510kN.A06();
        dataOutputStream.writeInt(setA06.size());
        for (Map.Entry<String, byte[]> entry : setA06) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, 47));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final C1539Mg A0C(String str) {
        return this.A05.get(str);
    }

    public final C1539Mg A0D(String str) {
        C1539Mg cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final C2510kN A0E(String str) {
        C1539Mg cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : C2510kN.A03;
    }

    public final String A0F(int i2) {
        return this.A02.get(i2);
    }

    public final Collection<C1539Mg> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H() {
        C4C c4cA0N = BO.A07(this.A05.keySet()).A0N();
        while (true) {
            boolean zHasNext = c4cA0N.hasNext();
            String[] strArr = A07;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "jpVmrDDiLa6KSoRZ9DaLqT";
            strArr2[1] = "R0FMfILNqJLoUgBryCIaQS";
            if (zHasNext) {
                A0K((String) c4cA0N.next());
            } else {
                return;
            }
        }
    }

    public final void A0I() throws IOException {
        this.A01.AKJ(this.A05);
        int size = this.A04.size();
        for (int i2 = 0; i2 < size; i2++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i2);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j) throws IOException {
        this.A01.AAF(j);
        if (this.A00 != null) {
            this.A00.AAF(j);
        }
        if (!this.A01.A6S() && this.A00 != null && this.A00.A6S()) {
            this.A00.AAs(this.A05, this.A02);
            this.A01.AKI(this.A05);
        } else {
            this.A01.AAs(this.A05, this.A02);
        }
        if (this.A00 != null) {
            InterfaceC1540Mh interfaceC1540Mh = this.A00;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "sHyLaDKMqWdH53QwNCQNuy";
            strArr2[1] = "kZIq1iKkwSA0yGMJ22HAvZ";
            interfaceC1540Mh.A5p();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        C1539Mg c1539Mg = this.A05.get(str);
        if (c1539Mg != null && c1539Mg.A09() && c1539Mg.A0A()) {
            this.A05.remove(str);
            int i2 = c1539Mg.A01;
            boolean z2 = this.A03.get(i2);
            this.A01.AFd(c1539Mg, z2);
            if (z2) {
                this.A02.remove(i2);
                this.A03.delete(i2);
            } else {
                this.A02.put(i2, null);
                this.A04.put(i2, true);
            }
        }
    }

    public final void A0L(String str, C1544Ml c1544Ml) {
        C1539Mg c1539MgA0D = A0D(str);
        if (c1539MgA0D.A0E(c1544Ml)) {
            this.A01.AGK(c1539MgA0D);
        }
    }
}
