package com.thinkup.core.common.o0m.o;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
final class m {

    /* JADX INFO: renamed from: com.thinkup.core.common.o0m.o.m$m, reason: collision with other inner class name */
    public static abstract class AbstractC0680m {
        int o;

        public abstract byte o();

        public abstract boolean o(AbstractC0680m abstractC0680m);
    }

    public static class m0 extends mm {
        com.thinkup.core.common.o0m.o.o.m m;

        public m0(int i2, int i3, Object obj, int i4, boolean z2) {
            super(i2, i3, obj, i4, z2);
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final byte o() {
            return (byte) 8;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final boolean o(AbstractC0680m abstractC0680m) {
            return abstractC0680m.o() == 8 && Objects.equals(((m0) abstractC0680m).f42149n, this.f42149n);
        }
    }

    public static abstract class mm extends AbstractC0680m {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f42149n;
        int o0;
        boolean om;
        int oo;

        public mm(int i2, int i3, Object obj, int i4, boolean z2) {
            this.o0 = i2;
            this.o = i3;
            this.f42149n = obj;
            this.oo = i4;
            this.om = z2;
        }
    }

    public static class mo extends mm {
        public mo(int i2, int i3, String str, int i4, boolean z2) {
            super(i2, i3, str, i4, z2);
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final byte o() {
            return (byte) 6;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final boolean o(AbstractC0680m abstractC0680m) {
            if (abstractC0680m.o() != 6) {
                return false;
            }
            mo moVar = (mo) abstractC0680m;
            return moVar.om == this.om && Objects.equals(moVar.f42149n, this.f42149n);
        }
    }

    public static class n extends AbstractC0680m {
        boolean m;

        public n(int i2, boolean z2) {
            this.o = i2;
            this.m = z2;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final byte o() {
            return (byte) 1;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final boolean o(AbstractC0680m abstractC0680m) {
            return abstractC0680m.o() == 1 && ((n) abstractC0680m).m == this.m;
        }
    }

    public static class o extends mm {
        public o(int i2, int i3, Object obj, int i4, boolean z2) {
            super(i2, i3, obj, i4, z2);
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final byte o() {
            return (byte) 7;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final boolean o(AbstractC0680m abstractC0680m) {
            if (abstractC0680m.o() != 7) {
                return false;
            }
            Object obj = ((o) abstractC0680m).f42149n;
            Object obj2 = this.f42149n;
            if (obj2 == obj) {
                return true;
            }
            if (obj2 != null && obj != null) {
                if (obj2 instanceof String) {
                    return obj2.equals(obj);
                }
                if ((obj2 instanceof byte[]) && (obj instanceof byte[])) {
                    return Arrays.equals((byte[]) obj2, (byte[]) obj);
                }
            }
            return false;
        }
    }

    public static class o0 extends AbstractC0680m {
        double m;

        public o0(int i2, double d) {
            this.o = i2;
            this.m = d;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final byte o() {
            return (byte) 5;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final boolean o(AbstractC0680m abstractC0680m) {
            return abstractC0680m.o() == 5 && ((o0) abstractC0680m).m == this.m;
        }
    }

    public static class om extends AbstractC0680m {
        int m;

        public om(int i2, int i3) {
            this.o = i2;
            this.m = i3;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final byte o() {
            return (byte) 2;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final boolean o(AbstractC0680m abstractC0680m) {
            return abstractC0680m.o() == 2 && ((om) abstractC0680m).m == this.m;
        }
    }

    public static class on extends AbstractC0680m {
        long m;

        public on(int i2, long j) {
            this.o = i2;
            this.m = j;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final byte o() {
            return (byte) 4;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final boolean o(AbstractC0680m abstractC0680m) {
            return abstractC0680m.o() == 4 && ((on) abstractC0680m).m == this.m;
        }
    }

    public static class oo extends AbstractC0680m {
        float m;

        public oo(int i2, float f) {
            this.o = i2;
            this.m = f;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final byte o() {
            return (byte) 3;
        }

        @Override // com.thinkup.core.common.o0m.o.m.AbstractC0680m
        public final boolean o(AbstractC0680m abstractC0680m) {
            return abstractC0680m.o() == 3 && ((oo) abstractC0680m).m == this.m;
        }
    }
}
