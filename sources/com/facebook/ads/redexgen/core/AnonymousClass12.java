package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.12, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass12 extends AbstractC10181g implements AnonymousClass78 {
    public static byte[] A0J;
    public static String[] A0K = {"77C8vP87Fd7b4BP9SQRJBzWPVk4TewQg", "oQ2qsKrmaNuyaLFB2ph9zkmGtpzAonXt", "MDqZPLCoXCzEQwxPxYtAKuxbh2tAcx1k", "aWPkhw6gWy0BTxYknUchyjQmABWF", "ais5GYfL5LR1KEYd6HRi1BBd2kmjCeGs", "pdewp8MC9mt7vaqV0Zkeu3U5mw150Zm9", "qv2CVs2gAdpJ8ZKBYAbfHfBiBdoePlCI", "lcPZgHPLbCISPmjsMn5qIGSBsvlpomMq"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public MediaFormat A06;
    public C2860qI A07;
    public InterfaceC11717h A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C12038o A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final InterfaceC12118z A0I;

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            if (A0K[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[4] = "GcWDzLLiTAl0tD46XyRRBcNodd92JrSP";
            strArr[0] = "GhxldHXMoVDog6OAV5RKTarDpyl0kviC";
            bArrCopyOfRange[i5] = (byte) ((b2 - i4) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0J = new byte[]{-103, -79, -80, -75, -83, -113, -69, -80, -79, -81, -115, -63, -80, -75, -69, -98, -79, -70, -80, -79, -66, -79, -66, -77, -79, -68, -110, -73, -87, -89, -110, -59, -59, -57, -110, -56, -55, -57, -36, -38, -27, -69, -12, -4, -4, -12, -7, -14, -69, -1, -18, 4, -69, -15, -14, -16, -4, -15, -14, -1, -17, -17, -15, -69, -14, 0, -15, -69, -13, -12, -12, -13, -15, 2, -69, 2, 7, -2, -13, -51, -51, -49, -103, -32, -51, -34, -45, -47, -32, -103, -34, -47, -46, -103, -40, -47, -30, -47, -40, 7, 27, 10, 15, 21, -43, 24, 7, 29, 20, 25, 18, 31, 31, 22, 29, -34, 20, 32, 38, 31, 37, -85, -88, -75, -78, -81, -73, -88, -31, -34, -21, -24, -22, -27, -19, -34, -54, -66, -43, -118, -58, -53, -51, -46, -47, -118, -48, -58, -41, -62, -39, -43, -39, -47, -68, -65, -125, -80, 125, -125, AbstractJsonLexerKt.TC_INVALID, 125, -125, -127, -64, -62, -71, -65, -62, -71, -60, -55, -65, -83, -71, -68, -72, -79, 121, -66, -83, -64, -79, -27, -45, -33, -27, -25, -32, -39, -47, -68, -55, -58, -67, -61, -53, -68};
    }

    static {
        A09();
    }

    public AnonymousClass12(Context context, C2456jQ c2456jQ, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, BT bt, A6 a6, boolean z2, boolean z3, boolean z4, Handler handler, InterfaceC12048p interfaceC12048p, C8R c8r, InterfaceC10703k... interfaceC10703kArr) {
        this(context, c2456jQ, mediaCodecRendererMetaParameters, bt, a6, z2, z3, z4, handler, interfaceC12048p, new C2741oM(c8r, interfaceC10703kArr));
    }

    public AnonymousClass12(Context context, C2456jQ c2456jQ, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, BT bt, A6 a6, boolean z2, boolean z3, boolean z4, Handler handler, InterfaceC12048p interfaceC12048p, InterfaceC12118z interfaceC12118z) {
        super(1, c2456jQ, mediaCodecRendererMetaParameters, bt, a6, z2, false, 0, 0);
        this.A01 = 0;
        this.A02 = 0;
        this.A05 = 0L;
        this.A0E = context.getApplicationContext();
        this.A0I = interfaceC12118z;
        this.A0G = z3;
        this.A0H = z4;
        this.A0F = new C12038o(handler, interfaceC12048p);
        interfaceC12118z.AJV(new C2739oK(this));
        interfaceC12118z.AJQ(c2456jQ.A0D);
    }

    @MetaExoPlayerCustomization("Added in D36293647 for DRC")
    private int A00() {
        int i2 = this.A0z.A09;
        if (this.A0z.A0F) {
            int i3 = this.A0z.A03;
            int i4 = this.A0z.A04;
            int xHEAACEffectType = this.A0z.A05;
            return ContextAwareXHEAACDRCTypeUtil.A00(i3, i4, xHEAACEffectType);
        }
        return i2;
    }

    public static int A01(C2860qI c2860qI) {
        if (A07(99, 9, 101).equals(c2860qI.A0W)) {
            return c2860qI.A0C;
        }
        return 2;
    }

    private int A02(B3 b3, C2860qI c2860qI) {
        if (A07(38, 22, 76).equals(b3.A03) && C5C.A02 < 24) {
            int i2 = C5C.A02;
            String[] strArr = A0K;
            if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "s8yZpZp8nIrL7EQY3mPJ1kqCekDwsY6i";
            strArr2[7] = "yd2Z0BEEocl53iuZqAxtcOKT0DXRknsH";
            if (i2 != 23 || !C5C.A18(this.A0E)) {
                String[] strArr3 = A0K;
                if (strArr3[4].charAt(18) != strArr3[0].charAt(18)) {
                    throw new RuntimeException();
                }
                A0K[3] = "9QHOUbokymVnxuZO6z7rLJCC2XoG";
                return -1;
            }
        }
        int i3 = c2860qI.A0B;
        String[] strArr4 = A0K;
        if (strArr4[2].charAt(3) != strArr4[7].charAt(3)) {
            return i3;
        }
        String[] strArr5 = A0K;
        strArr5[2] = "bWiZaXhFQHkoAXZnJ4ncaGOlncM6vz1V";
        strArr5[7] = "kg6ZwO8ePPrkJPsuoAADu0ZS0U6OWo96";
        return i3;
    }

    private final int A03(B3 b3, C2860qI c2860qI, C2860qI[] c2860qIArr) {
        int maxInputSize = A02(b3, c2860qI);
        return maxInputSize;
    }

    private final MediaFormat A04(C2860qI c2860qI, String str, int i2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A07(150, 4, 43), str);
        mediaFormat.setInteger(A07(108, 13, 112), c2860qI.A06);
        mediaFormat.setInteger(A07(172, 11, 11), c2860qI.A0G);
        AbstractC10944i.A06(mediaFormat, c2860qI.A0X);
        AbstractC10944i.A04(mediaFormat, A07(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 14, 28), i2);
        if (C5C.A02 >= 23) {
            String strA07 = A07(164, 8, 15);
            String[] strArr = A0K;
            if (strArr[4].charAt(18) != strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[1] = "w8gjBPJzE632nZpBrlzwe1tLIvq8CsOY";
            strArr2[6] = "ag3DPBWcd6fSOrmBwunkDpt77Nl4HY4l";
            mediaFormat.setInteger(strA07, 0);
        }
        if (c2860qI.A0R != null && c2860qI.A0R.equals(A07(154, 10, 14)) && this.A0z.A0G) {
            mediaFormat.setInteger(A07(60, 19, 77), A00());
            mediaFormat.setInteger(A07(79, 20, 43), this.A0z.A0A);
        }
        return mediaFormat;
    }

    public static /* synthetic */ InterfaceC11717h A05(AnonymousClass12 anonymousClass12) {
        return null;
    }

    private void A08() {
        long jA7f = this.A0I.A7f(AAP());
        if (jA7f != Long.MIN_VALUE) {
            if (!this.A0A) {
                long j = this.A04;
                String[] strArr = A0K;
                if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0K;
                strArr2[4] = "nIJcPeFAtvuDBzBlXMRw0HpU2OMpTIMr";
                strArr2[0] = "dapTBdH8hqStbvnLCARUyCc0T0ChI3T8";
                jA7f = Math.max(j, jA7f);
            }
            this.A04 = jA7f;
            this.A0A = false;
        }
    }

    private boolean A0A(C2860qI c2860qI) {
        String str = c2860qI.A0W;
        String mimeType = A07(99, 9, 101);
        if (!mimeType.equals(str)) {
            return this.A0I.AKN(c2860qI);
        }
        String[] strArr = A0K;
        if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[4] = "mDVewdn3RvQYeqn2qaR7zJPFTyK9zqzw";
        strArr2[0] = "a0e3mP5dmYOn07QMhHRhkP7lbfukdIg9";
        return false;
    }

    public static boolean A0B(String str) {
        if (C5C.A02 < 24 && A07(23, 15, 35).equals(str)) {
            if (A07(183, 7, 49).equals(C5C.A05) && (C5C.A03.startsWith(A07(190, 8, 22)) || C5C.A03.startsWith(A07(121, 7, 2)) || C5C.A03.startsWith(A07(128, 8, 56)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g, com.facebook.ads.redexgen.core.AE
    public final void A1X() {
        super.A1X();
        this.A0I.AH0();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g, com.facebook.ads.redexgen.core.AE
    public final void A1Y() {
        A08();
        this.A0I.pause();
        super.A1Y();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g, com.facebook.ads.redexgen.core.AE
    public final void A1Z() {
        try {
            this.A0I.flush();
            try {
                super.A1Z();
            } finally {
                this.A0h.A02();
                this.A0F.A07(this.A0h);
            }
        } catch (Throwable th) {
            try {
                super.A1Z();
                throw th;
            } finally {
                this.A0h.A02();
                this.A0F.A07(this.A0h);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g, com.facebook.ads.redexgen.core.AE
    public final void A1a(long j, boolean z2) throws AD {
        super.A1a(j, z2);
        if (this.A0C) {
            this.A0I.A6T();
        } else {
            this.A0I.flush();
        }
        this.A04 = j;
        this.A09 = true;
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g, com.facebook.ads.redexgen.core.AE
    public final void A1b(boolean z2, boolean z3) throws AD {
        super.A1b(z2, z3);
        this.A0F.A08(this.A0h);
        if (A1V().A00) {
            this.A0I.A6M();
        } else {
            this.A0I.A5z();
        }
        this.A0I.AJg(A1W());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final int A1g(B0 b1, B3 b3, C2860qI c2860qI, C2860qI c2860qI2) {
        if (this.A0z.A0O && A02(b3, c2860qI2) <= this.A00 && b3.A0U(c2860qI, c2860qI2, true) && c2860qI.A08 == 0 && c2860qI.A09 == 0 && c2860qI2.A08 == 0 && c2860qI2.A09 == 0) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final int A1h(BT bt, A6 a6, C2860qI c2860qI) throws BX {
        List<B3> listA1l;
        B3 b3;
        int tunnelingSupport;
        int i2;
        String str = c2860qI.A0W;
        int adaptiveSupport = 0;
        if (!C3J.A0C(str)) {
            return 0;
        }
        int i3 = C5C.A02 >= 21 ? 32 : 0;
        boolean zA1G = AbstractC10181g.A1G(c2860qI);
        int i4 = 4;
        if (zA1G && A0A(c2860qI) && C1252Ba.A0I() != null) {
            return i3 | 8 | 4;
        }
        String mimeType = A07(99, 9, 101);
        if (mimeType.equals(str)) {
            InterfaceC12118z interfaceC12118z = this.A0I;
            int tunnelingSupport2 = c2860qI.A06;
            if (interfaceC12118z.AKP(tunnelingSupport2, c2860qI.A0C)) {
                if (this.A0I.AKP(c2860qI.A06, 2)) {
                    listA1l = A1l(bt, c2860qI, false);
                    if (listA1l.isEmpty()) {
                        return AbstractC11727i.A00(1);
                    }
                    if (!zA1G) {
                        return AbstractC11727i.A00(2);
                    }
                    b3 = listA1l.get(0);
                    tunnelingSupport = A0K[5].charAt(0);
                    if (tunnelingSupport != 112) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0K;
                    strArr[4] = "n12bmxDOOVBzqYYOQBRjqp0moJyAYtSu";
                    strArr[0] = "BaglFChNOdaklTSyUQRitIBwXJJTR14H";
                    B3 b4 = b3;
                    if (C5C.A02 >= 21 || ((c2860qI.A0G == -1 || b4.A0Q(c2860qI.A0G)) && (c2860qI.A06 == -1 || b4.A0P(c2860qI.A06)))) {
                        adaptiveSupport = 1;
                    }
                    if (adaptiveSupport == 0 && b4.A0T(c2860qI)) {
                        i2 = 16;
                    } else {
                        i2 = 8;
                    }
                    if (adaptiveSupport == 0) {
                        i4 = 3;
                    }
                    return i2 | i3 | i4;
                }
            }
        } else if (this.A0I.AKP(c2860qI.A06, 2)) {
            listA1l = A1l(bt, c2860qI, false);
            if (listA1l.isEmpty()) {
                return AbstractC11727i.A00(1);
            }
            if (!zA1G) {
                return AbstractC11727i.A00(2);
            }
            b3 = listA1l.get(0);
            tunnelingSupport = A0K[5].charAt(0);
            if (tunnelingSupport != 112) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[4] = "n12bmxDOOVBzqYYOQBRjqp0moJyAYtSu";
            strArr2[0] = "BaglFChNOdaklTSyUQRitIBwXJJTR14H";
            B3 b5 = b3;
            if (C5C.A02 >= 21) {
                adaptiveSupport = 1;
            } else {
                adaptiveSupport = 1;
            }
            if (adaptiveSupport == 0) {
                i2 = 8;
            } else {
                i2 = 8;
            }
            if (adaptiveSupport == 0) {
                i4 = 3;
            }
            return i2 | i3 | i4;
        }
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final List<B3> A1l(BT bt, C2860qI c2860qI, boolean z2) throws BX {
        B3 b3A0I;
        String mimeType = c2860qI.A0W;
        if (mimeType == null) {
            return Collections.emptyList();
        }
        if (A0A(c2860qI) && (b3A0I = C1252Ba.A0I()) != null) {
            List<B3> listSingletonList = Collections.singletonList(b3A0I);
            String[] strArr = A0K;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[4] = "VH1rG9jH3WXhHTxnLXRxhYBKNNIMNlpD";
            strArr2[0] = "4dJInhYjvnfEcXSyIbRNEiIfORerumv3";
            return listSingletonList;
        }
        return Collections.unmodifiableList(bt.A7o(c2860qI.A0W, z2, false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final void A1o() throws AD {
        try {
            this.A0I.AH2();
        } catch (C12108y e2) {
            throw A1T(e2, e2.A01, e2.A02, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final void A1s(C2860qI c2860qI) throws AD {
        super.A1s(c2860qI);
        this.A07 = c2860qI;
        this.A0F.A05(this.A07, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final void A1u(C2781p0 c2781p0) {
        if (this.A09 && !c2781p0.A04()) {
            if (Math.abs(c2781p0.A01 - this.A04) > 500000) {
                this.A04 = c2781p0.A01;
            }
            this.A09 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final void A1v(B0 b1, MediaFormat mediaFormat) throws AD {
        int sampleRate;
        MediaFormat mediaFormat2;
        int[] channelMap;
        if (this.A06 != null) {
            sampleRate = C3J.A00(this.A06.getString(A07(150, 4, 43)));
            mediaFormat2 = this.A06;
        } else {
            sampleRate = A01(this.A07);
            mediaFormat2 = mediaFormat;
        }
        String strA07 = A07(108, 13, 112);
        int integer = mediaFormat2.getInteger(strA07);
        String strA08 = A07(172, 11, 11);
        if (A0K[5].charAt(0) != 'p') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[1] = "oVYorWwiJ9QuTT6BmhgOhsdn4ih9katO";
        strArr[6] = "s4BjQ2RFQmOrQGZBZgzfkwBc6WQlVCBr";
        int encoding = mediaFormat2.getInteger(strA08);
        this.A03 = encoding * integer;
        if (this.A0B) {
            String[] strArr2 = A0K;
            String str = strArr2[1];
            String str2 = strArr2[6];
            int iCharAt = str.charAt(15);
            int encoding2 = str2.charAt(15);
            if (iCharAt != encoding2) {
                throw new RuntimeException();
            }
            A0K[5] = "pG08ZDLF1Nwa7YWNReZn10nEeTPXXDD5";
            if (integer == 6) {
                int encoding3 = this.A07.A06;
                if (encoding3 < 6) {
                    int encoding4 = this.A07.A06;
                    channelMap = new int[encoding4];
                    for (int i2 = 0; i2 < encoding; i2++) {
                        channelMap[i2] = i2;
                    }
                } else {
                    channelMap = null;
                }
            } else {
                channelMap = null;
            }
        } else {
            channelMap = null;
        }
        C10512p c10512pA0i = new C10512p().A11(A07(99, 9, 101)).A0i(sampleRate);
        int encoding5 = mediaFormat.getInteger(strA07);
        C10512p c10512pA0b = c10512pA0i.A0b(encoding5);
        int encoding6 = mediaFormat.getInteger(strA08);
        C2860qI audioSinkInputFormat = c10512pA0b.A0m(encoding6).A14();
        try {
            this.A0I.A59(audioSinkInputFormat, 0, channelMap);
        } catch (C12068s e2) {
            throw A1S(e2, e2.A00, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final void A1w(B3 b3, B0 b1, C2860qI c2860qI, MediaCrypto mediaCrypto) {
        this.A00 = A03(b3, c2860qI, A1e());
        this.A0B = A0B(b3.A03);
        String str = b3.A02;
        String strA07 = A07(99, 9, 101);
        this.A0D = strA07.equals(str) && !strA07.equals(c2860qI.A0W);
        MediaFormat mediaFormatA04 = A04(c2860qI, b3.A01, this.A00);
        b1.A58(mediaFormatA04, null, mediaCrypto, 0, null);
        if (this.A0D) {
            this.A06 = mediaFormatA04;
            this.A06.setString(A07(150, 4, 43), c2860qI.A0W);
        } else {
            this.A06 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(String str) {
        this.A0F.A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final void A1y(String str, long j, long j2) {
        this.A0F.A0G(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    @MetaExoPlayerCustomization("Added in D6142814")
    public final boolean A22() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g
    public final boolean A23(long j, long j2, B0 b1, ByteBuffer byteBuffer, int i2, int i3, long j3, boolean z2, boolean z3) throws AD {
        if (this.A0D) {
            int i4 = i3 & 2;
            if (A0K[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[2] = "qFTZlqBsfbROWjHKIBaS9ttrRfnfHc6a";
            strArr[7] = "sZoZRvagNjZKK9rko7XS8oWwcuS8hqha";
            if (i4 != 0) {
                b1.AHi(i2, false);
                return true;
            }
        }
        if (z2) {
            b1.AHi(i2, false);
            if (A0K[5].charAt(0) != 'p') {
                String[] strArr2 = A0K;
                strArr2[4] = "i4U0xdeb2kJYTtTzacReJ5RV5axgIdhD";
                strArr2[0] = "rrPeATHc6C5SnSGUS9RZuIpTT0sGFjMh";
                this.A0h.A0B++;
                this.A0I.A9h();
                return true;
            }
            String[] strArr3 = A0K;
            strArr3[1] = "GzmR5b8Z6T6If0UBPoEMKvf6QjFSlvzk";
            strArr3[6] = "qLQdQ1juS6S8x5RB3mUlKTK412OZk0qd";
            this.A0h.A0B++;
            this.A0I.A9h();
            return true;
        }
        if (this.A0H && A01(this.A07) == 2 && i3 == 0 && this.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit();
            byteBuffer.position(10);
            short s = byteBuffer.getShort();
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            int i5 = this.A01;
            int iLimit2 = byteBuffer.limit();
            int originalPosition = byteBuffer.position();
            this.A01 = i5 + (iLimit2 - originalPosition);
            int i6 = this.A02;
            String[] strArr4 = A0K;
            String str = strArr4[4];
            String str2 = strArr4[0];
            int iCharAt = str.charAt(18);
            int originalPosition2 = str2.charAt(18);
            if (iCharAt != originalPosition2) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0K;
            strArr5[1] = "MwudhWWmLfAHxFUBWVuNAQ0R1ppnonhu";
            strArr5[6] = "h4oByFchRKdWl7IBcc7CSq20vr2fgRzF";
            this.A02 = i6 + 1;
            long j4 = this.A05;
            int originalPosition3 = Math.abs((int) s);
            this.A05 = j4 + ((long) originalPosition3);
            int i7 = this.A01;
            int originalPosition4 = this.A03;
            if (i7 >= originalPosition4 * 2) {
                this.A0F.A00((int) (this.A05 / ((long) this.A02)));
                this.A01 = 0;
                this.A02 = 0;
                this.A05 = 0L;
            }
        }
        if (this.A0G) {
            int iLimit3 = byteBuffer.limit();
            int originalPosition5 = byteBuffer.position();
            if (iLimit3 > originalPosition5) {
                int iPosition2 = byteBuffer.position();
                int iLimit4 = byteBuffer.limit();
                int originalPosition6 = iLimit4 - iPosition2;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(originalPosition6);
                byteBufferAllocate.put(byteBuffer);
                byteBufferAllocate.flip();
                byteBuffer.position(iPosition2);
                byteBuffer.limit(iLimit4);
                this.A0F.A0K(byteBufferAllocate.array(), j3 / 1000);
            }
        }
        try {
            if (!this.A0I.A9e(byteBuffer, j3, 1)) {
                return false;
            }
            b1.AHi(i2, false);
            this.A0h.A09++;
            return true;
        } catch (C12078t e2) {
            throw A1T(e2, this.A07, e2.A02, IronSourceConstants.errorCode_biddingDataException);
        } catch (C12108y e3) {
            throw A1T(e3, this.A0g, e3.A02, IronSourceConstants.errorCode_isReadyException);
        }
    }

    public final void A26() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.core.AE, com.facebook.ads.redexgen.core.InterfaceC2769oo
    public final AnonymousClass78 A8T() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final C2839px A8m() {
        return this.A0I.A8m();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final long A8p() {
        if (A9A() == 2) {
            A08();
        }
        long j = this.A04;
        String[] strArr = A0K;
        if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        A0K[5] = "p6YKYNxicnjzLIFANgsfPKErY7h8fvSp";
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.AE, com.facebook.ads.redexgen.core.InterfaceC11667c
    public final void A9i(int i2, Object obj) throws AD {
        switch (i2) {
            case 2:
                this.A0I.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.A0I.AJG((C2866qQ) obj);
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                super.A9i(i2, obj);
                return;
            case 6:
                this.A0I.AJI((AnonymousClass21) obj);
                return;
            case 9:
                this.A0I.AJo(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.A0I.AJH(((Integer) obj).intValue());
                return;
            case 11:
                this.A08 = null;
                return;
            case 12:
                if (C5C.A02 < 23) {
                    return;
                }
                InterfaceC12118z interfaceC12118z = this.A0I;
                if (A0K[3].length() != 28) {
                    throw new RuntimeException();
                }
                A0K[3] = "XCf3J2AEJJ1Zd2j3qAi6tezJ2mG7";
                C9S.A00(interfaceC12118z, obj);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g, com.facebook.ads.redexgen.core.InterfaceC2769oo
    public final boolean AAP() {
        return super.AAP() && this.A0I.AAP();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10181g, com.facebook.ads.redexgen.core.InterfaceC2769oo
    public final boolean AAe() {
        if (!this.A0I.A9o()) {
            boolean zAAe = super.AAe();
            if (A0K[5].charAt(0) != 'p') {
                throw new RuntimeException();
            }
            A0K[3] = "YZui0KIXZR8KzjI1EkPC1GaIUT4y";
            if (!zAAe) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final void AJd(C2839px c2839px) {
        this.A0I.AJd(c2839px);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2769oo, com.facebook.ads.redexgen.core.InterfaceC11797p
    public final String getName() {
        return A07(0, 23, 11);
    }
}
