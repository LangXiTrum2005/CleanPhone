package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class Ref {

    public static final class BooleanRef implements Serializable {
        public boolean X;

        public final String toString() {
            return String.valueOf(this.X);
        }
    }

    public static final class ByteRef implements Serializable {
        public final String toString() {
            return String.valueOf(0);
        }
    }

    public static final class CharRef implements Serializable {
        public final String toString() {
            return String.valueOf((char) 0);
        }
    }

    public static final class DoubleRef implements Serializable {
        public double X;

        public final String toString() {
            return String.valueOf(this.X);
        }
    }

    public static final class FloatRef implements Serializable {
        public final String toString() {
            return String.valueOf(0.0f);
        }
    }

    public static final class IntRef implements Serializable {
        public int X;

        public final String toString() {
            return String.valueOf(this.X);
        }
    }

    public static final class LongRef implements Serializable {
        public long X;

        public final String toString() {
            return String.valueOf(this.X);
        }
    }

    public static final class ObjectRef<T> implements Serializable {
        public Object X;

        public final String toString() {
            return String.valueOf(this.X);
        }
    }

    public static final class ShortRef implements Serializable {
        public final String toString() {
            return String.valueOf(0);
        }
    }
}
