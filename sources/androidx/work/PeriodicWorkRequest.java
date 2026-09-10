package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class PeriodicWorkRequest extends WorkRequest {

    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        @Override // androidx.work.WorkRequest.Builder
        public final WorkRequest b() {
            return new PeriodicWorkRequest(this.f8647a, this.f8648b, this.f8649c);
        }
    }
}
