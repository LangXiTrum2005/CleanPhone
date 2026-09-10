package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4642t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5021a = true;
    public boolean b = true;

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final boolean a(InterfaceC3416fB interfaceC3416fB) {
        String strE;
        if (interfaceC3416fB != null) {
            String str = ((Om0) interfaceC3416fB).f3522a;
            if (AbstractC3375el.I(str)) {
                String str2 = AbstractC4969wu.f5203a;
                C2907Yh c2907Yh = C2375Du.a().g;
                C2777Th c2777Th = c2907Yh.c;
                String strE2 = C2907Yh.e(c2777Th, str);
                Pattern pattern = C2907Yh.f;
                Pattern pattern2 = C2907Yh.e;
                boolean z = true;
                if (strE2 == null) {
                    strE = C2907Yh.e(c2907Yh.d, str);
                    if (strE == null) {
                        C2907Yh.f(str, "Boolean");
                        z = false;
                    } else if (!pattern2.matcher(strE).matches()) {
                        if (!pattern.matcher(strE).matches()) {
                            C2907Yh.f(str, "Boolean");
                        }
                        z = false;
                    }
                } else if (pattern2.matcher(strE2).matches()) {
                    c2907Yh.b(C2907Yh.c(c2777Th), str);
                } else {
                    if (pattern.matcher(strE2).matches()) {
                        c2907Yh.b(C2907Yh.c(c2777Th), str);
                    } else {
                        strE = C2907Yh.e(c2907Yh.d, str);
                        if (strE == null) {
                            C2907Yh.f(str, "Boolean");
                        } else if (!pattern2.matcher(strE).matches()) {
                            if (!pattern.matcher(strE).matches()) {
                                C2907Yh.f(str, "Boolean");
                            }
                        }
                    }
                    z = false;
                }
                this.b = z;
            }
        }
        return this.b;
    }
}
