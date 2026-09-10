package p002kotlin.reflect.jvm.internal.impl.builtins.functions;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FunctionClassKind.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum FunctionClassKind {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;


    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ pussyfooter.attabal f29782arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    public static final attabal Companion = new attabal(null);

    /* JADX INFO: compiled from: FunctionClassKind.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FunctionClassKind attabal(marial functionTypeKind) {
            Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
            if (Intrinsics.wireman(functionTypeKind, marial.attabal.f29796marial)) {
                return FunctionClassKind.Function;
            }
            if (Intrinsics.wireman(functionTypeKind, marial.wireman.f29799marial)) {
                return FunctionClassKind.SuspendFunction;
            }
            if (Intrinsics.wireman(functionTypeKind, marial.saneness.f29798marial)) {
                return FunctionClassKind.KFunction;
            }
            return Intrinsics.wireman(functionTypeKind, marial.dern.f29797marial) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }

        public attabal() {
        }
    }
}
