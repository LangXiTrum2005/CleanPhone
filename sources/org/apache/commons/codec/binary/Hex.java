package org.apache.commons.codec.binary;

import android.support.v4.media.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class Hex implements BinaryEncoder, BinaryDecoder {
    static {
        Charset charset = StandardCharsets.UTF_8;
    }

    public final String toString() {
        return a.r(new StringBuilder(), super.toString(), "[charsetName=null]");
    }
}
