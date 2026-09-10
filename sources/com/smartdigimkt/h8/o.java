package com.smartdigimkt.h8;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f35785Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ o(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f35785Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ((i) this.f35785Y).a((Runnable) this.Z);
                break;
            default:
                ((a) this.f35785Y).o((String) this.Z);
                break;
        }
    }
}
