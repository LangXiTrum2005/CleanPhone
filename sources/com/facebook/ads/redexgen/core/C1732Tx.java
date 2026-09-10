package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.dto.AdCookieData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.smartdigimkt.o1.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1732Tx {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AdPlacementType A0B;
    public boolean A0D;

    @Nullable
    public List<AdCookieData> A0C = null;
    public final long A0E = System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0056  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C1732Tx(Map<String, String> map) {
        byte b2;
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = A0G;
        this.A03 = 1;
        this.A0A = 0;
        this.A04 = 0;
        this.A05 = 20;
        this.A08 = 0;
        this.A09 = 1000;
        this.A06 = 10000;
        this.A07 = 200;
        this.A02 = b.l2;
        this.A0D = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -1561601017:
                    if (key.equals(A01(105, 17, 37))) {
                        b2 = 4;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -856794442:
                    if (key.equals(A01(199, 26, 14))) {
                        b2 = 10;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -726276175:
                    if (key.equals(A01(122, 15, 32))) {
                        b2 = 11;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -634541425:
                    if (key.equals(A01(9, 32, 26))) {
                        b2 = 5;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -553208868:
                    if (key.equals(A01(0, 9, 14))) {
                        b2 = 6;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 3575610:
                    if (key.equals(A01(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 4, 34))) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 700812481:
                    if (key.equals(A01(41, 26, 71))) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 858630459:
                    if (key.equals(A01(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 24, 119))) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 986744879:
                    if (key.equals(A01(141, 27, 79))) {
                        b2 = 12;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1085444827:
                    if (key.equals(A01(98, 7, 46))) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1183549815:
                    if (key.equals(A01(168, 31, 41))) {
                        b2 = 9;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1503616961:
                    if (key.equals(A01(67, 16, 88))) {
                        b2 = 8;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 2002133996:
                    if (key.equals(A01(83, 15, 52))) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    this.A0B = AdPlacementType.fromString(entry.getValue());
                    break;
                case 1:
                    this.A03 = Integer.parseInt(entry.getValue());
                    break;
                case 2:
                    this.A0A = Integer.parseInt(entry.getValue());
                    break;
                case 3:
                    this.A04 = Integer.parseInt(entry.getValue());
                    break;
                case 4:
                    this.A05 = Integer.parseInt(entry.getValue());
                    break;
                case 5:
                    this.A02 = Integer.parseInt(entry.getValue());
                    break;
                case 6:
                    this.A0D = Boolean.valueOf(entry.getValue()).booleanValue();
                    break;
                case 7:
                    this.A01 = Integer.parseInt(entry.getValue());
                    break;
                case 8:
                    this.A00 = Integer.parseInt(entry.getValue());
                    break;
                case 9:
                    this.A08 = Integer.parseInt(entry.getValue());
                    break;
                case 10:
                    this.A09 = Integer.parseInt(entry.getValue());
                    break;
                case 11:
                    this.A06 = Integer.parseInt(entry.getValue());
                    break;
                case 12:
                    try {
                        this.A07 = Integer.parseInt(entry.getValue());
                    } catch (NumberFormatException unused) {
                        this.A07 = 200;
                    }
                    break;
            }
        }
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{67, 65, 67, 72, 69, 65, 66, 76, 69, 93, 90, 66, 85, 88, 93, 80, 85, 64, 93, 91, 90, 107, 80, 65, 70, 85, 64, 93, 91, 90, 107, 93, 90, 107, 71, 81, 87, 91, 90, 80, 71, 4, 0, 7, 54, 31, 0, 12, 30, 8, 11, 0, 5, 0, 29, 16, 54, 25, 12, 27, 10, 12, 7, 29, 8, 14, 12, 6, 26, 23, 21, 19, 27, 19, 24, 2, 41, 30, 19, 31, 17, 30, 2, 106, 118, 123, 121, AbstractJsonLexerKt.TC_INVALID, 119, AbstractJsonLexerKt.TC_INVALID, 116, 110, 69, 109, 115, 126, 110, 114, 114, 101, 102, 114, 101, 115, 104, 121, 110, 109, 121, 110, 120, 99, 84, AbstractJsonLexerKt.TC_INVALID, 99, 121, 110, 120, 99, 100, 103, 111, 124, 107, AbstractJsonLexerKt.TC_INVALID, 123, 107, 125, 122, 81, 122, 103, 99, 107, 97, 123, 122, 120, 117, 124, 105, 23, 8, 5, 4, 14, 62, 21, 8, 12, 4, 62, 17, 14, 13, 13, 8, 15, 6, 62, 8, 15, 21, 4, 19, 23, 0, 13, 113, 110, 98, 112, 102, 101, 110, 107, 110, 115, 126, 88, 100, 111, 98, 100, 108, 88, 110, 105, 110, 115, 110, 102, 107, 88, 99, 98, 107, 102, 126, 86, 73, 69, 87, 65, 66, 73, 76, 73, 84, 89, AbstractJsonLexerKt.TC_INVALID, 67, 72, 69, 67, 75, AbstractJsonLexerKt.TC_INVALID, 73, 78, 84, 69, 82, 86, 65, 76, 47, 48, 60, 46, 56, 59, 48, 53, 48, 45, 32, 6, 58, 49, 60, 58, 50, 6, 45, 48, 58, 50, 60, 43};
    }

    static {
        A02();
        A0H = C1732Tx.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    @Nullable
    public static C1732Tx A00(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return new C1732Tx(map);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
