package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    boolean C();

    FqName c();

    Collection d();

    ArrayList g();

    Collection getFields();

    Collection i();

    boolean k();

    ReflectJavaClass l();

    boolean m();

    boolean p();

    boolean r();

    Collection t();

    Collection v();

    Collection w();
}
