package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class P implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ id f24214Y;

    public /* synthetic */ P(id idVar, int i2) {
        this.X = i2;
        this.f24214Y = idVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                id.f(this.f24214Y);
                break;
            case 1:
                id.b(this.f24214Y);
                break;
            case 2:
                id.c(this.f24214Y);
                break;
            case 3:
                id.d(this.f24214Y);
                break;
            case 4:
                id.a(this.f24214Y);
                break;
            default:
                id.e(this.f24214Y);
                break;
        }
    }
}
