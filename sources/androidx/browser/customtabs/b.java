package androidx.browser.customtabs;

import android.os.Bundle;
import com.inmobi.media.C3075j2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3075j2 f3720Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Bundle e0;

    public /* synthetic */ b(C3075j2 c3075j2, boolean z2, Bundle bundle, int i2) {
        this.X = i2;
        this.f3720Y = c3075j2;
        this.Z = z2;
        this.e0 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.e0;
        boolean z2 = this.Z;
        C3075j2 c3075j2 = this.f3720Y;
        switch (this.X) {
            case 0:
                int i2 = CustomTabsSession.AnonymousClass1.Z;
                c3075j2.onSessionEnded(z2, bundle);
                break;
            default:
                int i3 = CustomTabsSession.AnonymousClass1.Z;
                c3075j2.onVerticalScrollEvent(z2, bundle);
                break;
        }
    }
}
