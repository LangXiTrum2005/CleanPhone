package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import byname.dern;
import byname.marial;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import p002kotlin.Pair;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.attabal;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.graveside;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import patroclinal.formularize;

/* JADX INFO: compiled from: annotationUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AnnotationUtilKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f29915attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final marial f29916dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final marial f29917marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final marial f29918saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final marial f29919wireman;

    static {
        marial marialVarCutely = marial.cutely(PglCryptUtils.KEY_MESSAGE);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        f29915attabal = marialVarCutely;
        marial marialVarCutely2 = marial.cutely("replaceWith");
        Intrinsics.checkNotNullExpressionValue(marialVarCutely2, "identifier(...)");
        f29918saneness = marialVarCutely2;
        marial marialVarCutely3 = marial.cutely(AppLovinEventTypes.USER_COMPLETED_LEVEL);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely3, "identifier(...)");
        f29916dern = marialVarCutely3;
        marial marialVarCutely4 = marial.cutely("expression");
        Intrinsics.checkNotNullExpressionValue(marialVarCutely4, "identifier(...)");
        f29919wireman = marialVarCutely4;
        marial marialVarCutely5 = marial.cutely("imports");
        Intrinsics.checkNotNullExpressionValue(marialVarCutely5, "identifier(...)");
        f29917marial = marialVarCutely5;
    }

    public static final dern attabal(final beachfront beachfrontVar, String message, String replaceWith, String level, boolean z) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        Intrinsics.checkNotNullParameter(level, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(beachfrontVar, competently.attabal.f29767stratoscope, seminary.impassible(formularize.attabal(f29919wireman, new graveside(replaceWith)), formularize.attabal(f29917marial, new saneness(adultoid.formularize(), new Function1<trm, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final oilcan invoke(trm module) {
                Intrinsics.checkNotNullParameter(module, "module");
                merc mercVarFormularize = module.apical().formularize(Variance.INVARIANT, beachfrontVar.overspeculate());
                Intrinsics.checkNotNullExpressionValue(mercVarFormularize, "getArrayType(...)");
                return mercVarFormularize;
            }
        }))), false, 8, null);
        dern dernVar = competently.attabal.f29753preprohormone;
        Pair pairAttabal = formularize.attabal(f29915attabal, new graveside(message));
        Pair pairAttabal2 = formularize.attabal(f29918saneness, new attabal(builtInAnnotationDescriptor));
        marial marialVar = f29916dern;
        byname.saneness sanenessVarImpassible = byname.saneness.impassible(competently.attabal.f29706cuirassed);
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
        marial marialVarCutely = marial.cutely(level);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        return new BuiltInAnnotationDescriptor(beachfrontVar, dernVar, seminary.impassible(pairAttabal, pairAttabal2, formularize.attabal(marialVar, new taiyuan(sanenessVarImpassible, marialVarCutely))), z);
    }

    public static /* synthetic */ dern saneness(beachfront beachfrontVar, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return attabal(beachfrontVar, str, str2, str3, z);
    }
}
