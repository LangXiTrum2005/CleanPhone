package retrofit2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f45325Y;
    public final /* synthetic */ Callback Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i2) {
        this.X = i2;
        this.f45325Y = anonymousClass1;
        this.Z = callback;
        this.e0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                this.f45325Y.lambda$onResponse$0(this.Z, (Response) this.e0);
                break;
            default:
                this.f45325Y.lambda$onFailure$1(this.Z, (Throwable) this.e0);
                break;
        }
    }
}
