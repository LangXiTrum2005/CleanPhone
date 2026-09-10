package qj;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import com.google.android.gms.internal.measurement.nf;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class c0 implements ti.b, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nf f49033b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LongSparseArray f49032a = new LongSparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.b f49034c = new mb.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f49035d = 1;

    public static al.b d(f fVar) {
        String str = fVar.f49045a;
        if (str.startsWith("asset:")) {
            if (str.startsWith("asset:///")) {
                return new l(str, 0);
            }
            throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
        }
        if (str.startsWith("rtsp:")) {
            if (str.startsWith("rtsp://")) {
                return new l(str, 1);
            }
            throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
        }
        q qVar = fVar.f49046b;
        int i10 = 1;
        if (qVar != null) {
            int iOrdinal = qVar.ordinal();
            if (iOrdinal == 0) {
                i10 = 3;
            } else if (iOrdinal == 1) {
                i10 = 4;
            } else if (iOrdinal == 2) {
                i10 = 2;
            }
        }
        return new i(str, i10, new HashMap(fVar.f49047c), fVar.f49048d);
    }

    public final long a(f fVar) {
        al.b bVarD = d(fVar);
        long j10 = this.f49035d;
        this.f49035d = 1 + j10;
        String string = Long.toString(j10);
        nf nfVar = this.f49033b;
        Context context = (Context) nfVar.f23782b;
        rj.e eVar = new rj.e(x.t((xi.f) nfVar.f23783c, string), bVarD.B0(), this.f49034c, null, new rj.d(context, bVarD, 0));
        xi.f fVar2 = (xi.f) this.f49033b.f23783c;
        String string2 = Long.toString(j10);
        a0.f49027a.getClass();
        z.b(fVar2, eVar, string2);
        eVar.f49092d = new cj.h(29, fVar2, string2);
        this.f49032a.put(j10, eVar);
        return j10;
    }

    public final v b(f fVar) {
        al.b bVarD = d(fVar);
        long j10 = this.f49035d;
        this.f49035d = 1 + j10;
        String string = Long.toString(j10);
        io.flutter.embedding.engine.renderer.h hVar = (io.flutter.embedding.engine.renderer.h) this.f49033b.f23786f;
        hVar.getClass();
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerA = hVar.a(1);
        nf nfVar = this.f49033b;
        sj.b bVar = new sj.b(x.t((xi.f) nfVar.f23783c, string), bVarD.B0(), this.f49034c, textureRegistry$SurfaceProducerA, new rj.d((Context) nfVar.f23782b, bVarD, 1));
        bVar.f50255g = true;
        textureRegistry$SurfaceProducerA.setCallback(bVar);
        Surface surface = textureRegistry$SurfaceProducerA.getSurface();
        ((p1.b0) bVar.f49093e).f1(surface);
        bVar.f50255g = surface == null;
        xi.f fVar2 = (xi.f) this.f49033b.f23783c;
        String string2 = Long.toString(j10);
        a0.f49027a.getClass();
        z.b(fVar2, bVar, string2);
        bVar.f49092d = new cj.h(29, fVar2, string2);
        this.f49032a.put(j10, bVar);
        return new v(j10, textureRegistry$SurfaceProducerA.id());
    }

    public final String c(String str, String str2) {
        if (str2 == null) {
            return ((b0) this.f49033b.f23784d).f49030a.b(str);
        }
        ri.d dVar = ((b0) this.f49033b.f23785e).f49030a;
        StringBuilder sb2 = new StringBuilder("packages");
        String str3 = File.separator;
        return dVar.b(d5.u.h(sb2, str3, str2, str3, str));
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        v9.e eVarF = v9.e.F();
        Context context = aVar.f50787a;
        xi.f fVar = aVar.f50789c;
        ri.d dVar = (ri.d) eVarF.f52503b;
        this.f49033b = new nf(context, fVar, new b0(dVar), new b0(dVar), aVar.f50790d, 3);
        c.f49031y9.getClass();
        b.b(fVar, this);
        io.flutter.plugin.platform.l lVar = aVar.f50791e;
        LongSparseArray longSparseArray = this.f49032a;
        Objects.requireNonNull(longSparseArray);
        lVar.e("plugins.flutter.dev/video_player_android", new rj.b(new k3.j(longSparseArray, 25)));
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        if (this.f49033b == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        nf nfVar = this.f49033b;
        xi.f fVar = aVar.f50789c;
        nfVar.getClass();
        c.f49031y9.getClass();
        b.b(fVar, null);
        this.f49033b = null;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f49032a;
            if (i10 >= longSparseArray.size()) {
                longSparseArray.clear();
                return;
            } else {
                ((w) longSparseArray.valueAt(i10)).d();
                i10++;
            }
        }
    }
}
