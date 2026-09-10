package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;

/* JADX INFO: renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0258b3 implements InterfaceC0701zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cb f28261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSize f28262b;

    /* JADX INFO: renamed from: com.ironsource.b3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28263a = new a();

        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.a("Load task config is null");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b3$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28264a = new b();

        public b() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.l();
        }
    }

    public C0258b3(Cb cb2, AdSize adSize) {
        this.f28261a = cb2;
        this.f28262b = adSize;
    }

    @Override // com.ironsource.InterfaceC0701zg
    public void a() {
        a(this.f28261a != null, a.f28263a);
        a(this.f28262b != null, b.f28264a);
    }
}
