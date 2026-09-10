package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3300du {
    public static final C3300du INSTANCE = new C3300du();
    private static InterfaceC3212cu objectInputStreamProvider = new C2953a0(9);
    private static final String TAG = C3300du.class.getSimpleName();
    private static final List<Class<?>> allowedClasses = AbstractC2340Cl.K(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    private C3300du() {
    }

    public static final void delete(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (file.delete()) {
                        return;
                    }
                    C4829vJ c4829vJ = C4917wJ.Companion;
                    String str = TAG;
                    AbstractC2995aW.p(str, "TAG");
                    c4829vJ.d(str, "Failed to delete file: " + file);
                }
            } catch (Exception e) {
                C4829vJ c4829vJ2 = C4917wJ.Companion;
                String str2 = TAG;
                AbstractC2995aW.p(str2, "TAG");
                c4829vJ2.e(str2, "Failed to delete file: " + e.getLocalizedMessage());
            }
        }
    }

    public static final void deleteAndLogIfFailed(File file) {
        AbstractC2995aW.q(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else if (!file.delete()) {
                C4829vJ c4829vJ = C4917wJ.Companion;
                String str = TAG;
                AbstractC2995aW.p(str, "TAG");
                c4829vJ.e(str, "Cannot delete " + file.getName());
            }
        } catch (Exception e) {
            C4829vJ c4829vJ2 = C4917wJ.Companion;
            String str2 = TAG;
            AbstractC2995aW.p(str2, "TAG");
            c4829vJ2.e(str2, "Cannot delete " + file.getName(), e);
        }
    }

    public static final void deleteContents(File file) {
        AbstractC2995aW.q(file, "folder");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            delete(file2);
        }
    }

    private final String getIndentString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("|  ");
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(C3300du c3300du, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c3300du.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m234objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new O20(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File file) {
    }

    private final void printFile(File file, int i, StringBuilder sb) {
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:11:0x0033 */
    /* JADX WARN: Type inference failed for: r0v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.du] */
    /* JADX WARN: Type inference failed for: r0v6, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.du] */
    /* JADX WARN: Type inference failed for: r0v9, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.du] */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final <T> T readSerializable(File file) {
        Closeable closeable;
        ObjectInputStream objectInputStreamM234objectInputStreamProvider$lambda0;
        ?? r4;
        AbstractC2995aW.q(file, "file");
        ?? Exists = file.exists();
        Closeable closeable2 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    ((C2953a0) objectInputStreamProvider).getClass();
                    objectInputStreamM234objectInputStreamProvider$lambda0 = m234objectInputStreamProvider$lambda0(Exists);
                    try {
                        T t = (T) objectInputStreamM234objectInputStreamProvider$lambda0.readObject();
                        ?? r0 = INSTANCE;
                        r0.closeQuietly(objectInputStreamM234objectInputStreamProvider$lambda0);
                        r0.closeQuietly(Exists);
                        return t;
                    } catch (IOException e) {
                        e = e;
                        C4829vJ c4829vJ = C4917wJ.Companion;
                        String str = TAG;
                        AbstractC2995aW.p(str, "TAG");
                        c4829vJ.e(str, "IOException: " + e.getMessage());
                        r4 = Exists;
                        ?? r1 = INSTANCE;
                        r1.closeQuietly(objectInputStreamM234objectInputStreamProvider$lambda0);
                        r1.closeQuietly(r4);
                        try {
                            delete(file);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        C4829vJ c4829vJ2 = C4917wJ.Companion;
                        String str2 = TAG;
                        AbstractC2995aW.p(str2, "TAG");
                        c4829vJ2.e(str2, "ClassNotFoundException: " + e.getMessage());
                        r4 = Exists;
                        ?? r2 = INSTANCE;
                        r2.closeQuietly(objectInputStreamM234objectInputStreamProvider$lambda0);
                        r2.closeQuietly(r4);
                        delete(file);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        C4829vJ c4829vJ3 = C4917wJ.Companion;
                        String str3 = TAG;
                        AbstractC2995aW.p(str3, "TAG");
                        c4829vJ3.e(str3, "cannot read serializable " + e.getMessage());
                        r4 = Exists;
                        ?? r3 = INSTANCE;
                        r3.closeQuietly(objectInputStreamM234objectInputStreamProvider$lambda0);
                        r3.closeQuietly(r4);
                        delete(file);
                        return null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    objectInputStreamM234objectInputStreamProvider$lambda0 = null;
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    objectInputStreamM234objectInputStreamProvider$lambda0 = null;
                } catch (Exception e6) {
                    e = e6;
                    objectInputStreamM234objectInputStreamProvider$lambda0 = null;
                } catch (Throwable th) {
                    th = th;
                    ?? r5 = INSTANCE;
                    r5.closeQuietly(closeable2);
                    r5.closeQuietly(Exists);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                Exists = 0;
                objectInputStreamM234objectInputStreamProvider$lambda0 = null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                Exists = 0;
                objectInputStreamM234objectInputStreamProvider$lambda0 = null;
            } catch (Exception e9) {
                e = e9;
                Exists = 0;
                objectInputStreamM234objectInputStreamProvider$lambda0 = null;
            } catch (Throwable th2) {
                th = th2;
                Exists = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void writeSerializable(File file, Serializable serializable) {
        OutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        AbstractC2995aW.q(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    objectOutputStream.reset();
                    C3300du c3300du = INSTANCE;
                    c3300du.closeQuietly(objectOutputStream);
                    c3300du.closeQuietly(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                    outputStream = fileOutputStream;
                    try {
                        C4829vJ c4829vJ = C4917wJ.Companion;
                        String str = TAG;
                        AbstractC2995aW.p(str, "TAG");
                        c4829vJ.e(str, String.valueOf(e.getMessage()));
                        C3300du c3300du2 = INSTANCE;
                        c3300du2.closeQuietly(objectOutputStream);
                        c3300du2.closeQuietly(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = outputStream;
                        outputStream = objectOutputStream;
                        C3300du c3300du3 = INSTANCE;
                        c3300du3.closeQuietly(outputStream);
                        c3300du3.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = objectOutputStream;
                    C3300du c3300du4 = INSTANCE;
                    c3300du4.closeQuietly(outputStream);
                    c3300du4.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                C3300du c3300du5 = INSTANCE;
                c3300du5.closeQuietly(outputStream);
                c3300du5.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            objectOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    @VisibleForTesting
    public final InterfaceC3212cu getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String str, String str2) {
        AbstractC2995aW.q(str, "url");
        String strGuessFileName = URLUtil.guessFileName(str, null, str2);
        AbstractC2995aW.p(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    public final boolean isValidUrl(String str) {
        if (str != null && str.length() != 0) {
            char[] cArr = ZA.k;
            if (C3336eJ.r(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final String readString(File file) {
        AbstractC2995aW.q(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return WD.P(file);
        } catch (IOException e) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str = TAG;
            AbstractC2995aW.p(str, "TAG");
            c4829vJ.e(str, "IOException: " + e.getMessage());
            return null;
        } catch (Exception e2) {
            C4829vJ c4829vJ2 = C4917wJ.Companion;
            String str2 = TAG;
            AbstractC2995aW.p(str2, "TAG");
            c4829vJ2.e(str2, "cannot read string " + e2.getMessage());
            return null;
        }
    }

    @VisibleForTesting
    public final void setObjectInputStreamProvider(InterfaceC3212cu interfaceC3212cu) {
        AbstractC2995aW.q(interfaceC3212cu, "<set-?>");
        objectInputStreamProvider = interfaceC3212cu;
    }

    public final long size(File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
        }
        return size;
    }

    public final void writeString(File file, String str) {
        AbstractC2995aW.q(file, "file");
        if (str == null) {
            return;
        }
        try {
            Charset charset = AbstractC2307Be.f2881a;
            AbstractC2995aW.q(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
            WD.Y(file, bytes);
        } catch (IOException e) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str2 = TAG;
            AbstractC2995aW.p(str2, "TAG");
            c4829vJ.e(str2, String.valueOf(e.getMessage()));
        }
    }

    private final void printDirectoryTree(File file, int i, StringBuilder sb) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory".toString());
        }
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append("/\n");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i + 1, sb);
            } else {
                printFile(file2, i + 1, sb);
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }
}
