package org.apache.commons.codec.net;

import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class QuotedPrintableCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BitSet f45226a = new BitSet(256);

    static {
        for (int i2 = 33; i2 <= 60; i2++) {
            f45226a.set(i2);
        }
        for (int i3 = 62; i3 <= 126; i3++) {
            f45226a.set(i3);
        }
        BitSet bitSet = f45226a;
        bitSet.set(9);
        bitSet.set(32);
    }
}
