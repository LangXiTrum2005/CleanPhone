package tower;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.X3;
import com.yoadx.ad.lib.core.YoadAdSdk;
import complexometry.taiyuan;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FirebaseReporter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltower/marial;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", X3.i.j0, "Landroid/os/Bundle;", "params", "", "dern", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "Lcomplexometry/taiyuan;", "adValue", "bundle", "wireman", "(Landroid/content/Context;Lcomplexometry/taiyuan;Landroid/os/Bundle;)V", "saneness", "attabal", "(Landroid/os/Bundle;)Ljava/lang/String;", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f38903attabal = new marial();

    public final String attabal(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        StringBuilder sb = new StringBuilder();
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            sb.append(str);
            sb.append(":");
            sb.append(bundle.get(str));
            sb.append(",");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void dern(Context context, String eventName, Bundle params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        if (YoadAdSdk.f23874attabal.competently()) {
            saneness(context, eventName, params);
        }
    }

    public final void saneness(Context context, String eventName, Bundle params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
        firebaseAnalytics.attabal(eventName, params);
        dustman.attabal attabalVar = dustman.attabal.f25384attabal;
        if (attabalVar.dern()) {
            attabalVar.attabal("firebaseReporter_" + params.getString("ad_format"), eventName + ", " + attabal(params));
        }
    }

    public final void wireman(Context context, taiyuan adValue, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        saneness(context, "ud_ad_impression", bundle);
    }
}
