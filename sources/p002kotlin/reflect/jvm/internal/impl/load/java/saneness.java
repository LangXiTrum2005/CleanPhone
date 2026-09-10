package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.marial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: AnnotationTypeQualifierResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness extends AbstractAnnotationTypeQualifierResolver<dern> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saneness(JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public Iterable<String> saneness(dern dernVar, boolean z) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Map<marial, competently<?>> mapAttabal = dernVar.attabal();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<marial, competently<?>> entry : mapAttabal.entrySet()) {
            cord.stratoscope(arrayList, (!z || Intrinsics.wireman(entry.getKey(), graveside.f30422dern)) ? preprohormone(entry.getValue()) : adultoid.formularize());
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public byname.dern taiyuan(dern dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        return dernVar.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
    public Object cutely(dern dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        wireman wiremanVarTaiyuan = DescriptorUtilsKt.taiyuan(dernVar);
        Intrinsics.beachfront(wiremanVarTaiyuan);
        return wiremanVarTaiyuan;
    }

    public final List<String> preprohormone(competently<?> competentlyVar) {
        if (!(competentlyVar instanceof p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness)) {
            return competentlyVar instanceof taiyuan ? graveside.marial(((taiyuan) competentlyVar).dern().marial()) : adultoid.formularize();
        }
        List<? extends competently<?>> listSaneness = ((p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness) competentlyVar).saneness();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listSaneness.iterator();
        while (it.hasNext()) {
            cord.stratoscope(arrayList, preprohormone((competently) it.next()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
    public Iterable<dern> apical(dern dernVar) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations;
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        wireman wiremanVarTaiyuan = DescriptorUtilsKt.taiyuan(dernVar);
        return (wiremanVarTaiyuan == null || (annotations = wiremanVarTaiyuan.getAnnotations()) == null) ? adultoid.formularize() : annotations;
    }
}
