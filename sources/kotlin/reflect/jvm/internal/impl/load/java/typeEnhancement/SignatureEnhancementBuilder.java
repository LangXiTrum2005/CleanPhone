package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import androidx.room.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes7.dex */
final class SignatureEnhancementBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f43945a = new LinkedHashMap();

    public final class ClassEnhancementBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SignatureEnhancementBuilder f43947b;

        public final class FunctionEnhancementBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f43948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ArrayList f43949b = new ArrayList();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Pair f43950c = new Pair("V", null);

            public FunctionEnhancementBuilder(ClassEnhancementBuilder classEnhancementBuilder, String str) {
                this.f43948a = str;
            }

            public final void a(String type, JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                Intrinsics.f(type, "type");
                ArrayList arrayList = this.f43949b;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    IndexingIterable indexingIterable = new IndexingIterable(new c(javaTypeQualifiersArr, 6));
                    int iH = MapsKt.h(CollectionsKt.n(indexingIterable, 10));
                    if (iH < 16) {
                        iH = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                    Iterator it = indexingIterable.iterator();
                    while (true) {
                        IndexingIterator indexingIterator = (IndexingIterator) it;
                        if (!indexingIterator.X.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.f43274a), (JavaTypeQualifiers) indexedValue.f43275b);
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                arrayList.add(new Pair(type, typeEnhancementInfo));
            }

            public final void b(String type, JavaTypeQualifiers... javaTypeQualifiersArr) {
                Intrinsics.f(type, "type");
                IndexingIterable indexingIterable = new IndexingIterable(new c(javaTypeQualifiersArr, 6));
                int iH = MapsKt.h(CollectionsKt.n(indexingIterable, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                Iterator it = indexingIterable.iterator();
                while (true) {
                    IndexingIterator indexingIterator = (IndexingIterator) it;
                    if (!indexingIterator.X.hasNext()) {
                        this.f43950c = new Pair(type, new TypeEnhancementInfo(linkedHashMap));
                        return;
                    } else {
                        IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.f43274a), (JavaTypeQualifiers) indexedValue.f43275b);
                    }
                }
            }

            public final void c(JvmPrimitiveType type) {
                Intrinsics.f(type, "type");
                String strD = type.d();
                Intrinsics.e(strD, "type.desc");
                this.f43950c = new Pair(strD, null);
            }
        }

        public ClassEnhancementBuilder(SignatureEnhancementBuilder signatureEnhancementBuilder, String className) {
            Intrinsics.f(className, "className");
            this.f43947b = signatureEnhancementBuilder;
            this.f43946a = className;
        }

        public final void a(String str, Function1 function1) {
            LinkedHashMap linkedHashMap = this.f43947b.f43945a;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str);
            function1.invoke(functionEnhancementBuilder);
            ArrayList arrayList = functionEnhancementBuilder.f43949b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) it.next()).X);
            }
            String strF = SignatureBuildingComponents.f(this.f43946a, SignatureBuildingComponents.e(functionEnhancementBuilder.f43948a, (String) functionEnhancementBuilder.f43950c.X, arrayList2));
            TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) functionEnhancementBuilder.f43950c.f43249Y;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((TypeEnhancementInfo) ((Pair) it2.next()).f43249Y);
            }
            linkedHashMap.put(strF, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList3));
        }
    }
}
