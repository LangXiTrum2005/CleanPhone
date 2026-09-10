package rotuma;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lrotuma/marial;", "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lrotuma/graveside;", "node", "", "Lrotuma/adultoid;", "path", "<init>", "(Lrotuma/graveside;[Lrotuma/adultoid;)V", "wireman", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "", "pathIndex", "competently", "(I)I", "", "marial", "()V", "saneness", "kowloon", "[Lrotuma/adultoid;", "beachfront", "()[Lrotuma/adultoid;", "arytenoidectomy", "I", "getPathLastIndex", "()I", "impromptu", "(I)V", "pathLastIndex", "monoploid", "Z", "getHasNext$annotations", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class marial<K, V, T> implements Iterator<T>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int pathLastIndex;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final adultoid<K, V, T>[] path;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean hasNext = true;

    public marial(graveside<K, V> gravesideVar, adultoid<K, V, T>[] adultoidVarArr) {
        this.path = adultoidVarArr;
        adultoidVarArr[0].impassible(gravesideVar.getBuffer(), gravesideVar.impassible() * 2);
        this.pathLastIndex = 0;
        marial();
    }

    public final adultoid<K, V, T>[] beachfront() {
        return this.path;
    }

    public final int competently(int pathIndex) {
        if (this.path[pathIndex].competently()) {
            return pathIndex;
        }
        if (!this.path[pathIndex].impromptu()) {
            return -1;
        }
        graveside<? extends K, ? extends V> gravesideVarWireman = this.path[pathIndex].wireman();
        if (pathIndex == 6) {
            this.path[pathIndex + 1].impassible(gravesideVarWireman.getBuffer(), gravesideVarWireman.getBuffer().length);
        } else {
            this.path[pathIndex + 1].impassible(gravesideVarWireman.getBuffer(), gravesideVarWireman.impassible() * 2);
        }
        return competently(pathIndex + 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    public final void impromptu(int i) {
        this.pathLastIndex = i;
    }

    public final void marial() {
        if (this.path[this.pathLastIndex].competently()) {
            return;
        }
        for (int i = this.pathLastIndex; -1 < i; i--) {
            int iCompetently = competently(i);
            if (iCompetently == -1 && this.path[i].impromptu()) {
                this.path[i].cutely();
                iCompetently = competently(i);
            }
            if (iCompetently != -1) {
                this.pathLastIndex = iCompetently;
                return;
            }
            if (i > 0) {
                this.path[i - 1].cutely();
            }
            this.path[i].impassible(graveside.INSTANCE.attabal().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    @Override // java.util.Iterator
    public T next() {
        saneness();
        T next = this.path[this.pathLastIndex].next();
        marial();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void saneness() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final K wireman() {
        saneness();
        return this.path[this.pathLastIndex].saneness();
    }
}
