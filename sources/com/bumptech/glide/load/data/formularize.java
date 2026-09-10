package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: LocalUriFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class formularize<T> implements wireman<T> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final ContentResolver f17610arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Uri f17611kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public T f17612monoploid;

    public formularize(ContentResolver contentResolver, Uri uri) {
        this.f17610arytenoidectomy = contentResolver;
        this.f17611kowloon = uri;
    }

    public abstract T beachfront(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public abstract void dern(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.wireman
    public final void marial(Priority priority, wireman.attabal<? super T> attabalVar) {
        try {
            T tBeachfront = beachfront(this.f17611kowloon, this.f17610arytenoidectomy);
            this.f17612monoploid = tBeachfront;
            attabalVar.beachfront(tBeachfront);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            attabalVar.dern(e);
        }
    }

    @Override // com.bumptech.glide.load.data.wireman
    public void saneness() {
        T t = this.f17612monoploid;
        if (t != null) {
            try {
                dern(t);
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
