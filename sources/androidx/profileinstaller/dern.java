package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.privacysandbox.ads.adservices.measurement.cutely;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ProfileInstaller.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final InterfaceC0095dern f13165attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final InterfaceC0095dern f13166saneness = new saneness();

    /* JADX INFO: renamed from: androidx.profileinstaller.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProfileInstaller.java */
    public interface InterfaceC0095dern {
        void attabal(int i, Object obj);

        void saneness(int i, Object obj);
    }

    public static void apical(Context context, Executor executor, InterfaceC0095dern interfaceC0095dern) {
        try {
            marial(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            beachfront(executor, interfaceC0095dern, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            beachfront(executor, interfaceC0095dern, 7, e);
        }
    }

    public static void beachfront(Executor executor, final InterfaceC0095dern interfaceC0095dern, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: garter.wireman
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC0095dern.attabal(i, obj);
            }
        });
    }

    public static boolean competently(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC0095dern interfaceC0095dern) {
        androidx.profileinstaller.saneness sanenessVar = new androidx.profileinstaller.saneness(assetManager, executor, interfaceC0095dern, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!sanenessVar.marial()) {
            return false;
        }
        boolean zImpassible = sanenessVar.impromptu().formularize().impassible();
        if (zImpassible) {
            marial(packageInfo, file);
        }
        return zImpassible;
    }

    public static void cutely(Context context, Executor executor, InterfaceC0095dern interfaceC0095dern, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && wireman(packageInfo, filesDir, interfaceC0095dern)) {
                context.getPackageName();
                marial.dern(context, false);
                return;
            }
            context.getPackageName();
            if (competently(assets, packageName, packageInfo, filesDir, name, executor, interfaceC0095dern) && z) {
                z2 = true;
            }
            marial.dern(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC0095dern.attabal(7, e);
            marial.dern(context, false);
        }
    }

    public static void dern(Context context, Executor executor, InterfaceC0095dern interfaceC0095dern) {
        saneness(context.getFilesDir());
        beachfront(executor, interfaceC0095dern, 11, null);
    }

    public static void impromptu(Context context) {
        taiyuan(context, new cutely(), f13165attabal);
    }

    public static void marial(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static boolean saneness(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void taiyuan(Context context, Executor executor, InterfaceC0095dern interfaceC0095dern) {
        cutely(context, executor, interfaceC0095dern, false);
    }

    public static boolean wireman(PackageInfo packageInfo, File file, InterfaceC0095dern interfaceC0095dern) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = j == packageInfo.lastUpdateTime;
                if (z) {
                    interfaceC0095dern.attabal(2, null);
                }
                return z;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ProfileInstaller.java */
    public class attabal implements InterfaceC0095dern {
        @Override // androidx.profileinstaller.dern.InterfaceC0095dern
        public void attabal(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.dern.InterfaceC0095dern
        public void saneness(int i, Object obj) {
        }
    }

    /* JADX INFO: compiled from: ProfileInstaller.java */
    public class saneness implements InterfaceC0095dern {
        @Override // androidx.profileinstaller.dern.InterfaceC0095dern
        public void attabal(int i, Object obj) {
            if (i == 6 || i == 7 || i == 8) {
            }
        }

        @Override // androidx.profileinstaller.dern.InterfaceC0095dern
        public void saneness(int i, Object obj) {
        }
    }
}
