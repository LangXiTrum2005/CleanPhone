package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bf implements Serializable {
    public static final a b = new a(0);
    private static final long serialVersionUID = -2287572510360910916L;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private bf() {
    }

    public /* synthetic */ bf(byte b2) {
        this();
    }

    public abstract String a();

    public abstract List<bg> c();

    public final Integer d() {
        if (((bg) AbstractC2853Wf.g0(c())).a() == null) {
            return null;
        }
        Iterator<T> it = c().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numA = ((bg) it.next()).a();
            AbstractC2995aW.n(numA);
            iIntValue += numA.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (d() != null) {
            str = d() + " bytes retained by leaking objects\n";
        } else {
            str = "";
        }
        sb.append(str);
        if (c().size() > 1) {
            str2 = "Displaying only 1 leak trace out of " + c().size() + " with the same signature\n";
        }
        sb.append(str2);
        sb.append("Signature: ");
        sb.append(a());
        sb.append('\n');
        sb.append((bg) AbstractC2853Wf.g0(c()));
        return sb.toString();
    }
}
