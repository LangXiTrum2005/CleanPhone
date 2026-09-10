package xd;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.b f53745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak.k f53746b;

    public d(ud.b appInfo, ak.k blockingDispatcher) {
        kotlin.jvm.internal.n.f(appInfo, "appInfo");
        kotlin.jvm.internal.n.f(blockingDispatcher, "blockingDispatcher");
        this.f53745a = appInfo;
        this.f53746b = blockingDispatcher;
    }

    public static final URL a(d dVar) {
        dVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ud.b bVar = dVar.f53745a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f52015a).appendPath("settings");
        ud.a aVar = bVar.f52016b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f52007c).appendQueryParameter("display_version", aVar.f52006b).build().toString());
    }
}
