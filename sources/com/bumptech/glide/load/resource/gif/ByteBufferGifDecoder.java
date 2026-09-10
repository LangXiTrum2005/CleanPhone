package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.p004ironsource.d9;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {
    public static final GifDecoderFactory f = new GifDecoderFactory();
    public static final GifHeaderParserPool g = new GifHeaderParserPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GifHeaderParserPool f12712c;
    public final GifDecoderFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GifBitmapProvider f12713e;

    public static class GifDecoderFactory {
    }

    public static class GifHeaderParserPool {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f12714a;

        public GifHeaderParserPool() {
            char[] cArr = Util.f12851a;
            this.f12714a = new ArrayDeque(0);
        }

        public final synchronized void a(GifHeaderParser gifHeaderParser) {
            gifHeaderParser.f12339b = null;
            gifHeaderParser.f12340c = null;
            this.f12714a.offer(gifHeaderParser);
        }
    }

    public ByteBufferGifDecoder(Context context, ArrayList arrayList, BitmapPool bitmapPool, LruArrayPool lruArrayPool) {
        GifHeaderParserPool gifHeaderParserPool = g;
        GifDecoderFactory gifDecoderFactory = f;
        this.f12710a = context.getApplicationContext();
        this.f12711b = arrayList;
        this.d = gifDecoderFactory;
        this.f12713e = new GifBitmapProvider(bitmapPool, lruArrayPool);
        this.f12712c = gifHeaderParserPool;
    }

    public static int d(GifHeader gifHeader, int i2, int i3) {
        int iMin = Math.min(gifHeader.g / i3, gifHeader.f / i2);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbP = a.p(iMax, i2, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbP.append(i3);
            sbP.append("], actual dimens: [");
            sbP.append(gifHeader.f);
            sbP.append("x");
            sbP.append(gifHeader.g);
            sbP.append(d9.i.f24752e);
            Log.v("BufferGifDecoder", sbP.toString());
        }
        return iMax;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return !((Boolean) options.c(GifOptions.f12731b)).booleanValue() && ImageHeaderParserUtils.g(this.f12711b, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public final com.bumptech.glide.load.engine.Resource b(java.lang.Object r8, int r9, int r10, com.bumptech.glide.load.Options r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r8 = r7.f12712c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f12714a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = (com.bumptech.glide.gifdecoder.GifHeaderParser) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = new com.bumptech.glide.gifdecoder.GifHeaderParser     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f12339b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f12338a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.gifdecoder.GifHeader r0 = new com.bumptech.glide.gifdecoder.GifHeader     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f12340c = r0     // Catch: java.lang.Throwable -> L54
            r5.d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f12339b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f12339b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            com.bumptech.glide.load.resource.gif.GifDrawableResource r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r9 = r1.f12712c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r9 = r1.f12712c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.b(java.lang.Object, int, int, com.bumptech.glide.load.Options):com.bumptech.glide.load.engine.Resource");
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
    public final GifDrawableResource c(ByteBuffer byteBuffer, int i2, int i3, GifHeaderParser gifHeaderParser, Options options) {
        StringBuilder sb;
        int i4 = LogTime.f12842b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            GifHeader gifHeaderB = gifHeaderParser.b();
            if (gifHeaderB.f12334c > 0 && gifHeaderB.f12333b == 0) {
                Bitmap.Config config = options.c(GifOptions.f12730a) == DecodeFormat.f12351Y ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(gifHeaderB, i2, i3);
                GifDecoderFactory gifDecoderFactory = this.d;
                GifBitmapProvider gifBitmapProvider = this.f12713e;
                gifDecoderFactory.getClass();
                StandardGifDecoder standardGifDecoder = new StandardGifDecoder(gifBitmapProvider, gifHeaderB, byteBuffer, iD);
                standardGifDecoder.e(config);
                standardGifDecoder.b();
                Bitmap bitmapA = standardGifDecoder.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(LogTime.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                GifDrawableResource gifDrawableResource = new GifDrawableResource(new GifDrawable(new GifDrawable.GifState(new GifFrameLoader(Glide.a(this.f12710a), standardGifDecoder, i2, i3, bitmapA))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.a(jElapsedRealtimeNanos));
                }
                return gifDrawableResource;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(LogTime.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                throw th;
            }
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.a(jElapsedRealtimeNanos));
            throw th;
        }
    }
}
