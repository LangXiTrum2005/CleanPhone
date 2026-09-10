package com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventMessageDecoder implements MetadataDecoder {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArrArray, iLimit);
        String nullTerminatedString = parsableByteArray.readNullTerminatedString();
        String nullTerminatedString2 = parsableByteArray.readNullTerminatedString();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        return new Metadata(new EventMessage(nullTerminatedString, nullTerminatedString2, Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt), parsableByteArray.readUnsignedInt(), Arrays.copyOfRange(bArrArray, parsableByteArray.getPosition(), iLimit), Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, unsignedInt)));
    }
}
