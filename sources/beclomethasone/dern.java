package beclomethasone;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.competently;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ThumbFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern implements com.bumptech.glide.load.data.wireman<InputStream> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final marial f15033arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Uri f15034kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public InputStream f15035monoploid;

    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class attabal implements wireman {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final String[] f15036saneness = {"_data"};

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentResolver f15037attabal;

        public attabal(ContentResolver contentResolver) {
            this.f15037attabal = contentResolver;
        }

        @Override // beclomethasone.wireman
        public Cursor attabal(Uri uri) {
            return this.f15037attabal.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f15036saneness, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class saneness implements wireman {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final String[] f15038saneness = {"_data"};

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentResolver f15039attabal;

        public saneness(ContentResolver contentResolver) {
            this.f15039attabal = contentResolver;
        }

        @Override // beclomethasone.wireman
        public Cursor attabal(Uri uri) {
            return this.f15039attabal.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f15038saneness, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public dern(Uri uri, marial marialVar) {
        this.f15034kowloon = uri;
        this.f15033arytenoidectomy = marialVar;
    }

    public static dern beachfront(Context context, Uri uri) {
        return dern(context, uri, new attabal(context.getContentResolver()));
    }

    public static dern competently(Context context, Uri uri) {
        return dern(context, uri, new saneness(context.getContentResolver()));
    }

    public static dern dern(Context context, Uri uri, wireman wiremanVar) {
        return new dern(uri, new marial(com.bumptech.glide.saneness.dern(context).cutely().competently(), wiremanVar, com.bumptech.glide.saneness.dern(context).marial(), context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.wireman
    public Class<InputStream> attabal() {
        return InputStream.class;
    }

    public final InputStream impromptu() throws Throwable {
        InputStream inputStreamWireman = this.f15033arytenoidectomy.wireman(this.f15034kowloon);
        int iAttabal = inputStreamWireman != null ? this.f15033arytenoidectomy.attabal(this.f15034kowloon) : -1;
        return iAttabal != -1 ? new competently(inputStreamWireman, iAttabal) : inputStreamWireman;
    }

    @Override // com.bumptech.glide.load.data.wireman
    public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super InputStream> attabalVar) throws Throwable {
        try {
            InputStream inputStreamImpromptu = impromptu();
            this.f15035monoploid = inputStreamImpromptu;
            attabalVar.beachfront(inputStreamImpromptu);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            attabalVar.dern(e);
        }
    }

    @Override // com.bumptech.glide.load.data.wireman
    public void saneness() {
        InputStream inputStream = this.f15035monoploid;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.wireman
    public DataSource wireman() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.wireman
    public void cancel() {
    }
}
