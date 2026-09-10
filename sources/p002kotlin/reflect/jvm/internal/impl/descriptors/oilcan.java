package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.marial;
import java.util.List;
import java.util.Map;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import presbytery.impromptu;

/* JADX INFO: compiled from: MultiFieldValueClassRepresentation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class oilcan<Type extends impromptu> extends dent<Type> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<Pair<marial, Type>> f30198attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<marial, Type> f30199saneness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oilcan(List<? extends Pair<marial, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f30198attabal = underlyingPropertyNamesToTypes;
        Map<marial, Type> mapDovishness = seminary.dovishness(saneness());
        if (mapDovishness.size() != saneness().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f30199saneness = mapDovishness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dent
    public boolean attabal(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f30199saneness.containsKey(name);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dent
    public List<Pair<marial, Type>> saneness() {
        return this.f30198attabal;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + saneness() + ')';
    }
}
