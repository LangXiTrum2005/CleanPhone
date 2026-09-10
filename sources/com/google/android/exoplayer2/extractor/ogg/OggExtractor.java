package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class OggExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExtractorOutput f17866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StreamReader f17867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17868c;

    public final boolean a(DefaultExtractorInput defaultExtractorInput) {
        boolean zD;
        OggPageHeader oggPageHeader = new OggPageHeader();
        if (oggPageHeader.a(defaultExtractorInput, true) && (oggPageHeader.f17873a & 2) == 2) {
            int iMin = Math.min(oggPageHeader.f17876e, 8);
            ParsableByteArray parsableByteArray = new ParsableByteArray(iMin);
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, iMin, false);
            parsableByteArray.F(0);
            if (parsableByteArray.a() >= 5 && parsableByteArray.u() == 127 && parsableByteArray.v() == 1179402563) {
                this.f17867b = new FlacReader();
                return true;
            }
            parsableByteArray.F(0);
            try {
                zD = VorbisUtil.d(1, parsableByteArray, true);
            } catch (ParserException unused) {
                zD = false;
            }
            if (zD) {
                this.f17867b = new VorbisReader();
            } else {
                parsableByteArray.F(0);
                if (OpusReader.e(parsableByteArray, OpusReader.o)) {
                    this.f17867b = new OpusReader();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) {
        try {
            return a((DefaultExtractorInput) extractorInput);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x016f  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        byte[] bArr;
        Assertions.e(this.f17866a);
        if (this.f17867b == null) {
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            if (!a(defaultExtractorInput)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            defaultExtractorInput.f = 0;
        }
        if (!this.f17868c) {
            TrackOutput trackOutputTrack = this.f17866a.track(0, 1);
            this.f17866a.endTracks();
            StreamReader streamReader = this.f17867b;
            streamReader.f17881c = this.f17866a;
            streamReader.f17880b = trackOutputTrack;
            streamReader.d(true);
            this.f17868c = true;
        }
        StreamReader streamReader2 = this.f17867b;
        Assertions.e(streamReader2.f17880b);
        int i2 = Util.f18979a;
        int i3 = streamReader2.f17883h;
        OggPacket oggPacket = streamReader2.f17879a;
        if (i3 != 0) {
            if (i3 == 1) {
                ((DefaultExtractorInput) extractorInput).skipFully((int) streamReader2.f);
                streamReader2.f17883h = 2;
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
                positionHolder.f17554a = jA;
                return 1;
            }
            if (jA < -1) {
                streamReader2.a(-(jA + 2));
            }
            if (!streamReader2.f17885l) {
                SeekMap seekMapCreateSeekMap = streamReader2.d.createSeekMap();
                Assertions.e(seekMapCreateSeekMap);
                streamReader2.f17881c.g(seekMapCreateSeekMap);
                streamReader2.f17885l = true;
            }
            if (streamReader2.k <= 0 && !oggPacket.b(defaultExtractorInput2)) {
                streamReader2.f17883h = 3;
                return -1;
            }
            streamReader2.k = 0L;
            ParsableByteArray parsableByteArray = oggPacket.f17870b;
            long jB = streamReader2.b(parsableByteArray);
            if (jB >= 0) {
                long j = streamReader2.g;
                if (j + jB >= streamReader2.f17882e) {
                    long j2 = (j * 1000000) / ((long) streamReader2.f17884i);
                    streamReader2.f17880b.e(parsableByteArray.f18958c, parsableByteArray);
                    streamReader2.f17880b.f(j2, 1, parsableByteArray.f18958c, 0, null);
                    streamReader2.f17882e = -1L;
                }
            }
            streamReader2.g += jB;
            return 0;
        }
        while (true) {
            DefaultExtractorInput defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
            if (!oggPacket.b(defaultExtractorInput3)) {
                streamReader2.f17883h = 3;
                return -1;
            }
            long j3 = defaultExtractorInput3.d;
            long j4 = streamReader2.f;
            streamReader2.k = j3 - j4;
            StreamReader.SetupData setupData = streamReader2.j;
            ParsableByteArray parsableByteArray2 = oggPacket.f17870b;
            if (!streamReader2.c(parsableByteArray2, j4, setupData)) {
                Format format = streamReader2.j.f17886a;
                streamReader2.f17884i = format.A0;
                if (!streamReader2.m) {
                    streamReader2.f17880b.c(format);
                    streamReader2.m = true;
                }
                FlacReader.FlacOggSeeker flacOggSeeker = streamReader2.j.f17887b;
                if (flacOggSeeker == null) {
                    long j5 = ((DefaultExtractorInput) extractorInput).f17527c;
                    if (j5 == -1) {
                        streamReader2.d = new StreamReader.UnseekableOggSeeker();
                    } else {
                        OggPageHeader oggPageHeader = oggPacket.f17869a;
                        streamReader2.d = new DefaultOggSeeker(streamReader2, streamReader2.f, j5, oggPageHeader.d + oggPageHeader.f17876e, oggPageHeader.f17874b, (oggPageHeader.f17873a & 4) != 0);
                    }
                    streamReader2.f17883h = 2;
                    bArr = parsableByteArray2.f18956a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    parsableByteArray2.D(Arrays.copyOf(bArr, Math.max(com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD, parsableByteArray2.f18958c)), parsableByteArray2.f18958c);
                    return 0;
                }
                streamReader2.d = flacOggSeeker;
                streamReader2.f17883h = 2;
                bArr = parsableByteArray2.f18956a;
                if (bArr.length == 65025) {
                    return 0;
                }
                parsableByteArray2.D(Arrays.copyOf(bArr, Math.max(com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD, parsableByteArray2.f18958c)), parsableByteArray2.f18958c);
                return 0;
            }
            streamReader2.f = ((DefaultExtractorInput) extractorInput).d;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17866a = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        StreamReader streamReader = this.f17867b;
        if (streamReader != null) {
            OggPacket oggPacket = streamReader.f17879a;
            OggPageHeader oggPageHeader = oggPacket.f17869a;
            oggPageHeader.f17873a = 0;
            oggPageHeader.f17874b = 0L;
            oggPageHeader.f17875c = 0;
            oggPageHeader.d = 0;
            oggPageHeader.f17876e = 0;
            oggPacket.f17870b.C(0);
            oggPacket.f17871c = -1;
            oggPacket.f17872e = false;
            if (j == 0) {
                streamReader.d(!streamReader.f17885l);
                return;
            }
            if (streamReader.f17883h != 0) {
                long j3 = (((long) streamReader.f17884i) * j2) / 1000000;
                streamReader.f17882e = j3;
                OggSeeker oggSeeker = streamReader.d;
                int i2 = Util.f18979a;
                oggSeeker.startSeek(j3);
                streamReader.f17883h = 2;
            }
        }
    }
}
