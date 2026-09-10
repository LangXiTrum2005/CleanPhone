package wf;

import an.p;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import g9.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import wj.j;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements eg.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f53187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f53188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fc.f f53189c;

    public d(final fc.f fVar) {
        this.f53189c = fVar;
        final int i10 = 0;
        this.f53187a = r9.b.u(new jk.a() { // from class: wf.c
            @Override // jk.a
            public final Object invoke() throws IOException {
                k kVar;
                pf.c cVar;
                int i11;
                pf.a aVar;
                switch (i10) {
                    case 0:
                        e eVar = (e) ((u) fVar.f40781c).f54881d;
                        eVar.getClass();
                        MediaFormat mediaFormat = (MediaFormat) eVar.l(vf.c.AUDIO);
                        String string = mediaFormat.getString("mime");
                        n.c(string);
                        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(string);
                        n.e(mediaCodecCreateEncoderByType, "createEncoderByType(...)");
                        mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                        return new b(mediaCodecCreateEncoderByType, null, null);
                    default:
                        fc.f fVar2 = fVar;
                        e eVar2 = (e) ((u) fVar2.f40781c).f54881d;
                        eVar2.getClass();
                        MediaFormat mediaFormat2 = (MediaFormat) eVar2.l(vf.c.VIDEO);
                        int integer = mediaFormat2.getInteger("width");
                        int integer2 = mediaFormat2.getInteger("height");
                        ec.a aVar2 = (ec.a) fVar2.f40783e;
                        int integer3 = mediaFormat2.getInteger("rotation-degrees");
                        StringBuilder sbL = l1.d.l("Destination video surface size: ", integer, "x", integer2, " @ ");
                        sbL.append(integer3);
                        aVar2.a(sbL.toString());
                        aVar2.a("Destination video format: " + mediaFormat2);
                        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                        n.e(codecInfos, "getCodecInfos(...)");
                        ArrayList arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                            if (mediaCodecInfo.isEncoder()) {
                                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                                n.e(supportedTypes, "getSupportedTypes(...)");
                                for (String str : supportedTypes) {
                                    n.c(str);
                                    if (p.p0(str, "video/", false)) {
                                        arrayList.add(mediaCodecInfo);
                                    }
                                    break;
                                }
                            }
                        }
                        aVar2.a("Available encoders: " + xj.n.u0(arrayList, null, null, null, new bh.a(29), 31));
                        String string2 = mediaFormat2.getString("mime");
                        n.c(string2);
                        MediaCodec mediaCodecCreateEncoderByType2 = MediaCodec.createEncoderByType(string2);
                        n.e(mediaCodecCreateEncoderByType2, "createEncoderByType(...)");
                        int i12 = 1;
                        mediaCodecCreateEncoderByType2.configure(mediaFormat2, (Surface) null, (MediaCrypto) null, 1);
                        aVar2.a("Selected encoder " + mediaCodecCreateEncoderByType2.getName());
                        Surface surfaceCreateInputSurface = mediaCodecCreateEncoderByType2.createInputSurface();
                        n.e(surfaceCreateInputSurface, "createInputSurface(...)");
                        aVar2.a("Creating OpenGL context on " + Thread.currentThread() + " (" + surfaceCreateInputSurface.isValid() + ")");
                        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                        k kVar2 = new k(25);
                        pf.c cVar2 = pf.d.f48353b;
                        kVar2.f41770b = cVar2;
                        pf.b bVar = pf.d.f48352a;
                        kVar2.f41771c = bVar;
                        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                        pf.c cVar3 = new pf.c(eGLDisplayEglGetDisplay);
                        kVar2.f41770b = cVar3;
                        if (cVar3 == cVar2) {
                            throw new RuntimeException("unable to get EGL14 display");
                        }
                        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
                            throw new RuntimeException("unable to initialize EGL14");
                        }
                        if (((pf.b) kVar2.f41771c) == bVar) {
                            pf.c display = (pf.c) kVar2.f41770b;
                            n.f(display, "display");
                            kVar = kVar2;
                            cVar = cVar2;
                            i11 = 1;
                            i12 = 1;
                            pf.a[] aVarArr = new pf.a[1];
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            boolean zEglChooseConfig = EGL14.eglChooseConfig(display.f48351a, new int[]{pf.d.f48361j, 8, pf.d.f48362k, 8, pf.d.l, 8, pf.d.f48363m, 8, pf.d.f48364n, pf.d.f48365o | pf.d.f48366p, pf.d.f48367q, pf.d.f48360i, 12610, 1, pf.d.f48356e}, 0, eGLConfigArr, 0, 1, new int[1], 0);
                            if (zEglChooseConfig) {
                                pk.b it = xj.k.q0(aVarArr).iterator();
                                while (it.f48398c) {
                                    int iNextInt = it.nextInt();
                                    EGLConfig eGLConfig = eGLConfigArr[iNextInt];
                                    aVarArr[iNextInt] = eGLConfig == null ? null : new pf.a(eGLConfig);
                                }
                            }
                            if (zEglChooseConfig) {
                                aVar = aVarArr[0];
                            } else {
                                Log.w("EglConfigChooser", "Unable to find RGB8888 / 2 EGLConfig");
                                aVar = null;
                            }
                            if (aVar == null) {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                            pf.b bVar2 = new pf.b(EGL14.eglCreateContext(((pf.c) kVar.f41770b).f48351a, aVar.f48349a, eGLContext, new int[]{pf.d.f48359h, 2, pf.d.f48356e}, 0));
                            nf.a.a("eglCreateContext (2)");
                            kVar.f41772d = aVar;
                            kVar.f41771c = bVar2;
                        } else {
                            kVar = kVar2;
                            cVar = cVar2;
                            i11 = 1;
                        }
                        int[] iArr = {pf.d.f48356e};
                        pf.c cVar4 = (pf.c) kVar.f41770b;
                        pf.a aVar3 = (pf.a) kVar.f41772d;
                        n.c(aVar3);
                        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(cVar4.f48351a, aVar3.f48349a, surfaceCreateInputSurface, iArr, 0);
                        pf.e eVar3 = new pf.e(eGLSurfaceEglCreateWindowSurface);
                        nf.a.a("eglCreateWindowSurface");
                        if (eVar3 == pf.d.f48354c) {
                            throw new RuntimeException("surface was null");
                        }
                        rf.a aVar4 = new rf.a();
                        aVar4.f49570a = kVar;
                        aVar4.f49571b = eVar3;
                        aVar4.f49572c = -1;
                        aVar4.f49573d = -1;
                        aVar4.f49574e = surfaceCreateInputSurface;
                        if (((pf.c) kVar.f41770b) == cVar) {
                            Log.v("EglCore", "NOTE: makeSurfaceCurrent w/o display");
                        }
                        if (!EGL14.eglMakeCurrent(((pf.c) kVar.f41770b).f48351a, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, ((pf.b) kVar.f41771c).f48350a)) {
                            throw new RuntimeException("eglMakeCurrent failed");
                        }
                        int i13 = aVar4.f49572c;
                        if (i13 < 0) {
                            pf.e eglSurface = aVar4.f49571b;
                            int i14 = pf.d.f48357f;
                            n.f(eglSurface, "eglSurface");
                            int[] iArr2 = new int[i11];
                            EGL14.eglQuerySurface(((pf.c) kVar.f41770b).f48351a, eglSurface.f48368a, i14, iArr2, 0);
                            i13 = iArr2[0];
                        }
                        int i15 = aVar4.f49573d;
                        if (i15 < 0) {
                            pf.e eglSurface2 = aVar4.f49571b;
                            int i16 = pf.d.f48358g;
                            n.f(eglSurface2, "eglSurface");
                            int[] iArr3 = new int[i11];
                            EGL14.eglQuerySurface(((pf.c) kVar.f41770b).f48351a, eglSurface2.f48368a, i16, iArr3, 0);
                            i15 = iArr3[0];
                        }
                        if (i13 != integer || i15 != integer2) {
                            int i17 = aVar4.f49572c;
                            if (i17 < 0) {
                                pf.e eglSurface3 = aVar4.f49571b;
                                int i18 = pf.d.f48357f;
                                n.f(eglSurface3, "eglSurface");
                                int[] iArr4 = new int[i11];
                                EGL14.eglQuerySurface(((pf.c) kVar.f41770b).f48351a, eglSurface3.f48368a, i18, iArr4, 0);
                                i17 = iArr4[0];
                            }
                            int i19 = aVar4.f49573d;
                            if (i19 < 0) {
                                pf.e eglSurface4 = aVar4.f49571b;
                                int i20 = pf.d.f48358g;
                                n.f(eglSurface4, "eglSurface");
                                int[] iArr5 = new int[i11];
                                EGL14.eglQuerySurface(((pf.c) kVar.f41770b).f48351a, eglSurface4.f48368a, i20, iArr5, 0);
                                i19 = iArr5[0];
                            }
                            StringBuilder sbL2 = l1.d.l("OpenGL surface has wrong size (expected: ", integer, "x", integer2, ", found: ");
                            sbL2.append(i17);
                            sbL2.append("x");
                            sbL2.append(i19);
                            sbL2.append(").");
                            aVar2.b(3, null, sbL2.toString());
                            if (n.a(mediaCodecCreateEncoderByType2.getName(), "c2.android.avc.encoder") && i13 == i12 && i15 == i12) {
                                throw new IllegalStateException("c2.android.avc.encoder was unable to create the input surface (1x1).");
                            }
                        }
                        return new b(mediaCodecCreateEncoderByType2, new m5.k(29, kVar, aVar4), null);
                }
            }
        });
        final int i11 = 1;
        this.f53188b = r9.b.u(new jk.a() { // from class: wf.c
            @Override // jk.a
            public final Object invoke() throws IOException {
                k kVar;
                pf.c cVar;
                int i12;
                pf.a aVar;
                switch (i11) {
                    case 0:
                        e eVar = (e) ((u) fVar.f40781c).f54881d;
                        eVar.getClass();
                        MediaFormat mediaFormat = (MediaFormat) eVar.l(vf.c.AUDIO);
                        String string = mediaFormat.getString("mime");
                        n.c(string);
                        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(string);
                        n.e(mediaCodecCreateEncoderByType, "createEncoderByType(...)");
                        mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                        return new b(mediaCodecCreateEncoderByType, null, null);
                    default:
                        fc.f fVar2 = fVar;
                        e eVar2 = (e) ((u) fVar2.f40781c).f54881d;
                        eVar2.getClass();
                        MediaFormat mediaFormat2 = (MediaFormat) eVar2.l(vf.c.VIDEO);
                        int integer = mediaFormat2.getInteger("width");
                        int integer2 = mediaFormat2.getInteger("height");
                        ec.a aVar2 = (ec.a) fVar2.f40783e;
                        int integer3 = mediaFormat2.getInteger("rotation-degrees");
                        StringBuilder sbL = l1.d.l("Destination video surface size: ", integer, "x", integer2, " @ ");
                        sbL.append(integer3);
                        aVar2.a(sbL.toString());
                        aVar2.a("Destination video format: " + mediaFormat2);
                        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                        n.e(codecInfos, "getCodecInfos(...)");
                        ArrayList arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                            if (mediaCodecInfo.isEncoder()) {
                                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                                n.e(supportedTypes, "getSupportedTypes(...)");
                                for (String str : supportedTypes) {
                                    n.c(str);
                                    if (p.p0(str, "video/", false)) {
                                        arrayList.add(mediaCodecInfo);
                                    }
                                    break;
                                }
                            }
                        }
                        aVar2.a("Available encoders: " + xj.n.u0(arrayList, null, null, null, new bh.a(29), 31));
                        String string2 = mediaFormat2.getString("mime");
                        n.c(string2);
                        MediaCodec mediaCodecCreateEncoderByType2 = MediaCodec.createEncoderByType(string2);
                        n.e(mediaCodecCreateEncoderByType2, "createEncoderByType(...)");
                        int i13 = 1;
                        mediaCodecCreateEncoderByType2.configure(mediaFormat2, (Surface) null, (MediaCrypto) null, 1);
                        aVar2.a("Selected encoder " + mediaCodecCreateEncoderByType2.getName());
                        Surface surfaceCreateInputSurface = mediaCodecCreateEncoderByType2.createInputSurface();
                        n.e(surfaceCreateInputSurface, "createInputSurface(...)");
                        aVar2.a("Creating OpenGL context on " + Thread.currentThread() + " (" + surfaceCreateInputSurface.isValid() + ")");
                        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                        k kVar2 = new k(25);
                        pf.c cVar2 = pf.d.f48353b;
                        kVar2.f41770b = cVar2;
                        pf.b bVar = pf.d.f48352a;
                        kVar2.f41771c = bVar;
                        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                        pf.c cVar3 = new pf.c(eGLDisplayEglGetDisplay);
                        kVar2.f41770b = cVar3;
                        if (cVar3 == cVar2) {
                            throw new RuntimeException("unable to get EGL14 display");
                        }
                        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
                            throw new RuntimeException("unable to initialize EGL14");
                        }
                        if (((pf.b) kVar2.f41771c) == bVar) {
                            pf.c display = (pf.c) kVar2.f41770b;
                            n.f(display, "display");
                            kVar = kVar2;
                            cVar = cVar2;
                            i12 = 1;
                            i13 = 1;
                            pf.a[] aVarArr = new pf.a[1];
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            boolean zEglChooseConfig = EGL14.eglChooseConfig(display.f48351a, new int[]{pf.d.f48361j, 8, pf.d.f48362k, 8, pf.d.l, 8, pf.d.f48363m, 8, pf.d.f48364n, pf.d.f48365o | pf.d.f48366p, pf.d.f48367q, pf.d.f48360i, 12610, 1, pf.d.f48356e}, 0, eGLConfigArr, 0, 1, new int[1], 0);
                            if (zEglChooseConfig) {
                                pk.b it = xj.k.q0(aVarArr).iterator();
                                while (it.f48398c) {
                                    int iNextInt = it.nextInt();
                                    EGLConfig eGLConfig = eGLConfigArr[iNextInt];
                                    aVarArr[iNextInt] = eGLConfig == null ? null : new pf.a(eGLConfig);
                                }
                            }
                            if (zEglChooseConfig) {
                                aVar = aVarArr[0];
                            } else {
                                Log.w("EglConfigChooser", "Unable to find RGB8888 / 2 EGLConfig");
                                aVar = null;
                            }
                            if (aVar == null) {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                            pf.b bVar2 = new pf.b(EGL14.eglCreateContext(((pf.c) kVar.f41770b).f48351a, aVar.f48349a, eGLContext, new int[]{pf.d.f48359h, 2, pf.d.f48356e}, 0));
                            nf.a.a("eglCreateContext (2)");
                            kVar.f41772d = aVar;
                            kVar.f41771c = bVar2;
                        } else {
                            kVar = kVar2;
                            cVar = cVar2;
                            i12 = 1;
                        }
                        int[] iArr = {pf.d.f48356e};
                        pf.c cVar4 = (pf.c) kVar.f41770b;
                        pf.a aVar3 = (pf.a) kVar.f41772d;
                        n.c(aVar3);
                        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(cVar4.f48351a, aVar3.f48349a, surfaceCreateInputSurface, iArr, 0);
                        pf.e eVar3 = new pf.e(eGLSurfaceEglCreateWindowSurface);
                        nf.a.a("eglCreateWindowSurface");
                        if (eVar3 == pf.d.f48354c) {
                            throw new RuntimeException("surface was null");
                        }
                        rf.a aVar4 = new rf.a();
                        aVar4.f49570a = kVar;
                        aVar4.f49571b = eVar3;
                        aVar4.f49572c = -1;
                        aVar4.f49573d = -1;
                        aVar4.f49574e = surfaceCreateInputSurface;
                        if (((pf.c) kVar.f41770b) == cVar) {
                            Log.v("EglCore", "NOTE: makeSurfaceCurrent w/o display");
                        }
                        if (!EGL14.eglMakeCurrent(((pf.c) kVar.f41770b).f48351a, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, ((pf.b) kVar.f41771c).f48350a)) {
                            throw new RuntimeException("eglMakeCurrent failed");
                        }
                        int i14 = aVar4.f49572c;
                        if (i14 < 0) {
                            pf.e eglSurface = aVar4.f49571b;
                            int i15 = pf.d.f48357f;
                            n.f(eglSurface, "eglSurface");
                            int[] iArr2 = new int[i12];
                            EGL14.eglQuerySurface(((pf.c) kVar.f41770b).f48351a, eglSurface.f48368a, i15, iArr2, 0);
                            i14 = iArr2[0];
                        }
                        int i16 = aVar4.f49573d;
                        if (i16 < 0) {
                            pf.e eglSurface2 = aVar4.f49571b;
                            int i17 = pf.d.f48358g;
                            n.f(eglSurface2, "eglSurface");
                            int[] iArr3 = new int[i12];
                            EGL14.eglQuerySurface(((pf.c) kVar.f41770b).f48351a, eglSurface2.f48368a, i17, iArr3, 0);
                            i16 = iArr3[0];
                        }
                        if (i14 != integer || i16 != integer2) {
                            int i18 = aVar4.f49572c;
                            if (i18 < 0) {
                                pf.e eglSurface3 = aVar4.f49571b;
                                int i19 = pf.d.f48357f;
                                n.f(eglSurface3, "eglSurface");
                                int[] iArr4 = new int[i12];
                                EGL14.eglQuerySurface(((pf.c) kVar.f41770b).f48351a, eglSurface3.f48368a, i19, iArr4, 0);
                                i18 = iArr4[0];
                            }
                            int i110 = aVar4.f49573d;
                            if (i110 < 0) {
                                pf.e eglSurface4 = aVar4.f49571b;
                                int i20 = pf.d.f48358g;
                                n.f(eglSurface4, "eglSurface");
                                int[] iArr5 = new int[i12];
                                EGL14.eglQuerySurface(((pf.c) kVar.f41770b).f48351a, eglSurface4.f48368a, i20, iArr5, 0);
                                i110 = iArr5[0];
                            }
                            StringBuilder sbL2 = l1.d.l("OpenGL surface has wrong size (expected: ", integer, "x", integer2, ", found: ");
                            sbL2.append(i18);
                            sbL2.append("x");
                            sbL2.append(i110);
                            sbL2.append(").");
                            aVar2.b(3, null, sbL2.toString());
                            if (n.a(mediaCodecCreateEncoderByType2.getName(), "c2.android.avc.encoder") && i14 == i13 && i16 == i13) {
                                throw new IllegalStateException("c2.android.avc.encoder was unable to create the input surface (1x1).");
                            }
                        }
                        return new b(mediaCodecCreateEncoderByType2, new m5.k(29, kVar, aVar4), null);
                }
            }
        });
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return eg.a.b(this);
    }

    @Override // eg.e
    public final Object j() {
        return (b) eg.a.a(this, vf.c.VIDEO);
    }

    @Override // eg.e
    public final boolean k(vf.c type) {
        n.f(type, "type");
        return ((e) ((u) this.f53189c.f40781c).f54880c).l(type) == vf.b.f52575d;
    }

    @Override // eg.e
    public final Object l(vf.c type) {
        n.f(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            return (b) this.f53187a.getValue();
        }
        if (iOrdinal == 1) {
            return (b) this.f53188b.getValue();
        }
        throw new aa.b((byte) 0, 20);
    }

    @Override // eg.e
    public final Object o() {
        return (b) eg.a.a(this, vf.c.AUDIO);
    }
}
