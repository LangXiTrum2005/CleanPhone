package prescient;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorModuleDescriptor;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: ErrorUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final saran f35668beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Set<saran> f35669competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final attabal f35670dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final oilcan f35671marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final oilcan f35673wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently f35667attabal = new competently();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final trm f35672saneness = ErrorModuleDescriptor.f31756kowloon;

    static {
        String str = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        byname.marial marialVarImpassible = byname.marial.impassible(str);
        Intrinsics.checkNotNullExpressionValue(marialVarImpassible, "special(...)");
        f35670dern = new attabal(marialVarImpassible);
        f35673wireman = wireman(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f35671marial = wireman(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        dern dernVar = new dern();
        f35668beachfront = dernVar;
        f35669competently = privatdozent.wireman(dernVar);
    }

    public static final wireman attabal(ErrorScopeKind kind, boolean z, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return z ? new impromptu(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new wireman(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean impassible(apical apicalVar) {
        if (apicalVar == null) {
            return false;
        }
        competently competentlyVar = f35667attabal;
        return competentlyVar.triweekly(apicalVar) || competentlyVar.triweekly(apicalVar.saneness()) || apicalVar == f35672saneness;
    }

    public static final boolean kowloon(oilcan oilcanVar) {
        if (oilcanVar == null) {
            return false;
        }
        permissivist permissivistVar = oilcanVar.setterwort();
        return (permissivistVar instanceof beachfront) && ((beachfront) permissivistVar).beachfront() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    public static final wireman saneness(ErrorScopeKind kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return attabal(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final marial wireman(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return f35667attabal.competently(kind, adultoid.formularize(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final oilcan apical() {
        return f35671marial;
    }

    public final String arytenoidectomy(oilcan type) {
        Intrinsics.checkNotNullParameter(type, "type");
        TypeUtilsKt.adultoid(type);
        permissivist permissivistVar = type.setterwort();
        Intrinsics.competently(permissivistVar, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((beachfront) permissivistVar).competently(0);
    }

    public final marial beachfront(ErrorTypeKind kind, List<? extends timberyard> arguments, permissivist typeConstructor, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new marial(typeConstructor, saneness(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final marial competently(ErrorTypeKind kind, List<? extends timberyard> arguments, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return beachfront(kind, arguments, marial(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final Set<saran> cutely() {
        return f35669competently;
    }

    public final marial dern(ErrorTypeKind kind, permissivist typeConstructor, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return beachfront(kind, adultoid.formularize(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final oilcan formularize() {
        return f35673wireman;
    }

    public final attabal impromptu() {
        return f35670dern;
    }

    public final beachfront marial(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new beachfront(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final trm taiyuan() {
        return f35672saneness;
    }

    public final boolean triweekly(apical apicalVar) {
        return apicalVar instanceof attabal;
    }
}
