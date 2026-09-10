package com.google.ads.mediation.inmobi;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ImageDownloaderAsyncTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal extends AsyncTask<Object, Void, HashMap<String, Drawable>> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f18901saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final InMobiMemoryCache f18900dern = new InMobiMemoryCache();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f18899attabal = 10;

    /* JADX INFO: renamed from: com.google.ads.mediation.inmobi.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageDownloaderAsyncTask.java */
    public class CallableC0285attabal implements Callable<Drawable> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ URL f18903kowloon;

        public CallableC0285attabal(URL url) {
            this.f18903kowloon = url;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Drawable call() throws Exception {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f18903kowloon.openStream());
            bitmapDecodeStream.setDensity(160);
            return new BitmapDrawable(Resources.getSystem(), bitmapDecodeStream);
        }
    }

    /* JADX INFO: compiled from: ImageDownloaderAsyncTask.java */
    public interface saneness {
        void attabal(HashMap<String, Drawable> map);

        void saneness();
    }

    public attabal(saneness sanenessVar) {
        this.f18901saneness = sanenessVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public HashMap<String, Drawable> doInBackground(Object... objArr) {
        Drawable drawable;
        HashMap map = (HashMap) objArr[0];
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        try {
            if (this.f18900dern.get(String.valueOf(map.get("icon_key"))) != null) {
                drawable = this.f18900dern.get(String.valueOf(map.get("icon_key")));
            } else {
                Drawable drawable2 = saneness((URL) map.get("icon_key"), executorServiceNewCachedThreadPool).get(this.f18899attabal, TimeUnit.SECONDS);
                this.f18900dern.dern(String.valueOf(map.get("icon_key")), drawable2);
                drawable = drawable2;
            }
            HashMap<String, Drawable> map2 = new HashMap<>();
            map2.put("icon_key", drawable);
            return map2;
        } catch (InterruptedException e) {
            e = e;
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            e.printStackTrace();
            return null;
        } catch (TimeoutException e3) {
            e = e3;
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(HashMap<String, Drawable> map) {
        super.onPostExecute(map);
        if (map != null) {
            this.f18901saneness.attabal(map);
        } else {
            this.f18901saneness.saneness();
        }
    }

    public final Future<Drawable> saneness(URL url, ExecutorService executorService) {
        return executorService.submit(new CallableC0285attabal(url));
    }
}
