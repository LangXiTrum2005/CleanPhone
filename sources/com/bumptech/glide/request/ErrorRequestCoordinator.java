package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Request f12790c;
    public volatile Request d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RequestCoordinator.RequestState f12791e;
    public RequestCoordinator.RequestState f;

    public ErrorRequestCoordinator(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f12791e = requestState;
        this.f = requestState;
        this.f12788a = obj;
        this.f12789b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public final boolean a() {
        boolean z2;
        synchronized (this.f12788a) {
            try {
                z2 = this.f12790c.a() || this.d.a();
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
        boolean zEquals;
        RequestCoordinator.RequestState requestState;
        synchronized (this.f12788a) {
            ?? r1 = this.f12789b;
            z2 = false;
            if (r1 == 0 || r1.b(this)) {
                RequestCoordinator.RequestState requestState2 = this.f12791e;
                RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
                if (requestState2 != requestState3) {
                    zEquals = request.equals(this.f12790c);
                } else {
                    zEquals = request.equals(this.d) && ((requestState = this.f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3);
                }
                if (zEquals) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean c() {
        boolean z2;
        synchronized (this.f12788a) {
            try {
                RequestCoordinator.RequestState requestState = this.f12791e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z2 = requestState == requestState2 && this.f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.f12788a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f12791e = requestState;
                this.f12790c.clear();
                if (this.f != requestState) {
                    this.f = requestState;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean d(Request request) {
        boolean z2;
        synchronized (this.f12788a) {
            ?? r0 = this.f12789b;
            z2 = r0 == 0 || r0.d(this);
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean e() {
        boolean z2;
        synchronized (this.f12788a) {
            try {
                RequestCoordinator.RequestState requestState = this.f12791e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z2 = requestState == requestState2 || this.f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void f(Request request) {
        synchronized (this.f12788a) {
            try {
                if (request.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    ?? r3 = this.f12789b;
                    if (r3 != 0) {
                        r3.f(this);
                    }
                    return;
                }
                this.f12791e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f = requestState2;
                    this.d.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean g(Request request) {
        if (request instanceof ErrorRequestCoordinator) {
            ErrorRequestCoordinator errorRequestCoordinator = (ErrorRequestCoordinator) request;
            if (this.f12790c.g(errorRequestCoordinator.f12790c) && this.d.g(errorRequestCoordinator.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f12788a) {
            try {
                ?? r1 = this.f12789b;
                root = r1 != 0 ? r1.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.Request
    public final void h() {
        synchronized (this.f12788a) {
            try {
                RequestCoordinator.RequestState requestState = this.f12791e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f12791e = requestState2;
                    this.f12790c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void i(Request request) {
        synchronized (this.f12788a) {
            try {
                if (request.equals(this.f12790c)) {
                    this.f12791e = RequestCoordinator.RequestState.SUCCESS;
                } else if (request.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                }
                ?? r3 = this.f12789b;
                if (r3 != 0) {
                    r3.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.f12788a) {
            try {
                RequestCoordinator.RequestState requestState = this.f12791e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z2 = requestState == requestState2 || this.f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean j(Request request) {
        boolean z2;
        synchronized (this.f12788a) {
            ?? r1 = this.f12789b;
            z2 = (r1 == 0 || r1.j(this)) && request.equals(this.f12790c);
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.f12788a) {
            try {
                RequestCoordinator.RequestState requestState = this.f12791e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f12791e = RequestCoordinator.RequestState.PAUSED;
                    this.f12790c.pause();
                }
                if (this.f == requestState2) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
