package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.f;
import com.mbridge.msdk.config.component.common.express.operator.g;
import com.mbridge.msdk.config.component.common.express.operator.h;
import com.mbridge.msdk.config.component.common.express.operator.i;
import com.mbridge.msdk.config.component.common.express.operator.j;
import com.mbridge.msdk.config.component.common.express.operator.k;
import com.mbridge.msdk.config.component.common.express.operator.l;
import com.mbridge.msdk.config.component.common.express.operator.m;
import com.mbridge.msdk.config.component.common.express.operator.n;
import com.mbridge.msdk.config.component.common.express.operator.o;
import com.mbridge.msdk.config.component.common.express.operator.p;
import com.mbridge.msdk.config.component.common.express.operator.q;
import com.mbridge.msdk.config.component.common.express.operator.r;
import com.mbridge.msdk.config.component.common.express.operator.s;
import com.mbridge.msdk.config.component.common.express.operator.t;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.d f31858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.e f31859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f31860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f31861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f31862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t f31863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f31864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f31865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f31866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.b f31867k;
    private final j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l f31868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.c f31869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final s f31870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k f31871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final q f31872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o f31873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i f31874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h f31875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.a f31876u;

    public d() {
        com.mbridge.msdk.config.component.common.express.operator.parts.c cVar = new com.mbridge.msdk.config.component.common.express.operator.parts.c();
        this.f31857a = cVar;
        this.f31858b = new com.mbridge.msdk.config.component.common.express.operator.d(cVar);
        this.f31859c = new com.mbridge.msdk.config.component.common.express.operator.e(cVar);
        this.f31860d = new g(cVar);
        this.f31861e = new f(cVar);
        this.f31862f = new r(cVar);
        this.f31863g = new t(cVar);
        this.f31864h = new p(cVar);
        this.f31865i = new n(cVar);
        this.f31866j = new m(cVar);
        this.f31867k = new com.mbridge.msdk.config.component.common.express.operator.b(cVar);
        this.l = new j(cVar);
        this.f31868m = new l(cVar);
        this.f31869n = new com.mbridge.msdk.config.component.common.express.operator.c(cVar);
        this.f31870o = new s(cVar);
        this.f31871p = new k();
        this.f31872q = new q(cVar);
        this.f31873r = new o(cVar);
        this.f31874s = new i(cVar);
        this.f31875t = new h(cVar);
        this.f31876u = new com.mbridge.msdk.config.component.common.express.operator.a();
    }

    public Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
            return str.substring(1, str.length() - 1);
        }
        try {
            Object objA = new a().a(str).a(this, e.OTHER, aVar);
            return objA == null ? "" : objA;
        } catch (Exception e10) {
            q0.a("ExpressionOperator", "execute-e: " + e10.getMessage());
            return "";
        }
    }

    public Object a(Object obj, List<Object> list, String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        b bVar = new b();
        bVar.a(obj);
        bVar.a(list);
        bVar.a(str);
        return a(bVar, aVar);
    }

    private Object a(b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strB = bVar.b();
        Object objA = bVar.a();
        List<Object> listC = bVar.c();
        try {
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB = this.f31873r.b(strB, objA, listC, aVar);
            if (aVarB.b()) {
                return aVarB.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA = this.f31876u.a(strB, objA, listC, aVar);
            if (aVarA.b()) {
                return aVarA.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA2 = this.f31861e.a(strB, objA, listC);
            if (aVarA2.b()) {
                return aVarA2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA3 = this.f31860d.a(strB, objA, listC);
            if (aVarA3.b()) {
                return aVarA3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA4 = this.f31859c.a(strB, objA, listC);
            if (aVarA4.b()) {
                return aVarA4.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA5 = this.f31862f.a(strB, objA, listC);
            if (aVarA5.b()) {
                return aVarA5.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA6 = this.f31868m.a(strB, objA, listC);
            if (aVarA6.b()) {
                return aVarA6.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA7 = this.f31865i.a(strB, objA, listC);
            if (aVarA7.b()) {
                return aVarA7.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA8 = this.f31863g.a(strB, objA, listC);
            if (aVarA8.b()) {
                return aVarA8.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarI = this.f31864h.i(strB, objA, listC);
            if (aVarI.b()) {
                return aVarI.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB2 = this.f31866j.b(strB, objA, listC);
            if (aVarB2.b()) {
                return aVarB2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA9 = this.f31867k.a(strB, objA, listC);
            if (aVarA9.b()) {
                return aVarA9.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA10 = this.f31870o.a(strB, objA, listC);
            if (aVarA10.b()) {
                return aVarA10.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA11 = this.f31872q.a(strB, objA, listC);
            if (aVarA11.b()) {
                return aVarA11.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB3 = this.f31871p.b(strB, objA, listC);
            if (aVarB3.b()) {
                return aVarB3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA12 = this.f31858b.a(strB, objA, listC);
            if (aVarA12.b()) {
                return aVarA12.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA13 = this.f31874s.a(strB, objA, listC);
            if (aVarA13.b()) {
                return aVarA13.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA14 = this.f31875t.a(strB, objA, listC);
            if (aVarA14.b()) {
                return aVarA14.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA15 = this.l.a(strB, objA, listC);
            return aVarA15.b() ? aVarA15.a() : strB;
        } catch (Exception e10) {
            q0.b("ExpressionOperator", e10.getMessage(), e10);
            return null;
        }
    }
}
