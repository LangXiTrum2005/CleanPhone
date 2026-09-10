package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0376hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0447ld f28793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28795f;

    /* JADX INFO: renamed from: com.ironsource.hd$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f28796a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f28797b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f28798c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EnumC0447ld f28799d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f28800e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f28801f = 0;

        public a a(boolean z10) {
            this.f28796a = z10;
            return this;
        }

        public a a(boolean z10, EnumC0447ld enumC0447ld, int i10) {
            this.f28797b = z10;
            if (enumC0447ld == null) {
                enumC0447ld = EnumC0447ld.PER_DAY;
            }
            this.f28799d = enumC0447ld;
            this.f28800e = i10;
            return this;
        }

        public a a(boolean z10, int i10) {
            this.f28798c = z10;
            this.f28801f = i10;
            return this;
        }

        public C0376hd a() {
            return new C0376hd(this.f28796a, this.f28797b, this.f28798c, this.f28799d, this.f28800e, this.f28801f, 0);
        }
    }

    public /* synthetic */ C0376hd(boolean z10, boolean z11, boolean z12, EnumC0447ld enumC0447ld, int i10, int i11, int i12) {
        this(z10, z11, z12, enumC0447ld, i10, i11);
    }

    public EnumC0447ld a() {
        return this.f28793d;
    }

    public int b() {
        return this.f28794e;
    }

    public int c() {
        return this.f28795f;
    }

    public boolean d() {
        return this.f28791b;
    }

    public boolean e() {
        return this.f28790a;
    }

    public boolean f() {
        return this.f28792c;
    }

    private C0376hd(boolean z10, boolean z11, boolean z12, EnumC0447ld enumC0447ld, int i10, int i11) {
        this.f28790a = z10;
        this.f28791b = z11;
        this.f28792c = z12;
        this.f28793d = enumC0447ld;
        this.f28794e = i10;
        this.f28795f = i11;
    }
}
