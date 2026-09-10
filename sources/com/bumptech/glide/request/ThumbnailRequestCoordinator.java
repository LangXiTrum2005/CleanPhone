package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public class ThumbnailRequestCoordinator implements RequestCoordinator, Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile SingleRequest f12811c;
    public volatile Request d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RequestCoordinator.RequestState f12812e;
    public RequestCoordinator.RequestState f;
    public boolean g;

    public ThumbnailRequestCoordinator(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f12812e = requestState;
        this.f = requestState;
        this.f12810b = obj;
        this.f12809a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public final boolean a() {
        boolean z2;
        synchronized (this.f12810b) {
            try {
                z2 = this.d.a() || this.f12811c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean b(Request request) {
        boolean z2;
        synchronized (this.f12810b) {
            try {
                ?? r1 = this.f12809a;
                z2 = (r1 == 0 || r1.b(this)) && request.equals(this.f12811c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean c() {
        boolean z2;
        synchronized (this.f12810b) {
            z2 = this.f12812e == RequestCoordinator.RequestState.CLEARED;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.f12810b) {
            this.g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f12812e = requestState;
            this.f = requestState;
            this.d.clear();
            this.f12811c.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean d(Request request) {
        boolean z2;
        synchronized (this.f12810b) {
            try {
                ?? r1 = this.f12809a;
                z2 = (r1 == 0 || r1.d(this)) && (request.equals(this.f12811c) || this.f12812e != RequestCoordinator.RequestState.SUCCESS);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean e() {
        boolean z2;
        synchronized (this.f12810b) {
            z2 = this.f12812e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void f(Request request) {
        synchronized (this.f12810b) {
            try {
                if (!request.equals(this.f12811c)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f12812e = RequestCoordinator.RequestState.FAILED;
                ?? r3 = this.f12809a;
                if (r3 != 0) {
                    r3.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean g(Request request) {
        if (!(request instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) request;
        if (this.f12811c == null) {
            if (thumbnailRequestCoordinator.f12811c != null) {
                return false;
            }
        } else if (!this.f12811c.g(thumbnailRequestCoordinator.f12811c)) {
            return false;
        }
        if (this.d == null) {
            return thumbnailRequestCoordinator.d == null;
        }
        return this.d.g(thumbnailRequestCoordinator.d);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f12810b) {
            try {
                ?? r1 = this.f12809a;
                root = r1 != 0 ? r1.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.Request
    public final void h() {
        synchronized (this.f12810b) {
            try {
                this.g = true;
                try {
                    if (this.f12812e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f = requestState2;
                            this.d.h();
                        }
                    }
                    if (this.g) {
                        RequestCoordinator.RequestState requestState3 = this.f12812e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f12812e = requestState4;
                            this.f12811c.h();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void i(Request request) {
        synchronized (this.f12810b) {
            try {
                if (request.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f12812e = RequestCoordinator.RequestState.SUCCESS;
                ?? r3 = this.f12809a;
                if (r3 != 0) {
                    r3.i(this);
                }
                if (!this.f.X) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.f12810b) {
            z2 = this.f12812e == RequestCoordinator.RequestState.RUNNING;
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean j(Request request) {
        boolean z2;
        synchronized (this.f12810b) {
            try {
                ?? r1 = this.f12809a;
                z2 = (r1 == 0 || r1.j(this)) && request.equals(this.f12811c) && this.f12812e != RequestCoordinator.RequestState.PAUSED;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.f12810b) {
            try {
                if (!this.f.X) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
                if (!this.f12812e.X) {
                    this.f12812e = RequestCoordinator.RequestState.PAUSED;
                    this.f12811c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
