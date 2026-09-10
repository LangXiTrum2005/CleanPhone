package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class itchy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f31776attabal = new saneness(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final itchy f31777saneness = new attabal();

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class attabal extends itchy {
        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public boolean beachfront() {
            return true;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public /* bridge */ /* synthetic */ timberyard marial(oilcan oilcanVar) {
            return (timberyard) taiyuan(oilcanVar);
        }

        public Void taiyuan(oilcan key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class dern extends itchy {
        public dern() {
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public boolean attabal() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public boolean beachfront() {
            return itchy.this.beachfront();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public oilcan competently(oilcan topLevelType, Variance position) {
            Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
            Intrinsics.checkNotNullParameter(position, "position");
            return itchy.this.competently(topLevelType, position);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public timberyard marial(oilcan key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return itchy.this.marial(key);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public boolean saneness() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public marial wireman(marial annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return itchy.this.wireman(annotations);
        }
    }

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class saneness {
        public /* synthetic */ saneness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public saneness() {
        }
    }

    public boolean attabal() {
        return false;
    }

    public boolean beachfront() {
        return false;
    }

    public oilcan competently(oilcan topLevelType, Variance position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }

    public final TypeSubstitutor dern() {
        TypeSubstitutor typeSubstitutorCompetently = TypeSubstitutor.competently(this);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCompetently, "create(...)");
        return typeSubstitutorCompetently;
    }

    public final itchy impromptu() {
        return new dern();
    }

    public abstract timberyard marial(oilcan oilcanVar);

    public boolean saneness() {
        return false;
    }

    public marial wireman(marial annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }
}
