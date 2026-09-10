package androidx.media3.extractor;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.Util;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class FlacStreamMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6763c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6764e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6766i;
    public final long j;
    public final SeekTable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Metadata f6767l;

    public static class SeekTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f6768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f6769b;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.f6768a = jArr;
            this.f6769b = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i2) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, bArr.length);
        parsableBitArray.m(i2 * 8);
        this.f6761a = parsableBitArray.g(16);
        this.f6762b = parsableBitArray.g(16);
        this.f6763c = parsableBitArray.g(24);
        this.d = parsableBitArray.g(24);
        int iG = parsableBitArray.g(20);
        this.f6764e = iG;
        this.f = d(iG);
        this.g = parsableBitArray.g(3) + 1;
        int iG2 = parsableBitArray.g(5) + 1;
        this.f6765h = iG2;
        this.f6766i = a(iG2);
        this.j = parsableBitArray.i(36);
        this.k = null;
        this.f6767l = null;
    }

    public static int a(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f6764e);
    }

    public final Format c(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i2 = this.d;
        if (i2 <= 0) {
            i2 = -1;
        }
        Metadata metadata2 = this.f6767l;
        if (metadata2 != null) {
            metadata = metadata2.b(metadata);
        }
        Format.Builder builder = new Format.Builder();
        builder.f5429l = MimeTypes.l("audio/flac");
        builder.m = i2;
        builder.f5434z = this.g;
        builder.f5418A = this.f6764e;
        builder.f5419B = Util.w(this.f6765h);
        builder.o = Collections.singletonList(bArr);
        builder.j = metadata;
        return new Format(builder);
    }

    public FlacStreamMetadata(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, SeekTable seekTable, Metadata metadata) {
        this.f6761a = i2;
        this.f6762b = i3;
        this.f6763c = i4;
        this.d = i5;
        this.f6764e = i6;
        this.f = d(i6);
        this.g = i7;
        this.f6765h = i8;
        this.f6766i = a(i8);
        this.j = j;
        this.k = seekTable;
        this.f6767l = metadata;
    }
}
