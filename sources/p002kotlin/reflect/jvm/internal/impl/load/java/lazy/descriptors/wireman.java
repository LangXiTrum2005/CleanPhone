package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.marial;
import genesic.polloi;
import java.util.Collection;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: LazyJavaStaticScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class wireman extends LazyJavaScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wireman(p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman c) {
        super(c, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(c, "c");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public starveling cord() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void molybdenite(marial name, Collection<saran> result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public LazyJavaScope.attabal supplicat(polloi method, List<? extends clubfoot> methodTypeParameters, oilcan returnType, List<? extends cultivated> valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        return new LazyJavaScope.attabal(returnType, null, valueParameters, methodTypeParameters, false, adultoid.formularize());
    }
}
