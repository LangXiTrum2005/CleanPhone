package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: ImageDownload.java */
/* JADX INFO: loaded from: classes3.dex */
public class kattegat implements Closeable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public volatile Future<?> f22658arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final URL f22659kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Task<Bitmap> f22660monoploid;

    public kattegat(URL url) {
        this.f22659kowloon = url;
    }

    public static /* synthetic */ void attabal(kattegat kattegatVar, TaskCompletionSource taskCompletionSource) {
        kattegatVar.getClass();
        try {
            taskCompletionSource.setResult(kattegatVar.saneness());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static kattegat marial(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new kattegat(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22658arytenoidectomy.cancel(true);
    }

    public Task<Bitmap> cutely() {
        return (Task) Preconditions.checkNotNull(this.f22660monoploid);
    }

    public final byte[] dern() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f22659kowloon.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrWireman = saneness.wireman(saneness.saneness(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrWireman.length;
                Objects.toString(this.f22659kowloon);
            }
            if (bArrWireman.length <= 1048576) {
                return bArrWireman;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void formularize(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22658arytenoidectomy = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.sealless
            @Override // java.lang.Runnable
            public final void run() {
                kattegat.attabal(this.f22746kowloon, taskCompletionSource);
            }
        });
        this.f22660monoploid = taskCompletionSource.getTask();
    }

    public Bitmap saneness() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Objects.toString(this.f22659kowloon);
        }
        byte[] bArrDern = dern();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDern, 0, bArrDern.length);
        if (bitmapDecodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(this.f22659kowloon);
            }
            return bitmapDecodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f22659kowloon);
    }
}
