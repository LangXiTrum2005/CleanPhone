package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.smartdigimkt.b0.a;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2509kM implements MP {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public MM A02;
    public boolean A03;
    public final InterfaceC2515kS A04;
    public final MV A05;
    public final C1541Mi A06;
    public final File A07;
    public final HashMap<String, ArrayList<MO>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 43);
            i5++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, 24, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, 13, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, 12, 9, 0, 1, 69, 17, 10, 69, 6, 23, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, 12, 9, 0, 95, 69, 31, 56, 48, 53, 60, 61, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, 12, 16, 29, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, 16, 10, 112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, 22, 85, 87, 85, 94, 83, 22, 95, 88, 82, 95, 85, 83, 69, 12, 22, 43, 12, 4, 1, 8, 9, 77, 25, 2, 77, 1, 4, 30, 25, 77, 14, 12, 14, 5, 8, 77, 9, 4, 31, 8, 14, 25, 2, 31, 20, 77, 11, 4, 1, 8, 30, 87, 77, 48, 23, 31, 26, 19, 18, 86, 2, 25, 86, 4, 19, 27, 25, 0, 19, 86, 16, 31, 26, 19, 86, 31, 24, 18, 19, 14, 86, 19, 24, 2, 4, 15, 86, 16, 25, 4, 76, 86, 56, 20, 25, 19, 26, 7, 24, 16, 17, 85, 32, 60, 49, 85, 19, 28, 25, 16, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, 64, 91, 92, 85, 18, 91, 92, 86, 87, 74, 18, 84, 91, 94, 87, 18, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0G(File file, boolean z2, File[] fileArr, Map<String, MU> map) {
        long j;
        long j2;
        MU muRemove;
        C2508kL c2508kLA01;
        if (fileArr == null || fileArr.length == 0) {
            if (z2) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z2 && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else if (z2) {
                    boolean zA0A = C1541Mi.A0A(name);
                    if (A0C[0].length() != 2) {
                        String[] strArr2 = A0C;
                        strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                        strArr2[4] = "SAWP83LvD";
                        if (!zA0A && !name.endsWith(A04(0, 4, 107))) {
                            j = -1;
                            j2 = -9223372036854775807L;
                            if (map != null) {
                                muRemove = map.remove(name);
                            } else {
                                muRemove = null;
                            }
                            if (muRemove != null) {
                                j = muRemove.A01;
                                j2 = muRemove.A00;
                            }
                            c2508kLA01 = C2508kL.A01(file2, j, j2, this.A06);
                            if (c2508kLA01 != null) {
                                A0C(c2508kLA01);
                            } else {
                                file2.delete();
                            }
                        }
                    }
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                    if (map != null) {
                        muRemove = map.remove(name);
                    } else {
                        muRemove = null;
                    }
                    if (muRemove != null) {
                        j = muRemove.A01;
                        j2 = muRemove.A00;
                    }
                    c2508kLA01 = C2508kL.A01(file2, j, j2, this.A06);
                    if (c2508kLA01 != null) {
                        A0C(c2508kLA01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<MZ> A0I(String str) {
        C1539Mg c1539MgA0C;
        AbstractC10843y.A08(!this.A03);
        c1539MgA0C = this.A06.A0C(str);
        return (c1539MgA0C == null || c1539MgA0C.A09()) ? new TreeSet() : new TreeSet((Collection) c1539MgA0C.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized long A7B(String str, long j, long j2) {
        long j3;
        long j4 = j;
        synchronized (this) {
            long j5 = j2 == -1 ? Long.MAX_VALUE : j4 + j2;
            if (j5 < 0) {
                j5 = Long.MAX_VALUE;
            }
            j3 = 0;
            while (j4 < j5) {
                long jA7C = A7C(str, j4, j5 - j4);
                if (jA7C > 0) {
                    j3 += jA7C;
                } else {
                    jA7C = -jA7C;
                }
                j4 += jA7C;
            }
        }
        return j3;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C2509kM(File file, InterfaceC2515kS interfaceC2515kS) {
        this(file, interfaceC2515kS, (byte[]) null, false);
    }

    public C2509kM(File file, InterfaceC2515kS interfaceC2515kS, C5O c5o, byte[] bArr, boolean z2, boolean z3) {
        MV mv;
        C1541Mi c1541Mi = new C1541Mi(c5o, file, bArr, z2, z3);
        if (c5o != null && !z3) {
            mv = new MV(c5o);
        } else {
            mv = null;
        }
        this(file, interfaceC2515kS, c1541Mi, mv);
    }

    public C2509kM(File file, InterfaceC2515kS interfaceC2515kS, C1541Mi c1541Mi, MV mv) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC2515kS;
            this.A06 = c1541Mi;
            this.A05 = mv;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC2515kS.AIj();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C1548Mp(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C2509kM(File file, InterfaceC2515kS interfaceC2515kS, byte[] bArr, boolean z2) {
        this(file, interfaceC2515kS, null, bArr, z2, true);
    }

    public static long A00(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AbstractC10924g.A05(A04(a.Z0, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C2508kL A03(String str, long j, long j2) {
        C2508kL c2508kLA04;
        C1539Mg c1539MgA0C = this.A06.A0C(str);
        if (c1539MgA0C == null) {
            return C2508kL.A04(str, j, j2);
        }
        while (true) {
            c2508kLA04 = c1539MgA0C.A04(j, j2);
            if (!c2508kLA04.A05 || c2508kLA04.A03.length() == c2508kLA04.A01) {
                break;
            }
            A06();
        }
        return c2508kLA04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (MM e2) {
                this.A02 = e2;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] fileArrListFiles = file.listFiles();
        String strA04 = A04(a.Z0, 11, 30);
        if (fileArrListFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AbstractC10924g.A05(strA04, str);
            this.A02 = new MM(str);
            return;
        }
        this.A01 = A02(fileArrListFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e3) {
                String str2 = A04(102, 28, 114) + this.A07;
                AbstractC10924g.A08(strA04, str2, e3);
                this.A02 = new MM(str2, e3);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, MU> mapA05 = this.A05.A05();
                A0G(this.A07, true, fileArrListFiles, mapA05);
                this.A05.A09(mapA05.keySet());
            } else {
                A0G(this.A07, true, fileArrListFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e4) {
                AbstractC10924g.A08(strA04, A04(308, 25, 25), e4);
            }
        } catch (IOException e5) {
            String str3 = A04(164, 36, 29) + this.A07;
            AbstractC10924g.A08(strA04, str3, e5);
            this.A02 = new MM(str3, e5);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1539Mg> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            for (C2508kL c2508kL : it.next().A06()) {
                if (c2508kL.A03.length() != c2508kL.A01) {
                    arrayList.add(c2508kL);
                }
            }
        }
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i3 = str.charAt(29);
            if (i3 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i2 < size) {
                A0A((MZ) arrayList.get(i2));
                i2++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws MM {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(MZ mz) {
        ArrayList<MO> arrayList = this.A08.get(mz.A04);
        if (arrayList != null) {
            for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                arrayList.get(i2).AG3(this, mz);
            }
        }
        this.A04.AG3(this, mz);
    }

    private void A0A(MZ mz) {
        C1539Mg c1539MgA0C = this.A06.A0C(mz.A04);
        if (c1539MgA0C == null || !c1539MgA0C.A0D(mz)) {
            return;
        }
        this.A00 -= mz.A01;
        if (this.A05 != null) {
            String name = mz.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AbstractC10924g.A07(A04(a.Z0, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(c1539MgA0C.A02);
        A09(mz);
    }

    private void A0C(C2508kL c2508kL) {
        this.A06.A0D(c2508kL.A04).A08(c2508kL);
        this.A00 += c2508kL.A01;
        A0D(c2508kL);
    }

    private void A0D(C2508kL c2508kL) {
        ArrayList<MO> arrayList = this.A08.get(c2508kL.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MO mo = arrayList.get(size);
                int i2 = A0C[0].length();
                if (i2 == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                mo.AG2(this, c2508kL);
            }
        }
        this.A04.AG2(this, c2508kL);
    }

    private void A0E(C2508kL c2508kL, MZ mz) {
        ArrayList<MO> arrayList = this.A08.get(c2508kL.A04);
        if (arrayList != null) {
            for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                arrayList.get(i2).AG4(this, c2508kL, mz);
            }
        }
        this.A04.AG4(this, c2508kL, mz);
    }

    public static void A0F(File file) throws MM {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(a.Z0, 11, 30);
        AbstractC10924g.A05(message, str);
        throw new MM(str);
    }

    public static synchronized boolean A0H(File file) {
        return A0D.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void A4E(String str, C1544Ml c1544Ml) throws MM {
        AbstractC10843y.A08(!this.A03);
        A08();
        this.A06.A0L(str, c1544Ml);
        try {
            this.A06.A0I();
        } catch (IOException e2) {
            throw new MM(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void A55(File file, long j) throws MM {
        AbstractC10843y.A08(!this.A03);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C2508kL c2508kL = (C2508kL) AbstractC10843y.A01(C2508kL.A02(file, j, this.A06));
            C1539Mg c1539Mg = (C1539Mg) AbstractC10843y.A01(this.A06.A0C(c2508kL.A04));
            AbstractC10843y.A08(c1539Mg.A0B(c2508kL.A02, c2508kL.A01));
            long jA00 = AbstractC1542Mj.A00(c1539Mg.A03());
            if (jA00 != -1) {
                AbstractC10843y.A08(c2508kL.A02 + c2508kL.A01 <= jA00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c2508kL.A01, c2508kL.A00);
                    A0C(c2508kL);
                    try {
                        this.A06.A0I();
                        notifyAll();
                        return;
                    } catch (IOException e2) {
                        throw new MM(e2);
                    }
                } catch (IOException e3) {
                    throw new MM(e3);
                }
            }
            A0C(c2508kL);
            this.A06.A0I();
            notifyAll();
            return;
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized long A7A() {
        AbstractC10843y.A08(!this.A03);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    @MetaExoPlayerCustomization
    public final synchronized long A7C(String str, long j, long j2) {
        C1539Mg cachedContent;
        AbstractC10843y.A08(!this.A03);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized InterfaceC1543Mk A7S(String str) {
        AbstractC10843y.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AHg(MZ mz) {
        AbstractC10843y.A08(!this.A03);
        C1539Mg c1539Mg = (C1539Mg) AbstractC10843y.A01(this.A06.A0C(mz.A04));
        c1539Mg.A07(mz.A02);
        this.A06.A0K(c1539Mg.A02);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AIU(String str) {
        AbstractC10843y.A08(!this.A03);
        Iterator<MZ> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AIV(MZ mz) {
        AbstractC10843y.A08(!this.A03);
        A0A(mz);
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized File AK8(String str, long lastTouchTimestamp, long j) throws MM {
        C1539Mg c1539MgA0C;
        File file;
        AbstractC10843y.A08(!this.A03);
        A08();
        c1539MgA0C = this.A06.A0C(str);
        AbstractC10843y.A01(c1539MgA0C);
        AbstractC10843y.A08(c1539MgA0C.A0B(lastTouchTimestamp, j));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AG5(this, str, lastTouchTimestamp, j);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C2508kL.A05(file, c1539MgA0C.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized MZ AKA(String str, long j, long j2, MN mn) throws InterruptedException, MM {
        MZ span;
        AbstractC10843y.A08(!this.A03);
        A08();
        while (true) {
            span = AKB(str, j, j2, mn);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized C2508kL AKB(String str, long j, long j2, MN mn) throws MM {
        AbstractC10843y.A08(!this.A03);
        A08();
        C2508kL c2508kLA03 = A03(str, j, j2);
        if (c2508kLA03.A05) {
            C2508kL span = this.A06.A0C(str).A05(c2508kLA03, c2508kLA03.A00, false);
            A0E(c2508kLA03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j, c2508kLA03.A01)) {
            return c2508kLA03;
        }
        return null;
    }
}
