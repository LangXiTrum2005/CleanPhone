package androidx.media3.extractor.avi;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AviExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f6830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChunkHeaderHolder f6831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6832c;
    public final DefaultSubtitleParserFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6833e;
    public ExtractorOutput f;
    public AviMainHeaderChunk g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ChunkReader[] f6835i;
    public long j;
    public ChunkReader k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6836l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6837n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6838p;

    public class AviSeekMap implements SeekMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6839a;

        public AviSeekMap(long j) {
            this.f6839a = j;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            return this.f6839a;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            AviExtractor aviExtractor = AviExtractor.this;
            SeekMap.SeekPoints seekPointsB = aviExtractor.f6835i[0].b(j);
            int i2 = 1;
            while (true) {
                ChunkReader[] chunkReaderArr = aviExtractor.f6835i;
                if (i2 >= chunkReaderArr.length) {
                    return seekPointsB;
                }
                SeekMap.SeekPoints seekPointsB2 = chunkReaderArr[i2].b(j);
                if (seekPointsB2.f6794a.f6800b < seekPointsB.f6794a.f6800b) {
                    seekPointsB = seekPointsB2;
                }
                i2++;
            }
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            return true;
        }
    }

    public static class ChunkHeaderHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6843c;
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AviExtractor(int i2, DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
        this.d = defaultSubtitleParserFactory;
        this.f6832c = (i2 & 1) == 0;
        this.f6830a = new ParsableByteArray(12);
        this.f6831b = new ChunkHeaderHolder();
        this.f = new NoOpExtractorOutput();
        this.f6835i = new ChunkReader[0];
        this.m = -1L;
        this.f6837n = -1L;
        this.f6836l = -1;
        this.f6834h = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = this.f6830a;
        ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray.f5667a, 0, 12, false);
        parsableByteArray.G(0);
        if (parsableByteArray.i() == 1179011410) {
            parsableByteArray.H(4);
            if (parsableByteArray.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f6833e = 0;
        if (this.f6832c) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.d);
        }
        this.f = extractorOutput;
        this.j = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0383  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        boolean z2;
        ChunkReader chunkReader;
        long j;
        int i2;
        ChunkReader chunkReader2;
        long j2 = this.j;
        int i3 = 0;
        if (j2 != -1) {
            long j3 = ((DefaultExtractorInput) extractorInput).d;
            if (j2 < j3 || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + j3) {
                positionHolder.f6793a = j2;
                z2 = true;
            } else {
                ((DefaultExtractorInput) extractorInput).skipFully((int) (j2 - j3));
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.j = -1L;
        if (z2) {
            return 1;
        }
        int i4 = this.f6833e;
        ChunkReader chunkReader3 = null;
        ChunkHeaderHolder chunkHeaderHolder = this.f6831b;
        int i5 = 2;
        ParsableByteArray parsableByteArray = this.f6830a;
        switch (i4) {
            case 0:
                if (!c(extractorInput)) {
                    throw ParserException.a(null, "AVI Header List not found");
                }
                ((DefaultExtractorInput) extractorInput).skipFully(12);
                this.f6833e = 1;
                return 0;
            case 1:
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f5667a, 0, 12, false);
                parsableByteArray.G(0);
                chunkHeaderHolder.getClass();
                chunkHeaderHolder.f6841a = parsableByteArray.i();
                chunkHeaderHolder.f6842b = parsableByteArray.i();
                chunkHeaderHolder.f6843c = 0;
                if (chunkHeaderHolder.f6841a != 1414744396) {
                    throw ParserException.a(null, "LIST expected, found: " + chunkHeaderHolder.f6841a);
                }
                int i6 = parsableByteArray.i();
                chunkHeaderHolder.f6843c = i6;
                if (i6 == 1819436136) {
                    this.f6836l = chunkHeaderHolder.f6842b;
                    this.f6833e = 2;
                    return 0;
                }
                throw ParserException.a(null, "hdrl expected, found: " + chunkHeaderHolder.f6843c);
            case 2:
                int i7 = this.f6836l - 4;
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(i7);
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray2.f5667a, 0, i7, false);
                ListChunk listChunkB = ListChunk.b(1819436136, parsableByteArray2);
                int i8 = listChunkB.f6859b;
                if (i8 != 1819436136) {
                    throw ParserException.a(null, "Unexpected header list type " + i8);
                }
                AviMainHeaderChunk aviMainHeaderChunk = (AviMainHeaderChunk) listChunkB.a(AviMainHeaderChunk.class);
                if (aviMainHeaderChunk == null) {
                    throw ParserException.a(null, "AviHeader not found");
                }
                this.g = aviMainHeaderChunk;
                this.f6834h = ((long) aviMainHeaderChunk.f6846c) * ((long) aviMainHeaderChunk.f6844a);
                ArrayList arrayList = new ArrayList();
                UnmodifiableListIterator unmodifiableListIteratorListIterator = listChunkB.f6858a.listIterator(0);
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
                            long j4 = aviStreamHeaderChunk.d;
                            long j5 = ((long) aviStreamHeaderChunk.f6848b) * 1000000;
                            long j6 = aviStreamHeaderChunk.f6849c;
                            int i11 = Util.f5683a;
                            long jO = Util.O(j4, j5, j6, RoundingMode.FLOOR);
                            Format format = streamFormatChunk.f6860a;
                            Format.Builder builderA = format.a();
                            builderA.f5423a = Integer.toString(i9);
                            int i12 = aviStreamHeaderChunk.f6850e;
                            if (i12 != 0) {
                                builderA.m = i12;
                            }
                            StreamNameChunk streamNameChunk = (StreamNameChunk) listChunk.a(StreamNameChunk.class);
                            if (streamNameChunk != null) {
                                builderA.f5424b = streamNameChunk.f6861a;
                            }
                            int iG = MimeTypes.g(format.m);
                            if (iG == 1 || iG == i5) {
                                TrackOutput trackOutputTrack = this.f.track(i9, iG);
                                trackOutputTrack.b(new Format(builderA));
                                chunkReader = new ChunkReader(i9, iG, jO, aviStreamHeaderChunk.d, trackOutputTrack);
                                this.f6834h = jO;
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
                this.f6835i = (ChunkReader[]) arrayList.toArray(new ChunkReader[0]);
                this.f.endTracks();
                this.f6833e = 3;
                return 0;
            case 3:
                long j7 = this.m;
                if (j7 != -1 && ((DefaultExtractorInput) extractorInput).d != j7) {
                    this.j = j7;
                    return 0;
                }
                ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray.f5667a, 0, 12, false);
                DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                defaultExtractorInput.f = 0;
                parsableByteArray.G(0);
                chunkHeaderHolder.getClass();
                chunkHeaderHolder.f6841a = parsableByteArray.i();
                chunkHeaderHolder.f6842b = parsableByteArray.i();
                chunkHeaderHolder.f6843c = 0;
                int i13 = parsableByteArray.i();
                int i14 = chunkHeaderHolder.f6841a;
                if (i14 == 1179011410) {
                    defaultExtractorInput.skipFully(12);
                    return 0;
                }
                if (i14 != 1414744396 || i13 != 1769369453) {
                    this.j = defaultExtractorInput.d + ((long) chunkHeaderHolder.f6842b) + 8;
                    return 0;
                }
                long j8 = defaultExtractorInput.d;
                this.m = j8;
                this.f6837n = j8 + ((long) chunkHeaderHolder.f6842b) + 8;
                if (!this.f6838p) {
                    AviMainHeaderChunk aviMainHeaderChunk2 = this.g;
                    aviMainHeaderChunk2.getClass();
                    if ((aviMainHeaderChunk2.f6845b & 16) == 16) {
                        this.f6833e = 4;
                        this.j = this.f6837n;
                        return 0;
                    }
                    this.f.e(new SeekMap.Unseekable(this.f6834h));
                    this.f6838p = true;
                }
                this.j = defaultExtractorInput.d + 12;
                this.f6833e = 6;
                return 0;
            case 4:
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f5667a, 0, 8, false);
                parsableByteArray.G(0);
                int i15 = parsableByteArray.i();
                int i16 = parsableByteArray.i();
                if (i15 != 829973609) {
                    this.j = ((DefaultExtractorInput) extractorInput).d + ((long) i16);
                    return 0;
                }
                this.f6833e = 5;
                this.o = i16;
                return 0;
            case 5:
                ParsableByteArray parsableByteArray3 = new ParsableByteArray(this.o);
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray3.f5667a, 0, this.o, false);
                if (parsableByteArray3.a() < 16) {
                    j = 0;
                } else {
                    int i17 = parsableByteArray3.f5668b;
                    parsableByteArray3.H(8);
                    long jI = parsableByteArray3.i();
                    long j9 = this.m;
                    j = jI > j9 ? 0L : j9 + 8;
                    parsableByteArray3.G(i17);
                }
                while (parsableByteArray3.a() >= 16) {
                    int i18 = parsableByteArray3.i();
                    int i19 = parsableByteArray3.i();
                    long jI2 = ((long) parsableByteArray3.i()) + j;
                    parsableByteArray3.i();
                    ChunkReader[] chunkReaderArr = this.f6835i;
                    int length = chunkReaderArr.length;
                    int i20 = i3;
                    while (true) {
                        if (i20 < length) {
                            chunkReader2 = chunkReaderArr[i20];
                            i2 = i3;
                            if (chunkReader2.f6852b != i18 && chunkReader2.f6853c != i18) {
                                i20++;
                                i3 = i2;
                            }
                        } else {
                            i2 = i3;
                            chunkReader2 = null;
                        }
                    }
                    if (chunkReader2 != null) {
                        if ((i19 & 16) == 16) {
                            if (chunkReader2.j == chunkReader2.f6857l.length) {
                                long[] jArr = chunkReader2.k;
                                chunkReader2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = chunkReader2.f6857l;
                                chunkReader2.f6857l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = chunkReader2.k;
                            int i21 = chunkReader2.j;
                            jArr2[i21] = jI2;
                            chunkReader2.f6857l[i21] = chunkReader2.f6856i;
                            chunkReader2.j = i21 + 1;
                        }
                        chunkReader2.f6856i++;
                    }
                    i3 = i2;
                }
                int i22 = i3;
                ChunkReader[] chunkReaderArr2 = this.f6835i;
                int length2 = chunkReaderArr2.length;
                for (int i23 = i22; i23 < length2; i23++) {
                    ChunkReader chunkReader4 = chunkReaderArr2[i23];
                    chunkReader4.k = Arrays.copyOf(chunkReader4.k, chunkReader4.j);
                    chunkReader4.f6857l = Arrays.copyOf(chunkReader4.f6857l, chunkReader4.j);
                }
                this.f6838p = true;
                this.f.e(new AviSeekMap(this.f6834h));
                this.f6833e = 6;
                this.j = this.m;
                return i22;
            case 6:
                if (((DefaultExtractorInput) extractorInput).d >= this.f6837n) {
                    return -1;
                }
                ChunkReader chunkReader5 = this.k;
                if (chunkReader5 != null) {
                    int i24 = chunkReader5.g;
                    int iC = i24 - chunkReader5.f6851a.c(extractorInput, i24, false);
                    chunkReader5.g = iC;
                    boolean z3 = iC == 0;
                    if (z3) {
                        if (chunkReader5.f > 0) {
                            int i25 = chunkReader5.f6855h;
                            chunkReader5.f6851a.f((chunkReader5.d * ((long) i25)) / ((long) chunkReader5.f6854e), Arrays.binarySearch(chunkReader5.f6857l, i25) >= 0 ? 1 : 0, chunkReader5.f, 0, null);
                        }
                        chunkReader5.f6855h++;
                    }
                    if (z3) {
                        this.k = null;
                    }
                    return 0;
                }
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                if ((defaultExtractorInput2.d & 1) == 1) {
                    defaultExtractorInput2.skipFully(1);
                }
                defaultExtractorInput2.peekFully(parsableByteArray.f5667a, 0, 12, false);
                parsableByteArray.G(0);
                int i26 = parsableByteArray.i();
                if (i26 == 1414744396) {
                    parsableByteArray.G(8);
                    defaultExtractorInput2.skipFully(parsableByteArray.i() == 1769369453 ? 12 : 8);
                    defaultExtractorInput2.f = 0;
                    return 0;
                }
                int i27 = parsableByteArray.i();
                if (i26 == 1263424842) {
                    this.j = defaultExtractorInput2.d + ((long) i27) + 8;
                    return 0;
                }
                defaultExtractorInput2.skipFully(8);
                defaultExtractorInput2.f = 0;
                for (ChunkReader chunkReader6 : this.f6835i) {
                    if (chunkReader6.f6852b == i26 || chunkReader6.f6853c == i26) {
                        chunkReader3 = chunkReader6;
                        if (chunkReader3 == null) {
                            this.j = defaultExtractorInput2.d + ((long) i27);
                            return 0;
                        }
                        chunkReader3.f = i27;
                        chunkReader3.g = i27;
                        this.k = chunkReader3;
                        return 0;
                    }
                }
                if (chunkReader3 == null) {
                    this.j = defaultExtractorInput2.d + ((long) i27);
                    return 0;
                }
                chunkReader3.f = i27;
                chunkReader3.g = i27;
                this.k = chunkReader3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (ChunkReader chunkReader : this.f6835i) {
            if (chunkReader.j == 0) {
                chunkReader.f6855h = 0;
            } else {
                chunkReader.f6855h = chunkReader.f6857l[Util.e(chunkReader.k, j, true)];
            }
        }
        if (j != 0) {
            this.f6833e = 6;
        } else if (this.f6835i.length == 0) {
            this.f6833e = 0;
        } else {
            this.f6833e = 3;
        }
    }
}
