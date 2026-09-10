package org.jacoco.core.internal.data;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class CompactDataOutput extends DataOutputStream {
    public CompactDataOutput(OutputStream outputStream) {
        super(outputStream);
    }

    public void writeBooleanArray(boolean[] zArr) throws IOException {
        writeVarInt(zArr.length);
        int i = 0;
        int i2 = 0;
        for (boolean z : zArr) {
            if (z) {
                i2 |= 1 << i;
            }
            i++;
            if (i == 8) {
                writeByte(i2);
                i = 0;
                i2 = 0;
            }
        }
        if (i > 0) {
            writeByte(i2);
        }
    }

    public void writeVarInt(int i) throws IOException {
        if ((i & (-128)) == 0) {
            writeByte(i);
        } else {
            writeByte((i & 127) | 128);
            writeVarInt(i >>> 7);
        }
    }
}
