package sl;

import il.y;
import java.util.HashMap;
import na.g;
import oa.k0;
import rl.k;
import rl.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f50270i = com.ironsource.mediationsdk.metadata.a.f29610g.equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f50271j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f50272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f50273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f50275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f50276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f50277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f50278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f50279h;

    static {
        HashMap map = new HashMap();
        f50271j = map;
        map.put(yl.b.j(new yl.c("kotlin.jvm.internal.KotlinClass")), a.CLASS);
        map.put(yl.b.j(new yl.c("kotlin.jvm.internal.KotlinFileFacade")), a.FILE_FACADE);
        map.put(yl.b.j(new yl.c("kotlin.jvm.internal.KotlinMultifileClass")), a.MULTIFILE_CLASS);
        map.put(yl.b.j(new yl.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.MULTIFILE_CLASS_PART);
        map.put(yl.b.j(new yl.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.SYNTHETIC_CLASS);
    }

    @Override // rl.m
    public final k l(yl.b bVar, el.a aVar) {
        a aVar2;
        yl.c cVarB = bVar.b();
        if (cVarB.equals(y.f43120a)) {
            return new rb.c(this, 5);
        }
        if (cVarB.equals(y.f43133o)) {
            return new k0(this, 11);
        }
        if (f50270i || this.f50278g != null || (aVar2 = (a) f50271j.get(bVar)) == null) {
            return null;
        }
        this.f50278g = aVar2;
        return new g(this, 13);
    }
}
