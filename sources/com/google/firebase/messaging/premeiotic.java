package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TopicsStore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class premeiotic {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static WeakReference<premeiotic> f22696wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SharedPreferences f22697attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Executor f22698dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public clubfoot f22699saneness;

    public premeiotic(SharedPreferences sharedPreferences, Executor executor) {
        this.f22698dern = executor;
        this.f22697attabal = sharedPreferences;
    }

    public static synchronized premeiotic saneness(Context context, Executor executor) {
        premeiotic premeioticVar;
        try {
            WeakReference<premeiotic> weakReference = f22696wireman;
            premeioticVar = weakReference != null ? weakReference.get() : null;
            if (premeioticVar == null) {
                premeioticVar = new premeiotic(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                premeioticVar.wireman();
                f22696wireman = new WeakReference<>(premeioticVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return premeioticVar;
    }

    public synchronized boolean attabal(cultivated cultivatedVar) {
        return this.f22699saneness.saneness(cultivatedVar.marial());
    }

    public synchronized cultivated dern() {
        return cultivated.attabal(this.f22699saneness.beachfront());
    }

    public synchronized boolean marial(cultivated cultivatedVar) {
        return this.f22699saneness.competently(cultivatedVar.marial());
    }

    public final synchronized void wireman() {
        this.f22699saneness = clubfoot.wireman(this.f22697attabal, "topic_operation_queue", ",", this.f22698dern);
    }
}
