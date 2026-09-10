package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Be extends Ac {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Be(String url, C3262ue c3262ue, String str, int i2, int i3, int i4) {
        super(url, c3262ue, str, i2, i3);
        Intrinsics.f(url, "url");
        this.f23013p = i4;
    }

    @Override // com.inmobi.media.N9
    public final void f() {
        InMobiUserDataTypes emailId;
        InMobiUserDataTypes phoneNumber;
        HashMap map;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        String string;
        HashMap map5;
        super.f();
        String.valueOf(L4.f22944a);
        HashMap mapA = AbstractC2936ab.a();
        HashMap map6 = this.k;
        if (map6 != null) {
            map6.put("mk-version", Vc.a());
            String str = C2994e1.f23537a;
            if (str != null) {
            }
            map6.put("ua", Uc.k());
            map6.put("ts", String.valueOf(System.currentTimeMillis()));
        }
        String str2 = this.m;
        if (str2 != null && (map5 = this.k) != null) {
        }
        Boolean boolC = C3246te.f24014a.c();
        HashMap map7 = this.k;
        if (map7 != null) {
            if (boolC == null || (string = boolC.toString()) == null) {
                string = com.p004ironsource.mediationsdk.metadata.a.g;
            }
        }
        String str3 = (String) mapA.get("u-age");
        if (str3 != null && (map4 = this.k) != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = L4.f22944a;
        if (inMobiUserDataModel == null || (emailId = inMobiUserDataModel.getEmailId()) == null || (emailId.getMd5() == null && emailId.getSha1() == null && emailId.getSha256() == null)) {
            emailId = null;
        }
        if (emailId != null && (map3 = this.k) != null) {
        }
        InMobiUserDataModel inMobiUserDataModel2 = L4.f22944a;
        if (inMobiUserDataModel2 == null || (phoneNumber = inMobiUserDataModel2.getPhoneNumber()) == null || (phoneNumber.getMd5() == null && phoneNumber.getSha1() == null && phoneNumber.getSha256() == null)) {
            phoneNumber = null;
        }
        if (phoneNumber != null && (map2 = this.k) != null) {
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectB = Q5.b();
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string2 = jSONArray2.getJSONObject(i2).has("src") ? jSONArray2.getJSONObject(i2).getString("src") : null;
                        String string3 = jSONArray2.getJSONObject(i2).has(InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i2).getString(InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z2 = System.currentTimeMillis() > jSONArray2.getJSONObject(i2).getLong("expiry");
                        if (string2 != null && string3 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string2);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string3);
                            jSONObject.put("expired", z2);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException unused) {
                Objects.toString(jSONObjectB);
            }
        }
        HashMap map8 = this.k;
        if (map8 != null) {
            String string4 = jSONArray.toString();
            Intrinsics.e(string4, "toString(...)");
        }
        InMobiUserDataModel inMobiUserDataModel3 = L4.f22944a;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras == null || (map = this.k) == null) {
            return;
        }
        map.putAll(extras);
    }
}
