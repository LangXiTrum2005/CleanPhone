package saneness;

import ads_mobile_sdk.hn1;
import android.graphics.Color;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class solidaric {
    public static final Integer attabal(JsonObject jsonObject, String key) {
        JsonObject asJsonObject;
        int i = hn1.h;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            if (jsonObject == null) {
                asJsonObject = null;
            } else {
                try {
                    asJsonObject = jsonObject.getAsJsonObject(key);
                } catch (Exception unused) {
                    asJsonObject = null;
                }
            }
            if (asJsonObject == null) {
                return null;
            }
            Intrinsics.checkNotNullParameter(asJsonObject, "<this>");
            Intrinsics.checkNotNullParameter("r", X3.i.W);
            int asInt = asJsonObject.get("r").getAsInt();
            Intrinsics.checkNotNullParameter(asJsonObject, "<this>");
            Intrinsics.checkNotNullParameter("g", X3.i.W);
            int asInt2 = asJsonObject.get("g").getAsInt();
            Intrinsics.checkNotNullParameter(asJsonObject, "<this>");
            Intrinsics.checkNotNullParameter(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, X3.i.W);
            return Integer.valueOf(Color.rgb(asInt, asInt2, asJsonObject.get(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B).getAsInt()));
        } catch (Exception unused2) {
            return null;
        }
    }
}
