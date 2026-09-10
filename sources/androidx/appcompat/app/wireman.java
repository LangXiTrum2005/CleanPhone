package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: AppCompatDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class wireman {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static dern f4830kowloon = new dern(new ExecutorC0030wireman());

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static int f4826arytenoidectomy = -100;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static claque.taiyuan f4832monoploid = null;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static claque.taiyuan f4833polloi = null;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static Boolean f4831molybdenite = null;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static boolean f4829graveside = false;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final androidx.collection.saneness<WeakReference<wireman>> f4825adultoid = new androidx.collection.saneness<>();

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final Object f4827dovishness = new Object();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final Object f4828gintrap = new Object();

    /* JADX INFO: compiled from: AppCompatDelegate.java */
    public static class attabal {
        public static LocaleList attabal(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegate.java */
    public static class dern implements Executor {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final Executor f4836monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public Runnable f4837polloi;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Object f4835kowloon = new Object();

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Queue<Runnable> f4834arytenoidectomy = new ArrayDeque();

        public dern(Executor executor) {
            this.f4836monoploid = executor;
        }

        public static /* synthetic */ void attabal(dern dernVar, Runnable runnable) {
            dernVar.getClass();
            try {
                runnable.run();
            } finally {
                dernVar.saneness();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f4835kowloon) {
                try {
                    this.f4834arytenoidectomy.add(new Runnable() { // from class: androidx.appcompat.app.marial
                        @Override // java.lang.Runnable
                        public final void run() {
                            wireman.dern.attabal(this.f4814kowloon, runnable);
                        }
                    });
                    if (this.f4837polloi == null) {
                        saneness();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void saneness() {
            synchronized (this.f4835kowloon) {
                try {
                    Runnable runnablePoll = this.f4834arytenoidectomy.poll();
                    this.f4837polloi = runnablePoll;
                    if (runnablePoll != null) {
                        this.f4836monoploid.execute(runnablePoll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegate.java */
    public static class saneness {
        public static LocaleList attabal(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void saneness(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppCompatDelegate.java */
    public static class ExecutorC0030wireman implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean adultoid(Context context) {
        if (f4831molybdenite == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.attabal(context).metaData;
                if (bundle != null) {
                    f4831molybdenite = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f4831molybdenite = Boolean.FALSE;
            }
        }
        return f4831molybdenite.booleanValue();
    }

    public static claque.taiyuan apical() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objKowloon = kowloon();
            if (objKowloon != null) {
                return claque.taiyuan.taiyuan(saneness.attabal(objKowloon));
            }
        } else {
            claque.taiyuan taiyuanVar = f4832monoploid;
            if (taiyuanVar != null) {
                return taiyuanVar;
            }
        }
        return claque.taiyuan.wireman();
    }

    public static /* synthetic */ void dern(Context context) {
        grimness(context);
        f4829graveside = true;
    }

    public static void grimness(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (apical().marial()) {
                    String strSaneness = igbo.marial.saneness(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        saneness.saneness(systemService, attabal.attabal(strSaneness));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static int impassible() {
        return f4826arytenoidectomy;
    }

    public static wireman impromptu(Activity activity, androidx.appcompat.app.saneness sanenessVar) {
        return new AppCompatDelegateImpl(activity, sanenessVar);
    }

    public static Object kowloon() {
        Context contextFormularize;
        Iterator<WeakReference<wireman>> it = f4825adultoid.iterator();
        while (it.hasNext()) {
            wireman wiremanVar = it.next().get();
            if (wiremanVar != null && (contextFormularize = wiremanVar.formularize()) != null) {
                return contextFormularize.getSystemService("locale");
            }
        }
        return null;
    }

    public static claque.taiyuan monoploid() {
        return f4832monoploid;
    }

    public static void oilcan(wireman wiremanVar) {
        synchronized (f4827dovishness) {
            yemenite(wiremanVar);
        }
    }

    public static void saran(final Context context) {
        if (adultoid(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f4829graveside) {
                    return;
                }
                f4830kowloon.execute(new Runnable() { // from class: androidx.appcompat.app.dern
                    @Override // java.lang.Runnable
                    public final void run() {
                        wireman.dern(context);
                    }
                });
                return;
            }
            synchronized (f4828gintrap) {
                try {
                    claque.taiyuan taiyuanVar = f4832monoploid;
                    if (taiyuanVar == null) {
                        if (f4833polloi == null) {
                            f4833polloi = claque.taiyuan.saneness(igbo.marial.saneness(context));
                        }
                        if (f4833polloi.marial()) {
                        } else {
                            f4832monoploid = f4833polloi;
                        }
                    } else if (!taiyuanVar.equals(f4833polloi)) {
                        claque.taiyuan taiyuanVar2 = f4832monoploid;
                        f4833polloi = taiyuanVar2;
                        igbo.marial.attabal(context, taiyuanVar2.competently());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static wireman taiyuan(Dialog dialog, androidx.appcompat.app.saneness sanenessVar) {
        return new AppCompatDelegateImpl(dialog, sanenessVar);
    }

    public static void wireman(wireman wiremanVar) {
        synchronized (f4827dovishness) {
            yemenite(wiremanVar);
            f4825adultoid.add(new WeakReference<>(wiremanVar));
        }
    }

    public static void yemenite(wireman wiremanVar) {
        synchronized (f4827dovishness) {
            try {
                Iterator<WeakReference<wireman>> it = f4825adultoid.iterator();
                while (it.hasNext()) {
                    wireman wiremanVar2 = it.next().get();
                    if (wiremanVar2 == wiremanVar || wiremanVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract MenuInflater arytenoidectomy();

    public Context competently(Context context) {
        beachfront(context);
        return context;
    }

    public abstract void cord();

    public abstract void cuirassed(Bundle bundle);

    public abstract <T extends View> T cutely(int i);

    public abstract void dovishness(Configuration configuration);

    public Context formularize() {
        return null;
    }

    public abstract void gintrap(Bundle bundle);

    public abstract void graveside();

    public abstract void kattegat(int i);

    public abstract void marial(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void molybdenite();

    public abstract ActionBar polloi();

    public abstract void preprohormone(Bundle bundle);

    public abstract void restrictive(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void rotuma();

    public abstract boolean sealless(int i);

    public abstract void seminary(CharSequence charSequence);

    public abstract void stratoscope();

    public abstract void supplicat(View view);

    public int triweekly() {
        return -100;
    }

    public abstract void trm();

    @Deprecated
    public void beachfront(Context context) {
    }

    public void merc(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void polder(int i) {
    }
}
