package p002kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import p002kotlin.reflect.jvm.internal.impl.load.java.polloi;
import patroclinal.taiyuan;
import yeast.formularize;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f30594attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final taiyuan<polloi> f30595dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final JavaTypeResolver f30596marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f30597saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final taiyuan f30598wireman;

    public wireman(attabal components, competently typeParameterResolver, taiyuan<polloi> delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f30594attabal = components;
        this.f30597saneness = typeParameterResolver;
        this.f30595dern = delegateForDefaultTypeQualifiers;
        this.f30598wireman = delegateForDefaultTypeQualifiers;
        this.f30596marial = new JavaTypeResolver(this, typeParameterResolver);
    }

    public final attabal attabal() {
        return this.f30594attabal;
    }

    public final competently beachfront() {
        return this.f30597saneness;
    }

    public final JavaTypeResolver competently() {
        return this.f30596marial;
    }

    public final taiyuan<polloi> dern() {
        return this.f30595dern;
    }

    public final formularize marial() {
        return this.f30594attabal.adultoid();
    }

    public final polloi saneness() {
        return (polloi) this.f30598wireman.getValue();
    }

    public final trm wireman() {
        return this.f30594attabal.impassible();
    }
}
