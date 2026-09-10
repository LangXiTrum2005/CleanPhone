package p002kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.ranges.wireman;
import p002kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R4\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/text/saneness;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "", "input", "", "startIndex", "limit", "Lkotlin/Function2;", "Lkotlin/Pair;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "", "iterator", "()Ljava/util/Iterator;", "attabal", "Ljava/lang/CharSequence;", "saneness", "I", "dern", "wireman", "Lkotlin/jvm/functions/Function2;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness implements Sequence<IntRange> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final CharSequence input;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int limit;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int startIndex;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> getNextMatch;

    /* JADX INFO: compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u0006%"}, d2 = {"kotlin/text/saneness$attabal", "", "Lkotlin/ranges/IntRange;", "", "saneness", "()V", "wireman", "()Lkotlin/ranges/IntRange;", "", "hasNext", "()Z", "", "kowloon", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "arytenoidectomy", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "monoploid", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "polloi", "Lkotlin/ranges/IntRange;", "getNextItem", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextItem", "molybdenite", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Iterator<IntRange>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int currentStartIndex;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public int nextState = -1;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public int counter;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public int nextSearchIndex;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public IntRange nextItem;

        public attabal() {
            int iApical = wireman.apical(saneness.this.startIndex, 0, saneness.this.input.length());
            this.currentStartIndex = iApical;
            this.nextSearchIndex = iApical;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void saneness() {
            Pair pair;
            if (this.nextSearchIndex < 0) {
                this.nextState = 0;
                this.nextItem = null;
                return;
            }
            if (saneness.this.limit > 0) {
                int i = this.counter + 1;
                this.counter = i;
                if (i >= saneness.this.limit) {
                    this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.milliradian(saneness.this.input));
                    this.nextSearchIndex = -1;
                } else if (this.nextSearchIndex > saneness.this.input.length() && (pair = (Pair) saneness.this.getNextMatch.invoke(saneness.this.input, Integer.valueOf(this.nextSearchIndex))) != null) {
                    int iIntValue = ((Number) pair.component1()).intValue();
                    int iIntValue2 = ((Number) pair.component2()).intValue();
                    this.nextItem = wireman.monoploid(this.currentStartIndex, iIntValue);
                    int i2 = iIntValue + iIntValue2;
                    this.currentStartIndex = i2;
                    this.nextSearchIndex = i2 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.milliradian(saneness.this.input));
                    this.nextSearchIndex = -1;
                }
            } else if (this.nextSearchIndex > saneness.this.input.length()) {
                this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.milliradian(saneness.this.input));
                this.nextSearchIndex = -1;
            } else {
                int iIntValue3 = ((Number) pair.component1()).intValue();
                int iIntValue4 = ((Number) pair.component2()).intValue();
                this.nextItem = wireman.monoploid(this.currentStartIndex, iIntValue3);
                int i3 = iIntValue3 + iIntValue4;
                this.currentStartIndex = i3;
                this.nextSearchIndex = i3 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.nextState = 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                saneness();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.nextState == -1) {
                saneness();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.nextItem;
            Intrinsics.competently(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.nextItem = null;
            this.nextState = -1;
            return intRange;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public saneness(CharSequence input, int i, int i2, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = i;
        this.limit = i2;
        this.getNextMatch = getNextMatch;
    }

    @Override // p002kotlin.sequences.Sequence
    public Iterator<IntRange> iterator() {
        return new attabal();
    }
}
