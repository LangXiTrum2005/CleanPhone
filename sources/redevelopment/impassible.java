package redevelopment;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: ShapeKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class impassible extends attabal<euhemerize.taiyuan, Path> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public Path f36117apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final Path f36118cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Path f36119formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public List<kinesic.molybdenite> f36120impassible;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final euhemerize.taiyuan f36121taiyuan;

    public impassible(List<com.airbnb.lottie.value.attabal<euhemerize.taiyuan>> list) {
        super(list);
        this.f36121taiyuan = new euhemerize.taiyuan();
        this.f36118cutely = new Path();
    }

    @Override // redevelopment.attabal
    public boolean arytenoidectomy() {
        List<kinesic.molybdenite> list = this.f36120impassible;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void molybdenite(List<kinesic.molybdenite> list) {
        this.f36120impassible = list;
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
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public Path taiyuan(com.airbnb.lottie.value.attabal<euhemerize.taiyuan> attabalVar, float f) {
        euhemerize.taiyuan taiyuanVar = attabalVar.f16256saneness;
        euhemerize.taiyuan taiyuanVar2 = attabalVar.f16250dern;
        this.f36121taiyuan.dern(taiyuanVar, taiyuanVar2 == null ? taiyuanVar : taiyuanVar2, f);
        euhemerize.taiyuan taiyuanVarDern = this.f36121taiyuan;
        List<kinesic.molybdenite> list = this.f36120impassible;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                taiyuanVarDern = this.f36120impassible.get(size).dern(taiyuanVarDern);
            }
        }
        utwa.apical.impromptu(taiyuanVarDern, this.f36118cutely);
        if (this.f36091marial == null) {
            return this.f36118cutely;
        }
        if (this.f36117apical == null) {
            this.f36117apical = new Path();
            this.f36119formularize = new Path();
        }
        utwa.apical.impromptu(taiyuanVar, this.f36117apical);
        if (taiyuanVar2 != null) {
            utwa.apical.impromptu(taiyuanVar2, this.f36119formularize);
        }
        com.airbnb.lottie.value.dern<A> dernVar = this.f36091marial;
        float f2 = attabalVar.f16248competently;
        float fFloatValue = attabalVar.f16253impromptu.floatValue();
        Path path = this.f36117apical;
        return (Path) dernVar.saneness(f2, fFloatValue, path, taiyuanVar2 == null ? path : this.f36119formularize, f, marial(), beachfront());
    }
}
