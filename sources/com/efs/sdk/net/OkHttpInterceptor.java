package com.efs.sdk.net;

import com.badlogic.gdx.net.HttpResponseHeader;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.net.a.a.e;
import com.efs.sdk.net.a.a.f;
import com.efs.sdk.net.a.a.g;
import com.efs.sdk.net.a.a.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4813v60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4845vZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5021xZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ID;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3722ij;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RO;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttpInterceptor implements JD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f709a = g.b();

    public static class a extends CZ {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CZ f710a;
        private final InterfaceC2460Hb b;

        public a(CZ cz, InputStream inputStream) {
            this.f710a = cz;
            this.b = AbstractC4496rb.f(AbstractC4496rb.x(inputStream));
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
        public final long contentLength() {
            return this.f710a.contentLength();
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
        public final RO contentType() {
            return this.f710a.contentType();
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
        public final InterfaceC2460Hb source() {
            return this.b;
        }
    }

    public static class b implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f711a;
        private final HY b;
        private h c;

        public b(String str, HY hy, h hVar) {
            this.f711a = str;
            this.b = hy;
            this.c = hVar;
        }

        @Override // com.efs.sdk.net.a.a.f.c
        public final String a() {
            return this.f711a;
        }

        @Override // com.efs.sdk.net.a.a.f.b
        public final String b() {
            return this.b.f3175a.i;
        }

        @Override // com.efs.sdk.net.a.a.f.b
        public final String c() {
            return this.b.b;
        }

        @Override // com.efs.sdk.net.a.a.f.b
        public final byte[] d() {
            OutputStream inflaterOutputStream;
            HY hy = this.b;
            NY ny = hy.d;
            if (ny == null) {
                return null;
            }
            h hVar = this.c;
            String strA = hy.c.a(HttpResponseHeader.ContentEncoding);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (Constants.CP_GZIP.equals(strA)) {
                inflaterOutputStream = e.a(byteArrayOutputStream);
            } else {
                inflaterOutputStream = "deflate".equals(strA) ? new InflaterOutputStream(byteArrayOutputStream) : byteArrayOutputStream;
            }
            com.efs.sdk.net.a.a.a aVar = new com.efs.sdk.net.a.a.a(inflaterOutputStream);
            hVar.c = aVar;
            hVar.b = byteArrayOutputStream;
            DX dxE = AbstractC4496rb.e(AbstractC4496rb.u(aVar));
            try {
                ny.writeTo(dxE);
                dxE.close();
                h hVar2 = this.c;
                hVar2.b();
                return hVar2.b.toByteArray();
            } catch (Throwable th) {
                dxE.close();
                throw th;
            }
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final int e() {
            return this.b.c.size();
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String a(int i) {
            return this.b.c.b(i);
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String b(int i) {
            return this.b.c.e(i);
        }
    }

    public static class c implements f.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f712a;
        private final HY b;
        private final C5021xZ c;
        private final InterfaceC3722ij d;

        public c(String str, HY hy, C5021xZ c5021xZ, InterfaceC3722ij interfaceC3722ij) {
            this.f712a = str;
            this.b = hy;
            this.c = c5021xZ;
            this.d = interfaceC3722ij;
        }

        @Override // com.efs.sdk.net.a.a.f.e
        public final String a() {
            return this.f712a;
        }

        @Override // com.efs.sdk.net.a.a.f.e
        public final int b() {
            return this.c.d;
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final int e() {
            return this.c.f.size();
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String a(int i) {
            return this.c.f.b(i);
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String b(int i) {
            return this.c.f.e(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:10:0x0027, B:13:0x002e, B:17:0x003e, B:19:0x004f, B:21:0x005a, B:18:0x004a), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:10:0x0027, B:13:0x002e, B:17:0x003e, B:19:0x004f, B:21:0x005a, B:18:0x004a), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:10:0x0027, B:13:0x002e, B:17:0x003e, B:19:0x004f, B:21:0x005a, B:18:0x004a), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:33:0x00a3, B:39:0x00af, B:41:0x00b5, B:42:0x00c2, B:47:0x00d0, B:49:0x00de, B:51:0x00e9, B:53:0x00ed, B:54:0x00ef, B:56:0x0102, B:57:0x0112, B:58:0x0119, B:45:0x00ca), top: B:64:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:33:0x00a3, B:39:0x00af, B:41:0x00b5, B:42:0x00c2, B:47:0x00d0, B:49:0x00de, B:51:0x00e9, B:53:0x00ed, B:54:0x00ef, B:56:0x0102, B:57:0x0112, B:58:0x0119, B:45:0x00ca), top: B:64:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:33:0x00a3, B:39:0x00af, B:41:0x00b5, B:42:0x00c2, B:47:0x00d0, B:49:0x00de, B:51:0x00e9, B:53:0x00ed, B:54:0x00ef, B:56:0x0102, B:57:0x0112, B:58:0x0119, B:45:0x00ca), top: B:64:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:33:0x00a3, B:39:0x00af, B:41:0x00b5, B:42:0x00c2, B:47:0x00d0, B:49:0x00de, B:51:0x00e9, B:53:0x00ed, B:54:0x00ef, B:56:0x0102, B:57:0x0112, B:58:0x0119, B:45:0x00ca), top: B:64:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0102 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:33:0x00a3, B:39:0x00af, B:41:0x00b5, B:42:0x00c2, B:47:0x00d0, B:49:0x00de, B:51:0x00e9, B:53:0x00ed, B:54:0x00ef, B:56:0x0102, B:57:0x0112, B:58:0x0119, B:45:0x00ca), top: B:64:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0112 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:33:0x00a3, B:39:0x00af, B:41:0x00b5, B:42:0x00c2, B:47:0x00d0, B:49:0x00de, B:51:0x00e9, B:53:0x00ed, B:54:0x00ef, B:56:0x0102, B:57:0x0112, B:58:0x0119, B:45:0x00ca), top: B:64:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD
    public C5021xZ intercept(ID id) {
        h hVar;
        String str;
        boolean z;
        h hVar2;
        String str2;
        boolean zEnableTracer;
        C5021xZ c5021xZB;
        C4813v60 c4813v60;
        KX kx;
        CZ cz;
        RO roContentType;
        InputStream inputStreamByteStream;
        InputStream inputStreamA;
        com.efs.sdk.net.a.f fVarA;
        MX mx = (MX) id;
        HY hy = mx.e;
        try {
            Log.d("NetTrace-Interceptor", "begin intercept");
            zEnableTracer = NetManager.getNetConfigManager() != null ? NetManager.getNetConfigManager().enableTracer() : false;
            if (zEnableTracer) {
                if (hy != null) {
                    Log.d("NetTrace-Interceptor", "intercept request is ".concat(hy.toString()));
                } else {
                    Log.d("NetTrace-Interceptor", "intercept request is null~");
                }
                fVarA = com.efs.sdk.net.a.e.a(((MX) id).f3407a);
                if (fVarA != null) {
                    str2 = fVarA.f728a;
                } else {
                    str2 = "unknown";
                }
                Log.d("NetTrace-Interceptor", "intercept request id is ".concat(String.valueOf(str2)));
                com.efs.sdk.net.a.a.a().a(str2).c = hy.f3175a.i;
                hVar2 = new h(this.f709a, str2);
                this.f709a.a(new b(str2, hy, hVar2));
            } else {
                try {
                    if (IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                        if (hy != null) {
                            Log.d("NetTrace-Interceptor", "intercept request is ".concat(hy.toString()));
                        } else {
                            Log.d("NetTrace-Interceptor", "intercept request is null~");
                        }
                        fVarA = com.efs.sdk.net.a.e.a(((MX) id).f3407a);
                        if (fVarA != null) {
                            str2 = fVarA.f728a;
                        } else {
                            str2 = "unknown";
                        }
                        try {
                            Log.d("NetTrace-Interceptor", "intercept request id is ".concat(String.valueOf(str2)));
                            com.efs.sdk.net.a.a.a().a(str2).c = hy.f3175a.i;
                            hVar2 = new h(this.f709a, str2);
                            try {
                                this.f709a.a(new b(str2, hy, hVar2));
                            } catch (Throwable th) {
                                String str3 = str2;
                                hVar = hVar2;
                                th = th;
                                z = zEnableTracer;
                                str = str3;
                                th.printStackTrace();
                                hVar2 = hVar;
                                str2 = str;
                                zEnableTracer = z;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z = zEnableTracer;
                            str = str2;
                            hVar = null;
                        }
                    } else {
                        Log.d("NetTrace-Interceptor", "net enable is false~");
                        hVar2 = null;
                        str2 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    hVar = null;
                    z = zEnableTracer;
                    str = null;
                    th.printStackTrace();
                    hVar2 = hVar;
                    str2 = str;
                    zEnableTracer = z;
                    c5021xZB = mx.b(hy);
                    if (!zEnableTracer) {
                        try {
                            if (IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                                return c5021xZB;
                            }
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                            return c5021xZB;
                        }
                    }
                    if (hVar2 != null) {
                        hVar2.b();
                        f fVar = hVar2.f722a;
                        hVar2.b.size();
                        fVar.a();
                    }
                    c4813v60 = ((MX) id).d;
                    if (c4813v60 == null) {
                        kx = null;
                    } else {
                        kx = (KX) c4813v60.f;
                    }
                    if (kx != null) {
                        throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
                    }
                    this.f709a.a(new c(str2, hy, c5021xZB, kx));
                    cz = c5021xZB.g;
                    if (cz != null) {
                        roContentType = cz.contentType();
                        inputStreamByteStream = cz.byteStream();
                    } else {
                        roContentType = null;
                        inputStreamByteStream = null;
                    }
                    f fVar2 = this.f709a;
                    String str4 = roContentType != null ? roContentType.f3657a : null;
                    String strI = C5021xZ.i(c5021xZB, HttpResponseHeader.ContentEncoding);
                    new com.efs.sdk.net.a.a.c(this.f709a, str2);
                    inputStreamA = fVar2.a(str2, str4, strI, inputStreamByteStream);
                    if (inputStreamA != null) {
                        return c5021xZB;
                    }
                    C4845vZ c4845vZM = c5021xZB.m();
                    c4845vZM.g = new a(cz, inputStreamA);
                    return c4845vZM.a();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            hVar = null;
            str = null;
            z = false;
        }
        c5021xZB = mx.b(hy);
        if (!zEnableTracer) {
            if (IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                return c5021xZB;
            }
        }
        if (hVar2 != null && hVar2.a()) {
            hVar2.b();
            f fVar3 = hVar2.f722a;
            hVar2.b.size();
            fVar3.a();
        }
        c4813v60 = ((MX) id).d;
        if (c4813v60 == null) {
            kx = null;
        } else {
            kx = (KX) c4813v60.f;
        }
        if (kx != null) {
            throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
        }
        this.f709a.a(new c(str2, hy, c5021xZB, kx));
        cz = c5021xZB.g;
        if (cz != null) {
            roContentType = cz.contentType();
            inputStreamByteStream = cz.byteStream();
        } else {
            roContentType = null;
            inputStreamByteStream = null;
        }
        f fVar4 = this.f709a;
        if (roContentType != null) {
        }
        String strI2 = C5021xZ.i(c5021xZB, HttpResponseHeader.ContentEncoding);
        new com.efs.sdk.net.a.a.c(this.f709a, str2);
        inputStreamA = fVar4.a(str2, str4, strI2, inputStreamByteStream);
        if (inputStreamA != null) {
            return c5021xZB;
        }
        C4845vZ c4845vZM2 = c5021xZB.m();
        c4845vZM2.g = new a(cz, inputStreamA);
        return c4845vZM2.a();
    }
}
