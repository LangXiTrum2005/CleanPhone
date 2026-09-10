package com.ironsource;

import android.os.Debug;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26571c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {

        /* JADX INFO: renamed from: com.ironsource.Mb$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0042a implements a {
            @Override // com.ironsource.Mb.a
            public Mb get() {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                int i10 = memoryInfo.dalvikPss;
                int i11 = memoryInfo.nativePss;
                return new Mb(i10, i11, Math.max(0, (memoryInfo.getTotalPss() - i11) - i10));
            }
        }

        Mb get();
    }

    public Mb(int i10, int i11, int i12) {
        this.f26569a = i10;
        this.f26570b = i11;
        this.f26571c = i12;
    }

    public final int a() {
        return this.f26569a;
    }

    public final int b() {
        return this.f26570b;
    }

    public final int c() {
        return this.f26571c;
    }

    public final int d() {
        return this.f26569a;
    }

    public final int e() {
        return this.f26570b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mb)) {
            return false;
        }
        Mb mb2 = (Mb) obj;
        return this.f26569a == mb2.f26569a && this.f26570b == mb2.f26570b && this.f26571c == mb2.f26571c;
    }

    public final int f() {
        return this.f26571c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f26571c) + wi.d.f(this.f26570b, Integer.hashCode(this.f26569a) * 31, 31);
    }

    public String toString() {
        int i10 = this.f26569a;
        int i11 = this.f26570b;
        return l1.d.i(l1.d.l("MemoryInfo(javaHeapKb=", i10, ", nativeHeapKb=", i11, ", sharedOtherKb="), this.f26571c, ")");
    }

    public final Mb a(int i10, int i11, int i12) {
        return new Mb(i10, i11, i12);
    }

    public static /* synthetic */ Mb a(Mb mb2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = mb2.f26569a;
        }
        if ((i13 & 2) != 0) {
            i11 = mb2.f26570b;
        }
        if ((i13 & 4) != 0) {
            i12 = mb2.f26571c;
        }
        return mb2.a(i10, i11, i12);
    }
}
