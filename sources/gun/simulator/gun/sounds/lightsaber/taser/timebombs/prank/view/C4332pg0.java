package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4332pg0 {
    public static volatile C4332pg0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K5 f4844a;

    static {
        byte[] bArr = {-87, -80, -121, -1, 98, -68, -45, 17, -111, -81, -105, -5, 94, -68, -19, 4, -103, -78};
        byte[] bArr2 = {-4, -64, -29, -98, 22, -39, -127, 116};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }

    public static C4332pg0 a() {
        if (b == null) {
            synchronized (C4332pg0.class) {
                try {
                    if (b == null) {
                        C4332pg0 c4332pg0 = new C4332pg0();
                        c4332pg0.f4844a = null;
                        b = c4332pg0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final C2317Bo b(Context context) {
        List list;
        K5 k5 = this.f4844a;
        C2317Bo c2317Bo = null;
        if (k5 != null && (list = k5.n) != null && !list.isEmpty()) {
            String language = context.getResources().getConfiguration().locale.getLanguage();
            for (C2317Bo c2317Bo2 : this.f4844a.n) {
                String str = c2317Bo2.f2892a;
                byte[] bArr = {-102, 111};
                byte[] bArr2 = {-1, 1, -30, -67, -84, -46, -32, 68};
                int length = bArr.length;
                int length2 = bArr2.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    if (i2 >= length2) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                if (str.equalsIgnoreCase(new String(bArr, StandardCharsets.UTF_8))) {
                    c2317Bo = c2317Bo2;
                }
                if (c2317Bo2.f2892a.equalsIgnoreCase(language)) {
                    c2317Bo = c2317Bo2;
                    break;
                }
            }
            if (c2317Bo != null) {
                try {
                    c2317Bo.c = this.f4844a.e.booleanValue() ? new String(Base64.decode(c2317Bo.c, 1)) : c2317Bo.c;
                    c2317Bo.b = this.f4844a.e.booleanValue() ? new String(Base64.decode(c2317Bo.b, 1)) : c2317Bo.b;
                    c2317Bo.d = this.f4844a.e.booleanValue() ? new String(Base64.decode(c2317Bo.d, 1)) : c2317Bo.d;
                    c2317Bo.e = this.f4844a.e.booleanValue() ? new String(Base64.decode(c2317Bo.e, 1)) : c2317Bo.e;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return c2317Bo;
    }
}
