package rotuma;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00192\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u000fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lrotuma/competently;", "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lrotuma/marial;", "Lrotuma/beachfront;", "builder", "", "Lrotuma/adultoid;", "path", "<init>", "(Lrotuma/beachfront;[Lrotuma/adultoid;)V", "", "taiyuan", "()V", "next", "()Ljava/lang/Object;", "remove", X3.i.W, "newValue", "triweekly", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "keyHash", "Lrotuma/graveside;", "node", "pathIndex", "impassible", "(ILrotuma/graveside;Ljava/lang/Object;I)V", "cutely", "polloi", "Lrotuma/beachfront;", "molybdenite", "Ljava/lang/Object;", "lastIteratedKey", "", "graveside", "Z", "nextWasInvoked", "adultoid", "I", "expectedModCount", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class competently<K, V, T> extends marial<K, V, T> implements Iterator<T>, unready.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public int expectedModCount;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean nextWasInvoked;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public K lastIteratedKey;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final beachfront<K, V> builder;

    public competently(beachfront<K, V> beachfrontVar, adultoid<K, V, T>[] adultoidVarArr) {
        super(beachfrontVar.taiyuan(), adultoidVarArr);
        this.builder = beachfrontVar;
        this.expectedModCount = beachfrontVar.getModCount();
    }

    private final void taiyuan() {
        if (this.builder.getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void cutely() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    public final void impassible(int keyHash, graveside<?, ?> node, K key, int pathIndex) {
        int i = pathIndex * 5;
        if (i > 30) {
            beachfront()[pathIndex].triweekly(node.getBuffer(), node.getBuffer().length, 0);
            while (!Intrinsics.wireman(beachfront()[pathIndex].saneness(), key)) {
                beachfront()[pathIndex].taiyuan();
            }
            impromptu(pathIndex);
            return;
        }
        int iBeachfront = 1 << rotuma.beachfront(keyHash, i);
        if (node.monoploid(iBeachfront)) {
            beachfront()[pathIndex].triweekly(node.getBuffer(), node.impassible() * 2, node.triweekly(iBeachfront));
            impromptu(pathIndex);
        } else {
            int iPrivatdozent = node.privatdozent(iBeachfront);
            graveside<?, ?> gravesideVarSaran = node.saran(iPrivatdozent);
            beachfront()[pathIndex].triweekly(node.getBuffer(), node.impassible() * 2, iPrivatdozent);
            impassible(keyHash, gravesideVarSaran, key, pathIndex + 1);
        }
    }

    @Override // rotuma.marial, java.util.Iterator
    public T next() {
        taiyuan();
        this.lastIteratedKey = wireman();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // rotuma.marial, java.util.Iterator
    public void remove() {
        cutely();
        if (getHasNext()) {
            K kWireman = wireman();
            p002kotlin.jvm.internal.rotuma.wireman(this.builder).remove(this.lastIteratedKey);
            impassible(kWireman != null ? kWireman.hashCode() : 0, this.builder.taiyuan(), kWireman, 0);
        } else {
            p002kotlin.jvm.internal.rotuma.wireman(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount();
    }

    public final void triweekly(K key, V newValue) {
        if (this.builder.containsKey(key)) {
            if (getHasNext()) {
                K kWireman = wireman();
                this.builder.put(key, newValue);
                impassible(kWireman != null ? kWireman.hashCode() : 0, this.builder.taiyuan(), kWireman, 0);
            } else {
                this.builder.put(key, newValue);
            }
            this.expectedModCount = this.builder.getModCount();
        }
    }
}
