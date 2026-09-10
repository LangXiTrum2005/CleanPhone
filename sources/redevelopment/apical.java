package redevelopment;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PointKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class apical extends competently<PointF> {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final PointF f36084taiyuan;

    public apical(List<com.airbnb.lottie.value.attabal<PointF>> list) {
        super(list);
        this.f36084taiyuan = new PointF();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
    public PointF cutely(com.airbnb.lottie.value.attabal<PointF> attabalVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = attabalVar.f16256saneness;
        if (pointF3 == null || (pointF = attabalVar.f16250dern) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        com.airbnb.lottie.value.dern<A> dernVar = this.f36091marial;
        if (dernVar != 0 && (pointF2 = (PointF) dernVar.saneness(attabalVar.f16248competently, attabalVar.f16253impromptu.floatValue(), pointF4, pointF5, f, marial(), beachfront())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f36084taiyuan;
        float f4 = pointF4.x;
        float f5 = f4 + (f2 * (pointF5.x - f4));
        float f6 = pointF4.y;
        pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
        return this.f36084taiyuan;
    }

    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public PointF taiyuan(com.airbnb.lottie.value.attabal<PointF> attabalVar, float f) {
        return cutely(attabalVar, f, f, f);
    }
}
