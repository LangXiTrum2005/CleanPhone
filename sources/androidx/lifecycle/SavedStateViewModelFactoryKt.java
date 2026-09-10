package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SavedStateViewModelFactoryKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f5273a = CollectionsKt.I(Application.class, SavedStateHandle.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f5274b = CollectionsKt.H(SavedStateHandle.class);

    public static final Constructor a(Class cls, List signature) {
        Intrinsics.f(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        Intrinsics.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.e(parameterTypes, "constructor.parameterTypes");
            List listM = ArraysKt.M(parameterTypes);
            if (signature.equals(listM)) {
                return constructor;
            }
            if (signature.size() == listM.size() && listM.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final ViewModel b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "Failed to access "), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "An exception happened in constructor of "), e4.getCause());
        }
    }
}
