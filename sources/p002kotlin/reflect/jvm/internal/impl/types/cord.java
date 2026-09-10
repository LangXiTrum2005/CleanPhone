package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.renderer.saneness;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.checker.marial;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: flexibleTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cord extends preprohormone implements formularize {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static boolean f31739graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final attabal f31740molybdenite = new attabal(null);

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f31741polloi;

    /* JADX INFO: compiled from: flexibleTypes.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cord(merc lowerBound, merc upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public String basify(DescriptorRenderer renderer, saneness options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!options.getDebugMode()) {
            return renderer.polloi(renderer.adultoid(sakeen()), renderer.adultoid(immediately()), TypeUtilsKt.taiyuan(this));
        }
        return '(' + renderer.adultoid(sakeen()) + ".." + renderer.adultoid(immediately()) + ')';
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    public empress deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return KotlinTypeFactory.wireman(sakeen().deadwork(newAttributes), immediately().deadwork(newAttributes));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.formularize
    public oilcan itchy(oilcan replacement) {
        empress empressVarWireman;
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        empress empressVarHomozygous = replacement.homozygous();
        if (empressVarHomozygous instanceof preprohormone) {
            empressVarWireman = empressVarHomozygous;
        } else {
            if (!(empressVarHomozygous instanceof merc)) {
                throw new NoWhenBranchMatchedException();
            }
            merc mercVar = (merc) empressVarHomozygous;
            empressVarWireman = KotlinTypeFactory.wireman(mercVar, mercVar.lampshade(true));
        }
        return sayid.saneness(empressVarWireman, empressVarHomozygous);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    public empress lampshade(boolean z) {
        return KotlinTypeFactory.wireman(sakeen().lampshade(z), immediately().lampshade(z));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public merc molet() {
        prefect();
        return sakeen();
    }

    public final void prefect() {
        if (!f31739graveside || this.f31741polloi) {
            return;
        }
        this.f31741polloi = true;
        stratoscope.saneness(sakeen());
        stratoscope.saneness(immediately());
        Intrinsics.wireman(sakeen(), immediately());
        marial.f31734attabal.wireman(sakeen(), immediately());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: tectonization, reason: merged with bridge method [inline-methods] */
    public preprohormone libyan(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        oilcan oilcanVarAttabal = kotlinTypeRefiner.attabal(sakeen());
        Intrinsics.competently(oilcanVarAttabal, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        oilcan oilcanVarAttabal2 = kotlinTypeRefiner.attabal(immediately());
        Intrinsics.competently(oilcanVarAttabal2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new cord((merc) oilcanVarAttabal, (merc) oilcanVarAttabal2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public String toString() {
        return '(' + sakeen() + ".." + immediately() + ')';
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.formularize
    public boolean unconsolidated() {
        return (sakeen().setterwort().wireman() instanceof clubfoot) && Intrinsics.wireman(sakeen().setterwort(), immediately().setterwort());
    }
}
