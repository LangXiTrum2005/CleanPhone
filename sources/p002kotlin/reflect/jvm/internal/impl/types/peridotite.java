package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;

/* JADX INFO: compiled from: TypeAliasExpansionReportStrategy.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface peridotite {

    /* JADX INFO: compiled from: TypeAliasExpansionReportStrategy.kt */
    public static final class attabal implements peridotite {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f31799attabal = new attabal();

        @Override // p002kotlin.reflect.jvm.internal.impl.types.peridotite
        public void attabal(TypeSubstitutor substitutor, oilcan unsubstitutedArgument, oilcan argument, clubfoot typeParameter) {
            Intrinsics.checkNotNullParameter(substitutor, "substitutor");
            Intrinsics.checkNotNullParameter(unsubstitutedArgument, "unsubstitutedArgument");
            Intrinsics.checkNotNullParameter(argument, "argument");
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.peridotite
        public void dern(dern annotation) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.peridotite
        public void saneness(overspeculate typeAlias) {
            Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.peridotite
        public void wireman(overspeculate typeAlias, clubfoot clubfootVar, oilcan substitutedArgument) {
            Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
            Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
        }
    }

    void attabal(TypeSubstitutor typeSubstitutor, oilcan oilcanVar, oilcan oilcanVar2, clubfoot clubfootVar);

    void dern(dern dernVar);

    void saneness(overspeculate overspeculateVar);

    void wireman(overspeculate overspeculateVar, clubfoot clubfootVar, oilcan oilcanVar);
}
