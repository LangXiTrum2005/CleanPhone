package com.efs.sdk.memleaksdk.monitor.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ba {

    public static abstract class a extends ba {

        /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0127a extends a {

            /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$a, reason: collision with other inner class name */
            public static final class C0128a extends AbstractC0127a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final long f585a;
                private final int b;
                private final long c;
                private final long d;
                private final long e;
                private final long f;
                private final int g;
                private final List<b> h;
                private final List<C0129a> i;

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$a$a, reason: collision with other inner class name */
                public static final class C0129a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final long f586a;
                    public final int b;

                    public C0129a(long j, int i) {
                        this.f586a = j;
                        this.b = i;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0129a)) {
                            return false;
                        }
                        C0129a c0129a = (C0129a) obj;
                        return this.f586a == c0129a.f586a && this.b == c0129a.b;
                    }

                    public int hashCode() {
                        long j = this.f586a;
                        return (((int) (j ^ (j >>> 32))) * 31) + this.b;
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("FieldRecord(nameStringId=");
                        sb.append(this.f586a);
                        sb.append(", type=");
                        return AbstractC5044xl.o(sb, this.b, ")");
                    }
                }

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$a$b */
                public static final class b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final long f587a;
                    final cb b;
                    private final int c;

                    public b(long j, int i, cb cbVar) {
                        AbstractC2995aW.q(cbVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        this.f587a = j;
                        this.c = i;
                        this.b = cbVar;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return this.f587a == bVar.f587a && this.c == bVar.c && AbstractC2995aW.i(this.b, bVar.b);
                    }

                    public int hashCode() {
                        long j = this.f587a;
                        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.c) * 31;
                        cb cbVar = this.b;
                        return i + (cbVar != null ? cbVar.hashCode() : 0);
                    }

                    public String toString() {
                        return "StaticFieldRecord(nameStringId=" + this.f587a + ", type=" + this.c + ", value=" + this.b + ")";
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0128a(long j, int i, long j2, long j3, long j4, long j5, int i2, List<b> list, List<C0129a> list2) {
                    super((byte) 0);
                    AbstractC2995aW.q(list, "staticFields");
                    AbstractC2995aW.q(list2, "fields");
                    this.f585a = j;
                    this.b = i;
                    this.c = j2;
                    this.d = j3;
                    this.e = j4;
                    this.f = j5;
                    this.g = i2;
                    this.h = list;
                    this.i = list2;
                }
            }

            /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$b */
            public static final class b extends AbstractC0127a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final byte[] f588a;
                private final long b;
                private final int c;
                private final long d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(long j, int i, long j2, byte[] bArr) {
                    super((byte) 0);
                    AbstractC2995aW.q(bArr, "fieldValues");
                    this.b = j;
                    this.c = i;
                    this.d = j2;
                    this.f588a = bArr;
                }
            }

            /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$c */
            public static final class c extends AbstractC0127a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long[] f589a;
                private final long b;
                private final int c;
                private final long d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(long j, int i, long j2, long[] jArr) {
                    super((byte) 0);
                    AbstractC2995aW.q(jArr, "elementIds");
                    this.b = j;
                    this.c = i;
                    this.d = j2;
                    this.f589a = jArr;
                }
            }

            /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d */
            public static abstract class d extends AbstractC0127a {

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d$a, reason: collision with other inner class name */
                public static final class C0130a extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final boolean[] f590a;
                    private final long b;
                    private final int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0130a(long j, int i, boolean[] zArr) {
                        super((byte) 0);
                        AbstractC2995aW.q(zArr, "array");
                        this.b = j;
                        this.c = i;
                        this.f590a = zArr;
                    }
                }

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d$b */
                public static final class b extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final byte[] f591a;
                    private final long b;
                    private final int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(long j, int i, byte[] bArr) {
                        super((byte) 0);
                        AbstractC2995aW.q(bArr, "array");
                        this.b = j;
                        this.c = i;
                        this.f591a = bArr;
                    }
                }

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d$c */
                public static final class c extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final char[] f592a;
                    private final long b;
                    private final int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(long j, int i, char[] cArr) {
                        super((byte) 0);
                        AbstractC2995aW.q(cArr, "array");
                        this.b = j;
                        this.c = i;
                        this.f592a = cArr;
                    }
                }

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d$d, reason: collision with other inner class name */
                public static final class C0131d extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final double[] f593a;
                    private final long b;
                    private final int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0131d(long j, int i, double[] dArr) {
                        super((byte) 0);
                        AbstractC2995aW.q(dArr, "array");
                        this.b = j;
                        this.c = i;
                        this.f593a = dArr;
                    }
                }

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d$e */
                public static final class e extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final float[] f594a;
                    private final long b;
                    private final int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(long j, int i, float[] fArr) {
                        super((byte) 0);
                        AbstractC2995aW.q(fArr, "array");
                        this.b = j;
                        this.c = i;
                        this.f594a = fArr;
                    }
                }

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d$f */
                public static final class f extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final int[] f595a;
                    private final long b;
                    private final int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(long j, int i, int[] iArr) {
                        super((byte) 0);
                        AbstractC2995aW.q(iArr, "array");
                        this.b = j;
                        this.c = i;
                        this.f595a = iArr;
                    }
                }

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d$g */
                public static final class g extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final long[] f596a;
                    private final long b;
                    private final int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(long j, int i, long[] jArr) {
                        super((byte) 0);
                        AbstractC2995aW.q(jArr, "array");
                        this.b = j;
                        this.c = i;
                        this.f596a = jArr;
                    }
                }

                /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ba$a$a$d$h */
                public static final class h extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final short[] f597a;
                    private final long b;
                    private final int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(long j, int i, short[] sArr) {
                        super((byte) 0);
                        AbstractC2995aW.q(sArr, "array");
                        this.b = j;
                        this.c = i;
                        this.f597a = sArr;
                    }
                }

                private d() {
                    super((byte) 0);
                }

                public /* synthetic */ d(byte b2) {
                    this();
                }
            }

            private AbstractC0127a() {
                super((byte) 0);
            }

            public /* synthetic */ AbstractC0127a(byte b2) {
                this();
            }
        }

        private a() {
            super((byte) 0);
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private ba() {
    }

    public /* synthetic */ ba(byte b) {
        this();
    }
}
