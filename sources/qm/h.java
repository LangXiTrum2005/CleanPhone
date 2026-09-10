package qm;

import cl.t0;
import java.util.List;
import pm.a1;
import pm.c0;
import pm.j0;
import pm.n0;
import pm.q0;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends c0 implements sm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f49178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1 f49179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0 f49180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49182g;

    public h(int i10, i constructor, a1 a1Var, j0 attributes, boolean z10, boolean z11) {
        d5.u.n(i10, "captureStatus");
        kotlin.jvm.internal.n.f(constructor, "constructor");
        kotlin.jvm.internal.n.f(attributes, "attributes");
        this.f49177b = i10;
        this.f49178c = constructor;
        this.f49179d = a1Var;
        this.f49180e = attributes;
        this.f49181f = z10;
        this.f49182g = z11;
    }

    @Override // pm.y
    public final im.n A() {
        return rm.i.a(1, true, new String[0]);
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return new h(this.f49177b, this.f49178c, this.f49179d, newAttributes, this.f49181f, this.f49182g);
    }

    @Override // pm.a1
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final h j0(f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        i iVar = this.f49178c;
        iVar.getClass();
        q0 q0VarD = iVar.f49183a.d(kotlinTypeRefiner);
        t0 t0Var = iVar.f49184b != null ? new t0(9, iVar, kotlinTypeRefiner) : null;
        i iVar2 = iVar.f49185c;
        if (iVar2 == null) {
            iVar2 = iVar;
        }
        i iVar3 = new i(q0VarD, t0Var, iVar2, iVar.f49186d);
        a1 a1Var = this.f49179d;
        return new h(this.f49177b, iVar3, a1Var != null ? a1Var : null, this.f49180e, this.f49181f, 32);
    }

    @Override // pm.y
    public final j0 M() {
        return this.f49180e;
    }

    @Override // pm.y
    public final n0 P() {
        return this.f49178c;
    }

    @Override // pm.y
    public final boolean Q() {
        return this.f49181f;
    }

    @Override // pm.c0, pm.a1
    public final a1 i0(boolean z10) {
        return new h(this.f49177b, this.f49178c, this.f49179d, this.f49180e, z10, 32);
    }

    @Override // pm.y
    public final List t() {
        return v.f53866a;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        return new h(this.f49177b, this.f49178c, this.f49179d, this.f49180e, z10, 32);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(int i10, i iVar, a1 a1Var, j0 j0Var, boolean z10, int i11) {
        if ((i11 & 8) != 0) {
            j0.f48443b.getClass();
            j0Var = j0.f48444c;
        }
        this(i10, iVar, a1Var, j0Var, (i11 & 16) != 0 ? false : z10, false);
    }
}
