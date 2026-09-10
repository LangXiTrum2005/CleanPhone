package com.startapp.sdk.ads.list3d;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f40503a;

    public d(List3DView list3DView) {
        this.f40503a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA;
        List3DView list3DView = this.f40503a;
        if (list3DView.f40490b != 1 || (iA = list3DView.a(list3DView.f40491c, list3DView.d)) == -1) {
            return;
        }
        this.f40503a.a(iA);
    }
}
