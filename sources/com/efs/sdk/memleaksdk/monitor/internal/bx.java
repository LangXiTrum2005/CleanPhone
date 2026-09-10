package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bx implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f625a = new a(0);
    private static final long serialVersionUID = -5113635523713591133L;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b extends bx {
        public static final a d = new a(0);
        private static final long serialVersionUID = 6649791455204159802L;
        public final String b;
        public final String c;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((byte) 0);
            AbstractC2995aW.q(str, "className");
            AbstractC2995aW.q(str2, "fieldName");
            this.b = str;
            this.c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC2995aW.i(this.b, bVar.b) && AbstractC2995aW.i(this.c, bVar.c);
        }

        public int hashCode() {
            String str = this.b;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "instance field " + this.b + '#' + this.c;
        }
    }

    public static final class c extends bx {
        public static final a c = new a(0);
        private static final long serialVersionUID = -8985446122829543654L;
        public final String b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((byte) 0);
            AbstractC2995aW.q(str, "threadName");
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && AbstractC2995aW.i(this.b, ((c) obj).b);
            }
            return true;
        }

        public int hashCode() {
            String str = this.b;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "local variable on thread " + this.b;
        }
    }

    public static final class d extends bx {
        public static final a c = new a(0);
        private static final long serialVersionUID = -2651328076202244933L;
        public final String b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super((byte) 0);
            AbstractC2995aW.q(str, "className");
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && AbstractC2995aW.i(this.b, ((d) obj).b);
            }
            return true;
        }

        public int hashCode() {
            String str = this.b;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "native global variable referencing " + this.b;
        }
    }

    public static final class e extends bx {
        public static final a d = new a(0);
        private static final long serialVersionUID = 7656908128775899611L;
        public final String b;
        public final String c;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super((byte) 0);
            AbstractC2995aW.q(str, "className");
            AbstractC2995aW.q(str2, "fieldName");
            this.b = str;
            this.c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC2995aW.i(this.b, eVar.b) && AbstractC2995aW.i(this.c, eVar.c);
        }

        public int hashCode() {
            String str = this.b;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "static field " + this.b + '#' + this.c;
        }
    }

    private bx() {
    }

    public /* synthetic */ bx(byte b2) {
        this();
    }
}
