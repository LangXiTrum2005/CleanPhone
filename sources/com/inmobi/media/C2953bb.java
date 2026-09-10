package com.inmobi.media;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2953bb extends Lambda implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2953bb() {
        super(1);
        String str = C2987db.f23526a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws JSONException {
        C6 c6A;
        C3004eb c3004eb = (C3004eb) obj;
        C2987db.d = 2;
        if (c3004eb == null) {
            C3259ub c3259ub = C2987db.f23527b;
            if (c3259ub != null) {
                c3259ub.f24027a = null;
                BillingClient billingClient = c3259ub.f24028b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            C2987db.f23527b = null;
        } else {
            c3004eb.toString();
            JSONObject jSONObject = new JSONObject();
            int i2 = c3004eb.f23566a;
            if (i2 > 0) {
                jSONObject.put("p", i2);
            }
            int i3 = c3004eb.f23567b;
            if (i3 > 0) {
                jSONObject.put("s", i3);
            }
            String string = jSONObject.length() == 0 ? null : jSONObject.toString();
            if (string != null) {
                C2987db.f23526a = string;
                Context contextD = Uc.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = C6.f22734b;
                    c6A = B6.a(contextD, "purchase_store");
                } else {
                    c6A = null;
                }
                if (c6A != null) {
                    C6.a(c6A, "purchase_pref", string, false, 4, (Object) null);
                }
            }
            C3259ub c3259ub2 = C2987db.f23527b;
            if (c3259ub2 != null) {
                c3259ub2.f24027a = null;
                BillingClient billingClient2 = c3259ub2.f24028b;
                if (billingClient2 != null) {
                    billingClient2.endConnection();
                }
            }
            C2987db.f23527b = null;
        }
        return Unit.f43263a;
    }
}
