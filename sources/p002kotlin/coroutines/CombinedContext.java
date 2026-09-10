package p002kotlin.coroutines;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CombinedContext;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00011B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00002\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u000bJ\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0000H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100¨\u00062"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", TtmlNode.LEFT, "Lkotlin/coroutines/CoroutineContext$Element;", "element", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "", "impromptu", "()I", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "E", "Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "get", "(Lkotlin/coroutines/CoroutineContext$saneness;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$saneness;)Lkotlin/coroutines/CoroutineContext;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "beachfront", "(Lkotlin/coroutines/CoroutineContext$Element;)Z", "context", "competently", "(Lkotlin/coroutines/CombinedContext;)Z", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext$Element;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CombinedContext implements CoroutineContext, Serializable {
    private final CoroutineContext.Element element;
    private final CoroutineContext left;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "Lkotlin/coroutines/CoroutineContext;", "elements", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "", "readResolve", "()Ljava/lang/Object;", "[Lkotlin/coroutines/CoroutineContext;", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "Companion", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        public Serialized(CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContextPlus = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }

        public final CoroutineContext[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.left = left;
        this.element = element;
    }

    public static final Unit apical(CoroutineContext[] coroutineContextArr, Ref$IntRef ref$IntRef, Unit unit, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        Intrinsics.checkNotNullParameter(element, "element");
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        coroutineContextArr[i] = element;
        return Unit.f29295attabal;
    }

    private final int impromptu() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static final String taiyuan(String acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final Object writeReplace() {
        int iImpromptu = impromptu();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[iImpromptu];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(Unit.f29295attabal, new Function2() { // from class: wretchedly.attabal
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.apical(coroutineContextArr, ref$IntRef, (Unit) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (ref$IntRef.element == iImpromptu) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean beachfront(CoroutineContext.Element element) {
        return Intrinsics.wireman(get(element.getKey()), element);
    }

    public final boolean competently(CombinedContext context) {
        while (beachfront(context.element)) {
            CoroutineContext coroutineContext = context.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                Intrinsics.competently(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return beachfront((CoroutineContext.Element) coroutineContext);
            }
            context = (CombinedContext) coroutineContext;
        }
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombinedContext)) {
            return false;
        }
        CombinedContext combinedContext = (CombinedContext) other;
        return combinedContext.impromptu() == impromptu() && combinedContext.competently(this);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((Object) this.left.fold(initial, operation), this.element);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e = (E) combinedContext.element.get(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.get(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        CoroutineContext coroutineContextMinusKey = this.left.minusKey(key);
        if (coroutineContextMinusKey == this.left) {
            return this;
        }
        return coroutineContextMinusKey == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(coroutineContextMinusKey, this.element);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.attabal.saneness(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold("", new Function2() { // from class: wretchedly.saneness
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.taiyuan((String) obj, (CoroutineContext.Element) obj2);
            }
        })) + ']';
    }
}
