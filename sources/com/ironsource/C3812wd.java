package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Pair;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: renamed from: com.ironsource.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3812wd {
    private final Map<String, C3760tc> a;

    /* JADX INFO: renamed from: com.ironsource.wd$a */
    public static final class a extends Lambda implements Function1<String, Pair<? extends String, ? extends C3760tc>> {
        final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.a = jSONObject;
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C3760tc> invoke(String networkName) throws JSONException {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return patroclinal.formularize.attabal(networkName, new C3760tc(networkName, jSONObject));
        }
    }

    public C3812wd(JSONObject providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> itKeys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "providerSettings\n          .keys()");
        Map<String, C3760tc> mapPreprohormone = p002kotlin.collections.seminary.preprohormone(SequencesKt___SequencesKt.restrictive(p002kotlin.sequences.arytenoidectomy.competently(itKeys), new a(providerSettings)));
        this.a = mapPreprohormone;
        for (Map.Entry<String, C3760tc> entry : mapPreprohormone.entrySet()) {
            entry.getKey();
            C3760tc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(C3760tc c3760tc) {
        return c3760tc.o() && c3760tc.l().length() > 0;
    }

    public final Map<String, C3760tc> a() {
        return this.a;
    }

    private final C3760tc a(C3760tc c3760tc) {
        return this.a.get(c3760tc.h());
    }
}
