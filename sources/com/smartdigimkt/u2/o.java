package com.smartdigimkt.u2;

import com.smartdigimkt.expressad.video.module.AnythinkVideoView;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o extends k {
    private boolean m0;
    private boolean n0;
    private boolean o0;
    private boolean p0;
    private boolean q0;
    protected int r0;
    private Map<Integer, String> s0;
    private int t0;

    public o(com.smartdigimkt.x.d dVar, com.smartdigimkt.d3.c cVar, com.smartdigimkt.c3.c cVar2, String str, String str2, com.smartdigimkt.t2.a aVar, int i2, boolean z2) {
        super(dVar, cVar2, cVar, str, str2, aVar, i2, z2);
        this.q0 = false;
        this.r0 = 0;
        this.t0 = -1;
        if (this.W) {
            this.s0 = dVar.Y();
        }
        this.r0 = dVar.o2();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f4 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:16:0x001b, B:20:0x0028, B:22:0x002c, B:23:0x0032, B:24:0x0043, B:69:0x010e, B:25:0x004b, B:27:0x0056, B:29:0x005a, B:32:0x0069, B:34:0x006d, B:35:0x0071, B:37:0x008d, B:38:0x0096, B:40:0x009a, B:45:0x00a2, B:46:0x00a6, B:47:0x00a9, B:50:0x00af, B:52:0x00b3, B:54:0x00bc, B:56:0x00c0, B:58:0x00d2, B:60:0x00d6, B:61:0x00e6, B:63:0x00ea, B:64:0x00f4, B:66:0x00f8, B:68:0x00fc), top: B:73:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:16:0x001b, B:20:0x0028, B:22:0x002c, B:23:0x0032, B:24:0x0043, B:69:0x010e, B:25:0x004b, B:27:0x0056, B:29:0x005a, B:32:0x0069, B:34:0x006d, B:35:0x0071, B:37:0x008d, B:38:0x0096, B:40:0x009a, B:45:0x00a2, B:46:0x00a6, B:47:0x00a9, B:50:0x00af, B:52:0x00b3, B:54:0x00bc, B:56:0x00c0, B:58:0x00d2, B:60:0x00d6, B:61:0x00e6, B:63:0x00ea, B:64:0x00f4, B:66:0x00f8, B:68:0x00fc), top: B:73:0x0002 }] */
    @Override // com.smartdigimkt.u2.k, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        int i3;
        int iT;
        com.smartdigimkt.x.d dVar;
        try {
            if (i2 == 2) {
                if (this.W && !this.o0) {
                    this.o0 = true;
                    l();
                    com.smartdigimkt.v2.a.c(com.smartdigimkt.m6.b.p().k(), this.X);
                }
            } else if (i2 != 130) {
                if (i2 == 6) {
                    if (this.W) {
                        this.o0 = true;
                        l();
                        com.smartdigimkt.v2.a.c(com.smartdigimkt.m6.b.p().k(), this.X);
                    }
                } else if (i2 != 7) {
                    if (i2 == 15) {
                        j();
                        h();
                        i();
                        if (obj == null || !(obj instanceof AnythinkVideoView.t)) {
                            i3 = 0;
                            iT = 0;
                        } else {
                            i3 = ((AnythinkVideoView.t) obj).f34819a;
                            iT = ((AnythinkVideoView.t) obj).f34820b;
                        }
                        if (iT == 0 && (dVar = this.X) != null) {
                            iT = dVar.t();
                        }
                        com.smartdigimkt.v2.a.a(com.smartdigimkt.m6.b.p().k(), this.X, i3, iT, this.f0);
                        com.smartdigimkt.v2.a.a(this.X, this.s0, this.f38797c0, i3);
                        if (!this.p0) {
                            this.p0 = true;
                            com.smartdigimkt.v2.a.a(this.X, this.f38797c0);
                        }
                        if (!this.q0) {
                            int i4 = this.r0;
                            if (i4 != 0) {
                                iT = i4;
                            }
                            if (i3 >= iT) {
                                this.q0 = true;
                                i2 = 17;
                            }
                        }
                        this.t0 = i3;
                    } else if (i2 != 16) {
                        switch (i2) {
                            case 11:
                                a();
                                l();
                                break;
                            case 12:
                                if (obj != null && (obj instanceof String)) {
                                    b((String) obj);
                                }
                                l();
                                c();
                                b();
                                e();
                                a();
                                break;
                            case 13:
                                c();
                                b();
                                break;
                        }
                    } else if (this.W) {
                        this.o0 = true;
                        l();
                        com.smartdigimkt.v2.a.c(com.smartdigimkt.m6.b.p().k(), this.X);
                    }
                } else if (this.W && obj != null && (obj instanceof Integer)) {
                    int iIntValue = ((Integer) obj).intValue();
                    if (iIntValue == 2) {
                        if (!this.n0) {
                            this.n0 = true;
                            com.smartdigimkt.v2.a.i(com.smartdigimkt.m6.b.p().k(), this.X);
                        }
                    } else if (iIntValue == 1 && !this.m0) {
                        this.m0 = true;
                        com.smartdigimkt.v2.a.k(com.smartdigimkt.m6.b.p().k(), this.X);
                    }
                }
            } else if (obj instanceof Integer) {
                this.r0 = ((Integer) obj).intValue();
            }
            this.e0.a(i2, obj);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
