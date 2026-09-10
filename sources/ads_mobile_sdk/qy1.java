package ads_mobile_sdk;

import android.app.Activity;
import android.content.ComponentName;
import android.net.Uri;
import arytenoidectomy.competently;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qy1 extends competently {
    public final /* synthetic */ vy1 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;

    public qy1(vy1 vy1Var, Activity activity, Uri uri, String str, Map map) {
        this.a = vy1Var;
        this.b = activity;
        this.c = uri;
        this.d = str;
        this.e = map;
    }

    @Override // arytenoidectomy.competently
    public final void onCustomTabsServiceConnected(ComponentName name, arytenoidectomy.wireman client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        client.competently(0L);
        this.a.a(client.marial(null), this.b, this.c, this.d, this.e);
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
