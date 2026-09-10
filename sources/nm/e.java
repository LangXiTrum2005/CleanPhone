package nm;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f46808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(0);
        this.f46807e = i10;
        this.f46808f = fVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f46807e) {
            case 0:
                im.f fVar = im.f.f43167m;
                im.n.f43191a.getClass();
                return this.f46808f.i(fVar, im.k.f43184f);
            default:
                f fVar2 = this.f46808f;
                qm.f fVar3 = fVar2.f46809g;
                h classDescriptor = fVar2.f46812j;
                fVar3.getClass();
                kotlin.jvm.internal.n.f(classDescriptor, "classDescriptor");
                Collection collectionF = ((pm.h) classDescriptor.n()).f();
                kotlin.jvm.internal.n.e(collectionF, "classDescriptor.typeConstructor.supertypes");
                return collectionF;
        }
    }
}
