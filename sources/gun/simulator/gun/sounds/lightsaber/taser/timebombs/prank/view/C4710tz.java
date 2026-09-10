package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4710tz implements InterfaceC5232zt, InterfaceC2888Xo, InterfaceC3392ey, ModelLoaderFactory, InterfaceC3473fr, InterfaceC2867Wt, InterfaceC4158nh0, InterfaceC4669tZ, YY, InterfaceC2348Ct, CK, InterfaceC4968wt, EN, LT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5057a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4710tz() {
        this(14);
        this.f5057a = 14;
    }

    public static Wm0 i(InterfaceC4985x40... interfaceC4985x40Arr) {
        return new Wm0(interfaceC4985x40Arr, 23);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2867Wt
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2867Wt
    public final void b(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5232zt
    public final Object create() {
        return new C3688iJ();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2888Xo
    public final File e(InterfaceC4650tG interfaceC4650tG) {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public final Object get() {
        switch (this.f5057a) {
            case 24:
                return "com.google.android.datatransport.events";
            case 25:
                return Z7.f;
            default:
                return new C5211zg0(0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final MediaCodecInfo getCodecInfoAt(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final void h(Context context, Uo0 uo0, InterfaceC5182zK interfaceC5182zK) {
        ConcurrentHashMap concurrentHashMap = Po0.f3574a;
        synchronized (Po0.class) {
            if (uo0 != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        ConcurrentHashMap concurrentHashMap2 = Po0.f3574a;
                        MG mg = (MG) concurrentHashMap2.get(uo0.STP());
                        if (mg == null) {
                            mg = new MG(context, uo0);
                            concurrentHashMap2.put(uo0.STP(), mg);
                            uo0.lk();
                            uo0.STP();
                        }
                        mg.c(interfaceC5182zK);
                    }
                    uo0.lk();
                    uo0.STP();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        QG qg = AbstractC4496rb.k;
        if (qg != null) {
            ((OK) qg).c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LT
    public final Object l(Uri uri, C4692tl c4692tl) {
        return Long.valueOf(Ug0.O(new BufferedReader(new InputStreamReader(c4692tl)).readLine()));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4669tZ
    public final InterfaceC3616hZ o(InterfaceC3616hZ interfaceC3616hZ, YS ys) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C3940l90) ((GifDrawable) interfaceC3616hZ.get()).f218a.f3291a.f3580a).d.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC3092bc.f4176a;
        C3003ac c3003ac = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C3003ac(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (c3003ac == null || c3003ac.f4129a != 0) {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        } else {
            if (c3003ac.b == ((byte[]) c3003ac.c).length) {
                bArrArray = byteBufferAsReadOnlyBuffer.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                byteBufferAsReadOnlyBuffer3.get(bArr2);
                bArrArray = bArr2;
            }
        }
        return new C5121yf0(bArrArray);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2867Wt
    public final Object q(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4158nh0
    public final void r(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final boolean secureDecodersExplicit() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3473fr
    public final boolean w(Object obj, File file, YS ys) throws Throwable {
        try {
            AbstractC3092bc.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4158nh0
    public final void y(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        int i = 0;
        switch (this.f5057a) {
            case 8:
                return new C2745Sb(new NN(this, 7), i);
            case 9:
            case 10:
            default:
                return new U90(c3166cQ.c(C3742iy.class, InputStream.class), 1);
            case 11:
                return new U90(c3166cQ.c(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new U90(c3166cQ.c(Uri.class, InputStream.class), 0);
        }
    }

    public /* synthetic */ C4710tz(int i) {
        this.f5057a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4710tz(AbstractC5044xl abstractC5044xl) {
        this(29);
        this.f5057a = 29;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4710tz(Object obj) {
        this(27);
        this.f5057a = 27;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2348Ct
    public final void d(Object obj) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3392ey
    public final void x(Throwable th) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2888Xo
    public final void g(InterfaceC4650tG interfaceC4650tG, C2444Gl c2444Gl) {
    }
}
