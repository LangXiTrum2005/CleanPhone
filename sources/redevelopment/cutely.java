package redevelopment;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: PathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely extends competently<PointF> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final float[] f36100apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final float[] f36101cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final PathMeasure f36102formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public taiyuan f36103impassible;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final PointF f36104taiyuan;

    public cutely(List<? extends com.airbnb.lottie.value.attabal<PointF>> list) {
        super(list);
        this.f36104taiyuan = new PointF();
        this.f36101cutely = new float[2];
        this.f36100apical = new float[2];
        this.f36102formularize = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public PointF taiyuan(com.airbnb.lottie.value.attabal<PointF> attabalVar, float f) {
        float f2;
        taiyuan taiyuanVar = (taiyuan) attabalVar;
        Path pathApical = taiyuanVar.apical();
        com.airbnb.lottie.value.dern<A> dernVar = this.f36091marial;
        if (dernVar == 0 || attabalVar.f16253impromptu == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) dernVar.saneness(taiyuanVar.f16248competently, taiyuanVar.f16253impromptu.floatValue(), (PointF) taiyuanVar.f16256saneness, (PointF) taiyuanVar.f16250dern, marial(), f2, beachfront());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathApical == null) {
            return attabalVar.f16256saneness;
        }
        if (this.f36103impassible != taiyuanVar) {
            this.f36102formularize.setPath(pathApical, false);
            this.f36103impassible = taiyuanVar;
        }
        float length = this.f36102formularize.getLength();
        float f3 = f2 * length;
        this.f36102formularize.getPosTan(f3, this.f36101cutely, this.f36100apical);
        PointF pointF2 = this.f36104taiyuan;
        float[] fArr = this.f36101cutely;
        pointF2.set(fArr[0], fArr[1]);
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            PointF pointF3 = this.f36104taiyuan;
            float[] fArr2 = this.f36100apical;
            pointF3.offset(fArr2[0] * f3, fArr2[1] * f3);
        } else if (f3 > length) {
            PointF pointF4 = this.f36104taiyuan;
            float[] fArr3 = this.f36100apical;
            float f4 = f3 - length;
            pointF4.offset(fArr3[0] * f4, fArr3[1] * f4);
        }
        return this.f36104taiyuan;
    }
}
