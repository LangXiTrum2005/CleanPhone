package androidx.privacysandbox.ads.adservices.appsetid;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerApi31Ext9Impl;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class AppSetIdManager$Companion$obtain$1 extends Lambda implements Function1<Context, AppSetIdManagerApi31Ext9Impl> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.f(it, "it");
        Intrinsics.f(null, "context");
        android.adservices.appsetid.AppSetIdManager appSetIdManager = android.adservices.appsetid.AppSetIdManager.get(null);
        Intrinsics.e(appSetIdManager, "get(context)");
        return new AppSetIdManagerApi31Ext9Impl(appSetIdManager);
    }
}
