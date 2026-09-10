package oa;

import com.google.android.gms.internal.ads.z81;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends a {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient na.r f47266f;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f47266f = (na.r) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        Map map = (Map) object2;
        this.f47270d = map;
        this.f47271e = 0;
        for (Collection collection : map.values()) {
            go.k.i(!collection.isEmpty());
            this.f47271e = collection.size() + this.f47271e;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f47266f);
        objectOutputStream.writeObject(this.f47270d);
    }

    @Override // oa.n
    public final Map g() {
        Map map = this.f47270d;
        if (map instanceof NavigableMap) {
            return new f(this, (NavigableMap) this.f47270d);
        }
        return map instanceof SortedMap ? new i(this, (SortedMap) this.f47270d) : new z81(this, this.f47270d);
    }

    @Override // oa.n
    public final Set h() {
        Map map = this.f47270d;
        if (map instanceof NavigableMap) {
            return new g(this, (NavigableMap) this.f47270d);
        }
        return map instanceof SortedMap ? new j(this, (SortedMap) this.f47270d) : new e(this, this.f47270d);
    }

    @Override // oa.l
    public final Collection k() {
        return (List) this.f47266f.get();
    }
}
