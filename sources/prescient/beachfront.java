package prescient;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;

/* JADX INFO: compiled from: ErrorTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront implements permissivist {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ErrorTypeKind f35664attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f35665dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String[] f35666saneness;

    public beachfront(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f35664attabal = kind;
        this.f35666saneness = formatParams;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format(debugText, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.f35665dern = str2;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public p002kotlin.reflect.jvm.internal.impl.builtins.beachfront apical() {
        return DefaultBuiltIns.f29624impromptu.attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public permissivist attabal(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final ErrorTypeKind beachfront() {
        return this.f35664attabal;
    }

    public final String competently(int i) {
        return this.f35666saneness[i];
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public Collection<oilcan> cutely() {
        return adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public List<clubfoot> getParameters() {
        return adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public boolean marial() {
        return false;
    }

    public String toString() {
        return this.f35665dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront wireman() {
        return competently.f35667attabal.impromptu();
    }
}
