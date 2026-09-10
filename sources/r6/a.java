package r6;

import a7.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.auth.o;
import com.ironsource.X3;
import e6.k;
import g6.a0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ne.a f49411f = new ne.a(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i6.c f49412g = new i6.c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f49414b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m5.k f49417e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ne.a f49416d = f49411f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i6.c f49415c = f49412g;

    public a(Context context, ArrayList arrayList, h6.a aVar, dm0 dm0Var) {
        this.f49413a = context.getApplicationContext();
        this.f49414b = arrayList;
        this.f49417e = new m5.k(13, aVar, dm0Var);
    }

    public static int d(d6.b bVar, int i10, int i11) {
        int iMin = Math.min(bVar.f38728g / i11, bVar.f38727f / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbL = l1.d.l("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i10, "x");
            sbL.append(i11);
            sbL.append("], actual dimens: [");
            sbL.append(bVar.f38727f);
            sbL.append("x");
            sbL.append(bVar.f38728g);
            sbL.append(X3.j.f27836e);
            Log.v("BufferGifDecoder", sbL.toString());
        }
        return iMax;
    }

    @Override // e6.k
    public final a0 a(Object obj, int i10, int i11, e6.i iVar) {
        d6.c cVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        i6.c cVar2 = this.f49415c;
        synchronized (cVar2) {
            try {
                d6.c cVar3 = (d6.c) cVar2.f42895a.poll();
                if (cVar3 == null) {
                    cVar3 = new d6.c();
                }
                cVar = cVar3;
                cVar.f38734b = null;
                Arrays.fill(cVar.f38733a, (byte) 0);
                cVar.f38735c = new d6.b();
                cVar.f38736d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                cVar.f38734b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                cVar.f38734b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            return c(byteBuffer, i10, i11, cVar, iVar);
        } finally {
            this.f49415c.a(cVar);
        }
    }

    @Override // e6.k
    public final boolean b(Object obj, e6.i iVar) {
        return !((Boolean) iVar.c(h.f49453b)).booleanValue() && o.p(this.f49414b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public final p6.b c(ByteBuffer byteBuffer, int i10, int i11, d6.c cVar, e6.i iVar) {
        StringBuilder sb2;
        int i12 = j.f3432b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            d6.b bVarB = cVar.b();
            if (bVarB.f38724c > 0 && bVarB.f38723b == 0) {
                Bitmap.Config config = iVar.c(h.f49452a) == e6.a.f39138b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(bVarB, i10, i11);
                ne.a aVar = this.f49416d;
                m5.k kVar = this.f49417e;
                aVar.getClass();
                d6.d dVar = new d6.d(kVar, bVarB, byteBuffer, iD);
                dVar.c(config);
                dVar.f38747k = (dVar.f38747k + 1) % dVar.l.f38724c;
                Bitmap bitmapB = dVar.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder("Decoded GIF from stream in ");
                        sb2.append(j.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb2.toString());
                        return null;
                    }
                    return null;
                }
                p6.b bVar = new p6.b(new c(new b(new g(com.bumptech.glide.b.a(this.f49413a), dVar, i10, i11, bitmapB))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + j.a(jElapsedRealtimeNanos));
                }
                return bVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(j.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb2.toString());
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                throw th2;
            }
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + j.a(jElapsedRealtimeNanos));
            throw th2;
        }
    }
}
