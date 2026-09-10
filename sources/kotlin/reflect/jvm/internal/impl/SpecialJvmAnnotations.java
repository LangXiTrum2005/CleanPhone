package kotlin.reflect.jvm.internal.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class SpecialJvmAnnotations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f43453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ClassId f43454b;

    static {
        List listI = CollectionsKt.I(JvmAnnotationNames.f43765a, JvmAnnotationNames.f43769h, JvmAnnotationNames.f43770i, JvmAnnotationNames.f43767c, JvmAnnotationNames.d, JvmAnnotationNames.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ClassId.j((FqName) it.next()));
        }
        f43453a = linkedHashSet;
        f43454b = ClassId.j(JvmAnnotationNames.g);
    }
}
