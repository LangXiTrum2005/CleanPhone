package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[4];
    private final CsdBuffer csdBuffer = new CsdBuffer(128);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i10) {
            this.data = new byte[i10];
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.isFilling) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i13 = this.length + i12;
                if (length < i13) {
                    this.data = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.data, this.length, i12);
                this.length += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            if (this.isFilling) {
                int i12 = this.length - i11;
                this.length = i12;
                if (this.sequenceExtensionPosition != 0 || i10 != H262Reader.START_EXTENSION) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i12;
            } else if (i10 == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x007b  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str) {
        float f10;
        int i10;
        float f11;
        int i11;
        long j10;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i14 = bArrCopyOf[4] & 255;
        byte b10 = bArrCopyOf[5];
        int i15 = (i14 << 4) | ((b10 & 255) >> 4);
        int i16 = ((b10 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i17 = (bArrCopyOf[7] & 240) >> 4;
        if (i17 == 2) {
            f10 = i16 * 4;
            i10 = i15 * 3;
        } else {
            if (i17 != 3) {
                if (i17 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i16 * 121;
                    i10 = i15 * 100;
                }
                Format formatCreateVideoSampleFormat = Format.createVideoSampleFormat(str, MimeTypes.VIDEO_MPEG2, null, -1, -1, i15, i16, -1.0f, Collections.singletonList(bArrCopyOf), -1, f11, null);
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = FRAME_RATE_VALUES;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b11 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        i12 = (b11 & 96) >> 5;
                        i13 = b11 & 31;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    } else {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                return Pair.create(formatCreateVideoSampleFormat, Long.valueOf(j10));
            }
            f10 = i16 * 16;
            i10 = i15 * 9;
        }
        f11 = f10 / i10;
        Format formatCreateVideoSampleFormat2 = Format.createVideoSampleFormat(str, MimeTypes.VIDEO_MPEG2, null, -1, -1, i15, i16, -1.0f, Collections.singletonList(bArrCopyOf), -1, f11, null);
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = FRAME_RATE_VALUES;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b12 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                i12 = (b12 & 96) >> 5;
                i13 = b12 & 31;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            } else {
                j10 = 0;
            }
        } else {
            j10 = 0;
        }
        return Pair.create(formatCreateVideoSampleFormat2, Long.valueOf(j10));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        boolean z10;
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] bArr = parsableByteArray.data;
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(bArr, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i10 = iFindNalUnit + 3;
            int i11 = parsableByteArray.data[i10] & 255;
            if (!this.hasOutputFormat) {
                int i12 = iFindNalUnit - position;
                if (i12 > 0) {
                    this.csdBuffer.onData(bArr, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i11, i12 < 0 ? -i12 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, this.formatId);
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            if (i11 == 0 || i11 == START_SEQUENCE_HEADER) {
                int i13 = iLimit - iFindNalUnit;
                if (this.startedFirstSample && this.sampleHasPicture && this.hasOutputFormat) {
                    this.output.sampleMetadata(this.sampleTimeUs, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i13, i13, null);
                }
                boolean z11 = this.startedFirstSample;
                if (!z11 || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i13);
                    long j10 = this.pesTimeUs;
                    if (j10 == C.TIME_UNSET) {
                        j10 = z11 ? this.sampleTimeUs + this.frameDurationUs : 0L;
                    }
                    this.sampleTimeUs = j10;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = C.TIME_UNSET;
                    z10 = true;
                    this.startedFirstSample = true;
                } else {
                    z10 = true;
                }
                this.sampleHasPicture = i11 == 0 ? z10 : false;
            } else if (i11 == START_GROUP) {
                this.sampleIsKeyframe = true;
            }
            position = i10;
        }
        if (this.hasOutputFormat) {
            return;
        }
        this.csdBuffer.onData(bArr, position, iLimit);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j10, boolean z10) {
        this.pesTimeUs = j10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }
}
