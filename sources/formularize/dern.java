package formularize;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ArchTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class dern extends marial {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static volatile dern f26523dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public marial f26526attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial f26527saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Executor f26525wireman = new Executor() { // from class: formularize.attabal
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            dern.competently().dern(runnable);
        }
    };

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Executor f26524marial = new Executor() { // from class: formularize.saneness
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            dern.competently().attabal(runnable);
        }
    };

    public dern() {
        wireman wiremanVar = new wireman();
        this.f26527saneness = wiremanVar;
        this.f26526attabal = wiremanVar;
    }

    public static Executor beachfront() {
        return f26524marial;
    }

    public static dern competently() {
        if (f26523dern != null) {
            return f26523dern;
        }
        synchronized (dern.class) {
            try {
                if (f26523dern == null) {
                    f26523dern = new dern();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f26523dern;
    }

    @Override // formularize.marial
    public void attabal(Runnable runnable) {
        this.f26526attabal.attabal(runnable);
    }

    @Override // formularize.marial
    public void dern(Runnable runnable) {
        this.f26526attabal.dern(runnable);
    }

    @Override // formularize.marial
    public boolean saneness() {
        return this.f26526attabal.saneness();
    }
}
