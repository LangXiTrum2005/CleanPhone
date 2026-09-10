package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class KClasses$isSubclassOf$1 extends PropertyReference1 {
    @Override // kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        KClass kClass = (KClass) obj;
        Intrinsics.f(kClass, "<this>");
        List listD = kClass.d();
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            KClassifier x = ((KType) it.next()).getX();
            KClass kClass2 = x instanceof KClass ? (KClass) x : null;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "superclasses";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.c(KClasses.class, "kotlin-reflection");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}
