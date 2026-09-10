package kotlin.coroutines;

import com.p004ironsource.d9;
import com.startapp.sdk.components.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0007J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CombinedContext implements CoroutineContext, Serializable {
    public final CoroutineContext X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final CoroutineContext.Element f43290Y;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        public final CoroutineContext[] X;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public Serialized(CoroutineContext[] coroutineContextArr) {
            this.X = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext coroutineContextPlus = EmptyCoroutineContext.X;
            for (CoroutineContext coroutineContext : this.X) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }
    }

    public CombinedContext(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.f(left, "left");
        Intrinsics.f(element, "element");
        this.X = left;
        this.f43290Y = element;
    }

    private final Object writeReplace() {
        int iD = d();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[iD];
        final Ref.IntRef intRef = new Ref.IntRef();
        fold(Unit.f43263a, new Function2() { // from class: kotlin.coroutines.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.f((Unit) obj, "<unused var>");
                Intrinsics.f(element, "element");
                Ref.IntRef intRef2 = intRef;
                int i2 = intRef2.X;
                intRef2.X = i2 + 1;
                coroutineContextArr[i2] = element;
                return Unit.f43263a;
            }
        });
        if (intRef.X == iD) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int d() {
        int i2 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.X;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i2;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.d() == d()) {
                CombinedContext combinedContext2 = this;
                while (true) {
                    CoroutineContext.Element element = combinedContext2.f43290Y;
                    if (!Intrinsics.a(combinedContext.get(element.getX()), element)) {
                        zA = false;
                        break;
                    }
                    CoroutineContext coroutineContext = combinedContext2.X;
                    if (!(coroutineContext instanceof CombinedContext)) {
                        Intrinsics.d(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                        zA = Intrinsics.a(combinedContext.get(element2.getX()), element2);
                        break;
                    }
                    combinedContext2 = (CombinedContext) coroutineContext;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.X.fold(obj, function2), this.f43290Y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        Intrinsics.f(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext.Element element = combinedContext.f43290Y.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = combinedContext.X;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.get(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f43290Y.hashCode() + this.X.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        Intrinsics.f(key, "key");
        CoroutineContext.Element element = this.f43290Y;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.X;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        if (coroutineContextMinusKey == coroutineContext) {
            return this;
        }
        return coroutineContextMinusKey == EmptyCoroutineContext.X ? element : new CombinedContext(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.f(context, "context");
        return context == EmptyCoroutineContext.X ? this : (CoroutineContext) context.fold(this, new e(2));
    }

    public final String toString() {
        return androidx.media3.extractor.text.ttml.a.p(new StringBuilder(d9.i.d), (String) fold("", new e(1)), AbstractJsonLexerKt.END_LIST);
    }
}
