package com.google.common.hash;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Funnels {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ByteArrayFunnel implements Funnel<byte[]> {
        public static final /* synthetic */ ByteArrayFunnel[] X = {new ByteArrayFunnel("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        ByteArrayFunnel EF5;

        public static ByteArrayFunnel valueOf(String str) {
            return (ByteArrayFunnel) Enum.valueOf(ByteArrayFunnel.class, str);
        }

        public static ByteArrayFunnel[] values() {
            return (ByteArrayFunnel[]) X.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IntegerFunnel implements Funnel<Integer> {
        public static final /* synthetic */ IntegerFunnel[] X = {new IntegerFunnel("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        IntegerFunnel EF5;

        public static IntegerFunnel valueOf(String str) {
            return (IntegerFunnel) Enum.valueOf(IntegerFunnel.class, str);
        }

        public static IntegerFunnel[] values() {
            return (IntegerFunnel[]) X.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LongFunnel implements Funnel<Long> {
        public static final /* synthetic */ LongFunnel[] X = {new LongFunnel("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        LongFunnel EF5;

        public static LongFunnel valueOf(String str) {
            return (LongFunnel) Enum.valueOf(LongFunnel.class, str);
        }

        public static LongFunnel[] values() {
            return (LongFunnel[]) X.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.longFunnel()";
        }
    }

    public static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
        public final boolean equals(Object obj) {
            if (!(obj instanceof SequentialFunnel)) {
                return false;
            }
            ((SequentialFunnel) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            SequentialFunnel.class.hashCode();
            throw null;
        }

        public final String toString() {
            return "Funnels.sequentialFunnel(null)";
        }
    }

    public static class SinkAsStream extends OutputStream {
        public final String toString() {
            return "Funnels.asOutputStream(null)";
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
        public final Charset X;

        public static class SerializedForm implements Serializable {
            private static final long serialVersionUID = 0;
            public final String X;

            public SerializedForm(Charset charset) {
                this.X = charset.name();
            }

            private Object readResolve() {
                return new StringCharsetFunnel(Charset.forName(this.X));
            }
        }

        public StringCharsetFunnel(Charset charset) {
            charset.getClass();
            this.X = charset;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        public final boolean equals(Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.X.equals(((StringCharsetFunnel) obj).X);
            }
            return false;
        }

        public final int hashCode() {
            return StringCharsetFunnel.class.hashCode() ^ this.X.hashCode();
        }

        public final String toString() {
            return "Funnels.stringFunnel(" + this.X.name() + ")";
        }

        public Object writeReplace() {
            return new SerializedForm(this.X);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UnencodedCharsFunnel implements Funnel<CharSequence> {
        public static final /* synthetic */ UnencodedCharsFunnel[] X = {new UnencodedCharsFunnel("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        UnencodedCharsFunnel EF5;

        public static UnencodedCharsFunnel valueOf(String str) {
            return (UnencodedCharsFunnel) Enum.valueOf(UnencodedCharsFunnel.class, str);
        }

        public static UnencodedCharsFunnel[] values() {
            return (UnencodedCharsFunnel[]) X.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }
}
