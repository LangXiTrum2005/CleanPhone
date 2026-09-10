package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.BufferedOutputStream;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Option f12635b = Option.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Option f12636c = new Option("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, Option.f12365e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruArrayPool f12637a;

    public BitmapEncoder(LruArrayPool lruArrayPool) {
        this.f12637a = lruArrayPool;
    }

    @Override // com.bumptech.glide.load.Encoder
    public final boolean a(Object obj, File file, Options options) throws Throwable {
        boolean z2;
        Bitmap bitmap = (Bitmap) ((Resource) obj).get();
        Option option = f12636c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) options.c(option);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i2 = LogTime.f12842b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) options.c(f12635b)).intValue();
        OutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    LruArrayPool lruArrayPool = this.f12637a;
                    if (lruArrayPool != null) {
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream, lruArrayPool);
                        } catch (IOException e2) {
                            e = e2;
                            bufferedOutputStream = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            z2 = false;
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = fileOutputStream;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        bufferedOutputStream = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, bufferedOutputStream);
                    bufferedOutputStream.close();
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    z2 = true;
                } catch (IOException e3) {
                    e = e3;
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + Util.c(bitmap) + " in " + LogTime.a(jElapsedRealtimeNanos) + ", options format: " + options.c(option) + ", hasAlpha: " + bitmap.hasAlpha());
                }
                return z2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public final EncodeStrategy b(Options options) {
        return EncodeStrategy.f12352Y;
    }
}
