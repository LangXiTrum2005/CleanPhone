package com.inmobi.media;

import android.content.ContentValues;
import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3025g0 extends T1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2976d0 f23619b;

    public C3025g0() {
        super("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)");
    }

    @Override // com.inmobi.media.T1
    public final Object a(ContentValues contentValues) {
        Intrinsics.f(contentValues, "contentValues");
        String asString = contentValues.getAsString("image_location");
        String asString2 = contentValues.getAsString("beacon_url");
        String asString3 = contentValues.getAsString("sdk_model_result");
        String asString4 = contentValues.getAsString("extras");
        if ((asString2 != null && asString2.length() != 0) || (asString != null && asString.length() != 0)) {
            Intrinsics.c(asString);
            Intrinsics.c(asString2);
            return new AdQualityResult(asString, asString3, asString2, asString4);
        }
        String asString5 = contentValues.getAsString("id");
        Intrinsics.e(asString5, "getAsString(...)");
        a("id=?", new String[]{asString5});
        return null;
    }

    @Override // com.inmobi.media.T1
    public final ContentValues b(Object obj) {
        AdQualityResult item = (AdQualityResult) obj;
        Intrinsics.f(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("image_location", item.getImageLocation());
        String sdkModelResult = item.getSdkModelResult();
        if (sdkModelResult == null) {
            sdkModelResult = "";
        }
        contentValues.put("sdk_model_result", sdkModelResult);
        contentValues.put("beacon_url", item.getBeaconUrl());
        contentValues.put("extras", item.getExtras());
        return contentValues;
    }

    public final void a(AdQualityResult result) {
        Intrinsics.f(result, "result");
        Log.i("AdQualityDao", "queueing");
        a((Object) result);
        C2976d0 c2976d0 = this.f23619b;
        if (c2976d0 != null) {
            Log.i("AdQualityDao", "sending callback - queued");
            Log.i("AdQualityBeaconExecutor", "item update callback received");
            if (c2976d0.f23505c.get()) {
                Log.i("AdQualityBeaconExecutor", "resume executor");
                c2976d0.f23505c.set(false);
                C2942b0 c2942b0 = new C2942b0(c2976d0);
                ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
                C3009f0.a(new C2958c(c2942b0));
            }
        }
    }
}
