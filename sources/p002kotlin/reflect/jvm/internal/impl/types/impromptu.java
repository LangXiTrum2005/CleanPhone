package p002kotlin.reflect.jvm.internal.impl.types;

import kurbash.wireman;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;

/* JADX INFO: compiled from: AnnotationsTypeAttribute.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu extends mathsort<impromptu> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final marial f31775attabal;

    public impromptu(marial annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f31775attabal = annotations;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.mathsort
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public impromptu dern(impromptu impromptuVar) {
        if (Intrinsics.wireman(impromptuVar, this)) {
            return this;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof impromptu) {
            return Intrinsics.wireman(((impromptu) obj).f31775attabal, this.f31775attabal);
        }
        return false;
    }

    public int hashCode() {
        return this.f31775attabal.hashCode();
    }

    public final marial marial() {
        return this.f31775attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.mathsort
    public wireman<? extends impromptu> saneness() {
        return polloi.saneness(impromptu.class);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.mathsort
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public impromptu attabal(impromptu impromptuVar) {
        return impromptuVar == null ? this : new impromptu(competently.attabal(this.f31775attabal, impromptuVar.f31775attabal));
    }
}
