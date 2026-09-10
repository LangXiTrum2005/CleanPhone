package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.shadow.okio.Segment;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.base.Charsets;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TsExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f18078b = new ParsableByteArray(new byte[9400], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f18079c;
    public final DefaultTsPayloadReaderFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f18080e;
    public final SparseBooleanArray f;
    public final SparseBooleanArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TsDurationReader f18081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TsBinarySearchSeeker f18082i;
    public ExtractorOutput j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18083l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18084n;
    public final TsPayloadReader o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18085p;
    public int q;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PatReader implements SectionPayloadReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParsableBitArray f18086a = new ParsableBitArray(new byte[4], 4);

        public PatReader() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public final void a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public final void b(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.u() != 0 || (parsableByteArray.u() & 128) == 0) {
                return;
            }
            parsableByteArray.G(6);
            int iA = parsableByteArray.a() / 4;
            int i2 = 0;
            while (true) {
                TsExtractor tsExtractor = TsExtractor.this;
                if (i2 >= iA) {
                    tsExtractor.getClass();
                    tsExtractor.f18080e.remove(0);
                    return;
                }
                ParsableBitArray parsableBitArray = this.f18086a;
                parsableByteArray.e(parsableBitArray.f18952a, 0, 4);
                parsableBitArray.l(0);
                int iG = parsableBitArray.g(16);
                parsableBitArray.n(3);
                if (iG == 0) {
                    parsableBitArray.n(13);
                } else {
                    int iG2 = parsableBitArray.g(13);
                    if (tsExtractor.f18080e.get(iG2) == null) {
                        tsExtractor.f18080e.put(iG2, new SectionReader(tsExtractor.new PmtReader(iG2)));
                        tsExtractor.k++;
                    }
                }
                i2++;
            }
        }
    }

    public class PmtReader implements SectionPayloadReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParsableBitArray f18088a = new ParsableBitArray(new byte[5], 5);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f18089b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f18090c = new SparseIntArray();
        public final int d;

        public PmtReader(int i2) {
            this.d = i2;
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public final void a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        /* JADX WARN: Code duplicated, block: B:100:0x021b  */
        /* JADX WARN: Code duplicated, block: B:109:0x029a  */
        /* JADX WARN: Code duplicated, block: B:110:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:127:0x02be A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x00db  */
        /* JADX WARN: Code duplicated, block: B:65:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:69:0x01af  */
        /* JADX WARN: Code duplicated, block: B:71:0x01b4  */
        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public final void b(ParsableByteArray parsableByteArray) {
            TsPayloadReader.EsInfo esInfo;
            int i2;
            DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory;
            Object pesReader;
            String str;
            if (parsableByteArray.u() != 2) {
                return;
            }
            TsExtractor tsExtractor = TsExtractor.this;
            tsExtractor.getClass();
            int i3 = 0;
            TimestampAdjuster timestampAdjuster = (TimestampAdjuster) tsExtractor.f18077a.get(0);
            if ((parsableByteArray.u() & 128) == 0) {
                return;
            }
            parsableByteArray.G(1);
            int iZ = parsableByteArray.z();
            int i4 = 3;
            parsableByteArray.G(3);
            ParsableBitArray parsableBitArray = this.f18088a;
            parsableByteArray.e(parsableBitArray.f18952a, 0, 2);
            parsableBitArray.l(0);
            parsableBitArray.n(3);
            int i5 = 13;
            tsExtractor.q = parsableBitArray.g(13);
            parsableByteArray.e(parsableBitArray.f18952a, 0, 2);
            parsableBitArray.l(0);
            int i6 = 4;
            parsableBitArray.n(4);
            parsableByteArray.G(parsableBitArray.g(12));
            SparseArray sparseArray = this.f18089b;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.f18090c;
            sparseIntArray.clear();
            int iA = parsableByteArray.a();
            while (true) {
                SparseBooleanArray sparseBooleanArray = tsExtractor.f;
                if (iA > 0) {
                    parsableByteArray.e(parsableBitArray.f18952a, i3, 5);
                    parsableBitArray.l(i3);
                    int iG = parsableBitArray.g(8);
                    parsableBitArray.n(i4);
                    int iG2 = parsableBitArray.g(i5);
                    parsableBitArray.n(i6);
                    int iG3 = parsableBitArray.g(12);
                    int i7 = parsableByteArray.f18957b;
                    int i8 = i7 + iG3;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int i9 = -1;
                    while (parsableByteArray.f18957b < i8) {
                        int iU = parsableByteArray.u();
                        int iU2 = parsableByteArray.f18957b + parsableByteArray.u();
                        if (iU2 > i8) {
                            ParsableBitArray parsableBitArray2 = parsableBitArray;
                            int i10 = iA;
                            parsableByteArray.F(i8);
                            i2 = i9;
                            esInfo = new TsPayloadReader.EsInfo(i2, strTrim, arrayList, Arrays.copyOfRange(parsableByteArray.f18956a, i7, i8));
                            if (iG != 6 || iG == 5) {
                                iG = i2;
                            }
                            iA = i10 - (iG3 + 5);
                            if (sparseBooleanArray.get(iG2)) {
                                defaultTsPayloadReaderFactory = tsExtractor.d;
                                if (iG != 2) {
                                    defaultTsPayloadReaderFactory.getClass();
                                    str = esInfo.f18094a;
                                    if (iG != 3 || iG == 4) {
                                        pesReader = new PesReader(new MpegAudioReader(str));
                                    } else if (iG == 21) {
                                        pesReader = new PesReader(new Id3Reader());
                                    } else if (iG == 27) {
                                        pesReader = new PesReader(new H264Reader(new SeiReader(defaultTsPayloadReaderFactory.a(esInfo)), false, false));
                                    } else if (iG == 36) {
                                        pesReader = new PesReader(new H265Reader(new SeiReader(defaultTsPayloadReaderFactory.a(esInfo))));
                                    } else if (iG == 89) {
                                        pesReader = new PesReader(new DvbSubtitleReader(esInfo.f18095b));
                                    } else if (iG == 138) {
                                        pesReader = new PesReader(new DtsReader(str));
                                    } else if (iG == 172) {
                                        pesReader = new PesReader(new Ac4Reader(str));
                                    } else if (iG == 257) {
                                        pesReader = new SectionReader(new PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
                                    } else if (iG == 134) {
                                        pesReader = new SectionReader(new PassthroughSectionPayloadReader("application/x-scte35"));
                                    } else if (iG != 135) {
                                        switch (iG) {
                                            case 15:
                                                pesReader = new PesReader(new AdtsReader(false, str));
                                                break;
                                            case 16:
                                                pesReader = new PesReader(new H263Reader(new UserDataReader(defaultTsPayloadReaderFactory.a(esInfo))));
                                                break;
                                            case 17:
                                                pesReader = new PesReader(new LatmReader(str));
                                                break;
                                            default:
                                                pesReader = null;
                                                switch (iG) {
                                                    case 128:
                                                        pesReader = new PesReader(new H262Reader(new UserDataReader(defaultTsPayloadReaderFactory.a(esInfo))));
                                                        break;
                                                    case 129:
                                                        pesReader = new PesReader(new Ac3Reader(str));
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        pesReader = new PesReader(new Ac3Reader(str));
                                    }
                                } else {
                                    pesReader = new PesReader(new H262Reader(new UserDataReader(defaultTsPayloadReaderFactory.a(esInfo))));
                                }
                                sparseIntArray.put(iG2, iG2);
                                sparseArray.put(iG2, pesReader);
                            }
                            i6 = 4;
                            parsableBitArray = parsableBitArray2;
                            i3 = 0;
                            i4 = 3;
                            i5 = 13;
                        } else {
                            ParsableBitArray parsableBitArray3 = parsableBitArray;
                            if (iU == 5) {
                                long jV = parsableByteArray.v();
                                if (jV == 1094921523) {
                                    i9 = 129;
                                } else if (jV == 1161904947) {
                                    i9 = 135;
                                } else if (jV == 1094921524) {
                                    i9 = 172;
                                } else if (jV == 1212503619) {
                                    i9 = 36;
                                }
                            } else if (iU == 106) {
                                i9 = 129;
                            } else if (iU == 122) {
                                i9 = 135;
                            } else if (iU == 127) {
                                if (parsableByteArray.u() == 21) {
                                    i9 = 172;
                                }
                            } else if (iU == 123) {
                                i9 = 138;
                            } else if (iU == 10) {
                                strTrim = parsableByteArray.s(3, Charsets.f19705c).trim();
                            } else if (iU == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (parsableByteArray.f18957b < iU2) {
                                    String strTrim2 = parsableByteArray.s(3, Charsets.f19705c).trim();
                                    parsableByteArray.u();
                                    int i11 = iA;
                                    byte[] bArr = new byte[4];
                                    parsableByteArray.e(bArr, 0, 4);
                                    arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(strTrim2, bArr));
                                    iA = i11;
                                    iU2 = iU2;
                                }
                                iU2 = iU2;
                                iA = iA;
                                arrayList = arrayList2;
                                i9 = 89;
                            } else {
                                iU2 = iU2;
                                iA = iA;
                                if (iU == 111) {
                                    i9 = 257;
                                }
                            }
                            parsableByteArray.G(iU2 - parsableByteArray.f18957b);
                            iA = iA;
                            parsableBitArray = parsableBitArray3;
                        }
                    }
                    ParsableBitArray parsableBitArray4 = parsableBitArray;
                    int i12 = iA;
                    parsableByteArray.F(i8);
                    i2 = i9;
                    esInfo = new TsPayloadReader.EsInfo(i2, strTrim, arrayList, Arrays.copyOfRange(parsableByteArray.f18956a, i7, i8));
                    if (iG != 6) {
                        iG = i2;
                    } else {
                        iG = i2;
                    }
                    iA = i12 - (iG3 + 5);
                    if (sparseBooleanArray.get(iG2)) {
                        defaultTsPayloadReaderFactory = tsExtractor.d;
                        if (iG != 2) {
                            defaultTsPayloadReaderFactory.getClass();
                            str = esInfo.f18094a;
                            if (iG != 3) {
                                pesReader = new PesReader(new MpegAudioReader(str));
                            } else {
                                pesReader = new PesReader(new MpegAudioReader(str));
                            }
                        } else {
                            pesReader = new PesReader(new H262Reader(new UserDataReader(defaultTsPayloadReaderFactory.a(esInfo))));
                        }
                        sparseIntArray.put(iG2, iG2);
                        sparseArray.put(iG2, pesReader);
                    }
                    i6 = 4;
                    parsableBitArray = parsableBitArray4;
                    i3 = 0;
                    i4 = 3;
                    i5 = 13;
                } else {
                    int size = sparseIntArray.size();
                    int i13 = 0;
                    while (true) {
                        SparseArray sparseArray2 = tsExtractor.f18080e;
                        if (i13 >= size) {
                            sparseArray2.remove(this.d);
                            tsExtractor.k = 0;
                            tsExtractor.j.endTracks();
                            tsExtractor.f18083l = true;
                            return;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i13);
                        int iValueAt = sparseIntArray.valueAt(i13);
                        sparseBooleanArray.put(iKeyAt, true);
                        tsExtractor.g.put(iValueAt, true);
                        TsPayloadReader tsPayloadReader = (TsPayloadReader) sparseArray.valueAt(i13);
                        if (tsPayloadReader != null) {
                            if (tsPayloadReader != tsExtractor.o) {
                                tsPayloadReader.a(timestampAdjuster, tsExtractor.j, new TsPayloadReader.TrackIdGenerator(iZ, iKeyAt, Segment.SIZE));
                            }
                            sparseArray2.put(iValueAt, tsPayloadReader);
                        }
                        i13++;
                    }
                }
            }
        }
    }

    public TsExtractor(TimestampAdjuster timestampAdjuster, DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory) {
        this.d = defaultTsPayloadReaderFactory;
        this.f18077a = Collections.singletonList(timestampAdjuster);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f = sparseBooleanArray;
        this.g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f18080e = sparseArray;
        this.f18079c = new SparseIntArray();
        this.f18081h = new TsDurationReader();
        this.j = ExtractorOutput.Q8;
        this.q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (TsPayloadReader) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new SectionReader(new PatReader()));
        this.o = null;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f18078b.f18956a;
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.peekFully(bArr, 0, 940, false);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    defaultExtractorInput.skipFully(i2);
                    return true;
                }
                if (bArr[(i3 * 188) + i2] != 71) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.exoplayer2.extractor.ts.TsPayloadReader] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        ?? r2;
        ?? r15;
        ?? r9;
        TsPayloadReader tsPayloadReader;
        boolean z2;
        long j;
        long j2;
        long j3 = ((DefaultExtractorInput) extractorInput).f17527c;
        if (this.f18083l) {
            TsDurationReader tsDurationReader = this.f18081h;
            if (j3 != -1 && !tsDurationReader.f18074c) {
                int i2 = this.q;
                if (i2 <= 0) {
                    tsDurationReader.a((DefaultExtractorInput) extractorInput);
                    return 0;
                }
                boolean z3 = tsDurationReader.f18075e;
                ParsableByteArray parsableByteArray = tsDurationReader.f18073b;
                if (!z3) {
                    DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                    long j4 = defaultExtractorInput.f17527c;
                    int iMin = (int) Math.min(112800, j4);
                    long j5 = j4 - ((long) iMin);
                    if (defaultExtractorInput.d != j5) {
                        positionHolder.f17554a = j5;
                        return 1;
                    }
                    parsableByteArray.C(iMin);
                    defaultExtractorInput.f = 0;
                    defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, iMin, false);
                    int i3 = parsableByteArray.f18957b;
                    int i4 = parsableByteArray.f18958c;
                    for (int i5 = i4 - 188; i5 >= i3; i5--) {
                        byte[] bArr = parsableByteArray.f18956a;
                        int i6 = 0;
                        for (int i7 = -4; i7 <= 4; i7++) {
                            int i8 = (i7 * 188) + i5;
                            if (i8 < i3 || i8 >= i4 || bArr[i8] != 71) {
                                i6 = 0;
                            } else {
                                i6++;
                                if (i6 == 5) {
                                    long jA = TsUtil.a(parsableByteArray, i5, i2);
                                    if (jA == -9223372036854775807L) {
                                        break;
                                    }
                                    j2 = jA;
                                    tsDurationReader.g = j2;
                                    tsDurationReader.f18075e = true;
                                    return 0;
                                }
                            }
                        }
                    }
                    j2 = -9223372036854775807L;
                    tsDurationReader.g = j2;
                    tsDurationReader.f18075e = true;
                    return 0;
                }
                if (tsDurationReader.g == -9223372036854775807L) {
                    tsDurationReader.a((DefaultExtractorInput) extractorInput);
                    return 0;
                }
                if (tsDurationReader.d) {
                    long j6 = tsDurationReader.f;
                    if (j6 == -9223372036854775807L) {
                        tsDurationReader.a((DefaultExtractorInput) extractorInput);
                        return 0;
                    }
                    TimestampAdjuster timestampAdjuster = tsDurationReader.f18072a;
                    long jB = timestampAdjuster.b(tsDurationReader.g) - timestampAdjuster.b(j6);
                    tsDurationReader.f18076h = jB;
                    if (jB < 0) {
                        Log.g("TsDurationReader", "Invalid duration: " + tsDurationReader.f18076h + ". Using TIME_UNSET instead.");
                        tsDurationReader.f18076h = -9223372036854775807L;
                    }
                    tsDurationReader.a((DefaultExtractorInput) extractorInput);
                    return 0;
                }
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                int iMin2 = (int) Math.min(112800, defaultExtractorInput2.f17527c);
                long j7 = 0;
                if (defaultExtractorInput2.d != j7) {
                    positionHolder.f17554a = j7;
                    return 1;
                }
                parsableByteArray.C(iMin2);
                defaultExtractorInput2.f = 0;
                defaultExtractorInput2.peekFully(parsableByteArray.f18956a, 0, iMin2, false);
                int i9 = parsableByteArray.f18958c;
                for (int i10 = parsableByteArray.f18957b; i10 < i9; i10++) {
                    if (parsableByteArray.f18956a[i10] == 71) {
                        long jA2 = TsUtil.a(parsableByteArray, i10, i2);
                        if (jA2 != -9223372036854775807L) {
                            j = jA2;
                            tsDurationReader.f = j;
                            tsDurationReader.d = true;
                            return 0;
                        }
                    }
                }
                j = -9223372036854775807L;
                tsDurationReader.f = j;
                tsDurationReader.d = true;
                return 0;
            }
            if (this.m) {
                z2 = false;
            } else {
                this.m = true;
                long j8 = tsDurationReader.f18076h;
                if (j8 != -9223372036854775807L) {
                    z2 = false;
                    TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new TsBinarySearchSeeker.TsPcrSeeker(this.q, tsDurationReader.f18072a), j8, j8 + 1, 0L, j3, 188L, 940);
                    this.f18082i = tsBinarySearchSeeker;
                    this.j.g(tsBinarySearchSeeker.f17502a);
                } else {
                    z2 = false;
                    this.j.g(new SeekMap.Unseekable(j8));
                }
            }
            if (this.f18084n) {
                this.f18084n = z2;
                seek(0L, 0L);
                if (((DefaultExtractorInput) extractorInput).d != 0) {
                    positionHolder.f17554a = 0L;
                    return 1;
                }
            }
            r15 = 1;
            r15 = 1;
            TsBinarySearchSeeker tsBinarySearchSeeker2 = this.f18082i;
            r2 = z2;
            if (tsBinarySearchSeeker2 != null && tsBinarySearchSeeker2.f17504c != null) {
                r2 = z2;
                return tsBinarySearchSeeker2.a((DefaultExtractorInput) extractorInput, positionHolder);
            }
        } else {
            r2 = 0;
            r15 = 1;
        }
        r2 = z2;
        ParsableByteArray parsableByteArray2 = this.f18078b;
        byte[] bArr2 = parsableByteArray2.f18956a;
        if (9400 - parsableByteArray2.f18957b < 188) {
            int iA = parsableByteArray2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, parsableByteArray2.f18957b, bArr2, r2, iA);
            }
            parsableByteArray2.D(bArr2, iA);
        }
        while (parsableByteArray2.a() < 188) {
            int i11 = parsableByteArray2.f18958c;
            int i12 = ((DefaultExtractorInput) extractorInput).read(bArr2, i11, 9400 - i11);
            if (i12 == -1) {
                return -1;
            }
            parsableByteArray2.E(i11 + i12);
        }
        int i13 = parsableByteArray2.f18957b;
        int i14 = parsableByteArray2.f18958c;
        byte[] bArr3 = parsableByteArray2.f18956a;
        int i15 = i13;
        while (i15 < i14 && bArr3[i15] != 71) {
            i15++;
        }
        parsableByteArray2.F(i15);
        int i16 = i15 + 188;
        if (i16 > i14) {
            this.f18085p = (i15 - i13) + this.f18085p;
        } else {
            this.f18085p = r2;
        }
        int i17 = parsableByteArray2.f18958c;
        if (i16 > i17) {
            return r2;
        }
        int iG = parsableByteArray2.g();
        if ((8388608 & iG) != 0) {
            parsableByteArray2.F(i16);
            return r2;
        }
        ?? r6 = (4194304 & iG) != 0 ? r15 : r2;
        int i18 = (2096896 & iG) >> 8;
        ?? r8 = (iG & 32) != 0 ? r15 : r2;
        if ((iG & 16) != 0) {
            tsPayloadReader = (TsPayloadReader) this.f18080e.get(i18);
        } else {
            r9 = 0;
        }
        if (r9 == 0) {
            r9 = tsPayloadReader;
            parsableByteArray2.F(i16);
            return r2;
        }
        int i19 = iG & 15;
        SparseIntArray sparseIntArray = this.f18079c;
        int i20 = sparseIntArray.get(i18, i19 - 1);
        sparseIntArray.put(i18, i19);
        if (i20 == i19) {
            r9 = tsPayloadReader;
            parsableByteArray2.F(i16);
            return r2;
        }
        if (i19 != ((i20 + r15) & 15)) {
            r9 = tsPayloadReader;
            r9.seek();
        }
        if (r8 != 0) {
            int iU = parsableByteArray2.u();
            r6 = (r6 == true ? 1 : 0) | ((parsableByteArray2.u() & 64) != 0 ? 2 : r2);
            parsableByteArray2.G(iU - r15);
        }
        boolean z4 = this.f18083l;
        if (z4 || !this.g.get(i18, r2)) {
            parsableByteArray2.E(i16);
            r9.b(r6, parsableByteArray2);
            parsableByteArray2.E(i17);
        }
        if (!z4 && this.f18083l && j3 != -1) {
            this.f18084n = r15;
        }
        parsableByteArray2.F(i16);
        return r2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.j = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        TsBinarySearchSeeker tsBinarySearchSeeker;
        long j3;
        List list = this.f18077a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            TimestampAdjuster timestampAdjuster = (TimestampAdjuster) list.get(i2);
            synchronized (timestampAdjuster) {
                j3 = timestampAdjuster.f18977b;
            }
            boolean z2 = j3 == -9223372036854775807L;
            if (!z2) {
                long jC = timestampAdjuster.c();
                z2 = (jC == -9223372036854775807L || jC == 0 || jC == j2) ? false : true;
            }
            if (z2) {
                timestampAdjuster.d(j2);
            }
        }
        if (j2 != 0 && (tsBinarySearchSeeker = this.f18082i) != null) {
            tsBinarySearchSeeker.c(j2);
        }
        this.f18078b.C(0);
        this.f18079c.clear();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f18080e;
            if (i3 >= sparseArray.size()) {
                this.f18085p = 0;
                return;
            } else {
                ((TsPayloadReader) sparseArray.valueAt(i3)).seek();
                i3++;
            }
        }
    }
}
