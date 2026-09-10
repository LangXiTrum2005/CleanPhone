package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5092yI;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2127l0 {
    private static final AbstractC2127l0 FULL_INSTANCE;
    private static final AbstractC2127l0 LITE_INSTANCE;

    static {
        AbstractC5092yI abstractC5092yI = null;
        FULL_INSTANCE = new C2123j0();
        LITE_INSTANCE = new C2125k0();
    }

    private AbstractC2127l0() {
    }

    public static AbstractC2127l0 full() {
        return FULL_INSTANCE;
    }

    public static AbstractC2127l0 lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj, long j);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j);

    public abstract <L> List<L> mutableListAt(Object obj, long j);
}
