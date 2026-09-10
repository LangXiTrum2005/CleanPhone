package com.vungle.ads.internal.presenter;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MRAIDPresenter f42864Y;

    public /* synthetic */ a(MRAIDPresenter mRAIDPresenter, int i2) {
        this.X = i2;
        this.f42864Y = mRAIDPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                MRAIDPresenter.m3235processCommand$lambda5(this.f42864Y);
                break;
            case 1:
                MRAIDPresenter.m3236processCommand$lambda9(this.f42864Y);
                break;
            case 2:
                MRAIDPresenter.m3233processCommand$lambda10(this.f42864Y);
                break;
            default:
                MRAIDPresenter.m3232prepare$lambda14(this.f42864Y);
                break;
        }
    }
}
