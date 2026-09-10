package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.gson.JsonObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class pd {
    public final Context a;
    public final String b;
    public final ApplicationInfo c;
    public final AtomicReference d;

    public pd(Context context, String applicationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.a = context;
        this.b = applicationId;
        this.c = context.getApplicationInfo();
        this.d = new AtomicReference();
    }

    public final spartacist a() {
        String strEncodeToString;
        JsonObject jsonObject = new JsonObject();
        Drawable applicationIcon = null;
        try {
            jsonObject.addProperty("name", this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(this.c.packageName, 0)).toString());
            jsonObject.addProperty(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.c.packageName);
            jsonObject.addProperty("adMobAppId", this.b);
            CharSequence charSequence = (CharSequence) this.d.get();
            if (charSequence == null || StringsKt.empress(charSequence)) {
                AtomicReference atomicReference = this.d;
                try {
                    ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getApplicationInfo().packageName, 0);
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
                    applicationIcon = this.a.getPackageManager().getApplicationIcon(applicationInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (applicationIcon == null) {
                    strEncodeToString = "";
                } else {
                    applicationIcon.setBounds(0, 0, 256, 256);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                    applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                }
                atomicReference.set(strEncodeToString);
            }
            CharSequence charSequence2 = (CharSequence) this.d.get();
            if (charSequence2 != null && !StringsKt.empress(charSequence2)) {
                jsonObject.addProperty("icon", (String) this.d.get());
                jsonObject.addProperty("iconWidthPx", (Number) 256);
                jsonObject.addProperty("iconHeightPx", (Number) 256);
            }
            return new tn0(jsonObject);
        } catch (PackageManager.NameNotFoundException e) {
            return new on0(e, null, null, 6);
        }
    }
}
