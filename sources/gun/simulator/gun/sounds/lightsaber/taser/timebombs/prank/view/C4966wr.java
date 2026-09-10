package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4966wr implements InterfaceC4650tG {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final InterfaceC4650tG g;
    public final Map h;
    public final YS i;
    public int j;

    public C4966wr(Object obj, InterfaceC4650tG interfaceC4650tG, int i, int i2, CachedHashCodeArrayMap cachedHashCodeArrayMap, Class cls, Class cls2, YS ys) {
        AbstractC2871Wx.V(obj, "Argument must not be null");
        this.b = obj;
        AbstractC2871Wx.V(interfaceC4650tG, "Signature must not be null");
        this.g = interfaceC4650tG;
        this.c = i;
        this.d = i2;
        AbstractC2871Wx.V(cachedHashCodeArrayMap, "Argument must not be null");
        this.h = cachedHashCodeArrayMap;
        AbstractC2871Wx.V(cls, "Resource class must not be null");
        this.e = cls;
        AbstractC2871Wx.V(cls2, "Transcode class must not be null");
        this.f = cls2;
        AbstractC2871Wx.V(ys, "Argument must not be null");
        this.i = ys;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4966wr)) {
            return false;
        }
        C4966wr c4966wr = (C4966wr) obj;
        return this.b.equals(c4966wr.b) && this.g.equals(c4966wr.g) && this.d == c4966wr.d && this.c == c4966wr.c && this.h.equals(c4966wr.h) && this.e.equals(c4966wr.e) && this.f.equals(c4966wr.f) && this.i.equals(c4966wr.i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
