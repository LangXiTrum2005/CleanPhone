package androidx.media3.common;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public class Label {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5436b;

    static {
        Util.E(0);
        Util.E(1);
    }

    public Label(String str, String str2) {
        this.f5435a = Util.J(str);
        this.f5436b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Label label = (Label) obj;
            if (Util.a(this.f5435a, label.f5435a) && Util.a(this.f5436b, label.f5436b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f5436b.hashCode() * 31;
        String str = this.f5435a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
