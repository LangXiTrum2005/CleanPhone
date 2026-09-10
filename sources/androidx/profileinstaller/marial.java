package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: ProfileVerifier.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final androidx.concurrent.futures.saneness<dern> f13167attabal = androidx.concurrent.futures.saneness.rotuma();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Object f13169saneness = new Object();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static dern f13168dern = null;

    /* JADX INFO: compiled from: ProfileVerifier.java */
    public static class attabal {
        public static PackageInfo attabal(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: ProfileVerifier.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f13170attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f13171dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f13172saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final boolean f13173wireman;

        public dern(int i, boolean z, boolean z2, boolean z3) {
            this.f13170attabal = i;
            this.f13171dern = z2;
            this.f13172saneness = z;
            this.f13173wireman = z3;
        }
    }

    /* JADX INFO: compiled from: ProfileVerifier.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f13174attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f13175dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f13176saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f13177wireman;

        public saneness(int i, int i2, long j, long j2) {
            this.f13174attabal = i;
            this.f13176saneness = i2;
            this.f13175dern = j;
            this.f13177wireman = j2;
        }

        public static saneness attabal(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                saneness sanenessVar = new saneness(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return sanenessVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof saneness)) {
                saneness sanenessVar = (saneness) obj;
                if (this.f13176saneness == sanenessVar.f13176saneness && this.f13175dern == sanenessVar.f13175dern && this.f13174attabal == sanenessVar.f13174attabal && this.f13177wireman == sanenessVar.f13177wireman) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f13176saneness), Long.valueOf(this.f13175dern), Integer.valueOf(this.f13174attabal), Long.valueOf(this.f13177wireman));
        }

        public void saneness(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f13174attabal);
                dataOutputStream.writeInt(this.f13176saneness);
                dataOutputStream.writeLong(this.f13175dern);
                dataOutputStream.writeLong(this.f13177wireman);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static long attabal(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? attabal.attabal(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    public static dern dern(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        saneness sanenessVarAttabal;
        saneness sanenessVar;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        dern dernVar;
        if (!z && (dernVar = f13168dern) != null) {
            return dernVar;
        }
        synchronized (f13169saneness) {
            if (z) {
                i = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                assetFileDescriptorOpenFd.close();
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    long jAttabal = attabal(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        sanenessVarAttabal = saneness.attabal(file3);
                    } else {
                        sanenessVarAttabal = null;
                    }
                    if (sanenessVarAttabal == null) {
                        if (!z2) {
                            i = Opcodes.ASM5;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                    } else if (!z2) {
                        i = Opcodes.ASM5;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (sanenessVarAttabal != null) {
                        i = 3;
                    }
                    int i4 = i;
                    sanenessVar = new saneness(1, i4, jAttabal, length);
                    if (sanenessVarAttabal != null) {
                        sanenessVar.saneness(file3);
                    } else {
                        sanenessVar.saneness(file3);
                    }
                    return saneness(i4, z3, z4, z2);
                }
                return saneness(Opcodes.ASM4, false, false, z2);
            }
            dern dernVar2 = f13168dern;
            if (dernVar2 != null) {
                return dernVar2;
            }
            i = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28 && i2 != 30) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length3 = file.length();
                        if (file.exists() || length3 <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists() || length <= 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        try {
                            long jAttabal2 = attabal(context);
                            file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    sanenessVarAttabal = saneness.attabal(file3);
                                } catch (IOException unused) {
                                    return saneness(131072, z3, z4, z2);
                                }
                            } else {
                                sanenessVarAttabal = null;
                            }
                            if (sanenessVarAttabal == null && sanenessVarAttabal.f13175dern == jAttabal2 && (i3 = sanenessVarAttabal.f13176saneness) != 2) {
                                i = i3;
                            } else if (!z2) {
                                i = Opcodes.ASM5;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                            if (z && z4 && i != 1) {
                                i = 2;
                            }
                            if (sanenessVarAttabal != null && sanenessVarAttabal.f13176saneness == 2 && i == 1 && length3 < sanenessVarAttabal.f13177wireman) {
                                i = 3;
                            }
                            int i5 = i;
                            sanenessVar = new saneness(1, i5, jAttabal2, length);
                            if (sanenessVarAttabal != null || !sanenessVarAttabal.equals(sanenessVar)) {
                                try {
                                    sanenessVar.saneness(file3);
                                } catch (IOException unused2) {
                                    i5 = 196608;
                                }
                            }
                            return saneness(i5, z3, z4, z2);
                        } catch (PackageManager.NameNotFoundException unused3) {
                            return saneness(65536, z3, z4, z2);
                        }
                    }
                    return saneness(Opcodes.ASM4, false, false, z2);
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused4) {
                z2 = false;
            }
            throw th;
        }
    }

    public static dern saneness(int i, boolean z, boolean z2, boolean z3) {
        dern dernVar = new dern(i, z, z2, z3);
        f13168dern = dernVar;
        f13167attabal.graveside(dernVar);
        return f13168dern;
    }
}
