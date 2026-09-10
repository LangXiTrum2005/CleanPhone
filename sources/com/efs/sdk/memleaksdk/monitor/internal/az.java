package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f583a = new a(0);
    private final bv b;
    private final ax c;
    private final cj d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final az a(an anVar, ax axVar, bs bsVar, Set<? extends bc> set) {
            AbstractC2995aW.q(anVar, "hprofSourceProvider");
            AbstractC2995aW.q(axVar, "hprofHeader");
            AbstractC2995aW.q(set, "indexedGcRootTags");
            return new az(anVar, axVar, cj.e.a(bz.f627a.a(anVar, axVar), axVar, bsVar, set), (byte) 0);
        }
    }

    private az(bv bvVar, ax axVar, cj cjVar) {
        this.b = bvVar;
        this.c = axVar;
        this.d = cjVar;
    }

    public final am a() {
        return new ay(this.c, bt.f624a.a(this.b, this.c), this.d);
    }

    public /* synthetic */ az(bv bvVar, ax axVar, cj cjVar, byte b) {
        this(bvVar, axVar, cjVar);
    }
}
