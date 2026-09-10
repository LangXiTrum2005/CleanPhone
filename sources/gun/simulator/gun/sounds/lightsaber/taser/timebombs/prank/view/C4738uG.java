package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4738uG {
    public static final C4738uG c = new C4738uG("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5071a;
    public InterfaceC4826vG b;

    public C4738uG(String... strArr) {
        this.f5071a = Arrays.asList(strArr);
    }

    public final boolean a(int i, String str) {
        List list = this.f5071a;
        if (i >= list.size()) {
            return false;
        }
        boolean z = i == list.size() - 1;
        String str2 = (String) list.get(i);
        if (!str2.equals("**")) {
            return (z || (i == list.size() + (-2) && ((String) DM.f(list, 1)).equals("**"))) && (str2.equals(str) || str2.equals(ProxyConfig.MATCH_ALL_SCHEMES));
        }
        if (!z && ((String) list.get(i + 1)).equals(str)) {
            return i == list.size() + (-2) || (i == list.size() + (-3) && ((String) DM.f(list, 1)).equals("**"));
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i2)).equals(str);
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f5071a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f5071a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals(ProxyConfig.MATCH_ALL_SCHEMES);
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f5071a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4738uG.class != obj.getClass()) {
            return false;
        }
        C4738uG c4738uG = (C4738uG) obj;
        if (!this.f5071a.equals(c4738uG.f5071a)) {
            return false;
        }
        InterfaceC4826vG interfaceC4826vG = this.b;
        InterfaceC4826vG interfaceC4826vG2 = c4738uG.b;
        if (interfaceC4826vG != null) {
            return interfaceC4826vG.equals(interfaceC4826vG2);
        }
        return interfaceC4826vG2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f5071a.hashCode() * 31;
        InterfaceC4826vG interfaceC4826vG = this.b;
        return iHashCode + (interfaceC4826vG != null ? interfaceC4826vG.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f5071a);
        sb.append(",resolved=");
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }

    public C4738uG(C4738uG c4738uG) {
        this.f5071a = new ArrayList(c4738uG.f5071a);
        this.b = c4738uG.b;
    }
}
