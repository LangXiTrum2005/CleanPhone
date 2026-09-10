package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.umeng.analytics.pro.cw;
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

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
public final class C1509ek {
    public static byte[] A06;
    public static String[] A07 = {"cSBRTynuZC2IGdTGiyywpT6W93mlPPSF", "eY8oEBOaURsaN5tjLd1iqN0KvgC3t", "4VVXMvUaNa4Umjg6qizEZP9MzILQLEzR", "QSlzNCenAFX0X7MHrGTiYpfcSwdEHFAL", "MNeYRoEHzsA8GKinVgk1BAFWsM3hA", "cFMHJtlu6uhUsFXtxeYMb0DEBepk1Qut", "Ud7R6CBFW2YxxOhyrPqbb5OUN0lG96X2", "foWEyjr3aBCL9mZN"};
    public InterfaceC1508ej A00;
    public InterfaceC1508ej A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, C1507ei> A05;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{-118, -114, -100, 120, -116, -117, -116, 120, -103, -108, -116, -100, 126, -103, -118, -115, -115, -110, -105, -112, -62, -61, -21, cw.n, 24, 3, cw.l, 11, 6, -62, 24, 3, cw.l, 23, 7, -62, 21, 11, 28, 7, -36, -62, -57, -59, -57, -52, -55, -56, -61, -57, -45, -46, -40, -55, -46, -40, -61, -51, -46, -56, -55, -36, -110, -55, -36, -51};
    }

    static {
        A07();
    }

    public C1509ek(InterfaceC1027Sb interfaceC1027Sb, File file, byte[] bArr, boolean z, boolean z2) {
        AbstractC1517es.A08((interfaceC1027Sb == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        PR pr = interfaceC1027Sb != null ? new PR(interfaceC1027Sb) : null;
        InterfaceC1508ej databaseStorage = file != null ? new PQ(new File(file, A04(42, 24, 41)), bArr, z) : null;
        if (pr == null || (databaseStorage != null && z2)) {
            InterfaceC1508ej legacyStorage = (InterfaceC1508ej) AbstractC1600gE.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = pr;
        } else {
            this.A01 = pr;
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

    private C1507ei A01(String str) {
        int iA00 = A00(this.A02);
        C1507ei c1507ei = new C1507ei(iA00, str);
        this.A05.put(str, c1507ei);
        this.A02.put(iA00, str);
        this.A03.put(iA00, true);
        this.A01.AFS(c1507ei);
        return c1507ei;
    }

    public static PO A02(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < i; nextBytesToRead++) {
            String utf = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i2 = Math.min(bytesRead, 10485760);
                byte[] bArrCopyOf = AbstractC1600gE.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i2;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    dataInputStream.readFully(bArrCopyOf, valueSize, i2);
                    valueSize += i2;
                    int size2 = bytesRead - valueSize;
                    i2 = Math.min(size2, 10485760);
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(A04(22, 20, 103) + bytesRead);
            }
        }
        return new PO(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [javax.crypto.Cipher] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = AbstractC1600gE.A02;
        String[] strArr = A07;
        if (strArr[0].charAt(16) == strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[4] = "dc8nuHnF6oU8YkLLRwft49yiJZMzL";
        strArr2[1] = "ucRUtoiPYWbI9ztpPHBier9nGhoKN";
        String strA04 = A04(0, 20, 14);
        if (i == 18) {
            try {
                strA04 = Cipher.getInstance((String) strA04, A04(20, 2, 69));
                return strA04;
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(strA04);
    }

    public static /* synthetic */ Cipher A06() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipherA05 = A05();
        String[] strArr = A07;
        if (strArr[0].charAt(16) == strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "KcwXENcHJRG31YfJrBtz61WaVX8JWAf3";
        strArr2[3] = "Nfu4cn5gavF6JAfurS1ZJWc81Ut1Y69o";
        return cipherA05;
    }

    public static void A08(PO po, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setA06 = po.A06();
        dataOutputStream.writeInt(setA06.size());
        for (Map.Entry<String, byte[]> entry : setA06) {
            String[] strArr = A07;
            if (strArr[6].charAt(16) != strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "Sow7AuKd9Aku10Q3yio7Gxk1dEr3BqNp";
            strArr2[5] = "9P67w6NKZJt39vzZlXxMu5USdfOVtZj8";
            Map.Entry<String, byte[]> entry2 = entry;
            dataOutputStream.writeUTF(entry2.getKey());
            byte[] value = entry2.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, 41));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final C1507ei A0C(String str) {
        return this.A05.get(str);
    }

    public final C1507ei A0D(String str) {
        C1507ei cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final PO A0E(String str) {
        C1507ei cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : PO.A03;
    }

    public final String A0F(int i) {
        return this.A02.get(i);
    }

    public final Collection<C1507ei> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H() {
        AbstractC2093oj abstractC2093ojA0N = OG.A07(this.A05.keySet()).A0N();
        while (abstractC2093ojA0N.hasNext()) {
            A0K((String) abstractC2093ojA0N.next());
        }
    }

    public final void A0I() throws IOException {
        this.A01.AJO(this.A05);
        int size = this.A04.size();
        for (int i = 0; i < size; i++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j) throws IOException {
        this.A01.AA5(j);
        if (this.A00 != null) {
            InterfaceC1508ej interfaceC1508ej = this.A00;
            String[] strArr = A07;
            if (strArr[4].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "LgRf2J2oTBbbazCrAHOrhgrGgkYqQ4rK";
            strArr2[5] = "TnbbOezE1fFVsgLXLIcSlcwcUwVVuyQ0";
            interfaceC1508ej.AA5(j);
        }
        if (!this.A01.A6I() && this.A00 != null && this.A00.A6I()) {
            this.A00.AAh(this.A05, this.A02);
            this.A01.AJN(this.A05);
        } else {
            this.A01.AAh(this.A05, this.A02);
        }
        if (this.A00 != null) {
            this.A00.A5f();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        C1507ei c1507ei = this.A05.get(str);
        if (c1507ei != null && c1507ei.A09() && c1507ei.A0A()) {
            this.A05.remove(str);
            int i = c1507ei.A01;
            boolean z = this.A03.get(i);
            this.A01.AEn(c1507ei, z);
            if (z) {
                this.A02.remove(i);
                this.A03.delete(i);
            } else {
                this.A02.put(i, null);
                this.A04.put(i, true);
            }
        }
    }

    public final void A0L(String str, C1512en c1512en) {
        C1507ei c1507eiA0D = A0D(str);
        if (c1507eiA0D.A0E(c1512en)) {
            this.A01.AFS(c1507eiA0D);
        }
    }
}
