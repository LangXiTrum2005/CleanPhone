package glutethimide;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: MediaStoreFileLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class formularize implements kowloon<Uri, File> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f27232attabal;

    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static final class attabal implements arytenoidectomy<Uri, File> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f27233attabal;

        public attabal(Context context) {
            this.f27233attabal = context;
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, File> wireman(molybdenite molybdeniteVar) {
            return new formularize(this.f27233attabal);
        }
    }

    public formularize(Context context) {
        this.f27232attabal = context;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<File> saneness(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        return new kowloon.attabal<>(new leafed.saneness(uri), new saneness(this.f27232attabal, uri));
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Uri uri) {
        return beclomethasone.saneness.dern(uri);
    }

    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static class saneness implements com.bumptech.glide.load.data.wireman<File> {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public static final String[] f27234monoploid = {"_data"};

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Uri f27235arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Context f27236kowloon;

        public saneness(Context context, Uri uri) {
            this.f27236kowloon = context;
            this.f27235arytenoidectomy = uri;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public Class<File> attabal() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super File> attabalVar) {
            Cursor cursorQuery = this.f27236kowloon.getContentResolver().query(this.f27235arytenoidectomy, f27234monoploid, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                attabalVar.beachfront(new File(string));
                return;
            }
            attabalVar.dern(new FileNotFoundException("Failed to find file path for: " + this.f27235arytenoidectomy));
        }

        @Override // com.bumptech.glide.load.data.wireman
        public DataSource wireman() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void saneness() {
        }
    }
}
