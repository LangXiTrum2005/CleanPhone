package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class VS {
    public static final G7 e = new G7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3871a;
    public final US b;
    public final String c;
    public volatile byte[] d;

    public VS(String str, Object obj, US us) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.f3871a = obj;
        this.b = us;
    }

    public static VS a(Object obj, String str) {
        return new VS(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof VS) {
            return this.c.equals(((VS) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return DM.m(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
