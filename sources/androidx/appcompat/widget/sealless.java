package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: TintContextWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class sealless extends ContextWrapper {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f5553dern = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static ArrayList<WeakReference<sealless>> f5554wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Resources f5555attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Resources.Theme f5556saneness;

    public sealless(Context context) {
        super(context);
        if (!walach.dern()) {
            this.f5555attabal = new supplicat(this, context.getResources());
            this.f5556saneness = null;
            return;
        }
        walach walachVar = new walach(this, context.getResources());
        this.f5555attabal = walachVar;
        Resources.Theme themeNewTheme = walachVar.newTheme();
        this.f5556saneness = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean attabal(Context context) {
        return ((context instanceof sealless) || (context.getResources() instanceof supplicat) || (context.getResources() instanceof walach) || !walach.dern()) ? false : true;
    }

    public static Context saneness(Context context) {
        if (!attabal(context)) {
            return context;
        }
        synchronized (f5553dern) {
            try {
                ArrayList<WeakReference<sealless>> arrayList = f5554wireman;
                if (arrayList == null) {
                    f5554wireman = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<sealless> weakReference = f5554wireman.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f5554wireman.remove(size);
                        }
                    }
                    for (int size2 = f5554wireman.size() - 1; size2 >= 0; size2--) {
                        WeakReference<sealless> weakReference2 = f5554wireman.get(size2);
                        sealless seallessVar = weakReference2 != null ? weakReference2.get() : null;
                        if (seallessVar != null && seallessVar.getBaseContext() == context) {
                            return seallessVar;
                        }
                    }
                }
                sealless seallessVar2 = new sealless(context);
                f5554wireman.add(new WeakReference<>(seallessVar2));
                return seallessVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f5555attabal.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f5555attabal;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f5556saneness;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f5556saneness;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
