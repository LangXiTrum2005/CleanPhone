package umbriferous;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class cuirassed implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f39085attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f39086dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final AtomicBoolean f39087marial = new AtomicBoolean(false);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final reeve.impromptu f39088saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final gelandelaufer.attabal f39089wireman;

    /* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
    public interface attabal {
        void attabal(reeve.impromptu impromptuVar, Thread thread, Throwable th);
    }

    public cuirassed(attabal attabalVar, reeve.impromptu impromptuVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, gelandelaufer.attabal attabalVar2) {
        this.f39085attabal = attabalVar;
        this.f39088saneness = impromptuVar;
        this.f39086dern = uncaughtExceptionHandler;
        this.f39089wireman = attabalVar2;
    }

    public boolean attabal() {
        return this.f39087marial.get();
    }

    public final boolean saneness(Thread thread, Throwable th) {
        if (thread == null) {
            gelandelaufer.competently.beachfront().wireman("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            gelandelaufer.competently.beachfront().wireman("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f39089wireman.saneness()) {
            return true;
        }
        gelandelaufer.competently.beachfront().saneness("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f39087marial.set(true);
        try {
            try {
                if (saneness(thread, th)) {
                    this.f39085attabal.attabal(this.f39088saneness, thread, th);
                } else {
                    gelandelaufer.competently.beachfront().saneness("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f39086dern != null) {
                    gelandelaufer.competently.beachfront().saneness("Completed exception processing. Invoking default exception handler.");
                    this.f39086dern.uncaughtException(thread, th);
                } else {
                    gelandelaufer.competently.beachfront().saneness("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e) {
                gelandelaufer.competently.beachfront().marial("An error occurred in the uncaught exception handler", e);
                if (this.f39086dern == null) {
                    gelandelaufer.competently.beachfront().saneness("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.f39087marial.set(false);
        } catch (Throwable th2) {
            if (this.f39086dern != null) {
                gelandelaufer.competently.beachfront().saneness("Completed exception processing. Invoking default exception handler.");
                this.f39086dern.uncaughtException(thread, th);
            } else {
                gelandelaufer.competently.beachfront().saneness("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f39087marial.set(false);
            throw th2;
        }
    }
}
