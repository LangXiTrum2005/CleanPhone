package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* JADX INFO: loaded from: classes7.dex */
public interface TypeParameterDescriptor extends ClassifierDescriptor, TypeParameterMarker {
    StorageManager H();

    boolean L();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    TypeParameterDescriptor a();

    int g();

    List getUpperBounds();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    TypeConstructor h();

    Variance j();

    boolean t();
}
