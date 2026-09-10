package com.google.android.exoplayer2.extractor.ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class PsExtractor implements Extractor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18056e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PsBinarySearchSeeker f18058i;
    public ExtractorOutput j;
    public boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimestampAdjuster f18053a = new TimestampAdjuster(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f18055c = new ParsableByteArray(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f18054b = new SparseArray();
    public final PsDurationReader d = new PsDurationReader();

    public static final class PesReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ElementaryStreamReader f18059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimestampAdjuster f18060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParsableBitArray f18061c = new ParsableBitArray(new byte[64], 64);
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18062e;
        public boolean f;
        public long g;

        public PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.f18059a = elementaryStreamReader;
            this.f18060b = timestampAdjuster;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.peekFully(bArr, 0, 14, false);
        if (442 == (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            defaultExtractorInput.c(bArr[13] & 7, false);
            defaultExtractorInput.peekFully(bArr, 0, 3, false);
            if (1 == (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0248  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        ?? r2;
        ElementaryStreamReader h262Reader;
        long j;
        long j2;
        Assertions.e(this.j);
        long j3 = ((DefaultExtractorInput) extractorInput).f17527c;
        PsDurationReader psDurationReader = this.d;
        if (j3 != -1 && !psDurationReader.f18050c) {
            boolean z2 = psDurationReader.f18051e;
            ParsableByteArray parsableByteArray = psDurationReader.f18049b;
            if (!z2) {
                DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                long j4 = defaultExtractorInput.f17527c;
                int iMin = (int) Math.min(20000L, j4);
                long j5 = j4 - ((long) iMin);
                if (defaultExtractorInput.d != j5) {
                    positionHolder.f17554a = j5;
                    return 1;
                }
                parsableByteArray.C(iMin);
                defaultExtractorInput.f = 0;
                defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, iMin, false);
                int i2 = parsableByteArray.f18957b;
                for (int i3 = parsableByteArray.f18958c - 4; i3 >= i2; i3--) {
                    if (PsDurationReader.b(i3, parsableByteArray.f18956a) == 442) {
                        parsableByteArray.F(i3 + 4);
                        long jC = PsDurationReader.c(parsableByteArray);
                        if (jC != -9223372036854775807L) {
                            j2 = jC;
                            psDurationReader.g = j2;
                            psDurationReader.f18051e = true;
                            return 0;
                        }
                    }
                }
                j2 = -9223372036854775807L;
                psDurationReader.g = j2;
                psDurationReader.f18051e = true;
                return 0;
            }
            if (psDurationReader.g == -9223372036854775807L) {
                psDurationReader.a((DefaultExtractorInput) extractorInput);
                return 0;
            }
            if (psDurationReader.d) {
                long j6 = psDurationReader.f;
                if (j6 == -9223372036854775807L) {
                    psDurationReader.a((DefaultExtractorInput) extractorInput);
                    return 0;
                }
                TimestampAdjuster timestampAdjuster = psDurationReader.f18048a;
                long jB = timestampAdjuster.b(psDurationReader.g) - timestampAdjuster.b(j6);
                psDurationReader.f18052h = jB;
                if (jB < 0) {
                    Log.g("PsDurationReader", "Invalid duration: " + psDurationReader.f18052h + ". Using TIME_UNSET instead.");
                    psDurationReader.f18052h = -9223372036854775807L;
                }
                psDurationReader.a((DefaultExtractorInput) extractorInput);
                return 0;
            }
            DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
            int iMin2 = (int) Math.min(20000L, defaultExtractorInput2.f17527c);
            long j7 = 0;
            if (defaultExtractorInput2.d != j7) {
                positionHolder.f17554a = j7;
                return 1;
            }
            parsableByteArray.C(iMin2);
            defaultExtractorInput2.f = 0;
            defaultExtractorInput2.peekFully(parsableByteArray.f18956a, 0, iMin2, false);
            int i4 = parsableByteArray.f18958c;
            for (int i5 = parsableByteArray.f18957b; i5 < i4 - 3; i5++) {
                if (PsDurationReader.b(i5, parsableByteArray.f18956a) == 442) {
                    parsableByteArray.F(i5 + 4);
                    long jC2 = PsDurationReader.c(parsableByteArray);
                    if (jC2 != -9223372036854775807L) {
                        j = jC2;
                        psDurationReader.f = j;
                        psDurationReader.d = true;
                        return 0;
                    }
                }
            }
            j = -9223372036854775807L;
            psDurationReader.f = j;
            psDurationReader.d = true;
            return 0;
        }
        if (this.k) {
            r2 = 0;
        } else {
            this.k = true;
            long j8 = psDurationReader.f18052h;
            if (j8 != -9223372036854775807L) {
                r2 = 0;
                PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new PsBinarySearchSeeker.PsScrSeeker(psDurationReader.f18048a), j8, j8 + 1, 0L, j3, 188L, 1000);
                this.f18058i = psBinarySearchSeeker;
                this.j.g(psBinarySearchSeeker.f17502a);
            } else {
                r2 = 0;
                this.j.g(new SeekMap.Unseekable(j8));
            }
        }
        PsBinarySearchSeeker psBinarySearchSeeker2 = this.f18058i;
        if (psBinarySearchSeeker2 != null && psBinarySearchSeeker2.f17504c != null) {
            return psBinarySearchSeeker2.a((DefaultExtractorInput) extractorInput, positionHolder);
        }
        DefaultExtractorInput defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput3.f = r2;
        long peekPosition = j3 != -1 ? j3 - defaultExtractorInput3.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        ParsableByteArray parsableByteArray2 = this.f18055c;
        if (!defaultExtractorInput3.peekFully(parsableByteArray2.f18956a, r2, 4, true)) {
            return -1;
        }
        parsableByteArray2.F(r2);
        int iG = parsableByteArray2.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            defaultExtractorInput3.peekFully(parsableByteArray2.f18956a, r2, 10, r2);
            parsableByteArray2.F(9);
            defaultExtractorInput3.skipFully((parsableByteArray2.u() & 7) + 14);
            return r2;
        }
        if (iG == 443) {
            defaultExtractorInput3.peekFully(parsableByteArray2.f18956a, r2, 2, r2);
            parsableByteArray2.F(r2);
            defaultExtractorInput3.skipFully(parsableByteArray2.z() + 6);
            return r2;
        }
        if (((iG & (-256)) >> 8) != 1) {
            defaultExtractorInput3.skipFully(1);
            return r2;
        }
        int i6 = iG & 255;
        SparseArray sparseArray = this.f18054b;
        PesReader pesReader = (PesReader) sparseArray.get(i6);
        if (!this.f18056e) {
            if (pesReader == null) {
                ElementaryStreamReader elementaryStreamReader = null;
                if (i6 == 189) {
                    h262Reader = new Ac3Reader(null);
                    this.f = true;
                    this.f18057h = defaultExtractorInput3.d;
                } else if ((iG & 224) == 192) {
                    h262Reader = new MpegAudioReader(null);
                    this.f = true;
                    this.f18057h = defaultExtractorInput3.d;
                } else if ((iG & com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    h262Reader = new H262Reader(null);
                    this.g = true;
                    this.f18057h = defaultExtractorInput3.d;
                } else if (elementaryStreamReader != null) {
                    elementaryStreamReader.d(this.j, new TsPayloadReader.TrackIdGenerator(i6, 256));
                    pesReader = new PesReader(elementaryStreamReader, this.f18053a);
                    sparseArray.put(i6, pesReader);
                }
                elementaryStreamReader = h262Reader;
                if (elementaryStreamReader != null) {
                    elementaryStreamReader.d(this.j, new TsPayloadReader.TrackIdGenerator(i6, 256));
                    pesReader = new PesReader(elementaryStreamReader, this.f18053a);
                    sparseArray.put(i6, pesReader);
                }
            }
            if (defaultExtractorInput3.d > ((this.f && this.g) ? this.f18057h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f18056e = true;
                this.j.endTracks();
            }
        }
        defaultExtractorInput3.peekFully(parsableByteArray2.f18956a, r2, 2, r2);
        parsableByteArray2.F(r2);
        int iZ = parsableByteArray2.z() + 6;
        if (pesReader == null) {
            defaultExtractorInput3.skipFully(iZ);
            return r2;
        }
        parsableByteArray2.C(iZ);
        defaultExtractorInput3.readFully(parsableByteArray2.f18956a, r2, iZ, r2);
        parsableByteArray2.F(6);
        ParsableBitArray parsableBitArray = pesReader.f18061c;
        parsableByteArray2.e(parsableBitArray.f18952a, r2, 3);
        parsableBitArray.l(r2);
        parsableBitArray.n(8);
        pesReader.d = parsableBitArray.f();
        pesReader.f18062e = parsableBitArray.f();
        parsableBitArray.n(6);
        parsableByteArray2.e(parsableBitArray.f18952a, r2, parsableBitArray.g(8));
        parsableBitArray.l(r2);
        pesReader.g = 0L;
        if (pesReader.d) {
            parsableBitArray.n(4);
            long jG = ((long) parsableBitArray.g(3)) << 30;
            parsableBitArray.n(1);
            long jG2 = jG | ((long) (parsableBitArray.g(15) << 15));
            parsableBitArray.n(1);
            long jG3 = jG2 | ((long) parsableBitArray.g(15));
            parsableBitArray.n(1);
            boolean z3 = pesReader.f;
            TimestampAdjuster timestampAdjuster2 = pesReader.f18060b;
            if (!z3 && pesReader.f18062e) {
                parsableBitArray.n(4);
                long jG4 = ((long) parsableBitArray.g(3)) << 30;
                parsableBitArray.n(1);
                long jG5 = jG4 | ((long) (parsableBitArray.g(15) << 15));
                parsableBitArray.n(1);
                long jG6 = jG5 | ((long) parsableBitArray.g(15));
                parsableBitArray.n(1);
                timestampAdjuster2.b(jG6);
                pesReader.f = true;
            }
            pesReader.g = timestampAdjuster2.b(jG3);
        }
        long j9 = pesReader.g;
        ElementaryStreamReader elementaryStreamReader2 = pesReader.f18059a;
        elementaryStreamReader2.c(4, j9);
        elementaryStreamReader2.b(parsableByteArray2);
        elementaryStreamReader2.packetFinished();
        parsableByteArray2.E(parsableByteArray2.f18956a.length);
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
        long j3;
        TimestampAdjuster timestampAdjuster = this.f18053a;
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
        PsBinarySearchSeeker psBinarySearchSeeker = this.f18058i;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.c(j2);
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f18054b;
            if (i2 >= sparseArray.size()) {
                return;
            }
            PesReader pesReader = (PesReader) sparseArray.valueAt(i2);
            pesReader.f = false;
            pesReader.f18059a.seek();
            i2++;
        }
    }
}
