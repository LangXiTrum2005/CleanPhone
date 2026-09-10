package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DelimitedRangesSequence implements Sequence<IntRange> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f44696c;

    /* JADX INFO: renamed from: kotlin.text.DelimitedRangesSequence$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<IntRange>, KMappedMarker {
        public int X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44697Y;
        public int Z;
        public IntRange e0;
        public int f0;

        public AnonymousClass1() {
            DelimitedRangesSequence.this.getClass();
            int iB = RangesKt.b(0, 0, DelimitedRangesSequence.this.f44694a.length());
            this.f44697Y = iB;
            this.Z = iB;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x006f  */
        public final void a() {
            Pair pair;
            int i2 = this.Z;
            if (i2 < 0) {
                this.X = 0;
                this.e0 = null;
                return;
            }
            DelimitedRangesSequence delimitedRangesSequence = DelimitedRangesSequence.this;
            int i3 = delimitedRangesSequence.f44695b;
            String str = delimitedRangesSequence.f44694a;
            if (i3 > 0) {
                int i4 = this.f0 + 1;
                this.f0 = i4;
                if (i4 >= i3) {
                    this.e0 = new IntRange(this.f44697Y, StringsKt.t(str), 1);
                    this.Z = -1;
                } else if (i2 > str.length() && (pair = (Pair) delimitedRangesSequence.f44696c.invoke(str, Integer.valueOf(this.Z))) != null) {
                    int iIntValue = ((Number) pair.X).intValue();
                    int iIntValue2 = ((Number) pair.f43249Y).intValue();
                    this.e0 = RangesKt.e(this.f44697Y, iIntValue);
                    int i5 = iIntValue + iIntValue2;
                    this.f44697Y = i5;
                    this.Z = i5 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.e0 = new IntRange(this.f44697Y, StringsKt.t(str), 1);
                    this.Z = -1;
                }
            } else if (i2 > str.length()) {
                this.e0 = new IntRange(this.f44697Y, StringsKt.t(str), 1);
                this.Z = -1;
            } else {
                int iIntValue3 = ((Number) pair.X).intValue();
                int iIntValue4 = ((Number) pair.f43249Y).intValue();
                this.e0 = RangesKt.e(this.f44697Y, iIntValue3);
                int i6 = iIntValue3 + iIntValue4;
                this.f44697Y = i6;
                this.Z = i6 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.X = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.X == -1) {
                a();
            }
            return this.X == 1;
        }

        @Override // java.util.Iterator
        public final IntRange next() {
            if (this.X == -1) {
                a();
            }
            if (this.X == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.e0;
            Intrinsics.d(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.e0 = null;
            this.X = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public DelimitedRangesSequence(String input, int i2, Function2 function2) {
        Intrinsics.f(input, "input");
        this.f44694a = input;
        this.f44695b = i2;
        this.f44696c = function2;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF44671a() {
        return new AnonymousClass1();
    }
}
