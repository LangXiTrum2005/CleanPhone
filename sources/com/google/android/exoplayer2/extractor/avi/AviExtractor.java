package com.google.android.exoplayer2.extractor.avi;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.DummyExtractorOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class AviExtractor implements Extractor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17589c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AviMainHeaderChunk f17590e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ChunkReader f17592i;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17594n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f17587a = new ParsableByteArray(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChunkHeaderHolder f17588b = new ChunkHeaderHolder();
    public ExtractorOutput d = new DummyExtractorOutput();
    public ChunkReader[] g = new ChunkReader[0];
    public long k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17593l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    public class AviSeekMap implements SeekMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17595a;

        public AviSeekMap(long j) {
            this.f17595a = j;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public final long getDurationUs() {
            return this.f17595a;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            AviExtractor aviExtractor = AviExtractor.this;
            SeekMap.SeekPoints seekPointsB = aviExtractor.g[0].b(j);
            int i2 = 1;
            while (true) {
                ChunkReader[] chunkReaderArr = aviExtractor.g;
                if (i2 >= chunkReaderArr.length) {
                    return seekPointsB;
                }
                SeekMap.SeekPoints seekPointsB2 = chunkReaderArr[i2].b(j);
                if (seekPointsB2.f17555a.f17561b < seekPointsB.f17555a.f17561b) {
                    seekPointsB = seekPointsB2;
                }
                i2++;
            }
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public final boolean isSeekable() {
            return true;
        }
    }

    public static class ChunkHeaderHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17599c;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = this.f17587a;
        ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray.f18956a, 0, 12, false);
        parsableByteArray.F(0);
        if (parsableByteArray.i() == 1179011410) {
            parsableByteArray.G(4);
            if (parsableByteArray.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x037b  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        boolean z2;
        ChunkReader chunkReader;
        long j;
        int i2;
        ChunkReader chunkReader2;
        long j2 = this.f17591h;
        int i3 = 0;
        if (j2 != -1) {
            long j3 = ((DefaultExtractorInput) extractorInput).d;
            if (j2 < j3 || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + j3) {
                positionHolder.f17554a = j2;
                z2 = true;
            } else {
                ((DefaultExtractorInput) extractorInput).skipFully((int) (j2 - j3));
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.f17591h = -1L;
        if (z2) {
            return 1;
        }
        int i4 = this.f17589c;
        ChunkReader chunkReader3 = null;
        ChunkHeaderHolder chunkHeaderHolder = this.f17588b;
        int i5 = 2;
        ParsableByteArray parsableByteArray = this.f17587a;
        switch (i4) {
            case 0:
                if (!b(extractorInput)) {
                    throw ParserException.a(null, "AVI Header List not found");
                }
                ((DefaultExtractorInput) extractorInput).skipFully(12);
                this.f17589c = 1;
                return 0;
            case 1:
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f18956a, 0, 12, false);
                parsableByteArray.F(0);
                chunkHeaderHolder.getClass();
                chunkHeaderHolder.f17597a = parsableByteArray.i();
                chunkHeaderHolder.f17598b = parsableByteArray.i();
                chunkHeaderHolder.f17599c = 0;
                if (chunkHeaderHolder.f17597a != 1414744396) {
                    throw ParserException.a(null, "LIST expected, found: " + chunkHeaderHolder.f17597a);
                }
                int i6 = parsableByteArray.i();
                chunkHeaderHolder.f17599c = i6;
                if (i6 == 1819436136) {
                    this.j = chunkHeaderHolder.f17598b;
                    this.f17589c = 2;
                    return 0;
                }
                throw ParserException.a(null, "hdrl expected, found: " + chunkHeaderHolder.f17599c);
            case 2:
                int i7 = this.j - 4;
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(i7);
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray2.f18956a, 0, i7, false);
                ListChunk listChunkB = ListChunk.b(1819436136, parsableByteArray2);
                int i8 = listChunkB.f17615b;
                if (i8 != 1819436136) {
                    throw ParserException.a(null, "Unexpected header list type " + i8);
                }
                AviMainHeaderChunk aviMainHeaderChunk = (AviMainHeaderChunk) listChunkB.a(AviMainHeaderChunk.class);
                if (aviMainHeaderChunk == null) {
                    throw ParserException.a(null, "AviHeader not found");
                }
                this.f17590e = aviMainHeaderChunk;
                this.f = ((long) aviMainHeaderChunk.f17602c) * ((long) aviMainHeaderChunk.f17600a);
                ArrayList arrayList = new ArrayList();
                UnmodifiableListIterator unmodifiableListIteratorListIterator = listChunkB.f17614a.listIterator(0);
                int i9 = 0;
                while (unmodifiableListIteratorListIterator.hasNext()) {
                    AviChunk aviChunk = (AviChunk) unmodifiableListIteratorListIterator.next();
                    if (aviChunk.getType() == 1819440243) {
                        ListChunk listChunk = (ListChunk) aviChunk;
                        int i10 = i9 + 1;
                        AviStreamHeaderChunk aviStreamHeaderChunk = (AviStreamHeaderChunk) listChunk.a(AviStreamHeaderChunk.class);
                        StreamFormatChunk streamFormatChunk = (StreamFormatChunk) listChunk.a(StreamFormatChunk.class);
                        if (aviStreamHeaderChunk == null) {
                            Log.g("AviExtractor", "Missing Stream Header");
                        } else if (streamFormatChunk == null) {
                            Log.g("AviExtractor", "Missing Stream Format");
                        } else {
                            long jF = Util.F(aviStreamHeaderChunk.d, ((long) aviStreamHeaderChunk.f17604b) * 1000000, aviStreamHeaderChunk.f17605c);
                            Format format = streamFormatChunk.f17616a;
                            Format.Builder builderA = format.a();
                            builderA.f17081a = Integer.toString(i9);
                            int i11 = aviStreamHeaderChunk.f17606e;
                            if (i11 != 0) {
                                builderA.f17087l = i11;
                            }
                            StreamNameChunk streamNameChunk = (StreamNameChunk) listChunk.a(StreamNameChunk.class);
                            if (streamNameChunk != null) {
                                builderA.f17082b = streamNameChunk.f17617a;
                            }
                            int iF = MimeTypes.f(format.m0);
                            if (iF == 1 || iF == i5) {
                                TrackOutput trackOutputTrack = this.d.track(i9, iF);
                                trackOutputTrack.c(new Format(builderA));
                                chunkReader = new ChunkReader(i9, iF, jF, aviStreamHeaderChunk.d, trackOutputTrack);
                                this.f = jF;
                            }
                            if (chunkReader != null) {
                                arrayList.add(chunkReader);
                            }
                            i9 = i10;
                        }
                        chunkReader = null;
                        if (chunkReader != null) {
                            arrayList.add(chunkReader);
                        }
                        i9 = i10;
                    }
                    i5 = 2;
                }
                this.g = (ChunkReader[]) arrayList.toArray(new ChunkReader[0]);
                this.d.endTracks();
                this.f17589c = 3;
                return 0;
            case 3:
                long j4 = this.k;
                if (j4 != -1 && ((DefaultExtractorInput) extractorInput).d != j4) {
                    this.f17591h = j4;
                    return 0;
                }
                ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray.f18956a, 0, 12, false);
                DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                defaultExtractorInput.f = 0;
                parsableByteArray.F(0);
                chunkHeaderHolder.getClass();
                chunkHeaderHolder.f17597a = parsableByteArray.i();
                chunkHeaderHolder.f17598b = parsableByteArray.i();
                chunkHeaderHolder.f17599c = 0;
                int i12 = parsableByteArray.i();
                int i13 = chunkHeaderHolder.f17597a;
                if (i13 == 1179011410) {
                    defaultExtractorInput.skipFully(12);
                    return 0;
                }
                if (i13 != 1414744396 || i12 != 1769369453) {
                    this.f17591h = defaultExtractorInput.d + ((long) chunkHeaderHolder.f17598b) + 8;
                    return 0;
                }
                long j5 = defaultExtractorInput.d;
                this.k = j5;
                this.f17593l = j5 + ((long) chunkHeaderHolder.f17598b) + 8;
                if (!this.f17594n) {
                    AviMainHeaderChunk aviMainHeaderChunk2 = this.f17590e;
                    aviMainHeaderChunk2.getClass();
                    if ((aviMainHeaderChunk2.f17601b & 16) == 16) {
                        this.f17589c = 4;
                        this.f17591h = this.f17593l;
                        return 0;
                    }
                    this.d.g(new SeekMap.Unseekable(this.f));
                    this.f17594n = true;
                }
                this.f17591h = defaultExtractorInput.d + 12;
                this.f17589c = 6;
                return 0;
            case 4:
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f18956a, 0, 8, false);
                parsableByteArray.F(0);
                int i14 = parsableByteArray.i();
                int i15 = parsableByteArray.i();
                if (i14 != 829973609) {
                    this.f17591h = ((DefaultExtractorInput) extractorInput).d + ((long) i15);
                    return 0;
                }
                this.f17589c = 5;
                this.m = i15;
                return 0;
            case 5:
                ParsableByteArray parsableByteArray3 = new ParsableByteArray(this.m);
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray3.f18956a, 0, this.m, false);
                if (parsableByteArray3.a() < 16) {
                    j = 0;
                } else {
                    int i16 = parsableByteArray3.f18957b;
                    parsableByteArray3.G(8);
                    long jI = parsableByteArray3.i();
                    long j6 = this.k;
                    j = jI > j6 ? 0L : j6 + 8;
                    parsableByteArray3.F(i16);
                }
                while (parsableByteArray3.a() >= 16) {
                    int i17 = parsableByteArray3.i();
                    int i18 = parsableByteArray3.i();
                    long jI2 = ((long) parsableByteArray3.i()) + j;
                    parsableByteArray3.i();
                    ChunkReader[] chunkReaderArr = this.g;
                    int length = chunkReaderArr.length;
                    int i19 = i3;
                    while (true) {
                        if (i19 < length) {
                            chunkReader2 = chunkReaderArr[i19];
                            i2 = i3;
                            if (chunkReader2.f17608b != i17 && chunkReader2.f17609c != i17) {
                                i19++;
                                i3 = i2;
                            }
                        } else {
                            i2 = i3;
                            chunkReader2 = null;
                        }
                    }
                    if (chunkReader2 != null) {
                        if ((i18 & 16) == 16) {
                            if (chunkReader2.j == chunkReader2.f17613l.length) {
                                long[] jArr = chunkReader2.k;
                                chunkReader2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = chunkReader2.f17613l;
                                chunkReader2.f17613l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = chunkReader2.k;
                            int i20 = chunkReader2.j;
                            jArr2[i20] = jI2;
                            chunkReader2.f17613l[i20] = chunkReader2.f17612i;
                            chunkReader2.j = i20 + 1;
                        }
                        chunkReader2.f17612i++;
                    }
                    i3 = i2;
                }
                int i21 = i3;
                ChunkReader[] chunkReaderArr2 = this.g;
                int length2 = chunkReaderArr2.length;
                for (int i22 = i21; i22 < length2; i22++) {
                    ChunkReader chunkReader4 = chunkReaderArr2[i22];
                    chunkReader4.k = Arrays.copyOf(chunkReader4.k, chunkReader4.j);
                    chunkReader4.f17613l = Arrays.copyOf(chunkReader4.f17613l, chunkReader4.j);
                }
                this.f17594n = true;
                this.d.g(new AviSeekMap(this.f));
                this.f17589c = 6;
                this.f17591h = this.k;
                return i21;
            case 6:
                if (((DefaultExtractorInput) extractorInput).d >= this.f17593l) {
                    return -1;
                }
                ChunkReader chunkReader5 = this.f17592i;
                if (chunkReader5 != null) {
                    int i23 = chunkReader5.g;
                    int iD = i23 - chunkReader5.f17607a.d(extractorInput, i23, false);
                    chunkReader5.g = iD;
                    boolean z3 = iD == 0;
                    if (z3) {
                        if (chunkReader5.f > 0) {
                            int i24 = chunkReader5.f17611h;
                            chunkReader5.f17607a.f((chunkReader5.d * ((long) i24)) / ((long) chunkReader5.f17610e), Arrays.binarySearch(chunkReader5.f17613l, i24) >= 0 ? 1 : 0, chunkReader5.f, 0, null);
                        }
                        chunkReader5.f17611h++;
                    }
                    if (z3) {
                        this.f17592i = null;
                    }
                    return 0;
                }
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                if ((defaultExtractorInput2.d & 1) == 1) {
                    defaultExtractorInput2.skipFully(1);
                }
                defaultExtractorInput2.peekFully(parsableByteArray.f18956a, 0, 12, false);
                parsableByteArray.F(0);
                int i25 = parsableByteArray.i();
                if (i25 == 1414744396) {
                    parsableByteArray.F(8);
                    defaultExtractorInput2.skipFully(parsableByteArray.i() == 1769369453 ? 12 : 8);
                    defaultExtractorInput2.f = 0;
                    return 0;
                }
                int i26 = parsableByteArray.i();
                if (i25 == 1263424842) {
                    this.f17591h = defaultExtractorInput2.d + ((long) i26) + 8;
                    return 0;
                }
                defaultExtractorInput2.skipFully(8);
                defaultExtractorInput2.f = 0;
                for (ChunkReader chunkReader6 : this.g) {
                    if (chunkReader6.f17608b == i25 || chunkReader6.f17609c == i25) {
                        chunkReader3 = chunkReader6;
                        if (chunkReader3 == null) {
                            this.f17591h = defaultExtractorInput2.d + ((long) i26);
                            return 0;
                        }
                        chunkReader3.f = i26;
                        chunkReader3.g = i26;
                        this.f17592i = chunkReader3;
                        return 0;
                    }
                }
                if (chunkReader3 == null) {
                    this.f17591h = defaultExtractorInput2.d + ((long) i26);
                    return 0;
                }
                chunkReader3.f = i26;
                chunkReader3.g = i26;
                this.f17592i = chunkReader3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17589c = 0;
        this.d = extractorOutput;
        this.f17591h = -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f17591h = -1L;
        this.f17592i = null;
        for (ChunkReader chunkReader : this.g) {
            if (chunkReader.j == 0) {
                chunkReader.f17611h = 0;
            } else {
                chunkReader.f17611h = chunkReader.f17613l[Util.f(chunkReader.k, j, true)];
            }
        }
        if (j != 0) {
            this.f17589c = 6;
        } else if (this.g.length == 0) {
            this.f17589c = 0;
        } else {
            this.f17589c = 3;
        }
    }
}
