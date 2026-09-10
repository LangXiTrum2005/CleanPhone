package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.gson.JsonObject;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.imari;

/* JADX INFO: loaded from: classes.dex */
public final class ag1 {
    public final Context a;
    public final saran b;
    public final x c;

    public ag1(Context context, saran uiScope, x activityTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.a = context;
        this.b = uiScope;
        this.c = activityTracker;
    }

    public static Object a(gq0 gq0Var, String str, String str2, wretchedly.dern dernVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", str2);
        jsonObject.addProperty(PglCryptUtils.KEY_MESSAGE, str);
        Object objA = gq0Var.a(jsonObject, "onError", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final Unit a(gq0 gq0Var) {
        Context contextB = this.c.b();
        if (contextB == null) {
            contextB = this.a;
        }
        Display displayBeachfront = imari.beachfront(contextB);
        if (displayBeachfront == null) {
            kn0.b("Unable to get Display in MraidAfmaDispatcher", null);
            return Unit.f29295attabal;
        }
        int rotation = displayBeachfront.getRotation();
        Intrinsics.checkNotNullParameter(contextB, "<this>");
        DisplayMetrics displayMetrics = contextB.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        float f = displayMetrics.density;
        int i = displayMetrics.widthPixels;
        Intrinsics.checkNotNullParameter(contextB, "<this>");
        Intrinsics.checkNotNullParameter(contextB, "<this>");
        DisplayMetrics displayMetrics2 = contextB.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        int iWireman = pastie.dern.wireman(i / displayMetrics2.density);
        int i2 = displayMetrics.heightPixels;
        Intrinsics.checkNotNullParameter(contextB, "<this>");
        Intrinsics.checkNotNullParameter(contextB, "<this>");
        DisplayMetrics displayMetrics3 = contextB.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        int iWireman2 = pastie.dern.wireman(i2 / displayMetrics3.density);
        Activity activityB = this.c.b();
        Pair pairCompetently = activityB != null ? imari.competently(activityB) : new Pair(igo.attabal.wireman(iWireman), igo.attabal.wireman(iWireman2));
        int iIntValue = ((Number) pairCompetently.component1()).intValue();
        int iIntValue2 = ((Number) pairCompetently.component2()).intValue();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("width", igo.attabal.wireman(iWireman));
        jsonObject.addProperty("height", igo.attabal.wireman(iWireman2));
        jsonObject.addProperty("maxSizeWidth", igo.attabal.wireman(iIntValue));
        jsonObject.addProperty("maxSizeHeight", igo.attabal.wireman(iIntValue2));
        jsonObject.addProperty("density", igo.attabal.saneness(f));
        jsonObject.addProperty("rotation", igo.attabal.wireman(rotation));
        cutely.wireman(this.b, null, null, new zf1(gq0Var, jsonObject, null), 3, null);
        return Unit.f29295attabal;
    }

    public static Object a(gq0 gq0Var, int i, int i2, int i3, int i4, mh1 mh1Var) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("x", igo.attabal.wireman(i));
        jsonObject.addProperty("y", igo.attabal.wireman(i2));
        jsonObject.addProperty("width", igo.attabal.wireman(i3));
        jsonObject.addProperty("height", igo.attabal.wireman(i4));
        Object objA = gq0Var.a(jsonObject, "onSizeChanged", mh1Var);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static Object a(gq0 gq0Var, String str, ContinuationImpl continuationImpl) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("state", str);
        Object objA = gq0Var.a(jsonObject, "onStateChanged", continuationImpl);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
