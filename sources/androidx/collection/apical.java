package androidx.collection;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: IndexBasedArrayIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/collection/apical;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "startingSize", "<init>", "(I)V", "index", "saneness", "(I)Ljava/lang/Object;", "", "wireman", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", "()V", "kowloon", "I", "size", "arytenoidectomy", "monoploid", "Z", "canRemove", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class apical<T> implements Iterator<T>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean canRemove;

    public apical(int i) {
        this.size = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tSaneness = saneness(this.index);
        this.index++;
        this.canRemove = true;
        return tSaneness;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            molybdenite.wireman.saneness("Call next() before removing an element.");
        }
        int i = this.index - 1;
        this.index = i;
        wireman(i);
        this.size--;
        this.canRemove = false;
    }

    public abstract T saneness(int index);

    public abstract void wireman(int index);
}
