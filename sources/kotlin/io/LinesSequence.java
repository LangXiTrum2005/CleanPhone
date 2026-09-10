package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class LinesSequence implements Sequence<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f43315a;

    /* JADX INFO: renamed from: kotlin.io.LinesSequence$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<String>, KMappedMarker {
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f43316Y;

        public AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.X == null && !this.f43316Y) {
                String line = LinesSequence.this.f43315a.readLine();
                this.X = line;
                if (line == null) {
                    this.f43316Y = true;
                }
            }
            return this.X != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.X;
            this.X = null;
            Intrinsics.c(str);
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public LinesSequence(BufferedReader bufferedReader) {
        this.f43315a = bufferedReader;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
