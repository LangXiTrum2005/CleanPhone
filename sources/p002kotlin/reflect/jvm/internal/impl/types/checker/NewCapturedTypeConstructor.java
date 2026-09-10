package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.saneness;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NewCapturedTypeConstructor implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final timberyard f31708attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final NewCapturedTypeConstructor f31709dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final taiyuan f31710marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Function0<? extends List<? extends empress>> f31711saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final clubfoot f31712wireman;

    public NewCapturedTypeConstructor(timberyard projection, Function0<? extends List<? extends empress>> function0, NewCapturedTypeConstructor newCapturedTypeConstructor, clubfoot clubfootVar) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f31708attabal = projection;
        this.f31711saneness = function0;
        this.f31709dern = newCapturedTypeConstructor;
        this.f31712wireman = clubfootVar;
        this.f31710marial = p002kotlin.saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<List<? extends empress>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$_supertypes$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends empress> invoke() {
                Function0 function1 = this.this$0.f31711saneness;
                if (function1 != null) {
                    return (List) function1.invoke();
                }
                return null;
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public beachfront apical() {
        oilcan type = dern().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return TypeUtilsKt.taiyuan(type);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public List<empress> cutely() {
        List<empress> listImpromptu = impromptu();
        return listImpromptu == null ? adultoid.formularize() : listImpromptu;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.saneness
    public timberyard dern() {
        return this.f31708attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.wireman(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.competently(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f31709dern;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f31709dern;
        if (newCapturedTypeConstructor3 != null) {
            newCapturedTypeConstructor = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == newCapturedTypeConstructor;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor attabal(final beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        timberyard timberyardVarAttabal = dern().attabal(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(timberyardVarAttabal, "refine(...)");
        Function0<List<? extends empress>> function0 = this.f31711saneness != null ? new Function0<List<? extends empress>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$refine$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends empress> invoke() {
                List<empress> listCutely = this.this$0.cutely();
                beachfront beachfrontVar = kotlinTypeRefiner;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(listCutely, 10));
                Iterator<T> it = listCutely.iterator();
                while (it.hasNext()) {
                    arrayList.add(((empress) it.next()).libyan(beachfrontVar));
                }
                return arrayList;
            }
        } : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f31709dern;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(timberyardVarAttabal, function0, newCapturedTypeConstructor, this.f31712wireman);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public List<clubfoot> getParameters() {
        return adultoid.formularize();
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f31709dern;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    public final List<empress> impromptu() {
        return (List) this.f31710marial.getValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public boolean marial() {
        return false;
    }

    public final void taiyuan(final List<? extends empress> supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        this.f31711saneness = new Function0<List<? extends empress>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$initializeSupertypes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends empress> invoke() {
                return supertypes;
            }
        };
    }

    public String toString() {
        return "CapturedType(" + dern() + ')';
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront wireman() {
        return null;
    }

    public /* synthetic */ NewCapturedTypeConstructor(timberyard timberyardVar, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, clubfoot clubfootVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timberyardVar, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : clubfootVar);
    }

    public /* synthetic */ NewCapturedTypeConstructor(timberyard timberyardVar, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timberyardVar, list, (i & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(timberyard projection, final List<? extends empress> supertypes, NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(projection, new Function0<List<? extends empress>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends empress> invoke() {
                return supertypes;
            }
        }, newCapturedTypeConstructor, null, 8, null);
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
    }
}
