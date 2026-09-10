package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.marial;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;
import presbytery.impromptu;

/* JADX INFO: compiled from: InlineClassRepresentation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class gintrap<Type extends impromptu> extends dent<Type> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final marial f29958attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Type f29959saneness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gintrap(marial underlyingPropertyName, Type underlyingType) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.f29958attabal = underlyingPropertyName;
        this.f29959saneness = underlyingType;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dent
    public boolean attabal(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.wireman(this.f29958attabal, name);
    }

    public final Type marial() {
        return this.f29959saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dent
    public List<Pair<marial, Type>> saneness() {
        return graveside.marial(formularize.attabal(this.f29958attabal, this.f29959saneness));
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f29958attabal + ", underlyingType=" + this.f29959saneness + ')';
    }

    public final marial wireman() {
        return this.f29958attabal;
    }
}
