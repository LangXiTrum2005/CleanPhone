package androidx.media3.extractor.flac;

import A.C0880a0;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacMetadataReader;
import androidx.media3.extractor.FlacSeekTableSeekMap;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class FlacExtractor implements Extractor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExtractorOutput f6871e;
    public TrackOutput f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Metadata f6872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FlacStreamMetadata f6873i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FlacBinarySearchSeeker f6874l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6875n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6868a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f6869b = new ParsableByteArray(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6870c = false;
    public final FlacFrameReader.SampleNumberHolder d = new FlacFrameReader.SampleNumberHolder();
    public int g = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws Throwable {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        Metadata metadataA = new Id3Peeker().a(defaultExtractorInput, Id3Decoder.f6932b);
        if (metadataA != null) {
            int length = metadataA.X.length;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
        return parsableByteArray.w() == 1716281667;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f6871e = extractorOutput;
        this.f = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws Throwable {
        SeekMap unseekable;
        long j;
        boolean z2;
        long j2;
        boolean zA;
        int i2 = 1;
        int i3 = this.g;
        Metadata metadata = null;
        int i4 = 0;
        if (i3 == 0) {
            ((DefaultExtractorInput) extractorInput).f = 0;
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            long peekPosition = defaultExtractorInput.getPeekPosition();
            Metadata metadataA = new Id3Peeker().a(defaultExtractorInput, !this.f6870c ? null : Id3Decoder.f6932b);
            if (metadataA != null && metadataA.X.length != 0) {
                metadata = metadataA;
            }
            defaultExtractorInput.skipFully((int) (defaultExtractorInput.getPeekPosition() - peekPosition));
            this.f6872h = metadata;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.f6868a;
        if (i3 == 1) {
            ((DefaultExtractorInput) extractorInput).peekFully(bArr, 0, bArr.length, false);
            ((DefaultExtractorInput) extractorInput).f = 0;
            this.g = 2;
            return 0;
        }
        int i5 = 3;
        if (i3 == 2) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(4);
            ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f5667a, 0, 4, false);
            if (parsableByteArray.w() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i6 = 7;
        if (i3 == 3) {
            FlacStreamMetadata flacStreamMetadata = this.f6873i;
            FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder = new FlacMetadataReader.FlacStreamMetadataHolder();
            flacStreamMetadataHolder.f6758a = flacStreamMetadata;
            boolean z3 = false;
            while (!z3) {
                ((DefaultExtractorInput) extractorInput).f = 0;
                byte[] bArr2 = new byte[4];
                ParsableBitArray parsableBitArray = new ParsableBitArray(bArr2, 4);
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                defaultExtractorInput2.peekFully(bArr2, 0, 4, false);
                boolean zF = parsableBitArray.f();
                int iG = parsableBitArray.g(i6);
                int iG2 = parsableBitArray.g(24) + 4;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    defaultExtractorInput2.readFully(bArr3, 0, 38, false);
                    flacStreamMetadataHolder.f6758a = new FlacStreamMetadata(bArr3, 4);
                } else {
                    FlacStreamMetadata flacStreamMetadata2 = flacStreamMetadataHolder.f6758a;
                    if (flacStreamMetadata2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iG == i5) {
                        ParsableByteArray parsableByteArray2 = new ParsableByteArray(iG2);
                        defaultExtractorInput2.readFully(parsableByteArray2.f5667a, 0, iG2, false);
                        flacStreamMetadataHolder.f6758a = new FlacStreamMetadata(flacStreamMetadata2.f6761a, flacStreamMetadata2.f6762b, flacStreamMetadata2.f6763c, flacStreamMetadata2.d, flacStreamMetadata2.f6764e, flacStreamMetadata2.g, flacStreamMetadata2.f6765h, flacStreamMetadata2.j, FlacMetadataReader.a(parsableByteArray2), flacStreamMetadata2.f6767l);
                    } else {
                        Metadata metadata2 = flacStreamMetadata2.f6767l;
                        if (iG == 4) {
                            ParsableByteArray parsableByteArray3 = new ParsableByteArray(iG2);
                            defaultExtractorInput2.readFully(parsableByteArray3.f5667a, 0, iG2, false);
                            parsableByteArray3.H(4);
                            Metadata metadataB = VorbisUtil.b(Arrays.asList(VorbisUtil.c(parsableByteArray3, false, false).f6815a));
                            if (metadata2 != null) {
                                metadataB = metadata2.b(metadataB);
                            }
                            flacStreamMetadataHolder.f6758a = new FlacStreamMetadata(flacStreamMetadata2.f6761a, flacStreamMetadata2.f6762b, flacStreamMetadata2.f6763c, flacStreamMetadata2.d, flacStreamMetadata2.f6764e, flacStreamMetadata2.g, flacStreamMetadata2.f6765h, flacStreamMetadata2.j, flacStreamMetadata2.k, metadataB);
                        } else if (iG == 6) {
                            ParsableByteArray parsableByteArray4 = new ParsableByteArray(iG2);
                            defaultExtractorInput2.readFully(parsableByteArray4.f5667a, 0, iG2, false);
                            parsableByteArray4.H(4);
                            Metadata metadata3 = new Metadata(ImmutableList.z(PictureFrame.a(parsableByteArray4)));
                            if (metadata2 != null) {
                                metadata3 = metadata2.b(metadata3);
                            }
                            flacStreamMetadataHolder.f6758a = new FlacStreamMetadata(flacStreamMetadata2.f6761a, flacStreamMetadata2.f6762b, flacStreamMetadata2.f6763c, flacStreamMetadata2.d, flacStreamMetadata2.f6764e, flacStreamMetadata2.g, flacStreamMetadata2.f6765h, flacStreamMetadata2.j, flacStreamMetadata2.k, metadata3);
                        } else {
                            defaultExtractorInput2.skipFully(iG2);
                        }
                    }
                }
                FlacStreamMetadata flacStreamMetadata3 = flacStreamMetadataHolder.f6758a;
                int i7 = Util.f5683a;
                this.f6873i = flacStreamMetadata3;
                z3 = zF;
                i5 = 3;
                i6 = 7;
            }
            this.f6873i.getClass();
            this.j = Math.max(this.f6873i.f6763c, 6);
            TrackOutput trackOutput = this.f;
            int i8 = Util.f5683a;
            trackOutput.b(this.f6873i.c(bArr, this.f6872h));
            this.g = 4;
            return 0;
        }
        if (i3 == 4) {
            ((DefaultExtractorInput) extractorInput).f = 0;
            ParsableByteArray parsableByteArray5 = new ParsableByteArray(2);
            DefaultExtractorInput defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput3.peekFully(parsableByteArray5.f5667a, 0, 2, false);
            int iA = parsableByteArray5.A();
            if ((iA >> 2) != 16382) {
                defaultExtractorInput3.f = 0;
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            defaultExtractorInput3.f = 0;
            this.k = iA;
            ExtractorOutput extractorOutput = this.f6871e;
            int i9 = Util.f5683a;
            long j3 = defaultExtractorInput3.d;
            this.f6873i.getClass();
            FlacStreamMetadata flacStreamMetadata4 = this.f6873i;
            if (flacStreamMetadata4.k != null) {
                unseekable = new FlacSeekTableSeekMap(flacStreamMetadata4, j3);
                i4 = 0;
            } else {
                long j4 = defaultExtractorInput3.f6741c;
                if (j4 == -1 || flacStreamMetadata4.j <= 0) {
                    i4 = 0;
                    unseekable = new SeekMap.Unseekable(flacStreamMetadata4.b());
                } else {
                    int i10 = this.k;
                    C0880a0 c0880a0 = new C0880a0(flacStreamMetadata4, i2);
                    FlacBinarySearchSeeker.FlacTimestampSeeker flacTimestampSeeker = new FlacBinarySearchSeeker.FlacTimestampSeeker(flacStreamMetadata4, i10);
                    long jB = flacStreamMetadata4.b();
                    int i11 = flacStreamMetadata4.f6763c;
                    int i12 = flacStreamMetadata4.d;
                    if (i12 > 0) {
                        j = ((((long) i12) + ((long) i11)) / 2) + 1;
                    } else {
                        int i13 = flacStreamMetadata4.f6762b;
                        int i14 = flacStreamMetadata4.f6761a;
                        j = 64 + (((((i14 != i13 || i14 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i14) * ((long) flacStreamMetadata4.g)) * ((long) flacStreamMetadata4.f6765h)) / 8);
                    }
                    FlacBinarySearchSeeker flacBinarySearchSeeker = new FlacBinarySearchSeeker(c0880a0, flacTimestampSeeker, jB, flacStreamMetadata4.j, j3, j4, j, Math.max(6, i11));
                    this.f6874l = flacBinarySearchSeeker;
                    unseekable = flacBinarySearchSeeker.f6716a;
                }
            }
            extractorOutput.e(unseekable);
            this.g = 5;
            return i4;
        }
        if (i3 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.f6873i.getClass();
        FlacBinarySearchSeeker flacBinarySearchSeeker2 = this.f6874l;
        if (flacBinarySearchSeeker2 != null && flacBinarySearchSeeker2.f6718c != null) {
            return flacBinarySearchSeeker2.a((DefaultExtractorInput) extractorInput, positionHolder);
        }
        if (this.f6875n == -1) {
            FlacStreamMetadata flacStreamMetadata5 = this.f6873i;
            ((DefaultExtractorInput) extractorInput).f = 0;
            DefaultExtractorInput defaultExtractorInput4 = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput4.c(1, false);
            byte[] bArr4 = new byte[1];
            defaultExtractorInput4.peekFully(bArr4, 0, 1, false);
            i2 = (bArr4[0] & 1) != 1 ? 0 : 1;
            defaultExtractorInput4.c(2, false);
            i6 = i2 == 0 ? 6 : 7;
            ParsableByteArray parsableByteArray6 = new ParsableByteArray(i6);
            byte[] bArr5 = parsableByteArray6.f5667a;
            int i15 = 0;
            while (i15 < i6) {
                int iE = defaultExtractorInput4.e(i15, i6 - i15, bArr5);
                if (iE == -1) {
                    break;
                }
                i15 += iE;
            }
            parsableByteArray6.F(i15);
            defaultExtractorInput4.f = 0;
            try {
                long jB2 = parsableByteArray6.B();
                if (i2 == 0) {
                    jB2 *= (long) flacStreamMetadata5.f6762b;
                }
                this.f6875n = jB2;
                return 0;
            } catch (NumberFormatException unused) {
                throw ParserException.a(null, null);
            }
        }
        ParsableByteArray parsableByteArray7 = this.f6869b;
        int i16 = parsableByteArray7.f5669c;
        if (i16 < 32768) {
            int i17 = ((DefaultExtractorInput) extractorInput).read(parsableByteArray7.f5667a, i16, 32768 - i16);
            z2 = i17 == -1;
            if (!z2) {
                parsableByteArray7.F(i16 + i17);
            } else if (parsableByteArray7.a() == 0) {
                long j5 = this.f6875n * 1000000;
                FlacStreamMetadata flacStreamMetadata6 = this.f6873i;
                int i18 = Util.f5683a;
                this.f.f(j5 / ((long) flacStreamMetadata6.f6764e), 1, this.m, 0, null);
                return -1;
            }
        } else {
            z2 = false;
        }
        int i19 = parsableByteArray7.f5668b;
        int i20 = this.m;
        int i21 = this.j;
        if (i20 < i21) {
            parsableByteArray7.H(Math.min(i21 - i20, parsableByteArray7.a()));
        }
        this.f6873i.getClass();
        int i22 = parsableByteArray7.f5668b;
        while (true) {
            int i23 = parsableByteArray7.f5669c - 16;
            FlacFrameReader.SampleNumberHolder sampleNumberHolder = this.d;
            if (i22 > i23) {
                if (z2) {
                    while (true) {
                        int i24 = parsableByteArray7.f5669c;
                        if (i22 <= i24 - this.j) {
                            parsableByteArray7.G(i22);
                            try {
                                zA = FlacFrameReader.a(parsableByteArray7, this.f6873i, this.k, sampleNumberHolder);
                            } catch (IndexOutOfBoundsException unused2) {
                                zA = false;
                            }
                            if (parsableByteArray7.f5668b > parsableByteArray7.f5669c) {
                                zA = false;
                            }
                            if (zA) {
                                parsableByteArray7.G(i22);
                                j2 = sampleNumberHolder.f6757a;
                                break;
                            }
                            i22++;
                        } else {
                            parsableByteArray7.G(i24);
                        }
                    }
                } else {
                    parsableByteArray7.G(i22);
                }
                j2 = -1;
                break;
            }
            parsableByteArray7.G(i22);
            if (FlacFrameReader.a(parsableByteArray7, this.f6873i, this.k, sampleNumberHolder)) {
                parsableByteArray7.G(i22);
                j2 = sampleNumberHolder.f6757a;
                break;
            }
            i22++;
        }
        int i25 = parsableByteArray7.f5668b - i19;
        parsableByteArray7.G(i19);
        this.f.e(i25, parsableByteArray7);
        int i26 = this.m + i25;
        this.m = i26;
        if (j2 != -1) {
            long j6 = this.f6875n * 1000000;
            FlacStreamMetadata flacStreamMetadata7 = this.f6873i;
            int i27 = Util.f5683a;
            this.f.f(j6 / ((long) flacStreamMetadata7.f6764e), 1, i26, 0, null);
            this.m = 0;
            this.f6875n = j2;
        }
        if (parsableByteArray7.a() < 16) {
            int iA2 = parsableByteArray7.a();
            byte[] bArr6 = parsableByteArray7.f5667a;
            System.arraycopy(bArr6, parsableByteArray7.f5668b, bArr6, 0, iA2);
            parsableByteArray7.G(0);
            parsableByteArray7.F(iA2);
        }
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            FlacBinarySearchSeeker flacBinarySearchSeeker = this.f6874l;
            if (flacBinarySearchSeeker != null) {
                flacBinarySearchSeeker.c(j2);
            }
        }
        this.f6875n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.f6869b.D(0);
    }
}
