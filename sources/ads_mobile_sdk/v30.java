package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import arytenoidectomy.apical;
import arytenoidectomy.competently;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v30 extends competently {
    public final Context a;
    public final saran b;
    public final ri2 c;
    public apical d;
    public arytenoidectomy.wireman e;
    public final AtomicBoolean f;

    public v30(Context applicationContext, saran backgroundScope, ri2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.a = applicationContext;
        this.b = backgroundScope;
        this.c = rootTraceCreator;
        this.f = new AtomicBoolean(false);
    }

    @Override // arytenoidectomy.competently
    public final void onCustomTabsServiceConnected(ComponentName name, arytenoidectomy.wireman client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        this.e = client;
        client.competently(0L);
        this.d = client.marial(new u30(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.d = null;
        this.e = null;
    }
}
