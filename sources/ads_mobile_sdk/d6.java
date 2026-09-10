package ads_mobile_sdk;

import android.os.Bundle;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import complexometry.AdSourceResponseInfo;
import complexometry.MediationAdError;
import complexometry.ResponseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d6 {
    public String a;
    public ur b;
    public JsonObject c;
    public AdSourceResponseInfo d;
    public List e = Collections.synchronizedList(new ArrayList());
    public final Map f = Collections.synchronizedMap(new LinkedHashMap());

    public final void a(h1 h1Var, int i) {
        String str = h1Var.d;
        if (str.length() == 0) {
            return;
        }
        Map adapterKeyToAdapterResponseInfo = this.f;
        Intrinsics.checkNotNullExpressionValue(adapterKeyToAdapterResponseInfo, "adapterKeyToAdapterResponseInfo");
        if (adapterKeyToAdapterResponseInfo.containsKey(str)) {
            return;
        }
        AdSourceResponseInfo impromptuVar = new AdSourceResponseInfo(h1Var.f, 0L, null, cb1.b(h1Var.c), h1Var.h, h1Var.i, h1Var.j, h1Var.k);
        this.e.add(i, impromptuVar);
        Map adapterKeyToAdapterResponseInfo2 = this.f;
        Intrinsics.checkNotNullExpressionValue(adapterKeyToAdapterResponseInfo2, "adapterKeyToAdapterResponseInfo");
        adapterKeyToAdapterResponseInfo2.put(str, impromptuVar);
    }

    public final Bundle b() {
        ur urVar = this.b;
        if (urVar == null) {
            Intrinsics.preprohormone("commonConfiguration");
            urVar = null;
        }
        JsonObject jsonObject = urVar.q;
        JsonObject jsonObject2 = this.c;
        if (jsonObject2 == null) {
            jsonObject2 = new JsonObject();
        }
        JsonObject jsonObjectDeepCopy = jsonObject.deepCopy();
        for (Map.Entry<String, JsonElement> entry : jsonObject2.entrySet()) {
            Intrinsics.beachfront(entry);
            jsonObjectDeepCopy.add(entry.getKey(), entry.getValue());
        }
        Intrinsics.beachfront(jsonObjectDeepCopy);
        Bundle bundleB = cb1.b(jsonObjectDeepCopy);
        if (bundleB.containsKey("ad_value") && (bundleB.get("ad_value") instanceof Integer)) {
            bundleB.putDouble("ad_value", bundleB.getInt("ad_value"));
        }
        return bundleB;
    }

    public final ResponseInfo a() {
        if (this.b == null) {
            return null;
        }
        AdSourceResponseInfo impromptuVar = this.d;
        String strSaneness = impromptuVar != null ? impromptuVar.getAdapterClassName() : null;
        String str = this.a;
        Bundle bundleB = b();
        AdSourceResponseInfo impromptuVar2 = this.d;
        List adapterResponses = this.e;
        Intrinsics.checkNotNullExpressionValue(adapterResponses, "adapterResponses");
        return new ResponseInfo(strSaneness, str, bundleB, impromptuVar2, adapterResponses);
    }

    public final void a(h1 h1Var, long j, MediationAdError arytenoidectomyVar) {
        String str = h1Var.d;
        AdSourceResponseInfo impromptuVar = (AdSourceResponseInfo) this.f.get(str);
        if (impromptuVar == null) {
            return;
        }
        AdSourceResponseInfo impromptuVar2 = new AdSourceResponseInfo(impromptuVar.getAdapterClassName(), p002kotlin.time.saneness.adultoid(j), arytenoidectomyVar, impromptuVar.getCredentials(), impromptuVar.getName(), impromptuVar.getId(), impromptuVar.getInstanceName(), impromptuVar.getInstanceId());
        Map adapterKeyToAdapterResponseInfo = this.f;
        Intrinsics.checkNotNullExpressionValue(adapterKeyToAdapterResponseInfo, "adapterKeyToAdapterResponseInfo");
        adapterKeyToAdapterResponseInfo.put(str, impromptuVar2);
        this.e.set(this.e.indexOf(impromptuVar), impromptuVar2);
    }
}
