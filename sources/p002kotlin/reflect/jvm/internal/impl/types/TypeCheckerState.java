package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import lyreflower.beachfront;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import presbytery.competently;
import presbytery.impassible;
import presbytery.impromptu;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public class TypeCheckerState {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f31672attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final competently f31673beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f31674competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public Set<impromptu> f31675cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f31676dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f31677impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final beachfront f31678marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f31679saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public ArrayDeque<impromptu> f31680taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final impassible f31681wireman;

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f31682arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public interface attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class C0705attabal implements attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public boolean f31684attabal;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.attabal
            public void attabal(Function0<Boolean> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                if (this.f31684attabal) {
                    return;
                }
                this.f31684attabal = block.invoke().booleanValue();
            }

            public final boolean saneness() {
                return this.f31684attabal;
            }
        }

        void attabal(Function0<Boolean> function0);
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public static abstract class saneness {

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static abstract class attabal extends saneness {
            public attabal() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class dern extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final dern f31685attabal = new dern();

            public dern() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.saneness
            public /* bridge */ /* synthetic */ impromptu attabal(TypeCheckerState typeCheckerState, competently competentlyVar) {
                return (impromptu) saneness(typeCheckerState, competentlyVar);
            }

            public Void saneness(TypeCheckerState state, competently type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$saneness$saneness, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class C0706saneness extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final C0706saneness f31686attabal = new C0706saneness();

            public C0706saneness() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.saneness
            public impromptu attabal(TypeCheckerState state, competently type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.cutely().creditor(type);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class wireman extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final wireman f31687attabal = new wireman();

            public wireman() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.saneness
            public impromptu attabal(TypeCheckerState state, competently type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.cutely().julian(type);
            }
        }

        public /* synthetic */ saneness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract impromptu attabal(TypeCheckerState typeCheckerState, competently competentlyVar);

        public saneness() {
        }
    }

    public TypeCheckerState(boolean z, boolean z2, boolean z3, impassible typeSystemContext, beachfront kotlinTypePreparator, competently kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f31672attabal = z;
        this.f31679saneness = z2;
        this.f31676dern = z3;
        this.f31681wireman = typeSystemContext;
        this.f31678marial = kotlinTypePreparator;
        this.f31673beachfront = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean wireman(TypeCheckerState typeCheckerState, competently competentlyVar, competently competentlyVar2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return typeCheckerState.dern(competentlyVar, competentlyVar2, z);
    }

    public final void apical() {
        this.f31677impromptu = true;
        if (this.f31680taiyuan == null) {
            this.f31680taiyuan = new ArrayDeque<>(4);
        }
        if (this.f31675cutely == null) {
            this.f31675cutely = beachfront.f33195monoploid.attabal();
        }
    }

    public final competently arytenoidectomy(competently type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f31673beachfront.attabal(type);
    }

    public boolean beachfront(competently subType, competently superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return true;
    }

    public LowerCapturedTypePolicy competently(impromptu subType, presbytery.saneness superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    public final impassible cutely() {
        return this.f31681wireman;
    }

    public Boolean dern(competently subType, competently superType, boolean z) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return null;
    }

    public final boolean formularize(competently type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f31676dern && this.f31681wireman.claque(type);
    }

    public final boolean impassible() {
        return this.f31672attabal;
    }

    public final ArrayDeque<impromptu> impromptu() {
        return this.f31680taiyuan;
    }

    public final competently kowloon(competently type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f31678marial.attabal(type);
    }

    public final void marial() {
        ArrayDeque<impromptu> arrayDeque = this.f31680taiyuan;
        Intrinsics.beachfront(arrayDeque);
        arrayDeque.clear();
        Set<impromptu> set = this.f31675cutely;
        Intrinsics.beachfront(set);
        set.clear();
        this.f31677impromptu = false;
    }

    public boolean monoploid(Function1<? super attabal, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        attabal.C0705attabal c0705attabal = new attabal.C0705attabal();
        block.invoke(c0705attabal);
        return c0705attabal.saneness();
    }

    public final Set<impromptu> taiyuan() {
        return this.f31675cutely;
    }

    public final boolean triweekly() {
        return this.f31679saneness;
    }
}
