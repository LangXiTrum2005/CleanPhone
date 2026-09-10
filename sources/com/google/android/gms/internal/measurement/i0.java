package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f23555b = new i0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f23556c = new i0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f23557d = new i0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i0 f23558e = new i0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i0 f23559f = new i0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i0 f23560g = new i0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i0 f23561h = new i0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i0 f23562i = new i0(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i0 f23563j = new i0(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i0 f23564k = new i0(9);
    public static final i0 l = new i0(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i0 f23565m = new i0(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i0 f23566n = new i0(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i0 f23567o = new i0(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i0 f23568p = new i0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23569a;

    public /* synthetic */ i0(int i10) {
        this.f23569a = i10;
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final boolean a(int i10) {
        switch (this.f23569a) {
            case 0:
                return j0.a(i10) != null;
            case 1:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            case 2:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 4:
                return mb.a(i10) != 0;
            case 5:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 6:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
            case 7:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            case 8:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 9:
                return i10 == 0 || i10 == 1;
            case 10:
                return i10 == 1 || i10 == 2;
            case 11:
                return f2.a(i10) != 0;
            case 12:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
            case 13:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            default:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }
    }
}
