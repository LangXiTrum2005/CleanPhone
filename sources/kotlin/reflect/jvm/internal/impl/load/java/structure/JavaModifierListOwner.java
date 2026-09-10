package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: loaded from: classes7.dex */
public interface JavaModifierListOwner extends JavaElement {
    boolean f();

    Visibility getVisibility();

    boolean isAbstract();

    boolean isFinal();
}
