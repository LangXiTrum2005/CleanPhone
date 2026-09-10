package com.bumptech.glide.request;

import awlwort.wireman;

/* JADX INFO: compiled from: ErrorRequestCoordinator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal implements RequestCoordinator, wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f17892attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public RequestCoordinator.RequestState f17893beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile wireman f17894dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public RequestCoordinator.RequestState f17895marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final RequestCoordinator f17896saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public volatile wireman f17897wireman;

    public attabal(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f17895marial = requestState;
        this.f17893beachfront = requestState;
        this.f17892attabal = obj;
        this.f17896saneness = requestCoordinator;
    }

    public final boolean apical(wireman wiremanVar) {
        RequestCoordinator.RequestState requestState = this.f17895marial;
        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.FAILED;
        if (requestState != requestState2) {
            return wiremanVar.equals(this.f17894dern);
        }
        if (!wiremanVar.equals(this.f17897wireman)) {
            return false;
        }
        RequestCoordinator.RequestState requestState3 = this.f17893beachfront;
        return requestState3 == RequestCoordinator.RequestState.SUCCESS || requestState3 == requestState2;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, awlwort.wireman
    public boolean attabal() {
        boolean z;
        synchronized (this.f17892attabal) {
            try {
                z = this.f17894dern.attabal() || this.f17897wireman.attabal();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean beachfront(wireman wiremanVar) {
        boolean z;
        synchronized (this.f17892attabal) {
            try {
                z = impassible() && apical(wiremanVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // awlwort.wireman
    public void clear() {
        synchronized (this.f17892attabal) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f17895marial = requestState;
                this.f17894dern.clear();
                if (this.f17893beachfront != requestState) {
                    this.f17893beachfront = requestState;
                    this.f17897wireman.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // awlwort.wireman
    public boolean competently() {
        boolean z;
        synchronized (this.f17892attabal) {
            try {
                RequestCoordinator.RequestState requestState = this.f17895marial;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z = requestState == requestState2 || this.f17893beachfront == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // awlwort.wireman
    public boolean cutely(wireman wiremanVar) {
        if (wiremanVar instanceof attabal) {
            attabal attabalVar = (attabal) wiremanVar;
            if (this.f17894dern.cutely(attabalVar.f17894dern) && this.f17897wireman.cutely(attabalVar.f17897wireman)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean dern(wireman wiremanVar) {
        boolean zTriweekly;
        synchronized (this.f17892attabal) {
            zTriweekly = triweekly();
        }
        return zTriweekly;
    }

    public final boolean formularize() {
        RequestCoordinator requestCoordinator = this.f17896saneness;
        return requestCoordinator == null || requestCoordinator.saneness(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f17892attabal) {
            try {
                RequestCoordinator requestCoordinator = this.f17896saneness;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    public final boolean impassible() {
        RequestCoordinator requestCoordinator = this.f17896saneness;
        return requestCoordinator == null || requestCoordinator.beachfront(this);
    }

    @Override // awlwort.wireman
    public void impromptu() {
        synchronized (this.f17892attabal) {
            try {
                RequestCoordinator.RequestState requestState = this.f17895marial;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f17895marial = requestState2;
                    this.f17894dern.impromptu();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // awlwort.wireman
    public boolean isRunning() {
        boolean z;
        synchronized (this.f17892attabal) {
            try {
                RequestCoordinator.RequestState requestState = this.f17895marial;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z = requestState == requestState2 || this.f17893beachfront == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void kowloon(wireman wiremanVar, wireman wiremanVar2) {
        this.f17894dern = wiremanVar;
        this.f17897wireman = wiremanVar2;
    }

    @Override // awlwort.wireman
    public boolean marial() {
        boolean z;
        synchronized (this.f17892attabal) {
            try {
                RequestCoordinator.RequestState requestState = this.f17895marial;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z = requestState == requestState2 && this.f17893beachfront == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // awlwort.wireman
    public void pause() {
        synchronized (this.f17892attabal) {
            try {
                RequestCoordinator.RequestState requestState = this.f17895marial;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f17895marial = RequestCoordinator.RequestState.PAUSED;
                    this.f17894dern.pause();
                }
                if (this.f17893beachfront == requestState2) {
                    this.f17893beachfront = RequestCoordinator.RequestState.PAUSED;
                    this.f17897wireman.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean saneness(wireman wiremanVar) {
        boolean z;
        synchronized (this.f17892attabal) {
            try {
                z = formularize() && wiremanVar.equals(this.f17894dern);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void taiyuan(wireman wiremanVar) {
        synchronized (this.f17892attabal) {
            try {
                if (wiremanVar.equals(this.f17897wireman)) {
                    this.f17893beachfront = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f17896saneness;
                    if (requestCoordinator != null) {
                        requestCoordinator.taiyuan(this);
                    }
                    return;
                }
                this.f17895marial = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f17893beachfront;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f17893beachfront = requestState2;
                    this.f17897wireman.impromptu();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean triweekly() {
        RequestCoordinator requestCoordinator = this.f17896saneness;
        return requestCoordinator == null || requestCoordinator.dern(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void wireman(wireman wiremanVar) {
        synchronized (this.f17892attabal) {
            try {
                if (wiremanVar.equals(this.f17894dern)) {
                    this.f17895marial = RequestCoordinator.RequestState.SUCCESS;
                } else if (wiremanVar.equals(this.f17897wireman)) {
                    this.f17893beachfront = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f17896saneness;
                if (requestCoordinator != null) {
                    requestCoordinator.wireman(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
