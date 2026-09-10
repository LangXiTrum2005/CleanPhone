package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Log;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04454e implements Q7 {
    public static byte[] A0M;
    public static String[] A0N = {"s00UHyISL", "CysEKyClACPXFYeEhZn", "da", "nGvpX33P5UCM8ahnxHWaMyTa", "lLUX", "BDeT7nLDcgwxPCwpEhsshSlHVzAjjBZ1", "jZuDK72Zjf1meCMQEv38wr6fWx", "cLdlhrP9hsQzKcJJjC4G0Hit2UnEgDt4"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Q7 A06;
    public C1447dj A07;
    public C1447dj A08;

    @MetaExoPlayerCustomization
    public C1452dp A09;
    public C1500eb A0A;
    public boolean A0B;
    public boolean A0C;
    public final Q7 A0D;
    public final Q7 A0E;
    public final Q7 A0F;
    public final InterfaceC1490eR A0G;
    public final InterfaceC1493eU A0H;
    public final InterfaceC1499ea A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0N[5].length() == 7) {
                throw new RuntimeException();
            }
            A0N[1] = "Is7";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
            i4++;
        }
    }

    public static void A05() {
        A0M = new byte[]{-40, -10, -8, -3, -6, -39, -10, 9, -10, -24, 4, 10, 7, -8, -6, -58, -14, -8, -17, -25, -15, -86, -9, -93, -8, -13, -25, -28, -9, -24, -93, -11, -24, -25, -20, -11, -24, -26, -9, -24, -25, -93, -40, -43, -52, -79, -93, -41, -21, -20, -10, -93, -16, -20, -22, -21, -9, -93, -26, -28, -8, -10, -24, -93, -11, -24, -17, -28, -9, -20, -7, -24, -93, -40, -43, -52, -10, -93, -22, -24, -9, -93, -11, -24, -10, -14, -17, -7, -24, -25, -93, -20, -15, -26, -14, -11, -11, -24, -26, -9, -17, -4, -79, -15, -16, -59, -29, -27, -22, -25, -26, -60, -5, -10, -25, -11, -44, -25, -29, -26};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.Q7
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AFq(C1447dj c1447dj) throws IOException {
        try {
            String strA4b = this.A0I.A4b(c1447dj);
            C1447dj c1447djA09 = c1447dj.A04().A08(strA4b).A09();
            this.A08 = c1447djA09;
            this.A05 = A01(this.A0G, strA4b, c1447djA09.A06);
            this.A03 = c1447dj.A04;
            this.A09 = new C1452dp(c1447dj.A07);
            this.A0B = A00(c1447dj) != -1;
            boolean z = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = AbstractC1510el.A00(this.A0G.A7I(strA4b));
                if (this.A00 != -1) {
                    this.A00 -= c1447dj.A04;
                    if (this.A00 < 0) {
                        throw new C1440dc(2008);
                    }
                }
            }
            boolean z2 = c1447dj.A07.A08 <= 0 && c1447dj.A07.A07 <= 0;
            if (c1447dj.A03 != -1) {
                this.A00 = this.A00 == -1 ? c1447dj.A03 : Math.min(this.A00, c1447dj.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(c1447djA09, false, z2);
            }
            return c1447dj.A03 != -1 ? c1447dj.A03 : this.A00;
        } catch (Throwable th) {
            A09(th);
            throw th;
        }
    }

    static {
        A05();
    }

    public C04454e(InterfaceC1490eR interfaceC1490eR, final Q7 q7, Q7 q8, final InterfaceC1435dX interfaceC1435dX, InterfaceC1499ea interfaceC1499ea, int i, final QV qv, final int i2, InterfaceC1493eU interfaceC1493eU) {
        this.A0G = interfaceC1490eR;
        this.A0D = q8;
        this.A0I = interfaceC1499ea == null ? InterfaceC1499ea.A00 : interfaceC1499ea;
        this.A0J = (i & 1) != 0;
        this.A0L = (i & 2) != 0;
        this.A0K = (i & 4) != 0;
        if (q7 != null) {
            q7 = qv != null ? new Q7(q7, qv, i2) { // from class: com.facebook.ads.redexgen.X.55
                public static byte[] A03;
                public final int A00;
                public final QV A01;
                public final Q7 A02;

                static {
                    A01();
                }

                public static String A00(int i3, int i4, int i5) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i3, i3 + i4);
                    for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                        bArrCopyOfRange[i6] = (byte) ((bArrCopyOfRange[i6] ^ i5) ^ 70);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A03 = new byte[]{127, 125, 96, 108, 106, 106, 107, 64, 125, 91, 103, 125, 96, 120};
                }

                {
                    this.A02 = (Q7) AbstractC1517es.A01(q7);
                    AbstractC1517es.A01(qv);
                    this.A01 = null;
                    this.A00 = i2;
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final void A3t(InterfaceC1486eN interfaceC1486eN) {
                    AbstractC1517es.A01(interfaceC1486eN);
                    this.A02.A3t(interfaceC1486eN);
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final Map<String, List<String>> A8j() {
                    return this.A02.A8j();
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final Uri A9F() {
                    return this.A02.A9F();
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final long AFq(C1447dj c1447dj) throws IOException {
                    throw new NullPointerException(A00(0, 14, 73));
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final void close() throws IOException {
                    this.A02.close();
                }

                @Override // com.facebook.ads.redexgen.core.O9
                public final int read(byte[] bArr, int i3, int i4) throws IOException {
                    throw new NullPointerException(A00(0, 14, 73));
                }
            } : q7;
            this.A0F = q7;
            this.A0E = interfaceC1435dX != null ? new Q7(q7, interfaceC1435dX) { // from class: com.facebook.ads.redexgen.X.4p
                public static String[] A04 = {"IPBH", "VvgngosO5gvuBIyUBvfbio5RuJ0XAOwT", "9kAHgyP8b1o6aK86O9Jn91", "PbAc3uI2imQeeK05P6OUKl8qIXg", "Tppked33KysbYBUOXTyiG15VLrK", "Y3cR4o4oDjLQNG9WKbCbk1Q7F0", "cSX5hyyTZ5Xwx0Yw98nS423yfpfc3qoP", "47CrhAEfeBd2TTkvETVdoqJNPhVu9FaS"};
                public long A00;
                public boolean A01;
                public final InterfaceC1435dX A02;
                public final Q7 A03;

                {
                    this.A03 = (Q7) AbstractC1517es.A01(q7);
                    this.A02 = (InterfaceC1435dX) AbstractC1517es.A01(interfaceC1435dX);
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final void A3t(InterfaceC1486eN interfaceC1486eN) {
                    AbstractC1517es.A01(interfaceC1486eN);
                    this.A03.A3t(interfaceC1486eN);
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final Map<String, List<String>> A8j() {
                    return this.A03.A8j();
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final Uri A9F() {
                    return this.A03.A9F();
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final long AFq(C1447dj c1447dj) throws IOException {
                    this.A00 = this.A03.AFq(c1447dj);
                    if (this.A00 == 0) {
                        return 0L;
                    }
                    if (c1447dj.A03 == -1 && this.A00 != -1) {
                        long j = this.A00;
                        if (A04[2].length() != 22) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A04;
                        strArr[5] = "Z0G4eYFPaVif8IsJJbYUaDzhBY";
                        strArr[0] = "z9ex";
                        c1447dj = c1447dj.A05(0L, j);
                    }
                    this.A01 = true;
                    this.A02.AFs(c1447dj);
                    return this.A00;
                }

                @Override // com.facebook.ads.redexgen.core.Q7
                public final void close() throws IOException {
                    try {
                        this.A03.close();
                        if (this.A01) {
                            this.A01 = false;
                            String[] strArr = A04;
                            if (strArr[4].length() != strArr[3].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A04;
                            strArr2[6] = "BWoPRcZ7tIy7LNiUifturaOqDshrHKKS";
                            strArr2[7] = "FltKfF5q4beKiOJfMmhdW2azzmF4o8yz";
                            this.A02.close();
                        }
                    } catch (Throwable th) {
                        if (this.A01) {
                            this.A01 = false;
                            this.A02.close();
                        }
                        throw th;
                    }
                }

                @Override // com.facebook.ads.redexgen.core.O9
                public final int read(byte[] bArr, int i3, int i4) throws IOException {
                    if (this.A00 == 0) {
                        return -1;
                    }
                    int i5 = this.A03.read(bArr, i3, i4);
                    if (i5 > 0) {
                        this.A02.write(bArr, i3, i5);
                        if (this.A00 != -1) {
                            this.A00 -= (long) i5;
                        }
                    }
                    return i5;
                }
            } : null;
        } else {
            this.A0F = AnonymousClass59.A03;
            this.A0E = null;
        }
        this.A0H = interfaceC1493eU;
    }

    private int A00(C1447dj c1447dj) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && c1447dj.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC1490eR interfaceC1490eR, String str, Uri redirectedUri) {
        Uri redirectedUri2 = AbstractC1510el.A01(interfaceC1490eR.A7I(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
        } finally {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AGo(this.A0A);
                this.A0A = null;
            }
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A70();
            throw new NullPointerException(A02(103, 17, 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0162  */
    @MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    private void A06(C1447dj c1447dj, boolean z, boolean z2) throws IOException {
        C1500eb c1500ebAJF;
        long jMin;
        C1447dj c1447djA09;
        Q7 q7;
        long j;
        Uri uri;
        String str = (String) AbstractC1600gE.A0f(c1447dj.A08);
        EnumC1488eP enumC1488eP = z2 ? EnumC1488eP.A02 : EnumC1488eP.A05;
        if (this.A0B) {
            c1500ebAJF = null;
        } else if (this.A0J) {
            try {
                c1500ebAJF = this.A0G.AJF(str, this.A03, this.A00, enumC1488eP);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            str = str;
            c1500ebAJF = this.A0G.AJG(str, this.A03, this.A00, enumC1488eP);
        }
        if (c1500ebAJF == null) {
            q7 = this.A0F;
            c1447djA09 = c1447dj.A04().A04(this.A03).A03(this.A00).A07(this.A09).A09();
        } else if (c1500ebAJF.A05) {
            Uri uriFromFile = Uri.fromFile((File) AbstractC1600gE.A0f(c1500ebAJF.A03));
            long j2 = c1500ebAJF.A02;
            long j3 = this.A03 - j2;
            long j4 = c1500ebAJF.A01;
            if (A0N[1].length() == 2) {
                throw new RuntimeException();
            }
            A0N[6] = "68XCqgg5WZBo6VbFBq0nvPDyNO";
            long jMin2 = j4 - j3;
            if (this.A00 != -1) {
                jMin2 = Math.min(jMin2, this.A00);
            }
            c1447djA09 = c1447dj.A04().A06(uriFromFile).A05(j2).A04(j3).A03(jMin2).A07(this.A09).A09();
            q7 = this.A0D;
        } else {
            if (c1500ebAJF.A0C()) {
                jMin = this.A00;
            } else {
                jMin = c1500ebAJF.A01;
                if (this.A00 != -1) {
                    jMin = Math.min(jMin, this.A00);
                }
            }
            c1447djA09 = c1447dj.A04().A04(this.A03).A03(jMin).A07(this.A09).A09();
            if (this.A0E != null) {
                q7 = this.A0E;
                if (A0N[1].length() != 2) {
                    A0N[7] = "rUmTwAdAKDeJsMs8iu0uoIbjbH0It8Fy";
                }
            } else {
                q7 = this.A0F;
                this.A0G.AGo(c1500ebAJF);
                c1500ebAJF = null;
            }
        }
        if (!this.A0B && q7 == this.A0F) {
            j = this.A03 + 102400;
        } else {
            j = Long.MAX_VALUE;
        }
        this.A01 = j;
        if (z) {
            AbstractC1517es.A08(A0A());
            if (q7 == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (((C1500eb) AbstractC1600gE.A0f(c1500ebAJF)).A0B()) {
                    this.A0G.AGo(c1500ebAJF);
                }
                throw th;
            }
        }
        if (c1500ebAJF != null) {
            boolean zA0B = c1500ebAJF.A0B();
            if (A0N[5].length() != 7) {
                A0N[4] = "xCwk";
                if (zA0B) {
                    this.A0A = c1500ebAJF;
                }
            } else if (zA0B) {
                this.A0A = c1500ebAJF;
            }
        }
        this.A06 = q7;
        this.A07 = c1447djA09;
        this.A02 = 0L;
        long jAFq = q7.AFq(c1447djA09);
        C1512en c1512en = new C1512en();
        if (c1447djA09.A03 == -1) {
            if (A0N[1].length() == 2) {
                throw new RuntimeException();
            }
            A0N[1] = "JxCjeldOMrEV9Zn";
            if (jAFq != -1) {
                this.A00 = jAFq;
                C1512en.A00(c1512en, this.A03 + this.A00);
            }
        }
        if (A0C()) {
            this.A05 = q7.A9F();
            if (!c1447dj.A06.equals(this.A05)) {
                uri = this.A05;
            } else {
                uri = null;
            }
            C1512en.A01(c1512en, uri);
        }
        if (A0D()) {
            this.A0G.A44(str, c1512en);
        }
        A08(str, this.A05);
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            C1512en c1512en = new C1512en();
            C1512en.A00(c1512en, this.A03);
            this.A0G.A44(str, c1512en);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        C1512en c1512en = new C1512en();
        if (!uri.equals(this.A05)) {
            C1512en.A01(c1512en, this.A05);
        } else {
            C1512en.A01(c1512en, null);
        }
        try {
            this.A0G.A44(str, c1512en);
        } catch (C1487eO e) {
            String message = A02(15, 88, 5);
            Log.w(A02(0, 15, 23), message, e);
        }
    }

    private void A09(Throwable th) {
        if (A0B() || (th instanceof C1487eO)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final InterfaceC1490eR A0E() {
        return this.A0G;
    }

    public final InterfaceC1499ea A0F() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final void A3t(InterfaceC1486eN interfaceC1486eN) {
        AbstractC1517es.A01(interfaceC1486eN);
        this.A0D.A3t(interfaceC1486eN);
        this.A0F.A3t(interfaceC1486eN);
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final Map<String, List<String>> A8j() {
        if (A0C()) {
            Q7 q7 = this.A0F;
            if (A0N[6].length() != 26) {
                throw new RuntimeException();
            }
            A0N[4] = "2cmD";
            return q7.A8j();
        }
        return Collections.emptyMap();
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final Uri A9F() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e) {
            A09(e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (r0 == (-1)) goto L39;
     */
    @Override // com.facebook.ads.redexgen.core.O9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r18, int r19, int r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C04454e.read(byte[], int, int):int");
    }
}
