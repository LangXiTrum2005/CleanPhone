package j8;

import android.app.Application;
import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e8.c;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.n;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43726b;

    public /* synthetic */ a(int i10) {
        this.f43726b = i10;
    }

    @Override // i8.a
    public final c a(Application context, int i10) {
        switch (this.f43726b) {
            case 0:
                n.f(context, "context");
                return f(context, "android.permission.READ_EXTERNAL_STORAGE") ? c.Authorized : c.Denied;
            default:
                n.f(context, "context");
                boolean z10 = false;
                boolean z11 = (i10 & 2) == 2;
                boolean z12 = (i10 & 1) == 1;
                boolean z13 = (i10 & 4) == 4;
                boolean zD = z12 ? i8.a.d(context, "android.permission.READ_MEDIA_IMAGES") : true;
                if (z11) {
                    zD = zD && i8.a.d(context, "android.permission.READ_MEDIA_VIDEO");
                }
                if (!z13) {
                    z10 = zD;
                } else if (zD && i8.a.d(context, "android.permission.READ_MEDIA_AUDIO")) {
                    z10 = true;
                }
                return z10 ? c.Authorized : c.Denied;
        }
    }

    @Override // i8.a
    public final boolean c(Context context) {
        switch (this.f43726b) {
            case 0:
                n.f(context, "context");
                break;
            default:
                n.f(context, "context");
                break;
        }
        return i8.a.d(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // i8.a
    public final void h(i8.c permissionsUtils, Context context, int i10, boolean z10) {
        switch (this.f43726b) {
            case 0:
                n.f(permissionsUtils, "permissionsUtils");
                n.f(context, "context");
                ArrayList arrayListS = o.S("android.permission.READ_EXTERNAL_STORAGE");
                if (z10) {
                    arrayListS.add("android.permission.ACCESS_MEDIA_LOCATION");
                }
                String[] strArr = (String[]) arrayListS.toArray(new String[0]);
                if (!f(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                    i8.a.i(permissionsUtils, arrayListS, IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED);
                } else {
                    i8.b bVar = permissionsUtils.f42915g;
                    if (bVar != null) {
                        bVar.f(arrayListS);
                    }
                }
                break;
            default:
                n.f(permissionsUtils, "permissionsUtils");
                n.f(context, "context");
                ArrayList arrayList = new ArrayList();
                boolean z11 = (i10 & 1) == 1;
                boolean z12 = (i10 & 2) == 2;
                boolean z13 = (i10 & 4) == 4;
                if (z11) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (z12) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (z13) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                }
                if (z10) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                }
                String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                if (!f(context, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
                    i8.a.i(permissionsUtils, arrayList, IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED);
                } else {
                    i8.b bVar2 = permissionsUtils.f42915g;
                    if (bVar2 != null) {
                        bVar2.f(arrayList);
                    }
                }
                break;
        }
    }
}
