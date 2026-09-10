package com.applovin.impl.communicator;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7675a;

    public /* synthetic */ a(int i10) {
        this.f7675a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f7675a) {
            case 0:
                return MessagingServiceImpl.a(runnable);
            default:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }
}
