package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotNullLazyValue f44491b;

    public final class ModuleViewTypeConstructor implements TypeConstructor {
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final Collection d() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean e() {
            throw null;
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final KotlinBuiltIns k() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static final class Supertypes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection f44492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f44493b;

        public Supertypes(Collection allSupertypes) {
            Intrinsics.f(allSupertypes, "allSupertypes");
            this.f44492a = allSupertypes;
            this.f44493b = CollectionsKt.H(ErrorUtils.d);
        }
    }

    public AbstractTypeConstructor(StorageManager storageManager) {
        Intrinsics.f(storageManager, "storageManager");
        this.f44491b = storageManager.c(new Function0<Supertypes>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AbstractTypeConstructor.Supertypes(this.X.g());
            }
        }, AbstractTypeConstructor$supertypes$2.X, new Function1<Supertypes, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$2, reason: invalid class name */
            final class AnonymousClass2 extends Lambda implements Function1<TypeConstructor, Iterable<? extends KotlinType>> {
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    TypeConstructor it = (TypeConstructor) obj;
                    Intrinsics.f(it, "it");
                    throw null;
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$3, reason: invalid class name */
            final class AnonymousClass3 extends Lambda implements Function1<KotlinType, Unit> {
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    KotlinType it = (KotlinType) obj;
                    Intrinsics.f(it, "it");
                    throw null;
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractTypeConstructor.Supertypes supertypes = (AbstractTypeConstructor.Supertypes) obj;
                Intrinsics.f(supertypes, "supertypes");
                final AbstractTypeConstructor abstractTypeConstructor = this.X;
                List listA = abstractTypeConstructor.j().a(abstractTypeConstructor, supertypes.f44492a, new Function1<TypeConstructor, Iterable<? extends KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Collection supertypes2;
                        TypeConstructor it = (TypeConstructor) obj2;
                        Intrinsics.f(it, "it");
                        abstractTypeConstructor.getClass();
                        AbstractTypeConstructor abstractTypeConstructor2 = it instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) it : null;
                        if (abstractTypeConstructor2 != null) {
                            supertypes2 = CollectionsKt.O(abstractTypeConstructor2.i(false), ((AbstractTypeConstructor.Supertypes) abstractTypeConstructor2.f44491b.invoke()).f44492a);
                        } else {
                            supertypes2 = it.d();
                            Intrinsics.e(supertypes2, "supertypes");
                        }
                        return supertypes2;
                    }
                }, new Function1<KotlinType, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        KotlinType it = (KotlinType) obj2;
                        Intrinsics.f(it, "it");
                        abstractTypeConstructor.n(it);
                        return Unit.f43263a;
                    }
                });
                if (listA.isEmpty()) {
                    KotlinType kotlinTypeH = abstractTypeConstructor.h();
                    List listH = kotlinTypeH != null ? CollectionsKt.H(kotlinTypeH) : null;
                    if (listH == null) {
                        listH = EmptyList.X;
                    }
                    listA = listH;
                }
                List listI0 = listA instanceof List ? (List) listA : null;
                if (listI0 == null) {
                    listI0 = CollectionsKt.i0(listA);
                }
                List listM = abstractTypeConstructor.m(listI0);
                Intrinsics.f(listM, "<set-?>");
                supertypes.f44493b = listM;
                return Unit.f43263a;
            }
        });
    }

    public abstract Collection g();

    public KotlinType h() {
        return null;
    }

    public Collection i(boolean z2) {
        return EmptyList.X;
    }

    public abstract SupertypeLoopChecker j();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final List d() {
        return ((Supertypes) this.f44491b.invoke()).f44493b;
    }

    public List m(List list) {
        return list;
    }

    public void n(KotlinType type) {
        Intrinsics.f(type, "type");
    }
}
