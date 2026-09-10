package com.inmobi.media;

import java.util.TimerTask;

/* JADX INFO: renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3023fe extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3039ge f23616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f23617b;

    public C3023fe(C3039ge c3039ge, byte b2) {
        this.f23616a = c3039ge;
        this.f23617b = b2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f23616a.a(this.f23617b);
    }
}
