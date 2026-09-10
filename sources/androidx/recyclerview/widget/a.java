package androidx.recyclerview.widget;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4704d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            int i10 = this.f4701a;
            if (i10 != aVar.f4701a) {
                return false;
            }
            if (i10 != 8 || Math.abs(this.f4704d - this.f4702b) != 1 || this.f4704d != aVar.f4702b || this.f4702b != aVar.f4704d) {
                if (this.f4704d != aVar.f4704d || this.f4702b != aVar.f4702b) {
                    return false;
                }
                Object obj2 = this.f4703c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f4703c)) {
                        return false;
                    }
                } else if (aVar.f4703c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f4701a * 31) + this.f4702b) * 31) + this.f4704d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(X3.j.f27834d);
        int i10 = this.f4701a;
        if (i10 == 1) {
            str = "add";
        } else if (i10 == 2) {
            str = "rm";
        } else if (i10 != 4) {
            str = i10 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f4702b);
        sb2.append("c:");
        sb2.append(this.f4704d);
        sb2.append(",p:");
        sb2.append(this.f4703c);
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }
}
