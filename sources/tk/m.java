package tk;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk.h0 f51014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl.g0 f51015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wl.e f51016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vl.f f51017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l3.i f51018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f51019g;

    /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
    public m(zk.h0 h0Var, tl.g0 proto, wl.e eVar, vl.f nameResolver, l3.i typeTable) {
        String string;
        String strJ;
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        this.f51014b = h0Var;
        this.f51015c = proto;
        this.f51016d = eVar;
        this.f51017e = nameResolver;
        this.f51018f = typeTable;
        if ((eVar.f53422b & 4) == 4) {
            strJ = nameResolver.getString(eVar.f53425e.f53409c).concat(nameResolver.getString(eVar.f53425e.f53410d));
        } else {
            xl.d dVarB = xl.h.b(proto, nameResolver, typeTable, true);
            if (dVarB == null) {
                throw new cn.c0("No field signature for property: " + h0Var, 3);
            }
            String str = dVarB.f53898d;
            String str2 = dVarB.f53899e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(il.x.a(str));
            zk.j jVarE = h0Var.e();
            kotlin.jvm.internal.n.e(jVarE, "descriptor.containingDeclaration");
            if (kotlin.jvm.internal.n.a(h0Var.getVisibility(), zk.n.f54977d) && (jVarE instanceof nm.h)) {
                tl.j jVar = ((nm.h) jVarE).f46815e;
                zl.m classModuleName = wl.k.f53474i;
                kotlin.jvm.internal.n.e(classModuleName, "classModuleName");
                Integer num = (Integer) com.google.android.gms.internal.auth.i.u(jVar, classModuleName);
                string = "$".concat(yl.g.f54516a.b(num != null ? nameResolver.getString(num.intValue()) : X3.i.Z, "_"));
            } else if (kotlin.jvm.internal.n.a(h0Var.getVisibility(), zk.n.f54974a) && (jVarE instanceof zk.b0)) {
                nm.i iVar = ((nm.q) h0Var).E;
                if (iVar instanceof rl.f) {
                    rl.f fVar = (rl.f) iVar;
                    if (fVar.f49630b != null) {
                        StringBuilder sb3 = new StringBuilder("$");
                        String strE = fVar.f49629a.e();
                        kotlin.jvm.internal.n.e(strE, "className.internalName");
                        sb3.append(yl.f.e(an.h.N0('/', strE, strE)).b());
                        string = sb3.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            strJ = q4.a.j(sb2, string, "()", str2);
        }
        this.f51019g = strJ;
    }

    @Override // tk.q1
    public final String c() {
        return this.f51019g;
    }
}
