package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class TE implements InterfaceC4177nt {
    public InterfaceC4353pt b;
    public int c;
    public int d;
    public int e;
    public MotionPhotoMetadata g;
    public InterfaceC4265ot h;
    public C4204o90 i;
    public PP j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JT f3763a = new JT(6);
    public long f = -1;

    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        String strO;
        FG fgS;
        MotionPhotoMetadata motionPhotoMetadata;
        long j;
        int i = this.c;
        JT jt = this.f3763a;
        if (i == 0) {
            jt.B(2);
            interfaceC4265ot.readFully(jt.f3266a, 0, 2);
            int iY = jt.y();
            this.d = iY;
            if (iY == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                c();
                return 0;
            }
            if ((iY >= 65488 && iY <= 65497) || iY == 65281) {
                return 0;
            }
            this.c = 1;
            return 0;
        }
        if (i == 1) {
            jt.B(2);
            interfaceC4265ot.readFully(jt.f3266a, 0, 2);
            this.e = jt.y() - 2;
            this.c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || interfaceC4265ot != this.h) {
                    this.h = interfaceC4265ot;
                    this.i = new C4204o90(interfaceC4265ot, this.f);
                }
                PP pp = this.j;
                pp.getClass();
                int iA = pp.a(this.i, c2868Wu);
                if (iA == 1) {
                    c2868Wu.b += this.f;
                }
                return iA;
            }
            long position = interfaceC4265ot.getPosition();
            long j2 = this.f;
            if (position != j2) {
                c2868Wu.b = j2;
                return 1;
            }
            if (interfaceC4265ot.peekFully(jt.f3266a, 0, 1, true)) {
                interfaceC4265ot.resetPeekPosition();
                if (this.j == null) {
                    this.j = new PP();
                }
                C4204o90 c4204o90 = new C4204o90(interfaceC4265ot, this.f);
                this.i = c4204o90;
                this.j.getClass();
                if (FW.d0(c4204o90, false, false)) {
                    PP pp2 = this.j;
                    long j3 = this.f;
                    InterfaceC4353pt interfaceC4353pt = this.b;
                    interfaceC4353pt.getClass();
                    pp2.q = new C4380q90(j3, interfaceC4353pt);
                    MotionPhotoMetadata motionPhotoMetadata2 = this.g;
                    motionPhotoMetadata2.getClass();
                    e(motionPhotoMetadata2);
                    this.c = 5;
                } else {
                    c();
                }
            } else {
                c();
            }
            return 0;
        }
        if (this.d == 65505) {
            JT jt2 = new JT(this.e);
            interfaceC4265ot.readFully(jt2.f3266a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(jt2.o()) && (strO = jt2.o()) != null) {
                long length = interfaceC4265ot.getLength();
                if (length == -1) {
                    motionPhotoMetadata = null;
                } else {
                    try {
                        fgS = AbstractC3375el.S(strO);
                    } catch (KT | NumberFormatException | XmlPullParserException unused) {
                        AbstractC4038mJ.f();
                        fgS = null;
                    }
                    if (fgS != null && ((List) fgS.b).size() >= 2) {
                        int size = ((List) fgS.b).size() - 1;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        boolean z = false;
                        while (size >= 0) {
                            LP lp = (LP) ((List) fgS.b).get(size);
                            boolean zEquals = MimeTypes.VIDEO_MP4.equals(lp.f3353a) | z;
                            if (size == 0) {
                                length -= lp.c;
                                j = 0;
                            } else {
                                j = length - lp.b;
                            }
                            long j8 = j;
                            long j9 = length;
                            length = j8;
                            if (zEquals && length != j9) {
                                j7 = j9 - length;
                                j6 = length;
                                zEquals = false;
                            }
                            if (size == 0) {
                                j5 = j9;
                                j4 = length;
                            }
                            size--;
                            z = zEquals;
                        }
                        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                            motionPhotoMetadata = null;
                        } else {
                            motionPhotoMetadata = new MotionPhotoMetadata(j4, j5, fgS.f3061a, j6, j7);
                        }
                    } else {
                        motionPhotoMetadata = null;
                    }
                }
                this.g = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.f = motionPhotoMetadata.videoStartPosition;
                }
            }
        } else {
            interfaceC4265ot.skipFully(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) throws EOFException, InterruptedIOException {
        C2938Zm c2938Zm = (C2938Zm) interfaceC4265ot;
        JT jt = this.f3763a;
        jt.B(2);
        c2938Zm.peekFully(jt.f3266a, 0, 2, false);
        if (jt.y() != 65496) {
            return false;
        }
        jt.B(2);
        c2938Zm.peekFully(jt.f3266a, 0, 2, false);
        int iY = jt.y();
        this.d = iY;
        if (iY == 65504) {
            jt.B(2);
            c2938Zm.peekFully(jt.f3266a, 0, 2, false);
            c2938Zm.advancePeekPosition(jt.y() - 2, false);
            jt.B(2);
            c2938Zm.peekFully(jt.f3266a, 0, 2, false);
            this.d = jt.y();
        }
        if (this.d != 65505) {
            return false;
        }
        c2938Zm.advancePeekPosition(2, false);
        jt.B(6);
        c2938Zm.peekFully(jt.f3266a, 0, 6, false);
        return jt.u() == 1165519206 && jt.y() == 0;
    }

    public final void c() {
        e(new Metadata.Entry[0]);
        InterfaceC4353pt interfaceC4353pt = this.b;
        interfaceC4353pt.getClass();
        interfaceC4353pt.endTracks();
        this.b.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        this.c = 6;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.b = interfaceC4353pt;
    }

    public final void e(Metadata.Entry... entryArr) {
        InterfaceC4353pt interfaceC4353pt = this.b;
        interfaceC4353pt.getClass();
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(1024, 4);
        C4531rw c4531rw = new C4531rw();
        c4531rw.j = "image/jpeg";
        c4531rw.i = new Metadata(entryArr);
        interfaceC4326pd0Track.e(new C4619sw(c4531rw));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
        PP pp = this.j;
        if (pp != null) {
            pp.getClass();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            PP pp = this.j;
            pp.getClass();
            pp.seek(j, j2);
        }
    }
}
