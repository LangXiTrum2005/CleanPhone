package org.apache.commons.codec.net;

import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class URLCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BitSet f45227a = new BitSet(256);

    static {
        for (int i2 = 97; i2 <= 122; i2++) {
            f45227a.set(i2);
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            f45227a.set(i3);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f45227a.set(i4);
        }
        BitSet bitSet = f45227a;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
    }
}
