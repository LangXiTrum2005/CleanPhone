package lm;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Set;
import zk.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om.l f45537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk.w f45538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f45539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f45540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f45541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f45542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f45543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f45544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hl.a f45545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f45546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Iterable f45547k;
    public final zc.u l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f45548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bl.b f45549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bl.d f45550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zl.g f45551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qm.k f45552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bl.a f45553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f45554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f45555t;

    public i(om.l lVar, zk.w moduleDescriptor, e eVar, a aVar, d0 d0Var, k kVar, l lVar2, Iterable iterable, zc.u uVar, bl.b bVar, bl.d dVar, zl.g extensionRegistryLite, qm.k kVar2, ea.b0 b0Var, List list, int i10) {
        qm.k kotlinTypeChecker;
        j jVar = j.f45556b;
        j jVar2 = j.f45558d;
        if ((i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            qm.k.f49190b.getClass();
            kotlinTypeChecker = qm.j.f49189b;
        } else {
            kotlinTypeChecker = kVar2;
        }
        bl.a aVar2 = bl.a.f5721e;
        List listC = (i10 & 524288) != 0 ? j1.f.C(pm.m.f48453a) : list;
        kotlin.jvm.internal.n.f(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.n.f(extensionRegistryLite, "extensionRegistryLite");
        kotlin.jvm.internal.n.f(kotlinTypeChecker, "kotlinTypeChecker");
        this.f45537a = lVar;
        this.f45538b = moduleDescriptor;
        this.f45539c = jVar;
        this.f45540d = eVar;
        this.f45541e = aVar;
        this.f45542f = d0Var;
        this.f45543g = jVar2;
        this.f45544h = kVar;
        this.f45545i = hl.a.f42404a;
        this.f45546j = lVar2;
        this.f45547k = iterable;
        this.l = uVar;
        this.f45548m = h.f45536a;
        this.f45549n = bVar;
        this.f45550o = dVar;
        this.f45551p = extensionRegistryLite;
        this.f45552q = kotlinTypeChecker;
        this.f45553r = aVar2;
        this.f45554s = listC;
        this.f45555t = new g(this);
    }

    public final com.google.android.gms.internal.consent_sdk.d a(zk.b0 b0Var, vl.f nameResolver, l3.i iVar, vl.g gVar, vl.a metadataVersion, nm.i iVar2) {
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(metadataVersion, "metadataVersion");
        return new com.google.android.gms.internal.consent_sdk.d(this, nameResolver, b0Var, iVar, gVar, metadataVersion, iVar2, null, xj.v.f53866a);
    }

    public final zk.e b(yl.b classId) {
        kotlin.jvm.internal.n.f(classId, "classId");
        Set set = g.f45533c;
        return this.f45555t.a(classId, null);
    }
}
