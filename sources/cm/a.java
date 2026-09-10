package cm;

import java.util.List;
import kotlin.jvm.internal.n;
import pm.a1;
import pm.c0;
import pm.j0;
import pm.n0;
import pm.q0;
import pm.y;
import qm.f;
import rm.i;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c0 implements sm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f6662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f6663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0 f6665e;

    public a(q0 typeProjection, c cVar, boolean z10, j0 attributes) {
        n.f(typeProjection, "typeProjection");
        n.f(attributes, "attributes");
        this.f6662b = typeProjection;
        this.f6663c = cVar;
        this.f6664d = z10;
        this.f6665e = attributes;
    }

    @Override // pm.y
    public final im.n A() {
        return i.a(1, true, new String[0]);
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        n.f(newAttributes, "newAttributes");
        return new a(this.f6662b, this.f6663c, this.f6664d, newAttributes);
    }

    @Override // pm.y
    public final j0 M() {
        return this.f6665e;
    }

    @Override // pm.y
    public final n0 P() {
        return this.f6663c;
    }

    @Override // pm.y
    public final boolean Q() {
        return this.f6664d;
    }

    @Override // pm.y
    /* JADX INFO: renamed from: U */
    public final y j0(f kotlinTypeRefiner) {
        n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this.f6662b.d(kotlinTypeRefiner), this.f6663c, this.f6664d, this.f6665e);
    }

    @Override // pm.c0, pm.a1
    public final a1 i0(boolean z10) {
        if (z10 == this.f6664d) {
            return this;
        }
        return new a(this.f6662b, this.f6663c, z10, this.f6665e);
    }

    @Override // pm.a1
    public final a1 j0(f kotlinTypeRefiner) {
        n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this.f6662b.d(kotlinTypeRefiner), this.f6663c, this.f6664d, this.f6665e);
    }

    @Override // pm.y
    public final List t() {
        return v.f53866a;
    }

    @Override // pm.c0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f6662b);
        sb2.append(')');
        sb2.append(this.f6664d ? "?" : "");
        return sb2.toString();
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        if (z10 == this.f6664d) {
            return this;
        }
        return new a(this.f6662b, this.f6663c, z10, this.f6665e);
    }
}
