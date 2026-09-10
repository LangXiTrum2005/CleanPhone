package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import byname.dern;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnnotationsImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront implements marial {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final List<dern> f29946kowloon;

    /* JADX WARN: Multi-variable type inference failed */
    public beachfront(List<? extends dern> annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f29946kowloon = annotations;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public dern attabal(dern dernVar) {
        return marial.saneness.attabal(this, dernVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean isEmpty() {
        return this.f29946kowloon.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<dern> iterator() {
        return this.f29946kowloon.iterator();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean restrictive(dern dernVar) {
        return marial.saneness.saneness(this, dernVar);
    }

    public String toString() {
        return this.f29946kowloon.toString();
    }
}
