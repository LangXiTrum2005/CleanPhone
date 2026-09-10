package org.jacoco.core.internal.data;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class CompactDataInput extends DataInputStream {
    public CompactDataInput(InputStream inputStream) {
        super(inputStream);
    }

    public boolean[] readBooleanArray() throws IOException {
        int varInt = readVarInt();
        boolean[] zArr = new boolean[varInt];
        int i = 0;
        for (int i2 = 0; i2 < varInt; i2++) {
            if (i2 % 8 == 0) {
                i = readByte();
            }
            zArr[i2] = (i & 1) != 0;
            i >>>= 1;
        }
        return zArr;
    }

    public int readVarInt() throws IOException {
        byte b = readByte();
        return (b & 128) == 0 ? b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED : (b & 127) | (readVarInt() << 7);
    }
}
