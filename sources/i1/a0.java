package i1;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.o6;
import java.util.Arrays;
import java.util.Objects;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static final a0 B;
    public final oa.j0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f42498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f42499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f42500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f42501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f42502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f42503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f42504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f42505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f42506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f42507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f42508k;
    public final Integer l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f42509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f42510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f42511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f42512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f42513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f42514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f42515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f42516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f42517u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f42518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f42519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f42520x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f42521y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f42522z;

    static {
        o6 o6Var = new o6();
        oa.f0 f0Var = oa.j0.f47265b;
        o6Var.f18175z = n1.f47281e;
        B = new a0(o6Var);
        d5.u.m(0, 1, 2, 3, 4);
        d5.u.m(5, 6, 8, 9, 10);
        d5.u.m(11, 12, 13, 14, 15);
        d5.u.m(16, 17, 18, 19, 20);
        d5.u.m(21, 22, 23, 24, 25);
        d5.u.m(26, 27, 28, 29, 30);
        d5.u.m(31, 32, 33, 34, 1000);
    }

    public a0(o6 o6Var) {
        Boolean boolValueOf = o6Var.f18161k;
        Integer numValueOf = o6Var.f18160j;
        Integer numValueOf2 = o6Var.f18174y;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            break;
                        case 20:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                        case 27:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    i12 = i10;
                }
                numValueOf = Integer.valueOf(i12);
            }
        } else if (numValueOf != null) {
            boolean z10 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z10);
            if (z10 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i11);
            }
        }
        this.f42498a = o6Var.f18151a;
        this.f42499b = o6Var.f18152b;
        this.f42500c = o6Var.f18153c;
        this.f42501d = o6Var.f18154d;
        this.f42502e = o6Var.f18155e;
        this.f42503f = o6Var.f18156f;
        this.f42504g = o6Var.f18157g;
        this.f42505h = o6Var.f18158h;
        this.f42506i = o6Var.f18159i;
        this.f42507j = numValueOf;
        this.f42508k = boolValueOf;
        Integer num = o6Var.l;
        this.l = num;
        this.f42509m = num;
        this.f42510n = o6Var.f18162m;
        this.f42511o = o6Var.f18163n;
        this.f42512p = o6Var.f18164o;
        this.f42513q = o6Var.f18165p;
        this.f42514r = o6Var.f18166q;
        this.f42515s = o6Var.f18167r;
        this.f42516t = o6Var.f18168s;
        this.f42517u = o6Var.f18169t;
        this.f42518v = o6Var.f18170u;
        this.f42519w = o6Var.f18171v;
        this.f42520x = o6Var.f18172w;
        this.f42521y = o6Var.f18173x;
        this.f42522z = numValueOf2;
        this.A = (oa.j0) o6Var.f18175z;
    }

    public final o6 a() {
        o6 o6Var = new o6();
        o6Var.f18151a = this.f42498a;
        o6Var.f18152b = this.f42499b;
        o6Var.f18153c = this.f42500c;
        o6Var.f18154d = this.f42501d;
        o6Var.f18155e = this.f42502e;
        o6Var.f18156f = this.f42503f;
        o6Var.f18157g = this.f42504g;
        o6Var.f18158h = this.f42505h;
        o6Var.f18159i = this.f42506i;
        o6Var.f18160j = this.f42507j;
        o6Var.f18161k = this.f42508k;
        o6Var.l = this.f42509m;
        o6Var.f18162m = this.f42510n;
        o6Var.f18163n = this.f42511o;
        o6Var.f18164o = this.f42512p;
        o6Var.f18165p = this.f42513q;
        o6Var.f18166q = this.f42514r;
        o6Var.f18167r = this.f42515s;
        o6Var.f18168s = this.f42516t;
        o6Var.f18169t = this.f42517u;
        o6Var.f18170u = this.f42518v;
        o6Var.f18171v = this.f42519w;
        o6Var.f18172w = this.f42520x;
        o6Var.f18173x = this.f42521y;
        o6Var.f18174y = this.f42522z;
        o6Var.f18175z = this.A;
        return o6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return TextUtils.equals(this.f42498a, a0Var.f42498a) && TextUtils.equals(this.f42499b, a0Var.f42499b) && TextUtils.equals(this.f42500c, a0Var.f42500c) && TextUtils.equals(this.f42501d, a0Var.f42501d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f42502e, a0Var.f42502e) && Arrays.equals(this.f42503f, a0Var.f42503f) && Objects.equals(this.f42504g, a0Var.f42504g) && Objects.equals(this.f42505h, a0Var.f42505h) && Objects.equals(this.f42506i, a0Var.f42506i) && Objects.equals(this.f42507j, a0Var.f42507j) && Objects.equals(this.f42508k, a0Var.f42508k) && Objects.equals(this.f42509m, a0Var.f42509m) && Objects.equals(this.f42510n, a0Var.f42510n) && Objects.equals(this.f42511o, a0Var.f42511o) && Objects.equals(this.f42512p, a0Var.f42512p) && Objects.equals(this.f42513q, a0Var.f42513q) && Objects.equals(this.f42514r, a0Var.f42514r) && TextUtils.equals(this.f42515s, a0Var.f42515s) && TextUtils.equals(this.f42516t, a0Var.f42516t) && TextUtils.equals(this.f42517u, a0Var.f42517u) && Objects.equals(this.f42518v, a0Var.f42518v) && Objects.equals(this.f42519w, a0Var.f42519w) && TextUtils.equals(this.f42520x, a0Var.f42520x) && TextUtils.equals(null, null) && TextUtils.equals(this.f42521y, a0Var.f42521y) && Objects.equals(this.f42522z, a0Var.f42522z) && Objects.equals(this.A, a0Var.A);
    }

    public final int hashCode() {
        return Objects.hash(this.f42498a, this.f42499b, this.f42500c, this.f42501d, null, null, this.f42502e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f42503f)), this.f42504g, null, this.f42505h, this.f42506i, this.f42507j, this.f42508k, null, this.f42509m, this.f42510n, this.f42511o, this.f42512p, this.f42513q, this.f42514r, this.f42515s, this.f42516t, this.f42517u, this.f42518v, this.f42519w, this.f42520x, null, this.f42521y, this.f42522z, true, this.A);
    }
}
