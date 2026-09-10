package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class FlacStreamMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17539c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17540e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17542i;
    public final long j;
    public final SeekTable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Metadata f17543l;

    public static class SeekTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f17544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f17545b;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.f17544a = jArr;
            this.f17545b = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i2) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, bArr.length);
        parsableBitArray.l(i2 * 8);
        this.f17537a = parsableBitArray.g(16);
        this.f17538b = parsableBitArray.g(16);
        this.f17539c = parsableBitArray.g(24);
        this.d = parsableBitArray.g(24);
        int iG = parsableBitArray.g(20);
        this.f17540e = iG;
        this.f = d(iG);
        this.g = parsableBitArray.g(3) + 1;
        int iG2 = parsableBitArray.g(5) + 1;
        this.f17541h = iG2;
        this.f17542i = a(iG2);
        int iG3 = parsableBitArray.g(4);
        int iG4 = parsableBitArray.g(32);
        int i3 = Util.f18979a;
        this.j = ((((long) iG3) & 4294967295L) << 32) | (((long) iG4) & 4294967295L);
        this.k = null;
        this.f17543l = null;
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
        return (j * 1000000) / ((long) this.f17540e);
    }

    public final Format c(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i2 = this.d;
        if (i2 <= 0) {
            i2 = -1;
        }
        Metadata metadata2 = this.f17543l;
        if (metadata2 != null) {
            metadata = metadata == null ? metadata2 : metadata2.a(metadata.X);
        }
        Format.Builder builder = new Format.Builder();
        builder.k = "audio/flac";
        builder.f17087l = i2;
        builder.x = this.g;
        builder.y = this.f17540e;
        builder.m = Collections.singletonList(bArr);
        builder.f17086i = metadata;
        return new Format(builder);
    }

    public FlacStreamMetadata(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, SeekTable seekTable, Metadata metadata) {
        this.f17537a = i2;
        this.f17538b = i3;
        this.f17539c = i4;
        this.d = i5;
        this.f17540e = i6;
        this.f = d(i6);
        this.g = i7;
        this.f17541h = i8;
        this.f17542i = a(i8);
        this.j = j;
        this.k = seekTable;
        this.f17543l = metadata;
    }
}
