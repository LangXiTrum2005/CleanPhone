package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes7.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaClass f43850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lambda f43851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f43852c;
    public final LinkedHashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f43853e;
    public final LinkedHashMap f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public ClassDeclaredMemberIndex(JavaClass jClass, Function1 function1) {
        Intrinsics.f(jClass, "jClass");
        this.f43850a = jClass;
        this.f43851b = (Lambda) function1;
        Function1<JavaMethod, Boolean> function2 = new Function1<JavaMethod, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0096  */
            /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
            /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                boolean zIsEmpty;
                JavaMethod m = (JavaMethod) obj;
                Intrinsics.f(m, "m");
                boolean z3 = false;
                if (((Boolean) this.X.f43851b.invoke(m)).booleanValue()) {
                    if (m.j().f43703a.isInterface()) {
                        String strB = m.getName().b();
                        int iHashCode = strB.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) m.e()).isEmpty();
                                }
                            } else if (strB.equals("equals")) {
                                JavaValueParameter javaValueParameter = (JavaValueParameter) CollectionsKt.Y(m.e());
                                JavaType type = javaValueParameter != null ? javaValueParameter.getType() : null;
                                JavaClassifierType javaClassifierType = type instanceof JavaClassifierType ? (JavaClassifierType) type : null;
                                if (javaClassifierType != null) {
                                    JavaClassifier classifier = javaClassifierType.getClassifier();
                                    if ((classifier instanceof JavaClass) && ((JavaClass) classifier).c().b().equals("java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB.equals("toString")) {
                            zIsEmpty = ((ArrayList) m.e()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            }
        };
        this.f43852c = function2;
        FilteringSequence filteringSequenceG = SequencesKt.g(CollectionsKt.k(jClass.v()), function2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            Object next = anonymousClass1.next();
            Name name = ((JavaMethod) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        FilteringSequence filteringSequenceG2 = SequencesKt.g(CollectionsKt.k(this.f43850a.getFields()), this.f43851b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        FilteringSequence.AnonymousClass1 anonymousClass2 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass2.hasNext()) {
            Object next2 = anonymousClass2.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.f43853e = linkedHashMap2;
        ArrayList arrayListG = this.f43850a.g();
        ?? r5 = this.f43851b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListG) {
            if (((Boolean) r5.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iH = MapsKt.h(CollectionsKt.n(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj2).getName(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final Set a() {
        FilteringSequence filteringSequenceG = SequencesKt.g(CollectionsKt.k(this.f43850a.v()), this.f43852c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            linkedHashSet.add(((JavaMethod) anonymousClass1.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final Set b() {
        return this.f.keySet();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final Set c() {
        FilteringSequence filteringSequenceG = SequencesKt.g(CollectionsKt.k(this.f43850a.getFields()), this.f43851b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            linkedHashSet.add(((JavaField) anonymousClass1.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final Collection d(Name name) {
        Intrinsics.f(name, "name");
        List list = (List) this.d.get(name);
        return list != null ? list : EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final JavaRecordComponent e(Name name) {
        Intrinsics.f(name, "name");
        return (JavaRecordComponent) this.f.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public final JavaField f(Name name) {
        Intrinsics.f(name, "name");
        return (JavaField) this.f43853e.get(name);
    }
}
