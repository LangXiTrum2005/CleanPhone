package com.mbridge.msdk.playercommon.exoplayer2.video;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class HevcConfig {
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;

    private HevcConfig(List<byte[]> list, int i10) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i10;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i10 = 0;
            for (int i11 = 0; i11 < unsignedByte2; i11++) {
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i12 = 0; i12 < unsignedShort; i12++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i10 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < unsignedByte2; i14++) {
                parsableByteArray.skipBytes(1);
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                for (int i15 = 0; i15 < unsignedShort3; i15++) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(parsableByteArray.data, parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    i13 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                }
            }
            return new HevcConfig(i10 == 0 ? null : Collections.singletonList(bArr), unsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ParserException("Error parsing HEVC config", e10);
        }
    }
}
