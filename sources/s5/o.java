package s5;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.ContactsContract;
import cn.d0;
import cn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import xi.p;
import xi.r;
import xi.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls5/o;", "Lti/b;", "Lxi/n;", "Lxi/h;", "Lui/a;", "Lxi/r;", "Lxi/t;", "<init>", "()V", "flutter_contacts_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class o implements ti.b, xi.n, xi.h, ui.a, r, t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Activity f50179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Context f50180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ContentResolver f50181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static wi.j f50182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static wi.j f50183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static wi.j f50184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static wi.j f50185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static wi.j f50186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static wi.j f50187k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn.d f50188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.internal.auth.k f50189b;

    public o() {
        jn.e eVar = n0.f6748a;
        this.f50188a = d0.b(jn.d.f44017b);
    }

    @Override // xi.h
    public final void g(xi.g gVar) {
        com.google.android.gms.internal.auth.k kVar = new com.google.android.gms.internal.auth.k(new Handler(), gVar);
        this.f50189b = kVar;
        ContentResolver contentResolver = f50181e;
        if (contentResolver != null) {
            contentResolver.registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, kVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    @Override // xi.r
    public final boolean onActivityResult(int i10, int i11, Intent intent) throws IOException {
        wi.j jVar;
        String str;
        Uri data;
        Uri data2;
        if (i10 == h.f50157c) {
            wi.j jVar2 = f50183g;
            if (jVar2 == null) {
                return true;
            }
            jVar2.a(null);
            f50183g = null;
            return true;
        }
        if (i10 == h.f50158d) {
            if (f50184h == null) {
                return true;
            }
            String lastPathSegment = (intent == null || (data2 = intent.getData()) == null) ? null : data2.getLastPathSegment();
            wi.j jVar3 = f50184h;
            kotlin.jvm.internal.n.c(jVar3);
            jVar3.a(lastPathSegment);
            f50184h = null;
            return true;
        }
        if (i10 == h.f50159e) {
            if (f50185i == null) {
                return true;
            }
            String lastPathSegment2 = (intent == null || (data = intent.getData()) == null) ? null : data.getLastPathSegment();
            wi.j jVar4 = f50185i;
            kotlin.jvm.internal.n.c(jVar4);
            jVar4.a(lastPathSegment2);
            f50185i = null;
            return true;
        }
        if (i10 != h.f50160f) {
            if (i10 != h.f50161g || (jVar = f50187k) == null) {
                return true;
            }
            jVar.a(null);
            f50187k = null;
            return true;
        }
        if (f50186j == null) {
            return true;
        }
        if (intent != null) {
            Uri data3 = intent.getData();
            if ((data3 != null ? data3.getPath() : null) == null) {
                str = null;
            } else {
                Context context = f50180d;
                kotlin.jvm.internal.n.c(context);
                if (b0.b.a(context, "android.permission.READ_CONTACTS") != 0) {
                    str = null;
                } else {
                    Uri data4 = intent.getData();
                    List<String> pathSegments = data4 != null ? data4.getPathSegments() : null;
                    if (pathSegments == null || pathSegments.size() < 2) {
                        str = null;
                    } else {
                        String str2 = pathSegments.get(pathSegments.size() - 2);
                        if (kotlin.jvm.internal.n.a(str2, "raw_contacts")) {
                            String str3 = (String) xj.n.w0(pathSegments);
                            ContentResolver contentResolver = f50181e;
                            kotlin.jvm.internal.n.c(contentResolver);
                            List listK = x7.a.K(contentResolver, j1.f.C(str3), false, false, false, false, false, true, true, true);
                            if (listK.isEmpty()) {
                                str = null;
                            } else {
                                str = (String) ((Map) listK.get(0)).get("id");
                            }
                        } else {
                            ContentResolver contentResolver2 = f50181e;
                            kotlin.jvm.internal.n.c(contentResolver2);
                            kotlin.jvm.internal.n.c(str2);
                            Cursor cursorQuery = contentResolver2.query(ContactsContract.Data.CONTENT_URI, (String[]) j1.f.C("contact_id").toArray(new String[0]), "lookup = ?", new String[]{str2}, null);
                            if (cursorQuery != null && cursorQuery.moveToNext()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("contact_id"));
                                if (string == null) {
                                    string = "";
                                }
                                cursorQuery.close();
                                str = string;
                            } else {
                                str = null;
                            }
                        }
                    }
                }
            }
        } else {
            str = null;
        }
        wi.j jVar5 = f50186j;
        kotlin.jvm.internal.n.c(jVar5);
        jVar5.a(str);
        f50186j = null;
        return true;
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        fc.f fVar = (fc.f) binding;
        f50179c = (Activity) fVar.f40780b;
        fVar.e(this);
        fVar.b(this);
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        n.j jVar = flutterPluginBinding.f50788b.f46739c;
        p pVar = new p(jVar, "github.com/QuisApp/flutter_contacts");
        qd.i iVar = new qd.i(jVar, "github.com/QuisApp/flutter_contacts/events");
        pVar.b(new o());
        iVar.A(new o());
        Context context = flutterPluginBinding.f50787a;
        f50180d = context;
        kotlin.jvm.internal.n.c(context);
        f50181e = context.getContentResolver();
    }

    @Override // xi.h
    public final void onCancel() {
        ContentResolver contentResolver;
        com.google.android.gms.internal.auth.k kVar = this.f50189b;
        if (kVar != null && (contentResolver = f50181e) != null) {
            contentResolver.unregisterContentObserver(kVar);
        }
        this.f50189b = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        f50179c = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        f50179c = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        d0.j(this.f50188a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xi.n
    public final void onMethodCall(xi.m call, xi.o oVar) {
        kotlin.jvm.internal.n.f(call, "call");
        String str = call.f53822a;
        if (str != null) {
            int iHashCode = str.hashCode();
            hn.d dVar = this.f50188a;
            switch (iHashCode) {
                case -1335458389:
                    if (str.equals("delete")) {
                        jn.e eVar = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new k(call, this, (wi.j) oVar, null, 4), 2);
                        return;
                    }
                    break;
                case -1215741485:
                    if (str.equals("openExternalPreview")) {
                        jn.e eVar2 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new j(call, (wi.j) oVar, null, 0), 2);
                        return;
                    }
                    break;
                case -1212745906:
                    if (str.equals("openExternalInsert")) {
                        jn.e eVar3 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new jc.b(call, (wi.j) oVar, null, 2), 2);
                        return;
                    }
                    break;
                case -1183792455:
                    if (str.equals("insert")) {
                        jn.e eVar4 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new k(call, this, (wi.j) oVar, null, 2), 2);
                        return;
                    }
                    break;
                case -1144040556:
                    if (str.equals("deleteGroup")) {
                        jn.e eVar5 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new k(call, this, (wi.j) oVar, null, 7), 2);
                        return;
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        d0.w(dVar, n0.f6748a, new k(call, this, (wi.j) oVar, null, 1), 2);
                        return;
                    }
                    break;
                case -838846263:
                    if (str.equals("update")) {
                        jn.e eVar6 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new k(call, this, (wi.j) oVar, null, 3), 2);
                        return;
                    }
                    break;
                case -595664074:
                    if (str.equals("updateGroup")) {
                        jn.e eVar7 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new k(call, this, (wi.j) oVar, null, 6), 2);
                        return;
                    }
                    break;
                case -125366458:
                    if (str.equals("insertGroup")) {
                        jn.e eVar8 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new k(call, this, (wi.j) oVar, null, 5), 2);
                        return;
                    }
                    break;
                case 458554570:
                    if (str.equals("getGroups")) {
                        jn.e eVar9 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new androidx.lifecycle.p(this, (wi.j) oVar, null, 13), 2);
                        return;
                    }
                    break;
                case 746581438:
                    if (str.equals("requestPermission")) {
                        jn.e eVar10 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new k(this, call, (wi.j) oVar, null), 2);
                        return;
                    }
                    break;
                case 1848886239:
                    if (str.equals("openExternalEdit")) {
                        jn.e eVar11 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new j(call, (wi.j) oVar, null, 2), 2);
                        return;
                    }
                    break;
                case 1849218550:
                    if (str.equals("openExternalPick")) {
                        jn.e eVar12 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new i((wi.j) oVar, null, 2), 2);
                        return;
                    }
                    break;
                case 1849397370:
                    if (str.equals("openExternalView")) {
                        jn.e eVar13 = n0.f6748a;
                        d0.w(dVar, jn.d.f44017b, new j(call, (wi.j) oVar, null, 1), 2);
                        return;
                    }
                    break;
            }
        }
        ((wi.j) oVar).c();
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        fc.f fVar = (fc.f) binding;
        f50179c = (Activity) fVar.f40780b;
        fVar.e(this);
        fVar.b(this);
    }

    @Override // xi.t
    public final boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.n.f(permissions, "permissions");
        kotlin.jvm.internal.n.f(grantResults, "grantResults");
        hn.d dVar = this.f50188a;
        boolean z10 = false;
        if (i10 == 0) {
            boolean z11 = grantResults.length == 2 && grantResults[0] == 0 && grantResults[1] == 0;
            if (f50182f != null) {
                jn.e eVar = n0.f6748a;
                d0.w(dVar, hn.o.f42451a, new n(z11, null, 0), 2);
                return true;
            }
        } else {
            if (i10 != 1) {
                return false;
            }
            if (grantResults.length == 1 && grantResults[0] == 0) {
                z10 = true;
            }
            if (f50182f != null) {
                jn.e eVar2 = n0.f6748a;
                d0.w(dVar, hn.o.f42451a, new n(z10, null, 1), 2);
            }
        }
        return true;
    }
}
