package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import okio.Source;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RequestHandler {

    public static final class Result {
        private final Bitmap bitmap;
        private final int exifOrientation;
        private final Picasso.LoadedFrom loadedFrom;
        private final Source source;

        public Result(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) Utils.checkNotNull(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public int getExifOrientation() {
            return this.exifOrientation;
        }

        public Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        public Source getSource() {
            return this.source;
        }

        public Result(Source source, Picasso.LoadedFrom loadedFrom) {
            this(null, (Source) Utils.checkNotNull(source, "source == null"), loadedFrom, 0);
        }

        public Result(Bitmap bitmap, Source source, Picasso.LoadedFrom loadedFrom, int i2) {
            if ((bitmap != null) != (source != null)) {
                this.bitmap = bitmap;
                this.source = source;
                this.loadedFrom = (Picasso.LoadedFrom) Utils.checkNotNull(loadedFrom, "loadedFrom == null");
                this.exifOrientation = i2;
                return;
            }
            throw new AssertionError();
        }
    }

    public static void calculateInSampleSize(int i2, int i3, BitmapFactory.Options options, Request request) {
        calculateInSampleSize(i2, i3, options.outWidth, options.outHeight, options, request);
    }

    public static BitmapFactory.Options createBitmapOptions(Request request) {
        boolean zHasSize = request.hasSize();
        boolean z2 = request.config != null;
        if (!zHasSize && !z2 && !request.purgeable) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zHasSize;
        boolean z3 = request.purgeable;
        options.inInputShareable = z3;
        options.inPurgeable = z3;
        if (z2) {
            options.inPreferredConfig = request.config;
        }
        return options;
    }

    public static boolean requiresInSampleSize(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(Request request);

    public int getRetryCount() {
        return 0;
    }

    public abstract Result load(Request request, int i2) throws IOException;

    public boolean shouldRetry(boolean z2, NetworkInfo networkInfo) {
        return false;
    }

    public boolean supportsReplay() {
        return false;
    }

    public static void calculateInSampleSize(int i2, int i3, int i4, int i5, BitmapFactory.Options options, Request request) {
        int iMax;
        double dFloor;
        if (i5 > i3 || i4 > i2) {
            if (i3 == 0) {
                dFloor = Math.floor(i4 / i2);
            } else if (i2 == 0) {
                dFloor = Math.floor(i5 / i3);
            } else {
                int iFloor = (int) Math.floor(i5 / i3);
                int iFloor2 = (int) Math.floor(i4 / i2);
                iMax = request.centerInside ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }
}
