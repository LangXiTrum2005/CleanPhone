package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.audio.Ac3Util;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.AvcConfig;
import com.mbridge.msdk.playercommon.exoplayer2.video.HevcConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 3;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_vide = Util.getIntegerCodeForString("vide");
    private static final int TYPE_soun = Util.getIntegerCodeForString("soun");
    private static final int TYPE_text = Util.getIntegerCodeForString("text");
    private static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
    private static final int TYPE_subt = Util.getIntegerCodeForString("subt");
    private static final int TYPE_clcp = Util.getIntegerCodeForString("clcp");
    private static final int TYPE_meta = Util.getIntegerCodeForString(Constants.REFERRER_API_META);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z10) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z10;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            Assertions.checkState(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i10 = this.index + 1;
            this.index = i10;
            if (i10 == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i11 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i11;
                this.nextSamplesPerChunkChangeIndex = i11 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface SampleSizeBox {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i10) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fixedSampleSize = parsableByteArray.readUnsignedIntToInt();
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return this.fixedSampleSize != 0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i10 = this.fixedSampleSize;
            return i10 == 0 ? this.data.readUnsignedIntToInt() : i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i10 = this.fieldSize;
            if (i10 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i10 == 16) {
                return this.data.readUnsignedShort();
            }
            int i11 = this.sampleIndex;
            this.sampleIndex = i11 + 1;
            if (i11 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class TkhdData {
        private final long duration;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f35131id;
        private final int rotationDegrees;

        public TkhdData(int i10, long j10, int i11) {
            this.f35131id = i10;
            this.duration = j10;
            this.rotationDegrees = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class UnhandledEditListException extends ParserException {
    }

    private AtomParsers() {
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[Util.constrainValue(3, 0, length)] && jArr[Util.constrainValue(jArr.length - 3, 0, length)] < j12 && j12 <= j10;
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i10, int i11) {
        int position = parsableByteArray.getPosition();
        while (position - i10 < i11) {
            parsableByteArray.setPosition(position);
            int i12 = parsableByteArray.readInt();
            Assertions.checkArgument(i12 > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_esds) {
                return position;
            }
            position += i12;
        }
        return -1;
    }

    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, String str, boolean z10, DrmInitData drmInitData, StsdData stsdData, int i14) throws ParserException {
        int unsignedShort;
        int unsignedFixedPoint1616;
        int unsignedIntToInt;
        String str2;
        int i15;
        DrmInitData drmInitData2;
        int i16;
        String str3;
        int i17;
        boolean z11;
        int i18;
        int i19 = i11;
        int i20 = i12;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i19 + 16);
        if (z10) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        int i21 = 2;
        boolean z12 = true;
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            unsignedIntToInt = unsignedShort2;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
        }
        int position = parsableByteArray.getPosition();
        int iIntValue = i10;
        if (iIntValue == Atom.TYPE_enca) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i19, i20);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i14] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        int i22 = Atom.TYPE_ac_3;
        String str4 = MimeTypes.AUDIO_RAW;
        if (iIntValue == i22) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == Atom.TYPE_ec_3) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == Atom.TYPE_dtsc) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == Atom.TYPE_dtsh || iIntValue == Atom.TYPE_dtsl) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == Atom.TYPE_dtse) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == Atom.TYPE_samr) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (iIntValue == Atom.TYPE_sawb) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else if (iIntValue == Atom.TYPE_lpcm || iIntValue == Atom.TYPE_sowt) {
            str2 = MimeTypes.AUDIO_RAW;
        } else if (iIntValue == Atom.TYPE__mp3) {
            str2 = MimeTypes.AUDIO_MPEG;
        } else {
            str2 = iIntValue == Atom.TYPE_alac ? MimeTypes.AUDIO_ALAC : null;
        }
        int i23 = unsignedFixedPoint1616;
        String str5 = str2;
        int i24 = i23;
        int iIntValue2 = unsignedIntToInt;
        int i25 = position;
        byte[] bArr = null;
        while (i25 - i19 < i20) {
            parsableByteArray.setPosition(i25);
            int i26 = parsableByteArray.readInt();
            Assertions.checkArgument(i26 > 0 ? z12 : false, "childAtomSize should be positive");
            int i27 = parsableByteArray.readInt();
            int i28 = Atom.TYPE_esds;
            if (i27 == i28 || (z10 && i27 == Atom.TYPE_wave)) {
                i15 = i25;
                drmInitData2 = drmInitData3;
                i16 = i26;
                str3 = str4;
                i17 = 2;
                z11 = true;
                i18 = i24;
                int iFindEsdsPosition = i27 == i28 ? i15 : findEsdsPosition(parsableByteArray, i15, i16);
                if (iFindEsdsPosition != -1) {
                    Pair<String, byte[]> esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindEsdsPosition);
                    str5 = (String) esdsFromParent.first;
                    bArr = (byte[]) esdsFromParent.second;
                    if (MimeTypes.AUDIO_AAC.equals(str5)) {
                        Pair<Integer, Integer> aacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                        int iIntValue3 = ((Integer) aacAudioSpecificConfig.first).intValue();
                        iIntValue2 = ((Integer) aacAudioSpecificConfig.second).intValue();
                        i24 = iIntValue3;
                    }
                }
                i25 = i16 + i15;
                str4 = str3;
                drmInitData3 = drmInitData2;
                i21 = i17;
                z12 = z11;
                i19 = i11;
                i20 = i12;
            } else {
                if (i27 == Atom.TYPE_dac3) {
                    parsableByteArray.setPosition(i25 + 8);
                    stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i13), str, drmInitData3);
                } else if (i27 == Atom.TYPE_dec3) {
                    parsableByteArray.setPosition(i25 + 8);
                    stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i13), str, drmInitData3);
                } else if (i27 == Atom.TYPE_ddts) {
                    drmInitData2 = drmInitData3;
                    i18 = i24;
                    i15 = i25;
                    i16 = i26;
                    str3 = str4;
                    i17 = 2;
                    z11 = true;
                    stsdData.format = Format.createAudioSampleFormat(Integer.toString(i13), str5, null, -1, -1, iIntValue2, i18, null, drmInitData2, 0, str);
                } else {
                    i15 = i25;
                    drmInitData2 = drmInitData3;
                    i16 = i26;
                    str3 = str4;
                    i17 = 2;
                    z11 = true;
                    i18 = i24;
                    if (i27 == Atom.TYPE_alac) {
                        byte[] bArr2 = new byte[i16];
                        parsableByteArray.setPosition(i15);
                        parsableByteArray.readBytes(bArr2, 0, i16);
                        bArr = bArr2;
                    }
                }
                i15 = i25;
                drmInitData2 = drmInitData3;
                i16 = i26;
                str3 = str4;
                i17 = 2;
                z11 = true;
                i18 = i24;
            }
            i24 = i18;
            i25 = i16 + i15;
            str4 = str3;
            drmInitData3 = drmInitData2;
            i21 = i17;
            z12 = z11;
            i19 = i11;
            i20 = i12;
        }
        int i29 = i21;
        DrmInitData drmInitData4 = drmInitData3;
        String str6 = str4;
        int i30 = i24;
        if (stsdData.format != null || str5 == null) {
            return;
        }
        stsdData.format = Format.createAudioSampleFormat(Integer.toString(i13), str5, null, -1, -1, iIntValue2, i30, str6.equals(str5) ? i29 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData4, 0, str);
    }

    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            parsableByteArray.setPosition(i12);
            int i15 = parsableByteArray.readInt();
            int i16 = parsableByteArray.readInt();
            if (i16 == Atom.TYPE_frma) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i16 == Atom.TYPE_schm) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i16 == Atom.TYPE_schi) {
                i13 = i12;
                i14 = i15;
            }
            i12 += i15;
        }
        if (!C.CENC_TYPE_cenc.equals(string) && !C.CENC_TYPE_cbc1.equals(string) && !C.CENC_TYPE_cens.equals(string) && !C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        Assertions.checkArgument(numValueOf != null, "frma atom is mandatory");
        Assertions.checkArgument(i13 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i13, i14, string);
        Assertions.checkArgument(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, schiFromParent);
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType;
        if (containerAtom == null || (leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst)) == null) {
            return Pair.create(null, null);
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            jArr[i10] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i10] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.setPosition(i10 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i10 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i10 = (i10 << 7) | (unsignedByte & 127);
        }
        return i10;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        int i10 = parsableByteArray.readInt();
        if (i10 == TYPE_soun) {
            return 1;
        }
        if (i10 == TYPE_vide) {
            return 2;
        }
        if (i10 == TYPE_text || i10 == TYPE_sbtl || i10 == TYPE_subt || i10 == TYPE_clcp) {
            return 3;
        }
        return i10 == TYPE_meta ? 4 : -1;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i10) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    private static Metadata parseMetaAtom(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int i11 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_ilst) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i11);
            }
            parsableByteArray.skipBytes(i11 - 8);
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.setPosition(i10 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            parsableByteArray.setPosition(i12);
            int i13 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_proj) {
                return Arrays.copyOfRange(parsableByteArray.data, i12, i13 + i12);
            }
            i12 += i13;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i10, int i11) {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i10 < i11) {
            parsableByteArray.setPosition(position);
            int i12 = parsableByteArray.readInt();
            Assertions.checkArgument(i12 > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_sinf && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i12)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i12;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            parsableByteArray.setPosition(i14);
            int i15 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_tenc) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i12 = unsignedByte & 15;
                    i13 = (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z10 = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z10 && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z10, str, unsignedByte2, bArr2, i13, i12, bArr);
            }
            i14 += i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x0166 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101 A[ADDED_TO_REGION, LOOP:1: B:49:0x0101->B:50:0x0103, LOOP_START, PHI: r2 r7 r29
  0x0101: PHI (r2v33 int) = (r2v29 int), (r2v36 int) binds: [B:48:0x00ff, B:50:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r7v22 int) = (r7v21 int), (r7v25 int) binds: [B:48:0x00ff, B:50:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r29v4 long) = (r29v3 long), (r29v6 long) binds: [B:48:0x00ff, B:50:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0103 A[LOOP:1: B:49:0x0101->B:50:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0119 A[ADDED_TO_REGION, LOOP:2: B:53:0x0119->B:55:0x011d, LOOP_START, PHI: r4 r15 r23
  0x0119: PHI (r4v17 int) = (r4v15 int), (r4v18 int) binds: [B:52:0x0117, B:55:0x011d] A[DONT_GENERATE, DONT_INLINE]
  0x0119: PHI (r15v8 int) = (r15v4 int), (r15v9 int) binds: [B:52:0x0117, B:55:0x011d] A[DONT_GENERATE, DONT_INLINE]
  0x0119: PHI (r23v11 int) = (r23v9 int), (r23v13 int) binds: [B:52:0x0117, B:55:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0179  */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dc A[LOOP:8: B:93:0x01d6->B:95:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0218  */
    /* JADX WARN: Multi-variable type inference failed */
    public static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z10;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int i10;
        int i11;
        int i12;
        int i13;
        long[] jArr;
        int[] iArr;
        int i14;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long j10;
        int i15;
        long jScaleLargeTimestamp;
        Track track2;
        long[] jArr4;
        long[] jArr5;
        long[] jArr6;
        int[] iArr4;
        ParsableByteArray parsableByteArray;
        long[] jArr7;
        int[] iArr5;
        int unsignedIntToInt3;
        SampleSizeBox sampleSizeBox;
        int i16;
        int i17;
        int i18;
        int unsignedIntToInt4;
        long j11;
        long j12;
        boolean z11;
        boolean z12;
        int nextSampleSize;
        int i19;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], C.TIME_UNSET);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_co64);
            z10 = true;
        } else {
            z10 = false;
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stsc).data;
        ParsableByteArray parsableByteArray4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stts).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray5 = null;
        ParsableByteArray parsableByteArray6 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray7 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray3, parsableByteArray2, z10);
        parsableByteArray4.setPosition(12);
        int unsignedIntToInt5 = parsableByteArray4.readUnsignedIntToInt() - 1;
        int unsignedIntToInt6 = parsableByteArray4.readUnsignedIntToInt();
        int unsignedIntToInt7 = parsableByteArray4.readUnsignedIntToInt();
        if (parsableByteArray7 != null) {
            parsableByteArray7.setPosition(12);
            unsignedIntToInt = parsableByteArray7.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        int unsignedIntToInt8 = -1;
        if (parsableByteArray6 != null) {
            parsableByteArray6.setPosition(12);
            unsignedIntToInt2 = parsableByteArray6.readUnsignedIntToInt();
            unsignedIntToInt8 = unsignedIntToInt2 > 0 ? parsableByteArray6.readUnsignedIntToInt() - 1 : -1;
            if (stz2SampleSizeBox.isFixedSampleSize()) {
                i10 = 0;
                if (!MimeTypes.AUDIO_RAW.equals(track.format.sampleMimeType) && unsignedIntToInt5 == 0 && unsignedIntToInt == 0 && unsignedIntToInt2 == 0) {
                    i11 = 1;
                }
                String str = TAG;
                if (i11 == 0) {
                    jArr6 = new long[sampleCount];
                    i13 = 1;
                    iArr4 = new int[sampleCount];
                    parsableByteArray = parsableByteArray7;
                    jArr7 = new long[sampleCount];
                    iArr5 = new int[sampleCount];
                    unsignedIntToInt3 = unsignedIntToInt8;
                    sampleSizeBox = stz2SampleSizeBox;
                    i16 = i10;
                    i17 = i16;
                    i18 = i17;
                    i14 = i18;
                    unsignedIntToInt4 = i14;
                    j11 = 0;
                    j12 = 0;
                    while (i16 < sampleCount) {
                        while (i18 == 0) {
                            Assertions.checkState(chunkIterator.moveNext());
                            long j13 = chunkIterator.offset;
                            i18 = chunkIterator.numSamples;
                            j12 = j13;
                            sampleCount = sampleCount;
                        }
                        int i20 = sampleCount;
                        if (parsableByteArray != null) {
                            while (unsignedIntToInt4 == 0 && unsignedIntToInt > 0) {
                                unsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                                i17 = parsableByteArray.readInt();
                                unsignedIntToInt--;
                            }
                            unsignedIntToInt4--;
                        }
                        jArr6[i16] = j12;
                        nextSampleSize = sampleSizeBox.readNextSampleSize();
                        iArr4[i16] = nextSampleSize;
                        if (nextSampleSize > i14) {
                            i14 = nextSampleSize;
                        }
                        jArr7[i16] = j11 + ((long) i17);
                        if (parsableByteArray5 == null) {
                            i19 = 1;
                        } else {
                            i19 = i10;
                        }
                        iArr5[i16] = i19;
                        if (i16 == unsignedIntToInt3) {
                            iArr5[i16] = 1;
                            unsignedIntToInt2--;
                            if (unsignedIntToInt2 > 0) {
                                unsignedIntToInt3 = parsableByteArray5.readUnsignedIntToInt() - 1;
                            }
                        }
                        j11 += (long) unsignedIntToInt7;
                        unsignedIntToInt6--;
                        if (unsignedIntToInt6 != 0 && unsignedIntToInt5 > 0) {
                            unsignedIntToInt5--;
                            unsignedIntToInt6 = parsableByteArray4.readUnsignedIntToInt();
                            unsignedIntToInt7 = parsableByteArray4.readInt();
                        }
                        j12 += (long) iArr4[i16];
                        i18--;
                        i16++;
                        sampleCount = i20;
                    }
                    i12 = sampleCount;
                    long j14 = j11 + ((long) i17);
                    if (unsignedIntToInt4 == 0) {
                        z11 = 1;
                    } else {
                        z11 = i10;
                    }
                    Assertions.checkArgument(z11);
                    while (unsignedIntToInt > 0) {
                        if (parsableByteArray.readUnsignedIntToInt() == 0) {
                            z12 = 1;
                        } else {
                            z12 = i10;
                        }
                        Assertions.checkArgument(z12);
                        parsableByteArray.readInt();
                        unsignedIntToInt--;
                    }
                    if (unsignedIntToInt2 == 0 || unsignedIntToInt6 != 0 || i18 != 0 || unsignedIntToInt5 != 0) {
                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                        d.o(sb2, track.f35132id, ": remainingSynchronizationSamples ", unsignedIntToInt2, ", remainingSamplesAtTimestampDelta ");
                        d.o(sb2, unsignedIntToInt6, ", remainingSamplesInChunk ", i18, ", remainingTimestampDeltaChanges ");
                        sb2.append(unsignedIntToInt5);
                        Log.w(TAG, sb2.toString());
                    }
                    iArr2 = iArr5;
                    jArr2 = jArr7;
                    jArr3 = jArr6;
                    iArr3 = iArr4;
                    j10 = j14;
                } else {
                    i12 = sampleCount;
                    i13 = 1;
                    int i21 = chunkIterator.length;
                    jArr = new long[i21];
                    iArr = new int[i21];
                    while (chunkIterator.moveNext()) {
                        int i22 = chunkIterator.index;
                        jArr[i22] = chunkIterator.offset;
                        iArr[i22] = chunkIterator.numSamples;
                    }
                    Format format = track.format;
                    FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format.pcmEncoding, format.channelCount), jArr, iArr, unsignedIntToInt7);
                    long[] jArr8 = resultsRechunk.offsets;
                    int[] iArr6 = resultsRechunk.sizes;
                    i14 = resultsRechunk.maximumSize;
                    long[] jArr9 = resultsRechunk.timestamps;
                    int[] iArr7 = resultsRechunk.flags;
                    long j15 = resultsRechunk.duration;
                    jArr2 = jArr9;
                    iArr2 = iArr7;
                    jArr3 = jArr8;
                    iArr3 = iArr6;
                    j10 = j15;
                }
                i15 = i14;
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(j10, 1000000L, track.timescale);
                if (track.editListDurations != null || gaplessInfoHolder.hasGaplessInfo()) {
                    long[] jArr10 = jArr3;
                    int[] iArr8 = iArr3;
                    long[] jArr11 = jArr2;
                    Util.scaleLargeTimestampsInPlace(jArr11, 1000000L, track.timescale);
                    return new TrackSampleTable(track, jArr10, iArr8, i15, jArr11, iArr2, jScaleLargeTimestamp);
                }
                long[] jArr12 = track.editListDurations;
                int i23 = i13;
                if (jArr12.length == i23 && track.type == i23 && jArr2.length >= 2) {
                    long j16 = track.editListMediaTimes[i10];
                    long jScaleLargeTimestamp2 = j16 + Util.scaleLargeTimestamp(jArr12[i10], track.timescale, track.movieTimescale);
                    long j17 = j10;
                    long[] jArr13 = jArr2;
                    boolean zCanApplyEditWithGaplessInfo = canApplyEditWithGaplessInfo(jArr13, j17, j16, jScaleLargeTimestamp2);
                    j10 = j17;
                    if (zCanApplyEditWithGaplessInfo) {
                        long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j16 - jArr13[i10], track.format.sampleRate, track.timescale);
                        long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j10 - jScaleLargeTimestamp2, track.format.sampleRate, track.timescale);
                        if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                            gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                            gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                            Util.scaleLargeTimestampsInPlace(jArr13, 1000000L, track.timescale);
                            return new TrackSampleTable(track, jArr3, iArr3, i15, jArr13, iArr2, jScaleLargeTimestamp);
                        }
                    }
                    jArr4 = jArr13;
                    track2 = track;
                } else {
                    track2 = track;
                    jArr4 = jArr2;
                }
                long[] jArr14 = track2.editListDurations;
                if (jArr14.length == 1 && jArr14[i10] == 0) {
                    long j18 = track2.editListMediaTimes[i10];
                    for (int i24 = i10; i24 < jArr4.length; i24++) {
                        jArr4[i24] = Util.scaleLargeTimestamp(jArr4[i24] - j18, 1000000L, track2.timescale);
                    }
                    return new TrackSampleTable(track2, jArr3, iArr3, i15, jArr4, iArr2, Util.scaleLargeTimestamp(j10 - j18, 1000000L, track2.timescale));
                }
                boolean z13 = track2.type == 1 ? 1 : i10;
                int i25 = i10;
                int i26 = i25;
                int i27 = i26;
                int i28 = i27;
                while (true) {
                    long[] jArr15 = track2.editListDurations;
                    if (i25 >= jArr15.length) {
                        break;
                    }
                    long j19 = track2.editListMediaTimes[i25];
                    if (j19 != -1) {
                        int i29 = i28;
                        long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(jArr15[i25], track2.timescale, track2.movieTimescale);
                        int iBinarySearchCeil = Util.binarySearchCeil(jArr4, j19, true, true);
                        int iBinarySearchCeil2 = Util.binarySearchCeil(jArr4, j19 + jScaleLargeTimestamp5, z13, (boolean) i10);
                        i26 += iBinarySearchCeil2 - iBinarySearchCeil;
                        int i30 = i27 != iBinarySearchCeil ? 1 : 0;
                        i27 = iBinarySearchCeil2;
                        i28 = i30 | i29;
                    }
                    i25++;
                    i15 = i15;
                    i10 = 0;
                }
                int i31 = i15;
                int i32 = (i26 != i12 ? 1 : 0) | i28;
                long[] jArr16 = i32 != 0 ? new long[i26] : jArr3;
                int[] iArr9 = i32 != 0 ? new int[i26] : iArr3;
                if (i32 != 0) {
                    i31 = 0;
                }
                int[] iArr10 = i32 != 0 ? new int[i26] : iArr2;
                long[] jArr17 = new long[i26];
                int i33 = i31;
                int i34 = 0;
                int i35 = 0;
                long j20 = 0;
                while (true) {
                    long[] jArr18 = track2.editListDurations;
                    int i36 = i32;
                    if (i34 >= jArr18.length) {
                        return new TrackSampleTable(track2, jArr16, iArr9, i33, jArr17, iArr10, Util.scaleLargeTimestamp(j20, 1000000L, track2.timescale));
                    }
                    int i37 = i33;
                    long j21 = track2.editListMediaTimes[i34];
                    long j22 = jArr18[i34];
                    if (j21 != -1) {
                        String str2 = str;
                        long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j22, track2.timescale, track2.movieTimescale) + j21;
                        jArr5 = jArr17;
                        int iBinarySearchCeil3 = Util.binarySearchCeil(jArr4, j21, true, true);
                        int iBinarySearchCeil4 = Util.binarySearchCeil(jArr4, jScaleLargeTimestamp6, z13, false);
                        if (i36 != 0) {
                            int i38 = iBinarySearchCeil4 - iBinarySearchCeil3;
                            System.arraycopy(jArr3, iBinarySearchCeil3, jArr16, i35, i38);
                            System.arraycopy(iArr3, iBinarySearchCeil3, iArr9, i35, i38);
                            System.arraycopy(iArr2, iBinarySearchCeil3, iArr10, i35, i38);
                        }
                        if (iBinarySearchCeil3 < iBinarySearchCeil4 && (iArr10[i35] & 1) == 0) {
                            Log.w(str2, "Ignoring edit list: edit does not start with a sync sample.");
                            throw new UnhandledEditListException();
                        }
                        str = str2;
                        int i39 = i37;
                        while (iBinarySearchCeil3 < iBinarySearchCeil4) {
                            long[] jArr19 = jArr3;
                            int[] iArr11 = iArr3;
                            jArr5[i35] = Util.scaleLargeTimestamp(j20, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(jArr4[iBinarySearchCeil3] - j21, 1000000L, track2.timescale);
                            if (i36 != 0 && iArr9[i35] > i39) {
                                i39 = iArr11[iBinarySearchCeil3];
                            }
                            i35++;
                            iBinarySearchCeil3++;
                            jArr3 = jArr19;
                            iArr3 = iArr11;
                        }
                        i33 = i39;
                    } else {
                        jArr5 = jArr17;
                        i33 = i37;
                    }
                    j20 += j22;
                    i34++;
                    i32 = i36;
                    jArr17 = jArr5;
                    jArr3 = jArr3;
                    iArr3 = iArr3;
                }
            } else {
                i10 = 0;
            }
            i11 = i10;
            String str3 = TAG;
            if (i11 == 0) {
                jArr6 = new long[sampleCount];
                i13 = 1;
                iArr4 = new int[sampleCount];
                parsableByteArray = parsableByteArray7;
                jArr7 = new long[sampleCount];
                iArr5 = new int[sampleCount];
                unsignedIntToInt3 = unsignedIntToInt8;
                sampleSizeBox = stz2SampleSizeBox;
                i16 = i10;
                i17 = i16;
                i18 = i17;
                i14 = i18;
                unsignedIntToInt4 = i14;
                j11 = 0;
                j12 = 0;
                while (i16 < sampleCount) {
                    while (i18 == 0) {
                        Assertions.checkState(chunkIterator.moveNext());
                        long j110 = chunkIterator.offset;
                        i18 = chunkIterator.numSamples;
                        j12 = j110;
                        sampleCount = sampleCount;
                    }
                    int i210 = sampleCount;
                    if (parsableByteArray != null) {
                        while (unsignedIntToInt4 == 0) {
                            unsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                            i17 = parsableByteArray.readInt();
                            unsignedIntToInt--;
                        }
                        unsignedIntToInt4--;
                    }
                    jArr6[i16] = j12;
                    nextSampleSize = sampleSizeBox.readNextSampleSize();
                    iArr4[i16] = nextSampleSize;
                    if (nextSampleSize > i14) {
                        i14 = nextSampleSize;
                    }
                    jArr7[i16] = j11 + ((long) i17);
                    if (parsableByteArray5 == null) {
                        i19 = 1;
                    } else {
                        i19 = i10;
                    }
                    iArr5[i16] = i19;
                    if (i16 == unsignedIntToInt3) {
                        iArr5[i16] = 1;
                        unsignedIntToInt2--;
                        if (unsignedIntToInt2 > 0) {
                            unsignedIntToInt3 = parsableByteArray5.readUnsignedIntToInt() - 1;
                        }
                    }
                    j11 += (long) unsignedIntToInt7;
                    unsignedIntToInt6--;
                    if (unsignedIntToInt6 != 0) {
                    }
                    j12 += (long) iArr4[i16];
                    i18--;
                    i16++;
                    sampleCount = i210;
                }
                i12 = sampleCount;
                long j111 = j11 + ((long) i17);
                if (unsignedIntToInt4 == 0) {
                    z11 = 1;
                } else {
                    z11 = i10;
                }
                Assertions.checkArgument(z11);
                while (unsignedIntToInt > 0) {
                    if (parsableByteArray.readUnsignedIntToInt() == 0) {
                        z12 = 1;
                    } else {
                        z12 = i10;
                    }
                    Assertions.checkArgument(z12);
                    parsableByteArray.readInt();
                    unsignedIntToInt--;
                }
                if (unsignedIntToInt2 == 0) {
                    StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                    d.o(sb3, track.f35132id, ": remainingSynchronizationSamples ", unsignedIntToInt2, ", remainingSamplesAtTimestampDelta ");
                    d.o(sb3, unsignedIntToInt6, ", remainingSamplesInChunk ", i18, ", remainingTimestampDeltaChanges ");
                    sb3.append(unsignedIntToInt5);
                    Log.w(TAG, sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                    d.o(sb4, track.f35132id, ": remainingSynchronizationSamples ", unsignedIntToInt2, ", remainingSamplesAtTimestampDelta ");
                    d.o(sb4, unsignedIntToInt6, ", remainingSamplesInChunk ", i18, ", remainingTimestampDeltaChanges ");
                    sb4.append(unsignedIntToInt5);
                    Log.w(TAG, sb4.toString());
                }
                iArr2 = iArr5;
                jArr2 = jArr7;
                jArr3 = jArr6;
                iArr3 = iArr4;
                j10 = j111;
            } else {
                i12 = sampleCount;
                i13 = 1;
                int i211 = chunkIterator.length;
                jArr = new long[i211];
                iArr = new int[i211];
                while (chunkIterator.moveNext()) {
                    int i212 = chunkIterator.index;
                    jArr[i212] = chunkIterator.offset;
                    iArr[i212] = chunkIterator.numSamples;
                }
                Format format2 = track.format;
                FixedSampleSizeRechunker.Results resultsRechunk2 = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format2.pcmEncoding, format2.channelCount), jArr, iArr, unsignedIntToInt7);
                long[] jArr20 = resultsRechunk2.offsets;
                int[] iArr12 = resultsRechunk2.sizes;
                i14 = resultsRechunk2.maximumSize;
                long[] jArr21 = resultsRechunk2.timestamps;
                int[] iArr13 = resultsRechunk2.flags;
                long j112 = resultsRechunk2.duration;
                jArr2 = jArr21;
                iArr2 = iArr13;
                jArr3 = jArr20;
                iArr3 = iArr12;
                j10 = j112;
            }
            i15 = i14;
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j10, 1000000L, track.timescale);
            if (track.editListDurations != null) {
            }
            long[] jArr110 = jArr3;
            int[] iArr14 = iArr3;
            long[] jArr111 = jArr2;
            Util.scaleLargeTimestampsInPlace(jArr111, 1000000L, track.timescale);
            return new TrackSampleTable(track, jArr110, iArr14, i15, jArr111, iArr2, jScaleLargeTimestamp);
        }
        unsignedIntToInt2 = 0;
        parsableByteArray5 = parsableByteArray6;
        if (stz2SampleSizeBox.isFixedSampleSize()) {
            i10 = 0;
            if (!MimeTypes.AUDIO_RAW.equals(track.format.sampleMimeType)) {
            }
            String str4 = TAG;
            if (i11 == 0) {
                jArr6 = new long[sampleCount];
                i13 = 1;
                iArr4 = new int[sampleCount];
                parsableByteArray = parsableByteArray7;
                jArr7 = new long[sampleCount];
                iArr5 = new int[sampleCount];
                unsignedIntToInt3 = unsignedIntToInt8;
                sampleSizeBox = stz2SampleSizeBox;
                i16 = i10;
                i17 = i16;
                i18 = i17;
                i14 = i18;
                unsignedIntToInt4 = i14;
                j11 = 0;
                j12 = 0;
                while (i16 < sampleCount) {
                    while (i18 == 0) {
                        Assertions.checkState(chunkIterator.moveNext());
                        long j113 = chunkIterator.offset;
                        i18 = chunkIterator.numSamples;
                        j12 = j113;
                        sampleCount = sampleCount;
                    }
                    int i213 = sampleCount;
                    if (parsableByteArray != null) {
                        while (unsignedIntToInt4 == 0) {
                            unsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                            i17 = parsableByteArray.readInt();
                            unsignedIntToInt--;
                        }
                        unsignedIntToInt4--;
                    }
                    jArr6[i16] = j12;
                    nextSampleSize = sampleSizeBox.readNextSampleSize();
                    iArr4[i16] = nextSampleSize;
                    if (nextSampleSize > i14) {
                        i14 = nextSampleSize;
                    }
                    jArr7[i16] = j11 + ((long) i17);
                    if (parsableByteArray5 == null) {
                        i19 = 1;
                    } else {
                        i19 = i10;
                    }
                    iArr5[i16] = i19;
                    if (i16 == unsignedIntToInt3) {
                        iArr5[i16] = 1;
                        unsignedIntToInt2--;
                        if (unsignedIntToInt2 > 0) {
                            unsignedIntToInt3 = parsableByteArray5.readUnsignedIntToInt() - 1;
                        }
                    }
                    j11 += (long) unsignedIntToInt7;
                    unsignedIntToInt6--;
                    if (unsignedIntToInt6 != 0) {
                    }
                    j12 += (long) iArr4[i16];
                    i18--;
                    i16++;
                    sampleCount = i213;
                }
                i12 = sampleCount;
                long j114 = j11 + ((long) i17);
                if (unsignedIntToInt4 == 0) {
                    z11 = 1;
                } else {
                    z11 = i10;
                }
                Assertions.checkArgument(z11);
                while (unsignedIntToInt > 0) {
                    if (parsableByteArray.readUnsignedIntToInt() == 0) {
                        z12 = 1;
                    } else {
                        z12 = i10;
                    }
                    Assertions.checkArgument(z12);
                    parsableByteArray.readInt();
                    unsignedIntToInt--;
                }
                if (unsignedIntToInt2 == 0) {
                    StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                    d.o(sb5, track.f35132id, ": remainingSynchronizationSamples ", unsignedIntToInt2, ", remainingSamplesAtTimestampDelta ");
                    d.o(sb5, unsignedIntToInt6, ", remainingSamplesInChunk ", i18, ", remainingTimestampDeltaChanges ");
                    sb5.append(unsignedIntToInt5);
                    Log.w(TAG, sb5.toString());
                } else {
                    StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                    d.o(sb6, track.f35132id, ": remainingSynchronizationSamples ", unsignedIntToInt2, ", remainingSamplesAtTimestampDelta ");
                    d.o(sb6, unsignedIntToInt6, ", remainingSamplesInChunk ", i18, ", remainingTimestampDeltaChanges ");
                    sb6.append(unsignedIntToInt5);
                    Log.w(TAG, sb6.toString());
                }
                iArr2 = iArr5;
                jArr2 = jArr7;
                jArr3 = jArr6;
                iArr3 = iArr4;
                j10 = j114;
            } else {
                i12 = sampleCount;
                i13 = 1;
                int i214 = chunkIterator.length;
                jArr = new long[i214];
                iArr = new int[i214];
                while (chunkIterator.moveNext()) {
                    int i215 = chunkIterator.index;
                    jArr[i215] = chunkIterator.offset;
                    iArr[i215] = chunkIterator.numSamples;
                }
                Format format3 = track.format;
                FixedSampleSizeRechunker.Results resultsRechunk3 = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format3.pcmEncoding, format3.channelCount), jArr, iArr, unsignedIntToInt7);
                long[] jArr22 = resultsRechunk3.offsets;
                int[] iArr15 = resultsRechunk3.sizes;
                i14 = resultsRechunk3.maximumSize;
                long[] jArr23 = resultsRechunk3.timestamps;
                int[] iArr16 = resultsRechunk3.flags;
                long j115 = resultsRechunk3.duration;
                jArr2 = jArr23;
                iArr2 = iArr16;
                jArr3 = jArr22;
                iArr3 = iArr15;
                j10 = j115;
            }
            i15 = i14;
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j10, 1000000L, track.timescale);
            if (track.editListDurations != null) {
            }
            long[] jArr112 = jArr3;
            int[] iArr17 = iArr3;
            long[] jArr113 = jArr2;
            Util.scaleLargeTimestampsInPlace(jArr113, 1000000L, track.timescale);
            return new TrackSampleTable(track, jArr112, iArr17, i15, jArr113, iArr2, jScaleLargeTimestamp);
        }
        i10 = 0;
        i11 = i10;
        String str5 = TAG;
        if (i11 == 0) {
            jArr6 = new long[sampleCount];
            i13 = 1;
            iArr4 = new int[sampleCount];
            parsableByteArray = parsableByteArray7;
            jArr7 = new long[sampleCount];
            iArr5 = new int[sampleCount];
            unsignedIntToInt3 = unsignedIntToInt8;
            sampleSizeBox = stz2SampleSizeBox;
            i16 = i10;
            i17 = i16;
            i18 = i17;
            i14 = i18;
            unsignedIntToInt4 = i14;
            j11 = 0;
            j12 = 0;
            while (i16 < sampleCount) {
                while (i18 == 0) {
                    Assertions.checkState(chunkIterator.moveNext());
                    long j116 = chunkIterator.offset;
                    i18 = chunkIterator.numSamples;
                    j12 = j116;
                    sampleCount = sampleCount;
                }
                int i216 = sampleCount;
                if (parsableByteArray != null) {
                    while (unsignedIntToInt4 == 0) {
                        unsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                        i17 = parsableByteArray.readInt();
                        unsignedIntToInt--;
                    }
                    unsignedIntToInt4--;
                }
                jArr6[i16] = j12;
                nextSampleSize = sampleSizeBox.readNextSampleSize();
                iArr4[i16] = nextSampleSize;
                if (nextSampleSize > i14) {
                    i14 = nextSampleSize;
                }
                jArr7[i16] = j11 + ((long) i17);
                if (parsableByteArray5 == null) {
                    i19 = 1;
                } else {
                    i19 = i10;
                }
                iArr5[i16] = i19;
                if (i16 == unsignedIntToInt3) {
                    iArr5[i16] = 1;
                    unsignedIntToInt2--;
                    if (unsignedIntToInt2 > 0) {
                        unsignedIntToInt3 = parsableByteArray5.readUnsignedIntToInt() - 1;
                    }
                }
                j11 += (long) unsignedIntToInt7;
                unsignedIntToInt6--;
                if (unsignedIntToInt6 != 0) {
                }
                j12 += (long) iArr4[i16];
                i18--;
                i16++;
                sampleCount = i216;
            }
            i12 = sampleCount;
            long j117 = j11 + ((long) i17);
            if (unsignedIntToInt4 == 0) {
                z11 = 1;
            } else {
                z11 = i10;
            }
            Assertions.checkArgument(z11);
            while (unsignedIntToInt > 0) {
                if (parsableByteArray.readUnsignedIntToInt() == 0) {
                    z12 = 1;
                } else {
                    z12 = i10;
                }
                Assertions.checkArgument(z12);
                parsableByteArray.readInt();
                unsignedIntToInt--;
            }
            if (unsignedIntToInt2 == 0) {
                StringBuilder sb7 = new StringBuilder("Inconsistent stbl box for track ");
                d.o(sb7, track.f35132id, ": remainingSynchronizationSamples ", unsignedIntToInt2, ", remainingSamplesAtTimestampDelta ");
                d.o(sb7, unsignedIntToInt6, ", remainingSamplesInChunk ", i18, ", remainingTimestampDeltaChanges ");
                sb7.append(unsignedIntToInt5);
                Log.w(TAG, sb7.toString());
            } else {
                StringBuilder sb8 = new StringBuilder("Inconsistent stbl box for track ");
                d.o(sb8, track.f35132id, ": remainingSynchronizationSamples ", unsignedIntToInt2, ", remainingSamplesAtTimestampDelta ");
                d.o(sb8, unsignedIntToInt6, ", remainingSamplesInChunk ", i18, ", remainingTimestampDeltaChanges ");
                sb8.append(unsignedIntToInt5);
                Log.w(TAG, sb8.toString());
            }
            iArr2 = iArr5;
            jArr2 = jArr7;
            jArr3 = jArr6;
            iArr3 = iArr4;
            j10 = j117;
        } else {
            i12 = sampleCount;
            i13 = 1;
            int i217 = chunkIterator.length;
            jArr = new long[i217];
            iArr = new int[i217];
            while (chunkIterator.moveNext()) {
                int i218 = chunkIterator.index;
                jArr[i218] = chunkIterator.offset;
                iArr[i218] = chunkIterator.numSamples;
            }
            Format format4 = track.format;
            FixedSampleSizeRechunker.Results resultsRechunk4 = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format4.pcmEncoding, format4.channelCount), jArr, iArr, unsignedIntToInt7);
            long[] jArr24 = resultsRechunk4.offsets;
            int[] iArr18 = resultsRechunk4.sizes;
            i14 = resultsRechunk4.maximumSize;
            long[] jArr25 = resultsRechunk4.timestamps;
            int[] iArr19 = resultsRechunk4.flags;
            long j118 = resultsRechunk4.duration;
            jArr2 = jArr25;
            iArr2 = iArr19;
            jArr3 = jArr24;
            iArr3 = iArr18;
            j10 = j118;
        }
        i15 = i14;
        jScaleLargeTimestamp = Util.scaleLargeTimestamp(j10, 1000000L, track.timescale);
        if (track.editListDurations != null) {
        }
        long[] jArr114 = jArr3;
        int[] iArr110 = iArr3;
        long[] jArr115 = jArr2;
        Util.scaleLargeTimestampsInPlace(jArr115, 1000000L, track.timescale);
        return new TrackSampleTable(track, jArr114, iArr110, i15, jArr115, iArr2, jScaleLargeTimestamp);
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws ParserException {
        parsableByteArray.setPosition(12);
        int i12 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i12);
        int i13 = 0;
        while (i13 < i12) {
            int position = parsableByteArray.getPosition();
            int i14 = parsableByteArray.readInt();
            Assertions.checkArgument(i14 > 0, "childAtomSize should be positive");
            int i15 = parsableByteArray.readInt();
            if (i15 == Atom.TYPE_avc1 || i15 == Atom.TYPE_avc3 || i15 == Atom.TYPE_encv || i15 == Atom.TYPE_mp4v || i15 == Atom.TYPE_hvc1 || i15 == Atom.TYPE_hev1 || i15 == Atom.TYPE_s263 || i15 == Atom.TYPE_vp08 || i15 == Atom.TYPE_vp09) {
                StsdData stsdData2 = stsdData;
                int i16 = i13;
                parseVideoSampleEntry(parsableByteArray, i15, position, i14, i10, i11, drmInitData, stsdData2, i16);
                stsdData = stsdData2;
                i13 = i16;
            } else if (i15 == Atom.TYPE_mp4a || i15 == Atom.TYPE_enca || i15 == Atom.TYPE_ac_3 || i15 == Atom.TYPE_ec_3 || i15 == Atom.TYPE_dtsc || i15 == Atom.TYPE_dtse || i15 == Atom.TYPE_dtsh || i15 == Atom.TYPE_dtsl || i15 == Atom.TYPE_samr || i15 == Atom.TYPE_sawb || i15 == Atom.TYPE_lpcm || i15 == Atom.TYPE_sowt || i15 == Atom.TYPE__mp3 || i15 == Atom.TYPE_alac) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, i15, position, i14, i10, str, z10, drmInitData, stsdData3, i13);
                stsdData = stsdData3;
            } else if (i15 == Atom.TYPE_TTML || i15 == Atom.TYPE_tx3g || i15 == Atom.TYPE_wvtt || i15 == Atom.TYPE_stpp || i15 == Atom.TYPE_c608) {
                parseTextSampleEntry(parsableByteArray, i15, position, i14, i10, str, stsdData);
            } else if (i15 == Atom.TYPE_camm) {
                stsdData.format = Format.createSampleFormat(Integer.toString(i10), MimeTypes.APPLICATION_CAMERA_MOTION, null, -1, null);
            }
            parsableByteArray.setPosition(position + i14);
            i13++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, String str, StsdData stsdData) throws ParserException {
        parsableByteArray.setPosition(i11 + 16);
        int i14 = Atom.TYPE_TTML;
        String str2 = MimeTypes.APPLICATION_TTML;
        List listSingletonList = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != i14) {
            if (i10 == Atom.TYPE_tx3g) {
                int i15 = i12 - 16;
                byte[] bArr = new byte[i15];
                parsableByteArray.readBytes(bArr, 0, i15);
                listSingletonList = Collections.singletonList(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i10 == Atom.TYPE_wvtt) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i10 == Atom.TYPE_stpp) {
                j10 = 0;
            } else {
                if (i10 != Atom.TYPE_c608) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        stsdData.format = Format.createTextSampleFormat(Integer.toString(i13), str2, null, -1, 0, str, -1, null, j10, listSingletonList);
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j10;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i10 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i11 = fullAtomVersion == 0 ? 4 : 8;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j10 = C.TIME_UNSET;
            if (i13 >= i11) {
                parsableByteArray.skipBytes(i11);
                break;
            }
            if (parsableByteArray.data[position + i13] != -1) {
                long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt == 0) {
                    break;
                }
                j10 = unsignedInt;
                break;
            }
            i13++;
        }
        parsableByteArray.skipBytes(16);
        int i14 = parsableByteArray.readInt();
        int i15 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i16 = parsableByteArray.readInt();
        int i17 = parsableByteArray.readInt();
        if (i14 == 0 && i15 == 65536 && i16 == -65536 && i17 == 0) {
            i12 = 90;
        } else if (i14 == 0 && i15 == -65536 && i16 == 65536 && i17 == 0) {
            i12 = 270;
        } else if (i14 == -65536 && i15 == 0 && i16 == 0 && i17 == -65536) {
            i12 = 180;
        }
        return new TkhdData(i10, j10, i12);
    }

    public static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mdia);
        int hdlr = parseHdlr(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_hdlr).data);
        if (hdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
        long jScaleLargeTimestamp = C.TIME_UNSET;
        long j11 = j10 == C.TIME_UNSET ? tkhd.duration : j10;
        long mvhd = parseMvhd(leafAtom.data);
        if (j11 != C.TIME_UNSET) {
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j11, 1000000L, mvhd);
        }
        long j12 = jScaleLargeTimestamp;
        Atom.ContainerAtom containerAtomOfType2 = containerAtomOfType.getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
        Pair<Long, String> mdhd = parseMdhd(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_mdhd).data);
        StsdData stsd = parseStsd(containerAtomOfType2.getLeafAtomOfType(Atom.TYPE_stsd).data, tkhd.f35131id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z11);
        if (z10) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> edts = parseEdts(containerAtom.getContainerAtomOfType(Atom.TYPE_edts));
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.f35131id, hdlr, ((Long) mdhd.first).longValue(), mvhd, j12, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom, boolean z10) {
        if (z10) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i10 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_meta) {
                parsableByteArray.setPosition(position);
                return parseMetaAtom(parsableByteArray, position + i10);
            }
            parsableByteArray.skipBytes(i10 - 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0142 A[PHI: r13
  0x0142: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:74:0x0137, B:76:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, int i14, DrmInitData drmInitData, StsdData stsdData, int i15) throws ParserException {
        String str;
        List<byte[]> list;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i11 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        String str2 = null;
        int iIntValue = i10;
        if (iIntValue == Atom.TYPE_encv) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i11, i12);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i15] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData2 = drmInitDataCopyWithSchemeType;
        float paspFromParent = 1.0f;
        List<byte[]> listSingletonList = null;
        byte[] projFromParent = null;
        int i16 = -1;
        boolean z10 = false;
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i17 = parsableByteArray.readInt();
            if (i17 == 0 && parsableByteArray.getPosition() - i11 == i12) {
                break;
            }
            int i18 = 1;
            Assertions.checkArgument(i17 > 0, "childAtomSize should be positive");
            int i19 = parsableByteArray.readInt();
            if (i19 == Atom.TYPE_avcC) {
                Assertions.checkState(str2 == null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                list = avcConfig.initializationData;
                stsdData.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z10) {
                    paspFromParent = avcConfig.pixelWidthAspectRatio;
                }
                str = "video/avc";
            } else {
                if (i19 == Atom.TYPE_hvcC) {
                    Assertions.checkState(str2 == null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    list = hevcConfig.initializationData;
                    stsdData.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str = "video/hevc";
                } else {
                    if (i19 == Atom.TYPE_vpcC) {
                        Assertions.checkState(str2 == null);
                        str = iIntValue == Atom.TYPE_vp08 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                    } else if (i19 == Atom.TYPE_d263) {
                        Assertions.checkState(str2 == null);
                        str = MimeTypes.VIDEO_H263;
                    } else if (i19 == Atom.TYPE_esds) {
                        Assertions.checkState(str2 == null);
                        Pair<String, byte[]> esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                        str2 = (String) esdsFromParent.first;
                        listSingletonList = Collections.singletonList((byte[]) esdsFromParent.second);
                    } else if (i19 == Atom.TYPE_pasp) {
                        paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                        z10 = true;
                    } else if (i19 == Atom.TYPE_sv3d) {
                        projFromParent = parseProjFromParent(parsableByteArray, position2, i17);
                    } else if (i19 == Atom.TYPE_st3d) {
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(3);
                        if (unsignedByte == 0) {
                            int unsignedByte2 = parsableByteArray.readUnsignedByte();
                            if (unsignedByte2 == 0) {
                                i16 = 0;
                            } else if (unsignedByte2 != 1) {
                                i18 = 2;
                                if (unsignedByte2 == 2) {
                                    i16 = i18;
                                } else if (unsignedByte2 == 3) {
                                    i16 = 3;
                                }
                            } else {
                                i16 = i18;
                            }
                        }
                    }
                    str2 = str;
                }
                position += i17;
            }
            listSingletonList = list;
            str2 = str;
            position += i17;
        }
        if (str2 == null) {
            return;
        }
        stsdData.format = Format.createVideoSampleFormat(Integer.toString(i13), str2, null, -1, -1, unsignedShort, unsignedShort2, -1.0f, listSingletonList, i14, paspFromParent, projFromParent, i16, null, drmInitData2);
    }
}
