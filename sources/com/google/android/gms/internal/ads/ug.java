package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f20770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public vw f20775f = vw.f21303b;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public final void a(Object obj, Object obj2, int i10, long j10, boolean z10) {
        vw vwVar = vw.f21303b;
        this.f20770a = obj;
        this.f20771b = obj2;
        this.f20772c = i10;
        this.f20773d = j10;
        this.f20775f = vwVar;
        this.f20774e = z10;
    }

    public final long b(int i10, int i11) {
        a aVarA = this.f20775f.a(i10);
        return aVarA.f11784a != -1 ? aVarA.f11788e[i11] : C.TIME_UNSET;
    }

    public final void c(int i10) {
        this.f20775f.a(i10).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ug.class.equals(obj.getClass())) {
            return false;
        }
        ug ugVar = (ug) obj;
        return Objects.equals(this.f20770a, ugVar.f20770a) && Objects.equals(this.f20771b, ugVar.f20771b) && this.f20772c == ugVar.f20772c && this.f20773d == ugVar.f20773d && this.f20774e == ugVar.f20774e && Objects.equals(this.f20775f, ugVar.f20775f);
    }

    public final int hashCode() {
        Object obj = this.f20770a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f20771b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f20772c;
        long j10 = this.f20773d;
        return (this.f20775f.hashCode() + (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.f20774e ? 1 : 0)) * 31)) * 31;
    }
}
