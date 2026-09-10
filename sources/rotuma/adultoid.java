package rotuma;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0006J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\u001d\u0010\u001a\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u0014R4\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010\f\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010$\u001a\u0004\b&\u0010'\"\u0004\b\u001f\u0010(¨\u0006)"}, d2 = {"Lrotuma/adultoid;", "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "", "", "buffer", "", "dataSize", "index", "", "triweekly", "([Ljava/lang/Object;II)V", "impassible", "([Ljava/lang/Object;I)V", "", "competently", "()Z", "saneness", "()Ljava/lang/Object;", "taiyuan", "impromptu", "Lrotuma/graveside;", "wireman", "()Lrotuma/graveside;", "cutely", "hasNext", "value", "kowloon", "[Ljava/lang/Object;", "marial", "()[Ljava/lang/Object;", "arytenoidectomy", "I", "monoploid", "beachfront", "()I", "(I)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class adultoid<K, V, T> implements Iterator<T>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int dataSize;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public Object[] buffer = graveside.INSTANCE.attabal().getBuffer();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final boolean competently() {
        return this.index < this.dataSize;
    }

    public final void cutely() {
        cord.attabal.attabal(impromptu());
        this.index++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return competently();
    }

    public final void impassible(Object[] buffer, int dataSize) {
        triweekly(buffer, dataSize, 0);
    }

    public final boolean impromptu() {
        cord.attabal.attabal(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final void kowloon(int i) {
        this.index = i;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final K saneness() {
        cord.attabal.attabal(competently());
        return (K) this.buffer[this.index];
    }

    public final void taiyuan() {
        cord.attabal.attabal(competently());
        this.index += 2;
    }

    public final void triweekly(Object[] buffer, int dataSize, int index) {
        this.buffer = buffer;
        this.dataSize = dataSize;
        this.index = index;
    }

    public final graveside<? extends K, ? extends V> wireman() {
        cord.attabal.attabal(impromptu());
        Object obj = this.buffer[this.index];
        Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (graveside) obj;
    }
}
