package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class MultiFieldValueClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f43577b;

    public MultiFieldValueClassRepresentation(ArrayList arrayList) {
        this.f43576a = arrayList;
        Map mapP = MapsKt.p(arrayList);
        if (mapP.size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f43577b = mapP;
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f43576a + ')';
    }
}
