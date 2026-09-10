package okio.internal;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.Options;
import okio.Segment;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Buffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f45168a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
        f45168a = bytes;
    }

    public static final boolean a(Segment segment, int i2, byte[] bArr, int i3) {
        int i4 = segment.f45159c;
        byte[] bArr2 = segment.f45157a;
        for (int i5 = 1; i5 < i3; i5++) {
            if (i2 == i4) {
                segment = segment.f;
                Intrinsics.c(segment);
                i2 = segment.f45158b;
                i4 = segment.f45159c;
                bArr2 = segment.f45157a;
            }
            if (bArr2[i2] != bArr[i5]) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static final String b(okio.Buffer buffer, long j) throws EOFException {
        Intrinsics.f(buffer, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.r(j2) == 13) {
                String string = buffer.readString(j2, Charsets.f44691a);
                buffer.skip(2L);
                return string;
            }
        }
        String string2 = buffer.readString(j, Charsets.f44691a);
        buffer.skip(1L);
        return string2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[LOOP:0: B:8:0x0021->B:48:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[SYNTHETIC] */
    public static final int c(okio.Buffer buffer, Options options, boolean z2) {
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        Segment segment;
        byte[] bArr2;
        int i5;
        Intrinsics.f(buffer, "<this>");
        Intrinsics.f(options, "options");
        Segment segment2 = buffer.X;
        if (segment2 == null) {
            return z2 ? -2 : -1;
        }
        int i6 = segment2.f45158b;
        int i7 = segment2.f45159c;
        byte[] bArr3 = segment2.f45157a;
        Segment segment3 = segment2;
        int i8 = -1;
        int i9 = 0;
        loop0: while (true) {
            int i10 = i9 + 1;
            int[] iArr = options.f45151Y;
            int i11 = iArr[i9];
            int i12 = i9 + 2;
            int i13 = iArr[i10];
            if (i13 != -1) {
                i8 = i13;
            }
            if (segment3 == null) {
                break;
            }
            if (i11 >= 0) {
                int i14 = i6 + 1;
                int i15 = bArr3[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i16 = i12 + i11;
                while (i12 != i16) {
                    if (i15 == iArr[i12]) {
                        i2 = iArr[i12 + i11];
                        if (i14 == i7) {
                            segment3 = segment3.f;
                            Intrinsics.c(segment3);
                            i4 = segment3.f45158b;
                            i3 = segment3.f45159c;
                            bArr = segment3.f45157a;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i3 = i7;
                            i4 = i14;
                        }
                        if (i2 >= 0) {
                            return i2;
                        }
                        byte[] bArr4 = bArr;
                        i9 = -i2;
                        i6 = i4;
                        i7 = i3;
                        bArr3 = bArr4;
                    } else {
                        i12++;
                    }
                }
                return i8;
            }
            int i17 = (i11 * (-1)) + i12;
            while (true) {
                int i18 = i6 + 1;
                int i19 = i12 + 1;
                if ((bArr3[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == iArr[i12]) {
                    boolean z3 = i19 == i17;
                    if (i18 == i7) {
                        Intrinsics.c(segment3);
                        Segment segment4 = segment3.f;
                        Intrinsics.c(segment4);
                        i5 = segment4.f45158b;
                        int i20 = segment4.f45159c;
                        bArr2 = segment4.f45157a;
                        if (segment4 != segment2) {
                            segment = segment4;
                            i7 = i20;
                        } else {
                            if (!z3) {
                                break loop0;
                            }
                            i7 = i20;
                            segment = null;
                        }
                    } else {
                        segment = segment3;
                        bArr2 = bArr3;
                        i5 = i18;
                    }
                    if (z3) {
                        i2 = iArr[i19];
                        int i21 = i5;
                        i3 = i7;
                        i4 = i21;
                        byte[] bArr5 = bArr2;
                        segment3 = segment;
                        bArr = bArr5;
                        break;
                    }
                    i6 = i5;
                    bArr3 = bArr2;
                    segment3 = segment;
                    i12 = i19;
                }
                return i8;
            }
            if (i2 >= 0) {
                return i2;
            }
            byte[] bArr6 = bArr;
            i9 = -i2;
            i6 = i4;
            i7 = i3;
            bArr3 = bArr6;
        }
        if (z2) {
            return -2;
        }
        return i8;
    }
}
