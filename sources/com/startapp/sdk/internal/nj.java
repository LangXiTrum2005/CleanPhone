package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* JADX INFO: loaded from: classes6.dex */
public final class nj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoListener f41280a;

    public nj(VideoListener videoListener, Context context) {
        this.f41280a = videoListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41280a.onVideoCompleted();
        } catch (Throwable th) {
            vi.a((Object) this.f41280a, th);
        }
    }
}
