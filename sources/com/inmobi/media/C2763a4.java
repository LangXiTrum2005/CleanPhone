package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2763a4 {
    public final C2923g9 a;

    public C2763a4(C2923g9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        Z3 z3;
        Config config;
        if (continuationImpl instanceof Z3) {
            z3 = (Z3) continuationImpl;
            int i = z3.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z3.c = i - Integer.MIN_VALUE;
            } else {
                z3 = new Z3(this, continuationImpl);
            }
        } else {
            z3 = new Z3(this, continuationImpl);
        }
        Object objA = z3.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = z3.c;
        if (i2 == 0) {
            dern.saneness(objA);
            C2923g9 c2923g9 = this.a;
            z3.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, "SELECT * FROM config_db", null), z3);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        ((List) objA).toString();
        ArrayList arrayList = new ArrayList();
        for (ContentValues contentValues : (Iterable) objA) {
            Intrinsics.checkNotNullParameter(contentValues, "<this>");
            String asString = contentValues.getAsString("config_value");
            Long asLong = contentValues.getAsLong("update_ts");
            try {
                JSONObject jsonObject = new JSONObject(asString);
                String configType = contentValues.getAsString("config_type");
                Intrinsics.checkNotNullExpressionValue(configType, "getAsString(...)");
                Intrinsics.beachfront(asLong);
                long jLongValue = asLong.longValue();
                Intrinsics.checkNotNullParameter(configType, "configType");
                Class type = AbstractC3241t4.a(configType);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(type, "type");
                config = (Config) type.cast(AbstractC3073ma.a(jsonObject, type, null, null));
                if (config != null) {
                    config.setLastUpdateTimeStamp(jLongValue);
                } else {
                    config = null;
                }
            } catch (Exception unused) {
            }
            String.valueOf(config);
            if (config != null) {
                arrayList.add(config);
            }
        }
        return arrayList;
    }
}
