package com.lzh.easythread;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: RunnableWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class taiyuan implements Runnable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Runnable f23546arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public wireman f23547kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Callable f23548monoploid;
    private String name;

    public taiyuan(marial marialVar) {
        this.name = marialVar.name;
        this.f23547kowloon = new wireman(marialVar.f23542attabal, marialVar.f23543dern, marialVar.f23545wireman);
    }

    public taiyuan attabal(Runnable runnable) {
        this.f23546arytenoidectomy = runnable;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        cutely.saneness(Thread.currentThread(), this.name, this.f23547kowloon);
        this.f23547kowloon.onStart(this.name);
        Runnable runnable = this.f23546arytenoidectomy;
        if (runnable != null) {
            runnable.run();
        } else {
            Callable callable = this.f23548monoploid;
            if (callable != null) {
                try {
                    this.f23547kowloon.onSuccess(callable.call());
                } catch (Exception e) {
                    this.f23547kowloon.saneness(this.name, e);
                }
            }
        }
        this.f23547kowloon.attabal(this.name);
    }
}
