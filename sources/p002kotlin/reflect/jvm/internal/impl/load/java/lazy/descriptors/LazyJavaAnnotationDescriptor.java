package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.marial;
import byname.saneness;
import genesic.impassible;
import genesic.kowloon;
import genesic.rotuma;
import henotic.attabal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kurbash.formularize;
import methylmercury.beachfront;
import p002kotlin.Pair;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.load.java.graveside;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.monoploid;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import prescient.competently;
import yeast.apical;
import yeast.impromptu;
import yeast.taiyuan;

/* JADX INFO: compiled from: LazyJavaAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaAnnotationDescriptor implements dern, beachfront {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f30490taiyuan = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f30491attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final impromptu f30492beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f30493competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final taiyuan f30494dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f30495impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final attabal f30496marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final genesic.attabal f30497saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final impromptu f30498wireman;

    public LazyJavaAnnotationDescriptor(wireman c, genesic.attabal javaAnnotation, boolean z) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.f30491attabal = c;
        this.f30497saneness = javaAnnotation;
        this.f30494dern = c.marial().marial(new Function0<byname.dern>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$fqName$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final byname.dern invoke() {
                saneness sanenessVarCompetently = this.this$0.f30497saneness.competently();
                if (sanenessVarCompetently != null) {
                    return sanenessVarCompetently.saneness();
                }
                return null;
            }
        });
        this.f30498wireman = c.marial().dern(new Function0<merc>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final merc invoke() {
                byname.dern dernVarMarial = this.this$0.marial();
                if (dernVarMarial == null) {
                    return competently.wireman(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, this.this$0.f30497saneness.toString());
                }
                p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarBeachfront = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.wireman.beachfront(p002kotlin.reflect.jvm.internal.impl.builtins.jvm.wireman.f29882attabal, dernVarMarial, this.this$0.f30491attabal.wireman().apical(), null, 4, null);
                if (wiremanVarBeachfront == null) {
                    genesic.competently competentlyVarGraveside = this.this$0.f30497saneness.graveside();
                    wiremanVarBeachfront = competentlyVarGraveside != null ? this.this$0.f30491attabal.attabal().triweekly().attabal(competentlyVarGraveside) : null;
                    if (wiremanVarBeachfront == null) {
                        wiremanVarBeachfront = this.this$0.taiyuan(dernVarMarial);
                    }
                }
                return wiremanVarBeachfront.impassible();
            }
        });
        this.f30496marial = c.attabal().graveside().attabal(javaAnnotation);
        this.f30492beachfront = c.marial().dern(new Function0<Map<marial, ? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Map<marial, ? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> invoke() {
                Collection<genesic.saneness> collectionWireman = this.this$0.f30497saneness.wireman();
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (genesic.saneness sanenessVar : collectionWireman) {
                    marial name = sanenessVar.getName();
                    if (name == null) {
                        name = graveside.f30422dern;
                    }
                    p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently competentlyVarImpassible = lazyJavaAnnotationDescriptor.impassible(sanenessVar);
                    Pair pairAttabal = competentlyVarImpassible != null ? patroclinal.formularize.attabal(name, competentlyVarImpassible) : null;
                    if (pairAttabal != null) {
                        arrayList.add(pairAttabal);
                    }
                }
                return seminary.dovishness(arrayList);
            }
        });
        this.f30493competently = javaAnnotation.impromptu();
        this.f30495impromptu = javaAnnotation.yemenite() || z;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public merc getType() {
        return (merc) apical.attabal(this.f30498wireman, this, f30490taiyuan[1]);
    }

    public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> arytenoidectomy(saneness sanenessVar, marial marialVar) {
        if (sanenessVar == null || marialVar == null) {
            return null;
        }
        return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.taiyuan(sanenessVar, marialVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public Map<marial, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> attabal() {
        return (Map) apical.attabal(this.f30492beachfront, this, f30490taiyuan[2]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public attabal competently() {
        return this.f30496marial;
    }

    public final boolean formularize() {
        return this.f30495impromptu;
    }

    public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> impassible(genesic.saneness sanenessVar) {
        if (sanenessVar instanceof kowloon) {
            return ConstantValueFactory.wireman(ConstantValueFactory.f31314attabal, ((kowloon) sanenessVar).getValue(), null, 2, null);
        }
        if (sanenessVar instanceof impassible) {
            impassible impassibleVar = (impassible) sanenessVar;
            return arytenoidectomy(impassibleVar.wireman(), impassibleVar.marial());
        }
        if (!(sanenessVar instanceof genesic.marial)) {
            if (sanenessVar instanceof genesic.dern) {
                return triweekly(((genesic.dern) sanenessVar).attabal());
            }
            if (sanenessVar instanceof genesic.impromptu) {
                return monoploid(((genesic.impromptu) sanenessVar).saneness());
            }
            return null;
        }
        genesic.marial marialVar = (genesic.marial) sanenessVar;
        marial name = marialVar.getName();
        if (name == null) {
            name = graveside.f30422dern;
        }
        Intrinsics.beachfront(name);
        return kowloon(name, marialVar.dern());
    }

    @Override // methylmercury.beachfront
    public boolean impromptu() {
        return this.f30493competently;
    }

    public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> kowloon(marial marialVar, List<? extends genesic.saneness> list) {
        oilcan oilcanVarFormularize;
        merc type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "<get-type>(...)");
        if (yemenite.attabal(type)) {
            return null;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarTaiyuan = DescriptorUtilsKt.taiyuan(this);
        Intrinsics.beachfront(wiremanVarTaiyuan);
        cultivated cultivatedVarSaneness = p002kotlin.reflect.jvm.internal.impl.load.java.components.attabal.saneness(marialVar, wiremanVarTaiyuan);
        if (cultivatedVarSaneness == null || (oilcanVarFormularize = cultivatedVarSaneness.getType()) == null) {
            oilcanVarFormularize = this.f30491attabal.attabal().impassible().apical().formularize(Variance.INVARIANT, competently.wireman(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        Intrinsics.beachfront(oilcanVarFormularize);
        List<? extends genesic.saneness> list2 = list;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVarImpassible = impassible((genesic.saneness) it.next());
            if (competentlyVarImpassible == null) {
                competentlyVarImpassible = new monoploid();
            }
            arrayList.add(competentlyVarImpassible);
        }
        return ConstantValueFactory.f31314attabal.saneness(arrayList, oilcanVarFormularize);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public byname.dern marial() {
        return (byname.dern) apical.saneness(this.f30494dern, this, f30490taiyuan[0]);
    }

    public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> monoploid(rotuma rotumaVar) {
        return p002kotlin.reflect.jvm.internal.impl.resolve.constants.kowloon.f31328attabal.attabal(this.f30491attabal.competently().kowloon(rotumaVar, p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman taiyuan(byname.dern dernVar) {
        trm trmVarWireman = this.f30491attabal.wireman();
        saneness sanenessVarImpassible = saneness.impassible(dernVar);
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
        return FindClassInModuleKt.dern(trmVarWireman, sanenessVarImpassible, this.f30491attabal.attabal().saneness().wireman().polloi());
    }

    public String toString() {
        return DescriptorRenderer.monoploid(DescriptorRenderer.f31198competently, this, null, 2, null);
    }

    public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> triweekly(genesic.attabal attabalVar) {
        return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.attabal(new LazyJavaAnnotationDescriptor(this.f30491attabal, attabalVar, false, 4, null));
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(wireman wiremanVar, genesic.attabal attabalVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, attabalVar, (i & 4) != 0 ? false : z);
    }
}
