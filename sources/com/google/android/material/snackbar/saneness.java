package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: SnackbarManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static saneness f21088marial;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public dern f21090dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public dern f21092wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f21089attabal = new Object();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Handler f21091saneness = new Handler(Looper.getMainLooper(), new attabal());

    /* JADX INFO: compiled from: SnackbarManager.java */
    public class attabal implements Handler.Callback {
        public attabal() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            saneness.this.wireman((dern) message.obj);
            return true;
        }
    }

    /* JADX INFO: compiled from: SnackbarManager.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final WeakReference<InterfaceC0305saneness> f21094attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f21095dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f21096saneness;

        public boolean attabal(InterfaceC0305saneness interfaceC0305saneness) {
            return interfaceC0305saneness != null && this.f21094attabal.get() == interfaceC0305saneness;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SnackbarManager.java */
    public interface InterfaceC0305saneness {
        void attabal(int i);

        void show();
    }

    public static saneness dern() {
        if (f21088marial == null) {
            f21088marial = new saneness();
        }
        return f21088marial;
    }

    public void apical(InterfaceC0305saneness interfaceC0305saneness) {
        synchronized (this.f21089attabal) {
            try {
                if (beachfront(interfaceC0305saneness)) {
                    dern dernVar = this.f21090dern;
                    if (dernVar.f21095dern) {
                        dernVar.f21095dern = false;
                        formularize(dernVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean attabal(dern dernVar, int i) {
        InterfaceC0305saneness interfaceC0305saneness = dernVar.f21094attabal.get();
        if (interfaceC0305saneness == null) {
            return false;
        }
        this.f21091saneness.removeCallbacksAndMessages(dernVar);
        interfaceC0305saneness.attabal(i);
        return true;
    }

    public final boolean beachfront(InterfaceC0305saneness interfaceC0305saneness) {
        dern dernVar = this.f21090dern;
        return dernVar != null && dernVar.attabal(interfaceC0305saneness);
    }

    public final boolean competently(InterfaceC0305saneness interfaceC0305saneness) {
        dern dernVar = this.f21092wireman;
        return dernVar != null && dernVar.attabal(interfaceC0305saneness);
    }

    public void cutely(InterfaceC0305saneness interfaceC0305saneness) {
        synchronized (this.f21089attabal) {
            try {
                if (beachfront(interfaceC0305saneness)) {
                    dern dernVar = this.f21090dern;
                    if (!dernVar.f21095dern) {
                        dernVar.f21095dern = true;
                        this.f21091saneness.removeCallbacksAndMessages(dernVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void formularize(dern dernVar) {
        int i = dernVar.f21096saneness;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f21091saneness.removeCallbacksAndMessages(dernVar);
        Handler handler = this.f21091saneness;
        handler.sendMessageDelayed(Message.obtain(handler, 0, dernVar), i);
    }

    public final void impassible() {
        dern dernVar = this.f21092wireman;
        if (dernVar != null) {
            this.f21090dern = dernVar;
            this.f21092wireman = null;
            InterfaceC0305saneness interfaceC0305saneness = dernVar.f21094attabal.get();
            if (interfaceC0305saneness != null) {
                interfaceC0305saneness.show();
            } else {
                this.f21090dern = null;
            }
        }
    }

    public void impromptu(InterfaceC0305saneness interfaceC0305saneness) {
        synchronized (this.f21089attabal) {
            try {
                if (beachfront(interfaceC0305saneness)) {
                    this.f21090dern = null;
                    if (this.f21092wireman != null) {
                        impassible();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean marial(InterfaceC0305saneness interfaceC0305saneness) {
        boolean z;
        synchronized (this.f21089attabal) {
            try {
                z = beachfront(interfaceC0305saneness) || competently(interfaceC0305saneness);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void saneness(InterfaceC0305saneness interfaceC0305saneness, int i) {
        synchronized (this.f21089attabal) {
            try {
                if (beachfront(interfaceC0305saneness)) {
                    attabal(this.f21090dern, i);
                } else if (competently(interfaceC0305saneness)) {
                    attabal(this.f21092wireman, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void taiyuan(InterfaceC0305saneness interfaceC0305saneness) {
        synchronized (this.f21089attabal) {
            try {
                if (beachfront(interfaceC0305saneness)) {
                    formularize(this.f21090dern);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void wireman(dern dernVar) {
        synchronized (this.f21089attabal) {
            try {
                if (this.f21090dern == dernVar || this.f21092wireman == dernVar) {
                    attabal(dernVar, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
