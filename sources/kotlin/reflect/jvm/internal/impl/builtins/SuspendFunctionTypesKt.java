package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class SuspendFunctionTypesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MutableClassDescriptor f43508a;

    static {
        ErrorUtils errorUtils = ErrorUtils.f44590a;
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(ErrorUtils.f44591b, StandardNames.f43475e);
        Name nameF = StandardNames.f.f();
        StorageManager storageManager = LockBasedStorageManager.f44473e;
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(emptyPackageFragmentDescriptor, nameF, storageManager);
        mutableClassDescriptor.i0 = Modality.e0;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f43564e;
        if (descriptorVisibility == null) {
            MutableClassDescriptor.y0(9);
            throw null;
        }
        mutableClassDescriptor.j0 = descriptorVisibility;
        List listH = CollectionsKt.H(TypeParameterDescriptorImpl.J0(mutableClassDescriptor, Variance.IN_VARIANCE, Name.g(RequestConfiguration.MAX_AD_CONTENT_RATING_T), 0, (LockBasedStorageManager) storageManager));
        if (mutableClassDescriptor.l0 != null) {
            throw new IllegalStateException("Type parameters are already set for " + mutableClassDescriptor.getName());
        }
        ArrayList arrayList = new ArrayList(listH);
        mutableClassDescriptor.l0 = arrayList;
        mutableClassDescriptor.k0 = new ClassTypeConstructorImpl(mutableClassDescriptor, arrayList, mutableClassDescriptor.m0, (LockBasedStorageManager) mutableClassDescriptor.n0);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            MutableClassDescriptor.y0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ClassConstructorDescriptorImpl) ((FunctionDescriptor) it.next())).O0(mutableClassDescriptor.o());
        }
        f43508a = mutableClassDescriptor;
    }
}
