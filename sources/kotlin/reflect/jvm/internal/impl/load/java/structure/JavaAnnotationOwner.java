package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public interface JavaAnnotationOwner extends JavaElement {
    JavaAnnotation b(FqName fqName);

    Collection getAnnotations();
}
