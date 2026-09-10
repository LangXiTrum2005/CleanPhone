package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class TokenToBitSetVersionsOneAndThree extends TokenToBitSet {
    private void incrementInputStreamForBackwordCompatability(DataInput dataInput) {
        try {
            dataInput.readInt();
        } catch (IOException e2) {
            throw new RuntimeException("problem incrementInputStreamForBackwordCompatability", e2);
        }
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public DataInput createDataInput(byte[] bArr) {
        DataInput dataInputCreateDataInput = super.createDataInput(bArr);
        incrementInputStreamForBackwordCompatability(dataInputCreateDataInput);
        return dataInputCreateDataInput;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        long j = dataInput.readInt();
        OpenBitSet openBitSet = new OpenBitSet(j << 6);
        fillBitSet(dataInput, openBitSet, j);
        return openBitSet;
    }
}
