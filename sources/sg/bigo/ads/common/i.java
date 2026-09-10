package sg.bigo.ads.common;

import android.graphics.Point;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Point f47308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f47309b;

    public final String a() {
        if (this.f47308a == null) {
            return "";
        }
        return this.f47308a.x + "," + this.f47308a.y;
    }

    public final String b() {
        if (this.f47309b == null) {
            return "";
        }
        return this.f47309b.x + "," + this.f47309b.y;
    }
}
