package duvetyn;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0018*\u00020\nH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010\"\u001a\u00020\n*\u00020\u000f2\u0006\u0010!\u001a\u00020\nH\u0000¢\u0006\u0004\b\"\u0010#\" \u0010*\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'\"\u001a\u0010.\u001a\u00020\n8\u0000X\u0080D¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"", "size", "offset", "byteCount", "", "saneness", "(JJJ)V", "", "impromptu", "(S)S", "", "beachfront", "(I)I", "competently", "(J)J", "", "a", "aOffset", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "bOffset", "", "attabal", "([BI[BII)Z", "", "", "taiyuan", "(B)Ljava/lang/String;", "cutely", "(I)Ljava/lang/String;", "Lokio/ByteString;", X3.i.L, "wireman", "(Lokio/ByteString;I)I", "sizeParam", "marial", "([BI)I", "Lduvetyn/wireman$attabal;", "Lduvetyn/wireman$attabal;", "getDEFAULT__new_UnsafeCursor", "()Lduvetyn/wireman$attabal;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__new_UnsafeCursor", "I", "dern", "()I", "DEFAULT__ByteString_size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman.attabal f25391attabal = new wireman.attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f25392saneness = -1234567890;

    public static final boolean attabal(byte[] a, int i, byte[] b, int i2, int i3) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final int beachfront(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long competently(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final String cutely(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {okio.internal.saneness.beachfront()[(i >> 28) & 15], okio.internal.saneness.beachfront()[(i >> 24) & 15], okio.internal.saneness.beachfront()[(i >> 20) & 15], okio.internal.saneness.beachfront()[(i >> 16) & 15], okio.internal.saneness.beachfront()[(i >> 12) & 15], okio.internal.saneness.beachfront()[(i >> 8) & 15], okio.internal.saneness.beachfront()[(i >> 4) & 15], okio.internal.saneness.beachfront()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return p002kotlin.text.dovishness.gintrap(cArr, i2, 8);
    }

    public static final int dern() {
        return f25392saneness;
    }

    public static final short impromptu(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static final int marial(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i == f25392saneness ? bArr.length : i;
    }

    public static final void saneness(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final String taiyuan(byte b) {
        return p002kotlin.text.dovishness.dovishness(new char[]{okio.internal.saneness.beachfront()[(b >> 4) & 15], okio.internal.saneness.beachfront()[b & 15]});
    }

    public static final int wireman(ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return i == f25392saneness ? byteString.size() : i;
    }
}
