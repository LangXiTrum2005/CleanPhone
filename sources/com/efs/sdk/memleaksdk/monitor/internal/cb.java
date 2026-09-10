package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f630a = new d(0);

    public static final class a extends cb {
        final boolean b;

        public a(boolean z) {
            super((byte) 0);
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.b == ((a) obj).b;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "BooleanHolder(value=" + this.b + ")";
        }
    }

    public static final class b extends cb {
        private final byte b;

        public b(byte b) {
            super((byte) 0);
            this.b = b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.b == ((b) obj).b;
            }
            return true;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return AbstractC5044xl.o(new StringBuilder("ByteHolder(value="), this.b, ")");
        }
    }

    public static final class c extends cb {
        private final char b;

        public c(char c) {
            super((byte) 0);
            this.b = c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.b == ((c) obj).b;
            }
            return true;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return "CharHolder(value=" + this.b + ")";
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    public static final class e extends cb {
        private final double b;

        public e(double d) {
            super((byte) 0);
            this.b = d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && Double.compare(this.b, ((e) obj).b) == 0;
            }
            return true;
        }

        public int hashCode() {
            long jDoubleToLongBits = Double.doubleToLongBits(this.b);
            return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        }

        public String toString() {
            return "DoubleHolder(value=" + this.b + ")";
        }
    }

    public static final class f extends cb {
        private final float b;

        public f(float f) {
            super((byte) 0);
            this.b = f;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && Float.compare(this.b, ((f) obj).b) == 0;
            }
            return true;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.b);
        }

        public String toString() {
            return DM.j(new StringBuilder("FloatHolder(value="), this.b, ")");
        }
    }

    public static final class g extends cb {
        final int b;

        public g(int i) {
            super((byte) 0);
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && this.b == ((g) obj).b;
            }
            return true;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return AbstractC5044xl.o(new StringBuilder("IntHolder(value="), this.b, ")");
        }
    }

    public static final class h extends cb {
        final long b;

        public h(long j) {
            super((byte) 0);
            this.b = j;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && this.b == ((h) obj).b;
            }
            return true;
        }

        public int hashCode() {
            long j = this.b;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return AbstractC3950lJ.s(new StringBuilder("LongHolder(value="), this.b, ")");
        }
    }

    public static final class i extends cb {
        public final long b;

        public i(long j) {
            super((byte) 0);
            this.b = j;
        }

        public final boolean a() {
            return this.b == 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && this.b == ((i) obj).b;
            }
            return true;
        }

        public int hashCode() {
            long j = this.b;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return AbstractC3950lJ.s(new StringBuilder("ReferenceHolder(value="), this.b, ")");
        }
    }

    public static final class j extends cb {
        private final short b;

        public j(short s) {
            super((byte) 0);
            this.b = s;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof j) && this.b == ((j) obj).b;
            }
            return true;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return AbstractC5044xl.o(new StringBuilder("ShortHolder(value="), this.b, ")");
        }
    }

    private cb() {
    }

    public /* synthetic */ cb(byte b2) {
        this();
    }
}
