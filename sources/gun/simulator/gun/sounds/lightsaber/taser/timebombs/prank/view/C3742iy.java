package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3742iy implements InterfaceC4650tG {
    public final InterfaceC4534rz b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public C3742iy(URL url) {
        C3686iH c3686iH = InterfaceC4534rz.f4956a;
        AbstractC2871Wx.V(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        AbstractC2871Wx.V(c3686iH, "Argument must not be null");
        this.b = c3686iH;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(InterfaceC4650tG.f5028a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        AbstractC2871Wx.V(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String string = this.d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.c;
                    AbstractC2871Wx.V(url, "Argument must not be null");
                    string = url.toString();
                }
                this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.e);
        }
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3742iy)) {
            return false;
        }
        C3742iy c3742iy = (C3742iy) obj;
        return c().equals(c3742iy.c()) && this.b.equals(c3742iy.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public C3742iy(String str) {
        C3686iH c3686iH = InterfaceC4534rz.f4956a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            AbstractC2871Wx.V(c3686iH, "Argument must not be null");
            this.b = c3686iH;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
