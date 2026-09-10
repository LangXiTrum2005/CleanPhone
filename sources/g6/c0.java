package g6;

import com.google.android.gms.internal.ads.dm0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements e6.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a7.l f41570j = new a7.l(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm0 f41571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6.f f41572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e6.f f41573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f41576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e6.i f41577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e6.m f41578i;

    public c0(dm0 dm0Var, e6.f fVar, e6.f fVar2, int i10, int i11, e6.m mVar, Class cls, e6.i iVar) {
        this.f41571b = dm0Var;
        this.f41572c = fVar;
        this.f41573d = fVar2;
        this.f41574e = i10;
        this.f41575f = i11;
        this.f41578i = mVar;
        this.f41576g = cls;
        this.f41577h = iVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        Object objF;
        dm0 dm0Var = this.f41571b;
        synchronized (dm0Var) {
            h6.e eVar = (h6.e) dm0Var.f13586d;
            h6.g gVarH0 = (h6.g) ((ArrayDeque) eVar.f3623a).poll();
            if (gVarH0 == null) {
                gVarH0 = eVar.H0();
            }
            h6.d dVar = (h6.d) gVarH0;
            dVar.f42222b = 8;
            dVar.f42223c = byte[].class;
            objF = dm0Var.f(dVar, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.f41574e).putInt(this.f41575f).array();
        this.f41573d.b(messageDigest);
        this.f41572c.b(messageDigest);
        messageDigest.update(bArr);
        e6.m mVar = this.f41578i;
        if (mVar != null) {
            mVar.b(messageDigest);
        }
        this.f41577h.b(messageDigest);
        a7.l lVar = f41570j;
        Class cls = this.f41576g;
        byte[] bytes = (byte[]) lVar.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(e6.f.f39142a);
            lVar.e(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f41571b.h(bArr);
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f41575f == c0Var.f41575f && this.f41574e == c0Var.f41574e && a7.p.b(this.f41578i, c0Var.f41578i) && this.f41576g.equals(c0Var.f41576g) && this.f41572c.equals(c0Var.f41572c) && this.f41573d.equals(c0Var.f41573d) && this.f41577h.equals(c0Var.f41577h)) {
                return true;
            }
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        int iHashCode = ((((this.f41573d.hashCode() + (this.f41572c.hashCode() * 31)) * 31) + this.f41574e) * 31) + this.f41575f;
        e6.m mVar = this.f41578i;
        if (mVar != null) {
            iHashCode = (iHashCode * 31) + mVar.hashCode();
        }
        int iHashCode2 = this.f41576g.hashCode();
        return this.f41577h.f39148b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f41572c + ", signature=" + this.f41573d + ", width=" + this.f41574e + ", height=" + this.f41575f + ", decodedResourceClass=" + this.f41576g + ", transformation='" + this.f41578i + "', options=" + this.f41577h + '}';
    }
}
