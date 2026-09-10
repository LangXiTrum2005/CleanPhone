package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ByteArrayLoader;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.ByteBufferFileLoader;
import com.bumptech.glide.load.model.DataUrlLoader;
import com.bumptech.glide.load.model.DirectResourceLoader;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.model.ResourceLoader;
import com.bumptech.glide.load.model.ResourceUriLoader;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.model.StringLoader;
import com.bumptech.glide.load.model.UnitModelLoader;
import com.bumptech.glide.load.model.UriLoader;
import com.bumptech.glide.load.model.UrlUriLoader;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader;
import com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader;
import com.bumptech.glide.load.model.stream.QMediaStoreUriLoader;
import com.bumptech.glide.load.model.stream.UrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.InputStreamBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.ParcelFileDescriptorBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import com.bumptech.glide.load.resource.drawable.AnimatedImageDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableEncoder;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder;
import com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class RegistryFactory {
    public static Registry a(Glide glide, ArrayList arrayList) {
        ResourceDecoder byteBufferBitmapDecoder;
        ResourceDecoder streamBitmapDecoder;
        BitmapPool bitmapPool = glide.X;
        GlideContext glideContext = glide.Z;
        Context applicationContext = glideContext.getApplicationContext();
        GlideExperiments glideExperiments = glideContext.f12295h;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        ImageHeaderParserRegistry imageHeaderParserRegistry = registry.g;
        synchronized (imageHeaderParserRegistry) {
            imageHeaderParserRegistry.f12773a.add(defaultImageHeaderParser);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            ExifInterfaceImageHeaderParser exifInterfaceImageHeaderParser = new ExifInterfaceImageHeaderParser();
            ImageHeaderParserRegistry imageHeaderParserRegistry2 = registry.g;
            synchronized (imageHeaderParserRegistry2) {
                imageHeaderParserRegistry2.f12773a.add(exifInterfaceImageHeaderParser);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListB = registry.b();
        LruArrayPool lruArrayPool = glide.e0;
        ByteBufferGifDecoder byteBufferGifDecoder = new ByteBufferGifDecoder(applicationContext, arrayListB, bitmapPool, lruArrayPool);
        VideoDecoder videoDecoderF = VideoDecoder.f(bitmapPool);
        Downsampler downsampler = new Downsampler(registry.b(), resources.getDisplayMetrics(), bitmapPool, lruArrayPool);
        if (i2 < 28 || !glideExperiments.f12297a.containsKey(GlideBuilder.EnableImageDecoderForBitmaps.class)) {
            byteBufferBitmapDecoder = new ByteBufferBitmapDecoder(downsampler);
            streamBitmapDecoder = new StreamBitmapDecoder(downsampler, lruArrayPool);
        } else {
            streamBitmapDecoder = new InputStreamBitmapImageDecoderResourceDecoder();
            byteBufferBitmapDecoder = new ByteBufferBitmapImageDecoderResourceDecoder();
        }
        if (i2 >= 28) {
            registry.a(AnimatedImageDecoder.c(arrayListB, lruArrayPool), InputStream.class, Drawable.class, "Animation");
            registry.a(AnimatedImageDecoder.a(arrayListB, lruArrayPool), ByteBuffer.class, Drawable.class, "Animation");
        }
        ResourceDrawableDecoder resourceDrawableDecoder = new ResourceDrawableDecoder(applicationContext);
        BitmapEncoder bitmapEncoder = new BitmapEncoder(lruArrayPool);
        BitmapBytesTranscoder bitmapBytesTranscoder = new BitmapBytesTranscoder();
        GifDrawableBytesTranscoder gifDrawableBytesTranscoder = new GifDrawableBytesTranscoder();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        ByteBufferEncoder byteBufferEncoder = new ByteBufferEncoder();
        EncoderRegistry encoderRegistry = registry.f12302b;
        encoderRegistry.a(ByteBuffer.class, byteBufferEncoder);
        encoderRegistry.a(InputStream.class, new StreamEncoder(lruArrayPool));
        ResourceDecoderRegistry resourceDecoderRegistry = registry.f12303c;
        resourceDecoderRegistry.a(byteBufferBitmapDecoder, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.a(streamBitmapDecoder, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            registry.a(new ParcelFileDescriptorBitmapDecoder(downsampler), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        resourceDecoderRegistry.a(videoDecoderF, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        resourceDecoderRegistry.a(VideoDecoder.c(bitmapPool), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        UnitModelLoader.Factory factory = UnitModelLoader.Factory.f12604a;
        ModelLoaderRegistry modelLoaderRegistry = registry.f12301a;
        modelLoaderRegistry.a(Bitmap.class, Bitmap.class, factory);
        resourceDecoderRegistry.a(new UnitBitmapDecoder(), Bitmap.class, Bitmap.class, "Bitmap");
        ResourceEncoderRegistry resourceEncoderRegistry = registry.d;
        resourceEncoderRegistry.a(Bitmap.class, bitmapEncoder);
        resourceDecoderRegistry.a(new BitmapDrawableDecoder(resources, byteBufferBitmapDecoder), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        resourceDecoderRegistry.a(new BitmapDrawableDecoder(resources, streamBitmapDecoder), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        resourceDecoderRegistry.a(new BitmapDrawableDecoder(resources, videoDecoderF), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        resourceEncoderRegistry.a(BitmapDrawable.class, new BitmapDrawableEncoder(bitmapPool, bitmapEncoder));
        resourceDecoderRegistry.a(new StreamGifDecoder(arrayListB, byteBufferGifDecoder, lruArrayPool), InputStream.class, GifDrawable.class, "Animation");
        resourceDecoderRegistry.a(byteBufferGifDecoder, ByteBuffer.class, GifDrawable.class, "Animation");
        resourceEncoderRegistry.a(GifDrawable.class, new GifDrawableEncoder());
        modelLoaderRegistry.a(GifDecoder.class, GifDecoder.class, factory);
        resourceDecoderRegistry.a(new GifFrameResourceDecoder(bitmapPool), GifDecoder.class, Bitmap.class, "Bitmap");
        registry.a(resourceDrawableDecoder, Uri.class, Drawable.class, "legacy_append");
        registry.a(new ResourceBitmapDecoder(resourceDrawableDecoder, bitmapPool), Uri.class, Bitmap.class, "legacy_append");
        registry.d(new ByteBufferRewinder.Factory());
        modelLoaderRegistry.a(File.class, ByteBuffer.class, new ByteBufferFileLoader.Factory());
        modelLoaderRegistry.a(File.class, InputStream.class, new FileLoader.StreamFactory());
        registry.a(new FileDecoder(), File.class, File.class, "legacy_append");
        modelLoaderRegistry.a(File.class, ParcelFileDescriptor.class, new FileLoader.FileDescriptorFactory());
        modelLoaderRegistry.a(File.class, File.class, factory);
        registry.d(new InputStreamRewinder.Factory(lruArrayPool));
        if (!"robolectric".equals(str)) {
            registry.d(new ParcelFileDescriptorRewinder.Factory());
        }
        ModelLoaderFactory modelLoaderFactoryE = DirectResourceLoader.e(applicationContext);
        ModelLoaderFactory modelLoaderFactoryC = DirectResourceLoader.c(applicationContext);
        ModelLoaderFactory modelLoaderFactoryD = DirectResourceLoader.d(applicationContext);
        Class cls = Integer.TYPE;
        modelLoaderRegistry.a(cls, InputStream.class, modelLoaderFactoryE);
        modelLoaderRegistry.a(Integer.class, InputStream.class, modelLoaderFactoryE);
        modelLoaderRegistry.a(cls, AssetFileDescriptor.class, modelLoaderFactoryC);
        modelLoaderRegistry.a(Integer.class, AssetFileDescriptor.class, modelLoaderFactoryC);
        modelLoaderRegistry.a(cls, Drawable.class, modelLoaderFactoryD);
        modelLoaderRegistry.a(Integer.class, Drawable.class, modelLoaderFactoryD);
        modelLoaderRegistry.a(Uri.class, InputStream.class, ResourceUriLoader.d(applicationContext));
        registry.f12301a.a(Uri.class, AssetFileDescriptor.class, ResourceUriLoader.c(applicationContext));
        ResourceLoader.UriFactory uriFactory = new ResourceLoader.UriFactory(resources);
        ResourceLoader.AssetFileDescriptorFactory assetFileDescriptorFactory = new ResourceLoader.AssetFileDescriptorFactory(resources);
        ResourceLoader.StreamFactory streamFactory = new ResourceLoader.StreamFactory(resources);
        modelLoaderRegistry.a(Integer.class, Uri.class, uriFactory);
        modelLoaderRegistry.a(cls, Uri.class, uriFactory);
        modelLoaderRegistry.a(Integer.class, AssetFileDescriptor.class, assetFileDescriptorFactory);
        modelLoaderRegistry.a(cls, AssetFileDescriptor.class, assetFileDescriptorFactory);
        modelLoaderRegistry.a(Integer.class, InputStream.class, streamFactory);
        registry.f12301a.a(cls, InputStream.class, streamFactory);
        modelLoaderRegistry.a(String.class, InputStream.class, new DataUrlLoader.StreamFactory());
        modelLoaderRegistry.a(Uri.class, InputStream.class, new DataUrlLoader.StreamFactory());
        modelLoaderRegistry.a(String.class, InputStream.class, new StringLoader.StreamFactory());
        modelLoaderRegistry.a(String.class, ParcelFileDescriptor.class, new StringLoader.FileDescriptorFactory());
        modelLoaderRegistry.a(String.class, AssetFileDescriptor.class, new StringLoader.AssetFileDescriptorFactory());
        modelLoaderRegistry.a(Uri.class, InputStream.class, new AssetUriLoader.StreamFactory(applicationContext.getAssets()));
        modelLoaderRegistry.a(Uri.class, AssetFileDescriptor.class, new AssetUriLoader.FileDescriptorFactory(applicationContext.getAssets()));
        modelLoaderRegistry.a(Uri.class, InputStream.class, new MediaStoreImageThumbLoader.Factory(applicationContext));
        registry.f12301a.a(Uri.class, InputStream.class, new MediaStoreVideoThumbLoader.Factory(applicationContext));
        if (i2 >= 29) {
            registry.f12301a.a(Uri.class, InputStream.class, new QMediaStoreUriLoader.InputStreamFactory(applicationContext));
            registry.f12301a.a(Uri.class, ParcelFileDescriptor.class, new QMediaStoreUriLoader.FileDescriptorFactory(applicationContext));
        }
        modelLoaderRegistry.a(Uri.class, InputStream.class, new UriLoader.StreamFactory(contentResolver));
        modelLoaderRegistry.a(Uri.class, ParcelFileDescriptor.class, new UriLoader.FileDescriptorFactory(contentResolver));
        modelLoaderRegistry.a(Uri.class, AssetFileDescriptor.class, new UriLoader.AssetFileDescriptorFactory(contentResolver));
        modelLoaderRegistry.a(Uri.class, InputStream.class, new UrlUriLoader.StreamFactory());
        modelLoaderRegistry.a(URL.class, InputStream.class, new UrlLoader.StreamFactory());
        modelLoaderRegistry.a(Uri.class, File.class, new MediaStoreFileLoader.Factory(applicationContext));
        modelLoaderRegistry.a(GlideUrl.class, InputStream.class, new HttpGlideUrlLoader.Factory());
        modelLoaderRegistry.a(byte[].class, ByteBuffer.class, new ByteArrayLoader.ByteBufferFactory());
        modelLoaderRegistry.a(byte[].class, InputStream.class, new ByteArrayLoader.StreamFactory());
        modelLoaderRegistry.a(Uri.class, Uri.class, factory);
        modelLoaderRegistry.a(Drawable.class, Drawable.class, factory);
        registry.a(new UnitDrawableDecoder(), Drawable.class, Drawable.class, "legacy_append");
        BitmapDrawableTranscoder bitmapDrawableTranscoder = new BitmapDrawableTranscoder(resources);
        TranscoderRegistry transcoderRegistry = registry.f;
        transcoderRegistry.c(Bitmap.class, BitmapDrawable.class, bitmapDrawableTranscoder);
        transcoderRegistry.c(Bitmap.class, byte[].class, bitmapBytesTranscoder);
        transcoderRegistry.c(Drawable.class, byte[].class, new DrawableBytesTranscoder(bitmapPool, bitmapBytesTranscoder, gifDrawableBytesTranscoder));
        registry.f.c(GifDrawable.class, byte[].class, gifDrawableBytesTranscoder);
        VideoDecoder videoDecoderD = VideoDecoder.d(bitmapPool);
        registry.a(videoDecoderD, ByteBuffer.class, Bitmap.class, "legacy_append");
        registry.a(new BitmapDrawableDecoder(resources, videoDecoderD), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GlideModule glideModule = (GlideModule) it.next();
            try {
                glideModule.a();
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(glideModule.getClass().getName()), e2);
            }
        }
        return registry;
    }
}
