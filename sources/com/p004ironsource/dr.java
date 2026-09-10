package com.p004ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R#\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0006\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ironsource/dr;", "", "Lcom/ironsource/bp;", "networkSettings", "", "b", "a", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "Lorg/json/JSONObject;", xs.f27731b, "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, bp> networkSettings;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "networkName", "Lkotlin/Pair;", "Lcom/ironsource/bp;", "a", "(Ljava/lang/String;)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function1<String, Pair<? extends String, ? extends bp>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f24834a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.f24834a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, bp> invoke(String networkName) throws JSONException {
            Intrinsics.e(networkName, "networkName");
            JSONObject jSONObject = this.f24834a.getJSONObject(networkName);
            Intrinsics.e(jSONObject, "providerSettings.getJSONObject(networkName)");
            return new Pair<>(networkName, new bp(networkName, jSONObject));
        }
    }

    public dr(JSONObject providerSettings) {
        Intrinsics.f(providerSettings, "providerSettings");
        Iterator<String> itKeys = providerSettings.keys();
        Intrinsics.e(itKeys, "providerSettings\n          .keys()");
        Map<String, bp> mapR = MapsKt.r(SequencesKt.o(SequencesKt.b(itKeys), new a(providerSettings)));
        this.networkSettings = mapR;
        for (Map.Entry<String, bp> entry : mapR.entrySet()) {
            entry.getKey();
            bp value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final bp a(bp networkSettings) {
        return this.networkSettings.get(networkSettings.getCom.ironsource.cp.e java.lang.String());
    }

    private final boolean b(bp networkSettings) {
        return networkSettings.getIsMultipleInstances() && networkSettings.getProviderTypeForReflection().length() > 0;
    }

    public final Map<String, bp> a() {
        return this.networkSettings;
    }
}
