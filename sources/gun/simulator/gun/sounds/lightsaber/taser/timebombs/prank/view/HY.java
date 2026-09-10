package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZA f3175a;
    public final String b;
    public final C4447qz c;
    public final NY d;
    public final Map e;
    public C4938wc f;

    public HY(ZA za, String str, C4447qz c4447qz, NY ny, Map map) {
        AbstractC2995aW.q(str, "method");
        this.f3175a = za;
        this.b = str;
        this.c = c4447qz;
        this.d = ny;
        this.e = map;
    }

    public final GY a() {
        GY gy = new GY();
        gy.e = new LinkedHashMap();
        gy.f3127a = this.f3175a;
        gy.b = this.b;
        gy.d = this.d;
        Map map = this.e;
        gy.e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        gy.c = this.c.c();
        return gy;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.f3175a);
        C4447qz c4447qz = this.c;
        if (c4447qz.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c4447qz) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC2340Cl.S();
                    throw null;
                }
                C4839vT c4839vT = (C4839vT) obj;
                String str = (String) c4839vT.f5132a;
                String str2 = (String) c4839vT.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
