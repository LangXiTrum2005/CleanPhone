package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class Serializer {
    private final StringManipulations stringManipulations = new StringManipulations();

    public String serialize(OpenBitSet openBitSet) throws Throwable {
        int numWords = openBitSet.getNumWords();
        int pageCount = openBitSet.getPageCount();
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                    for (int i2 = 0; i2 < pageCount; i2++) {
                        long[] page = openBitSet.getPage(i2);
                        int i3 = 0;
                        while (i3 < 4096) {
                            int i4 = numWords - 1;
                            if (numWords <= 0) {
                                numWords = i4;
                                break;
                            }
                            dataOutputStream.writeLong(page[i3]);
                            i3++;
                            numWords = i4;
                        }
                    }
                    try {
                        byteArrayOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return this.stringManipulations.bytesToHex(byteArrayOutputStream2.toByteArray());
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException("problem serializing bitSet", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
