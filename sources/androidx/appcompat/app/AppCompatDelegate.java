package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;
import androidx.core.os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {
    public static final AppLocalesStorageHelper.SerialExecutor X = new AppLocalesStorageHelper.SerialExecutor(new AppLocalesStorageHelper.ThreadPerTaskExecutor());

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f3321Y = -100;
    public static LocaleListCompat Z = null;
    public static LocaleListCompat e0 = null;
    public static Boolean f0 = null;
    public static boolean g0 = false;
    public static final ArraySet h0 = new ArraySet(0);
    public static final Object i0 = new Object();
    public static final Object j0 = new Object();

    public static class Api24Impl {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class Api33Impl {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public static boolean m(Context context) {
        if (f0 == null) {
            try {
                int i2 = AppLocalesMetadataHolderService.X;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.Api24Impl.a() | 128).metaData;
                if (bundle != null) {
                    f0 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f0 = Boolean.FALSE;
            }
        }
        return f0.booleanValue();
    }

    public static void u(AppCompatDelegate appCompatDelegate) {
        synchronized (i0) {
            try {
                Iterator it = h0.iterator();
                while (true) {
                    IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                    if (indexBasedArrayIterator.hasNext()) {
                        AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) indexBasedArrayIterator.next()).get();
                        if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                            indexBasedArrayIterator.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void A(int i2) {
    }

    public abstract void B(CharSequence charSequence);

    public abstract ActionMode C(ActionMode.Callback callback);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract View e(int i2);

    public Context f() {
        return null;
    }

    public abstract ActionBarDrawerToggle.Delegate g();

    public int h() {
        return -100;
    }

    public abstract MenuInflater i();

    public abstract ActionBar j();

    public abstract void k();

    public abstract void l();

    public abstract void n(Configuration configuration);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract boolean v(int i2);

    public abstract void w(int i2);

    public abstract void x(View view);

    public abstract void y(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void z(Toolbar toolbar);
}
