package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3253dO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4269a;
    public final String b;
    public final C2987aO c;
    public final List d;
    public final String e;
    public final AC f;
    public final Object g;

    public AbstractC3253dO(Uri uri, String str, C2987aO c2987aO, List list, String str2, AC ac, Object obj) {
        this.f4269a = uri;
        this.b = str;
        this.c = c2987aO;
        this.d = list;
        this.e = str2;
        this.f = ac;
        C4998xC c4998xCI = AC.i();
        for (int i = 0; i < ac.size(); i++) {
            c4998xCI.H0(C3605hO.a(((C3517gO) ac.get(i)).a()));
        }
        c4998xCI.J0();
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3253dO)) {
            return false;
        }
        AbstractC3253dO abstractC3253dO = (AbstractC3253dO) obj;
        return this.f4269a.equals(abstractC3253dO.f4269a) && Ug0.a(this.b, abstractC3253dO.b) && Ug0.a(this.c, abstractC3253dO.c) && Ug0.a(null, null) && this.d.equals(abstractC3253dO.d) && Ug0.a(this.e, abstractC3253dO.e) && this.f.equals(abstractC3253dO.f) && Ug0.a(this.g, abstractC3253dO.g);
    }

    public final int hashCode() {
        int iHashCode = this.f4269a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C2987aO c2987aO = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (c2987aO == null ? 0 : c2987aO.hashCode())) * 961)) * 31;
        String str2 = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.g;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }
}
