package com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventMessageEncoder {
    private final ByteArrayOutputStream byteArrayOutputStream;
    private final DataOutputStream dataOutputStream;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.byteArrayOutputStream = byteArrayOutputStream;
        this.dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    }

    private static void writeNullTerminatedString(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    private static void writeUnsignedInt(DataOutputStream dataOutputStream, long j10) throws IOException {
        dataOutputStream.writeByte(((int) (j10 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j10) & 255);
    }

    @Nullable
    public byte[] encode(EventMessage eventMessage, long j10) {
        Assertions.checkArgument(j10 >= 0);
        this.byteArrayOutputStream.reset();
        try {
            writeNullTerminatedString(this.dataOutputStream, eventMessage.schemeIdUri);
            String str = eventMessage.value;
            if (str == null) {
                str = "";
            }
            writeNullTerminatedString(this.dataOutputStream, str);
            writeUnsignedInt(this.dataOutputStream, j10);
            writeUnsignedInt(this.dataOutputStream, Util.scaleLargeTimestamp(eventMessage.presentationTimeUs, j10, 1000000L));
            writeUnsignedInt(this.dataOutputStream, Util.scaleLargeTimestamp(eventMessage.durationMs, j10, 1000L));
            writeUnsignedInt(this.dataOutputStream, eventMessage.f35134id);
            this.dataOutputStream.write(eventMessage.messageData);
            this.dataOutputStream.flush();
            return this.byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
