package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class GeneratorSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f44666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f44667b;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44668Y = -2;

        public AnonymousClass1() {
        }

        public final void a() {
            Object objInvoke;
            int i2 = this.f44668Y;
            GeneratorSequence generatorSequence = GeneratorSequence.this;
            if (i2 == -2) {
                objInvoke = generatorSequence.f44666a.invoke();
            } else {
                Function1 function1 = generatorSequence.f44667b;
                Object obj = this.X;
                Intrinsics.c(obj);
                objInvoke = function1.invoke(obj);
            }
            this.X = objInvoke;
            this.f44668Y = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f44668Y < 0) {
                a();
            }
            return this.f44668Y == 1;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f44668Y < 0) {
                a();
            }
            if (this.f44668Y == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.X;
            Intrinsics.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f44668Y = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public GeneratorSequence(Function0 function0, Function1 function1) {
        this.f44666a = function0;
        this.f44667b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
