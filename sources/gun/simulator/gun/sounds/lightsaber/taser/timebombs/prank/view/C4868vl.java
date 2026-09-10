package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import com.badlogic.gdx.Net;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4868vl {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5150a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        AbstractC2944Zs.a("goog.exo.datasource");
    }

    public C4868vl(Uri uri) {
        this(uri, 0L, -1L);
    }

    public final C4780ul a() {
        C4780ul c4780ul = new C4780ul();
        c4780ul.f5098a = this.f5150a;
        c4780ul.b = this.b;
        c4780ul.c = this.c;
        c4780ul.d = this.d;
        c4780ul.e = this.e;
        c4780ul.f = this.f;
        c4780ul.g = this.g;
        c4780ul.h = this.h;
        c4780ul.i = this.i;
        c4780ul.j = this.j;
        return c4780ul;
    }

    public final C4868vl b(long j) {
        long j2 = this.g;
        long j3 = j2 != -1 ? j2 - j : -1L;
        if (j == 0 && j2 == j3) {
            return this;
        }
        return new C4868vl(this.f5150a, this.b, this.c, this.d, this.e, this.f + j, j3, this.h, this.i, this.j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.c;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = Net.HttpMethods.HEAD;
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f5150a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return AbstractC5044xl.o(sb, this.i, "]");
    }

    public C4868vl(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        FW.h(j + j2 >= 0);
        FW.h(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        FW.h(z);
        this.f5150a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
        this.j = obj;
    }

    public C4868vl(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }
}
