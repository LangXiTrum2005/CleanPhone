package com.google.crypto.tink.shaded.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f24597b = new u(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24598a;

    public k0(l lVar) {
        b0.a(lVar, "output");
        this.f24598a = lVar;
        lVar.f24601a = this;
    }

    public void a(int i10, Object obj, z0 z0Var) {
        l lVar = (l) this.f24598a;
        lVar.p0(i10, 3);
        z0Var.f((a) obj, lVar.f24601a);
        lVar.p0(i10, 4);
    }

    public void b(int i10, Object obj, z0 z0Var) {
        a aVar = (a) obj;
        l lVar = (l) this.f24598a;
        lVar.p0(i10, 2);
        lVar.r0(aVar.a(z0Var));
        z0Var.f(aVar, this);
    }

    public k0() {
        o0 o0Var;
        w0 w0Var = w0.f24646c;
        try {
            o0Var = (o0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            o0Var = f24597b;
        }
        o0[] o0VarArr = {u.f24640b, o0Var};
        j0 j0Var = new j0();
        j0Var.f24587a = o0VarArr;
        Charset charset = b0.f24539a;
        this.f24598a = j0Var;
    }
}
