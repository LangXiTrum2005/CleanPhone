package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public interface bp {
    public static final a b = a.f617a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f617a = new a();
        private static final bp b = C0132a.f618a;

        /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.bp$a$a, reason: collision with other inner class name */
        public static final class C0132a implements bp {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0132a f618a = new C0132a();

            @Override // com.efs.sdk.memleaksdk.monitor.internal.bp
            public final void a(b bVar) {
                AbstractC2995aW.q(bVar, "it");
            }
        }

        private a() {
        }
    }

    public enum b {
        PARSING_HEAP_DUMP,
        EXTRACTING_METADATA,
        FINDING_RETAINED_OBJECTS,
        FINDING_PATHS_TO_RETAINED_OBJECTS,
        FINDING_DOMINATORS,
        INSPECTING_OBJECTS,
        COMPUTING_NATIVE_RETAINED_SIZE,
        COMPUTING_RETAINED_SIZE,
        BUILDING_LEAK_TRACES,
        REPORTING_HEAP_ANALYSIS
    }

    void a(b bVar);
}
