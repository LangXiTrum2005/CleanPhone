package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public interface AnnotationDescriptor {

    public static final class DefaultImpls {
    }

    Map a();

    FqName c();

    SourceElement f();

    KotlinType getType();
}
