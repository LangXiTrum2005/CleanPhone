package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ be f23319b = new be(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ be f23320c = new be(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23321a;

    public /* synthetic */ be(int i10) {
        this.f23321a = i10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f23321a) {
            case 0:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    private final /* synthetic */ void a() {
    }
}
