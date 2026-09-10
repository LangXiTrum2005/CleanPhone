package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisUtil;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class OggExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExtractorOutput f7175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StreamReader f7176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7177c;

    public final boolean a(DefaultExtractorInput defaultExtractorInput) {
        boolean zD;
        OggPageHeader oggPageHeader = new OggPageHeader();
        if (oggPageHeader.a(defaultExtractorInput, true) && (oggPageHeader.f7182a & 2) == 2) {
            int iMin = Math.min(oggPageHeader.f7185e, 8);
            ParsableByteArray parsableByteArray = new ParsableByteArray(iMin);
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, iMin, false);
            parsableByteArray.G(0);
            if (parsableByteArray.a() >= 5 && parsableByteArray.u() == 127 && parsableByteArray.w() == 1179402563) {
                this.f7176b = new FlacReader();
                return true;
            }
            parsableByteArray.G(0);
            try {
                zD = VorbisUtil.d(1, parsableByteArray, true);
            } catch (ParserException unused) {
                zD = false;
            }
            if (zD) {
                this.f7176b = new VorbisReader();
            } else {
                parsableByteArray.G(0);
                if (OpusReader.e(parsableByteArray, OpusReader.o)) {
                    this.f7176b = new OpusReader();
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        try {
            return a((DefaultExtractorInput) extractorInput);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f7175a = extractorOutput;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x016f  */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        byte[] bArr;
        Assertions.f(this.f7175a);
        if (this.f7176b == null) {
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            if (!a(defaultExtractorInput)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            defaultExtractorInput.f = 0;
        }
        if (!this.f7177c) {
            TrackOutput trackOutputTrack = this.f7175a.track(0, 1);
            this.f7175a.endTracks();
            StreamReader streamReader = this.f7176b;
            streamReader.f7190c = this.f7175a;
            streamReader.f7189b = trackOutputTrack;
            streamReader.d(true);
            this.f7177c = true;
        }
        StreamReader streamReader2 = this.f7176b;
        Assertions.f(streamReader2.f7189b);
        int i2 = Util.f5683a;
        int i3 = streamReader2.f7192h;
        OggPacket oggPacket = streamReader2.f7188a;
        if (i3 != 0) {
            if (i3 == 1) {
                ((DefaultExtractorInput) extractorInput).skipFully((int) streamReader2.f);
                streamReader2.f7192h = 2;
                return 0;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
            long jA = streamReader2.d.a(defaultExtractorInput2);
            if (jA >= 0) {
                positionHolder.f6793a = jA;
                return 1;
            }
            if (jA < -1) {
                streamReader2.a(-(jA + 2));
            }
            if (!streamReader2.f7194l) {
                SeekMap seekMapCreateSeekMap = streamReader2.d.createSeekMap();
                Assertions.f(seekMapCreateSeekMap);
                streamReader2.f7190c.e(seekMapCreateSeekMap);
                streamReader2.f7194l = true;
            }
            if (streamReader2.k <= 0 && !oggPacket.b(defaultExtractorInput2)) {
                streamReader2.f7192h = 3;
                return -1;
            }
            streamReader2.k = 0L;
            ParsableByteArray parsableByteArray = oggPacket.f7179b;
            long jB = streamReader2.b(parsableByteArray);
            if (jB >= 0) {
                long j = streamReader2.g;
                if (j + jB >= streamReader2.f7191e) {
                    long j2 = (j * 1000000) / ((long) streamReader2.f7193i);
                    streamReader2.f7189b.e(parsableByteArray.f5669c, parsableByteArray);
                    streamReader2.f7189b.f(j2, 1, parsableByteArray.f5669c, 0, null);
                    streamReader2.f7191e = -1L;
                }
            }
            streamReader2.g += jB;
            return 0;
        }
        while (true) {
            DefaultExtractorInput defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
            if (!oggPacket.b(defaultExtractorInput3)) {
                streamReader2.f7192h = 3;
                return -1;
            }
            long j3 = defaultExtractorInput3.d;
            long j4 = streamReader2.f;
            streamReader2.k = j3 - j4;
            StreamReader.SetupData setupData = streamReader2.j;
            ParsableByteArray parsableByteArray2 = oggPacket.f7179b;
            if (!streamReader2.c(parsableByteArray2, j4, setupData)) {
                Format format = streamReader2.j.f7195a;
                streamReader2.f7193i = format.f5401B;
                if (!streamReader2.m) {
                    streamReader2.f7189b.b(format);
                    streamReader2.m = true;
                }
                FlacReader.FlacOggSeeker flacOggSeeker = streamReader2.j.f7196b;
                if (flacOggSeeker == null) {
                    long j5 = ((DefaultExtractorInput) extractorInput).f6741c;
                    if (j5 == -1) {
                        streamReader2.d = new StreamReader.UnseekableOggSeeker();
                    } else {
                        OggPageHeader oggPageHeader = oggPacket.f7178a;
                        streamReader2.d = new DefaultOggSeeker(streamReader2, streamReader2.f, j5, oggPageHeader.d + oggPageHeader.f7185e, oggPageHeader.f7183b, (oggPageHeader.f7182a & 4) != 0);
                    }
                    streamReader2.f7192h = 2;
                    bArr = parsableByteArray2.f5667a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    parsableByteArray2.E(Arrays.copyOf(bArr, Math.max(com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD, parsableByteArray2.f5669c)), parsableByteArray2.f5669c);
                    return 0;
                }
                streamReader2.d = flacOggSeeker;
                streamReader2.f7192h = 2;
                bArr = parsableByteArray2.f5667a;
                if (bArr.length == 65025) {
                    return 0;
                }
                parsableByteArray2.E(Arrays.copyOf(bArr, Math.max(com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD, parsableByteArray2.f5669c)), parsableByteArray2.f5669c);
                return 0;
            }
            streamReader2.f = ((DefaultExtractorInput) extractorInput).d;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        StreamReader streamReader = this.f7176b;
        if (streamReader != null) {
            OggPacket oggPacket = streamReader.f7188a;
            OggPageHeader oggPageHeader = oggPacket.f7178a;
            oggPageHeader.f7182a = 0;
            oggPageHeader.f7183b = 0L;
            oggPageHeader.f7184c = 0;
            oggPageHeader.d = 0;
            oggPageHeader.f7185e = 0;
            oggPacket.f7179b.D(0);
            oggPacket.f7180c = -1;
            oggPacket.f7181e = false;
            if (j == 0) {
                streamReader.d(!streamReader.f7194l);
                return;
            }
            if (streamReader.f7192h != 0) {
                long j3 = (((long) streamReader.f7193i) * j2) / 1000000;
                streamReader.f7191e = j3;
                OggSeeker oggSeeker = streamReader.d;
                int i2 = Util.f5683a;
                oggSeeker.startSeek(j3);
                streamReader.f7192h = 2;
            }
        }
    }
}
