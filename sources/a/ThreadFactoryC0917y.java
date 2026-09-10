package A;

import com.applovin.impl.communicator.MessagingServiceImpl;
import com.inmobi.media.O4;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: A.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ThreadFactoryC0917y implements ThreadFactory {
    public final /* synthetic */ int X;

    public /* synthetic */ ThreadFactoryC0917y(int i2) {
        this.X = i2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.X) {
            case 0:
                return O4.a(runnable);
            case 1:
                return O4.b(runnable);
            default:
                return MessagingServiceImpl.a(runnable);
        }
    }
}
