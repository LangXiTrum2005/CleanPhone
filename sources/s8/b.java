package s8;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9.a f50213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9.a f50214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50215d;

    public b(Context context, a9.a aVar, a9.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f50212a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f50213b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f50214c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f50215d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f50212a.equals(bVar.f50212a) && this.f50213b.equals(bVar.f50213b) && this.f50214c.equals(bVar.f50214c) && this.f50215d.equals(bVar.f50215d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f50215d.hashCode() ^ ((((((this.f50212a.hashCode() ^ 1000003) * 1000003) ^ this.f50213b.hashCode()) * 1000003) ^ this.f50214c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f50212a);
        sb2.append(", wallClock=");
        sb2.append(this.f50213b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f50214c);
        sb2.append(", backendName=");
        return defpackage.e.q(this.f50215d, "}", sb2);
    }
}
