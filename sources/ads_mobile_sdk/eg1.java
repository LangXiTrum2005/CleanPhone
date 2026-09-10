package ads_mobile_sdk;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class eg1 {
    public final qc0 a;
    public final ag1 b;
    public final ip0 c;
    public final saran d;
    public final x e;

    public eg1(qc0 deviceProperties, ag1 mraidAfmaDispatcher, ip0 gmaUtil, saran uiScope, x activityTracker) {
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.a = deviceProperties;
        this.b = mraidAfmaDispatcher;
        this.c = gmaUtil;
        this.d = uiScope;
        this.e = activityTracker;
    }

    public final Unit a(gq0 gq0Var, Map map) {
        String string;
        String string2;
        String string3;
        String string4;
        Activity activityB = this.e.b();
        if (activityB == null) {
            cutely.wireman(this.d, null, null, new cg1(this, gq0Var, "Activity context is required to show calendar event alert.", null), 3, null);
            return Unit.f29295attabal;
        }
        qc0 qc0Var = this.a;
        qc0Var.getClass();
        Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
        Intrinsics.checkNotNullExpressionValue(type, "setType(...)");
        if (!qc0Var.a(type)) {
            cutely.wireman(this.d, null, null, new cg1(this, gq0Var, "This feature is not available on the device.", null), 3, null);
            return Unit.f29295attabal;
        }
        String str = (String) map.get("start_ticks");
        Long lGraveside = str != null ? StringsKt.graveside(str) : null;
        String str2 = (String) map.get("end_ticks");
        Long lGraveside2 = str2 != null ? StringsKt.graveside(str2) : null;
        String str3 = (String) map.get(InMobiNetworkValues.DESCRIPTION);
        String str4 = str3 == null ? "" : str3;
        String str5 = (String) map.get("summary");
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) map.get("location");
        String str8 = str7 == null ? "" : str7;
        Resources resources = activityB.getResources();
        if (resources == null || (string = resources.getString(danae.dern.mraid_create_calendar_event)) == null) {
            string = "Create calendar event";
        }
        if (resources == null || (string2 = resources.getString(danae.dern.mraid_allow_calendar_event)) == null) {
            string2 = "Allow Ad to create a calendar event?";
        }
        if (resources == null || (string3 = resources.getString(danae.dern.mraid_alert_accept)) == null) {
            string3 = "Accept";
        }
        if (resources == null || (string4 = resources.getString(danae.dern.mraid_alert_decline)) == null) {
            string4 = "Decline";
        }
        cutely.wireman(this.d, null, null, new dg1(activityB, string, string2, string3, string4, str4, str8, str6, lGraveside, lGraveside2, this, gq0Var, null), 3, null);
        return Unit.f29295attabal;
    }
}
