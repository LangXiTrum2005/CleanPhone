package j8;

import android.app.Application;
import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e8.c;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i8.a {
    public static final void j(c0 c0Var, c cVar) {
        Object obj = c0Var.f44760a;
        if (obj == c.NotDetermined) {
            c0Var.f44760a = cVar;
            return;
        }
        int iOrdinal = ((c) obj).ordinal();
        c cVar2 = c.Limited;
        if (iOrdinal == 1) {
            if (cVar == cVar2 || cVar == c.Authorized) {
                c0Var.f44760a = cVar2;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            c0Var.f44760a = cVar2;
        } else if (cVar == cVar2 || cVar == c.Denied) {
            c0Var.f44760a = cVar2;
        }
    }

    @Override // i8.a
    public final c a(Application context, int i10) {
        c cVar;
        n.f(context, "context");
        c0 c0Var = new c0();
        c0Var.f44760a = c.NotDetermined;
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        int i11 = i10 & 4;
        c cVar2 = c.Denied;
        c cVar3 = c.Authorized;
        if (i11 == 4) {
            j(c0Var, f(context, "android.permission.READ_MEDIA_AUDIO") ? cVar3 : cVar2);
        }
        c cVar4 = c.Limited;
        if (z11) {
            if (f(context, "android.permission.READ_MEDIA_VIDEO")) {
                cVar = cVar3;
            } else {
                cVar = i8.a.e(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") ? cVar4 : cVar2;
            }
            j(c0Var, cVar);
        }
        if (z10) {
            if (f(context, "android.permission.READ_MEDIA_IMAGES")) {
                cVar2 = cVar3;
            } else if (i8.a.e(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                cVar2 = cVar4;
            }
            j(c0Var, cVar2);
        }
        return (c) c0Var.f44760a;
    }

    @Override // i8.a
    public final void b(i8.c permissionsUtils, Context context, String[] permissions, int[] grantResults, ArrayList needToRequestPermissionsList, ArrayList deniedPermissionsList, ArrayList grantedPermissionsList, int i10) {
        boolean z10;
        n.f(permissionsUtils, "permissionsUtils");
        n.f(context, "context");
        n.f(permissions, "permissions");
        n.f(grantResults, "grantResults");
        n.f(needToRequestPermissionsList, "needToRequestPermissionsList");
        n.f(deniedPermissionsList, "deniedPermissionsList");
        n.f(grantedPermissionsList, "grantedPermissionsList");
        if (i10 == 3002) {
            l8.b bVar = this.f42908a;
            if (bVar == null) {
                return;
            }
            this.f42908a = null;
            i8.b bVar2 = permissionsUtils.f42915g;
            if (bVar2 != null) {
                bVar2.g();
            }
            bVar.b(1);
            return;
        }
        boolean zContains = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_IMAGES");
        boolean zContains2 = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_VIDEO");
        boolean zContains3 = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_AUDIO");
        boolean zContains4 = needToRequestPermissionsList.contains("android.permission.ACCESS_MEDIA_LOCATION");
        boolean zContains5 = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        if (!zContains && !zContains2 && !zContains5) {
            z10 = true;
            break;
        }
        String[] strArr = {"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        int i11 = 0;
        while (true) {
            if (i11 >= 3) {
                z10 = false;
                break;
            } else {
                if (i8.a.e(context, strArr[i11])) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (zContains3) {
            z10 = z10 && i8.a.d(context, "android.permission.READ_MEDIA_AUDIO");
        }
        if (zContains4) {
            z10 = z10 && i8.a.e(context, "android.permission.ACCESS_MEDIA_LOCATION");
        }
        i8.b bVar3 = permissionsUtils.f42915g;
        if (bVar3 == null) {
            return;
        }
        if (z10) {
            bVar3.f(needToRequestPermissionsList);
        } else {
            bVar3.h(deniedPermissionsList, grantedPermissionsList, needToRequestPermissionsList);
        }
    }

    @Override // i8.a
    public final boolean c(Context context) {
        n.f(context, "context");
        return i8.a.d(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // i8.a
    public final void g(i8.c permissionsUtils, Application context, int i10, l8.b bVar) {
        n.f(permissionsUtils, "permissionsUtils");
        n.f(context, "context");
        this.f42908a = bVar;
        ArrayList arrayList = new ArrayList();
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        if (z10) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
        }
        if (z11) {
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        }
        if (z10 || z11) {
            arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        i8.a.i(permissionsUtils, arrayList, 3002);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    @Override // i8.a
    public final void h(i8.c permissionsUtils, Context context, int i10, boolean z10) {
        boolean z11;
        n.f(permissionsUtils, "permissionsUtils");
        n.f(context, "context");
        int i11 = i10 & 1;
        boolean z12 = i11 == 1;
        int i12 = i10 & 2;
        boolean z13 = i12 == 2;
        int i13 = i10 & 4;
        boolean z14 = i13 == 4;
        if (z12 || z13) {
            boolean zD = i8.a.d(context, "android.permission.READ_MEDIA_IMAGES");
            boolean zD2 = i8.a.d(context, "android.permission.READ_MEDIA_VIDEO");
            boolean zD3 = i8.a.d(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            if ((z12 || z13) && !zD3 && ((z12 && !zD) || (z13 && !zD2))) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z14) {
            z11 = z11 && i8.a.d(context, "android.permission.READ_MEDIA_AUDIO");
        }
        if (z11 && (!z10 || c(context))) {
            i8.b bVar = permissionsUtils.f42915g;
            if (bVar != null) {
                bVar.f(new ArrayList());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z15 = i11 == 1;
        boolean z16 = i12 == 2;
        boolean z17 = i13 == 4;
        if (z15) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
        }
        if (z16) {
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        }
        if (z15 || z16) {
            arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            if (z10) {
                arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
            }
        }
        if (z17) {
            arrayList.add("android.permission.READ_MEDIA_AUDIO");
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (!f(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            i8.a.i(permissionsUtils, arrayList, IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED);
            return;
        }
        i8.b bVar2 = permissionsUtils.f42915g;
        if (bVar2 != null) {
            bVar2.f(arrayList);
        }
    }
}
