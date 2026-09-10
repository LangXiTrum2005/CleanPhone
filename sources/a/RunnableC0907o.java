package A;

import android.content.Context;
import androidx.profileinstaller.ProfileInstaller;
import com.chartboost.sdk.Chartboost;
import com.inmobi.media.De;
import com.inmobi.media.Ya;
import com.startapp.sdk.internal.jh;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: A.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0907o implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Context f3188Y;

    public /* synthetic */ RunnableC0907o(Context context, int i2) {
        this.X = i2;
        this.f3188Y = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                De.b(this.f3188Y);
                break;
            case 1:
                De.d(this.f3188Y);
                break;
            case 2:
                Ya.a(this.f3188Y);
                break;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0907o(this.f3188Y, 4));
                break;
            case 4:
                ProfileInstaller.b(this.f3188Y, new androidx.arch.core.executor.a(1), ProfileInstaller.f7979a, false);
                break;
            case 5:
                jh.e(this.f3188Y);
                break;
            default:
                Chartboost.initContainer$lambda$0(this.f3188Y);
                break;
        }
    }
}
