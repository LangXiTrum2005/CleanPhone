package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SharedPreferencesQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public final class clubfoot {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SharedPreferences f22612attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f22614dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Executor f22615marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f22616saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ArrayDeque<String> f22617wireman = new ArrayDeque<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f22613beachfront = false;

    public clubfoot(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f22612attabal = sharedPreferences;
        this.f22616saneness = str;
        this.f22614dern = str2;
        this.f22615marial = executor;
    }

    public static clubfoot wireman(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        clubfoot clubfootVar = new clubfoot(sharedPreferences, str, str2, executor);
        clubfootVar.marial();
        return clubfootVar;
    }

    public String beachfront() {
        String strPeek;
        synchronized (this.f22617wireman) {
            strPeek = this.f22617wireman.peek();
        }
        return strPeek;
    }

    public boolean competently(Object obj) {
        boolean zDern;
        synchronized (this.f22617wireman) {
            zDern = dern(this.f22617wireman.remove(obj));
        }
        return zDern;
    }

    public final void cutely() {
        this.f22615marial.execute(new Runnable() { // from class: com.google.firebase.messaging.overspeculate
            @Override // java.lang.Runnable
            public final void run() {
                this.f22685kowloon.taiyuan();
            }
        });
    }

    public final boolean dern(boolean z) {
        if (z && !this.f22613beachfront) {
            cutely();
        }
        return z;
    }

    public String impromptu() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f22617wireman.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f22614dern);
        }
        return sb.toString();
    }

    public final void marial() {
        synchronized (this.f22617wireman) {
            try {
                this.f22617wireman.clear();
                String string = this.f22612attabal.getString(this.f22616saneness, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f22614dern)) {
                    String[] strArrSplit = string.split(this.f22614dern, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f22617wireman.add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean saneness(String str) {
        boolean zDern;
        if (TextUtils.isEmpty(str) || str.contains(this.f22614dern)) {
            return false;
        }
        synchronized (this.f22617wireman) {
            zDern = dern(this.f22617wireman.add(str));
        }
        return zDern;
    }

    public final void taiyuan() {
        synchronized (this.f22617wireman) {
            this.f22612attabal.edit().putString(this.f22616saneness, impromptu()).commit();
        }
    }
}
