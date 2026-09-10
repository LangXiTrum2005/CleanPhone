package com.applovin.shadow.okio;

import an.p;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wi.d;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0080\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u001b\u001a \u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u0011\u001a \u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001b\u001a7\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0012H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010&\u001a\u00020%*\u00020\nH\u0000¢\u0006\u0004\b&\u0010(\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010)\u001a\u0017\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010,\u001a\u00020\n*\u00020.2\u0006\u0010/\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u00100\u001a\u001b\u0010,\u001a\u00020\n*\u00020\u001f2\u0006\u00101\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u00102\" \u00103\u001a\u00020*8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106\"\u001a\u00109\u001a\u00020\n8\u0000X\u0080D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"", "size", "offset", "byteCount", "Lwj/r;", "checkOffsetAndCount", "(JJJ)V", "", "reverseBytes", "(S)S", "", "(I)I", "(J)J", "bitCount", "leftRotate", "(II)I", "rightRotate", "(JI)J", "", "other", "shr", "(BI)I", "shl", "and", "(BJ)J", "xor", "(BB)B", "(IJ)J", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "minOf", "", "aOffset", "bOffset", "", "arrayRangeEquals", "([BI[BII)Z", "", "toHexString", "(B)Ljava/lang/String;", "(I)Ljava/lang/String;", "(J)Ljava/lang/String;", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "unsafeCursor", "resolveDefaultParameter", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "Lcom/applovin/shadow/okio/ByteString;", X3.i.L, "(Lcom/applovin/shadow/okio/ByteString;I)I", "sizeParam", "([BI)I", "DEFAULT__new_UnsafeCursor", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()Ljava/lang/Object;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__ByteString_size", "I", "getDEFAULT__ByteString_size", "()I", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SegmentedByteString {
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static final boolean arrayRangeEquals(byte[] a8, int i10, byte[] b10, int i11, int i12) {
        n.f(a8, "a");
        n.f(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a8[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbL = d.l(j10, "size=", " offset=");
            sbL.append(j11);
            throw new ArrayIndexOutOfBoundsException(e.s(sbL, " byteCount=", j12));
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static final int leftRotate(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static final long minOf(long j10, int i10) {
        return Math.min(j10, i10);
    }

    public static final Buffer.UnsafeCursor resolveDefaultParameter(Buffer.UnsafeCursor unsafeCursor) {
        n.f(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long rightRotate(long j10, int i10) {
        return (j10 << (64 - i10)) | (j10 >>> i10);
    }

    public static final int shl(byte b10, int i10) {
        return b10 << i10;
    }

    public static final int shr(byte b10, int i10) {
        return b10 >> i10;
    }

    public static final String toHexString(byte b10) {
        return new String(new char[]{com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15]});
    }

    public static final byte xor(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    public static final long and(byte b10, long j10) {
        return ((long) b10) & j10;
    }

    public static final long minOf(int i10, long j10) {
        return Math.min(i10, j10);
    }

    public static final int resolveDefaultParameter(ByteString byteString, int i10) {
        n.f(byteString, "<this>");
        return i10 == DEFAULT__ByteString_size ? byteString.size() : i10;
    }

    public static final long reverseBytes(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final long and(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final int resolveDefaultParameter(byte[] bArr, int i10) {
        n.f(bArr, "<this>");
        return i10 == DEFAULT__ByteString_size ? bArr.length : i10;
    }

    public static final short reverseBytes(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String toHexString(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 28) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 24) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 20) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 16) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 12) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 8) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 4) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return p.g0(cArr, i11, 8);
    }

    public static final String toHexString(long j10) {
        if (j10 == 0) {
            return "0";
        }
        int i10 = 0;
        char[] cArr = {com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 60) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 56) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 52) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 48) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 44) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 40) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 36) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 32) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 28) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 24) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 20) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 16) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 12) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 8) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 4) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j10 & 15)]};
        while (i10 < 16 && cArr[i10] == '0') {
            i10++;
        }
        return p.g0(cArr, i10, 16);
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }
}
