package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: compiled from: AssetPathFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class saneness<T> implements wireman<T> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final AssetManager f17613arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final String f17614kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public T f17615monoploid;

    public saneness(AssetManager assetManager, String str) {
        this.f17613arytenoidectomy = assetManager;
        this.f17614kowloon = str;
    }

    public abstract T beachfront(AssetManager assetManager, String str) throws IOException;

    public abstract void dern(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.wireman
    public void marial(Priority priority, wireman.attabal<? super T> attabalVar) {
        try {
            T tBeachfront = beachfront(this.f17613arytenoidectomy, this.f17614kowloon);
            this.f17615monoploid = tBeachfront;
            attabalVar.beachfront(tBeachfront);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
            attabalVar.dern(e);
        }
    }

    @Override // com.bumptech.glide.load.data.wireman
    public void saneness() {
        T t = this.f17615monoploid;
        if (t == null) {
            return;
        }
        try {
            dern(t);
        } catch (IOException unused) {
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
