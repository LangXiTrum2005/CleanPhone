package mi;

import android.util.Log;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.e1;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.f f46088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46089b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d5.o f46091d;

    public x(xi.f fVar) {
        HashMap map = new HashMap();
        this.f46090c = map;
        this.f46091d = new d5.o(13);
        this.f46088a = fVar;
        a0 a0Var = d0.f45980a;
        c0 c0Var = new c0();
        c0Var.f45979a = false;
        c0 c0Var2 = new c0[]{c0Var}[0];
        c0Var2.getClass();
        map.put(4294967556L, c0Var2);
    }

    public final void a(u uVar, final bc.i iVar) {
        long j10;
        long j11;
        byte[] bytes = null;
        xi.e eVar = iVar == null ? null : new xi.e() { // from class: mi.v
            @Override // xi.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean boolValueOf = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                iVar.c(boolValueOf.booleanValue());
            }
        };
        try {
            String str = uVar.f46081g;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
            }
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(uVar.f46075a);
            int i10 = uVar.f46076b;
            if (i10 == 1) {
                j10 = 0;
            } else if (i10 == 2) {
                j10 = 1;
            } else {
                if (i10 != 3) {
                    throw null;
                }
                j10 = 2;
            }
            byteBufferAllocateDirect.putLong(j10);
            byteBufferAllocateDirect.putLong(uVar.f46077c);
            byteBufferAllocateDirect.putLong(uVar.f46078d);
            byteBufferAllocateDirect.putLong(uVar.f46079e ? 1L : 0L);
            int i11 = uVar.f46080f;
            if (i11 == 1) {
                j11 = 0;
            } else if (i11 == 2) {
                j11 = 1;
            } else if (i11 == 3) {
                j11 = 2;
            } else if (i11 == 4) {
                j11 = 3;
            } else {
                if (i11 != 5) {
                    throw null;
                }
                j11 = 4;
            }
            byteBufferAllocateDirect.putLong(j11);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            this.f46088a.m("flutter/keydata", byteBufferAllocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z10, Long l, Long l10, long j10) {
        u uVar = new u();
        uVar.f46075a = j10;
        uVar.f46076b = z10 ? 1 : 2;
        uVar.f46078d = l.longValue();
        uVar.f46077c = l10.longValue();
        uVar.f46081g = null;
        uVar.f46079e = true;
        uVar.f46080f = 1;
        if (l10.longValue() != 0 && l.longValue() != 0) {
            if (!z10) {
                l = null;
            }
            d(l10, l);
        }
        a(uVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d5  */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x02c6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mi.y
    public final void c(final KeyEvent keyEvent, bc.i iVar) {
        Long lValueOf;
        boolean z10;
        Long l;
        int i10;
        String str;
        int i11;
        int i12;
        c0 c0Var;
        int i13;
        char cCharValue;
        String str2;
        HashMap map;
        int i14;
        final long j10;
        int i15;
        int i16;
        int i17;
        x xVar = this;
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                lValueOf = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            } else {
                lValueOf = (Long) d0.f45980a.get(Long.valueOf(scanCode));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf((((long) keyEvent.getScanCode()) & 4294967295L) | 73014444032L);
                }
            }
            Long l10 = lValueOf;
            Long lValueOf2 = (Long) d0.f45981b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            }
            Long l11 = lValueOf2;
            ArrayList arrayList = new ArrayList();
            b2.w[] wVarArr = d0.f45982c;
            int length = wVarArr.length;
            int i18 = 0;
            while (true) {
                int i19 = 2;
                HashMap map2 = xVar.f46089b;
                if (i18 >= length) {
                    HashMap map3 = map2;
                    Long l12 = l11;
                    HashMap map4 = xVar.f46090c;
                    for (c0 c0Var2 : map4.values()) {
                        int metaState = keyEvent.getMetaState();
                        c0Var2.getClass();
                        boolean z11 = (metaState & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
                        if (4294967556L == l12.longValue() || c0Var2.f45979a == z11) {
                            map = map3;
                        } else {
                            map = map3;
                            boolean zContainsKey = map.containsKey(458809L);
                            boolean z12 = !zContainsKey;
                            if (!zContainsKey) {
                                c0Var2.f45979a = !c0Var2.f45979a;
                            }
                            xVar.b(z12, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (zContainsKey) {
                                c0Var2.f45979a = !c0Var2.f45979a;
                            }
                            b(zContainsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        xVar = this;
                        map3 = map;
                    }
                    HashMap map5 = map3;
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z10 = true;
                    } else {
                        if (action != 1) {
                            xVar = this;
                            break;
                        }
                        z10 = false;
                    }
                    Long l13 = (Long) map5.get(l10);
                    if (!z10) {
                        xVar = this;
                        l = l10;
                        if (l13 == null) {
                            break;
                        }
                        i10 = 2;
                        str = null;
                        i11 = 1;
                        i12 = 3;
                    } else {
                        if (l13 == null) {
                            i13 = 1;
                        } else {
                            if (keyEvent.getRepeatCount() > 0) {
                                i13 = 3;
                            } else {
                                xVar = this;
                                l = l10;
                                xVar.b(false, l13, l, keyEvent.getEventTime());
                                i13 = 1;
                            }
                            cCharValue = xVar.f46091d.b(keyEvent.getUnicodeChar()).charValue();
                            if (cCharValue != 0) {
                                str2 = "" + cCharValue;
                            } else {
                                str2 = null;
                            }
                            i10 = i13;
                            str = str2;
                            i12 = 3;
                            i11 = 1;
                        }
                        xVar = this;
                        l = l10;
                        cCharValue = xVar.f46091d.b(keyEvent.getUnicodeChar()).charValue();
                        if (cCharValue != 0) {
                            str2 = "" + cCharValue;
                        } else {
                            str2 = null;
                        }
                        i10 = i13;
                        str = str2;
                        i12 = 3;
                        i11 = 1;
                    }
                    if (i10 != i12) {
                        xVar.d(l, z10 ? l12 : null);
                    }
                    if (i10 == i11 && (c0Var = (c0) map4.get(l12)) != null) {
                        c0Var.f45979a = (c0Var.f45979a ? 1 : 0) ^ i11;
                    }
                    u uVar = new u();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        uVar.f46080f = 2;
                    } else if (source == 1025) {
                        uVar.f46080f = i12;
                    } else if (source == 16777232) {
                        uVar.f46080f = 4;
                    } else if (source != 33554433) {
                        uVar.f46080f = 1;
                    } else {
                        uVar.f46080f = 5;
                    }
                    uVar.f46075a = keyEvent.getEventTime();
                    uVar.f46076b = i10;
                    uVar.f46078d = l12.longValue();
                    uVar.f46077c = l.longValue();
                    uVar.f46081g = str;
                    uVar.f46079e = false;
                    xVar.a(uVar, iVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                b2.w wVar = wVarArr[i18];
                boolean z13 = (wVar.f5410b & keyEvent.getMetaState()) != 0;
                long jLongValue = l11.longValue();
                long jLongValue2 = l10.longValue();
                e1[] e1VarArr = (e1[]) wVar.f5411c;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr = new Boolean[2];
                int i20 = 0;
                boolean z14 = false;
                while (i20 < i19) {
                    final e1 e1Var = e1VarArr[i20];
                    boolean[] zArr2 = zArr;
                    boolean zContainsKey2 = map2.containsKey(Long.valueOf(e1Var.f13801a));
                    zArr2[i20] = zContainsKey2;
                    Long l14 = l11;
                    if (e1Var.f13802b == jLongValue) {
                        boolean z15 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            i16 = 1;
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i17 = 2;
                        } else {
                            i16 = 1;
                            i17 = z15 ? 3 : 1;
                        }
                        int iC = v0.i.c(i17);
                        if (iC == 0) {
                            map2 = map2;
                            boolArr = boolArr;
                            i14 = i20;
                            j10 = jLongValue2;
                            i15 = 2;
                            i18 = i18;
                            boolArr[i14] = Boolean.FALSE;
                            if (!z13) {
                                final int i21 = 0;
                                arrayList.add(new Runnable(this) { // from class: mi.w

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ x f46084b;

                                    {
                                        this.f46084b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i21) {
                                            case 0:
                                                x xVar2 = this.f46084b;
                                                xVar2.getClass();
                                                xVar2.b(false, Long.valueOf(e1Var.f13802b), Long.valueOf(j10), keyEvent.getEventTime());
                                                break;
                                            default:
                                                x xVar3 = this.f46084b;
                                                xVar3.getClass();
                                                xVar3.b(false, Long.valueOf(e1Var.f13802b), Long.valueOf(j10), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (iC != i16) {
                            i15 = 2;
                            if (iC != 2) {
                                i18 = i18;
                                i15 = 2;
                                map2 = map2;
                                boolArr = boolArr;
                                i14 = i20;
                                j10 = jLongValue2;
                            } else {
                                if (z13) {
                                    i14 = i20;
                                    j10 = jLongValue2;
                                } else {
                                    int i22 = i20;
                                    final int i23 = 1;
                                    i14 = i22;
                                    j10 = jLongValue2;
                                    arrayList.add(new Runnable(this) { // from class: mi.w

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ x f46084b;

                                        {
                                            this.f46084b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    x xVar2 = this.f46084b;
                                                    xVar2.getClass();
                                                    xVar2.b(false, Long.valueOf(e1Var.f13802b), Long.valueOf(j10), keyEvent.getEventTime());
                                                    break;
                                                default:
                                                    x xVar3 = this.f46084b;
                                                    xVar3.getClass();
                                                    xVar3.b(false, Long.valueOf(e1Var.f13802b), Long.valueOf(j10), keyEvent.getEventTime());
                                                    break;
                                            }
                                        }
                                    });
                                }
                                boolArr[i14] = Boolean.valueOf(zArr2[i14]);
                            }
                        } else {
                            i18 = i18;
                            map2 = map2;
                            boolArr = boolArr;
                            i14 = i20;
                            j10 = jLongValue2;
                            i15 = 2;
                            boolArr[i14] = Boolean.valueOf(zArr2[i14]);
                        }
                        z14 = true;
                    } else {
                        i18 = i18;
                        map2 = map2;
                        boolArr = boolArr;
                        i14 = i20;
                        j10 = jLongValue2;
                        i15 = 2;
                        z14 = z14 || zContainsKey2;
                    }
                    i20 = i14 + 1;
                    jLongValue2 = j10;
                    i19 = i15;
                    boolArr = boolArr;
                    i18 = i18;
                    zArr = zArr2;
                    l11 = l14;
                    map2 = map2;
                }
                int i24 = i18;
                int i25 = i19;
                boolean[] zArr3 = zArr;
                Long l15 = l11;
                Boolean[] boolArr2 = boolArr;
                if (z13) {
                    for (int i26 = 0; i26 < i25; i26++) {
                        if (boolArr2[i26] == null) {
                            if (z14) {
                                boolArr2[i26] = Boolean.valueOf(zArr3[i26]);
                            } else {
                                boolArr2[i26] = Boolean.TRUE;
                                z14 = true;
                            }
                        }
                    }
                    if (!z14) {
                        boolArr2[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i27 = 0; i27 < i25; i27++) {
                        if (boolArr2[i27] == null) {
                            boolArr2[i27] = Boolean.FALSE;
                        }
                    }
                }
                for (int i28 = 0; i28 < i25; i28++) {
                    if (zArr3[i28] != boolArr2[i28].booleanValue()) {
                        e1 e1Var2 = e1VarArr[i28];
                        b(boolArr2[i28].booleanValue(), Long.valueOf(e1Var2.f13802b), Long.valueOf(e1Var2.f13801a), keyEvent.getEventTime());
                    }
                }
                xVar = this;
                i18 = i24 + 1;
                l11 = l15;
            }
        }
        xVar.b(true, 0L, 0L, 0L);
        iVar.c(true);
    }

    public final void d(Long l, Long l10) {
        HashMap map = this.f46089b;
        if (l10 != null) {
            if (((Long) map.put(l, l10)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) map.remove(l)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
