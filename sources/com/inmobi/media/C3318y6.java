package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.ko;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3318y6 extends N9 {
    public final AdQualityResult y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f24120z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3318y6(AdQualityResult result, C3262ue uidMap, AdConfig.AdQualityConfig config) {
        super(ko.f25535b, result.getBeaconUrl(), uidMap, false, (InterfaceC3333z5) null, "application/json", 64);
        Intrinsics.f(result, "result");
        Intrinsics.f(uidMap, "uidMap");
        Intrinsics.f(config, "config");
        this.y = result;
        this.f24120z = config;
    }

    @Override // com.inmobi.media.N9
    public final void f() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Log.i("JsonBeaconRequest", "preparing beacon request");
        this.t = false;
        this.f23014u = false;
        this.x = false;
        this.v = false;
        super.f();
        Log.i("JsonBeaconRequest", "getScreenshot");
        if (this.y.getImageLocation().length() > 0) {
            Log.i("JsonBeaconRequest", "screen shot image found in DB");
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.y.getImageLocation());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmapDecodeFile != null) {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.e(byteArray, "toByteArray(...)");
                if (byteArray.length != 0 && (jSONObject2 = this.f23011l) != null) {
                    jSONObject2.put("screenshotImageByte", Base64.encodeToString(byteArray, 0));
                }
            } catch (FileNotFoundException e2) {
                Log.e("JsonBeaconRequest", "image file not found...", e2);
                Log.i("JsonBeaconRequest", "result produced no screenshot");
            }
        } else {
            Log.i("JsonBeaconRequest", "result produced no screenshot");
        }
        Log.i("JsonBeaconRequest", "getExtras");
        try {
            if (B2.a(this.y.getExtras())) {
                String extras = this.y.getExtras();
                if (extras != null && (jSONObject = this.f23011l) != null) {
                    jSONObject.put("templateInfo", new JSONObject(extras));
                }
            } else {
                Log.i("JsonBeaconRequest", "result has no extras");
            }
        } catch (JSONException e3) {
            Log.e("JsonBeaconRequest", "error while adding extras", e3);
        }
        Log.i("JsonBeaconRequest", "getExtras");
        if (!B2.a(this.y.getSdkModelResult())) {
            Log.i("JsonBeaconRequest", "result has no model info");
            return;
        }
        JSONObject jSONObject3 = this.f23011l;
        if (jSONObject3 != null) {
            jSONObject3.put("sdkModelInfo", this.y.getSdkModelResult());
        }
    }
}
