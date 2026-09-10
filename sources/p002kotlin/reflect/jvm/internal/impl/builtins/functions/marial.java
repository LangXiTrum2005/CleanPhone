package p002kotlin.reflect.jvm.internal.impl.builtins.functions;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;

/* JADX INFO: compiled from: FunctionTypeKind.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byname.dern f29792attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f29793dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f29794saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byname.saneness f29795wireman;

    /* JADX INFO: compiled from: FunctionTypeKind.kt */
    public static final class attabal extends marial {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final attabal f29796marial = new attabal();

        public attabal() {
            super(competently.f29682preprohormone, "Function", false, null);
        }
    }

    /* JADX INFO: compiled from: FunctionTypeKind.kt */
    public static final class dern extends marial {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final dern f29797marial = new dern();

        public dern() {
            super(competently.f29670dovishness, "KSuspendFunction", true, null);
        }
    }

    /* JADX INFO: compiled from: FunctionTypeKind.kt */
    public static final class saneness extends marial {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final saneness f29798marial = new saneness();

        public saneness() {
            super(competently.f29670dovishness, "KFunction", true, null);
        }
    }

    /* JADX INFO: compiled from: FunctionTypeKind.kt */
    public static final class wireman extends marial {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final wireman f29799marial = new wireman();

        public wireman() {
            super(competently.f29679monoploid, "SuspendFunction", false, null);
        }
    }

    public marial(byname.dern packageFqName, String classNamePrefix, boolean z, byname.saneness sanenessVar) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.f29792attabal = packageFqName;
        this.f29794saneness = classNamePrefix;
        this.f29793dern = z;
        this.f29795wireman = sanenessVar;
    }

    public final String attabal() {
        return this.f29794saneness;
    }

    public final byname.marial dern(int i) {
        byname.marial marialVarCutely = byname.marial.cutely(this.f29794saneness + i);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        return marialVarCutely;
    }

    public final byname.dern saneness() {
        return this.f29792attabal;
    }

    public String toString() {
        return this.f29792attabal + '.' + this.f29794saneness + 'N';
    }
}
