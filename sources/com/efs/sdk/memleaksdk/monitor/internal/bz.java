package com.efs.sdk.memleaksdk.monitor.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f627a = new a(0);
    private final ca b;
    private final ax c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final bz a(ca caVar, ax axVar) {
            AbstractC2995aW.q(caVar, "hprofSourceProvider");
            AbstractC2995aW.q(axVar, "hprofHeader");
            return new bz(caVar, axVar, (byte) 0);
        }
    }

    private bz(ca caVar, ax axVar) {
        this.b = caVar;
        this.c = axVar;
    }

    public final long a(Set<? extends bc> set, bq bqVar) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC2995aW.q(set, "recordTags");
        AbstractC2995aW.q(bqVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        n nVarA = this.b.a();
        try {
            bb bbVar = new bb(this.c, nVarA);
            bbVar.a(this.c.f573a);
            int i = br.INT.j;
            int i2 = bbVar.b[2];
            while (!nVarA.b()) {
                int iE = bbVar.E();
                bbVar.a(i);
                long jD = bbVar.D();
                bc bcVar = bc.STRING_IN_UTF8;
                if (iE != bcVar.K) {
                    bc bcVar2 = bc.LOAD_CLASS;
                    if (iE != bcVar2.K) {
                        bc bcVar3 = bc.STACK_FRAME;
                        if (iE != bcVar3.K) {
                            bc bcVar4 = bc.STACK_TRACE;
                            if (iE != bcVar4.K) {
                                if (iE == bc.HEAP_DUMP.K || iE == bc.HEAP_DUMP_SEGMENT.K) {
                                    long j = bbVar.f598a;
                                    long j2 = 0;
                                    int i3 = 0;
                                    while (true) {
                                        long j3 = bbVar.f598a;
                                        if (j3 - j >= jD) {
                                            break;
                                        }
                                        int iE2 = bbVar.E();
                                        bc bcVar5 = bc.ROOT_UNKNOWN;
                                        long j4 = j;
                                        long j5 = j2;
                                        if (iE2 != bcVar5.K) {
                                            bc bcVar6 = bc.ROOT_JNI_GLOBAL;
                                            if (iE2 != bcVar6.K) {
                                                bc bcVar7 = bc.ROOT_JNI_LOCAL;
                                                if (iE2 != bcVar7.K) {
                                                    bc bcVar8 = bc.ROOT_JAVA_FRAME;
                                                    if (iE2 != bcVar8.K) {
                                                        bc bcVar9 = bc.ROOT_NATIVE_STACK;
                                                        if (iE2 != bcVar9.K) {
                                                            bc bcVar10 = bc.ROOT_STICKY_CLASS;
                                                            if (iE2 != bcVar10.K) {
                                                                bc bcVar11 = bc.ROOT_THREAD_BLOCK;
                                                                if (iE2 != bcVar11.K) {
                                                                    bc bcVar12 = bc.ROOT_MONITOR_USED;
                                                                    if (iE2 != bcVar12.K) {
                                                                        bc bcVar13 = bc.ROOT_THREAD_OBJECT;
                                                                        if (iE2 != bcVar13.K) {
                                                                            bc bcVar14 = bc.ROOT_INTERNED_STRING;
                                                                            if (iE2 != bcVar14.K) {
                                                                                bc bcVar15 = bc.ROOT_FINALIZING;
                                                                                if (iE2 != bcVar15.K) {
                                                                                    bc bcVar16 = bc.ROOT_DEBUGGER;
                                                                                    if (iE2 != bcVar16.K) {
                                                                                        bc bcVar17 = bc.ROOT_REFERENCE_CLEANUP;
                                                                                        if (iE2 != bcVar17.K) {
                                                                                            bc bcVar18 = bc.ROOT_VM_INTERNAL;
                                                                                            if (iE2 != bcVar18.K) {
                                                                                                bc bcVar19 = bc.ROOT_JNI_MONITOR;
                                                                                                if (iE2 != bcVar19.K) {
                                                                                                    bc bcVar20 = bc.ROOT_UNREACHABLE;
                                                                                                    if (iE2 != bcVar20.K) {
                                                                                                        bc bcVar21 = bc.CLASS_DUMP;
                                                                                                        if (iE2 != bcVar21.K) {
                                                                                                            bc bcVar22 = bc.INSTANCE_DUMP;
                                                                                                            if (iE2 != bcVar22.K) {
                                                                                                                bc bcVar23 = bc.OBJECT_ARRAY_DUMP;
                                                                                                                if (iE2 != bcVar23.K) {
                                                                                                                    bc bcVar24 = bc.PRIMITIVE_ARRAY_DUMP;
                                                                                                                    if (iE2 != bcVar24.K) {
                                                                                                                        bc bcVar25 = bc.PRIMITIVE_ARRAY_NODATA;
                                                                                                                        if (iE2 == bcVar25.K) {
                                                                                                                            throw new UnsupportedOperationException(bcVar25 + " cannot be parsed");
                                                                                                                        }
                                                                                                                        bc bcVar26 = bc.HEAP_DUMP_INFO;
                                                                                                                        if (iE2 != bcVar26.K) {
                                                                                                                            throw new IllegalStateException("Unknown tag " + String.format("0x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(iE2)}, 1)) + " at " + j3 + " after " + String.format("0x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)) + " at " + j5);
                                                                                                                        }
                                                                                                                        if (set.contains(bcVar26)) {
                                                                                                                            bqVar.a(bcVar26, -1L, bbVar);
                                                                                                                        } else {
                                                                                                                            bbVar.C();
                                                                                                                        }
                                                                                                                    } else if (set.contains(bcVar24)) {
                                                                                                                        bqVar.a(bcVar24, -1L, bbVar);
                                                                                                                    } else {
                                                                                                                        bbVar.B();
                                                                                                                    }
                                                                                                                } else if (set.contains(bcVar23)) {
                                                                                                                    bqVar.a(bcVar23, -1L, bbVar);
                                                                                                                } else {
                                                                                                                    bbVar.A();
                                                                                                                }
                                                                                                            } else if (set.contains(bcVar22)) {
                                                                                                                bqVar.a(bcVar22, -1L, bbVar);
                                                                                                            } else {
                                                                                                                bbVar.y();
                                                                                                            }
                                                                                                        } else if (set.contains(bcVar21)) {
                                                                                                            bqVar.a(bcVar21, -1L, bbVar);
                                                                                                        } else {
                                                                                                            bbVar.z();
                                                                                                        }
                                                                                                    } else if (set.contains(bcVar20)) {
                                                                                                        bqVar.a(bcVar20, -1L, bbVar);
                                                                                                    } else {
                                                                                                        bbVar.a(i2);
                                                                                                    }
                                                                                                } else if (set.contains(bcVar19)) {
                                                                                                    bqVar.a(bcVar19, -1L, bbVar);
                                                                                                } else {
                                                                                                    bbVar.a(i2 + i + i);
                                                                                                }
                                                                                            } else if (set.contains(bcVar18)) {
                                                                                                bqVar.a(bcVar18, -1L, bbVar);
                                                                                            } else {
                                                                                                bbVar.a(i2);
                                                                                            }
                                                                                        } else if (set.contains(bcVar17)) {
                                                                                            bqVar.a(bcVar17, -1L, bbVar);
                                                                                        } else {
                                                                                            bbVar.a(i2);
                                                                                        }
                                                                                    } else if (set.contains(bcVar16)) {
                                                                                        bqVar.a(bcVar16, -1L, bbVar);
                                                                                    } else {
                                                                                        bbVar.a(i2);
                                                                                    }
                                                                                } else if (set.contains(bcVar15)) {
                                                                                    bqVar.a(bcVar15, -1L, bbVar);
                                                                                } else {
                                                                                    bbVar.a(i2);
                                                                                }
                                                                            } else if (set.contains(bcVar14)) {
                                                                                bqVar.a(bcVar14, -1L, bbVar);
                                                                            } else {
                                                                                bbVar.a(i2);
                                                                            }
                                                                        } else if (set.contains(bcVar13)) {
                                                                            bqVar.a(bcVar13, -1L, bbVar);
                                                                        } else {
                                                                            bbVar.a(i2 + i + i);
                                                                        }
                                                                    } else if (set.contains(bcVar12)) {
                                                                        bqVar.a(bcVar12, -1L, bbVar);
                                                                    } else {
                                                                        bbVar.a(i2);
                                                                    }
                                                                } else if (set.contains(bcVar11)) {
                                                                    bqVar.a(bcVar11, -1L, bbVar);
                                                                } else {
                                                                    bbVar.a(i2 + i);
                                                                }
                                                            } else if (set.contains(bcVar10)) {
                                                                bqVar.a(bcVar10, -1L, bbVar);
                                                            } else {
                                                                bbVar.a(i2);
                                                            }
                                                        } else if (set.contains(bcVar9)) {
                                                            bqVar.a(bcVar9, -1L, bbVar);
                                                        } else {
                                                            bbVar.a(i2 + i);
                                                        }
                                                    } else if (set.contains(bcVar8)) {
                                                        bqVar.a(bcVar8, -1L, bbVar);
                                                    } else {
                                                        bbVar.a(i2 + i + i);
                                                    }
                                                } else if (set.contains(bcVar7)) {
                                                    bqVar.a(bcVar7, -1L, bbVar);
                                                } else {
                                                    bbVar.a(i2 + i + i);
                                                }
                                            } else if (set.contains(bcVar6)) {
                                                bqVar.a(bcVar6, -1L, bbVar);
                                            } else {
                                                bbVar.a(i2 + i2);
                                            }
                                        } else if (set.contains(bcVar5)) {
                                            bqVar.a(bcVar5, -1L, bbVar);
                                        } else {
                                            bbVar.a(i2);
                                        }
                                        j2 = j3;
                                        i3 = iE2;
                                        j = j4;
                                    }
                                } else {
                                    bc bcVar27 = bc.HEAP_DUMP_END;
                                    if (iE != bcVar27.K) {
                                        bbVar.a(jD);
                                    } else if (set.contains(bcVar27)) {
                                        bqVar.a(bcVar27, jD, bbVar);
                                    }
                                }
                            } else if (set.contains(bcVar4)) {
                                bqVar.a(bcVar4, jD, bbVar);
                            } else {
                                bbVar.a(jD);
                            }
                        } else if (set.contains(bcVar3)) {
                            bqVar.a(bcVar3, jD, bbVar);
                        } else {
                            bbVar.a(jD);
                        }
                    } else if (set.contains(bcVar2)) {
                        bqVar.a(bcVar2, jD, bbVar);
                    } else {
                        bbVar.a(jD);
                    }
                } else if (set.contains(bcVar)) {
                    bqVar.a(bcVar, jD, bbVar);
                } else {
                    bbVar.a(jD);
                }
            }
            long j6 = bbVar.f598a;
            AbstractC3375el.n(nVarA, null);
            return j6;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(nVarA, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ bz(ca caVar, ax axVar, byte b) {
        this(caVar, axVar);
    }
}
