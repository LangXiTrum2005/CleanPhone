package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.coffeecake;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class IntegerLiteralTypeConstructor implements permissivist {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Companion f31315marial = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trm f31316attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final merc f31317dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<oilcan> f31318saneness;
    private final long value;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final taiyuan f31319wireman;

    /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;


            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public static final /* synthetic */ pussyfooter.attabal f31320arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
        }

        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        public /* synthetic */ class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f31322attabal;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f31322attabal = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final merc attabal(Collection<? extends merc> collection2, Mode mode) {
            if (collection2.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection2.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                merc mercVar = (merc) it.next();
                next = IntegerLiteralTypeConstructor.f31315marial.marial((merc) next, mercVar, mode);
            }
            return (merc) next;
        }

        public final merc dern(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set setCoi;
            int i = attabal.f31322attabal[mode.ordinal()];
            if (i == 1) {
                setCoi = CollectionsKt.coi(integerLiteralTypeConstructor.formularize(), integerLiteralTypeConstructor2.formularize());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setCoi = CollectionsKt.osteal(integerLiteralTypeConstructor.formularize(), integerLiteralTypeConstructor2.formularize());
            }
            return KotlinTypeFactory.marial(overspeculate.f31797arytenoidectomy.taiyuan(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.value, integerLiteralTypeConstructor.f31316attabal, setCoi, null), false);
        }

        public final merc marial(merc mercVar, merc mercVar2, Mode mode) {
            if (mercVar != null && mercVar2 != null) {
                permissivist permissivistVar = mercVar.setterwort();
                permissivist permissivistVar2 = mercVar2.setterwort();
                boolean z = permissivistVar instanceof IntegerLiteralTypeConstructor;
                if (z && (permissivistVar2 instanceof IntegerLiteralTypeConstructor)) {
                    return dern((IntegerLiteralTypeConstructor) permissivistVar, (IntegerLiteralTypeConstructor) permissivistVar2, mode);
                }
                if (z) {
                    return wireman((IntegerLiteralTypeConstructor) permissivistVar, mercVar2);
                }
                if (permissivistVar2 instanceof IntegerLiteralTypeConstructor) {
                    return wireman((IntegerLiteralTypeConstructor) permissivistVar2, mercVar);
                }
            }
            return null;
        }

        public final merc saneness(Collection<? extends merc> types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return attabal(types, Mode.INTERSECTION_TYPE);
        }

        public final merc wireman(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, merc mercVar) {
            if (integerLiteralTypeConstructor.formularize().contains(mercVar)) {
                return mercVar;
            }
            return null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, trm trmVar, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, trmVar, set);
    }

    private final List<oilcan> impassible() {
        return (List) this.f31319wireman.getValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public beachfront apical() {
        return this.f31316attabal.apical();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public permissivist attabal(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public Collection<oilcan> cutely() {
        return impassible();
    }

    public final Set<oilcan> formularize() {
        return this.f31318saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public List<clubfoot> getParameters() {
        return adultoid.formularize();
    }

    public final String kowloon() {
        return '[' + CollectionsKt.preterite(this.f31318saneness, ",", null, null, 0, null, new Function1<oilcan, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$valueToString$1
            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(oilcan it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        }, 30, null) + ']';
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public boolean marial() {
        return false;
    }

    public String toString() {
        return "IntegerLiteralType" + kowloon();
    }

    public final boolean triweekly() {
        Collection<oilcan> collectionAttabal = polloi.attabal(this.f31316attabal);
        if ((collectionAttabal instanceof Collection) && collectionAttabal.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionAttabal.iterator();
        while (it.hasNext()) {
            if (this.f31318saneness.contains((oilcan) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront wireman() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntegerLiteralTypeConstructor(long j, trm trmVar, Set<? extends oilcan> set) {
        this.f31317dern = KotlinTypeFactory.marial(overspeculate.f31797arytenoidectomy.taiyuan(), this, false);
        this.f31319wireman = saneness.saneness(new Function0<List<merc>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$supertypes$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<merc> invoke() {
                merc mercVarImpassible = this.this$0.apical().rotuma().impassible();
                Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
                List<merc> listPolloi = adultoid.polloi(coffeecake.beachfront(mercVarImpassible, graveside.marial(new treadless(Variance.IN_VARIANCE, this.this$0.f31317dern)), null, 2, null));
                if (!this.this$0.triweekly()) {
                    listPolloi.add(this.this$0.apical().seminary());
                }
                return listPolloi;
            }
        });
        this.value = j;
        this.f31316attabal = trmVar;
        this.f31318saneness = set;
    }
}
