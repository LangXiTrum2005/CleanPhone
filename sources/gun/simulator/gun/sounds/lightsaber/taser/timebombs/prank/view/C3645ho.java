package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3645ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4472a;
    public final C3830jy b;

    public C3645ho(Set set, C3830jy c3830jy) {
        this.f4472a = b(set);
        this.b = c3830jy;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3235d8 c3235d8 = (C3235d8) it.next();
            sb.append(c3235d8.f4260a);
            sb.append('/');
            sb.append(c3235d8.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        C3830jy c3830jy = this.b;
        synchronized (c3830jy.f4577a) {
            setUnmodifiableSet = Collections.unmodifiableSet(c3830jy.f4577a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f4472a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(c3830jy.b());
    }
}
