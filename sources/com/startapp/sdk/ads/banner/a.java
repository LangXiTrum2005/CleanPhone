package com.startapp.sdk.ads.banner;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerBase f40424a;

    public a(BannerBase bannerBase) {
        this.f40424a = bannerBase;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1 || i2 == 2) {
            this.f40424a.loadBannerImpl((String) message.obj);
        }
        return true;
    }
}
