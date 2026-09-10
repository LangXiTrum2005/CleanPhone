package interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.sequences.Sequence;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Linteraction/cutely;", "Lkotlin/sequences/Sequence;", "", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "", "iterator", "()Ljava/util/Iterator;", "attabal", "Ljava/io/BufferedReader;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cutely implements Sequence<String> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final BufferedReader reader;

    /* JADX INFO: compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"interaction/cutely$attabal", "", "", "", "hasNext", "()Z", "saneness", "()Ljava/lang/String;", "kowloon", "Ljava/lang/String;", "nextValue", "arytenoidectomy", "Z", "done", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Iterator<String>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public boolean done;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public String nextValue;

        public attabal() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.nextValue == null && !this.done) {
                String line = cutely.this.reader.readLine();
                this.nextValue = line;
                if (line == null) {
                    this.done = true;
                }
            }
            return this.nextValue != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextValue;
            this.nextValue = null;
            Intrinsics.beachfront(str);
            return str;
        }
    }

    public cutely(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.reader = reader;
    }

    @Override // p002kotlin.sequences.Sequence
    public Iterator<String> iterator() {
        return new attabal();
    }
}
