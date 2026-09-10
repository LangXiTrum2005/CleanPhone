package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends Comparable> {

    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {
        public static final BigIntegerDomain X = new BigIntegerDomain(true);
        private static final long serialVersionUID = 0;

        static {
            BigInteger.valueOf(Long.MIN_VALUE);
            BigInteger.valueOf(Long.MAX_VALUE);
        }

        private Object readResolve() {
            return X;
        }

        public final String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        public static final IntegerDomain X = new IntegerDomain(true);
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return X;
        }

        public final String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {
        public static final LongDomain X = new LongDomain(true);
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return X;
        }

        public final String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public DiscreteDomain() {
        this(false);
    }

    public DiscreteDomain(boolean z2) {
    }
}
