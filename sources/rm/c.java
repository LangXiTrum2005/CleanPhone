package rm;

import hn.u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.n;
import xj.v;
import zk.e0;
import zk.l;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f49657a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yl.f f49658b = yl.f.g("<Error module>");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f49659c = v.f53866a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wk.e f49660d;

    static {
        wk.e eVar = wk.e.f53305f;
        f49660d = wk.e.f53305f;
    }

    @Override // zk.w
    public final e0 F(yl.c fqName) {
        n.f(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // zk.j
    public final Object c0(l lVar, Object obj) {
        return null;
    }

    @Override // zk.w
    public final wk.h d() {
        return f49660d;
    }

    @Override // zk.j
    public final zk.j e() {
        return null;
    }

    @Override // al.a
    public final al.j getAnnotations() {
        return al.i.f3645a;
    }

    @Override // zk.j
    public final yl.f getName() {
        return f49658b;
    }

    @Override // zk.w
    public final Collection h(yl.c fqName, jk.b bVar) {
        n.f(fqName, "fqName");
        return v.f53866a;
    }

    @Override // zk.w
    public final Object n0(u capability) {
        n.f(capability, "capability");
        return null;
    }

    @Override // zk.w
    public final List r0() {
        return f49659c;
    }

    @Override // zk.w
    public final boolean w0(w targetModule) {
        n.f(targetModule, "targetModule");
        return false;
    }

    @Override // zk.j, zk.g
    public final zk.j a() {
        return this;
    }
}
