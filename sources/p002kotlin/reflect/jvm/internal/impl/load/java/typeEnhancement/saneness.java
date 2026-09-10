package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import byname.dern;
import java.util.Iterator;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness implements marial {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final dern f30651kowloon;

    public saneness(dern fqNameToMatch) {
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.f30651kowloon = fqNameToMatch;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern> iterator() {
        return adultoid.formularize().iterator();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean restrictive(dern dernVar) {
        return marial.saneness.saneness(this, dernVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public attabal attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (Intrinsics.wireman(fqName, this.f30651kowloon)) {
            return attabal.f30629attabal;
        }
        return null;
    }
}
