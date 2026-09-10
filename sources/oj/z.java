package oj;

import android.content.Context;
import android.util.Log;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loj/z;", "Lti/b;", "Loj/f;", "<init>", "()V", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class z implements ti.b, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f47554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v9.e f47555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.c f47556c = new ne.c(4);

    public static final Object b(z zVar, String str, String str2, ck.i iVar) {
        w0.d dVarX = go.k.X(str);
        Context context = zVar.f47554a;
        ak.f fVar = null;
        if (context != null) {
            Object objR = j1.f.r(a0.a(context), new jc.b(dVarX, str2, fVar, 1), iVar);
            return objR == bk.a.f5708a ? objR : wj.r.f53297a;
        }
        kotlin.jvm.internal.n.l("context");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r13 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r13 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        return r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bd -> B:35:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(oj.z r11, java.util.List r12, ck.c r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oj.z.e(oj.z, java.util.List, ck.c):java.lang.Object");
    }

    @Override // oj.f
    public final String a(String str, g gVar) {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        cn.d0.B(new l(str, this, c0Var, null, 3));
        return (String) c0Var.f44760a;
    }

    @Override // oj.f
    public final void c(String str, String str2, g gVar) {
        cn.d0.B(new u(this, str, str2, null, 2));
    }

    @Override // oj.f
    public final void d(String str, String str2, g gVar) {
        cn.d0.B(new u(this, str, str2, null, 1));
    }

    @Override // oj.f
    public final void f(String str, List list, g gVar) {
        cn.d0.B(new u(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f47556c.a(list)), null, 0));
    }

    @Override // oj.f
    public final Long i(String str, g gVar) {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        cn.d0.B(new l(str, this, c0Var, null, 2));
        return (Long) c0Var.f44760a;
    }

    @Override // oj.f
    public final Double k(String str, g gVar) {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        cn.d0.B(new l(str, this, c0Var, null, 1));
        return (Double) c0Var.f44760a;
    }

    @Override // oj.f
    public final void l(String str, double d10, g gVar) {
        cn.d0.B(new w(str, this, d10, null));
    }

    @Override // oj.f
    public final d0 m(String str, g gVar) {
        String strA = a(str, gVar);
        if (strA == null) {
            return null;
        }
        if (an.p.p0(strA, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return new d0(strA, b0.JSON_ENCODED);
        }
        return an.p.p0(strA, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new d0(null, b0.PLATFORM_ENCODED) : new d0(null, b0.UNEXPECTED_STRING);
    }

    @Override // oj.f
    public final Boolean n(String str, g gVar) {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        cn.d0.B(new l(str, this, c0Var, null, 0));
        return (Boolean) c0Var.f44760a;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        xi.f fVar = binding.f50789c;
        kotlin.jvm.internal.n.e(fVar, "getBinaryMessenger(...)");
        Context context = binding.f50787a;
        kotlin.jvm.internal.n.e(context, "getApplicationContext(...)");
        this.f47554a = context;
        try {
            f.f47483v9.getClass();
            e.b(fVar, this, "data_store");
            this.f47555b = new v9.e(fVar, context, this.f47556c);
        } catch (Exception e10) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e10);
        }
        new a().onAttachedToEngine(binding);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        xi.f fVar = binding.f50789c;
        kotlin.jvm.internal.n.e(fVar, "getBinaryMessenger(...)");
        f.f47483v9.getClass();
        e.b(fVar, null, "data_store");
        v9.e eVar = this.f47555b;
        if (eVar != null) {
            e.b((xi.f) eVar.f52504c, null, "shared_preferences");
        }
        this.f47555b = null;
    }

    @Override // oj.f
    public final void p(String str, boolean z10, g gVar) {
        cn.d0.B(new t(str, this, z10, null));
    }

    @Override // oj.f
    public final Map q(List list, g gVar) {
        return (Map) cn.d0.C(ak.l.f3620a, new h(this, list, null, 1));
    }

    @Override // oj.f
    public final ArrayList r(String str, g gVar) {
        List list;
        String strA = a(str, gVar);
        if (strA == null || an.p.p0(strA, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) || !an.p.p0(strA, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) || (list = (List) a0.c(strA, this.f47556c)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // oj.f
    public final void s(String str, long j10, g gVar) {
        cn.d0.B(new y(str, this, j10, null));
    }

    @Override // oj.f
    public final void t(List list, g gVar) {
        cn.d0.B(new h(this, list, null, 0));
    }

    @Override // oj.f
    public final List u(List list, g gVar) {
        return xj.n.N0(((Map) cn.d0.C(ak.l.f3620a, new h(this, list, null, 2))).keySet());
    }
}
