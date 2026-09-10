package com.lzh.easythread;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: CallbackDelegate.java */
/* JADX INFO: loaded from: classes4.dex */
public final class wireman implements com.lzh.easythread.dern, com.lzh.easythread.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public com.lzh.easythread.dern f23549attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Executor f23550dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public com.lzh.easythread.saneness f23551saneness;

    /* JADX INFO: compiled from: CallbackDelegate.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Object f23553kowloon;

        public attabal(Object obj) {
            this.f23553kowloon = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                wireman.this.f23551saneness.onSuccess(this.f23553kowloon);
            } catch (Throwable th) {
                wireman.this.dern(th);
            }
        }
    }

    /* JADX INFO: compiled from: CallbackDelegate.java */
    public class dern implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Throwable f23554arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ String f23555kowloon;

        public dern(String str, Throwable th) {
            this.f23555kowloon = str;
            this.f23554arytenoidectomy = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            wireman.this.f23549attabal.saneness(this.f23555kowloon, this.f23554arytenoidectomy);
        }
    }

    /* JADX INFO: compiled from: CallbackDelegate.java */
    public class marial implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ String f23558kowloon;

        public marial(String str) {
            this.f23558kowloon = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            wireman.this.f23549attabal.onStart(this.f23558kowloon);
        }
    }

    /* JADX INFO: compiled from: CallbackDelegate.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Throwable f23560kowloon;

        public saneness(Throwable th) {
            this.f23560kowloon = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            wireman.this.f23551saneness.dern(this.f23560kowloon);
        }
    }

    /* JADX INFO: renamed from: com.lzh.easythread.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallbackDelegate.java */
    public class RunnableC0420wireman implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ String f23562kowloon;

        public RunnableC0420wireman(String str) {
            this.f23562kowloon = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            wireman.this.f23549attabal.attabal(this.f23562kowloon);
        }
    }

    public wireman(com.lzh.easythread.dern dernVar, Executor executor, com.lzh.easythread.saneness sanenessVar) {
        this.f23549attabal = dernVar;
        this.f23550dern = executor;
        this.f23551saneness = sanenessVar;
    }

    @Override // com.lzh.easythread.dern
    public void attabal(String str) {
        if (this.f23549attabal == null) {
            return;
        }
        this.f23550dern.execute(new RunnableC0420wireman(str));
    }

    @Override // com.lzh.easythread.saneness
    public void dern(Throwable th) {
        if (this.f23551saneness == null) {
            return;
        }
        this.f23550dern.execute(new saneness(th));
    }

    @Override // com.lzh.easythread.dern
    public void onStart(String str) {
        if (this.f23549attabal == null) {
            return;
        }
        this.f23550dern.execute(new marial(str));
    }

    @Override // com.lzh.easythread.saneness
    public void onSuccess(Object obj) {
        if (this.f23551saneness == null) {
            return;
        }
        this.f23550dern.execute(new attabal(obj));
    }

    @Override // com.lzh.easythread.dern
    public void saneness(String str, Throwable th) {
        dern(th);
        if (this.f23549attabal == null) {
            return;
        }
        this.f23550dern.execute(new dern(str, th));
    }
}
