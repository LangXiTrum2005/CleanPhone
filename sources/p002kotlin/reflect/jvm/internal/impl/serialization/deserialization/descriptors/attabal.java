package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kurbash.formularize;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: DeserializedAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public class attabal implements marial {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f31538arytenoidectomy = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(attabal.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final impromptu f31539kowloon;

    public attabal(yeast.formularize storageManager, Function0<? extends List<? extends dern>> compute) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f31539kowloon = storageManager.dern(compute);
    }

    private final List<dern> saneness() {
        return (List) apical.attabal(this.f31539kowloon, this, f31538arytenoidectomy[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public dern attabal(byname.dern dernVar) {
        return marial.saneness.attabal(this, dernVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean isEmpty() {
        return saneness().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<dern> iterator() {
        return saneness().iterator();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean restrictive(byname.dern dernVar) {
        return marial.saneness.saneness(this, dernVar);
    }
}
