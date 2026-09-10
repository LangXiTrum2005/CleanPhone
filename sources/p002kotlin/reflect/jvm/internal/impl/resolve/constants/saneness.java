package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public class saneness extends competently<List<? extends competently<?>>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Function1<trm, oilcan> f31330attabal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public saneness(List<? extends competently<?>> value, Function1<? super trm, ? extends oilcan> computeType) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(computeType, "computeType");
        this.f31330attabal = computeType;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public oilcan attabal(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        oilcan oilcanVarInvoke = this.f31330attabal.invoke(module);
        if (!beachfront.timberyard(oilcanVarInvoke) && !beachfront.preterite(oilcanVarInvoke)) {
            beachfront.herdbook(oilcanVarInvoke);
        }
        return oilcanVarInvoke;
    }
}
