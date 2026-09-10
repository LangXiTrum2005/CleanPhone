package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes7.dex */
public class TypeCheckerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClassicTypeSystemContext f44532c;
    public final KotlinTypePreparator d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KotlinTypeRefiner f44533e;
    public int f;
    public ArrayDeque g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SmartSet f44534h;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f44535a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public final void a(Function0 function0) {
                if (this.f44535a) {
                    return;
                }
                this.f44535a = ((Boolean) ((AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.AnonymousClass1) function0).invoke()).booleanValue();
            }
        }

        void a(Function0 function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LowerCapturedTypePolicy {
        public static final /* synthetic */ LowerCapturedTypePolicy[] X = {new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0), new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1), new LowerCapturedTypePolicy("SKIP_LOWER", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        LowerCapturedTypePolicy EF5;

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) X.clone();
        }
    }

    public static abstract class SupertypesPolicy {

        public static abstract class DoCustomTransform extends SupertypesPolicy {
        }

        public static final class LowerIfFlexible extends SupertypesPolicy {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final LowerIfFlexible f44536a = new LowerIfFlexible();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public final SimpleTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.f(state, "state");
                Intrinsics.f(type, "type");
                return state.f44532c.i0(type);
            }
        }

        public static final class None extends SupertypesPolicy {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final None f44537a = new None();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public final SimpleTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.f(state, "state");
                Intrinsics.f(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class UpperIfFlexible extends SupertypesPolicy {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UpperIfFlexible f44538a = new UpperIfFlexible();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public final SimpleTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.f(state, "state");
                Intrinsics.f(type, "type");
                return state.f44532c.n(type);
            }
        }

        public abstract SimpleTypeMarker a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker);
    }

    public TypeCheckerState(boolean z2, boolean z3, ClassicTypeSystemContext typeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(typeSystemContext, "typeSystemContext");
        Intrinsics.f(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f44530a = z2;
        this.f44531b = z3;
        this.f44532c = typeSystemContext;
        this.d = kotlinTypePreparator;
        this.f44533e = kotlinTypeRefiner;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        Intrinsics.c(arrayDeque);
        arrayDeque.clear();
        SmartSet smartSet = this.f44534h;
        Intrinsics.c(smartSet);
        smartSet.clear();
    }

    public boolean b(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        return true;
    }

    public final void c() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.f44534h == null) {
            this.f44534h = new SmartSet();
        }
    }

    public final KotlinTypeMarker d(KotlinTypeMarker type) {
        Intrinsics.f(type, "type");
        return this.d.a(type);
    }
}
