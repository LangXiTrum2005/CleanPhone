package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.a f4286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a f4288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.b f4289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f4290e;

    public d0(Fragment fragment, s.a aVar, AtomicReference atomicReference, i.a aVar2, h.b bVar) {
        this.f4290e = fragment;
        this.f4286a = aVar;
        this.f4287b = atomicReference;
        this.f4288c = aVar2;
        this.f4289d = bVar;
    }

    @Override // androidx.fragment.app.f0
    public final void a() {
        Fragment fragment = this.f4290e;
        this.f4287b.set(((h.h) this.f4286a.apply(null)).c(fragment.generateActivityResultKey(), fragment, this.f4288c, this.f4289d));
    }
}
