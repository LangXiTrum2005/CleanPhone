package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        public final boolean X;

        RequestState(boolean z2) {
            this.X = z2;
        }
    }

    boolean a();

    boolean b(Request request);

    boolean d(Request request);

    void f(Request request);

    RequestCoordinator getRoot();

    void i(Request request);

    boolean j(Request request);
}
