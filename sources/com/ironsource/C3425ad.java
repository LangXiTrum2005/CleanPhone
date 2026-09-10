package com.ironsource;

import java.util.Arrays;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3425ad {
    private boolean a;
    private String b;
    private boolean c;
    private int d;
    private int[] e;
    private int[] f;

    public C3425ad() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int[] e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3425ad)) {
            return false;
        }
        C3425ad c3425ad = (C3425ad) obj;
        return this.a == c3425ad.a && Intrinsics.wireman(this.b, c3425ad.b) && this.c == c3425ad.c && this.d == c3425ad.d && Intrinsics.wireman(this.e, c3425ad.e) && Intrinsics.wireman(this.f, c3425ad.f);
    }

    public final int[] f() {
        return this.f;
    }

    public final boolean g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + this.b.hashCode()) * 31;
        boolean z2 = this.c;
        int iHashCode2 = (((iHashCode + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.d)) * 31;
        int[] iArr = this.e;
        int iHashCode3 = (iHashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f;
        return iHashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.a;
    }

    public final String j() {
        return this.b;
    }

    public final int[] k() {
        return this.f;
    }

    public final int[] l() {
        return this.e;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.a + ", pixelEventsUrl=" + this.b + ", pixelEventsCompression=" + this.c + ", pixelEventsCompressionLevel=" + this.d + ", pixelOptOut=" + Arrays.toString(this.e) + ", pixelOptIn=" + Arrays.toString(this.f) + ")";
    }

    public C3425ad(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.a = z;
        this.b = pixelEventsUrl;
        this.c = z2;
        this.d = i;
        this.e = iArr;
        this.f = iArr2;
    }

    public final C3425ad a(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new C3425ad(z, pixelEventsUrl, z2, i, iArr, iArr2);
    }

    public final void b(boolean z) {
        this.a = z;
    }

    public static /* synthetic */ C3425ad a(C3425ad c3425ad, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c3425ad.a;
        }
        if ((i2 & 2) != 0) {
            str = c3425ad.b;
        }
        if ((i2 & 4) != 0) {
            z2 = c3425ad.c;
        }
        if ((i2 & 8) != 0) {
            i = c3425ad.d;
        }
        if ((i2 & 16) != 0) {
            iArr = c3425ad.e;
        }
        if ((i2 & 32) != 0) {
            iArr2 = c3425ad.f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c3425ad.a(z, str, z2, i, iArr3, iArr4);
    }

    public final void b(int[] iArr) {
        this.e = iArr;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(int[] iArr) {
        this.f = iArr;
    }

    public /* synthetic */ C3425ad(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C3443bd.a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }
}
