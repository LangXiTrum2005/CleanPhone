package okio.internal;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.D1;
import duvetyn.oilcan;
import duvetyn.rotuma;
import duvetyn.seminary;
import java.io.EOFException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\" \u0010\u001b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001c"}, d2 = {"Lduvetyn/oilcan;", D1.i, "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "saneness", "(Lduvetyn/oilcan;I[BII)Z", "Lduvetyn/wireman;", "", "newline", "", "dern", "(Lduvetyn/wireman;J)Ljava/lang/String;", "Lduvetyn/rotuma;", "options", "selectTruncated", "wireman", "(Lduvetyn/wireman;Lduvetyn/rotuma;Z)I", "attabal", "[B", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "HEX_DIGIT_BYTES", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final byte[] f34737attabal = seminary.attabal("0123456789abcdef");

    public static final byte[] attabal() {
        return f34737attabal;
    }

    public static final String dern(duvetyn.wireman wiremanVar, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (wiremanVar.cuirassed(j2) == 13) {
                String utf8 = wiremanVar.readUtf8(j2);
                wiremanVar.skip(2L);
                return utf8;
            }
        }
        String utf9 = wiremanVar.readUtf8(j);
        wiremanVar.skip(1L);
        return utf9;
    }

    public static /* synthetic */ int marial(duvetyn.wireman wiremanVar, rotuma rotumaVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return wireman(wiremanVar, rotumaVar, z);
    }

    public static final boolean saneness(oilcan segment, int i, byte[] bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i4 = segment.limit;
        byte[] bArr = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                Intrinsics.beachfront(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int wireman(duvetyn.wireman wiremanVar, rotuma options, boolean z) {
        int i;
        int i2;
        oilcan oilcanVar;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        oilcan oilcanVar2 = wiremanVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String;
        if (oilcanVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = oilcanVar2.data;
        int i5 = oilcanVar2.pos;
        int i6 = oilcanVar2.limit;
        int[] trie$okio = options.getTrie();
        oilcan oilcanVar3 = oilcanVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = trie$okio[i8];
            int i11 = i8 + 2;
            int i12 = trie$okio[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (oilcanVar3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == trie$okio[i11]) {
                        i2 = trie$okio[i11 + i10];
                        if (i == i6) {
                            oilcanVar3 = oilcanVar3.next;
                            Intrinsics.beachfront(oilcanVar3);
                            i = oilcanVar3.pos;
                            bArr = oilcanVar3.data;
                            i6 = oilcanVar3.limit;
                            if (oilcanVar3 == oilcanVar2) {
                                oilcanVar3 = null;
                            }
                        }
                        if (i2 >= 0) {
                            return i2;
                        }
                        i8 = -i2;
                        i5 = i;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i15 = i11 + (i10 * (-1));
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == trie$okio[i11]) {
                    boolean z2 = i17 == i15;
                    if (i16 == i6) {
                        Intrinsics.beachfront(oilcanVar3);
                        oilcan oilcanVar4 = oilcanVar3.next;
                        Intrinsics.beachfront(oilcanVar4);
                        i4 = oilcanVar4.pos;
                        byte[] bArr2 = oilcanVar4.data;
                        i3 = oilcanVar4.limit;
                        if (oilcanVar4 != oilcanVar2) {
                            oilcanVar = oilcanVar4;
                            bArr = bArr2;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            oilcanVar = null;
                        }
                    } else {
                        oilcanVar = oilcanVar3;
                        i3 = i6;
                        i4 = i16;
                    }
                    if (z2) {
                        i2 = trie$okio[i17];
                        i = i4;
                        i6 = i3;
                        oilcanVar3 = oilcanVar;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    oilcanVar3 = oilcanVar;
                    i11 = i17;
                }
                return i7;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
