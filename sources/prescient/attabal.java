package prescient;

import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.itchy;

/* JADX INFO: compiled from: ErrorClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently {
    /* JADX WARN: Illegal instructions before constructor call */
    public attabal(byname.marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        competently competentlyVar = competently.f35667attabal;
        trm trmVarTaiyuan = competentlyVar.taiyuan();
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        List listFormularize = adultoid.formularize();
        walach walachVar = walach.f30274attabal;
        super(trmVarTaiyuan, name, modality, classKind, listFormularize, walachVar, false, LockBasedStorageManager.f31625marial);
        p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial marialVarTailoring = p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial.tailoring(this, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), true, walachVar);
        marialVarTailoring.twybill(adultoid.formularize(), polloi.f30217wireman);
        Intrinsics.checkNotNullExpressionValue(marialVarTailoring, "apply(...)");
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String string = marialVarTailoring.getName().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        MemberScope memberScopeSaneness = competently.saneness(errorScopeKind, string, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        marialVarTailoring.cig(new marial(competentlyVar.marial(errorTypeKind, new String[0]), memberScopeSaneness, errorTypeKind, null, false, new String[0], 24, null));
        dhss(memberScopeSaneness, privatdozent.wireman(marialVarTailoring), marialVarTailoring);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    /* JADX INFO: renamed from: outmarry */
    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman dern(TypeSubstitutor substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
    public MemberScope timberyard(itchy typeSubstitution, p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String string = getName().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return competently.saneness(errorScopeKind, string, typeSubstitution.toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently
    public String toString() {
        String strDern = getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return strDern;
    }
}
