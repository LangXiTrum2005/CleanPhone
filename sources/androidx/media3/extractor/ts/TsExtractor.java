package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.applovin.shadow.okio.Segment;
import com.google.common.base.Charsets;
import com.vungle.ads.internal.protos.Sdk;
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

/* JADX INFO: loaded from: classes.dex */
public final class TsExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7632c = new ParsableByteArray(new byte[9400], 0);
    public final SparseIntArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DefaultTsPayloadReaderFactory f7633e;
    public final SubtitleParser.Factory f;
    public final SparseArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f7634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f7635i;
    public final TsDurationReader j;
    public TsBinarySearchSeeker k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ExtractorOutput f7636l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7637n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7638p;
    public final TsPayloadReader q;
    public int r;
    public int s;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PatReader implements SectionPayloadReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParsableBitArray f7639a = new ParsableBitArray(new byte[4], 4);

        public PatReader() {
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public final void a(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.u() != 0 || (parsableByteArray.u() & 128) == 0) {
                return;
            }
            parsableByteArray.H(6);
            int iA = parsableByteArray.a() / 4;
            int i2 = 0;
            while (true) {
                TsExtractor tsExtractor = TsExtractor.this;
                if (i2 >= iA) {
                    tsExtractor.getClass();
                    tsExtractor.g.remove(0);
                    return;
                }
                ParsableBitArray parsableBitArray = this.f7639a;
                parsableByteArray.e(parsableBitArray.f5663a, 0, 4);
                parsableBitArray.m(0);
                int iG = parsableBitArray.g(16);
                parsableBitArray.o(3);
                if (iG == 0) {
                    parsableBitArray.o(13);
                } else {
                    int iG2 = parsableBitArray.g(13);
                    if (tsExtractor.g.get(iG2) == null) {
                        tsExtractor.g.put(iG2, new SectionReader(tsExtractor.new PmtReader(iG2)));
                        tsExtractor.m++;
                    }
                }
                i2++;
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public final void b(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public class PmtReader implements SectionPayloadReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParsableBitArray f7641a = new ParsableBitArray(new byte[5], 5);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f7642b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f7643c = new SparseIntArray();
        public final int d;

        public PmtReader(int i2) {
            this.d = i2;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:105:0x020f  */
        /* JADX WARN: Code duplicated, block: B:110:0x0267  */
        /* JADX WARN: Code duplicated, block: B:118:0x02e2  */
        /* JADX WARN: Code duplicated, block: B:119:0x02f1  */
        /* JADX WARN: Code duplicated, block: B:136:0x030a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:71:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:75:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public final void a(ParsableByteArray parsableByteArray) {
            TsPayloadReader.EsInfo esInfo;
            DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory;
            TsPayloadReader pesReader;
            String str;
            if (parsableByteArray.u() != 2) {
                return;
            }
            TsExtractor tsExtractor = TsExtractor.this;
            tsExtractor.getClass();
            int i2 = 0;
            TimestampAdjuster timestampAdjuster = (TimestampAdjuster) tsExtractor.f7631b.get(0);
            if ((parsableByteArray.u() & 128) == 0) {
                return;
            }
            parsableByteArray.H(1);
            int iA = parsableByteArray.A();
            int i3 = 3;
            parsableByteArray.H(3);
            ParsableBitArray parsableBitArray = this.f7641a;
            parsableByteArray.e(parsableBitArray.f5663a, 0, 2);
            parsableBitArray.m(0);
            parsableBitArray.o(3);
            int i4 = 13;
            tsExtractor.s = parsableBitArray.g(13);
            parsableByteArray.e(parsableBitArray.f5663a, 0, 2);
            parsableBitArray.m(0);
            int i5 = 4;
            parsableBitArray.o(4);
            parsableByteArray.H(parsableBitArray.g(12));
            SparseArray sparseArray = this.f7642b;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.f7643c;
            sparseIntArray.clear();
            int iA2 = parsableByteArray.a();
            while (true) {
                SparseBooleanArray sparseBooleanArray = tsExtractor.f7634h;
                if (iA2 > 0) {
                    parsableByteArray.e(parsableBitArray.f5663a, i2, 5);
                    parsableBitArray.m(i2);
                    int iG = parsableBitArray.g(8);
                    parsableBitArray.o(i3);
                    int iG2 = parsableBitArray.g(i4);
                    parsableBitArray.o(i5);
                    int iG3 = parsableBitArray.g(12);
                    int i6 = parsableByteArray.f5668b;
                    int i7 = i6 + iG3;
                    String str2 = null;
                    ArrayList arrayList = null;
                    int i8 = -1;
                    int iU = 0;
                    while (parsableByteArray.f5668b < i7) {
                        int iU2 = parsableByteArray.u();
                        int iU3 = parsableByteArray.f5668b + parsableByteArray.u();
                        if (iU3 > i7) {
                            ParsableBitArray parsableBitArray2 = parsableBitArray;
                            int i9 = iA2;
                            parsableByteArray.G(i7);
                            esInfo = new TsPayloadReader.EsInfo(i8, str2, iU, arrayList, Arrays.copyOfRange(parsableByteArray.f5667a, i6, i7));
                            if (iG != 6 || iG == 5) {
                                iG = i8;
                            }
                            iA2 = i9 - (iG3 + 5);
                            if (sparseBooleanArray.get(iG2)) {
                                defaultTsPayloadReaderFactory = tsExtractor.f7633e;
                                if (iG != 2) {
                                    defaultTsPayloadReaderFactory.getClass();
                                    str = esInfo.f7647a;
                                    if (iG != 3 || iG == 4) {
                                        pesReader = new PesReader(new MpegAudioReader(str, esInfo.a()));
                                    } else if (iG == 21) {
                                        pesReader = new PesReader(new Id3Reader());
                                    } else if (iG == 27) {
                                        pesReader = new PesReader(new H264Reader(new SeiReader(defaultTsPayloadReaderFactory.a(esInfo)), false, false));
                                    } else if (iG == 36) {
                                        pesReader = new PesReader(new H265Reader(new SeiReader(defaultTsPayloadReaderFactory.a(esInfo))));
                                    } else if (iG == 45) {
                                        pesReader = new PesReader(new MpeghReader());
                                    } else if (iG == 89) {
                                        pesReader = new PesReader(new DvbSubtitleReader(esInfo.f7649c));
                                    } else if (iG == 172) {
                                        pesReader = new PesReader(new Ac4Reader(str, esInfo.a()));
                                    } else if (iG == 257) {
                                        pesReader = new SectionReader(new PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
                                    } else if (iG == 138) {
                                        pesReader = new PesReader(new DtsReader(str, esInfo.a(), 4096));
                                    } else if (iG != 139) {
                                        switch (iG) {
                                            case 15:
                                                pesReader = new PesReader(new AdtsReader(esInfo.a(), str, false));
                                                break;
                                            case 16:
                                                pesReader = new PesReader(new H263Reader(new UserDataReader(defaultTsPayloadReaderFactory.a(esInfo))));
                                                break;
                                            case 17:
                                                pesReader = new PesReader(new LatmReader(str, esInfo.a()));
                                                break;
                                            default:
                                                pesReader = null;
                                                switch (iG) {
                                                    case 128:
                                                        pesReader = new PesReader(new H262Reader(new UserDataReader(defaultTsPayloadReaderFactory.a(esInfo))));
                                                        break;
                                                    case 129:
                                                        pesReader = new PesReader(new Ac3Reader(str, esInfo.a()));
                                                        break;
                                                    case 130:
                                                        break;
                                                    default:
                                                        switch (iG) {
                                                            case 134:
                                                                pesReader = new SectionReader(new PassthroughSectionPayloadReader("application/x-scte35"));
                                                                break;
                                                            case 135:
                                                                pesReader = new PesReader(new Ac3Reader(str, esInfo.a()));
                                                                break;
                                                            case PRIVACY_URL_ERROR_VALUE:
                                                                pesReader = new PesReader(new DtsReader(str, esInfo.a(), 4096));
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        pesReader = new PesReader(new DtsReader(str, esInfo.a(), 5408));
                                    }
                                } else {
                                    pesReader = new PesReader(new H262Reader(new UserDataReader(defaultTsPayloadReaderFactory.a(esInfo))));
                                }
                                sparseIntArray.put(iG2, iG2);
                                sparseArray.put(iG2, pesReader);
                            }
                            i5 = 4;
                            parsableBitArray = parsableBitArray2;
                            i2 = 0;
                            i3 = 3;
                            i4 = 13;
                        } else {
                            ParsableBitArray parsableBitArray3 = parsableBitArray;
                            if (iU2 == 5) {
                                long jW = parsableByteArray.w();
                                if (jW == 1094921523) {
                                    i8 = 129;
                                } else if (jW == 1161904947) {
                                    i8 = 135;
                                } else if (jW == 1094921524) {
                                    i8 = 172;
                                } else if (jW == 1212503619) {
                                    i8 = 36;
                                }
                            } else if (iU2 == 106) {
                                i8 = 129;
                            } else if (iU2 == 122) {
                                i8 = 135;
                            } else if (iU2 == 127) {
                                int iU4 = parsableByteArray.u();
                                if (iU4 == 21) {
                                    i8 = 172;
                                } else if (iU4 == 14) {
                                    i8 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                                } else if (iU4 == 33) {
                                    i8 = 139;
                                }
                            } else if (iU2 == 123) {
                                i8 = 138;
                            } else if (iU2 == 10) {
                                String strTrim = parsableByteArray.s(3, Charsets.f19705c).trim();
                                iU = parsableByteArray.u();
                                str2 = strTrim;
                            } else if (iU2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (parsableByteArray.f5668b < iU3) {
                                    String strTrim2 = parsableByteArray.s(3, Charsets.f19705c).trim();
                                    parsableByteArray.u();
                                    int i10 = iA2;
                                    byte[] bArr = new byte[4];
                                    parsableByteArray.e(bArr, 0, 4);
                                    arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(strTrim2, bArr));
                                    iA2 = i10;
                                    iU3 = iU3;
                                }
                                iU3 = iU3;
                                iA2 = iA2;
                                arrayList = arrayList2;
                                i8 = 89;
                            } else {
                                iU3 = iU3;
                                iA2 = iA2;
                                if (iU2 == 111) {
                                    i8 = 257;
                                }
                            }
                            parsableByteArray.H(iU3 - parsableByteArray.f5668b);
                            iA2 = iA2;
                            parsableBitArray = parsableBitArray3;
                        }
                    }
                    ParsableBitArray parsableBitArray4 = parsableBitArray;
                    int i11 = iA2;
                    parsableByteArray.G(i7);
                    esInfo = new TsPayloadReader.EsInfo(i8, str2, iU, arrayList, Arrays.copyOfRange(parsableByteArray.f5667a, i6, i7));
                    if (iG != 6) {
                        iG = i8;
                    } else {
                        iG = i8;
                    }
                    iA2 = i11 - (iG3 + 5);
                    if (sparseBooleanArray.get(iG2)) {
                        defaultTsPayloadReaderFactory = tsExtractor.f7633e;
                        if (iG != 2) {
                            defaultTsPayloadReaderFactory.getClass();
                            str = esInfo.f7647a;
                            if (iG != 3) {
                                pesReader = new PesReader(new MpegAudioReader(str, esInfo.a()));
                            } else {
                                pesReader = new PesReader(new MpegAudioReader(str, esInfo.a()));
                            }
                        } else {
                            pesReader = new PesReader(new H262Reader(new UserDataReader(defaultTsPayloadReaderFactory.a(esInfo))));
                        }
                        sparseIntArray.put(iG2, iG2);
                        sparseArray.put(iG2, pesReader);
                    }
                    i5 = 4;
                    parsableBitArray = parsableBitArray4;
                    i2 = 0;
                    i3 = 3;
                    i4 = 13;
                } else {
                    int size = sparseIntArray.size();
                    int i12 = 0;
                    while (true) {
                        SparseArray sparseArray2 = tsExtractor.g;
                        if (i12 >= size) {
                            sparseArray2.remove(this.d);
                            tsExtractor.m = 0;
                            tsExtractor.f7636l.endTracks();
                            tsExtractor.f7637n = true;
                            return;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i12);
                        int iValueAt = sparseIntArray.valueAt(i12);
                        sparseBooleanArray.put(iKeyAt, true);
                        tsExtractor.f7635i.put(iValueAt, true);
                        TsPayloadReader tsPayloadReader = (TsPayloadReader) sparseArray.valueAt(i12);
                        if (tsPayloadReader != null) {
                            if (tsPayloadReader != tsExtractor.q) {
                                tsPayloadReader.b(timestampAdjuster, tsExtractor.f7636l, new TsPayloadReader.TrackIdGenerator(iA, iKeyAt, Segment.SIZE));
                            }
                            sparseArray2.put(iValueAt, tsPayloadReader);
                        }
                        i12++;
                    }
                }
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public final void b(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public TsExtractor(int i2, SubtitleParser.Factory factory, TimestampAdjuster timestampAdjuster, DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory) {
        this.f7633e = defaultTsPayloadReaderFactory;
        this.f7630a = i2;
        this.f = factory;
        this.f7631b = Collections.singletonList(timestampAdjuster);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f7634h = sparseBooleanArray;
        this.f7635i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.d = new SparseIntArray();
        this.j = new TsDurationReader();
        this.f7636l = ExtractorOutput.M8;
        this.s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (TsPayloadReader) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new SectionReader(new PatReader()));
        this.q = null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f7632c.f5667a;
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

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        if ((this.f7630a & 1) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f);
        }
        this.f7636l = extractorOutput;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.media3.extractor.ts.PesReader] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.media3.extractor.ts.TsPayloadReader] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        ?? r2;
        ?? r15;
        ?? r6;
        TsPayloadReader tsPayloadReader;
        boolean z2;
        long j;
        long j2;
        long j3 = ((DefaultExtractorInput) extractorInput).f6741c;
        if (this.f7637n) {
            TsDurationReader tsDurationReader = this.j;
            if (j3 != -1 && !tsDurationReader.f7627c) {
                int i2 = this.s;
                if (i2 <= 0) {
                    tsDurationReader.a((DefaultExtractorInput) extractorInput);
                    return 0;
                }
                boolean z3 = tsDurationReader.f7628e;
                ParsableByteArray parsableByteArray = tsDurationReader.f7626b;
                if (z3) {
                    if (tsDurationReader.g == -9223372036854775807L) {
                        tsDurationReader.a((DefaultExtractorInput) extractorInput);
                        return 0;
                    }
                    if (tsDurationReader.d) {
                        long j4 = tsDurationReader.f;
                        if (j4 == -9223372036854775807L) {
                            tsDurationReader.a((DefaultExtractorInput) extractorInput);
                            return 0;
                        }
                        TimestampAdjuster timestampAdjuster = tsDurationReader.f7625a;
                        tsDurationReader.f7629h = timestampAdjuster.c(tsDurationReader.g) - timestampAdjuster.b(j4);
                        tsDurationReader.a((DefaultExtractorInput) extractorInput);
                        return 0;
                    }
                    DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                    int iMin = (int) Math.min(112800, defaultExtractorInput.f6741c);
                    long j5 = 0;
                    if (defaultExtractorInput.d != j5) {
                        positionHolder.f6793a = j5;
                        return 1;
                    }
                    parsableByteArray.D(iMin);
                    defaultExtractorInput.f = 0;
                    defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, iMin, false);
                    int i3 = parsableByteArray.f5669c;
                    for (int i4 = parsableByteArray.f5668b; i4 < i3; i4++) {
                        if (parsableByteArray.f5667a[i4] == 71) {
                            long jA = TsUtil.a(parsableByteArray, i4, i2);
                            if (jA != -9223372036854775807L) {
                                j = jA;
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
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                long j6 = defaultExtractorInput2.f6741c;
                int iMin2 = (int) Math.min(112800, j6);
                long j7 = j6 - ((long) iMin2);
                if (defaultExtractorInput2.d != j7) {
                    positionHolder.f6793a = j7;
                    return 1;
                }
                parsableByteArray.D(iMin2);
                defaultExtractorInput2.f = 0;
                defaultExtractorInput2.peekFully(parsableByteArray.f5667a, 0, iMin2, false);
                int i5 = parsableByteArray.f5668b;
                int i6 = parsableByteArray.f5669c;
                for (int i7 = i6 - 188; i7 >= i5; i7--) {
                    byte[] bArr = parsableByteArray.f5667a;
                    int i8 = 0;
                    for (int i9 = -4; i9 <= 4; i9++) {
                        int i10 = (i9 * 188) + i7;
                        if (i10 < i5 || i10 >= i6 || bArr[i10] != 71) {
                            i8 = 0;
                        } else {
                            i8++;
                            if (i8 == 5) {
                                long jA2 = TsUtil.a(parsableByteArray, i7, i2);
                                if (jA2 == -9223372036854775807L) {
                                    break;
                                }
                                j2 = jA2;
                                tsDurationReader.g = j2;
                                tsDurationReader.f7628e = true;
                                return 0;
                            }
                        }
                    }
                }
                j2 = -9223372036854775807L;
                tsDurationReader.g = j2;
                tsDurationReader.f7628e = true;
                return 0;
            }
            if (this.o) {
                z2 = false;
            } else {
                this.o = true;
                long j8 = tsDurationReader.f7629h;
                if (j8 != -9223372036854775807L) {
                    z2 = false;
                    TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new TsBinarySearchSeeker.TsPcrSeeker(this.s, tsDurationReader.f7625a), j8, 1 + j8, 0L, j3, 188L, 940);
                    this.k = tsBinarySearchSeeker;
                    this.f7636l.e(tsBinarySearchSeeker.f6716a);
                } else {
                    z2 = false;
                    this.f7636l.e(new SeekMap.Unseekable(j8));
                }
            }
            if (this.f7638p) {
                this.f7638p = z2;
                seek(0L, 0L);
                if (((DefaultExtractorInput) extractorInput).d != 0) {
                    positionHolder.f6793a = 0L;
                    return 1;
                }
            }
            r15 = 1;
            r15 = 1;
            TsBinarySearchSeeker tsBinarySearchSeeker2 = this.k;
            r2 = z2;
            if (tsBinarySearchSeeker2 != null && tsBinarySearchSeeker2.f6718c != null) {
                r2 = z2;
                return tsBinarySearchSeeker2.a((DefaultExtractorInput) extractorInput, positionHolder);
            }
        } else {
            r2 = 0;
            r15 = 1;
        }
        r2 = z2;
        ParsableByteArray parsableByteArray2 = this.f7632c;
        byte[] bArr2 = parsableByteArray2.f5667a;
        if (9400 - parsableByteArray2.f5668b < 188) {
            int iA = parsableByteArray2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, parsableByteArray2.f5668b, bArr2, r2, iA);
            }
            parsableByteArray2.E(bArr2, iA);
        }
        while (true) {
            int iA2 = parsableByteArray2.a();
            ?? r7 = this.g;
            if (iA2 >= 188) {
                int i11 = parsableByteArray2.f5668b;
                int i12 = parsableByteArray2.f5669c;
                byte[] bArr3 = parsableByteArray2.f5667a;
                int i13 = i11;
                while (i13 < i12 && bArr3[i13] != 71) {
                    i13++;
                }
                parsableByteArray2.G(i13);
                int i14 = i13 + 188;
                if (i14 > i12) {
                    this.r = (i13 - i11) + this.r;
                } else {
                    this.r = r2;
                }
                int i15 = parsableByteArray2.f5669c;
                if (i14 > i15) {
                    return r2;
                }
                int iG = parsableByteArray2.g();
                if ((8388608 & iG) != 0) {
                    parsableByteArray2.G(i14);
                    return r2;
                }
                ?? r8 = (4194304 & iG) != 0 ? r15 : r2;
                int i16 = (2096896 & iG) >> 8;
                ?? r9 = (iG & 32) != 0 ? r15 : r2;
                if ((iG & 16) != 0) {
                    tsPayloadReader = (TsPayloadReader) r7.get(i16);
                } else {
                    r6 = 0;
                }
                if (r6 == 0) {
                    r6 = tsPayloadReader;
                    parsableByteArray2.G(i14);
                    return r2;
                }
                int i17 = iG & 15;
                SparseIntArray sparseIntArray = this.d;
                int i18 = sparseIntArray.get(i16, i17 - 1);
                sparseIntArray.put(i16, i17);
                if (i18 == i17) {
                    r6 = tsPayloadReader;
                    parsableByteArray2.G(i14);
                    return r2;
                }
                if (i17 != ((i18 + r15) & 15)) {
                    r6 = tsPayloadReader;
                    r6.seek();
                }
                if (r9 != 0) {
                    int iU = parsableByteArray2.u();
                    r8 = (r8 == true ? 1 : 0) | ((parsableByteArray2.u() & 64) != 0 ? 2 : r2);
                    parsableByteArray2.H(iU - r15);
                }
                boolean z4 = this.f7637n;
                if (z4 || !this.f7635i.get(i16, r2)) {
                    parsableByteArray2.F(i14);
                    r6.a(r8, parsableByteArray2);
                    parsableByteArray2.F(i15);
                }
                if (!z4 && this.f7637n && j3 != -1) {
                    this.f7638p = r15;
                }
                parsableByteArray2.G(i14);
                return r2;
            }
            int i19 = parsableByteArray2.f5669c;
            int i20 = ((DefaultExtractorInput) extractorInput).read(bArr2, i19, 9400 - i19);
            if (i20 == -1) {
                for (?? r4 = r2; r4 < r7.size(); r4++) {
                    TsPayloadReader tsPayloadReader2 = (TsPayloadReader) r7.valueAt(r4);
                    if (tsPayloadReader2 instanceof PesReader) {
                        ?? r1 = (PesReader) tsPayloadReader2;
                        if (r1.f7594c == 3 && r1.j == -1) {
                            r1.a(r15, new ParsableByteArray());
                        }
                    }
                }
                return -1;
            }
            parsableByteArray2.F(i19 + i20);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        TsBinarySearchSeeker tsBinarySearchSeeker;
        long j3;
        List list = this.f7631b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            TimestampAdjuster timestampAdjuster = (TimestampAdjuster) list.get(i2);
            synchronized (timestampAdjuster) {
                j3 = timestampAdjuster.f5681b;
            }
            boolean z2 = j3 == -9223372036854775807L;
            if (!z2) {
                long jD = timestampAdjuster.d();
                z2 = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z2) {
                timestampAdjuster.e(j2);
            }
        }
        if (j2 != 0 && (tsBinarySearchSeeker = this.k) != null) {
            tsBinarySearchSeeker.c(j2);
        }
        this.f7632c.D(0);
        this.d.clear();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i3 >= sparseArray.size()) {
                this.r = 0;
                return;
            } else {
                ((TsPayloadReader) sparseArray.valueAt(i3)).seek();
                i3++;
            }
        }
    }
}
