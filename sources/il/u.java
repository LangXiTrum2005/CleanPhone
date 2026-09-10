package il;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f43110c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f43111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43112b;

    static {
        yl.c cVar = r.f43101a;
        wj.c configuredKotlinVersion = wj.c.f53275e;
        kotlin.jvm.internal.n.f(configuredKotlinVersion, "configuredKotlinVersion");
        s sVar = r.f43104d;
        wj.c cVar2 = sVar.f43107b;
        c0 globalReportLevel = (cVar2 == null || cVar2.f53279d - configuredKotlinVersion.f53279d > 0) ? sVar.f43106a : sVar.f43108c;
        kotlin.jvm.internal.n.f(globalReportLevel, "globalReportLevel");
        w wVar = new w(globalReportLevel, globalReportLevel == c0.WARN ? null : globalReportLevel);
        t tVar = t.f43109b;
        f43110c = new u(wVar);
    }

    public u(w wVar) {
        t tVar = t.f43109b;
        this.f43111a = wVar;
        this.f43112b = wVar.f43117d || tVar.invoke(r.f43101a) == c0.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f43111a + ", getReportLevelForAnnotation=" + t.f43109b + ')';
    }
}
