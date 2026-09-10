package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import byname.marial;
import genesic.impassible;
import genesic.saneness;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.collections.cord;
import p002kotlin.collections.creditor;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import patroclinal.formularize;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaAnnotationTargetMapper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JavaAnnotationTargetMapper f30368attabal = new JavaAnnotationTargetMapper();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map<String, EnumSet<KotlinTarget>> f30370saneness = seminary.impassible(formularize.attabal("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), formularize.attabal("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), formularize.attabal("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), formularize.attabal("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), formularize.attabal("FIELD", EnumSet.of(KotlinTarget.FIELD)), formularize.attabal("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), formularize.attabal("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), formularize.attabal("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), formularize.attabal("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), formularize.attabal("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Map<String, KotlinRetention> f30369dern = seminary.impassible(formularize.attabal("RUNTIME", KotlinRetention.RUNTIME), formularize.attabal("CLASS", KotlinRetention.BINARY), formularize.attabal("SOURCE", KotlinRetention.SOURCE));

    public final competently<?> attabal(saneness sanenessVar) {
        impassible impassibleVar = sanenessVar instanceof impassible ? (impassible) sanenessVar : null;
        if (impassibleVar != null) {
            Map<String, KotlinRetention> map = f30369dern;
            marial marialVarMarial = impassibleVar.marial();
            KotlinRetention kotlinRetention = map.get(marialVarMarial != null ? marialVarMarial.dern() : null);
            if (kotlinRetention != null) {
                byname.saneness sanenessVarImpassible = byname.saneness.impassible(kotlin.reflect.jvm.internal.impl.builtins.competently.attabal.f29750polder);
                Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
                marial marialVarCutely = marial.cutely(kotlinRetention.name());
                Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
                return new taiyuan(sanenessVarImpassible, marialVarCutely);
            }
        }
        return null;
    }

    public final competently<?> dern(List<? extends saneness> arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList<impassible> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof impassible) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (impassible impassibleVar : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = f30368attabal;
            marial marialVarMarial = impassibleVar.marial();
            cord.stratoscope(arrayList2, javaAnnotationTargetMapper.saneness(marialVarMarial != null ? marialVarMarial.dern() : null));
        }
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            byname.saneness sanenessVarImpassible = byname.saneness.impassible(kotlin.reflect.jvm.internal.impl.builtins.competently.attabal.f29737merc);
            Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
            marial marialVarCutely = marial.cutely(kotlinTarget.name());
            Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
            arrayList3.add(new taiyuan(sanenessVarImpassible, marialVarCutely));
        }
        return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness(arrayList3, new Function1<trm, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$mapJavaTargetArguments$1
            @Override // p002kotlin.jvm.functions.Function1
            public final oilcan invoke(trm module) {
                Intrinsics.checkNotNullParameter(module, "module");
                cultivated cultivatedVarSaneness = attabal.saneness(saneness.f30389attabal.wireman(), module.apical().kowloon(kotlin.reflect.jvm.internal.impl.builtins.competently.attabal.f29768supplicat));
                oilcan type = cultivatedVarSaneness != null ? cultivatedVarSaneness.getType() : null;
                return type == null ? prescient.competently.wireman(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
            }
        });
    }

    public final Set<KotlinTarget> saneness(String str) {
        EnumSet<KotlinTarget> enumSet = f30370saneness.get(str);
        return enumSet != null ? enumSet : creditor.marial();
    }
}
