package rl;

import d5.u;
import tl.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements nm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gm.b f49629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gm.b f49630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final el.b f49631c;

    public f(el.b kotlinClass, c0 packageProto, xl.g nameResolver, int i10) {
        kotlin.jvm.internal.n.f(kotlinClass, "kotlinClass");
        kotlin.jvm.internal.n.f(packageProto, "packageProto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        u.n(i10, "abiStability");
        gm.b bVarB = gm.b.b(fl.c.a(kotlinClass.f40112a));
        eo.g gVar = kotlinClass.f40113b;
        gm.b bVarD = null;
        String str = ((sl.a) gVar.f40197c) != sl.a.MULTIFILE_CLASS_PART ? null : (String) gVar.f40202h;
        if (str != null && str.length() > 0) {
            bVarD = gm.b.d(str);
        }
        this.f49629a = bVarB;
        this.f49630b = bVarD;
        this.f49631c = kotlinClass;
        zl.m packageModuleName = wl.k.f53477m;
        kotlin.jvm.internal.n.e(packageModuleName, "packageModuleName");
        Integer num = (Integer) com.google.android.gms.internal.auth.i.u(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    public final yl.b a() {
        yl.c cVar;
        gm.b bVar = this.f49629a;
        String str = bVar.f41960a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = yl.c.f54504c;
            if (cVar == null) {
                gm.b.a(7);
                throw null;
            }
        } else {
            cVar = new yl.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strE = bVar.e();
        kotlin.jvm.internal.n.e(strE, "className.internalName");
        return new yl.b(cVar, yl.f.e(an.h.N0('/', strE, strE)));
    }

    @Override // nm.i
    public final String f() {
        return "Class '" + a().b().b() + '\'';
    }

    public final String toString() {
        return f.class.getSimpleName() + ": " + this.f49629a;
    }
}
