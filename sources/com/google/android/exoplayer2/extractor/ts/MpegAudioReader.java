package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class MpegAudioReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f18025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MpegAudioUtil.Header f18026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18027c;
    public TrackOutput d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18028e;
    public int f = 0;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18030i;
    public long j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18031l;

    public MpegAudioReader(String str) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.f18025a = parsableByteArray;
        parsableByteArray.f18956a[0] = -1;
        this.f18026b = new MpegAudioUtil.Header();
        this.f18031l = -9223372036854775807L;
        this.f18027c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) {
        Assertions.e(this.d);
        while (parsableByteArray.a() > 0) {
            int i2 = this.f;
            ParsableByteArray parsableByteArray2 = this.f18025a;
            if (i2 == 0) {
                byte[] bArr = parsableByteArray.f18956a;
                int i3 = parsableByteArray.f18957b;
                int i4 = parsableByteArray.f18958c;
                while (true) {
                    if (i3 >= i4) {
                        parsableByteArray.F(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z2 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z3 = this.f18030i && (b2 & 224) == 224;
                    this.f18030i = z2;
                    if (z3) {
                        parsableByteArray.F(i3 + 1);
                        this.f18030i = false;
                        parsableByteArray2.f18956a[1] = bArr[i3];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int iMin = Math.min(parsableByteArray.a(), 4 - this.g);
                parsableByteArray.e(parsableByteArray2.f18956a, this.g, iMin);
                int i5 = this.g + iMin;
                this.g = i5;
                if (i5 >= 4) {
                    parsableByteArray2.F(0);
                    int iG = parsableByteArray2.g();
                    MpegAudioUtil.Header header = this.f18026b;
                    if (header.a(iG)) {
                        this.k = header.f17387c;
                        if (!this.f18029h) {
                            long j = ((long) header.g) * 1000000;
                            int i6 = header.d;
                            this.j = j / ((long) i6);
                            Format.Builder builder = new Format.Builder();
                            builder.f17081a = this.f18028e;
                            builder.k = header.f17386b;
                            builder.f17087l = 4096;
                            builder.x = header.f17388e;
                            builder.y = i6;
                            builder.f17083c = this.f18027c;
                            this.d.c(new Format(builder));
                            this.f18029h = true;
                        }
                        parsableByteArray2.F(0);
                        this.d.e(4, parsableByteArray2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(parsableByteArray.a(), this.k - this.g);
                this.d.e(iMin2, parsableByteArray);
                int i7 = this.g + iMin2;
                this.g = i7;
                int i8 = this.k;
                if (i7 >= i8) {
                    long j2 = this.f18031l;
                    if (j2 != -9223372036854775807L) {
                        this.d.f(j2, 1, i8, 0, null);
                        this.f18031l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if (j != -9223372036854775807L) {
            this.f18031l = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f18028e = trackIdGenerator.f18100e;
        trackIdGenerator.b();
        this.d = extractorOutput.track(trackIdGenerator.d, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f = 0;
        this.g = 0;
        this.f18030i = false;
        this.f18031l = -9223372036854775807L;
    }
}
