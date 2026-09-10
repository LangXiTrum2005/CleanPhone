package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.tracing.Trace;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3877kY implements InterfaceC3656hy, InterfaceC3760j70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4602a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3877kY(C3909kp c3909kp, C3471fp c3471fp, int i) {
        this(c3909kp, c3471fp);
        this.f4602a = 1;
    }

    public static void f(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }

    public static byte[] j(InterfaceC4341pl interfaceC4341pl, String str, byte[] bArr, Map map) throws UN {
        Map map2;
        List list;
        B90 b90 = new B90(interfaceC4341pl.createDataSource());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        FW.u(uri, "The uri must be set.");
        C4868vl c4868vl = new C4868vl(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        C4868vl c4868vlA = c4868vl;
        int i = 0;
        while (true) {
            try {
                C4692tl c4692tl = new C4692tl(b90, c4868vlA);
                try {
                    int i2 = Ug0.f3833a;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i3 = c4692tl.read(bArr2);
                        if (i3 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            Ug0.h(c4692tl);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i3);
                        Ug0.h(c4692tl);
                        throw th;
                    }
                } catch (SA e) {
                    try {
                        int i4 = e.d;
                        String str2 = null;
                        if ((i4 == 307 || i4 == 308) && i < 5 && (map2 = e.e) != null && (list = (List) map2.get(HttpResponseHeader.Location)) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i++;
                        C4780ul c4780ulA = c4868vlA.a();
                        c4780ulA.f5098a = Uri.parse(str2);
                        c4868vlA = c4780ulA.a();
                        Ug0.h(c4692tl);
                    } catch (Throwable th) {
                        Ug0.h(c4692tl);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                Uri uri2 = b90.c;
                uri2.getClass();
                throw new UN(c4868vl, uri2, b90.f2861a.getResponseHeaders(), b90.b, e2);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3760j70
    public final void a() {
        ((ConnectivityManager) ((InterfaceC3656hy) this.d).get()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.e);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3760j70
    public final boolean b() {
        this.b = ((ConnectivityManager) ((InterfaceC3656hy) this.d).get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) ((InterfaceC3656hy) this.d).get()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) this.e);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public final void c() {
        switch (this.f4602a) {
            case 1:
                C3909kp.a((C3909kp) this.e, this, false);
                return;
            default:
                C3821jp c3821jp = (C3821jp) this.e;
                synchronized (c3821jp) {
                    try {
                        if (!(!this.b)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        if (AbstractC2995aW.i(((C3383ep) this.c).g, this)) {
                            c3821jp.i(this, false);
                        }
                        this.b = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final boolean d(C4619sw c4619sw, Z6 z6) {
        boolean zEquals = MimeTypes.AUDIO_E_AC3_JOC.equals(c4619sw.l);
        int i = c4619sw.y;
        if (zEquals && i == 16) {
            i = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(Ug0.p(i));
        int i2 = c4619sw.z;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.c).canBeSpatialized((AudioAttributes) z6.a().b, channelMask.build());
    }

    public final void e() {
        switch (this.f4602a) {
            case 1:
                C3909kp.a((C3909kp) this.e, this, true);
                this.b = true;
                return;
            default:
                C3821jp c3821jp = (C3821jp) this.e;
                synchronized (c3821jp) {
                    try {
                        if (!(!this.b)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        if (AbstractC2995aW.i(((C3383ep) this.c).g, this)) {
                            c3821jp.i(this, true);
                        }
                        this.b = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void g() {
        Object obj = this.c;
        if (AbstractC2995aW.i(((C3383ep) obj).g, this)) {
            Object obj2 = this.e;
            if (((C3821jp) obj2).n) {
                ((C3821jp) obj2).i(this, false);
            } else {
                ((C3383ep) obj).f = true;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3656hy
    public final Object get() {
        if (this.b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.b = true;
        try {
            return AbstractC2845Vx.S((com.bumptech.glide.a) this.c, (List) this.d);
        } finally {
            this.b = false;
            Trace.endSection();
        }
    }

    public final void h(C3557go c3557go, Looper looper) {
        if (((Spatializer.OnSpatializerStateChangedListener) this.e) == null && ((Handler) this.d) == null) {
            this.e = new C3116bo(c3557go);
            Handler handler = new Handler(looper);
            this.d = handler;
            ((Spatializer) this.c).addOnSpatializerStateChangedListener(new ExecutorC5134ym(1, handler), (Spatializer.OnSpatializerStateChangedListener) this.e);
        }
    }

    public final byte[] i(UUID uuid, C5231zs c5231zs) throws UN {
        String str;
        String str2 = c5231zs.b;
        if (this.b || TextUtils.isEmpty(str2)) {
            str2 = (String) this.d;
        }
        if (TextUtils.isEmpty(str2)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            FW.u(uri, "The uri must be set.");
            throw new UN(new C4868vl(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null), uri, C4405qY.g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AbstractC4147nc.e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = AbstractC4147nc.c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((Map) this.e)) {
            map.putAll((Map) this.e);
        }
        return j((InterfaceC4341pl) this.c, str2, c5231zs.f5349a, map);
    }

    public final byte[] k(C2295As c2295As) {
        return j((InterfaceC4341pl) this.c, c2295As.b + "&signedRequest=" + Ug0.o(c2295As.f2841a), null, Collections.emptyMap());
    }

    public final File l() {
        File file;
        synchronized (((C3909kp) this.e)) {
            try {
                Object obj = this.c;
                if (((C3471fp) obj).f != this) {
                    throw new IllegalStateException();
                }
                if (!((C3471fp) obj).e) {
                    ((boolean[]) this.d)[0] = true;
                }
                file = ((C3471fp) obj).d[0];
                ((C3909kp) this.e).f4618a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public final InterfaceC4463r70 m(int i) {
        C3821jp c3821jp = (C3821jp) this.e;
        synchronized (c3821jp) {
            try {
                if (!(!this.b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!AbstractC2995aW.i(((C3383ep) this.c).g, this)) {
                    return new C2537Ka();
                }
                if (!((C3383ep) this.c).e) {
                    boolean[] zArr = (boolean[]) this.d;
                    AbstractC2995aW.n(zArr);
                    zArr[i] = true;
                }
                try {
                    return new C2452Gt(((C2945Zt) c3821jp.f4573a).e((File) ((C3383ep) this.c).d.get(i)), new D10(4, c3821jp, this));
                } catch (FileNotFoundException unused) {
                    return new C2537Ka();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3877kY() {
        this.f4602a = 5;
        this.c = new float[16];
        this.d = new float[16];
        this.e = new VC(4);
    }

    public C3877kY(String str, boolean z, C3817jn c3817jn) {
        this.f4602a = 3;
        FW.h((z && TextUtils.isEmpty(str)) ? false : true);
        this.c = c3817jn;
        this.d = str;
        this.b = z;
        this.e = new HashMap();
    }

    public C3877kY(com.bumptech.glide.a aVar, ArrayList arrayList, AbstractC2995aW abstractC2995aW) {
        this.f4602a = 0;
        this.c = aVar;
        this.d = arrayList;
        this.e = abstractC2995aW;
    }

    public C3877kY(C4351pr c4351pr, C3674i70 c3674i70) {
        this.f4602a = 2;
        this.e = new C3936l70(this, 0);
        this.d = c4351pr;
        this.c = c3674i70;
    }

    public C3877kY(C3909kp c3909kp, C3471fp c3471fp) {
        this.f4602a = 1;
        this.e = c3909kp;
        this.c = c3471fp;
        this.d = c3471fp.e ? null : new boolean[c3909kp.g];
    }

    public C3877kY(C3821jp c3821jp, C3383ep c3383ep) {
        this.f4602a = 6;
        AbstractC2995aW.q(c3821jp, "this$0");
        this.e = c3821jp;
        this.c = c3383ep;
        this.d = c3383ep.e ? null : new boolean[c3821jp.d];
    }

    public C3877kY(Spatializer spatializer) {
        this.f4602a = 4;
        this.c = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }
}
