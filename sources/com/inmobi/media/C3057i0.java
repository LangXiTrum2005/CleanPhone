package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3057i0 implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3153o0 f23678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23679b;

    public C3057i0(C3153o0 c3153o0, boolean z2) {
        this.f23678a = c3153o0;
        this.f23679b = z2;
    }

    @Override // com.inmobi.media.Va
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f23678a.a("result pushed to queue");
        if (this.f23679b) {
            C3153o0 c3153o0 = this.f23678a;
            c3153o0.a("session end - cleanup");
            c3153o0.g = null;
            c3153o0.f.clear();
            c3153o0.f23844c.set(false);
            c3153o0.d.set(false);
        }
    }

    @Override // com.inmobi.media.Va
    public final void onError(Exception exc) {
        this.f23678a.a(exc, "error in pushing to queue");
    }
}
