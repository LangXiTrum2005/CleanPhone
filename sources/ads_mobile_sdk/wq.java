package ads_mobile_sdk;

import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class wq {
    public final int a;
    public final int b;
    public final int c;

    public wq(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq)) {
            return false;
        }
        wq wqVar = (wq) obj;
        return this.a == wqVar.a && this.b == wqVar.b && this.c == wqVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(50) + bonny.attabal(this.c, bonny.attabal(0, bonny.attabal(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CloseButtonConfig(paddingLeft=" + this.a + ", paddingRight=" + this.b + ", paddingTop=0, paddingBottom=" + this.c + ", size=50)";
    }
}
