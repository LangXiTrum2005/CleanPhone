package com.efs.sdk.memleaksdk.monitor.internal;

import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes2.dex */
public enum bc {
    STRING_IN_UTF8(1),
    LOAD_CLASS(2),
    UNLOAD_CLASS(3),
    STACK_FRAME(4),
    STACK_TRACE(5),
    ALLOC_SITES(6),
    HEAP_SUMMARY(7),
    START_THREAD(10),
    END_THREAD(11),
    HEAP_DUMP(12),
    HEAP_DUMP_SEGMENT(28),
    HEAP_DUMP_END(44),
    CPU_SAMPLES(13),
    CONTROL_SETTINGS(14),
    ROOT_UNKNOWN(255),
    ROOT_JNI_GLOBAL(1),
    ROOT_JNI_LOCAL(2),
    ROOT_JAVA_FRAME(3),
    ROOT_NATIVE_STACK(4),
    ROOT_STICKY_CLASS(5),
    ROOT_THREAD_BLOCK(6),
    ROOT_MONITOR_USED(7),
    ROOT_THREAD_OBJECT(8),
    HEAP_DUMP_INFO(254),
    ROOT_INTERNED_STRING(137),
    ROOT_FINALIZING(138),
    ROOT_DEBUGGER(Input.Keys.F9),
    ROOT_REFERENCE_CLEANUP(Input.Keys.F10),
    ROOT_VM_INTERNAL(Input.Keys.F11),
    ROOT_JNI_MONITOR(Input.Keys.F12),
    ROOT_UNREACHABLE(Input.Keys.NUMPAD_0),
    PRIMITIVE_ARRAY_NODATA(195),
    CLASS_DUMP(32),
    INSTANCE_DUMP(33),
    OBJECT_ARRAY_DUMP(34),
    PRIMITIVE_ARRAY_DUMP(35);

    public static final a L;
    private static final EnumSet<bc> N;
    final int K;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        bc bcVar = ROOT_UNKNOWN;
        bc bcVar2 = ROOT_JNI_GLOBAL;
        bc bcVar3 = ROOT_JNI_LOCAL;
        bc bcVar4 = ROOT_JAVA_FRAME;
        bc bcVar5 = ROOT_NATIVE_STACK;
        bc bcVar6 = ROOT_STICKY_CLASS;
        bc bcVar7 = ROOT_THREAD_BLOCK;
        bc bcVar8 = ROOT_MONITOR_USED;
        bc bcVar9 = ROOT_THREAD_OBJECT;
        bc bcVar10 = ROOT_INTERNED_STRING;
        bc bcVar11 = ROOT_FINALIZING;
        bc bcVar12 = ROOT_DEBUGGER;
        bc bcVar13 = ROOT_REFERENCE_CLEANUP;
        bc bcVar14 = ROOT_VM_INTERNAL;
        bc bcVar15 = ROOT_JNI_MONITOR;
        bc bcVar16 = ROOT_UNREACHABLE;
        L = new a((byte) 0);
        EnumSet<bc> enumSetOf = EnumSet.of(bcVar, bcVar2, bcVar3, bcVar4, bcVar5, bcVar6, bcVar7, bcVar8, bcVar9, bcVar10, bcVar11, bcVar12, bcVar13, bcVar14, bcVar15, bcVar16);
        AbstractC2995aW.p(enumSetOf, "EnumSet.of(\n      ROOT_U…   ROOT_UNREACHABLE\n    )");
        N = enumSetOf;
    }

    bc(int i) {
        this.K = i;
    }
}
