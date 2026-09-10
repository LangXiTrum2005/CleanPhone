package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public interface TypeConstructor extends TypeConstructorMarker {
    ClassifierDescriptor c();

    Collection d();

    boolean e();

    List getParameters();

    KotlinBuiltIns k();
}
