package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class GifFrameLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StandardGifDecoder f12720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f12721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12722c;
    public final RequestManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitmapPool f12723e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RequestBuilder f12724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DelayTarget f12725i;
    public boolean j;
    public DelayTarget k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f12726l;
    public Transformation m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DelayTarget f12727n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12728p;
    public int q;

    public static class DelayTarget extends CustomTarget<Bitmap> {
        public final Handler e0;
        public final int f0;
        public final long g0;
        public Bitmap h0;

        public DelayTarget(Handler handler, int i2, long j) {
            this.e0 = handler;
            this.f0 = i2;
            this.g0 = j;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void f(Drawable drawable) {
            this.h0 = null;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void g(Object obj, Transition transition) {
            this.h0 = (Bitmap) obj;
            Handler handler = this.e0;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.g0);
        }
    }

    public interface FrameCallback {
        void a();
    }

    public class FrameLoaderCallback implements Handler.Callback {
        public FrameLoaderCallback() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            GifFrameLoader gifFrameLoader = GifFrameLoader.this;
            if (i2 == 1) {
                gifFrameLoader.b((DelayTarget) message.obj);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            gifFrameLoader.d.b((DelayTarget) message.obj);
            return false;
        }
    }

    public interface OnEveryFrameListener {
    }

    public GifFrameLoader(Glide glide, StandardGifDecoder standardGifDecoder, int i2, int i3, Bitmap bitmap) {
        UnitTransformation unitTransformation = UnitTransformation.f12630b;
        BitmapPool bitmapPool = glide.X;
        GlideContext glideContext = glide.Z;
        RequestManager requestManagerC = Glide.c(glideContext.getBaseContext());
        RequestManager requestManagerC2 = Glide.c(glideContext.getBaseContext());
        requestManagerC2.getClass();
        RequestBuilder requestBuilderU = new RequestBuilder(requestManagerC2.X, requestManagerC2, Bitmap.class, requestManagerC2.f12312Y).b(RequestManager.l0).b(((RequestOptions) ((RequestOptions) ((RequestOptions) new RequestOptions().e(DiskCacheStrategy.f12431a)).s()).p()).h(i2, i3));
        this.f12722c = new ArrayList();
        this.d = requestManagerC;
        Handler handler = new Handler(Looper.getMainLooper(), new FrameLoaderCallback());
        this.f12723e = bitmapPool;
        this.f12721b = handler;
        this.f12724h = requestBuilderU;
        this.f12720a = standardGifDecoder;
        c(unitTransformation, bitmap);
    }

    public final void a() {
        if (!this.f || this.g) {
            return;
        }
        StandardGifDecoder standardGifDecoder = this.f12720a;
        DelayTarget delayTarget = this.f12727n;
        if (delayTarget != null) {
            this.f12727n = null;
            b(delayTarget);
            return;
        }
        this.g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) standardGifDecoder.d());
        standardGifDecoder.b();
        this.k = new DelayTarget(this.f12721b, standardGifDecoder.k, jUptimeMillis);
        RequestBuilder requestBuilderA = this.f12724h.b((RequestOptions) new RequestOptions().l(new ObjectKey(Double.valueOf(Math.random())))).A(standardGifDecoder);
        requestBuilderA.y(this.k, requestBuilderA);
    }

    public final void b(DelayTarget delayTarget) {
        this.g = false;
        boolean z2 = this.j;
        Handler handler = this.f12721b;
        if (z2) {
            handler.obtainMessage(2, delayTarget).sendToTarget();
            return;
        }
        if (!this.f) {
            this.f12727n = delayTarget;
            return;
        }
        if (delayTarget.h0 != null) {
            Bitmap bitmap = this.f12726l;
            if (bitmap != null) {
                this.f12723e.b(bitmap);
                this.f12726l = null;
            }
            DelayTarget delayTarget2 = this.f12725i;
            this.f12725i = delayTarget;
            ArrayList arrayList = this.f12722c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((FrameCallback) arrayList.get(size)).a();
            }
            if (delayTarget2 != null) {
                handler.obtainMessage(2, delayTarget2).sendToTarget();
            }
        }
        a();
    }

    public final void c(Transformation transformation, Bitmap bitmap) {
        Preconditions.c(transformation, "Argument must not be null");
        this.m = transformation;
        Preconditions.c(bitmap, "Argument must not be null");
        this.f12726l = bitmap;
        this.f12724h = this.f12724h.b(new RequestOptions().q(transformation, true));
        this.o = Util.c(bitmap);
        this.f12728p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
