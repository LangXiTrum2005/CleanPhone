package p002kotlin.reflect.jvm.internal.impl.util;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ReturnsCheck implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Function1<beachfront, oilcan> f31834attabal;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f31835saneness;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsBoolean extends ReturnsCheck {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final ReturnsBoolean f31836dern = new ReturnsBoolean();

        public ReturnsBoolean() {
            super("Boolean", new Function1<beachfront, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.1
                @Override // p002kotlin.jvm.functions.Function1
                public final oilcan invoke(beachfront beachfrontVar) {
                    Intrinsics.checkNotNullParameter(beachfrontVar, "$this$null");
                    merc mercVarTriweekly = beachfrontVar.triweekly();
                    Intrinsics.checkNotNullExpressionValue(mercVarTriweekly, "getBooleanType(...)");
                    return mercVarTriweekly;
                }
            }, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsInt extends ReturnsCheck {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final ReturnsInt f31837dern = new ReturnsInt();

        public ReturnsInt() {
            super("Int", new Function1<beachfront, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt.1
                @Override // p002kotlin.jvm.functions.Function1
                public final oilcan invoke(beachfront beachfrontVar) {
                    Intrinsics.checkNotNullParameter(beachfrontVar, "$this$null");
                    merc mercVarOilcan = beachfrontVar.oilcan();
                    Intrinsics.checkNotNullExpressionValue(mercVarOilcan, "getIntType(...)");
                    return mercVarOilcan;
                }
            }, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsUnit extends ReturnsCheck {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final ReturnsUnit f31838dern = new ReturnsUnit();

        public ReturnsUnit() {
            super("Unit", new Function1<beachfront, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit.1
                @Override // p002kotlin.jvm.functions.Function1
                public final oilcan invoke(beachfront beachfrontVar) {
                    Intrinsics.checkNotNullParameter(beachfrontVar, "$this$null");
                    merc mercVarPermissivist = beachfrontVar.permissivist();
                    Intrinsics.checkNotNullExpressionValue(mercVarPermissivist, "getUnitType(...)");
                    return mercVarPermissivist;
                }
            }, null);
        }
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String attabal(dovishness dovishnessVar) {
        return beachfront.attabal.attabal(this, dovishnessVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String getDescription() {
        return this.f31835saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public boolean saneness(dovishness functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.wireman(functionDescriptor.getReturnType(), this.f31834attabal.invoke(DescriptorUtilsKt.cutely(functionDescriptor)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnsCheck(String str, Function1<? super beachfront, ? extends oilcan> function1) {
        this.name = str;
        this.f31834attabal = function1;
        this.f31835saneness = "must return " + str;
    }
}
