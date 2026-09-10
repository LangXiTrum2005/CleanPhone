package saneness;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class fooster {
    public static void attabal(Context context, View view, String str) {
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setClickable(false);
        view.setFocusable(false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.beachfront(bArrDecode);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            view.setBackground(bitmapDrawable);
        } catch (IllegalArgumentException unused) {
        }
    }
}
