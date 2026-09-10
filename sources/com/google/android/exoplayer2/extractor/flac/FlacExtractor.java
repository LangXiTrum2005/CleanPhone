package com.google.android.exoplayer2.extractor.flac;

import A.C0880a0;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.Id3Peeker;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class FlacExtractor implements Extractor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExtractorOutput f17624e;
    public TrackOutput f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Metadata f17625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FlacStreamMetadata f17626i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FlacBinarySearchSeeker f17627l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17628n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17621a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17622b = new ParsableByteArray(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17623c = false;
    public final FlacFrameReader.SampleNumberHolder d = new FlacFrameReader.SampleNumberHolder();
    public int g = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        Metadata metadataA = new Id3Peeker().a(defaultExtractorInput, Id3Decoder.f18216b);
        if (metadataA != null) {
            int length = metadataA.X.length;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 4, false);
        return parsableByteArray.v() == 1716281667;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        Metadata metadata;
        SeekMap unseekable;
        long j;
        boolean z2;
        long j2;
        boolean zA;
        int i2 = this.g;
        Metadata metadata2 = null;
        int i3 = 0;
        if (i2 == 0) {
            ((DefaultExtractorInput) extractorInput).f = 0;
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            long peekPosition = defaultExtractorInput.getPeekPosition();
            Metadata metadataA = new Id3Peeker().a(defaultExtractorInput, !this.f17623c ? null : Id3Decoder.f18216b);
            if (metadataA != null && metadataA.X.length != 0) {
                metadata2 = metadataA;
            }
            defaultExtractorInput.skipFully((int) (defaultExtractorInput.getPeekPosition() - peekPosition));
            this.f17625h = metadata2;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.f17621a;
        if (i2 == 1) {
            ((DefaultExtractorInput) extractorInput).peekFully(bArr, 0, bArr.length, false);
            ((DefaultExtractorInput) extractorInput).f = 0;
            this.g = 2;
            return 0;
        }
        int i4 = 3;
        if (i2 == 2) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(4);
            ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f18956a, 0, 4, false);
            if (parsableByteArray.v() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i5 = 7;
        if (i2 == 3) {
            FlacStreamMetadata flacStreamMetadata = this.f17626i;
            FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder = new FlacMetadataReader.FlacStreamMetadataHolder();
            flacStreamMetadataHolder.f17534a = flacStreamMetadata;
            boolean z3 = false;
            while (!z3) {
                ((DefaultExtractorInput) extractorInput).f = 0;
                byte[] bArr2 = new byte[4];
                ParsableBitArray parsableBitArray = new ParsableBitArray(bArr2, 4);
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                defaultExtractorInput2.peekFully(bArr2, 0, 4, false);
                boolean zF = parsableBitArray.f();
                int iG = parsableBitArray.g(i5);
                int iG2 = parsableBitArray.g(24) + 4;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    defaultExtractorInput2.readFully(bArr3, 0, 38, false);
                    flacStreamMetadataHolder.f17534a = new FlacStreamMetadata(bArr3, 4);
                } else {
                    FlacStreamMetadata flacStreamMetadata2 = flacStreamMetadataHolder.f17534a;
                    if (flacStreamMetadata2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iG == i4) {
                        ParsableByteArray parsableByteArray2 = new ParsableByteArray(iG2);
                        defaultExtractorInput2.readFully(parsableByteArray2.f18956a, 0, iG2, false);
                        flacStreamMetadataHolder.f17534a = new FlacStreamMetadata(flacStreamMetadata2.f17537a, flacStreamMetadata2.f17538b, flacStreamMetadata2.f17539c, flacStreamMetadata2.d, flacStreamMetadata2.f17540e, flacStreamMetadata2.g, flacStreamMetadata2.f17541h, flacStreamMetadata2.j, FlacMetadataReader.a(parsableByteArray2), flacStreamMetadata2.f17543l);
                    } else {
                        Metadata metadataA2 = flacStreamMetadata2.f17543l;
                        if (iG == 4) {
                            ParsableByteArray parsableByteArray3 = new ParsableByteArray(iG2);
                            defaultExtractorInput2.readFully(parsableByteArray3.f18956a, 0, iG2, false);
                            parsableByteArray3.G(4);
                            Metadata metadataB = VorbisUtil.b(Arrays.asList(VorbisUtil.c(parsableByteArray3, false, false).f17572a));
                            if (metadataA2 == null) {
                                metadata = metadataB;
                            } else {
                                if (metadataB != null) {
                                    metadataA2 = metadataA2.a(metadataB.X);
                                }
                                metadata = metadataA2;
                            }
                            flacStreamMetadataHolder.f17534a = new FlacStreamMetadata(flacStreamMetadata2.f17537a, flacStreamMetadata2.f17538b, flacStreamMetadata2.f17539c, flacStreamMetadata2.d, flacStreamMetadata2.f17540e, flacStreamMetadata2.g, flacStreamMetadata2.f17541h, flacStreamMetadata2.j, flacStreamMetadata2.k, metadata);
                        } else if (iG == 6) {
                            ParsableByteArray parsableByteArray4 = new ParsableByteArray(iG2);
                            defaultExtractorInput2.readFully(parsableByteArray4.f18956a, 0, iG2, false);
                            parsableByteArray4.G(4);
                            Metadata metadata3 = new Metadata(ImmutableList.z(PictureFrame.a(parsableByteArray4)));
                            if (metadataA2 != null) {
                                metadata3 = metadataA2.a(metadata3.X);
                            }
                            flacStreamMetadataHolder.f17534a = new FlacStreamMetadata(flacStreamMetadata2.f17537a, flacStreamMetadata2.f17538b, flacStreamMetadata2.f17539c, flacStreamMetadata2.d, flacStreamMetadata2.f17540e, flacStreamMetadata2.g, flacStreamMetadata2.f17541h, flacStreamMetadata2.j, flacStreamMetadata2.k, metadata3);
                        } else {
                            defaultExtractorInput2.skipFully(iG2);
                        }
                    }
                }
                FlacStreamMetadata flacStreamMetadata3 = flacStreamMetadataHolder.f17534a;
                int i6 = Util.f18979a;
                this.f17626i = flacStreamMetadata3;
                z3 = zF;
                i4 = 3;
                i5 = 7;
            }
            this.f17626i.getClass();
            this.j = Math.max(this.f17626i.f17539c, 6);
            TrackOutput trackOutput = this.f;
            int i7 = Util.f18979a;
            trackOutput.c(this.f17626i.c(bArr, this.f17625h));
            this.g = 4;
            return 0;
        }
        if (i2 == 4) {
            ((DefaultExtractorInput) extractorInput).f = 0;
            ParsableByteArray parsableByteArray5 = new ParsableByteArray(2);
            DefaultExtractorInput defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput3.peekFully(parsableByteArray5.f18956a, 0, 2, false);
            int iZ = parsableByteArray5.z();
            if ((iZ >> 2) != 16382) {
                defaultExtractorInput3.f = 0;
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            defaultExtractorInput3.f = 0;
            this.k = iZ;
            ExtractorOutput extractorOutput = this.f17624e;
            int i8 = Util.f18979a;
            long j3 = defaultExtractorInput3.d;
            this.f17626i.getClass();
            FlacStreamMetadata flacStreamMetadata4 = this.f17626i;
            if (flacStreamMetadata4.k != null) {
                unseekable = new FlacSeekTableSeekMap(flacStreamMetadata4, j3);
                i3 = 0;
            } else {
                long j4 = defaultExtractorInput3.f17527c;
                if (j4 == -1 || flacStreamMetadata4.j <= 0) {
                    i3 = 0;
                    unseekable = new SeekMap.Unseekable(flacStreamMetadata4.b());
                } else {
                    int i9 = this.k;
                    C0880a0 c0880a0 = new C0880a0(flacStreamMetadata4, 11);
                    FlacBinarySearchSeeker.FlacTimestampSeeker flacTimestampSeeker = new FlacBinarySearchSeeker.FlacTimestampSeeker(flacStreamMetadata4, i9);
                    long jB = flacStreamMetadata4.b();
                    int i10 = flacStreamMetadata4.f17539c;
                    int i11 = flacStreamMetadata4.d;
                    if (i11 > 0) {
                        j = ((((long) i11) + ((long) i10)) / 2) + 1;
                    } else {
                        int i12 = flacStreamMetadata4.f17538b;
                        int i13 = flacStreamMetadata4.f17537a;
                        j = 64 + (((((i13 != i12 || i13 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i13) * ((long) flacStreamMetadata4.g)) * ((long) flacStreamMetadata4.f17541h)) / 8);
                    }
                    FlacBinarySearchSeeker flacBinarySearchSeeker = new FlacBinarySearchSeeker(c0880a0, flacTimestampSeeker, jB, flacStreamMetadata4.j, j3, j4, j, Math.max(6, i10));
                    this.f17627l = flacBinarySearchSeeker;
                    unseekable = flacBinarySearchSeeker.f17502a;
                }
            }
            extractorOutput.g(unseekable);
            this.g = 5;
            return i3;
        }
        if (i2 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.f17626i.getClass();
        FlacBinarySearchSeeker flacBinarySearchSeeker2 = this.f17627l;
        if (flacBinarySearchSeeker2 != null && flacBinarySearchSeeker2.f17504c != null) {
            return flacBinarySearchSeeker2.a((DefaultExtractorInput) extractorInput, positionHolder);
        }
        if (this.f17628n == -1) {
            FlacStreamMetadata flacStreamMetadata5 = this.f17626i;
            ((DefaultExtractorInput) extractorInput).f = 0;
            DefaultExtractorInput defaultExtractorInput4 = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput4.c(1, false);
            byte[] bArr4 = new byte[1];
            defaultExtractorInput4.peekFully(bArr4, 0, 1, false);
            boolean z4 = (bArr4[0] & 1) == 1;
            defaultExtractorInput4.c(2, false);
            i5 = z4 ? 7 : 6;
            ParsableByteArray parsableByteArray6 = new ParsableByteArray(i5);
            byte[] bArr5 = parsableByteArray6.f18956a;
            int i14 = 0;
            while (i14 < i5) {
                int iE = defaultExtractorInput4.e(i14, i5 - i14, bArr5);
                if (iE == -1) {
                    break;
                }
                i14 += iE;
            }
            parsableByteArray6.E(i14);
            defaultExtractorInput4.f = 0;
            try {
                long jA = parsableByteArray6.A();
                if (!z4) {
                    jA *= (long) flacStreamMetadata5.f17538b;
                }
                this.f17628n = jA;
                return 0;
            } catch (NumberFormatException unused) {
                throw ParserException.a(null, null);
            }
        }
        ParsableByteArray parsableByteArray7 = this.f17622b;
        int i15 = parsableByteArray7.f18958c;
        if (i15 < 32768) {
            int i16 = ((DefaultExtractorInput) extractorInput).read(parsableByteArray7.f18956a, i15, 32768 - i15);
            z2 = i16 == -1;
            if (!z2) {
                parsableByteArray7.E(i15 + i16);
            } else if (parsableByteArray7.a() == 0) {
                long j5 = this.f17628n * 1000000;
                FlacStreamMetadata flacStreamMetadata6 = this.f17626i;
                int i17 = Util.f18979a;
                this.f.f(j5 / ((long) flacStreamMetadata6.f17540e), 1, this.m, 0, null);
                return -1;
            }
        } else {
            z2 = false;
        }
        int i18 = parsableByteArray7.f18957b;
        int i19 = this.m;
        int i20 = this.j;
        if (i19 < i20) {
            parsableByteArray7.G(Math.min(i20 - i19, parsableByteArray7.a()));
        }
        this.f17626i.getClass();
        int i21 = parsableByteArray7.f18957b;
        while (true) {
            int i22 = parsableByteArray7.f18958c - 16;
            FlacFrameReader.SampleNumberHolder sampleNumberHolder = this.d;
            if (i21 > i22) {
                if (z2) {
                    while (true) {
                        int i23 = parsableByteArray7.f18958c;
                        if (i21 <= i23 - this.j) {
                            parsableByteArray7.F(i21);
                            try {
                                zA = FlacFrameReader.a(parsableByteArray7, this.f17626i, this.k, sampleNumberHolder);
                            } catch (IndexOutOfBoundsException unused2) {
                                zA = false;
                            }
                            if (parsableByteArray7.f18957b > parsableByteArray7.f18958c) {
                                zA = false;
                            }
                            if (zA) {
                                parsableByteArray7.F(i21);
                                j2 = sampleNumberHolder.f17533a;
                                break;
                            }
                            i21++;
                        } else {
                            parsableByteArray7.F(i23);
                        }
                    }
                } else {
                    parsableByteArray7.F(i21);
                }
                j2 = -1;
                break;
            }
            parsableByteArray7.F(i21);
            if (FlacFrameReader.a(parsableByteArray7, this.f17626i, this.k, sampleNumberHolder)) {
                parsableByteArray7.F(i21);
                j2 = sampleNumberHolder.f17533a;
                break;
            }
            i21++;
        }
        int i24 = parsableByteArray7.f18957b - i18;
        parsableByteArray7.F(i18);
        this.f.e(i24, parsableByteArray7);
        int i25 = this.m + i24;
        this.m = i25;
        if (j2 != -1) {
            long j6 = this.f17628n * 1000000;
            FlacStreamMetadata flacStreamMetadata7 = this.f17626i;
            int i26 = Util.f18979a;
            this.f.f(j6 / ((long) flacStreamMetadata7.f17540e), 1, i25, 0, null);
            this.m = 0;
            this.f17628n = j2;
        }
        if (parsableByteArray7.a() < 16) {
            int iA = parsableByteArray7.a();
            byte[] bArr6 = parsableByteArray7.f18956a;
            System.arraycopy(bArr6, parsableByteArray7.f18957b, bArr6, 0, iA);
            parsableByteArray7.F(0);
            parsableByteArray7.E(iA);
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17624e = extractorOutput;
        this.f = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            FlacBinarySearchSeeker flacBinarySearchSeeker = this.f17627l;
            if (flacBinarySearchSeeker != null) {
                flacBinarySearchSeeker.c(j2);
            }
        }
        this.f17628n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.f17622b.C(0);
    }
}
