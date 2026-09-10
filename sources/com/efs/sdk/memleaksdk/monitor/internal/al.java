package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class al extends bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f532a = new a(0);
    private static final long serialVersionUID = 524928276700576863L;
    private final List<bg> c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(List<bg> list) {
        super((byte) 0);
        AbstractC2995aW.q(list, "leakTraces");
        this.c = list;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bf
    public String a() {
        return ((bg) AbstractC2853Wf.g0(c())).c();
    }

    public String b() {
        bg bgVar = (bg) AbstractC2853Wf.g0(c());
        bk bkVar = (bk) AbstractC5073y40.K0(bgVar.b());
        if (bkVar != null) {
            String str = bkVar.f611a.a() + "." + bkVar.c();
            if (str != null) {
                return str;
            }
        }
        return bgVar.c.b;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bf
    public List<bg> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof al) && AbstractC2995aW.i(c(), ((al) obj).c());
        }
        return true;
    }

    public int hashCode() {
        List<bg> listC = c();
        if (listC != null) {
            return listC.hashCode();
        }
        return 0;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bf
    public String toString() {
        return super.toString();
    }
}
