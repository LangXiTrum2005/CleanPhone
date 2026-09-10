package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ThreadFactory {
    public final /* synthetic */ String X;

    public /* synthetic */ c(String str) {
        this.X = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i2 = Util.f5683a;
        return new Thread(runnable, this.X);
    }
}
