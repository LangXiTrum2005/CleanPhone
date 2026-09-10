package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Queue;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3790jZ implements InterfaceC4650tG {
    public static final C4654tK j = new C4654tK(50);
    public final C4391qK b;
    public final InterfaceC4650tG c;
    public final InterfaceC4650tG d;
    public final int e;
    public final int f;
    public final Class g;
    public final YS h;
    public final Gd0 i;

    public C3790jZ(C4391qK c4391qK, InterfaceC4650tG interfaceC4650tG, InterfaceC4650tG interfaceC4650tG2, int i, int i2, Gd0 gd0, Class cls, YS ys) {
        this.b = c4391qK;
        this.c = interfaceC4650tG;
        this.d = interfaceC4650tG2;
        this.e = i;
        this.f = i2;
        this.i = gd0;
        this.g = cls;
        this.h = ys;
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
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        Object objF;
        C4391qK c4391qK = this.b;
        synchronized (c4391qK) {
            F4 f4 = c4391qK.b;
            InterfaceC4226oV interfaceC4226oVI = (InterfaceC4226oV) ((Queue) f4.b).poll();
            if (interfaceC4226oVI == null) {
                interfaceC4226oVI = f4.i();
            }
            C4303pK c4303pK = (C4303pK) interfaceC4226oVI;
            c4303pK.b = 8;
            c4303pK.c = byte[].class;
            objF = c4391qK.f(c4303pK, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        Gd0 gd0 = this.i;
        if (gd0 != null) {
            gd0.b(messageDigest);
        }
        this.h.b(messageDigest);
        C4654tK c4654tK = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) c4654tK.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC4650tG.f5028a);
            c4654tK.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.h(bArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3790jZ)) {
            return false;
        }
        C3790jZ c3790jZ = (C3790jZ) obj;
        return this.f == c3790jZ.f && this.e == c3790jZ.e && Tg0.b(this.i, c3790jZ.i) && this.g.equals(c3790jZ.g) && this.c.equals(c3790jZ.c) && this.d.equals(c3790jZ.d) && this.h.equals(c3790jZ.h);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        Gd0 gd0 = this.i;
        if (gd0 != null) {
            iHashCode = (iHashCode * 31) + gd0.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
