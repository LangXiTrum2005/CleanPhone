package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.ExifOrientationStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ThumbFetcher implements DataFetcher<InputStream> {
    public final Uri X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ThumbnailStreamOpener f12383Y;
    public InputStream Z;

    public static class ImageThumbnailQuery implements ThumbnailQuery {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f12384b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f12385a;

        public ImageThumbnailQuery(ContentResolver contentResolver) {
            this.f12385a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f12385a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f12384b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public static class VideoThumbnailQuery implements ThumbnailQuery {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f12386b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f12387a;

        public VideoThumbnailQuery(ContentResolver contentResolver) {
            this.f12387a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f12387a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f12386b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public ThumbFetcher(Uri uri, ThumbnailStreamOpener thumbnailStreamOpener) {
        this.X = uri;
        this.f12383Y = thumbnailStreamOpener;
    }

    public static ThumbFetcher c(Context context, Uri uri, ThumbnailQuery thumbnailQuery) {
        return new ThumbFetcher(uri, new ThumbnailStreamOpener(Glide.a(context).Z.a().b(), thumbnailQuery, Glide.a(context).e0, context.getContentResolver()));
    }

    public static ThumbFetcher f(Context context, Uri uri) {
        return c(context, uri, new ImageThumbnailQuery(context.getContentResolver()));
    }

    public static ThumbFetcher g(Context context, Uri uri) {
        return c(context, uri, new VideoThumbnailQuery(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() {
        InputStream inputStream = this.Z;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final DataSource d() {
        return DataSource.X;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void e(Priority priority, DataFetcher.DataCallback dataCallback) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.Z = inputStreamH;
            dataCallback.f(inputStreamH);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            dataCallback.c(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0022: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:35), block:B:10:0x0022 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    public final InputStream h() throws Throwable {
        Cursor cursorA;
        ?? r6;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iC;
        Uri uri = this.X;
        ThumbnailStreamOpener thumbnailStreamOpener = this.f12383Y;
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorA = thumbnailStreamOpener.f12389a.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                        }
                        string = null;
                        zIsEmpty = TextUtils.isEmpty(string);
                        contentResolver = thumbnailStreamOpener.f12391c;
                        if (zIsEmpty) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iC = ImageHeaderParserUtils.c(thumbnailStreamOpener.d, inputStreamOpenInputStream2, thumbnailStreamOpener.f12390b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (IOException | NullPointerException e3) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e3);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    iC = -1;
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    try {
                                        r5.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            iC = -1;
                        }
                        if (iC != -1) {
                            return new ExifOrientationStream(inputStreamOpenInputStream, iC);
                        }
                        return inputStreamOpenInputStream;
                    }
                    zIsEmpty = TextUtils.isEmpty(string);
                    contentResolver = thumbnailStreamOpener.f12391c;
                    if (zIsEmpty) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e4) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e4));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        iC = ImageHeaderParserUtils.c(thumbnailStreamOpener.d, inputStreamOpenInputStream2, thumbnailStreamOpener.f12390b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iC = -1;
                    }
                    if (iC != -1) {
                        return new ExifOrientationStream(inputStreamOpenInputStream, iC);
                    }
                    return inputStreamOpenInputStream;
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            } catch (SecurityException e5) {
                e = e5;
                cursorA = null;
            } catch (Throwable th2) {
                th = th2;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
            string = null;
            zIsEmpty = TextUtils.isEmpty(string);
            contentResolver = thumbnailStreamOpener.f12391c;
            if (zIsEmpty) {
                inputStreamOpenInputStream = null;
            } else {
                file = new File(string);
                if (file.exists()) {
                    inputStreamOpenInputStream = null;
                } else {
                    inputStreamOpenInputStream = null;
                }
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iC = ImageHeaderParserUtils.c(thumbnailStreamOpener.d, inputStreamOpenInputStream2, thumbnailStreamOpener.f12390b);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iC = -1;
            }
            if (iC != -1) {
                return new ExifOrientationStream(inputStreamOpenInputStream, iC);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            th = th3;
            r5 = r6;
            if (r5 != 0) {
                r5.close();
            }
            throw th;
        }
    }
}
