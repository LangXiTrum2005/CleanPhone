package com.p004ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.media.a;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\u0005\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J-\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\rJ\u0016\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002J\n\u0010\u0005\u001a\u00020\u0011*\u00020\u0010J\n\u0010\u0005\u001a\u00020\u0013*\u00020\u0012J\u0010\u0010\u0005\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/vv;", "", "", "list", "", "a", "elem", "Landroid/content/Context;", "context", "", "dp", "", "items", "([Ljava/lang/Object;)Ljava/util/List;", "methodArgs", "b", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "Lcom/unity3d/mediation/LevelPlayAdError;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "Landroid/view/ViewGroup$LayoutParams;", "Ljava/lang/String;", "CONST_COMMA", "c", "CONST_START_OF_ARRAY", "d", "CONST_END_OF_ARRAY", "e", "I", "BANNER_BOTTOM_MARGIN", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vv f27547a = new vv();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String CONST_COMMA = ",";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String CONST_START_OF_ARRAY = "[";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String CONST_END_OF_ARRAY = "]";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int BANNER_BOTTOM_MARGIN = 118;

    private vv() {
    }

    private final int a(Context context, int dp) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (dp * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }

    public final String b(List<? extends Object> methodArgs) {
        Intrinsics.f(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            StringBuilder sbW = a.w(str);
            sbW.append(obj instanceof List ? f27547a.a((List<?>) obj) : f27547a.a(obj));
            str = sbW.toString() + AbstractJsonLexerKt.COMMA;
        }
        return StringsKt.E(str, CONST_COMMA);
    }

    public final ViewGroup.LayoutParams a(Context context) {
        RelativeLayout.LayoutParams layoutParamsG = Z.g(-1, -2, 12, -1);
        layoutParamsG.bottomMargin = a(context, 118);
        return layoutParamsG;
    }

    public final AdInfo a(LevelPlayAdInfo levelPlayAdInfo) throws JSONException {
        Intrinsics.f(levelPlayAdInfo, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auctionId", levelPlayAdInfo.getAuctionId());
        jSONObject.put("adUnit", levelPlayAdInfo.getAdFormat());
        jSONObject.put("country", levelPlayAdInfo.getCountry());
        jSONObject.put("ab", levelPlayAdInfo.getAb());
        jSONObject.put("segmentName", levelPlayAdInfo.getSegmentName());
        jSONObject.put("placement", levelPlayAdInfo.getPlacementName());
        jSONObject.put("adNetwork", levelPlayAdInfo.getAdNetwork());
        jSONObject.put("instanceName", levelPlayAdInfo.getInstanceName());
        jSONObject.put("instanceId", levelPlayAdInfo.getInstanceId());
        jSONObject.put("precision", levelPlayAdInfo.getPrecision());
        jSONObject.put("encryptedCPM", levelPlayAdInfo.getEncryptedCPM());
        jSONObject.put("revenue", levelPlayAdInfo.getRevenue());
        return new AdInfo(new ImpressionData(jSONObject), null);
    }

    public final IronSourceError a(LevelPlayAdError levelPlayAdError) {
        Intrinsics.f(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    private final String a(Object elem) {
        if (!(elem instanceof String)) {
            return String.valueOf(elem);
        }
        return "'" + elem + '\'';
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = str + f27547a.a(it.next()) + AbstractJsonLexerKt.COMMA;
        }
        return StringsKt.E(str, CONST_COMMA).concat("]");
    }

    public final List<Object> a(Object... items) {
        Intrinsics.f(items, "items");
        return CollectionsKt.I(Arrays.copyOf(items, items.length));
    }
}
