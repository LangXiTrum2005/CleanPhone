package b8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import d8.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import i8.c;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xi.p;
import xi.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lb8/b;", "Lti/b;", "Lui/a;", "<init>", "()V", "photo_manager_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class b implements ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f5505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5506b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ui.b f5507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f5508d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [b8.a, xi.t] */
    public final void a(ui.b bVar) {
        ui.b bVar2 = this.f5507c;
        if (bVar2 != null) {
            b(bVar2);
        }
        this.f5507c = bVar;
        f fVar = this.f5505a;
        if (fVar != null) {
            fVar.a((Activity) ((fc.f) bVar).f40780b);
        }
        final c permissionsUtils = this.f5506b;
        n.f(permissionsUtils, "permissionsUtils");
        ?? r0 = new t() { // from class: b8.a
            @Override // xi.t
            public final boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
                n.f(permissions, "permissions");
                n.f(grantResults, "grantResults");
                c cVar = permissionsUtils;
                ArrayList arrayList = cVar.f42912d;
                ArrayList arrayList2 = cVar.f42914f;
                ArrayList arrayList3 = cVar.f42913e;
                if (i10 == 3001 || i10 == 3002) {
                    int length = permissions.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        l8.a.d("Returned permissions: " + permissions[i11]);
                        int i12 = grantResults[i11];
                        if (i12 == -1) {
                            arrayList3.add(permissions[i11]);
                        } else if (i12 == 0) {
                            arrayList2.add(permissions[i11]);
                        }
                    }
                    l8.a.a("dealResult: ");
                    l8.a.a("  permissions: " + permissions);
                    l8.a.a("  grantResults: " + grantResults);
                    l8.a.a("  deniedPermissionsList: " + arrayList3);
                    l8.a.a("  grantedPermissionsList: " + arrayList2);
                    i8.a aVar = cVar.f42911c;
                    aVar.getClass();
                    if (aVar instanceof j8.b) {
                        i8.a aVar2 = cVar.f42911c;
                        Application application = cVar.f42910b;
                        n.c(application);
                        aVar2.b(cVar, application, permissions, grantResults, arrayList, arrayList3, arrayList2, i10);
                    } else if (arrayList3.isEmpty()) {
                        i8.b bVar3 = cVar.f42915g;
                        n.c(bVar3);
                        bVar3.f(arrayList);
                    } else {
                        i8.b bVar4 = cVar.f42915g;
                        n.c(bVar4);
                        bVar4.h(arrayList3, arrayList2, arrayList);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList3.clear();
                }
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                }
                return false;
            }
        };
        this.f5508d = r0;
        fc.f fVar2 = (fc.f) bVar;
        fVar2.e(r0);
        f fVar3 = this.f5505a;
        if (fVar3 != null) {
            fVar2.b(fVar3.f38778d);
            fVar2.b(fVar3.f38779e);
            fVar2.b(fVar3.f38780f);
        }
    }

    public final void b(ui.b bVar) {
        a aVar = this.f5508d;
        if (aVar != null) {
            ((HashSet) ((fc.f) bVar).f40782d).remove(aVar);
        }
        f fVar = this.f5505a;
        if (fVar != null) {
            fc.f fVar2 = (fc.f) bVar;
            fVar2.H(fVar.f38778d);
            fVar2.H(fVar.f38779e);
            fVar2.H(fVar.f38780f);
        }
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b binding) {
        n.f(binding, "binding");
        a(binding);
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        n.f(binding, "binding");
        Context context = binding.f50787a;
        n.e(context, "getApplicationContext(...)");
        xi.f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        f fVar2 = new f(context, fVar, this.f5506b);
        new p(fVar, "com.fluttercandies/photo_manager").b(fVar2);
        this.f5505a = fVar2;
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        ui.b bVar = this.f5507c;
        if (bVar != null) {
            b(bVar);
        }
        f fVar = this.f5505a;
        if (fVar != null) {
            fVar.a(null);
        }
        this.f5507c = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        f fVar = this.f5505a;
        if (fVar != null) {
            fVar.a(null);
        }
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        this.f5505a = null;
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b binding) {
        n.f(binding, "binding");
        a(binding);
    }
}
