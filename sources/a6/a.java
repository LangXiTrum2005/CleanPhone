package a6;

import com.applovin.shadow.okhttp3.internal.Util;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3411c;

    public /* synthetic */ a(int i10, String str, boolean z10) {
        this.f3409a = i10;
        this.f3410b = str;
        this.f3411c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3409a) {
            case 0:
                return Util.threadFactory$lambda$1(this.f3410b, this.f3411c, runnable);
            default:
                String name = this.f3410b;
                n.f(name, "$name");
                Thread thread = new Thread(runnable, name);
                thread.setDaemon(this.f3411c);
                return thread;
        }
    }
}
