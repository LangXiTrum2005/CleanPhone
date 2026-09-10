package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TokenToBitSet {
    public static final String HIGH_PAGE_COUNT_EXCEPTION_TAG = "HighPageCountException";
    private final StringManipulations stringManipulations = new StringManipulations();

    public OpenBitSet convert(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrHexToByte = this.stringManipulations.hexToByte(str);
            if (bArrHexToByte == null) {
                return null;
            }
            return createOpenBitSet(createDataInput(bArrHexToByte));
        } catch (Exception e2) {
            if (e2.getMessage() != null && e2.getMessage().contains(HIGH_PAGE_COUNT_EXCEPTION_TAG)) {
                System.err.println("HighPageCountException (PLM-2573) " + e2.getMessage() + ", bad bloom token: " + str);
            }
            return null;
        }
    }

    public DataInput createDataInput(byte[] bArr) {
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }

    public abstract OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException;

    public void fillBitSet(DataInput dataInput, OpenBitSet openBitSet, long j) throws IOException {
        int pageCount = openBitSet.getPageCount();
        for (int i2 = 0; i2 < pageCount; i2++) {
            long[] page = openBitSet.getPage(i2);
            int i3 = 0;
            while (i3 < 4096) {
                long j2 = j - 1;
                if (j <= 0) {
                    j = j2;
                    break;
                } else {
                    page[i3] = dataInput.readLong();
                    i3++;
                    j = j2;
                }
            }
        }
    }
}
