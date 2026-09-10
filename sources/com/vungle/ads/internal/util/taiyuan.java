package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.vungle.ads.AssetFailedToDeleteError;
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
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: FileUtility.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001FB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\bJ!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b3\u00104R*\u00107\u001a\u0002052\u0006\u00106\u001a\u0002058G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010A\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030@0?8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010\u0003\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/vungle/ads/internal/util/taiyuan;", "", "<init>", "()V", "Ljava/io/File;", "folder", "", "printDirectoryTree", "(Ljava/io/File;)V", "", "indent", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "(Ljava/io/File;ILjava/lang/StringBuilder;)V", X3.i.b, "printFile", "", "getIndentString", "(I)Ljava/lang/String;", "f", "", "excludeFiles", "delete", "(Ljava/io/File;Ljava/util/Set;)V", "deleteContents", "deleteAndLogIfFailed", "Ljava/io/Serializable;", "serializable", "writeSerializable", "(Ljava/io/File;Ljava/io/Serializable;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "readSerializable", "(Ljava/io/File;)Ljava/lang/Object;", "Ljava/io/Closeable;", "closeable", "closeQuietly", "(Ljava/io/Closeable;)V", "content", "writeString", "(Ljava/io/File;Ljava/lang/String;)V", "readString", "(Ljava/io/File;)Ljava/lang/String;", "url", "", "isValidUrl", "(Ljava/lang/String;)Z", "", "size", "(Ljava/io/File;)J", "ext", "guessFileName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/vungle/ads/internal/util/taiyuan$attabal;", "<set-?>", "objectInputStreamProvider", "Lcom/vungle/ads/internal/util/taiyuan$attabal;", "getObjectInputStreamProvider", "()Lcom/vungle/ads/internal/util/taiyuan$attabal;", "setObjectInputStreamProvider", "(Lcom/vungle/ads/internal/util/taiyuan$attabal;)V", "TAG", "Ljava/lang/String;", "", "Ljava/lang/Class;", "allowedClasses", "Ljava/util/List;", "getAllowedClasses$vungle_ads_release", "()Ljava/util/List;", "getAllowedClasses$vungle_ads_release$annotations", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class taiyuan {
    private static final String TAG = "FileUtility";
    public static final taiyuan INSTANCE = new taiyuan();
    private static attabal objectInputStreamProvider = new attabal() { // from class: com.vungle.ads.internal.util.impromptu
        @Override // com.vungle.ads.internal.util.taiyuan.attabal
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            return taiyuan.m3284objectInputStreamProvider$lambda0(inputStream);
        }
    };
    private static final List<Class<?>> allowedClasses = p002kotlin.collections.adultoid.kowloon(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    /* JADX INFO: compiled from: FileUtility.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/util/taiyuan$attabal;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/io/ObjectInputStream;", "provideObjectInputStream", "(Ljava/io/InputStream;)Ljava/io/ObjectInputStream;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface attabal {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private taiyuan() {
    }

    public static final void delete(File f, Set<String> excludeFiles) {
        if (f != null) {
            try {
                if (f.exists()) {
                    if (f.isDirectory()) {
                        if (excludeFiles != null && excludeFiles.contains(f.getName())) {
                            arytenoidectomy.INSTANCE.d(TAG, "Skipping deletion of directory: " + f.getName());
                            return;
                        }
                        deleteContents(f, excludeFiles);
                    }
                    if (excludeFiles != null && excludeFiles.contains(f.getName())) {
                        arytenoidectomy.INSTANCE.d(TAG, "Skipping deletion of file: " + f.getName());
                        return;
                    }
                    if (f.delete()) {
                        return;
                    }
                    arytenoidectomy.INSTANCE.d(TAG, "Failed to delete file: " + f);
                }
            } catch (Exception e) {
                arytenoidectomy.INSTANCE.e(TAG, "Failed to delete file: " + e.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void delete$default(File file, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    public static final void deleteAndLogIfFailed(File file) throws InterruptedException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else {
                if (file.delete()) {
                    return;
                }
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e) {
            new AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static final void deleteContents(File folder, Set<String> excludeFiles) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            delete(file, excludeFiles);
        }
    }

    public static /* synthetic */ void deleteContents$default(File file, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    private final String getIndentString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("|  ");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(taiyuan taiyuanVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return taiyuanVar.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m3284objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new graveside(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File folder) {
    }

    private final void printFile(File file, int indent, StringBuilder sb) {
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0028: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:41), block:B:11:0x0028 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.taiyuan] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.taiyuan] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vungle.ads.internal.util.taiyuan] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vungle.ads.internal.util.taiyuan$attabal] */
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
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        ?? r1;
        Intrinsics.checkNotNullParameter(file, "file");
        ?? Exists = file.exists();
        Closeable closeable2 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                    try {
                        T t = (T) objectInputStreamProvideObjectInputStream.readObject();
                        ?? r0 = INSTANCE;
                        r0.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r0.closeQuietly(Exists);
                        return t;
                    } catch (IOException e) {
                        e = e;
                        arytenoidectomy.INSTANCE.e(TAG, "IOException: " + e.getMessage());
                        r1 = Exists;
                        ?? r2 = INSTANCE;
                        r2.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r2.closeQuietly(r1);
                        try {
                            delete$default(file, null, 2, null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        arytenoidectomy.INSTANCE.e(TAG, "ClassNotFoundException: " + e.getMessage());
                        r1 = Exists;
                        ?? r3 = INSTANCE;
                        r3.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r3.closeQuietly(r1);
                        delete$default(file, null, 2, null);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        arytenoidectomy.INSTANCE.e(TAG, "cannot read serializable " + e.getMessage());
                        r1 = Exists;
                        ?? r4 = INSTANCE;
                        r4.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r4.closeQuietly(r1);
                        delete$default(file, null, 2, null);
                        return null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e6) {
                    e = e6;
                    objectInputStreamProvideObjectInputStream = null;
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
                objectInputStreamProvideObjectInputStream = null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Exception e9) {
                e = e9;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
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
        Intrinsics.checkNotNullParameter(file, "file");
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
                    taiyuan taiyuanVar = INSTANCE;
                    taiyuanVar.closeQuietly(objectOutputStream);
                    taiyuanVar.closeQuietly(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                    outputStream = fileOutputStream;
                    try {
                        arytenoidectomy.INSTANCE.e(TAG, String.valueOf(e.getMessage()));
                        taiyuan taiyuanVar2 = INSTANCE;
                        taiyuanVar2.closeQuietly(objectOutputStream);
                        taiyuanVar2.closeQuietly(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = outputStream;
                        outputStream = objectOutputStream;
                        taiyuan taiyuanVar3 = INSTANCE;
                        taiyuanVar3.closeQuietly(outputStream);
                        taiyuanVar3.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = objectOutputStream;
                    taiyuan taiyuanVar4 = INSTANCE;
                    taiyuanVar4.closeQuietly(outputStream);
                    taiyuanVar4.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                taiyuan taiyuanVar5 = INSTANCE;
                taiyuanVar5.closeQuietly(outputStream);
                taiyuanVar5.closeQuietly(fileOutputStream);
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

    public final attabal getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String url, String ext) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, ext);
        Intrinsics.checkNotNullExpressionValue(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    public final boolean isValidUrl(String url) {
        if (url != null) {
            try {
                if (!StringsKt.empress(url) && okhttp3.graveside.INSTANCE.beachfront(url) != null) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final String readString(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return interaction.competently.apical(file, null, 1, null);
        } catch (IOException e) {
            arytenoidectomy.INSTANCE.e(TAG, "IOException: " + e.getMessage());
            return null;
        } catch (Exception e2) {
            arytenoidectomy.INSTANCE.e(TAG, "cannot read string " + e2.getMessage());
            return null;
        }
    }

    public final void setObjectInputStreamProvider(attabal attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<set-?>");
        objectInputStreamProvider = attabalVar;
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

    public final void writeString(File file, String content) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (content == null) {
            return;
        }
        try {
            interaction.competently.formularize(file, content, Charsets.UTF_8);
        } catch (IOException e) {
            arytenoidectomy.INSTANCE.e(TAG, String.valueOf(e.getMessage()));
        }
    }

    private final void printDirectoryTree(File folder, int indent, StringBuilder sb) {
        if (folder == null) {
            return;
        }
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(folder.getName());
        sb.append("/\n");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                printDirectoryTree(file, indent + 1, sb);
            } else {
                Intrinsics.checkNotNullExpressionValue(file, "file");
                printFile(file, indent + 1, sb);
            }
        }
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }
}
