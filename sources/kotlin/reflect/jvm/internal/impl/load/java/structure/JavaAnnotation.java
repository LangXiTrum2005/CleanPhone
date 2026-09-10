package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes7.dex */
public interface JavaAnnotation extends JavaElement {
    ClassId a();

    ArrayList getArguments();

    ReflectJavaClass q();
}
