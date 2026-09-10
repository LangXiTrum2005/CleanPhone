package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface X2 extends Jb<Integer, Integer> {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27622a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27623b = 3009;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27624c = 3008;

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27625a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27626b = 3002;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27627c = 3005;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f27628d = 3300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f27629e = 3503;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f27630f = 3504;

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements X2 {
        @Override // com.ironsource.Jb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f27629e;
            } else if (i10 == 207) {
                i11 = b.f27630f;
            } else if (i10 == 405) {
                i11 = 3009;
            } else if (i10 != 406) {
                switch (i10) {
                    case InterfaceC0435l1.d.b.f29105b /* 101 */:
                        i11 = 83500;
                        break;
                    case InterfaceC0435l1.d.b.f29106c /* 102 */:
                        i11 = 83510;
                        break;
                    case InterfaceC0435l1.d.b.f29107d /* 103 */:
                        i11 = d.f27638h;
                        break;
                    case InterfaceC0435l1.d.b.f29108e /* 104 */:
                        i11 = 83300;
                        break;
                    default:
                        switch (i10) {
                            case InterfaceC0435l1.d.b.f29110g /* 109 */:
                                i11 = 88002;
                                break;
                            case InterfaceC0435l1.d.b.f29111h /* 110 */:
                                i11 = 83004;
                                break;
                            case InterfaceC0435l1.d.b.f29112i /* 111 */:
                                break;
                            case InterfaceC0435l1.d.b.f29113j /* 112 */:
                                i11 = 3305;
                                break;
                            case InterfaceC0435l1.d.b.f29114k /* 113 */:
                                i11 = 3306;
                                break;
                            default:
                                switch (i10) {
                                    case InterfaceC0435l1.c.b.f29096b /* 201 */:
                                        i11 = 3002;
                                        break;
                                    case InterfaceC0435l1.c.b.f29097c /* 202 */:
                                        i11 = 3005;
                                        break;
                                    case InterfaceC0435l1.c.b.f29098d /* 203 */:
                                        i11 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException(l1.d.e(i10, "Unknown event code: "));
                                }
                                break;
                        }
                    case InterfaceC0435l1.d.b.f29109f /* 105 */:
                        i11 = 83302;
                        break;
                }
            } else {
                i11 = 3008;
            }
            return Integer.valueOf(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27631a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27632b = 83500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27633c = 83510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f27634d = 83300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f27635e = 83302;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f27636f = 83004;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f27637g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f27638h = 83301;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f27639i = 83302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f27640j = 3305;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f27641k = 3306;

        private d() {
        }
    }
}
