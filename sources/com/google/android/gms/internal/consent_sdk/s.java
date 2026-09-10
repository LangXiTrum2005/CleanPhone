package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f23186b;

    public /* synthetic */ s(w wVar, int i10) {
        this.f23185a = i10;
        this.f23186b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23185a) {
            case 0:
                w wVar = this.f23186b;
                wVar.getClass();
                wVar.f23230d.execute(new s(wVar, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                w wVar2 = this.f23186b;
                Application application = wVar2.f23227a;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    String strConcat = null;
                    if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", strConcat);
                    JSONObject jSONObject2 = new JSONObject();
                    h hVar = wVar2.f23234h;
                    for (String str : hVar.a().keySet()) {
                        jSONObject2.put(str, hVar.a().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                    break;
                } catch (JSONException unused) {
                }
                wVar2.f23233g.f23083h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
