package org.apache.commons.codec.net;

import java.util.BitSet;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class QCodec extends RFC1522Codec implements StringEncoder, StringDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BitSet f45225a;

    static {
        BitSet bitSet = new BitSet(256);
        f45225a = bitSet;
        bitSet.set(32);
        bitSet.set(33);
        bitSet.set(34);
        bitSet.set(35);
        bitSet.set(36);
        bitSet.set(37);
        bitSet.set(38);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        bitSet.set(42);
        bitSet.set(43);
        bitSet.set(44);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(47);
        for (int i2 = 48; i2 <= 57; i2++) {
            f45225a.set(i2);
        }
        BitSet bitSet2 = f45225a;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i3 = 65; i3 <= 90; i3++) {
            f45225a.set(i3);
        }
        BitSet bitSet3 = f45225a;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i4 = 97; i4 <= 122; i4++) {
            f45225a.set(i4);
        }
        BitSet bitSet4 = f45225a;
        bitSet4.set(123);
        bitSet4.set(124);
        bitSet4.set(125);
        bitSet4.set(126);
    }
}
