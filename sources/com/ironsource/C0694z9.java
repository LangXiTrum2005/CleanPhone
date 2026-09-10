package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0694z9 implements InterfaceC0701zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cb f31349a;

    /* JADX INFO: renamed from: com.ironsource.z9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31350a = new a();

        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.b("Load task config is null");
        }
    }

    public C0694z9(Cb cb2) {
        this.f31349a = cb2;
    }

    @Override // com.ironsource.InterfaceC0701zg
    public void a() {
        a(this.f31349a != null, a.f31350a);
    }
}
