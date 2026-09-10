package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import d5.u;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Id3Decoder implements MetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    private static final String TAG = "Id3Decoder";
    private final FramePredicate framePredicate;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return false;
        }
    };
    public static final int ID3_TAG = Util.getIntegerCodeForString("ID3");

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface FramePredicate {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i10, boolean z10, int i11) {
            this.majorVersion = i10;
            this.isUnsynchronized = z10;
            this.framesSize = i11;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? new byte[0] : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i10, int i11) throws UnsupportedEncodingException {
        int iIndexOfZeroByte;
        String lowerInvariant;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        parsableByteArray.readBytes(bArr, 0, i12);
        if (i11 == 2) {
            lowerInvariant = "image/" + Util.toLowerInvariant(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(lowerInvariant)) {
                lowerInvariant = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            lowerInvariant = Util.toLowerInvariant(new String(bArr, 0, iIndexOfZeroByte, "ISO-8859-1"));
            if (lowerInvariant.indexOf(47) == -1) {
                lowerInvariant = "image/".concat(lowerInvariant);
            }
        }
        int i13 = bArr[iIndexOfZeroByte + 1] & 255;
        int i14 = iIndexOfZeroByte + 2;
        int iIndexOfEos = indexOfEos(bArr, i14, unsignedByte);
        return new ApicFrame(lowerInvariant, new String(bArr, i14, iIndexOfEos - i14, charsetName), i13, copyOfRangeIfValid(bArr, iIndexOfEos + delimiterLength(unsignedByte), i12));
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i10, String str) {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i10, int i11, boolean z10, int i12, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.data, position);
        String str = new String(parsableByteArray.data, position, iIndexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i13 = parsableByteArray.readInt();
        int i14 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j10 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i15 = position + i10;
        while (parsableByteArray.getPosition() < i15) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i11, parsableByteArray, z10, i12, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, i13, i14, unsignedInt, j10, id3FrameArr);
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i10, int i11, boolean z10, int i12, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.data, position);
        String str = new String(parsableByteArray.data, position, iIndexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z11 = (unsignedByte & 2) != 0;
        boolean z12 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i13 = 0; i13 < unsignedByte2; i13++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.data, position2);
            strArr[i13] = new String(parsableByteArray.data, position2, iIndexOfZeroByte2 - position2, "ISO-8859-1");
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = position + i10;
        while (parsableByteArray.getPosition() < i14) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i11, parsableByteArray, z10, i12, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        parsableByteArray.readBytes(bArr2, 0, i11);
        int iIndexOfEos = indexOfEos(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfEos(bArr2, iDelimiterLength, unsignedByte), charsetName));
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x0200 A[Catch: all -> 0x01fe, UnsupportedEncodingException -> 0x022d, TryCatch #5 {all -> 0x01fe, blocks: (B:169:0x020e, B:172:0x022d, B:164:0x01f9, B:167:0x0200), top: B:180:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x020e A[Catch: all -> 0x01fe, UnsupportedEncodingException -> 0x022d, TRY_LEAVE, TryCatch #5 {all -> 0x01fe, blocks: (B:169:0x020e, B:172:0x022d, B:164:0x01f9, B:167:0x0200), top: B:180:0x0115 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:169:0x020e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9, types: [com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    private static Id3Frame decodeFrame(int i10, ParsableByteArray parsableByteArray, boolean z10, int i11, FramePredicate framePredicate) throws Throwable {
        int unsignedIntToInt;
        ?? r2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r16;
        ?? r3;
        ?? r10;
        int i12;
        Id3Frame id3FrameDecodeBinaryFrame;
        ?? r11;
        ?? r17;
        boolean zEvaluate;
        int i13 = i10;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int unsignedByte2 = parsableByteArray2.readUnsignedByte();
        int unsignedByte3 = parsableByteArray2.readUnsignedByte();
        boolean z15 = false;
        int unsignedByte4 = i13 >= 3 ? parsableByteArray2.readUnsignedByte() : 0;
        if (i13 == 4) {
            unsignedIntToInt = parsableByteArray2.readUnsignedIntToInt();
            if (!z10) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = i13 == 3 ? parsableByteArray2.readUnsignedIntToInt() : parsableByteArray2.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedIntToInt;
        int unsignedShort = i13 >= 3 ? parsableByteArray2.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray2.setPosition(parsableByteArray2.limit());
            return null;
        }
        int position = parsableByteArray2.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray2.limit()) {
            Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray2.setPosition(parsableByteArray2.limit());
            return null;
        }
        if (framePredicate != null) {
            zEvaluate = framePredicate.evaluate(i13, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4);
            r2 = unsignedByte2;
            if (!zEvaluate) {
                i13 = i13;
                parsableByteArray2.setPosition(position);
                return null;
            }
        } else {
            r2 = unsignedByte2;
        }
        i13 = i13;
        if (i13 == 3) {
            boolean z16 = (unsignedShort & 128) != 0;
            boolean z17 = (unsignedShort & 64) != 0;
            boolean z18 = (unsignedShort & 32) != 0;
            z14 = false;
            boolean z19 = z16;
            z13 = z17 ? 1 : 0;
            z11 = z18;
            z12 = z19 ? 1 : 0;
            z15 = z19;
            r16 = z17;
        } else if (i13 == 4) {
            boolean z20 = (unsignedShort & 64) != 0;
            boolean z21 = (unsignedShort & 8) != 0;
            boolean z22 = (unsignedShort & 4) != 0;
            boolean z23 = (unsignedShort & 2) != 0;
            boolean z24 = (unsignedShort & 1) != 0;
            z15 = z21 ? 1 : 0;
            z11 = z20;
            z12 = z24;
            r16 = z21;
            z13 = z22;
            z14 = z23;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z15 || z13) {
            r16 = zEvaluate;
            Log.w(TAG, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray2.setPosition(position);
            return null;
        }
        if (z11) {
            iRemoveUnsynchronization--;
            parsableByteArray2.skipBytes(1);
        }
        if (z12) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray2.skipBytes(4);
        }
        if (z14) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray2, iRemoveUnsynchronization);
        }
        try {
            try {
                try {
                    try {
                        if (unsignedByte == 84 && r2 == 88 && unsignedByte3 == 88 && (i13 == 2 || unsignedByte4 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray2, iRemoveUnsynchronization);
                        } else if (unsignedByte == 84) {
                            id3FrameDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray2, iRemoveUnsynchronization, getFrameId(i13, unsignedByte, r2, unsignedByte3, unsignedByte4));
                        } else if (unsignedByte == 87 && r2 == 88 && unsignedByte3 == 88 && (i13 == 2 || unsignedByte4 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray2, iRemoveUnsynchronization);
                        } else {
                            if (unsignedByte != 87) {
                                if (unsignedByte == 80 && r2 == 82 && unsignedByte3 == 73 && unsignedByte4 == 86) {
                                    id3FrameDecodeBinaryFrame = decodePrivFrame(parsableByteArray2, iRemoveUnsynchronization);
                                } else {
                                    r16 = 0;
                                    try {
                                        if (unsignedByte == 71 && r2 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i13 == 2)) {
                                            id3FrameDecodeBinaryFrame = decodeGeobFrame(parsableByteArray2, iRemoveUnsynchronization);
                                        } else {
                                            if (i13 == 2) {
                                                if (unsignedByte == 80 && r2 == 73 && unsignedByte3 == 67) {
                                                    id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray2, iRemoveUnsynchronization, i13);
                                                } else if (unsignedByte != 67 && r2 == 79 && unsignedByte3 == 77 && (unsignedByte4 == 77 || i13 == 2)) {
                                                    id3FrameDecodeBinaryFrame = decodeCommentFrame(parsableByteArray2, iRemoveUnsynchronization);
                                                } else if (unsignedByte != 67 && r2 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                                                    r11 = r2;
                                                    unsignedByte3 = unsignedByte3;
                                                    iRemoveUnsynchronization = iRemoveUnsynchronization;
                                                    i12 = unsignedByte4;
                                                    try {
                                                        id3FrameDecodeBinaryFrame = decodeChapterFrame(parsableByteArray2, iRemoveUnsynchronization, i13, z10, i11, framePredicate);
                                                        i13 = i10;
                                                        r2 = parsableByteArray;
                                                        r16 = r16;
                                                    } catch (UnsupportedEncodingException unused) {
                                                        r2 = parsableByteArray;
                                                        Log.w(TAG, "Unsupported character encoding");
                                                        r2.setPosition(position);
                                                        return r16;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        r3 = parsableByteArray;
                                                        r3.setPosition(position);
                                                        throw th;
                                                    }
                                                } else {
                                                    r10 = r2;
                                                    unsignedByte3 = unsignedByte3;
                                                    iRemoveUnsynchronization = iRemoveUnsynchronization;
                                                    i12 = unsignedByte4;
                                                    if (unsignedByte != 67 && r10 == 84 && unsignedByte3 == 79 && i12 == 67) {
                                                        i13 = i10;
                                                        ParsableByteArray parsableByteArray3 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray3, iRemoveUnsynchronization, i13, z10, i11, framePredicate);
                                                        r2 = parsableByteArray3;
                                                        r11 = r10;
                                                        r16 = r16;
                                                    } else {
                                                        i13 = i10;
                                                        ParsableByteArray parsableByteArray4 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray4, iRemoveUnsynchronization, getFrameId(i13, unsignedByte, r10, unsignedByte3, i12));
                                                        r2 = parsableByteArray4;
                                                        r11 = r10;
                                                        r16 = r16;
                                                    }
                                                }
                                            } else if (unsignedByte == 65 && r2 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67) {
                                                id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray2, iRemoveUnsynchronization, i13);
                                            } else {
                                                if (unsignedByte != 67) {
                                                }
                                                if (unsignedByte != 67) {
                                                    r10 = r2;
                                                    unsignedByte3 = unsignedByte3;
                                                    iRemoveUnsynchronization = iRemoveUnsynchronization;
                                                    i12 = unsignedByte4;
                                                    if (unsignedByte != 67) {
                                                        i13 = i10;
                                                        ParsableByteArray parsableByteArray5 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray5, iRemoveUnsynchronization, getFrameId(i13, unsignedByte, r10, unsignedByte3, i12));
                                                        r2 = parsableByteArray5;
                                                        r11 = r10;
                                                        r16 = r16;
                                                    } else {
                                                        i13 = i10;
                                                        ParsableByteArray parsableByteArray6 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray6, iRemoveUnsynchronization, getFrameId(i13, unsignedByte, r10, unsignedByte3, i12));
                                                        r2 = parsableByteArray6;
                                                        r11 = r10;
                                                        r16 = r16;
                                                    }
                                                } else {
                                                    r10 = r2;
                                                    unsignedByte3 = unsignedByte3;
                                                    iRemoveUnsynchronization = iRemoveUnsynchronization;
                                                    i12 = unsignedByte4;
                                                    if (unsignedByte != 67) {
                                                        i13 = i10;
                                                        ParsableByteArray parsableByteArray7 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray7, iRemoveUnsynchronization, getFrameId(i13, unsignedByte, r10, unsignedByte3, i12));
                                                        r2 = parsableByteArray7;
                                                        r11 = r10;
                                                        r16 = r16;
                                                    } else {
                                                        i13 = i10;
                                                        ParsableByteArray parsableByteArray8 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray8, iRemoveUnsynchronization, getFrameId(i13, unsignedByte, r10, unsignedByte3, i12));
                                                        r2 = parsableByteArray8;
                                                        r11 = r10;
                                                        r16 = r16;
                                                    }
                                                }
                                            }
                                            i12 = unsignedByte4;
                                            r2 = parsableByteArray2;
                                            r11 = r2;
                                            r16 = r17;
                                        }
                                        r17 = r16;
                                        i12 = unsignedByte4;
                                        r2 = parsableByteArray2;
                                        r11 = r2;
                                        r16 = r17;
                                    } catch (UnsupportedEncodingException unused2) {
                                        r2 = parsableByteArray2;
                                    }
                                }
                                if (id3FrameDecodeBinaryFrame == null) {
                                    Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, unsignedByte, r11, unsignedByte3, i12) + ", frameSize=" + iRemoveUnsynchronization);
                                }
                                r2.setPosition(position);
                                return id3FrameDecodeBinaryFrame;
                            }
                            id3FrameDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray2, iRemoveUnsynchronization, getFrameId(i13, unsignedByte, r2, unsignedByte3, unsignedByte4));
                        }
                        r17 = 0;
                        i12 = unsignedByte4;
                        r2 = parsableByteArray2;
                        r11 = r2;
                        r16 = r17;
                        if (id3FrameDecodeBinaryFrame == null) {
                            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, unsignedByte, r11, unsignedByte3, i12) + ", frameSize=" + iRemoveUnsynchronization);
                        }
                        r2.setPosition(position);
                        return id3FrameDecodeBinaryFrame;
                    } catch (UnsupportedEncodingException unused3) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r3 = r2;
                }
            } catch (Throwable th4) {
                th = th4;
                r3 = parsableByteArray2;
            }
        } catch (UnsupportedEncodingException unused4) {
            r2 = parsableByteArray2;
            r16 = 0;
        }
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, iIndexOfZeroByte, "ISO-8859-1");
        int i12 = iIndexOfZeroByte + 1;
        int iIndexOfEos = indexOfEos(bArr, i12, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i12, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        int iIndexOfEos2 = indexOfEos(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(str, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfEos2, charsetName), copyOfRangeIfValid(bArr, iIndexOfEos2 + delimiterLength(unsignedByte), i11));
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != ID3_TAG) {
            u.o(unsignedInt24, "Unexpected first three bytes of ID3 tag header: ", TAG);
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i10 = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i10);
                synchSafeInt -= i10 + 4;
            }
        } else {
            if (unsignedByte != 4) {
                u.o(unsignedByte, "Skipped ID3 tag with unsupported majorVersion=", TAG);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new Id3Header(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, "ISO-8859-1"), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i10));
    }

    private static String decodeStringIfValid(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, indexOfEos(bArr, 0, unsignedByte), charsetName));
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new TextInformationFrame("TXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfEos(bArr, iDelimiterLength, unsignedByte), charsetName));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), "ISO-8859-1"));
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), "ISO-8859-1"));
    }

    private static int delimiterLength(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String getCharsetName(int i10) {
        if (i10 == 1) {
            return C.UTF16_NAME;
        }
        if (i10 != 2) {
            return i10 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    private static String getFrameId(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int indexOfEos(byte[] bArr, int i10, int i11) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iIndexOfZeroByte;
        }
        while (iIndexOfZeroByte < bArr.length - 1) {
            if (iIndexOfZeroByte % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                return iIndexOfZeroByte;
            }
            iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i10) {
        byte[] bArr = parsableByteArray.data;
        int position = parsableByteArray.getPosition();
        while (true) {
            int i11 = position + 1;
            if (i11 >= i10) {
                return i10;
            }
            if ((bArr[position] & 255) == 255 && bArr[i11] == 0) {
                System.arraycopy(bArr, position + 2, bArr, i11, (i10 - position) - 2);
                i10--;
            }
            position = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a A[PHI: r3
  0x008a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:41:0x0087, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i10, int i11, boolean z10) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i12;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z11 = true;
                if (parsableByteArray.bytesLeft() < i11) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i10 >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt25 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt25 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & unsignedInt25) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (unsignedInt25 < i12) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() < unsignedInt25) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                parsableByteArray.skipBytes((int) unsignedInt25);
            } catch (Throwable th2) {
                parsableByteArray.setPosition(position);
                throw th2;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    public Metadata decode(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i10);
        Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i11 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z10 = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i11, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i11, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z10 = true;
        }
        while (parsableByteArray.bytesLeft() >= i11) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z10, i11, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }
}
