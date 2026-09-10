package j$.time;

import com.p004ironsource.d9;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class a extends b implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a f43014b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ZoneId f43015a;

    a(ZoneId zoneId) {
        this.f43015a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f43014b = new a(ZoneOffset.UTC);
    }

    @Override // j$.time.b
    public final ZoneId a() {
        return this.f43015a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f43015a.equals(((a) obj).f43015a);
    }

    public final int hashCode() {
        return this.f43015a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f43015a + d9.i.f24752e;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
