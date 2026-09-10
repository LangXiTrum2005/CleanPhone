package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;

/* JADX INFO: compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class molybdenite extends itchy {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final attabal f31788marial = new attabal(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final itchy f31789dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final itchy f31790wireman;

    /* JADX INFO: compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final itchy attabal(itchy first, itchy second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (first.beachfront()) {
                return second;
            }
            return second.beachfront() ? first : new molybdenite(first, second, null);
        }

        public attabal() {
        }
    }

    public /* synthetic */ molybdenite(itchy itchyVar, itchy itchyVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(itchyVar, itchyVar2);
    }

    public static final itchy taiyuan(itchy itchyVar, itchy itchyVar2) {
        return f31788marial.attabal(itchyVar, itchyVar2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public boolean attabal() {
        return this.f31789dern.attabal() || this.f31790wireman.attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public boolean beachfront() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public oilcan competently(oilcan topLevelType, Variance position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f31790wireman.competently(this.f31789dern.competently(topLevelType, position), position);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public timberyard marial(oilcan key) {
        Intrinsics.checkNotNullParameter(key, "key");
        timberyard timberyardVarMarial = this.f31789dern.marial(key);
        return timberyardVarMarial == null ? this.f31790wireman.marial(key) : timberyardVarMarial;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public boolean saneness() {
        return this.f31789dern.saneness() || this.f31790wireman.saneness();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public marial wireman(marial annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f31790wireman.wireman(this.f31789dern.wireman(annotations));
    }

    public molybdenite(itchy itchyVar, itchy itchyVar2) {
        this.f31789dern = itchyVar;
        this.f31790wireman = itchyVar2;
    }
}
