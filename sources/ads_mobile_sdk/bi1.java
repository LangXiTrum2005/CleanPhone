package ads_mobile_sdk;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.webkit.URLUtil;
import com.google.common.base.triweekly;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.MatchResult;
import p002kotlin.text.Regex;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class bi1 {
    public static final Regex i = new Regex("[^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$");
    public final qc0 a;
    public final ag1 b;
    public final saran c;
    public final saran d;
    public final hobby e;
    public final x f;
    public final ri2 g;
    public final l13 h;

    public bi1(qc0 deviceProperties, ag1 mraidAfmaDispatcher, saran uiScope, saran backgroundScope, hobby httpClient, x activityTracker, ri2 rootTraceCreator, l13 traceMetaSet) {
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        this.a = deviceProperties;
        this.b = mraidAfmaDispatcher;
        this.c = uiScope;
        this.d = backgroundScope;
        this.e = httpClient;
        this.f = activityTracker;
        this.g = rootTraceCreator;
        this.h = traceMetaSet;
    }

    public final void a(String str, gq0 gq0Var, boolean z) {
        triweekly triweeklyVar = kn0.a;
        kn0.c("Store picture error: " + str, null);
        if (z) {
            y13.a(str, null, 6);
        }
        cutely.wireman(this.c, null, null, new xh1(this, gq0Var, str, null), 3, null);
    }

    public final Unit a(gq0 gq0Var, Map map) {
        return a(this, map, gq0Var);
    }

    public static /* synthetic */ Unit a(bi1 bi1Var, Map map, gq0 gq0Var) {
        String string;
        String string2;
        String string3;
        String string4;
        if (!bi1Var.a.c()) {
            bi1Var.a("This feature is not available on the device.", gq0Var, true);
            return Unit.f29295attabal;
        }
        Activity activityB = bi1Var.f.b();
        if (activityB == null) {
            bi1Var.a("Activity context is required to show store picture event alert.", gq0Var, true);
            return Unit.f29295attabal;
        }
        String str = (String) map.get("iurl");
        if (str != null && str.length() != 0) {
            if (!URLUtil.isValidUrl(str)) {
                bi1Var.a("Invalid image url: " + str + ".", gq0Var, true);
                return Unit.f29295attabal;
            }
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (lastPathSegment == null) {
                bi1Var.a("No image file name in " + str, gq0Var, true);
                return Unit.f29295attabal;
            }
            MatchResult matchResultMatchEntire = i.matchEntire(lastPathSegment);
            if (matchResultMatchEntire != null && matchResultMatchEntire.saneness().size() == 3) {
                String str2 = matchResultMatchEntire.saneness().get(2);
                Resources resources = activityB.getResources();
                if (resources == null || (string = resources.getString(danae.dern.mraid_allow_store_picture)) == null) {
                    string = "Allow Ad to store image in Picture gallery?";
                }
                String str3 = string;
                if (resources == null || (string2 = resources.getString(danae.dern.mraid_save_image)) == null) {
                    string2 = "Save image";
                }
                if (resources == null || (string3 = resources.getString(danae.dern.mraid_alert_accept)) == null) {
                    string3 = "Accept";
                }
                if (resources == null || (string4 = resources.getString(danae.dern.mraid_alert_decline)) == null) {
                    string4 = "Decline";
                }
                cutely.wireman(bi1Var.c, null, null, new yh1(activityB, string2, str3, string3, string4, bi1Var, str, lastPathSegment, str2, gq0Var, null), 3, null);
                return Unit.f29295attabal;
            }
            bi1Var.a("Invalid image file name: " + lastPathSegment, gq0Var, true);
            return Unit.f29295attabal;
        }
        bi1Var.a("Image url cannot be empty.", gq0Var, true);
        return Unit.f29295attabal;
    }

    public final void a(ByteArrayInputStream byteArrayInputStream, String str, String str2, Context context, gq0 gq0Var) throws IOException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/" + str2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            contentValues.put("is_pending", (Integer) 1);
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            a("Unable to store picture", gq0Var, true);
            return;
        }
        kaif.dern.saneness(byteArrayInputStream, kk2.a(context, uriInsert, jk2.d));
        if (i2 >= 30) {
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(uriInsert, contentValues, null, null);
        }
        triweekly triweeklyVar = kn0.a;
        kn0.a(new wh1(str, uriInsert));
    }
}
