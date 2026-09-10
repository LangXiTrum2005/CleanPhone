package i;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import h.k;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42479a;

    public b(int i10) {
        this.f42479a = i10;
        if (i10 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // i.a
    public final n5.f b(Context context, Object obj) {
        k input = (k) obj;
        n.f(input, "input");
        return null;
    }

    @Override // i.a
    public final Object c(Intent intent, int i10) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null || !linkedHashSet.isEmpty()) {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        Uri uri = clipData.getItemAt(i11).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }
        return v.f53866a;
    }

    @Override // i.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Intent a(Context context, k input) {
        n.f(context, "context");
        n.f(input, "input");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f42479a;
        if (i10 >= 33 || SdkExtensions.getExtensionVersion(30) >= 2) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(x7.a.C(input.f42073a));
            int iMin = Math.min(i11, input.f42074b);
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            input.f42075c.getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
            return intent;
        }
        if (x7.a.B(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(x7.a.C(input.f42073a));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoB = x7.a.B(context);
        if (resolveInfoB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoB.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(x7.a.C(input.f42073a));
        int iMin2 = Math.min(i11, input.f42074b);
        if (iMin2 <= 1) {
            throw new IllegalArgumentException("Max items must be greater than 1");
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        input.f42075c.getClass();
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
        return intent3;
    }
}
