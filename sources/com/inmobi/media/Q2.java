package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.commons.core.configs.Config;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Q2 extends T1 {
    public Q2() {
        super("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
    }

    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) {
        Intrinsics.f(contentValues, "contentValues");
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        String asString2 = contentValues.getAsString("account_id");
        Long asLong = contentValues.getAsLong("update_ts");
        G2 g2 = Config.Companion;
        String asString3 = contentValues.getAsString("config_type");
        Intrinsics.e(asString3, "getAsString(...)");
        JSONObject jSONObject = new JSONObject(asString);
        Intrinsics.c(asLong);
        long jLongValue = asLong.longValue();
        g2.getClass();
        return G2.a(asString3, jSONObject, asString2, jLongValue);
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) {
        Config config = (Config) obj;
        Intrinsics.f(config, "config");
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_id", config.getAccountId$media_release());
        contentValues.put("config_value", config.toJson().toString());
        contentValues.put("config_type", config.getType());
        contentValues.put("update_ts", Long.valueOf(config.getLastUpdateTimeStamp()));
        return contentValues;
    }

    public final boolean b(String type, String accountId) {
        boolean z2;
        Intrinsics.f(type, "type");
        Intrinsics.f(accountId, "accountId");
        try {
            z2 = !A3.b(this.f23193a, null, "account_id=? AND config_type=?", new String[]{accountId, type}, null, null, null, null).isEmpty();
        } catch (Exception unused) {
            z2 = false;
        }
        return !z2;
    }

    public final long a(String type, String str) {
        Intrinsics.f(type, "type");
        String[] strArr = {str, type};
        P2 transform = P2.f23061a;
        Intrinsics.f(transform, "transform");
        Object objInvoke = null;
        try {
            List<ContentValues> listB = A3.b(this.f23193a, null, "account_id=? AND config_type=?", strArr, null, null, null, null);
            if (!listB.isEmpty()) {
                objInvoke = transform.invoke(listB.get(0));
            }
        } catch (Exception unused) {
        }
        Long l2 = (Long) objInvoke;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }
}
