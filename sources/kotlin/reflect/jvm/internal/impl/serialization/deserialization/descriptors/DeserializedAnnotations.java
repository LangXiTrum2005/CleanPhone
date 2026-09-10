package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes7.dex */
public class DeserializedAnnotations implements Annotations {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f44445Y;
    public final NotNullLazyValue X;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f44445Y = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(DeserializedAnnotations.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public DeserializedAnnotations(LockBasedStorageManager storageManager, Function0 function0) {
        Intrinsics.f(storageManager, "storageManager");
        this.X = storageManager.a(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean E0(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor b(FqName fqName) {
        return Annotations.DefaultImpls.a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return ((List) StorageKt.a(this.X, f44445Y[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return ((List) StorageKt.a(this.X, f44445Y[0])).iterator();
    }
}
