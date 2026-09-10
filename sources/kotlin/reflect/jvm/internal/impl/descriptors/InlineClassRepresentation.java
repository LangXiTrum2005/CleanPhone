package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class InlineClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Name f43571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleTypeMarker f43572b;

    public InlineClassRepresentation(Name name, SimpleTypeMarker underlyingType) {
        Intrinsics.f(underlyingType, "underlyingType");
        this.f43571a = name;
        this.f43572b = underlyingType;
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f43571a + ", underlyingType=" + this.f43572b + ')';
    }
}
