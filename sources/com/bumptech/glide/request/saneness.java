package com.bumptech.glide.request;

import awlwort.wireman;

/* JADX INFO: compiled from: ThumbnailRequestCoordinator.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness implements RequestCoordinator, wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RequestCoordinator f17898attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public RequestCoordinator.RequestState f17899beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f17900competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile wireman f17901dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public RequestCoordinator.RequestState f17902marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object f17903saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public volatile wireman f17904wireman;

    public saneness(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f17902marial = requestState;
        this.f17899beachfront = requestState;
        this.f17903saneness = obj;
        this.f17898attabal = requestCoordinator;
    }

    private boolean apical() {
        RequestCoordinator requestCoordinator = this.f17898attabal;
        return requestCoordinator == null || requestCoordinator.saneness(this);
    }

    private boolean formularize() {
        RequestCoordinator requestCoordinator = this.f17898attabal;
        return requestCoordinator == null || requestCoordinator.beachfront(this);
    }

    private boolean impassible() {
        RequestCoordinator requestCoordinator = this.f17898attabal;
        return requestCoordinator == null || requestCoordinator.dern(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, awlwort.wireman
    public boolean attabal() {
        boolean z;
        synchronized (this.f17903saneness) {
            try {
                z = this.f17904wireman.attabal() || this.f17901dern.attabal();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean beachfront(wireman wiremanVar) {
        boolean z;
        synchronized (this.f17903saneness) {
            try {
                z = formularize() && wiremanVar.equals(this.f17901dern) && !attabal();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // awlwort.wireman
    public void clear() {
        synchronized (this.f17903saneness) {
            this.f17900competently = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f17902marial = requestState;
            this.f17899beachfront = requestState;
            this.f17904wireman.clear();
            this.f17901dern.clear();
        }
    }

    @Override // awlwort.wireman
    public boolean competently() {
        boolean z;
        synchronized (this.f17903saneness) {
            z = this.f17902marial == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // awlwort.wireman
    public boolean cutely(wireman wiremanVar) {
        if (wiremanVar instanceof saneness) {
            saneness sanenessVar = (saneness) wiremanVar;
            if (this.f17901dern != null ? this.f17901dern.cutely(sanenessVar.f17901dern) : sanenessVar.f17901dern == null) {
                if (this.f17904wireman == null) {
                    if (sanenessVar.f17904wireman == null) {
                        return true;
                    }
                } else if (this.f17904wireman.cutely(sanenessVar.f17904wireman)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean dern(wireman wiremanVar) {
        boolean z;
        synchronized (this.f17903saneness) {
            try {
                z = impassible() && (wiremanVar.equals(this.f17901dern) || this.f17902marial != RequestCoordinator.RequestState.SUCCESS);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f17903saneness) {
            try {
                RequestCoordinator requestCoordinator = this.f17898attabal;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // awlwort.wireman
    public void impromptu() {
        synchronized (this.f17903saneness) {
            try {
                this.f17900competently = true;
                try {
                    if (this.f17902marial != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f17899beachfront;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f17899beachfront = requestState2;
                            this.f17904wireman.impromptu();
                        }
                    }
                    if (this.f17900competently) {
                        RequestCoordinator.RequestState requestState3 = this.f17902marial;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f17902marial = requestState4;
                            this.f17901dern.impromptu();
                        }
                    }
                    this.f17900competently = false;
                } catch (Throwable th) {
                    this.f17900competently = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // awlwort.wireman
    public boolean isRunning() {
        boolean z;
        synchronized (this.f17903saneness) {
            z = this.f17902marial == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // awlwort.wireman
    public boolean marial() {
        boolean z;
        synchronized (this.f17903saneness) {
            z = this.f17902marial == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // awlwort.wireman
    public void pause() {
        synchronized (this.f17903saneness) {
            try {
                if (!this.f17899beachfront.isComplete()) {
                    this.f17899beachfront = RequestCoordinator.RequestState.PAUSED;
                    this.f17904wireman.pause();
                }
                if (!this.f17902marial.isComplete()) {
                    this.f17902marial = RequestCoordinator.RequestState.PAUSED;
                    this.f17901dern.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean saneness(wireman wiremanVar) {
        boolean z;
        synchronized (this.f17903saneness) {
            try {
                z = apical() && wiremanVar.equals(this.f17901dern) && this.f17902marial != RequestCoordinator.RequestState.PAUSED;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void taiyuan(wireman wiremanVar) {
        synchronized (this.f17903saneness) {
            try {
                if (!wiremanVar.equals(this.f17901dern)) {
                    this.f17899beachfront = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f17902marial = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f17898attabal;
                if (requestCoordinator != null) {
                    requestCoordinator.taiyuan(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void triweekly(wireman wiremanVar, wireman wiremanVar2) {
        this.f17901dern = wiremanVar;
        this.f17904wireman = wiremanVar2;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void wireman(wireman wiremanVar) {
        synchronized (this.f17903saneness) {
            try {
                if (wiremanVar.equals(this.f17904wireman)) {
                    this.f17899beachfront = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f17902marial = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f17898attabal;
                if (requestCoordinator != null) {
                    requestCoordinator.wireman(this);
                }
                if (!this.f17899beachfront.isComplete()) {
                    this.f17904wireman.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
