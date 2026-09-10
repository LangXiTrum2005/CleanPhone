package androidx.privacysandbox.ads.adservices.internal;

import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/BackCompatManager;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackCompatManager {
    public static Object a(Context context, String str, Function1 function1) {
        Intrinsics.f(context, "context");
        try {
            return function1.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(str, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + AdServicesInfo.b());
            return null;
        }
    }
}
