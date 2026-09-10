package ih;

import ah.d;
import ak.f;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import ck.i;
import cn.a0;
import jk.c;
import kotlin.jvm.internal.n;
import ln.h;
import t9.e;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f43020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f43021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f43022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f43023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43025k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f43027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f43028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f43029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f43030q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, String str, long j10, d dVar, f fVar) {
        super(2, fVar);
        this.f43027n = hVar;
        this.f43028o = str;
        this.f43029p = j10;
        this.f43030q = dVar;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        a aVar = new a(this.f43027n, this.f43028o, this.f43029p, this.f43030q, fVar);
        aVar.f43026m = obj;
        return aVar;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        String str;
        d dVar;
        int i10;
        int i11;
        long j10;
        Throwable th2;
        dh.h hVarG;
        Object hVar2 = "mediaType";
        a0 a0Var = (a0) this.f43026m;
        int i12 = this.l;
        if (i12 == 0) {
            e.z(obj);
            this.f43026m = a0Var;
            hVar = this.f43027n;
            this.f43020f = hVar;
            str = this.f43028o;
            this.f43021g = str;
            dVar = this.f43030q;
            this.f43022h = dVar;
            long j11 = this.f43029p;
            this.f43023i = j11;
            i10 = 9;
            this.f43024j = 9;
            this.f43025k = 8;
            this.l = 1;
            Object objA = hVar.a(this);
            bk.a aVar = bk.a.f5708a;
            if (objA == aVar) {
                return aVar;
            }
            i11 = 8;
            j10 = j11;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = this.f43025k;
            i10 = this.f43024j;
            j10 = this.f43023i;
            dVar = this.f43022h;
            str = this.f43021g;
            h hVar3 = this.f43020f;
            e.z(obj);
            i11 = i13;
            hVar = hVar3;
        }
        d mediaType = dVar;
        String str2 = str;
        int i14 = i10;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            Bitmap bitmap = null;
            try {
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(str2);
                        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
                        bitmapParams.setPreferredConfig(Bitmap.Config.ARGB_8888);
                        Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j10, 2, i14, i11, bitmapParams);
                        if (scaledFrameAtTime != null) {
                            try {
                                hVarG = com.google.android.gms.internal.auth.i.G(scaledFrameAtTime, mediaType);
                                if (hVarG == null) {
                                    n.f(mediaType, "mediaType");
                                    hVarG = new dh.h(new dh.c(-1L, new double[0][]), mediaType);
                                }
                            } catch (Exception e10) {
                                e = e10;
                                bitmap = scaledFrameAtTime;
                                String message = "Failed to extract frame at " + j10 + "us from " + str2 + ": " + e.getMessage();
                                n.f(message, "message");
                                Log.w("FrameExtractionUtils", message);
                                n.f(mediaType, "mediaType");
                                hVar2 = new dh.h(new dh.c(-1L, new double[0][]), mediaType);
                                mediaMetadataRetriever.release();
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                bitmap = scaledFrameAtTime;
                                try {
                                    mediaMetadataRetriever.release();
                                    if (bitmap == null) {
                                        throw th2;
                                    }
                                    bitmap.recycle();
                                    throw th2;
                                } catch (Throwable th4) {
                                    e.c(th4);
                                    throw th2;
                                }
                            }
                            hVar.c();
                            return hVar2;
                        }
                        n.f(mediaType, "mediaType");
                        hVarG = new dh.h(new dh.c(-1L, new double[0][]), mediaType);
                        hVar2 = hVarG;
                        mediaMetadataRetriever.release();
                        if (scaledFrameAtTime != null) {
                            scaledFrameAtTime.recycle();
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th6) {
                e.c(th6);
            }
            hVar.c();
            return hVar2;
        } catch (Throwable th7) {
            hVar.c();
            throw th7;
        }
    }
}
