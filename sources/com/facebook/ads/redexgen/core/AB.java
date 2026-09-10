package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import com.smartdigimkt.b0.a;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AB implements Handler.Callback, InterfaceC2710nq, InterfaceC1348Ev, InterfaceC1297Cw, C6P, InterfaceC11657b {
    public static byte[] A0x;
    public static String[] A0y = {"EvYOBb0fNCsu7OcAaOZNwoEPwn2", "8jIqnMhTOhQ3fU", "vmW", "edZR1F4oYcKYyzs7tUfX3dHGMGqqrKBY", "TI8UsWNSVk9Jh7srInWeHwVEqkc209d4", "AVB8fiMNMM9Dy8Zuh880FwllBoFt5PF1", "1mkHXRje2n0Pvvw2j", "LF2w13BN71krhrKRtprOb2x3jYcy1FYO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A06;
    public C11476j A07;
    public C11516n A08;
    public C7Z A0A;

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public InterfaceC2769oo A0B;
    public C11847u A0C;
    public InterfaceC1298Cx A0D;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0K;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public InterfaceC2769oo[] A0W;
    public final long A0Y;
    public final long A0Z;
    public final Handler A0a;
    public final HandlerThread A0b;
    public final C2827pl A0c;
    public final C2825pj A0d;
    public final AnonymousClass45 A0e;
    public final C4X A0f;
    public final C2777ow A0g;
    public final C11506m A0h;
    public final AnonymousClass74 A0i;
    public final C2765ok A0k;
    public final AbstractC1349Ew A0l;
    public final C1350Ex A0m;
    public final F6 A0n;
    public final C12169g A0o;
    public final ArrayList<C11496l> A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final InterfaceC2769oo[] A0v;
    public final InterfaceC11797p[] A0w;
    public long A05 = -9223372036854775807L;

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public EnumC2426ir A0E = EnumC2426ir.A09;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public boolean A0J = false;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public C7W A09 = null;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public boolean A0L = false;

    @MetaExoPlayerCustomization("D71523094: Added for negative testing")
    public Integer A0F = null;
    public final C7E A0j = new C7E();

    @MetaExoPlayerCustomization
    public final int A0X = A00();

    public static String A0D(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0x, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "wOV";
            strArr[6] = "lGv9KfQpa0xBFnWlu";
            bArrCopyOfRange[i5] = (byte) ((b2 - i4) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:142:0x030f  */
    /* JADX WARN: Code duplicated, block: B:145:0x031b  */
    /* JADX WARN: Code duplicated, block: B:150:0x032a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0380  */
    /* JADX WARN: Code duplicated, block: B:178:0x0396  */
    /* JADX WARN: Code duplicated, block: B:180:0x039c  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x043a A[EDGE_INSN: B:231:0x043a->B:216:0x043a BREAK  A[LOOP:0: B:10:0x0060->B:67:0x0190], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01de  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03ab, code lost:
    
        r24.A0R = r24.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03bb, code lost:
    
        if (com.facebook.ads.redexgen.core.AB.A0y[5].charAt(1) == 'q') goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03bd, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AB.A0y;
        r2[4] = "Uyz0TdICBPSSMiRUHh3H6S4m2yqjGOAg";
        r2[3] = "3B1Lhsj2yRloVQBWBzqqqLZ9kauiXzuH";
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03cb, code lost:
    
        if (r24.A0B == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d4, code lost:
    
        if (r24.A0B.A9N() != 1) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d6, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03d7, code lost:
    
        A0W(2, r8);
        A0O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044b, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0F() throws com.facebook.ads.redexgen.core.AD, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AB.A0F():void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x020f  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0P() throws AD, IOException {
        boolean zA00;
        boolean z2;
        if (this.A0D == null) {
            return;
        }
        if (this.A02 > 0) {
            this.A0D.ACT();
            return;
        }
        A0J();
        C7A c7aA0E = this.A0j.A0E();
        if (c7aA0E != null && !c7aA0E.A0R()) {
            boolean z3 = this.A0A.A0A;
            if (A0y[1].length() != 31) {
                A0y[5] = "JakbFE5sCqyiHPWhcmq5QKrahWaBlD8R";
                if (!z3) {
                    A0w(false);
                }
            }
            throw new RuntimeException();
        }
        A0y(false);
        if (this.A0j.A0N()) {
            C7A c7aA0F = this.A0j.A0F();
            C7A c7aA0G = this.A0j.A0G();
            boolean z4 = false;
            while (this.A0P && c7aA0F != c7aA0G && this.A06 >= c7aA0F.A0I().A0H(this.A0K)) {
                if (z4) {
                    A0H();
                }
                int i2 = c7aA0F.A00.A07 ? 0 : 3;
                C7A c7a = c7aA0F;
                c7aA0F = this.A0j.A0B();
                A0g(c7a);
                C7Z c7z = this.A0A;
                C2708no c2708no = c7aA0F.A00.A04;
                long j = c7aA0F.A00.A03;
                if (A0y[7].charAt(12) == '2') {
                    throw new RuntimeException();
                }
                String[] strArr = A0y;
                strArr[4] = "OGZbExKcucXIKKZQBdHGOATJ9dYdrwhN";
                strArr[3] = "TJxPjvISq11gHqp4fguKhlEOGAavfVmH";
                this.A0A = c7z.A06(c2708no, j, c7aA0F.A00.A02, A01());
                this.A0h.A04(i2);
                A0Q();
                z4 = true;
            }
            C7B c7b = c7aA0G.A00;
            String[] strArr2 = A0y;
            if (strArr2[4].charAt(1) != strArr2[3].charAt(1)) {
                A0y[7] = "WHxPanRASNJPtq4bnE3dJm5Kco7OvEcN";
                if (c7b.A05) {
                    for (int i3 = 0; i3 < this.A0v.length; i3++) {
                        InterfaceC2769oo interfaceC2769oo = this.A0v[i3];
                        DT dt = c7aA0G.A09[i3];
                        if (dt != null && interfaceC2769oo.A9D() == dt && interfaceC2769oo.A9p()) {
                            interfaceC2769oo.AJN();
                        }
                    }
                    return;
                }
                if (c7aA0G.A0I() == null) {
                    return;
                }
                C7A c7aA0I = c7aA0G.A0I();
                String[] strArr3 = A0y;
                if (strArr3[4].charAt(1) != strArr3[3].charAt(1)) {
                    A0y[7] = "aMxVvZtAQBe9jxU0Z4NX1LXmsoJEfXr7";
                    if (c7aA0I.A02) {
                        for (int i4 = 0; i4 < this.A0v.length; i4++) {
                            InterfaceC2769oo interfaceC2769oo2 = this.A0v[i4];
                            DT dt2 = c7aA0G.A09[i4];
                            if (interfaceC2769oo2.A9D() != dt2) {
                                return;
                            }
                            if (dt2 != null && !interfaceC2769oo2.A9p()) {
                                return;
                            }
                        }
                        C1350Ex c1350ExA0K = c7aA0G.A0K();
                        C7A c7aA0C = this.A0j.A0C();
                        C1350Ex c1350ExA0K2 = c7aA0C.A0K();
                        boolean z5 = c7aA0C.A07.AHQ() != -9223372036854775807L;
                        for (int i5 = 0; i5 < this.A0v.length; i5++) {
                            InterfaceC2769oo interfaceC2769oo3 = this.A0v[i5];
                            if (c1350ExA0K.A00(i5)) {
                                if (z5) {
                                    interfaceC2769oo3.AJN();
                                } else {
                                    boolean zAAN = interfaceC2769oo3.AAN();
                                    if (A0y[0].length() != 16) {
                                        A0y[1] = "9mAYXkFxI0mZazBGslnkswropOC4T";
                                        if (zAAN) {
                                            continue;
                                        } else {
                                            InterfaceC2672nE interfaceC2672nE = c1350ExA0K2.A04[i5];
                                            zA00 = c1350ExA0K2.A00(i5);
                                            if (this.A0w[i5].A9N() == -2) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            C11827s c11827s = c1350ExA0K.A03[i5];
                                            C11827s c11827s2 = c1350ExA0K2.A03[i5];
                                            if (A0y[1].length() != 31) {
                                                throw new RuntimeException();
                                            }
                                            A0y[1] = "R6UwS9N6ly40SGlMhcEQ765TyuQep";
                                            if (zA00 || !c11827s2.equals(c11827s) || z2) {
                                                interfaceC2769oo3.AJN();
                                            } else {
                                                C2860qI[] c2860qIArrA1A = A1A(interfaceC2672nE);
                                                Log.e(A0D(0, 21, 22), A0D(392, 13, 67));
                                                interfaceC2769oo3.AIa(c2860qIArrA1A, c7aA0C.A09[i5], c7aA0C.A0H(this.A0K), c7aA0C.A0B());
                                            }
                                        }
                                    } else {
                                        A0y[0] = "RavyRccOc8FddTyMpAZEZ";
                                        if (zAAN) {
                                            continue;
                                        } else {
                                            InterfaceC2672nE interfaceC2672nE2 = c1350ExA0K2.A04[i5];
                                            zA00 = c1350ExA0K2.A00(i5);
                                            if (this.A0w[i5].A9N() == -2) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            C11827s c11827s3 = c1350ExA0K.A03[i5];
                                            C11827s c11827s4 = c1350ExA0K2.A03[i5];
                                            if (A0y[1].length() != 31) {
                                                throw new RuntimeException();
                                            }
                                            A0y[1] = "R6UwS9N6ly40SGlMhcEQ765TyuQep";
                                            if (zA00) {
                                                interfaceC2769oo3.AJN();
                                            } else {
                                                interfaceC2769oo3.AJN();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    public static void A0R() {
        A0x = new byte[]{-108, -57, -66, -97, -69, -80, -56, -76, -63, -104, -68, -65, -69, -104, -67, -61, -76, -63, -67, -80, -69, -15, 36, 27, -4, 24, 13, 37, 17, 30, -11, 25, 28, 24, -11, 26, 32, 17, 30, 26, 13, 24, -26, -12, 13, 26, 16, 24, 17, 30, -87, -57, -50, -49, -46, -55, -50, -57, -128, -51, -59, -45, -45, -63, -57, -59, -45, -128, -45, -59, -50, -44, -128, -63, -58, -44, -59, -46, -128, -46, -59, -52, -59, -63, -45, -59, -114, -107, -70, -64, -79, -66, -70, -83, -72, 108, -66, -63, -70, -64, -75, -71, -79, 108, -79, -66, -66, -69, -66, 122, -54, -26, -37, -13, -36, -37, -35, -27, -102, -33, -20, -20, -23, -20, -88, -114, -86, -97, -73, -96, -97, -95, -87, -114, -83, -79, -89, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, 106, 94, -96, -77, -92, -92, -93, -80, -93, -94, -126, -77, -80, -97, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, 106, 94, -84, -93, -74, -78, -118, -83, -97, -94, -114, -83, -79, -89, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, -76, -48, -42, -45, -60, -58, -127, -58, -45, -45, -48, -45, -113, -72, -39, -44, -43, -123, -53, -58, -50, -47, -54, -55, -109, -78, -97, -91, -84, -67, -59, -56, -57, -54, -71, -54, -63, -60, -47, 120, -63, -65, -58, -57, -54, -63, -58, -65, 120, -53, -52, -54, -67, -71, -59, 120, -67, -54, -54, -57, -54, -110, 120, -108, -78, -71, -87, -82, -89, 96, -76, -81, 96, -77, -91, -82, -92, 96, -83, -91, -77, -77, -95, -89, -91, 96, -81, -82, 96, -95, 96, -92, -91, -95, -92, 96, -76, -88, -78, -91, -95, -92, 110, 5, 30, 21, 40, 32, 21, 19, 36, 21, 20, -48, 21, 34, 34, 31, 34, -48, 20, 21, 28, 25, 38, 21, 34, 25, 30, 23, -48, 29, 21, 35, 35, 17, 23, 21, -48, 31, 30, -48, 21, 40, 36, 21, 34, 30, 17, 28, -48, 36, 24, 34, 21, 17, 20, -34, -34, -23, -51, -23, -25, -33, -47, -23, -20, -27, 37, 29, 28, 33, 25, 8, 29, 42, 33, 39, 28, 1, 28, -70, -81, -68, -77, -71, -82, -102, -71, -67, -77, -66, -77, -71, -72, -97, -67, -18, -31, -20, -24, -35, -33, -31, -49, -16, -18, -31, -35, -23};
    }

    /* JADX WARN: Code duplicated, block: B:84:0x021b A[PHI: r8
  0x021b: PHI (r8v4 com.facebook.ads.redexgen.X.no) = (r8v2 com.facebook.ads.redexgen.X.no), (r8v6 com.facebook.ads.redexgen.X.no) binds: [B:93:0x024d, B:83:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x022b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0231  */
    /* JADX WARN: Code duplicated, block: B:91:0x0245  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0e(C11486k c11486k) throws AD {
        C2708no c2708no;
        C2708no c2708noA0K;
        long j;
        if (c11486k.A01 != this.A0D) {
            return;
        }
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c11486k.A00;
        this.A0A = this.A0A.A04(timeline2);
        A0M();
        if (this.A02 > 0) {
            this.A0h.A03(this.A02);
            this.A02 = 0;
            if (this.A08 != null) {
                Pair<Object, Long> pairA09 = A09(this.A08, true);
                this.A08 = null;
                if (pairA09 == null) {
                    A0G();
                    return;
                }
                Object obj = pairA09.first;
                long jLongValue = ((Long) pairA09.second).longValue();
                C2708no c2708noA0K2 = this.A0j.A0K(timeline2, obj, jLongValue);
                this.A0A = this.A0A.A06(c2708noA0K2, c2708noA0K2.A00() ? 0L : jLongValue, jLongValue, this.A0A.A0D);
                return;
            }
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "O4I";
            strArr[6] = "ahZa31gq0LeVPqA4e";
            if (0 != 0) {
                throw new NullPointerException(A0D(376, 16, 17));
            }
            if (this.A0A.A02 == -9223372036854775807L) {
                if (timeline2.A0N()) {
                    A0G();
                    return;
                }
                Pair<Object, Long> pairA08 = A08(timeline2, timeline2.A0B(this.A0V), -9223372036854775807L);
                Object obj2 = pairA08.first;
                long jLongValue2 = ((Long) pairA08.second).longValue();
                C2708no c2708noA0K3 = this.A0j.A0K(timeline2, obj2, jLongValue2);
                C7Z c7z = this.A0A;
                String[] strArr2 = A0y;
                if (strArr2[2].length() == strArr2[6].length()) {
                    throw new RuntimeException();
                }
                A0y[0] = "JR6dPBbFHW2aBR0iQ91GP51A";
                this.A0A = c7z.A06(c2708noA0K3, c2708noA0K3.A00() ? 0L : jLongValue2, jLongValue2, this.A0A.A0D);
                return;
            }
            return;
        }
        Object obj3 = this.A0A.A05.A04;
        long j2 = this.A0A.A01;
        if (timeline.A0N()) {
            if (timeline2.A0N()) {
                return;
            }
            C2708no c2708noA0K4 = this.A0j.A0K(timeline2, obj3, j2);
            this.A0A = this.A0A.A06(c2708noA0K4, c2708noA0K4.A00() ? 0L : j2, j2, this.A0A.A0D);
            return;
        }
        C7A c7aA0D = this.A0j.A0D();
        Object obj4 = c7aA0D == null ? this.A0A.A05.A04 : c7aA0D.A08;
        int iA0A = timeline2.A0A(obj4);
        if (iA0A == -1) {
            Object objA0C = A0C(obj4, timeline, timeline2);
            if (objA0C == null) {
                A0G();
                return;
            }
            Pair<Object, Long> pairA010 = A08(timeline2, timeline2.A0J(objA0C, this.A0c).A00, -9223372036854775807L);
            Object obj5 = pairA010.first;
            long jLongValue3 = ((Long) pairA010.second).longValue();
            C2708no c2708noA0K5 = this.A0j.A0K(timeline2, obj5, jLongValue3);
            if (c7aA0D != null) {
                while (c7aA0D.A0I() != null) {
                    c7aA0D = c7aA0D.A0I();
                    if (c7aA0D.A00.A04.equals(c2708noA0K5)) {
                        C7E c7e = this.A0j;
                        String[] strArr3 = A0y;
                        if (strArr3[4].charAt(1) != strArr3[3].charAt(1)) {
                            A0y[0] = "lm8nmDAIswUHpj0OrSP7ctv";
                            c7aA0D.A00 = c7e.A0I(timeline2, c7aA0D.A00);
                        } else {
                            c7aA0D.A00 = c7e.A0I(timeline2, c7aA0D.A00);
                        }
                    }
                }
            }
            long jA06 = A06(c2708noA0K5, c2708noA0K5.A00() ? 0L : jLongValue3);
            C7Z c7z2 = this.A0A;
            long jA01 = A01();
            String[] strArr4 = A0y;
            if (strArr4[4].charAt(1) == strArr4[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0y;
            strArr5[2] = "HJD";
            strArr5[6] = "HIUAzKTwmQi0tOVOF";
            this.A0A = c7z2.A06(c2708noA0K5, jA06, jLongValue3, jA01);
            return;
        }
        C7Z c7z3 = this.A0A;
        String[] strArr6 = A0y;
        if (strArr6[4].charAt(1) != strArr6[3].charAt(1)) {
            String[] strArr7 = A0y;
            strArr7[4] = "QYIV2IuM2tD6Cg4Dd0tvfiQK4IQ6icHf";
            strArr7[3] = "hXYkHU7O6zP410ynmzMqamHjkcWcTxII";
            c2708no = c7z3.A05;
            if (c2708no.A00()) {
                c2708noA0K = this.A0j.A0K(timeline2, Integer.valueOf(iA0A), j2);
                if (!c2708noA0K.equals(c2708no)) {
                    if (c2708noA0K.A00()) {
                        j = 0;
                    } else {
                        j = j2;
                    }
                    this.A0A = this.A0A.A06(c2708noA0K, A06(c2708noA0K, j), j2, A01());
                    return;
                }
            }
        } else {
            c2708no = c7z3.A05;
            if (c2708no.A00()) {
                c2708noA0K = this.A0j.A0K(timeline2, Integer.valueOf(iA0A), j2);
                if (!c2708noA0K.equals(c2708no)) {
                    if (c2708noA0K.A00()) {
                        j = 0;
                    } else {
                        j = j2;
                    }
                    this.A0A = this.A0A.A06(c2708noA0K, A06(c2708noA0K, j), j2, A01());
                    return;
                }
            }
        }
        C7E c7e2 = this.A0j;
        long j3 = this.A06;
        if (A0y[1].length() == 31) {
            throw new RuntimeException();
        }
        String[] strArr8 = A0y;
        strArr8[4] = "30gHr5wufVP7jVH5IRZCDYCZy2V5u0Zf";
        strArr8[3] = "xPVmpg9j3VPOmOyowbQUJ4kDfZKAMzov";
        if (!c7e2.A0Q(timeline2, c2708no, j3)) {
            A0x(false);
        }
        A0v(false);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0f(C11516n c11516n) throws Throwable {
        long jLongValue;
        C2708no c2708noA0K;
        long jLongValue2;
        boolean z2;
        this.A0h.A03(1);
        Pair<Object, Long> pairA09 = A09(c11516n, true);
        if (pairA09 == null) {
            c2708noA0K = A0A();
            jLongValue2 = -9223372036854775807L;
            jLongValue = -9223372036854775807L;
            z2 = true;
        } else {
            Object obj = pairA09.first;
            jLongValue = ((Long) pairA09.second).longValue();
            c2708noA0K = this.A0j.A0K(this.A0A.A03, obj, jLongValue);
            if (c2708noA0K.A00()) {
                jLongValue2 = 0;
                z2 = true;
            } else {
                jLongValue2 = ((Long) pairA09.second).longValue();
                z2 = c11516n.A01 == -9223372036854775807L;
            }
        }
        try {
            try {
                if (this.A0D == null || this.A02 > 0) {
                    this.A08 = c11516n;
                    this.A07 = null;
                } else {
                    try {
                        if (jLongValue2 == -9223372036854775807L) {
                            A0V(4);
                            A13(false, true, false);
                        } else {
                            long jA6r = jLongValue2;
                            if (c2708noA0K.equals(this.A0A.A05)) {
                                C7A c7aA0F = this.A0j.A0F();
                                if (c7aA0F != null && jA6r != 0) {
                                    jA6r = c7aA0F.A07.A6r(jA6r, this.A0C);
                                }
                                if (C2Y.A01(jA6r) == C2Y.A01(this.A0A.A0C)) {
                                    this.A0A = this.A0A.A06(c2708noA0K, this.A0A.A0C, jLongValue, A01());
                                    if (z2) {
                                        this.A0h.A04(2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            long jA06 = A06(c2708noA0K, jA6r);
                            z2 |= jLongValue2 != jA06;
                            jLongValue2 = jA06;
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.A0A = this.A0A.A06(c2708noA0K, jLongValue2, jLongValue, A01());
                        if (z2) {
                            this.A0h.A04(2);
                        }
                        throw th;
                    }
                }
                this.A0A = this.A0A.A06(c2708noA0K, jLongValue2, jLongValue, A01());
                if (z2) {
                    this.A0h.A04(2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static {
        A0R();
    }

    public AB(InterfaceC2769oo[] interfaceC2769ooArr, AbstractC1349Ew abstractC1349Ew, C1350Ex c1350Ex, AnonymousClass74 anonymousClass74, F6 f6, boolean z2, int i2, boolean z3, Handler handler, AnonymousClass45 anonymousClass45, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j, boolean z10, int i3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, C8O c8o) {
        this.A0v = interfaceC2769ooArr;
        this.A0l = abstractC1349Ew;
        this.A0m = c1350Ex;
        this.A0i = anonymousClass74;
        this.A0n = f6;
        this.A0P = z2;
        this.A03 = i2;
        this.A0V = z3;
        this.A0a = handler;
        this.A0e = anonymousClass45;
        this.A0U = z4;
        this.A0H = z5;
        this.A0G = z6;
        this.A0M = z7;
        this.A0I = z8;
        this.A0T = z9;
        this.A0Z = j;
        this.A0q = z10;
        this.A00 = i3;
        this.A0u = z12;
        this.A0s = z11;
        this.A0O = z13;
        this.A0Q = z14;
        this.A0K = z15;
        this.A0t = z16;
        this.A0N = j > 0;
        this.A0Y = anonymousClass74.A70(c8o);
        this.A0r = anonymousClass74.AIn(c8o);
        this.A0C = C11847u.A03;
        this.A0A = new C7Z(Timeline.A02, -9223372036854775807L, C2690nW.A06, c1350Ex);
        this.A0h = new C11506m();
        this.A0w = new InterfaceC11797p[interfaceC2769ooArr.length];
        for (int i4 = 0; i4 < interfaceC2769ooArr.length; i4++) {
            interfaceC2769ooArr[i4].AA9(i4, c8o);
            this.A0w[i4] = interfaceC2769ooArr[i4].A7D();
        }
        this.A0g = new C2777ow(this, anonymousClass45);
        this.A0k = new C2765ok(anonymousClass45);
        this.A0o = z12 ? new C12169g(anonymousClass45) : null;
        this.A0p = new ArrayList<>();
        this.A0W = new InterfaceC2769oo[0];
        this.A0d = new C2825pj();
        this.A0c = new C2827pl();
        abstractC1349Ew.A02(this, f6);
        this.A0b = new HandlerThread(A0D(21, 29, 115), -16);
        this.A0b.start();
        this.A0f = anonymousClass45.A5P(this.A0b.getLooper(), this);
    }

    @MetaExoPlayerCustomization
    private int A00() {
        int exoplayerThreadPollingIntervalMs = MetaExoPlayerUpgradeConfig.A00(EnumC2461jY.A04);
        if (exoplayerThreadPollingIntervalMs > 0) {
            return exoplayerThreadPollingIntervalMs;
        }
        return 10;
    }

    private long A01() {
        return A04(this.A0A.A0B);
    }

    private final long A02() {
        long loadingPeriodStartPositionUs;
        C7A c7aA0E = this.A0j.A0E();
        if (c7aA0E == null) {
            loadingPeriodStartPositionUs = 0;
        } else {
            loadingPeriodStartPositionUs = A05(c7aA0E);
        }
        if (c7aA0E == null || loadingPeriodStartPositionUs == -9223372036854775807L) {
            return 0L;
        }
        return c7aA0E.A0C(loadingPeriodStartPositionUs);
    }

    private final long A03() {
        long jA0C;
        C7A c7aA0F = this.A0j.A0F();
        if (c7aA0F == null) {
            jA0C = 0;
        } else {
            jA0C = c7aA0F.A0C(c7aA0F.A0D(this.A06));
        }
        return jA0C + A02();
    }

    private long A04(long j) {
        C7A c7aA0E = this.A0j.A0E();
        if (c7aA0E == null) {
            return 0L;
        }
        return j - c7aA0E.A0D(this.A06);
    }

    private final long A05(C7A c7a) {
        long jMin = Long.MAX_VALUE;
        DT[] dtArr = c7a.A09;
        for (int i2 = 0; i2 < dtArr.length; i2++) {
            if (dtArr[i2] instanceof DU) {
                long periodStartPositionUs = ((DU) dtArr[i2]).A89();
                jMin = Math.min(jMin, periodStartPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return jMin;
    }

    private long A06(C2708no c2708no, long j) throws AD {
        return A07(false, c2708no, j, this.A0j.A0F() != this.A0j.A0G());
    }

    private long A07(boolean z2, C2708no c2708no, long j, boolean z3) throws AD {
        A0O();
        this.A0R = false;
        A0V(2);
        C7A c7aA0F = this.A0j.A0F();
        C7A c7aA0B = c7aA0F;
        while (c7aA0B != null) {
            if (A18(c2708no, j, c7aA0B)) {
                this.A0j.A0S(c7aA0B);
                break;
            }
            c7aA0B = this.A0j.A0B();
        }
        if (c7aA0F != c7aA0B || z3) {
            for (InterfaceC2769oo interfaceC2769oo : this.A0W) {
                A0l(interfaceC2769oo);
            }
            this.A0W = new InterfaceC2769oo[0];
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[4] = "70t8rv27mnV5UL6KHl8v284ienTbIO4o";
            strArr[3] = "4hBvGCC7ZdKRW68bijyzpqxjpy9h3CGi";
            c7aA0F = null;
        }
        if (c7aA0B != null) {
            A0g(c7aA0F);
            if (c7aA0B.A01) {
                j = c7aA0B.A07.AJ8(j, z2);
                c7aA0B.A07.A60(j - this.A0Y, this.A0r);
            }
            A0Y(j);
            A0w(this.A0G);
        } else {
            this.A0j.A0M(true);
            A0Y(j);
        }
        A0v(false);
        this.A0f.AJA(2);
        return j;
    }

    private Pair<Object, Long> A08(Timeline timeline, int i2, long j) {
        return timeline.A0D(this.A0d, this.A0c, i2, j);
    }

    private Pair<Object, Long> A09(C11516n c11516n, boolean z2) {
        int iA0A;
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c11516n.A02;
        if (timeline.A0N()) {
            return null;
        }
        if (timeline2.A0N()) {
            timeline2 = timeline;
        }
        try {
            Pair<Object, Long> periodPosition = timeline2.A0E(this.A0d, this.A0c, c11516n.A00, c11516n.A01);
            if (timeline == timeline2 || (iA0A = timeline.A0A(periodPosition.first)) != -1) {
                return periodPosition;
            }
            if (!z2 || A0C(periodPosition.first, timeline2, timeline) == null) {
                return null;
            }
            return A08(timeline, timeline.A0H(iA0A, this.A0c).A00, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C10522q(timeline, c11516n.A00, c11516n.A01);
        }
    }

    private C2708no A0A() {
        Timeline timeline = this.A0A.A03;
        if (timeline.A0N()) {
            return C7Z.A0E;
        }
        return new C2708no(timeline.A0M(timeline.A0K(timeline.A0B(this.A0V), this.A0d).A00));
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D71523094: Added for negative testing")
    private final Integer A0B() {
        C7V playbackLatencyConfig;
        if (this.A09 == null || (playbackLatencyConfig = this.A09.A02()) == null) {
            String[] strArr = A0y;
            if (strArr[2].length() != strArr[6].length()) {
                A0y[7] = "1rqbEBrQgQNr61xUccdMybR9UEwvq3L8";
                return null;
            }
        } else {
            int iA00 = playbackLatencyConfig.A00();
            if (A0y[0].length() != 16) {
                String[] strArr2 = A0y;
                strArr2[2] = "KUZ";
                strArr2[6] = "wQAKuizVIm50S6vdz";
                return Integer.valueOf(iA00);
            }
        }
        throw new RuntimeException();
    }

    private Object A0C(Object obj, Timeline timeline, Timeline timeline2) {
        int iA0A = timeline.A0A(obj);
        int i2 = -1;
        int maxIterations = timeline.A06();
        for (int newPeriodIndex = 0; newPeriodIndex < maxIterations && i2 == -1 && (iA0A = timeline.A09(iA0A, this.A0c, this.A0d, this.A03, this.A0V)) != -1; newPeriodIndex++) {
            i2 = timeline2.A0A(timeline.A0M(iA0A));
        }
        if (i2 == -1) {
            return null;
        }
        return timeline2.A0M(i2);
    }

    private void A0E() {
        C7A c7aA0E = this.A0j.A0E();
        if (c7aA0E == null) {
            return;
        }
        c7aA0E.A07.A4s(c7aA0E.A0D(this.A06));
    }

    private void A0G() {
        A0V(4);
        A13(false, true, false);
    }

    private void A0H() {
        int i2;
        if (this.A0h.A06(this.A0A)) {
            Handler handler = this.A0a;
            int i3 = this.A0h.A01;
            if (this.A0h.A03) {
                i2 = this.A0h.A00;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i3, i2, this.A0A).sendToTarget();
            this.A0h.A05(this.A0A);
        }
    }

    private void A0I() throws IOException {
        C7A c7aA0E = this.A0j.A0E();
        C7A readingPeriodHolder = this.A0j.A0G();
        if (c7aA0E != null && !c7aA0E.A02) {
            if (readingPeriodHolder != null) {
                C7A loadingPeriodHolder = readingPeriodHolder.A0I();
                if (loadingPeriodHolder != c7aA0E) {
                    return;
                }
            }
            for (InterfaceC2769oo interfaceC2769oo : this.A0W) {
                if (!interfaceC2769oo.A9p()) {
                    return;
                }
            }
            c7aA0E.A07.ACS();
        }
    }

    private void A0J() throws IOException {
        this.A0j.A0L(this.A06);
        if (this.A0j.A0O()) {
            C7B c7bA0H = this.A0j.A0H(this.A06, this.A0A);
            if (c7bA0H == null) {
                this.A0D.ACT();
                return;
            }
            this.A0j.A0J(this.A0w, this.A0t ? 60000000L : 0L, this.A0l, this.A0i.A6v(), this.A0D, c7bA0H, this.A0m).AH5(this, c7bA0H.A03);
            A0y(true);
            A0v(false);
        }
    }

    private void A0K() {
        A13(true, true, true);
        this.A0i.AFc(C8O.A03);
        A0V(1);
        this.A0b.quit();
        synchronized (this) {
            this.A0S = true;
            notifyAll();
        }
    }

    private void A0L() throws AD {
        boolean z2;
        if (!this.A0j.A0N()) {
            return;
        }
        float f = this.A0g.A8m().A01;
        C7A periodHolder = this.A0j.A0G();
        boolean z3 = true;
        for (C7A c7aA0F = this.A0j.A0F(); c7aA0F != null && c7aA0F.A02; c7aA0F = c7aA0F.A0I()) {
            C1350Ex c1350ExA0L = c7aA0F.A0L(f, this.A0A.A03);
            if (c1350ExA0L != null) {
                if (z3) {
                    C7A c7aA0F2 = this.A0j.A0F();
                    boolean zA0S = this.A0j.A0S(c7aA0F2);
                    boolean[] zArr = new boolean[this.A0v.length];
                    long jA0G = c7aA0F2.A0G(c1350ExA0L, this.A0A.A0C, zA0S, zArr);
                    if (this.A0A.A00 != 4 && jA0G != this.A0A.A0C) {
                        this.A0A = this.A0A.A06(this.A0A.A05, jA0G, this.A0A.A01, A01());
                        this.A0h.A04(4);
                        A0Y(jA0G);
                    }
                    int i2 = 0;
                    boolean[] zArr2 = new boolean[this.A0v.length];
                    for (int i3 = 0; i3 < this.A0v.length; i3++) {
                        InterfaceC2769oo interfaceC2769oo = this.A0v[i3];
                        zArr2[i3] = interfaceC2769oo.A9A() != 0;
                        DT dt = c7aA0F2.A09[i3];
                        if (dt != null) {
                            i2++;
                        }
                        if (zArr2[i3]) {
                            DT dtA9D = interfaceC2769oo.A9D();
                            if (A0y[7].charAt(12) == '2') {
                                throw new RuntimeException();
                            }
                            A0y[1] = "PyyQ9suxdi7C";
                            if (dt != dtA9D) {
                                A0l(interfaceC2769oo);
                            } else if (zArr[i3]) {
                                interfaceC2769oo.AIm(this.A06);
                            }
                        }
                    }
                    this.A0A = this.A0A.A07(c7aA0F2.A0J(), c7aA0F2.A0K());
                    A14(zArr2, i2);
                    z2 = false;
                } else {
                    this.A0j.A0S(c7aA0F);
                    if (c7aA0F.A02) {
                        z2 = false;
                        c7aA0F.A0F(c1350ExA0L, Math.max(c7aA0F.A00.A03, c7aA0F.A0D(this.A06)), false);
                    } else {
                        z2 = false;
                    }
                }
                A0v(true);
                if (this.A0A.A00 != 4) {
                    A0w(z2);
                    A0Q();
                    this.A0f.AJA(2);
                    return;
                }
                return;
            }
            if (c7aA0F == periodHolder) {
                z3 = false;
            }
        }
    }

    private void A0M() {
        for (int size = this.A0p.size() - 1; size >= 0; size--) {
            if (!A16(this.A0p.get(size))) {
                this.A0p.get(size).A03.A0A(false);
                this.A0p.remove(size);
            }
        }
        Collections.sort(this.A0p);
    }

    private void A0N() throws AD {
        this.A0R = false;
        this.A0g.A05();
        this.A0k.A00();
        if (this.A0u) {
            this.A0o.A00();
        }
        for (InterfaceC2769oo interfaceC2769oo : this.A0W) {
            interfaceC2769oo.start();
        }
    }

    private void A0O() throws AD {
        this.A0g.A06();
        this.A0k.A01();
        if (this.A0u) {
            this.A0o.A01();
        }
        for (InterfaceC2769oo interfaceC2769oo : this.A0W) {
            A0m(interfaceC2769oo);
        }
    }

    private void A0Q() throws AD {
        if (!this.A0j.A0N()) {
            return;
        }
        C7A c7aA0F = this.A0j.A0F();
        long jAHQ = c7aA0F.A07.AHQ();
        if (jAHQ != -9223372036854775807L) {
            A0Y(jAHQ);
            if (jAHQ != this.A0A.A0C) {
                this.A0A = this.A0A.A06(this.A0A.A05, jAHQ, this.A0A.A01, A01());
                this.A0h.A04(4);
            }
        } else {
            C2777ow c2777ow = this.A0g;
            C7A playingPeriodHolder = this.A0j.A0G();
            this.A06 = c2777ow.A04(c7aA0F != playingPeriodHolder);
            long jA0D = c7aA0F.A0D(this.A06);
            A0Z(this.A0A.A0C, jA0D);
            this.A0A.A0C = jA0D;
        }
        C7A playingPeriodHolder2 = this.A0j.A0E();
        this.A0A.A0B = playingPeriodHolder2.A09();
        this.A0A.A0D = A01();
        this.A0A.A0D = c7aA0F.A0C(this.A0A.A0C);
    }

    private void A0S(byte b2) {
        C7A c7aA0E = this.A0j.A0E();
        if (c7aA0E != null && this.A0U) {
            c7aA0E.A07.AKb(b2);
        }
    }

    private void A0T(float f) {
        for (C7A c7aA0D = this.A0j.A0D(); c7aA0D != null && c7aA0D.A02; c7aA0D = c7aA0D.A0I()) {
            for (InterfaceC2672nE interfaceC2672nE : c7aA0D.A0K().A04) {
                if (interfaceC2672nE != null) {
                    interfaceC2672nE.AFJ(f);
                }
            }
        }
    }

    private void A0U(int i2) throws AD {
        this.A03 = i2;
        if (!this.A0j.A0P(this.A0A.A03, i2)) {
            if (A0y[0].length() == 16) {
                throw new RuntimeException();
            }
            A0y[5] = "F0pbcDG7mrKSFF2ySsjJdp1en5xQxzay";
            A0x(true);
        }
        A0v(false);
    }

    private void A0V(int i2) {
        if (this.A0A.A00 != i2) {
            this.A0A = this.A0A.A01(i2);
            if (i2 == 2) {
                this.A04 = System.currentTimeMillis();
            } else {
                this.A04 = -1L;
            }
        }
    }

    private void A0W(int i2, boolean z2) {
        if (this.A0A.A00 != i2) {
            C7Z c7zA03 = this.A0A.A03(i2, z2);
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            A0y[1] = "pTubBuiOOGTe";
            this.A0A = c7zA03;
            if (i2 == 2) {
                this.A04 = System.currentTimeMillis();
            } else {
                this.A04 = -1L;
            }
        }
    }

    private void A0X(int i2, boolean playing, int i3) throws AD {
        C7A c7aA0F = this.A0j.A0F();
        InterfaceC2769oo interfaceC2769oo = this.A0v[i2];
        this.A0W[i3] = interfaceC2769oo;
        if (interfaceC2769oo.A9A() == 0) {
            C7A c7aA0G = this.A0j.A0G();
            C7A playingPeriodHolder = this.A0j.A0F();
            boolean z2 = c7aA0G == playingPeriodHolder;
            C11827s c11827s = c7aA0F.A0K().A03[i2];
            C2860qI[] c2860qIArrA1A = A1A(c7aA0F.A0K().A04[i2]);
            boolean z3 = this.A0P && this.A0A.A00 == 3;
            interfaceC2769oo.A6L(c11827s, c2860qIArrA1A, c7aA0F.A09[i2], this.A06, !playing && z3, z2, c7aA0G.A0H(this.A0K), c7aA0F.A0B());
            this.A0g.A09(interfaceC2769oo);
            if (z3) {
                interfaceC2769oo.start();
            }
        }
    }

    private void A0Y(long j) throws AD {
        long jA0E;
        if (this.A0j.A0N()) {
            jA0E = this.A0j.A0F().A0E(j);
        } else {
            jA0E = ((long) (this.A0t ? 60000000 : 0)) + j;
        }
        this.A06 = jA0E;
        this.A0g.A07(this.A06);
        for (InterfaceC2769oo interfaceC2769oo : this.A0W) {
            long j2 = this.A06;
            String[] strArr = A0y;
            if (strArr[2].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0y[5] = "3LWS1la82nevxXslk8B3HGv7gilut34u";
            interfaceC2769oo.AIm(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f A[SYNTHETIC] */
    private void A0Z(long j, long j2) throws AD {
        C11496l c11496l;
        C11496l nextInfo;
        int i2;
        if (this.A0p.isEmpty() || this.A0A.A05.A00()) {
            return;
        }
        C7Z c7z = this.A0A;
        if (A0y[0].length() != 16) {
            String[] strArr = A0y;
            strArr[4] = "N4EB4VnnGuurJLGLQe09RRoMwim7ZTwR";
            strArr[3] = "el7QB6NOzA9v772mMpBH3ujflXdKxCpX";
            if (c7z.A02 == j) {
                j--;
            }
            int iA0A = this.A0A.A03.A0A(this.A0A.A05.A04);
            int currentPeriodIndex = this.A01;
            if (currentPeriodIndex > 0) {
                ArrayList<C11496l> arrayList = this.A0p;
                int currentPeriodIndex2 = this.A01;
                int i3 = currentPeriodIndex2 - 1;
                if (A0y[1].length() != 31) {
                    String[] strArr2 = A0y;
                    strArr2[2] = "q3c";
                    strArr2[6] = "HlTr3zIzL5MxTNWEN";
                    c11496l = arrayList.get(i3);
                }
            } else {
                c11496l = null;
            }
            while (c11496l != null && (c11496l.A00 > iA0A || (c11496l.A00 == iA0A && c11496l.A01 > j))) {
                int currentPeriodIndex3 = this.A01;
                this.A01 = currentPeriodIndex3 - 1;
                int currentPeriodIndex4 = this.A01;
                if (currentPeriodIndex4 > 0) {
                    ArrayList<C11496l> arrayList2 = this.A0p;
                    int currentPeriodIndex5 = this.A01;
                    c11496l = arrayList2.get(currentPeriodIndex5 - 1);
                } else {
                    c11496l = null;
                }
            }
            int i4 = this.A01;
            int currentPeriodIndex6 = this.A0p.size();
            if (i4 < currentPeriodIndex6) {
                ArrayList<C11496l> arrayList3 = this.A0p;
                int currentPeriodIndex7 = this.A01;
                nextInfo = arrayList3.get(currentPeriodIndex7);
            } else {
                nextInfo = null;
            }
            while (nextInfo != null && nextInfo.A02 != null) {
                int i5 = nextInfo.A00;
                if (A0y[5].charAt(1) != 'q') {
                    A0y[1] = "urcr7rEa5cce4ZESz6";
                    if (i5 >= iA0A) {
                        i2 = nextInfo.A00;
                        if (A0y[7].charAt(12) != '2') {
                            throw new RuntimeException();
                        }
                        A0y[7] = "Pqus3FB2V0wQm49ac7wvllFxwdLgqwrG";
                        if (i2 != iA0A || nextInfo.A01 > j) {
                            break;
                        }
                    }
                } else if (i5 >= iA0A) {
                    i2 = nextInfo.A00;
                    if (A0y[7].charAt(12) != '2') {
                        throw new RuntimeException();
                    }
                    A0y[7] = "Pqus3FB2V0wQm49ac7wvllFxwdLgqwrG";
                    if (i2 != iA0A) {
                        break;
                    }
                    break;
                    break;
                }
                int currentPeriodIndex8 = this.A01;
                this.A01 = currentPeriodIndex8 + 1;
                int i6 = this.A01;
                int currentPeriodIndex9 = this.A0p.size();
                if (i6 < currentPeriodIndex9) {
                    ArrayList<C11496l> arrayList4 = this.A0p;
                    int currentPeriodIndex10 = this.A01;
                    C11496l nextInfo2 = arrayList4.get(currentPeriodIndex10);
                    nextInfo = nextInfo2;
                } else {
                    nextInfo = null;
                }
            }
            while (nextInfo != null) {
                Object obj = nextInfo.A02;
                if (A0y[1].length() != 31) {
                    String[] strArr3 = A0y;
                    strArr3[2] = "ENU";
                    strArr3[6] = "SOUOSvSypycWuSHSN";
                    if (obj == null) {
                        return;
                    }
                    int currentPeriodIndex11 = nextInfo.A00;
                    if (currentPeriodIndex11 == iA0A && nextInfo.A01 > j && nextInfo.A01 <= j2) {
                        A0j(nextInfo.A03);
                        if (nextInfo.A03.A0B() || nextInfo.A03.A0D()) {
                            ArrayList<C11496l> arrayList5 = this.A0p;
                            int currentPeriodIndex12 = this.A01;
                            arrayList5.remove(currentPeriodIndex12);
                        } else {
                            int currentPeriodIndex13 = this.A01;
                            this.A01 = currentPeriodIndex13 + 1;
                        }
                        int i7 = this.A01;
                        int currentPeriodIndex14 = this.A0p.size();
                        if (i7 < currentPeriodIndex14) {
                            ArrayList<C11496l> arrayList6 = this.A0p;
                            int currentPeriodIndex15 = this.A01;
                            C11496l nextInfo3 = arrayList6.get(currentPeriodIndex15);
                            nextInfo = nextInfo3;
                        } else {
                            nextInfo = null;
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0a(long j, long j2) {
        this.A0f.AIT(2);
        this.A0f.AJB(2, j + j2);
    }

    private void A0b(C2839px c2839px) {
        this.A0g.AJd(c2839px);
        if (this.A0o != null) {
            this.A0o.AJd(c2839px);
        }
        if (this.A0k != null) {
            this.A0k.AJd(c2839px);
        }
    }

    private void A0c(C11476j c11476j) throws AD {
        throw new NullPointerException(A0D(376, 16, 17));
    }

    private void A0d(C11476j c11476j, boolean z2) throws AD {
        this.A0h.A03(1);
        throw new NullPointerException(A0D(363, 13, 127));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    private void A0g(C7A c7a) throws AD {
        C7A c7aA0F = this.A0j.A0F();
        if (c7aA0F == null || c7a == c7aA0F) {
            return;
        }
        int i2 = 0;
        boolean[] zArr = new boolean[this.A0v.length];
        String[] strArr = A0y;
        String str = strArr[4];
        String str2 = strArr[3];
        int enabledRendererCount = str.charAt(1);
        if (enabledRendererCount == str2.charAt(1)) {
            throw new RuntimeException();
        }
        A0y[0] = "";
        for (int i3 = 0; i3 < this.A0v.length; i3++) {
            InterfaceC2769oo interfaceC2769oo = this.A0v[i3];
            zArr[i3] = interfaceC2769oo.A9A() != 0;
            if (c7aA0F.A0K().A00(i3)) {
                i2++;
            }
            if (zArr[i3]) {
                C1350Ex c1350ExA0K = c7aA0F.A0K();
                int enabledRendererCount2 = A0y[5].charAt(1);
                if (enabledRendererCount2 != 113) {
                    String[] strArr2 = A0y;
                    strArr2[4] = "5yNp1I7g7IY9vjHrSpd0TTAHnxoP5q4N";
                    strArr2[3] = "spEmpaFlzQc3LcHeWE04rIrq6t30lchN";
                    if (c1350ExA0K.A00(i3)) {
                        if (interfaceC2769oo.AAN() || interfaceC2769oo.A9D() != c7a.A09[i3]) {
                        }
                    }
                } else if (c1350ExA0K.A00(i3)) {
                    if (interfaceC2769oo.AAN()) {
                    }
                }
                A0l(interfaceC2769oo);
            }
        }
        this.A0A = this.A0A.A07(c7aA0F.A0J(), c7aA0F.A0K());
        A14(zArr, i2);
    }

    private void A0h(C11677d c11677d) throws AD {
        if (c11677d.A0D()) {
            return;
        }
        try {
            c11677d.A05().A9i(c11677d.A01(), c11677d.A09());
        } finally {
            c11677d.A0A(true);
        }
    }

    private void A0i(C11677d c11677d) throws AD {
        if (c11677d.A02() == -9223372036854775807L) {
            A0j(c11677d);
            return;
        }
        if (this.A0D == null || this.A02 > 0) {
            this.A0p.add(new C11496l(c11677d));
            return;
        }
        C11496l c11496l = new C11496l(c11677d);
        if (A16(c11496l)) {
            this.A0p.add(c11496l);
            Collections.sort(this.A0p);
        } else {
            c11677d.A0A(false);
        }
    }

    private void A0j(C11677d c11677d) throws AD {
        if (c11677d.A03() == this.A0f.A8R()) {
            A0h(c11677d);
            if (this.A0A.A00 == 3 || this.A0A.A00 == 2) {
                this.A0f.AJA(2);
                return;
            }
            return;
        }
        this.A0f.ACj(15, c11677d).A02();
    }

    private void A0k(final C11677d c11677d) {
        Looper looperA03 = c11677d.A03();
        if (!looperA03.getThread().isAlive()) {
            Log.w(A0D(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 3, 37), A0D(258, 40, 7));
            c11677d.A0A(false);
        } else {
            this.A0e.A5P(looperA03, null).A03(new Runnable() { // from class: com.facebook.ads.redexgen.X.6h
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A1E(c11677d);
                }
            });
        }
    }

    private void A0l(InterfaceC2769oo interfaceC2769oo) throws AD {
        this.A0g.A08(interfaceC2769oo);
        A0m(interfaceC2769oo);
        interfaceC2769oo.A5x();
    }

    private void A0m(InterfaceC2769oo interfaceC2769oo) throws AD {
        if (interfaceC2769oo.A9A() == 2) {
            interfaceC2769oo.stop();
        }
    }

    private void A0n(C11847u c11847u) {
        this.A0C = c11847u;
    }

    private void A0o(InterfaceC2709np interfaceC2709np) {
        if (!this.A0j.A0T(interfaceC2709np)) {
            return;
        }
        this.A0j.A0L(this.A06);
        A0w(false);
    }

    private void A0p(InterfaceC2709np interfaceC2709np) throws AD {
        byte b2;
        if (!this.A0j.A0T(interfaceC2709np)) {
            return;
        }
        C7A c7aA0E = this.A0j.A0E();
        c7aA0E.A0N(this.A0g.A8m().A01, this.A0A.A03);
        A0s(c7aA0E.A0J(), c7aA0E.A0K());
        if (!this.A0j.A0N()) {
            C7A loadingPeriodHolder = this.A0j.A0B();
            A0Y(loadingPeriodHolder.A00.A03);
            A0g(null);
        }
        if (this.A0M || this.A0P) {
            b2 = 0;
        } else {
            b2 = 2;
        }
        A0S(b2);
        A10(this.A0P);
        if (A0y[7].charAt(12) == '2') {
            throw new RuntimeException();
        }
        A0y[5] = "0JHOWU68jltYXS7XBlXTYuPeT3LWkLA2";
        A0w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.DW
    /* JADX INFO: renamed from: A0q, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC2709np interfaceC2709np) {
        this.A0f.ACj(10, interfaceC2709np).A02();
    }

    private void A0r(InterfaceC1298Cx interfaceC1298Cx, boolean z2, boolean z3) {
        this.A02++;
        A13(true, z2, z3);
        this.A0i.AFR(C8O.A03);
        this.A0D = interfaceC1298Cx;
        A0V(2);
        interfaceC1298Cx.AH7(this, null);
        this.A0f.AJA(2);
    }

    private void A0s(C2690nW c2690nW, C1350Ex c1350Ex) {
        this.A0i.AGF(new AnonymousClass73(C8O.A03, this.A0A.A03, this.A0A.A04, this.A0A.A0C, A01(), this.A0g.A8m().A01, this.A0P, this.A0R, -9223372036854775807L, this.A04), c2690nW, c1350Ex.A04);
    }

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    private void A0t(EnumC2426ir enumC2426ir, boolean z2) {
        if (this.A0A.A00 != 3) {
            this.A0A = this.A0A.A02(3, enumC2426ir, z2);
            this.A04 = -1L;
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D63737392: Added for negative testing")
    private void A0u(String str) {
        boolean z2 = false;
        if (str == null) {
            this.A0J = false;
            this.A09 = null;
            return;
        }
        if (str != null && str.length() > 0) {
            z2 = true;
        }
        this.A0J = z2;
        this.A09 = new C7W(str);
    }

    private void A0v(boolean z2) {
        C2708no c2708no;
        C7A c7aA0E = this.A0j.A0E();
        if (c7aA0E == null) {
            C7Z c7z = this.A0A;
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "b0w";
            strArr[6] = "WyMJg745VdMbfing6";
            c2708no = c7z.A05;
        } else {
            c2708no = c7aA0E.A00.A04;
        }
        C2708no loadingMediaPeriodId = this.A0A.A04;
        boolean loadingMediaPeriodChanged = !loadingMediaPeriodId.equals(c2708no);
        if (loadingMediaPeriodChanged) {
            this.A0A = this.A0A.A05(c2708no);
        }
        if ((loadingMediaPeriodChanged || z2) && c7aA0E != null && c7aA0E.A02) {
            A0s(c7aA0E.A0J(), c7aA0E.A0K());
        }
    }

    @MetaExoPlayerCustomization("Customized Buffered Duration MS D23157182")
    private void A0w(boolean z2) {
        long jA0C;
        C7A c7aA0E = this.A0j.A0E();
        long jA0A = c7aA0E.A0A();
        if (jA0A == Long.MIN_VALUE) {
            A0y(false);
            return;
        }
        long jA0D = c7aA0E.A0D(this.A06);
        if (!this.A0s || c7aA0E == this.A0j.A0F() || this.A0j.A0F() == null) {
            jA0C = c7aA0E.A0C(jA0D);
            if (this.A0O) {
                for (C7A c7aA0F = this.A0j.A0F(); c7aA0F != null && c7aA0F != c7aA0E; c7aA0F = c7aA0F.A0I()) {
                    long nextLoadPositionUs = this.A06;
                    jA0C += c7aA0F.A0C(c7aA0F.A0D(nextLoadPositionUs));
                }
            }
        } else {
            jA0C = A02();
        }
        Timeline timeline = this.A0A.A03;
        C2708no c2708no = c7aA0E.A00.A04;
        float f = this.A0g.A8m().A01;
        boolean z3 = this.A0P || z2;
        boolean z4 = this.A0R;
        long nextLoadPositionUs2 = this.A04;
        boolean zAJv = this.A0i.AJv(new AnonymousClass73(null, timeline, c2708no, jA0D, jA0C, f, z3, z4, -9223372036854775807L, nextLoadPositionUs2));
        if (this.A0T && this.A0P && this.A0R && !zAJv && this.A0A.A00 == 2) {
            Long lValueOf = Long.valueOf(jA0D / 1000);
            Long lValueOf2 = Long.valueOf(jA0C / 1000);
            Long lValueOf3 = Long.valueOf(jA0A / 1000);
            String[] strArr = A0y;
            if (strArr[4].charAt(1) == strArr[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0y;
            strArr2[2] = "Frr";
            strArr2[6] = "mfKzHFhLmxUYLc6Gx";
            this.A0a.obtainMessage(5, C5C.A0n(A0D(125, 70, 5), lValueOf, lValueOf2, lValueOf3)).sendToTarget();
            this.A0T = false;
        }
        A0y(zAJv);
        if (zAJv) {
            c7aA0E.A0O(this.A06);
        }
    }

    private void A0x(boolean z2) throws AD {
        C2708no c2708no = this.A0j.A0F().A00.A04;
        long jA07 = A07(false, c2708no, this.A0A.A0C, true);
        if (jA07 != this.A0A.A0C) {
            this.A0A = this.A0A.A06(c2708no, jA07, this.A0A.A01, A01());
            if (z2) {
                C11506m c11506m = this.A0h;
                String[] strArr = A0y;
                if (strArr[4].charAt(1) == strArr[3].charAt(1)) {
                    throw new RuntimeException();
                }
                A0y[5] = "dnthUoDEzHvBWSE2tp3YAJwgKJx1FOWZ";
                c11506m.A04(4);
            }
        }
    }

    private void A0y(boolean z2) {
        if (this.A0A.A0A != z2) {
            this.A0A = this.A0A.A08(z2);
        }
    }

    private void A0z(boolean z2) throws AD {
        try {
            this.A0R = false;
            this.A0P = z2;
            A10(z2);
            if (!z2) {
                A0O();
                A0Q();
                A0S((byte) 2);
                if (this.A0I) {
                    A0E();
                }
            } else {
                A0S((byte) 0);
                if (this.A0A.A00 != 3) {
                    if (this.A0A.A00 == 2) {
                        this.A0f.AJA(2);
                    }
                } else {
                    A0N();
                    this.A0f.AJA(2);
                }
            }
        } finally {
            this.A0a.obtainMessage(3, Boolean.valueOf(z2)).sendToTarget();
        }
    }

    @MetaExoPlayerCustomization("D19875605 Prevent further error loading once pausing video")
    private void A10(boolean z2) {
        C7A loadingPeriod = this.A0j.A0E();
        if (loadingPeriod == null) {
            return;
        }
        loadingPeriod.A07.AJc(z2);
    }

    private void A11(boolean z2) throws AD {
        this.A0V = z2;
        if (!this.A0j.A0R(this.A0A.A03, z2)) {
            A0x(true);
        }
        A0v(false);
    }

    private void A12(boolean z2, boolean z3) {
        A13(true, z2, z2);
        this.A0h.A03(this.A02 + (z3 ? 1 : 0));
        this.A02 = 0;
        this.A0i.AG6(C8O.A03);
        A0V(1);
    }

    private void A13(boolean z2, boolean z3, boolean z4) {
        long j;
        C2690nW c2690nW;
        C1350Ex c1350Ex;
        this.A0f.AIT(2);
        this.A0R = false;
        this.A0g.A06();
        this.A0k.A01();
        if (this.A0u) {
            this.A0o.A01();
        }
        this.A06 = this.A0t ? 60000000L : 0L;
        for (InterfaceC2769oo interfaceC2769oo : this.A0W) {
            try {
                A0l(interfaceC2769oo);
            } catch (AD | RuntimeException e2) {
                Log.e(A0D(0, 21, 22), A0D(208, 12, 44), e2);
            }
        }
        this.A0W = new InterfaceC2769oo[0];
        this.A0j.A0M(!z3);
        A0y(false);
        if (z3) {
            this.A08 = null;
        }
        if (z4) {
            Iterator<C11496l> it = this.A0p.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0p.clear();
            this.A01 = 0;
        }
        C2708no c2708noA0A = z3 ? A0A() : this.A0A.A05;
        long j2 = -9223372036854775807L;
        if (z3) {
            j = -9223372036854775807L;
        } else {
            C7Z c7z = this.A0A;
            if (A0y[5].charAt(1) != 'q') {
                String[] strArr = A0y;
                strArr[4] = "7gx390g1msf1u5QKnR2KjvR4WQmRx8YK";
                strArr[3] = "VlC7tbQkEF507tv73u1W2v85d7ApXXNM";
                j = c7z.A0C;
            } else {
                A0y[5] = "C79IK8sPJjEkg2u4SoGimfUAaE3F5yew";
                j = c7z.A0C;
            }
        }
        if (!z3) {
            C7Z c7z2 = this.A0A;
            if (A0y[5].charAt(1) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr2 = A0y;
            strArr2[2] = "uSR";
            strArr2[6] = "FwoZ6mA9qzJ4hrvJt";
            j2 = c7z2.A01;
        }
        Timeline timeline = z4 ? Timeline.A02 : this.A0A.A03;
        int i2 = this.A0A.A00;
        if (z4) {
            c2690nW = C2690nW.A06;
        } else {
            C7Z c7z3 = this.A0A;
            if (A0y[7].charAt(12) == '2') {
                throw new RuntimeException();
            }
            A0y[5] = "yizxhFEcEwEbIh7DB6ScCbr86G64zHmf";
            c2690nW = c7z3.A06;
        }
        if (z4) {
            c1350Ex = this.A0m;
        } else {
            c1350Ex = this.A0A.A07;
        }
        this.A0A = new C7Z(timeline, c2708noA0A, j, j2, i2, false, c2690nW, c1350Ex, c2708noA0A, j, 0L, j);
        if (z2 && this.A0D != null) {
            this.A0D.AHl(this);
            this.A0D = null;
        }
    }

    private void A14(boolean[] zArr, int i2) throws AD {
        this.A0W = new InterfaceC2769oo[i2];
        int enabledRendererCount = 0;
        C7A c7aA0F = this.A0j.A0F();
        for (int i3 = 0; i3 < enabledRendererCount; i3++) {
            if (c7aA0F.A0K().A00(i3)) {
                A0X(i3, zArr[i3], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A15() {
        C7A playingPeriodHolder = this.A0j.A0F();
        C7A c7aA0I = playingPeriodHolder.A0I();
        long j = playingPeriodHolder.A00.A00;
        return j == -9223372036854775807L || this.A0A.A0C < j || (c7aA0I != null && (c7aA0I.A02 || c7aA0I.A00.A04.A00()));
    }

    private boolean A16(C11496l c11496l) {
        if (c11496l.A02 == null) {
            Pair<Object, Long> pairA09 = A09(new C11516n(c11496l.A03.A04(), c11496l.A03.A00(), C2Y.A00(c11496l.A03.A02())), false);
            if (pairA09 == null) {
                return false;
            }
            int iA0A = this.A0A.A03.A0A(pairA09.first);
            if (A0y[5].charAt(1) != 'q') {
                A0y[5] = "NfGCtpMsHKBVYsn3O7a8Zqq9gxyOlhFa";
                c11496l.A01(iA0A, ((Long) pairA09.second).longValue(), pairA09.first);
                return true;
            }
            throw new RuntimeException();
        }
        int iA0A2 = this.A0A.A03.A0A(c11496l.A02);
        if (iA0A2 == -1) {
            return false;
        }
        c11496l.A00 = iA0A2;
        return true;
    }

    private boolean A17(InterfaceC2769oo interfaceC2769oo) {
        C7A c7aA0G = this.A0j.A0G();
        C7A readingPeriodHolder = c7aA0G.A0I();
        if (readingPeriodHolder != null) {
            C7A readingPeriodHolder2 = c7aA0G.A0I();
            if (readingPeriodHolder2.A02 && interfaceC2769oo.A9p()) {
                return true;
            }
        }
        return false;
    }

    private boolean A18(C2708no c2708no, long j, C7A c7a) {
        if (!c2708no.equals(c7a.A00.A04)) {
            return false;
        }
        boolean z2 = c7a.A02;
        if (A0y[1].length() == 31) {
            throw new RuntimeException();
        }
        A0y[1] = "z9";
        if (z2) {
            this.A0A.A03.A0J(this.A0A.A05.A04, this.A0c);
            int iA07 = this.A0c.A07(j);
            if (iA07 != -1) {
                long jA0D = this.A0c.A0D(iA07);
                C7B c7b = c7a.A00;
                if (A0y[5].charAt(1) == 'q') {
                    A0y[5] = "RcBDfVPYXZ1IWswHj8kiKJAUw6BsFYM7";
                    if (jA0D == c7b.A01) {
                        return true;
                    }
                    return false;
                }
                String[] strArr = A0y;
                strArr[4] = "w6QknFDGuvwfcqywG7nwGfdAAoNokq6y";
                strArr[3] = "I5j8Ais0ITqpKL2oROmKoI7QN1W2GqI7";
                if (jA0D == c7b.A01) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("Customized Buffered Duration MS D23157182"), @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")})
    private boolean A19(boolean z2) {
        boolean z3;
        long jA0C;
        if (this.A0W.length == 0) {
            return A15();
        }
        if (!z2) {
            if (this.A0B != null) {
                this.A0E = this.A0B.A99();
            }
            return false;
        }
        if (!this.A0A.A0A) {
            return true;
        }
        C7A c7aA0E = this.A0j.A0E();
        if (c7aA0E.A0R()) {
            C7B c7b = c7aA0E.A00;
            if (A0y[7].charAt(12) == '2') {
                throw new RuntimeException();
            }
            A0y[5] = "JVFQROlQoWGuZTJ8G1Kf7NjovTqMHrup";
            if (c7b.A05) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (!this.A0s || this.A0j.A0F() == this.A0j.A0E() || this.A0j.A0F() == null) {
            jA0C = c7aA0E.A0C(c7aA0E.A0D(this.A06));
        } else {
            jA0C = A03();
        }
        boolean z4 = z3 || this.A0i.AJy(jA0C, this.A0g.A8m().A01, this.A0R, this.A00 > 0 && (this.A04 > 0L ? 1 : (this.A04 == 0L ? 0 : -1)) > 0 && ((System.currentTimeMillis() - this.A04) > ((long) this.A00) ? 1 : ((System.currentTimeMillis() - this.A04) == ((long) this.A00) ? 0 : -1)) < 0, -9223372036854775807L);
        if (!z4) {
            this.A0E = EnumC2426ir.A04;
        }
        return z4;
    }

    public static C2860qI[] A1A(InterfaceC1343Eq interfaceC1343Eq) {
        int length = interfaceC1343Eq != null ? interfaceC1343Eq.length() : 0;
        C2860qI[] c2860qIArr = new C2860qI[length];
        for (int i2 = 0; i2 < length; i2++) {
            c2860qIArr[i2] = interfaceC1343Eq.A8B(i2);
        }
        return c2860qIArr;
    }

    public final Looper A1B() {
        return this.A0b.getLooper();
    }

    public final synchronized void A1C() {
        if (this.A0S) {
            return;
        }
        this.A0f.AJA(7);
        boolean z2 = false;
        while (!wasInterrupted) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A1D(Timeline timeline, int i2, long j) {
        this.A0f.ACj(3, new C11516n(timeline, i2, j)).A02();
    }

    public final /* synthetic */ void A1E(C11677d c11677d) {
        try {
            A0h(c11677d);
        } catch (AD e2) {
            Log.e(A0D(0, 21, 22), A0D(a.b1, 55, 119), e2);
            throw new RuntimeException(e2);
        }
    }

    public final void A1F(InterfaceC1298Cx interfaceC1298Cx, boolean z2, boolean z3) {
        this.A0f.ACi(0, z2 ? 1 : 0, z3 ? 1 : 0, interfaceC1298Cx).A02();
    }

    public final void A1G(boolean z2) {
        this.A0f.ACh(1, z2 ? 1 : 0, 0).A02();
    }

    public final void A1H(boolean z2) {
        this.A0f.ACh(6, z2 ? 1 : 0, 0).A02();
    }

    @Override // com.facebook.ads.redexgen.core.C6P
    public final void AFI(C2839px c2839px) {
        this.A0a.obtainMessage(1, c2839px).sendToTarget();
        A0T(c2839px.A01);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2710nq
    public final void AFS(InterfaceC2709np interfaceC2709np) {
        this.A0f.ACj(9, interfaceC2709np).A02();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1297Cw
    public final void AG1(InterfaceC1298Cx interfaceC1298Cx, Timeline timeline) {
        this.A0f.ACj(8, new C11486k(interfaceC1298Cx, timeline)).A02();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1348Ev
    public final void AGD() {
        this.A0f.AJA(11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11657b
    public final synchronized void AJC(C11677d c11677d) {
        if (this.A0S) {
            Log.w(A0D(0, 21, 22), A0D(50, 37, 39));
            c11677d.A0A(false);
        } else {
            this.A0f.ACj(14, c11677d).A02();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strA0D = A0D(0, 21, 22);
        try {
            switch (message.what) {
                case 0:
                    A0r((InterfaceC1298Cx) message.obj, message.arg1 != 0, message.arg2 != 0);
                    A0H();
                    return true;
                case 1:
                    A0z(message.arg1 != 0);
                    A0H();
                    return true;
                case 2:
                    A0F();
                    A0H();
                    return true;
                case 3:
                    A0f((C11516n) message.obj);
                    A0H();
                    return true;
                case 4:
                    A0b((C2839px) message.obj);
                    A0H();
                    return true;
                case 5:
                    A0n((C11847u) message.obj);
                    A0H();
                    return true;
                case 6:
                    A12(message.arg1 != 0, true);
                    A0H();
                    return true;
                case 7:
                    A0K();
                    return true;
                case 8:
                    A0e((C11486k) message.obj);
                    A0H();
                    return true;
                case 9:
                    A0p((InterfaceC2709np) message.obj);
                    A0H();
                    return true;
                case 10:
                    A0o((InterfaceC2709np) message.obj);
                    A0H();
                    return true;
                case 11:
                    A0L();
                    A0H();
                    return true;
                case 12:
                    A0U(message.arg1);
                    A0H();
                    return true;
                case 13:
                    A11(message.arg1 != 0);
                    A0H();
                    return true;
                case 14:
                    A0i((C11677d) message.obj);
                    A0H();
                    return true;
                case 15:
                    A0k((C11677d) message.obj);
                    A0H();
                    return true;
                case 16:
                    A0H();
                    return true;
                case 17:
                    A0d(null, false);
                    throw null;
                case 18:
                    A0c(null);
                    throw null;
                case 19:
                    A0u((String) message.obj);
                    A0H();
                    return true;
                default:
                    return false;
            }
        } catch (AD e2) {
            Log.e(strA0D, A0D(110, 15, 65), e2);
            A12(false, false);
            this.A0a.obtainMessage(2, e2).sendToTarget();
            A0H();
        } catch (IOException e3) {
            Log.e(strA0D, A0D(195, 13, 40), e3);
            A12(false, false);
            this.A0a.obtainMessage(2, AD.A01(e3, 2000)).sendToTarget();
            A0H();
        } catch (RuntimeException e4) {
            Log.e(strA0D, A0D(87, 23, 19), e4);
            A12(false, false);
            this.A0a.obtainMessage(2, AD.A02(e4)).sendToTarget();
            A0H();
        }
    }
}
