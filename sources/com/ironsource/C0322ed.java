package com.ironsource;

import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0322ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f28530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f28531f;

    public C0322ed() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.f28526a;
    }

    public final String b() {
        return this.f28527b;
    }

    public final boolean c() {
        return this.f28528c;
    }

    public final int d() {
        return this.f28529d;
    }

    public final int[] e() {
        return this.f28530e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0322ed)) {
            return false;
        }
        C0322ed c0322ed = (C0322ed) obj;
        return this.f28526a == c0322ed.f28526a && kotlin.jvm.internal.n.a(this.f28527b, c0322ed.f28527b) && this.f28528c == c0322ed.f28528c && this.f28529d == c0322ed.f28529d && kotlin.jvm.internal.n.a(this.f28530e, c0322ed.f28530e) && kotlin.jvm.internal.n.a(this.f28531f, c0322ed.f28531f);
    }

    public final int[] f() {
        return this.f28531f;
    }

    public final boolean g() {
        return this.f28528c;
    }

    public final int h() {
        return this.f28529d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        boolean z10 = this.f28526a;
        ?? r0 = z10;
        if (z10) {
            r0 = 1;
        }
        int iE = d5.u.e(r0 * 31, 31, this.f28527b);
        boolean z11 = this.f28528c;
        int iF = wi.d.f(this.f28529d, (iE + (z11 ? 1 : z11)) * 31, 31);
        int[] iArr = this.f28530e;
        int iHashCode = (iF + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f28531f;
        return iHashCode + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f28526a;
    }

    public final String j() {
        return this.f28527b;
    }

    public final int[] k() {
        return this.f28531f;
    }

    public final int[] l() {
        return this.f28530e;
    }

    public String toString() {
        boolean z10 = this.f28526a;
        String str = this.f28527b;
        boolean z11 = this.f28528c;
        int i10 = this.f28529d;
        String string = Arrays.toString(this.f28530e);
        String string2 = Arrays.toString(this.f28531f);
        StringBuilder sb2 = new StringBuilder("PixelSettings(pixelEventsEnabled=");
        sb2.append(z10);
        sb2.append(", pixelEventsUrl=");
        sb2.append(str);
        sb2.append(", pixelEventsCompression=");
        sb2.append(z11);
        sb2.append(", pixelEventsCompressionLevel=");
        sb2.append(i10);
        sb2.append(", pixelOptOut=");
        return d5.u.h(sb2, string, ", pixelOptIn=", string2, ")");
    }

    public C0322ed(boolean z10, String pixelEventsUrl, boolean z11, int i10, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.n.f(pixelEventsUrl, "pixelEventsUrl");
        this.f28526a = z10;
        this.f28527b = pixelEventsUrl;
        this.f28528c = z11;
        this.f28529d = i10;
        this.f28530e = iArr;
        this.f28531f = iArr2;
    }

    public final C0322ed a(boolean z10, String pixelEventsUrl, boolean z11, int i10, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.n.f(pixelEventsUrl, "pixelEventsUrl");
        return new C0322ed(z10, pixelEventsUrl, z11, i10, iArr, iArr2);
    }

    public final void b(boolean z10) {
        this.f28526a = z10;
    }

    public static /* synthetic */ C0322ed a(C0322ed c0322ed, boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c0322ed.f28526a;
        }
        if ((i11 & 2) != 0) {
            str = c0322ed.f28527b;
        }
        if ((i11 & 4) != 0) {
            z11 = c0322ed.f28528c;
        }
        if ((i11 & 8) != 0) {
            i10 = c0322ed.f28529d;
        }
        if ((i11 & 16) != 0) {
            iArr = c0322ed.f28530e;
        }
        if ((i11 & 32) != 0) {
            iArr2 = c0322ed.f28531f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c0322ed.a(z10, str, z11, i10, iArr3, iArr4);
    }

    public final void b(int[] iArr) {
        this.f28530e = iArr;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f28527b = str;
    }

    public final void a(boolean z10) {
        this.f28528c = z10;
    }

    public final void a(int i10) {
        this.f28529d = i10;
    }

    public final void a(int[] iArr) {
        this.f28531f = iArr;
    }

    public /* synthetic */ C0322ed(boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, kotlin.jvm.internal.g gVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? C0340fd.f28675a : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? -1 : i10, (i11 & 16) != 0 ? null : iArr, (i11 & 32) != 0 ? null : iArr2);
    }
}
