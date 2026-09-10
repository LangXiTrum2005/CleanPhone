package androidx.media3.extractor.ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.media3.common.util.Assertions;
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
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class PsExtractor implements Extractor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7609e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PsBinarySearchSeeker f7611i;
    public ExtractorOutput j;
    public boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimestampAdjuster f7606a = new TimestampAdjuster(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7608c = new ParsableByteArray(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f7607b = new SparseArray();
    public final PsDurationReader d = new PsDurationReader();

    public static final class PesReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ElementaryStreamReader f7612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimestampAdjuster f7613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParsableBitArray f7614c = new ParsableBitArray(new byte[64], 64);
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7615e;
        public boolean f;
        public long g;

        public PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.f7612a = elementaryStreamReader;
            this.f7613b = timestampAdjuster;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
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

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.j = extractorOutput;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
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
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        ?? r2;
        ParsableByteArray parsableByteArray;
        ElementaryStreamReader h262Reader;
        Assertions.f(this.j);
        long j = ((DefaultExtractorInput) extractorInput).f6741c;
        long j2 = -9223372036854775807L;
        PsDurationReader psDurationReader = this.d;
        if (j != -1 && !psDurationReader.f7603c) {
            boolean z2 = psDurationReader.f7604e;
            ParsableByteArray parsableByteArray2 = psDurationReader.f7602b;
            if (!z2) {
                DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                long j3 = defaultExtractorInput.f6741c;
                int iMin = (int) Math.min(20000L, j3);
                long j4 = j3 - ((long) iMin);
                if (defaultExtractorInput.d != j4) {
                    positionHolder.f6793a = j4;
                    return 1;
                }
                parsableByteArray2.D(iMin);
                defaultExtractorInput.f = 0;
                defaultExtractorInput.peekFully(parsableByteArray2.f5667a, 0, iMin, false);
                int i2 = parsableByteArray2.f5668b;
                for (int i3 = parsableByteArray2.f5669c - 4; i3 >= i2; i3--) {
                    if (PsDurationReader.b(i3, parsableByteArray2.f5667a) == 442) {
                        parsableByteArray2.G(i3 + 4);
                        long jC = PsDurationReader.c(parsableByteArray2);
                        if (jC != -9223372036854775807L) {
                            j2 = jC;
                            break;
                        }
                    }
                }
                psDurationReader.g = j2;
                psDurationReader.f7604e = true;
                return 0;
            }
            if (psDurationReader.g == -9223372036854775807L) {
                psDurationReader.a((DefaultExtractorInput) extractorInput);
                return 0;
            }
            if (psDurationReader.d) {
                long j5 = psDurationReader.f;
                if (j5 == -9223372036854775807L) {
                    psDurationReader.a((DefaultExtractorInput) extractorInput);
                    return 0;
                }
                TimestampAdjuster timestampAdjuster = psDurationReader.f7601a;
                psDurationReader.f7605h = timestampAdjuster.c(psDurationReader.g) - timestampAdjuster.b(j5);
                psDurationReader.a((DefaultExtractorInput) extractorInput);
                return 0;
            }
            DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
            int iMin2 = (int) Math.min(20000L, defaultExtractorInput2.f6741c);
            long j6 = 0;
            if (defaultExtractorInput2.d != j6) {
                positionHolder.f6793a = j6;
                return 1;
            }
            parsableByteArray2.D(iMin2);
            defaultExtractorInput2.f = 0;
            defaultExtractorInput2.peekFully(parsableByteArray2.f5667a, 0, iMin2, false);
            int i4 = parsableByteArray2.f5669c;
            for (int i5 = parsableByteArray2.f5668b; i5 < i4 - 3; i5++) {
                if (PsDurationReader.b(i5, parsableByteArray2.f5667a) == 442) {
                    parsableByteArray2.G(i5 + 4);
                    long jC2 = PsDurationReader.c(parsableByteArray2);
                    if (jC2 != -9223372036854775807L) {
                        j2 = jC2;
                        break;
                    }
                }
            }
            psDurationReader.f = j2;
            psDurationReader.d = true;
            return 0;
        }
        if (this.k) {
            r2 = 0;
        } else {
            this.k = true;
            long j7 = psDurationReader.f7605h;
            if (j7 != -9223372036854775807L) {
                r2 = 0;
                PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new PsBinarySearchSeeker.PsScrSeeker(psDurationReader.f7601a), j7, j7 + 1, 0L, j, 188L, 1000);
                this.f7611i = psBinarySearchSeeker;
                this.j.e(psBinarySearchSeeker.f6716a);
            } else {
                r2 = 0;
                this.j.e(new SeekMap.Unseekable(j7));
            }
        }
        PsBinarySearchSeeker psBinarySearchSeeker2 = this.f7611i;
        if (psBinarySearchSeeker2 != null && psBinarySearchSeeker2.f6718c != null) {
            return psBinarySearchSeeker2.a((DefaultExtractorInput) extractorInput, positionHolder);
        }
        DefaultExtractorInput defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput3.f = r2;
        long peekPosition = j != -1 ? j - defaultExtractorInput3.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        ParsableByteArray parsableByteArray3 = this.f7608c;
        if (!defaultExtractorInput3.peekFully(parsableByteArray3.f5667a, r2, 4, true)) {
            return -1;
        }
        parsableByteArray3.G(r2);
        int iG = parsableByteArray3.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            defaultExtractorInput3.peekFully(parsableByteArray3.f5667a, r2, 10, r2);
            parsableByteArray3.G(9);
            defaultExtractorInput3.skipFully((parsableByteArray3.u() & 7) + 14);
            return r2;
        }
        if (iG == 443) {
            defaultExtractorInput3.peekFully(parsableByteArray3.f5667a, r2, 2, r2);
            parsableByteArray3.G(r2);
            defaultExtractorInput3.skipFully(parsableByteArray3.A() + 6);
            return r2;
        }
        if (((iG & (-256)) >> 8) != 1) {
            defaultExtractorInput3.skipFully(1);
            return r2;
        }
        int i6 = iG & 255;
        SparseArray sparseArray = this.f7607b;
        PesReader pesReader = (PesReader) sparseArray.get(i6);
        if (!this.f7609e) {
            if (pesReader == null) {
                if (i6 == 189) {
                    h262Reader = new Ac3Reader();
                    this.f = true;
                    this.f7610h = defaultExtractorInput3.d;
                } else if ((iG & 224) == 192) {
                    h262Reader = new MpegAudioReader(null, r2);
                    this.f = true;
                    this.f7610h = defaultExtractorInput3.d;
                } else if ((iG & com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    h262Reader = new H262Reader(null);
                    this.g = true;
                    this.f7610h = defaultExtractorInput3.d;
                } else {
                    h262Reader = null;
                }
                if (h262Reader != null) {
                    h262Reader.e(this.j, new TsPayloadReader.TrackIdGenerator(i6, 256));
                    pesReader = new PesReader(h262Reader, this.f7606a);
                    sparseArray.put(i6, pesReader);
                }
            }
            if (defaultExtractorInput3.d > ((this.f && this.g) ? this.f7610h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f7609e = true;
                this.j.endTracks();
            }
        }
        defaultExtractorInput3.peekFully(parsableByteArray3.f5667a, r2, 2, r2);
        parsableByteArray3.G(r2);
        int iA = parsableByteArray3.A() + 6;
        if (pesReader == null) {
            defaultExtractorInput3.skipFully(iA);
            return r2;
        }
        parsableByteArray3.D(iA);
        defaultExtractorInput3.readFully(parsableByteArray3.f5667a, r2, iA, r2);
        parsableByteArray3.G(6);
        ParsableBitArray parsableBitArray = pesReader.f7614c;
        parsableByteArray3.e(parsableBitArray.f5663a, r2, 3);
        parsableBitArray.m(r2);
        parsableBitArray.o(8);
        pesReader.d = parsableBitArray.f();
        pesReader.f7615e = parsableBitArray.f();
        parsableBitArray.o(6);
        parsableByteArray3.e(parsableBitArray.f5663a, r2, parsableBitArray.g(8));
        parsableBitArray.m(r2);
        pesReader.g = 0L;
        if (pesReader.d) {
            parsableBitArray.o(4);
            long jG = ((long) parsableBitArray.g(3)) << 30;
            parsableBitArray.o(1);
            long jG2 = jG | ((long) (parsableBitArray.g(15) << 15));
            parsableBitArray.o(1);
            long jG3 = jG2 | ((long) parsableBitArray.g(15));
            parsableBitArray.o(1);
            boolean z3 = pesReader.f;
            TimestampAdjuster timestampAdjuster2 = pesReader.f7613b;
            if (!z3 && pesReader.f7615e) {
                parsableBitArray.o(4);
                long jG4 = ((long) parsableBitArray.g(3)) << 30;
                parsableBitArray.o(1);
                long jG5 = ((long) (parsableBitArray.g(15) << 15)) | jG4;
                parsableBitArray.o(1);
                long jG6 = jG5 | ((long) parsableBitArray.g(15));
                parsableBitArray.o(1);
                timestampAdjuster2.b(jG6);
                pesReader.f = true;
            }
            pesReader.g = timestampAdjuster2.b(jG3);
            parsableByteArray = parsableByteArray3;
        } else {
            parsableByteArray = parsableByteArray3;
        }
        long j8 = pesReader.g;
        ElementaryStreamReader elementaryStreamReader = pesReader.f7612a;
        elementaryStreamReader.c(4, j8);
        elementaryStreamReader.a(parsableByteArray);
        elementaryStreamReader.d(false);
        parsableByteArray.F(parsableByteArray.f5667a.length);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        long j3;
        TimestampAdjuster timestampAdjuster = this.f7606a;
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
        PsBinarySearchSeeker psBinarySearchSeeker = this.f7611i;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.c(j2);
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f7607b;
            if (i2 >= sparseArray.size()) {
                return;
            }
            PesReader pesReader = (PesReader) sparseArray.valueAt(i2);
            pesReader.f = false;
            pesReader.f7612a.seek();
            i2++;
        }
    }
}
