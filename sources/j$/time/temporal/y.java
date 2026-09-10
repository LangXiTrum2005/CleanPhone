package j$.time.temporal;

import com.p004ironsource.d9;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Serializable {
    private static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f43206h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.e f43207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient r f43209c = x.e(this);
    private final transient r d = x.h(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient r f43210e;
    private final transient r f;

    static {
        new y(j$.time.e.MONDAY, 4);
        g(j$.time.e.SUNDAY, 1);
        f43206h = j.d;
    }

    public static y g(j$.time.e eVar, int i2) {
        String str = eVar.toString() + i2;
        ConcurrentHashMap concurrentHashMap = g;
        y yVar = (y) concurrentHashMap.get(str);
        if (yVar != null) {
            return yVar;
        }
        concurrentHashMap.putIfAbsent(str, new y(eVar, i2));
        return (y) concurrentHashMap.get(str);
    }

    private y(j$.time.e eVar, int i2) {
        b bVar = b.NANOS;
        this.f43210e = x.i(this);
        this.f = x.g(this);
        Objects.requireNonNull(eVar, "firstDayOfWeek");
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f43207a = eVar;
        this.f43208b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f43207a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i2 = this.f43208b;
        if (i2 < 1 || i2 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return g(this.f43207a, this.f43208b);
        } catch (IllegalArgumentException e2) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e2.getMessage());
        }
    }

    public final j$.time.e e() {
        return this.f43207a;
    }

    public final int f() {
        return this.f43208b;
    }

    public final r d() {
        return this.f43209c;
    }

    public final r i() {
        return this.d;
    }

    public final r j() {
        return this.f43210e;
    }

    public final r h() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f43207a.ordinal() * 7) + this.f43208b;
    }

    public final String toString() {
        return "WeekFields[" + this.f43207a + "," + this.f43208b + d9.i.f24752e;
    }
}
