package com.google.common.io;

import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class CharSource {

    public final class AsByteSource extends ByteSource {
        public final String toString() {
            throw null;
        }
    }

    public static class CharSequenceCharSource extends CharSource {

        /* JADX INFO: renamed from: com.google.common.io.CharSource$CharSequenceCharSource$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<String> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        static {
            Splitter.b();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c A[PHI: r1
  0x001c: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v7 java.lang.String) binds: [B:3:0x000f, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        public String toString() {
            StringBuilder sb = new StringBuilder("CharSource.wrap(");
            String string = "";
            if ("".length() <= 30) {
                string = "".toString();
                if (string.length() > 30) {
                    StringBuilder sb2 = new StringBuilder(30);
                    sb2.append((CharSequence) string, 0, 27);
                    sb2.append("...");
                    string = sb2.toString();
                }
            } else {
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append((CharSequence) string, 0, 27);
                sb3.append("...");
                string = sb3.toString();
            }
            sb.append(string);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class ConcatenatedCharSource extends CharSource {
        public final String toString() {
            return "CharSource.concat(null)";
        }
    }

    public static final class EmptyCharSource extends StringCharSource {
        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public final String toString() {
            return "CharSource.empty()";
        }
    }

    public static class StringCharSource extends CharSequenceCharSource {
    }
}
