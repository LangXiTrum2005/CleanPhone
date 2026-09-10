package p002kotlin.reflect.jvm.internal.impl.util;

import byname.marial;
import java.util.Arrays;
import java.util.Collection;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.text.Regex;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Checks {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Regex f31828attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Function1<dovishness, String> f31829dern;
    private final marial name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Collection<marial> f31830saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final beachfront[] f31831wireman;

    /* JADX WARN: Multi-variable type inference failed */
    public Checks(marial marialVar, Regex regex, Collection<marial> collection2, Function1<? super dovishness, String> function1, beachfront... beachfrontVarArr) {
        this.name = marialVar;
        this.f31828attabal = regex;
        this.f31830saneness = collection2;
        this.f31829dern = function1;
        this.f31831wireman = beachfrontVarArr;
    }

    public final competently attabal(dovishness functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (beachfront beachfrontVar : this.f31831wireman) {
            String strAttabal = beachfrontVar.attabal(functionDescriptor);
            if (strAttabal != null) {
                return new competently.saneness(strAttabal);
            }
        }
        String strInvoke = this.f31829dern.invoke(functionDescriptor);
        return strInvoke != null ? new competently.saneness(strInvoke) : competently.dern.f31850saneness;
    }

    public final boolean saneness(dovishness functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        if (this.name != null && !Intrinsics.wireman(functionDescriptor.getName(), this.name)) {
            return false;
        }
        if (this.f31828attabal != null) {
            String strDern = functionDescriptor.getName().dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            if (!this.f31828attabal.matches(strDern)) {
                return false;
            }
        }
        Collection<marial> collection2 = this.f31830saneness;
        return collection2 == null || collection2.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(marial marialVar, beachfront[] beachfrontVarArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(marialVar, beachfrontVarArr, (Function1<? super dovishness, String>) ((i & 4) != 0 ? new Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.2
            @Override // p002kotlin.jvm.functions.Function1
            public final Void invoke(dovishness dovishnessVar) {
                Intrinsics.checkNotNullParameter(dovishnessVar, "$this$null");
                return null;
            }
        } : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(marial name, beachfront[] checks, Function1<? super dovishness, String> additionalChecks) {
        this(name, (Regex) null, (Collection<marial>) null, additionalChecks, (beachfront[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Regex regex, beachfront[] beachfrontVarArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, beachfrontVarArr, (Function1<? super dovishness, String>) ((i & 4) != 0 ? new Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.3
            @Override // p002kotlin.jvm.functions.Function1
            public final Void invoke(dovishness dovishnessVar) {
                Intrinsics.checkNotNullParameter(dovishnessVar, "$this$null");
                return null;
            }
        } : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Regex regex, beachfront[] checks, Function1<? super dovishness, String> additionalChecks) {
        this((marial) null, regex, (Collection<marial>) null, additionalChecks, (beachfront[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Collection collection2, beachfront[] beachfrontVarArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<marial>) collection2, beachfrontVarArr, (Function1<? super dovishness, String>) ((i & 4) != 0 ? new Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.4
            @Override // p002kotlin.jvm.functions.Function1
            public final Void invoke(dovishness dovishnessVar) {
                Intrinsics.checkNotNullParameter(dovishnessVar, "$this$null");
                return null;
            }
        } : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Collection<marial> nameList, beachfront[] checks, Function1<? super dovishness, String> additionalChecks) {
        this((marial) null, (Regex) null, nameList, additionalChecks, (beachfront[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }
}
