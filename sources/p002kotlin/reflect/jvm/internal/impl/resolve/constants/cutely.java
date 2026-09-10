package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import prescient.competently;
import prescient.marial;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class cutely extends competently<Unit> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f31326attabal = new attabal(null);

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cutely attabal(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new saneness(message);
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class saneness extends cutely {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f31327saneness;

        public saneness(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f31327saneness = message;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
        public String toString() {
            return this.f31327saneness;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public marial attabal(trm module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return competently.wireman(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f31327saneness);
        }
    }

    public cutely() {
        super(Unit.f29295attabal);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public Unit saneness() {
        throw new UnsupportedOperationException();
    }
}
