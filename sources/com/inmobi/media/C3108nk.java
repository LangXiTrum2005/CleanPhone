package com.inmobi.media;

import java.util.TimerTask;

/* JADX INFO: renamed from: com.inmobi.media.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3108nk extends TimerTask {
    public final /* synthetic */ C3133ok a;
    public final /* synthetic */ byte b;

    public C3108nk(C3133ok c3133ok, byte b) {
        this.a = c3133ok;
        this.b = b;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
