package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class PF extends r {
    public final FF e;
    public final String f;
    public final D40 g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PF(VE ve, FF ff, String str, D40 d40) {
        super(ve);
        AbstractC2995aW.q(ve, "json");
        AbstractC2995aW.q(ff, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.e = ff;
        this.f = str;
        this.g = d40;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final boolean C() {
        return !this.i && super.C();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public String N(D40 d40, int i) {
        Object next;
        AbstractC2995aW.q(d40, CampaignEx.JSON_KEY_DESC);
        String strE = d40.e(i);
        if (!this.d.l || U().f3060a.keySet().contains(strE)) {
            return strE;
        }
        VE ve = this.c;
        AbstractC2995aW.q(ve, "<this>");
        Map map = (Map) ve.c.a(d40, new AF(d40, 1));
        Iterator it = U().f3060a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) map.get((String) next);
            if (num != null && num.intValue() == i) {
                break;
            }
        }
        String str = (String) next;
        return str == null ? strE : str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r
    public AbstractC4122nF R(String str) {
        AbstractC2995aW.q(str, "tag");
        return (AbstractC4122nF) U5.q0(U(), str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public FF U() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public void b(D40 d40) {
        Set setG0;
        AbstractC2995aW.q(d40, "descriptor");
        C3067bF c3067bF = this.d;
        if (c3067bF.b || (d40.getKind() instanceof AbstractC3786jV)) {
            return;
        }
        if (c3067bF.l) {
            Set setQ = AbstractC2871Wx.Q(d40);
            VE ve = this.c;
            AbstractC2995aW.q(ve, "<this>");
            C3568gy c3568gy = ve.c;
            c3568gy.getClass();
            C3887ke c3887ke = BF.f2862a;
            Map map = (Map) c3568gy.f4439a.get(d40);
            Object obj = map != null ? map.get(c3887ke) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = C2942Zq.f4095a;
            }
            setG0 = AbstractC5163z50.G0(setQ, setKeySet);
        } else {
            setG0 = AbstractC2871Wx.Q(d40);
        }
        for (String str : U().f3060a.keySet()) {
            if (!setG0.contains(str) && !AbstractC2995aW.i(str, this.f)) {
                String string = U().toString();
                AbstractC2995aW.q(str, "key");
                StringBuilder sbU = AbstractC3950lJ.u("Encountered unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbU.append((Object) AbstractC2871Wx.k0(string, -1));
                throw AbstractC2871Wx.I(-1, sbU.toString());
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final InterfaceC4421qh c(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return d40 == this.g ? this : super.c(d40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public int k(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        while (this.h < d40.d()) {
            int i = this.h;
            this.h = i + 1;
            String strO = O(d40, i);
            int i2 = this.h - 1;
            this.i = false;
            boolean zContainsKey = U().containsKey(strO);
            VE ve = this.c;
            if (!zContainsKey) {
                boolean z = (ve.f3865a.f || d40.i(i2) || !d40.g(i2).b()) ? false : true;
                this.i = z;
                if (!z) {
                    continue;
                }
            }
            if (this.d.h) {
                D40 d40G = d40.g(i2);
                if (d40G.b() || !(R(strO) instanceof DF)) {
                    if (AbstractC2995aW.i(d40G.getKind(), K40.f3299a)) {
                        AbstractC4122nF abstractC4122nFR = R(strO);
                        String strA = null;
                        IF r0 = abstractC4122nFR instanceof IF ? (IF) abstractC4122nFR : null;
                        if (r0 != null && !(r0 instanceof DF)) {
                            strA = r0.a();
                        }
                        if (strA != null && BF.l(d40G, ve, strA) == -3) {
                        }
                    }
                }
            }
            return i2;
        }
        return -1;
    }
}
