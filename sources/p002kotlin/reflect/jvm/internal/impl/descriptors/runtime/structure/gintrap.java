package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import genesic.rotuma;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaRecordComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class gintrap extends polloi implements genesic.gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f30252attabal;

    public gintrap(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.f30252attabal = recordComponent;
    }

    @Override // genesic.gintrap
    public rotuma getType() throws IllegalAccessException, InvocationTargetException {
        Class<?> clsWireman = attabal.f30227attabal.wireman(this.f30252attabal);
        if (clsWireman != null) {
            return new formularize(clsWireman);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.polloi
    public Member privatdozent() throws IllegalAccessException, InvocationTargetException {
        Method methodDern = attabal.f30227attabal.dern(this.f30252attabal);
        if (methodDern != null) {
            return methodDern;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // genesic.gintrap
    public boolean saneness() {
        return false;
    }
}
