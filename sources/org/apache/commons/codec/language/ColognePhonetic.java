package org.apache.commons.codec.language;

import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class ColognePhonetic implements StringEncoder {

    public abstract class CologneBuffer {
        public abstract char[] a(int i2);

        public final String toString() {
            return new String(a(0));
        }
    }

    public class CologneInputBuffer extends CologneBuffer {
        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public final char[] a(int i2) {
            char[] cArr = new char[i2];
            throw null;
        }
    }

    public class CologneOutputBuffer extends CologneBuffer {
        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public final char[] a(int i2) {
            char[] cArr = new char[i2];
            System.arraycopy(null, 0, cArr, 0, i2);
            return cArr;
        }
    }
}
