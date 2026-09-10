package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f29861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29863d;

    public /* synthetic */ nh(B b10, int i10, String str, int i11) {
        this.f29860a = i11;
        this.f29861b = b10;
        this.f29862c = i10;
        this.f29863d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29860a) {
            case 0:
                B.b(this.f29861b, this.f29862c, this.f29863d);
                break;
            default:
                B.a(this.f29861b, this.f29862c, this.f29863d);
                break;
        }
    }
}
