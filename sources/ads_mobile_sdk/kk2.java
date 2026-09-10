package ads_mobile_sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import com.google.common.collect.immediately;
import com.ironsource.X3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class kk2 {
    public static final String[] a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    public static final String[] b;
    public static final String[] c;

    static {
        String str = Build.HARDWARE;
        b = new String[]{X3.i.I0, (str.equals("goldfish") || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        int i = Build.VERSION.SDK_INT;
        c = new String[]{i <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "", i <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static void a(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: " + str);
                }
                if (structStatFstat.st_dev == structStatLstat.st_dev && structStatFstat.st_ino == structStatLstat.st_ino) {
                    return;
                }
                throw new FileNotFoundException("Can't open file: " + str);
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    public static boolean a(final Context context, String str) throws IOException {
        try {
            for (File file : (File[]) new Callable() { // from class: saneness.nidicolous
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return picketboat.saneness.getExternalFilesDirs(context, null);
                }
            }.call()) {
                if (file != null) {
                    String canonicalPath = file.getCanonicalPath();
                    if (!canonicalPath.endsWith("/")) {
                        canonicalPath = canonicalPath.concat("/");
                    }
                    if (str.startsWith(canonicalPath)) {
                        return true;
                    }
                }
            }
            try {
                for (File file2 : (File[]) new Callable() { // from class: saneness.abortive
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return picketboat.saneness.getExternalCacheDirs(context);
                    }
                }.call()) {
                    if (file2 != null) {
                        String canonicalPath2 = file2.getCanonicalPath();
                        if (!canonicalPath2.endsWith("/")) {
                            canonicalPath2 = canonicalPath2.concat("/");
                        }
                        if (str.startsWith(canonicalPath2)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (NullPointerException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } catch (NullPointerException e3) {
            throw e3;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0094 A[EDGE_INSN: B:123:0x0094->B:31:0x0094 BREAK  A[LOOP:0: B:18:0x0062->B:126:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[LOOP:0: B:18:0x0062->B:126:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0119 A[EDGE_INSN: B:127:0x0119->B:71:0x0119 BREAK  A[LOOP:1: B:47:0x00c9->B:51:0x00d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0119 A[EDGE_INSN: B:130:0x0119->B:71:0x0119 BREAK  A[LOOP:1: B:47:0x00c9->B:51:0x00d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005c A[PHI: r1 r2
  0x005c: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:11:0x0041, B:15:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r2v8 android.content.pm.ProviderInfo) = (r2v7 android.content.pm.ProviderInfo), (r2v9 android.content.pm.ProviderInfo) binds: [B:11:0x0041, B:15:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4 A[LOOP:1: B:47:0x00c9->B:51:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6 A[LOOP:2: B:53:0x00db->B:57:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r13 != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.FileOutputStream a(android.content.Context r13, android.net.Uri r14, ads_mobile_sdk.jk2 r15) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kk2.a(android.content.Context, android.net.Uri, ads_mobile_sdk.jk2):java.io.FileOutputStream");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[RETURN] */
    public static void a(Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, jk2 jk2Var) throws IOException {
        boolean zA;
        Context contextCreateDeviceProtectedStorageContext;
        File dataDir;
        String canonicalPath;
        String canonicalPath2 = new File(uri.getPath()).getCanonicalPath();
        a(parcelFileDescriptor, canonicalPath2);
        if (!canonicalPath2.startsWith("/proc/") && !canonicalPath2.startsWith("/data/misc/")) {
            jk2Var.getClass();
            immediately it = jk2Var.c.iterator();
            if (!it.hasNext()) {
                File dataDir2 = picketboat.saneness.getDataDir(context);
                if (dataDir2 != null) {
                    String canonicalPath3 = dataDir2.getCanonicalPath();
                    if (!canonicalPath3.endsWith("/")) {
                        canonicalPath3 = canonicalPath3.concat("/");
                    }
                    if (!canonicalPath2.startsWith(canonicalPath3)) {
                        contextCreateDeviceProtectedStorageContext = picketboat.saneness.createDeviceProtectedStorageContext(context);
                        if (contextCreateDeviceProtectedStorageContext != null && (dataDir = picketboat.saneness.getDataDir(contextCreateDeviceProtectedStorageContext)) != null) {
                            canonicalPath = dataDir.getCanonicalPath();
                            if (!canonicalPath.endsWith("/")) {
                                canonicalPath = canonicalPath.concat("/");
                            }
                            if (canonicalPath2.startsWith(canonicalPath)) {
                            }
                        }
                        zA = a(context, canonicalPath2);
                    }
                    if (zA == jk2Var.a) {
                        return;
                    }
                } else {
                    String canonicalPath4 = Environment.getDataDirectory().getCanonicalPath();
                    if (!canonicalPath4.endsWith("/")) {
                        canonicalPath4 = canonicalPath4.concat("/");
                    }
                    if (!canonicalPath2.startsWith(canonicalPath4)) {
                        contextCreateDeviceProtectedStorageContext = picketboat.saneness.createDeviceProtectedStorageContext(context);
                        if (contextCreateDeviceProtectedStorageContext != null) {
                            canonicalPath = dataDir.getCanonicalPath();
                            if (!canonicalPath.endsWith("/")) {
                                canonicalPath = canonicalPath.concat("/");
                            }
                            if (canonicalPath2.startsWith(canonicalPath)) {
                            }
                        }
                        zA = a(context, canonicalPath2);
                    }
                    if (zA == jk2Var.a) {
                        return;
                    }
                }
                zA = true;
                if (zA == jk2Var.a) {
                    return;
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        throw new FileNotFoundException("Can't open file: ".concat(canonicalPath2));
    }
}
