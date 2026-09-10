package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import genesic.marial;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan extends marial implements marial {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object[] f30264saneness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taiyuan(byname.marial marialVar, Object[] values) {
        super(marialVar, null);
        Intrinsics.checkNotNullParameter(values, "values");
        this.f30264saneness = values;
    }

    @Override // genesic.marial
    public List<marial> dern() {
        Object[] objArr = this.f30264saneness;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            marial.attabal attabalVar = marial.f30254attabal;
            Intrinsics.beachfront(obj);
            arrayList.add(attabalVar.attabal(obj, null));
        }
        return arrayList;
    }
}
