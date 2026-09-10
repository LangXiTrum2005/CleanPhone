package gintrap;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: BufferIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgintrap/wireman;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lgintrap/attabal;", "", "buffer", "", "index", "size", "<init>", "([Ljava/lang/Object;II)V", "next", "()Ljava/lang/Object;", "previous", "monoploid", "[Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wireman<T> extends attabal<T> {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final T[] buffer;

    public wireman(T[] tArr, int i, int i2) {
        super(i, i2);
        this.buffer = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.buffer;
        int index = getIndex();
        competently(index + 1);
        return tArr[index];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.buffer;
        competently(getIndex() - 1);
        return tArr[getIndex()];
    }
}
