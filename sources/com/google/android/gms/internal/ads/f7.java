package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f7 {
    public static final f7 B;
    public final ca1 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f14272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f14273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f14274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f14275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f14276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f14277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f14278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f14279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f14280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f14281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f14282k;
    public final Integer l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f14283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f14284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f14285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f14286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f14287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f14288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f14289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f14290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f14291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f14292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f14293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f14294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f14295y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f14296z;

    static {
        o6 o6Var = new o6();
        aa1 aa1Var = ca1.f13122b;
        o6Var.f18175z = ya1.f22208e;
        B = new f7(o6Var);
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(1000, 36);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public f7(o6 o6Var) {
        Boolean boolValueOf = o6Var.f18161k;
        Integer numValueOf = o6Var.f18174y;
        Integer numValueOf2 = o6Var.f18160j;
        int i10 = 1;
        int i11 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf2 = -1;
            } else if (numValueOf2 == null || numValueOf2.intValue() == -1) {
                if (numValueOf != null) {
                    switch (numValueOf.intValue()) {
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
                            break;
                        case 20:
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
                } else {
                    i10 = 0;
                }
                numValueOf2 = Integer.valueOf(i10);
            }
        } else if (numValueOf2 != null) {
            boolean z10 = numValueOf2.intValue() != -1;
            boolValueOf = Boolean.valueOf(z10);
            if (z10 && numValueOf == null) {
                switch (numValueOf2.intValue()) {
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
                numValueOf = Integer.valueOf(i11);
            }
        } else {
            numValueOf2 = null;
        }
        this.f14272a = o6Var.f18151a;
        this.f14273b = o6Var.f18152b;
        this.f14274c = o6Var.f18153c;
        this.f14275d = o6Var.f18154d;
        this.f14276e = o6Var.f18155e;
        this.f14277f = o6Var.f18156f;
        this.f14278g = o6Var.f18157g;
        this.f14279h = o6Var.f18158h;
        this.f14280i = o6Var.f18159i;
        this.f14281j = numValueOf2;
        this.f14282k = boolValueOf;
        Integer num = o6Var.l;
        this.l = num;
        this.f14283m = num;
        this.f14284n = o6Var.f18162m;
        this.f14285o = o6Var.f18163n;
        this.f14286p = o6Var.f18164o;
        this.f14287q = o6Var.f18165p;
        this.f14288r = o6Var.f18166q;
        this.f14289s = o6Var.f18167r;
        this.f14290t = o6Var.f18168s;
        this.f14291u = o6Var.f18169t;
        this.f14292v = o6Var.f18170u;
        this.f14293w = o6Var.f18171v;
        this.f14294x = o6Var.f18172w;
        this.f14295y = o6Var.f18173x;
        this.f14296z = numValueOf;
        this.A = (ca1) o6Var.f18175z;
    }

    public final o6 a() {
        o6 o6Var = new o6();
        o6Var.f18151a = this.f14272a;
        o6Var.f18152b = this.f14273b;
        o6Var.f18153c = this.f14274c;
        o6Var.f18154d = this.f14275d;
        o6Var.f18155e = this.f14276e;
        o6Var.f18156f = this.f14277f;
        o6Var.f18157g = this.f14278g;
        o6Var.f18158h = this.f14279h;
        o6Var.f18159i = this.f14280i;
        o6Var.f18160j = this.f14281j;
        o6Var.f18161k = this.f14282k;
        o6Var.l = this.f14283m;
        o6Var.f18162m = this.f14284n;
        o6Var.f18163n = this.f14285o;
        o6Var.f18164o = this.f14286p;
        o6Var.f18165p = this.f14287q;
        o6Var.f18166q = this.f14288r;
        o6Var.f18167r = this.f14289s;
        o6Var.f18168s = this.f14290t;
        o6Var.f18169t = this.f14291u;
        o6Var.f18170u = this.f14292v;
        o6Var.f18171v = this.f14293w;
        o6Var.f18172w = this.f14294x;
        o6Var.f18173x = this.f14295y;
        o6Var.f18174y = this.f14296z;
        o6Var.f18175z = this.A;
        return o6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f7.class == obj.getClass()) {
            f7 f7Var = (f7) obj;
            if (TextUtils.equals(this.f14272a, f7Var.f14272a) && TextUtils.equals(this.f14273b, f7Var.f14273b) && TextUtils.equals(this.f14274c, f7Var.f14274c) && TextUtils.equals(this.f14275d, f7Var.f14275d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f14276e, f7Var.f14276e) && Arrays.equals(this.f14277f, f7Var.f14277f) && Objects.equals(this.f14278g, f7Var.f14278g) && Objects.equals(this.f14279h, f7Var.f14279h) && Objects.equals(this.f14280i, f7Var.f14280i) && Objects.equals(this.f14281j, f7Var.f14281j) && Objects.equals(this.f14282k, f7Var.f14282k) && Objects.equals(this.f14283m, f7Var.f14283m) && Objects.equals(this.f14284n, f7Var.f14284n) && Objects.equals(this.f14285o, f7Var.f14285o) && Objects.equals(this.f14286p, f7Var.f14286p) && Objects.equals(this.f14287q, f7Var.f14287q) && Objects.equals(this.f14288r, f7Var.f14288r) && TextUtils.equals(this.f14289s, f7Var.f14289s) && TextUtils.equals(this.f14290t, f7Var.f14290t) && TextUtils.equals(this.f14291u, f7Var.f14291u) && Objects.equals(this.f14292v, f7Var.f14292v) && Objects.equals(this.f14293w, f7Var.f14293w) && TextUtils.equals(this.f14294x, f7Var.f14294x) && TextUtils.equals(null, null) && TextUtils.equals(this.f14295y, f7Var.f14295y) && Objects.equals(this.f14296z, f7Var.f14296z) && Objects.equals(this.A, f7Var.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14272a, this.f14273b, this.f14274c, this.f14275d, null, null, this.f14276e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f14277f)), this.f14278g, null, this.f14279h, this.f14280i, this.f14281j, this.f14282k, null, this.f14283m, this.f14284n, this.f14285o, this.f14286p, this.f14287q, this.f14288r, this.f14289s, this.f14290t, this.f14291u, this.f14292v, this.f14293w, this.f14294x, null, this.f14295y, this.f14296z, Boolean.TRUE, this.A);
    }
}
