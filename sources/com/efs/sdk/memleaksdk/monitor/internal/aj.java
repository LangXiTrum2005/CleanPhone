package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes2.dex */
public final class aj {
    public static final a c = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f460a;
    final int b;

    public static final class a {

        /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.aj$a$a, reason: collision with other inner class name */
        public static final class C0123a extends WG implements InterfaceC2714Qw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ au f461a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0123a(au auVar) {
                super(0);
                this.f461a = auVar;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final aj invoke() {
                av.b bVarA = this.f461a.a("android.os.Build");
                AbstractC2995aW.n(bVarA);
                av.b bVarA2 = this.f461a.a("android.os.Build$VERSION");
                AbstractC2995aW.n(bVarA2);
                at atVarB = bVarA.b("MANUFACTURER");
                AbstractC2995aW.n(atVarB);
                String strG = atVarB.c.g();
                AbstractC2995aW.n(strG);
                at atVarB2 = bVarA2.b("SDK_INT");
                AbstractC2995aW.n(atVarB2);
                Integer numB = atVarB2.c.b();
                AbstractC2995aW.n(numB);
                return new aj(strG, numB.intValue());
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final aj a(au auVar) {
            AbstractC2995aW.q(auVar, "graph");
            return (aj) auVar.b().a(aj.class.getName(), new C0123a(auVar));
        }
    }

    public aj(String str, int i) {
        AbstractC2995aW.q(str, "manufacturer");
        this.f460a = str;
        this.b = i;
    }
}
