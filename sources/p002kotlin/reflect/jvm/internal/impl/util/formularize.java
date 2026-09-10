package p002kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class formularize implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final formularize f31855attabal = new formularize();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f31856saneness = "should not have varargs or parameters with default values";

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String attabal(dovishness dovishnessVar) {
        return beachfront.attabal.attabal(this, dovishnessVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String getDescription() {
        return f31856saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public boolean saneness(dovishness functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        List<cultivated> listBeachfront = functionDescriptor.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        List<cultivated> list = listBeachfront;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (cultivated cultivatedVar : list) {
            Intrinsics.beachfront(cultivatedVar);
            if (DescriptorUtilsKt.dern(cultivatedVar) || cultivatedVar.wostteth() != null) {
                return false;
            }
        }
        return true;
    }
}
