package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import byname.dern;
import byname.marial;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import genesic.attabal;
import java.util.Map;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.load.java.graveside;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import patroclinal.formularize;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f30389attabal = new saneness();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final marial f30390dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Map<dern, dern> f30391marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final marial f30392saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final marial f30393wireman;

    static {
        marial marialVarCutely = marial.cutely(PglCryptUtils.KEY_MESSAGE);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        f30392saneness = marialVarCutely;
        marial marialVarCutely2 = marial.cutely("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(marialVarCutely2, "identifier(...)");
        f30390dern = marialVarCutely2;
        marial marialVarCutely3 = marial.cutely("value");
        Intrinsics.checkNotNullExpressionValue(marialVarCutely3, "identifier(...)");
        f30393wireman = marialVarCutely3;
        f30391marial = seminary.impassible(formularize.attabal(competently.attabal.f29768supplicat, graveside.f30437wireman), formularize.attabal(competently.attabal.f29762seminary, graveside.f30419beachfront), formularize.attabal(competently.attabal.f29705creditor, graveside.f30435taiyuan));
    }

    public static /* synthetic */ p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern beachfront(saneness sanenessVar, attabal attabalVar, wireman wiremanVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return sanenessVar.marial(attabalVar, wiremanVar, z);
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern attabal(dern kotlinName, genesic.wireman annotationOwner, wireman c) {
        attabal attabalVarAttabal;
        Intrinsics.checkNotNullParameter(kotlinName, "kotlinName");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        Intrinsics.checkNotNullParameter(c, "c");
        if (Intrinsics.wireman(kotlinName, competently.attabal.f29753preprohormone)) {
            dern DEPRECATED_ANNOTATION = graveside.f30428impromptu;
            Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            attabal attabalVarAttabal2 = annotationOwner.attabal(DEPRECATED_ANNOTATION);
            if (attabalVarAttabal2 != null || annotationOwner.stratoscope()) {
                return new JavaDeprecatedAnnotationDescriptor(attabalVarAttabal2, c);
            }
        }
        dern dernVar = f30391marial.get(kotlinName);
        if (dernVar == null || (attabalVarAttabal = annotationOwner.attabal(dernVar)) == null) {
            return null;
        }
        return beachfront(f30389attabal, attabalVarAttabal, c, false, 4, null);
    }

    public final marial dern() {
        return f30393wireman;
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern marial(attabal annotation, wireman c, boolean z) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c, "c");
        byname.saneness sanenessVarCompetently = annotation.competently();
        if (Intrinsics.wireman(sanenessVarCompetently, byname.saneness.impassible(graveside.f30437wireman))) {
            return new JavaTargetAnnotationDescriptor(annotation, c);
        }
        if (Intrinsics.wireman(sanenessVarCompetently, byname.saneness.impassible(graveside.f30419beachfront))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c);
        }
        if (Intrinsics.wireman(sanenessVarCompetently, byname.saneness.impassible(graveside.f30435taiyuan))) {
            return new JavaAnnotationDescriptor(c, annotation, competently.attabal.f29705creditor);
        }
        if (Intrinsics.wireman(sanenessVarCompetently, byname.saneness.impassible(graveside.f30428impromptu))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c, annotation, z);
    }

    public final marial saneness() {
        return f30392saneness;
    }

    public final marial wireman() {
        return f30390dern;
    }
}
