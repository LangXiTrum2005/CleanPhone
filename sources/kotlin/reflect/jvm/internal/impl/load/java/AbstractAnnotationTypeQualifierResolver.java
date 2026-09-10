package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f43722c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaTypeEnhancementState f43723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f43724b;

    public static final class Companion {
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String str = annotationQualifierApplicabilityType.X;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, annotationQualifierApplicabilityType);
            }
        }
        f43722c = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.f(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f43723a = javaTypeEnhancementState;
        this.f43724b = new ConcurrentHashMap();
    }

    public abstract ArrayList a(Object obj, boolean z2);

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    public final JavaTypeQualifiersByElementType b(JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, Iterable annotations) {
        boolean z2;
        JavaDefaultQualifiers javaDefaultQualifiers;
        ReportLevel reportLevelJ;
        JavaDefaultQualifiers javaDefaultQualifiers2;
        Object objD;
        Object next;
        Pair pair;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusC;
        Intrinsics.f(annotations, "annotations");
        JavaTypeEnhancementState javaTypeEnhancementState = this.f43723a;
        if (!javaTypeEnhancementState.f43757c) {
            ArrayList<JavaDefaultQualifiers> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (true) {
                z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                ReportLevel reportLevel = ReportLevel.WARN;
                ReportLevel reportLevel2 = ReportLevel.IGNORE;
                JavaDefaultQualifiers javaDefaultQualifiers3 = null;
                if (javaTypeEnhancementState.f43757c || (javaDefaultQualifiers = (JavaDefaultQualifiers) AnnotationQualifiersFqNamesKt.g.get(e(next2))) == null) {
                    javaDefaultQualifiers2 = null;
                } else {
                    FqName fqNameE = e(next2);
                    if (fqNameE == null || !AnnotationQualifiersFqNamesKt.f.containsKey(fqNameE)) {
                        reportLevelJ = j(next2);
                        if (reportLevelJ == null) {
                            reportLevelJ = javaTypeEnhancementState.f43755a.f43759a;
                        }
                    } else {
                        reportLevelJ = (ReportLevel) JavaTypeEnhancementState$Companion$DEFAULT$1.X.invoke(fqNameE);
                    }
                    if (reportLevelJ == reportLevel2) {
                        reportLevelJ = null;
                    }
                    if (reportLevelJ == null) {
                        javaDefaultQualifiers2 = null;
                    } else {
                        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusA = NullabilityQualifierWithMigrationStatus.a(javaDefaultQualifiers.f43743a, null, reportLevelJ == reportLevel, 1);
                        Collection qualifierApplicabilityTypes = javaDefaultQualifiers.f43744b;
                        Intrinsics.f(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
                        javaDefaultQualifiers2 = new JavaDefaultQualifiers(nullabilityQualifierWithMigrationStatusA, qualifierApplicabilityTypes, javaDefaultQualifiers.f43745c);
                    }
                }
                if (javaDefaultQualifiers2 != null) {
                    javaDefaultQualifiers3 = javaDefaultQualifiers2;
                } else {
                    if (javaTypeEnhancementState.f43755a.f43762e || (objD = d(next2, AnnotationQualifiersFqNamesKt.f43728c)) == null) {
                        pair = null;
                    } else {
                        Iterator it2 = g(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (k(next) == null);
                        if (next == null) {
                            pair = null;
                        } else {
                            ArrayList arrayListA = a(objD, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) f43722c.get((String) it3.next());
                                if (annotationQualifierApplicabilityType != null) {
                                    linkedHashSet.add(annotationQualifierApplicabilityType);
                                }
                            }
                            if (linkedHashSet.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
                                linkedHashSet = SetsKt.f(SetsKt.d(ArraysKt.O(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            pair = new Pair(next, linkedHashSet);
                        }
                    }
                    if (pair != null) {
                        Set set = (Set) pair.f43249Y;
                        ReportLevel reportLevelJ2 = j(next2);
                        Object obj = pair.X;
                        if (reportLevelJ2 == null && (reportLevelJ2 = j(obj)) == null) {
                            reportLevelJ2 = javaTypeEnhancementState.f43755a.f43759a;
                        }
                        reportLevelJ2.getClass();
                        if (reportLevelJ2 != reportLevel2 && (nullabilityQualifierWithMigrationStatusC = c(AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1.X, obj)) != null) {
                            javaDefaultQualifiers3 = new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.a(nullabilityQualifierWithMigrationStatusC, null, reportLevelJ2 == reportLevel, 1), set);
                        }
                    }
                }
                if (javaDefaultQualifiers3 != null) {
                    arrayList.add(javaDefaultQualifiers3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = javaTypeQualifiersByElementType != null ? new EnumMap(javaTypeQualifiersByElementType.f43758a) : new EnumMap(AnnotationQualifierApplicabilityType.class);
                for (JavaDefaultQualifiers javaDefaultQualifiers4 : arrayList) {
                    Iterator it4 = javaDefaultQualifiers4.f43744b.iterator();
                    while (it4.hasNext()) {
                        enumMap.put((AnnotationQualifierApplicabilityType) it4.next(), javaDefaultQualifiers4);
                        z2 = true;
                    }
                }
                if (z2) {
                    return new JavaTypeQualifiersByElementType(enumMap);
                }
            }
        }
        return javaTypeQualifiersByElementType;
    }

    public final NullabilityQualifierWithMigrationStatus c(Function1 function1, Object obj) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusI;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusI2 = i(obj, ((Boolean) function1.invoke(obj)).booleanValue());
        if (nullabilityQualifierWithMigrationStatusI2 != null) {
            return nullabilityQualifierWithMigrationStatusI2;
        }
        Object objK = k(obj);
        if (objK != null) {
            ReportLevel reportLevelJ = j(obj);
            if (reportLevelJ == null) {
                reportLevelJ = this.f43723a.f43755a.f43759a;
            }
            reportLevelJ.getClass();
            if (reportLevelJ != ReportLevel.IGNORE && (nullabilityQualifierWithMigrationStatusI = i(objK, ((Boolean) function1.invoke(objK)).booleanValue())) != null) {
                return NullabilityQualifierWithMigrationStatus.a(nullabilityQualifierWithMigrationStatusI, null, reportLevelJ == ReportLevel.WARN, 1);
            }
        }
        return null;
    }

    public final Object d(Object obj, FqName fqName) {
        for (Object obj2 : g(obj)) {
            if (Intrinsics.a(e(obj2), fqName)) {
                return obj2;
            }
        }
        return null;
    }

    public abstract FqName e(Object obj);

    public abstract ClassDescriptor f(Object obj);

    public abstract Iterable g(Object obj);

    public final boolean h(Object obj, FqName fqName) {
        Iterable iterableG = g(obj);
        if ((iterableG instanceof Collection) && ((Collection) iterableG).isEmpty()) {
            return false;
        }
        Iterator it = iterableG.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(e(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r10.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r10.equals("UNKNOWN") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r10.equals("NEVER") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r10.equals("MAYBE") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r0.equals(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.m) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus i(java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.i(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    public final ReportLevel j(Object obj) {
        String str;
        JavaTypeEnhancementState javaTypeEnhancementState = this.f43723a;
        ReportLevel reportLevel = (ReportLevel) javaTypeEnhancementState.f43755a.f43761c.get(e(obj));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object objD = d(obj, AnnotationQualifiersFqNamesKt.d);
        if (objD == null || (str = (String) CollectionsKt.x(a(objD, false))) == null) {
            return null;
        }
        ReportLevel reportLevel2 = javaTypeEnhancementState.f43755a.f43760b;
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return ReportLevel.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return ReportLevel.WARN;
        }
        return null;
    }

    public final Object k(Object annotation) {
        Object objK;
        Intrinsics.f(annotation, "annotation");
        if (!this.f43723a.f43755a.f43762e) {
            if (CollectionsKt.o(AnnotationQualifiersFqNamesKt.f43730h, e(annotation)) || h(annotation, AnnotationQualifiersFqNamesKt.f43727b)) {
                return annotation;
            }
            if (h(annotation, AnnotationQualifiersFqNamesKt.f43726a)) {
                ConcurrentHashMap concurrentHashMap = this.f43724b;
                ClassDescriptor classDescriptorF = f(annotation);
                Object obj = concurrentHashMap.get(classDescriptorF);
                if (obj != null) {
                    return obj;
                }
                Iterator it = g(annotation).iterator();
                do {
                    if (!it.hasNext()) {
                        objK = null;
                        break;
                    }
                    objK = k(it.next());
                } while (objK == null);
                if (objK != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(classDescriptorF, objK);
                    return objPutIfAbsent == null ? objK : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
