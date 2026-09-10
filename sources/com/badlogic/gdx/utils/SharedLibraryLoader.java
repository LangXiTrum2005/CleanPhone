package com.badlogic.gdx.utils;

import com.umeng.commonsdk.statistics.AnalyticsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Random;
import java.util.UUID;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class SharedLibraryLoader {
    public static Architecture architecture;
    public static Architecture.Bitness bitness;

    @Deprecated
    public static boolean is64Bit;

    @Deprecated
    public static boolean isARM;

    @Deprecated
    public static boolean isAndroid;

    @Deprecated
    public static boolean isIos;

    @Deprecated
    public static boolean isLinux;

    @Deprecated
    public static boolean isMac;

    @Deprecated
    public static boolean isWindows;
    private static final HashSet<String> loadedLibraries;
    public static Os os;
    private static final Random random;
    private String nativesJar;

    static {
        Architecture.Bitness bitness2 = Architecture.Bitness._32;
        bitness = bitness2;
        Architecture architecture2 = Architecture.x86;
        architecture = architecture2;
        if (System.getProperty("os.name").contains("Windows")) {
            os = Os.Windows;
        } else if (System.getProperty("os.name").contains("Linux")) {
            os = Os.Linux;
        } else if (System.getProperty("os.name").contains("Mac")) {
            os = Os.MacOsX;
        }
        if (System.getProperty("os.arch").startsWith("arm") || System.getProperty("os.arch").startsWith("aarch64")) {
            architecture = Architecture.ARM;
        } else if (System.getProperty("os.arch").startsWith("riscv")) {
            architecture = Architecture.RISCV;
        } else if (System.getProperty("os.arch").startsWith("loongarch")) {
            architecture = Architecture.LOONGARCH;
        }
        if (System.getProperty("os.arch").contains("64") || System.getProperty("os.arch").startsWith("armv8")) {
            bitness = Architecture.Bitness._64;
        } else if (System.getProperty("os.arch").contains("128")) {
            bitness = Architecture.Bitness._128;
        }
        boolean z = System.getProperty("moe.platform.name") != null;
        String property = System.getProperty("java.runtime.name");
        if (property != null && property.contains("Android Runtime")) {
            os = Os.Android;
            bitness = bitness2;
            architecture = architecture2;
        }
        if (z || (os != Os.Android && os != Os.Windows && os != Os.Linux && os != Os.MacOsX)) {
            os = Os.IOS;
            bitness = bitness2;
            architecture = architecture2;
        }
        isWindows = os == Os.Windows;
        isLinux = os == Os.Linux;
        isMac = os == Os.MacOsX;
        isIos = os == Os.IOS;
        isAndroid = os == Os.Android;
        isARM = architecture == Architecture.ARM;
        is64Bit = bitness == Architecture.Bitness._64;
        loadedLibraries = new HashSet<>();
        random = new Random();
    }

    public SharedLibraryLoader() {
    }

    private boolean canExecute(File file) {
        try {
            Method method = File.class.getMethod("canExecute", new Class[0]);
            if (((Boolean) method.invoke(file, new Object[0])).booleanValue()) {
                return true;
            }
            Class cls = Boolean.TYPE;
            File.class.getMethod("setExecutable", cls, cls).invoke(file, Boolean.TRUE, Boolean.FALSE);
            return ((Boolean) method.invoke(file, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean canWrite(File file) {
        File parentFile = file.getParentFile();
        if (!file.exists()) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                return false;
            }
        } else {
            if (!file.canWrite() || !canExecute(file)) {
                return false;
            }
            file = new File(parentFile, randomUUID().toString());
        }
        try {
            new FileOutputStream(file).close();
            if (canExecute(file)) {
                file.delete();
                return true;
            }
            file.delete();
            return false;
        } catch (Throwable unused) {
            file.delete();
            return false;
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private File getExtractedFile(String str, String str2) {
        File file = new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + str, str2);
        if (canWrite(file)) {
            return file;
        }
        try {
            File fileCreateTempFile = File.createTempFile(str, null);
            if (fileCreateTempFile.delete()) {
                File file2 = new File(fileCreateTempFile, str2);
                if (canWrite(file2)) {
                    return file2;
                }
            }
        } catch (IOException unused) {
        }
        File file3 = new File(System.getProperty("user.home") + "/.libgdx/" + str, str2);
        if (canWrite(file3)) {
            return file3;
        }
        File file4 = new File(AbstractC3888ke0.i(".temp/", str), str2);
        if (canWrite(file4)) {
            return file4;
        }
        if (System.getenv("APP_SANDBOX_CONTAINER_ID") != null) {
            return file;
        }
        return null;
    }

    public static synchronized boolean isLoaded(String str) {
        return loadedLibraries.contains(str);
    }

    private void loadFile(String str) {
        String strCrc = crc(readFile(str));
        String name = new File(str).getName();
        Throwable thLoadFile = loadFile(str, strCrc, new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + strCrc, name));
        if (thLoadFile == null) {
            return;
        }
        try {
            File fileCreateTempFile = File.createTempFile(strCrc, null);
            if (fileCreateTempFile.delete() && loadFile(str, strCrc, fileCreateTempFile) == null) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (loadFile(str, strCrc, new File(System.getProperty("user.home") + "/.libgdx/" + strCrc, name)) == null || loadFile(str, strCrc, new File(AbstractC3888ke0.i(".temp/", strCrc), name)) == null) {
            return;
        }
        File file = new File(System.getProperty("java.library.path"), str);
        if (!file.exists()) {
            throw new SharedLibraryLoadRuntimeException(thLoadFile);
        }
        System.load(file.getAbsolutePath());
    }

    public static String randomUUID() {
        Random random2 = random;
        return new UUID(random2.nextLong(), random2.nextLong()).toString();
    }

    private InputStream readFile(String str) {
        if (this.nativesJar == null) {
            InputStream resourceAsStream = SharedLibraryLoader.class.getResourceAsStream("/" + str);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new SharedLibraryLoadRuntimeException(AbstractC3888ke0.i("Unable to read file for extraction: ", str));
        }
        try {
            ZipFile zipFile = new ZipFile(this.nativesJar);
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return zipFile.getInputStream(entry);
            }
            throw new SharedLibraryLoadRuntimeException("Couldn't find '" + str + "' in JAR: " + this.nativesJar);
        } catch (IOException e) {
            java.lang.StringBuilder sbU = AbstractC3950lJ.u("Error reading '", str, "' in JAR: ");
            sbU.append(this.nativesJar);
            throw new SharedLibraryLoadRuntimeException(sbU.toString(), e);
        }
    }

    public static synchronized void setLoaded(String str) {
        loadedLibraries.add(str);
    }

    public String crc(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                crc32.update(bArr, 0, i);
            } catch (Exception unused) {
            } catch (Throwable th) {
                closeQuietly(inputStream);
                throw th;
            }
        }
        closeQuietly(inputStream);
        return Long.toString(crc32.getValue(), 16);
    }

    public File extractFile(String str, String str2) throws IOException {
        try {
            String strCrc = crc(readFile(str));
            if (str2 == null) {
                str2 = strCrc;
            }
            File extractedFile = getExtractedFile(str2, new File(str).getName());
            if (extractedFile == null && (extractedFile = getExtractedFile(randomUUID(), new File(str).getName())) == null) {
                throw new SharedLibraryLoadRuntimeException("Unable to find writable path to extract file. Is the user home directory writable?");
            }
            return extractFile(str, strCrc, extractedFile);
        } catch (RuntimeException e) {
            File file = new File(System.getProperty("java.library.path"), str);
            if (file.exists()) {
                return file;
            }
            throw e;
        }
    }

    public void extractFileTo(String str, File file) throws Throwable {
        extractFile(str, crc(readFile(str)), new File(file, new File(str).getName()));
    }

    public void load(String str) {
        String str2;
        if (os == Os.IOS) {
            return;
        }
        synchronized (SharedLibraryLoader.class) {
            try {
                if (isLoaded(str)) {
                    return;
                }
                String strMapLibraryName = mapLibraryName(str);
                try {
                    if (os == Os.Android) {
                        System.loadLibrary(strMapLibraryName);
                    } else {
                        loadFile(strMapLibraryName);
                    }
                    setLoaded(str);
                } catch (Throwable th) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't load shared library '");
                    sb.append(strMapLibraryName);
                    sb.append("' for target: ");
                    if (os == Os.Android) {
                        str2 = AnalyticsConstants.SDK_TYPE;
                    } else {
                        str2 = System.getProperty("os.name") + ", " + architecture.name() + ", " + bitness.name().substring(1) + "-bit";
                    }
                    sb.append(str2);
                    throw new SharedLibraryLoadRuntimeException(sb.toString(), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String mapLibraryName(String str) {
        if (os == Os.Android) {
            return str;
        }
        return os.getLibPrefix() + str + architecture.toSuffix() + bitness.toSuffix() + "." + os.getLibExtension();
    }

    public SharedLibraryLoader(String str) {
        this.nativesJar = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    private File extractFile(String str, String str2, File file) throws Throwable {
        String strCrc;
        ?? r0;
        IOException e;
        ?? r1 = 0;
        if (file.exists()) {
            try {
                strCrc = crc(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                strCrc = null;
            }
        } else {
            strCrc = null;
        }
        if (strCrc == null || (str2 = strCrc.equals(str2)) == 0) {
            try {
                try {
                    str2 = readFile(str);
                    try {
                        file.getParentFile().mkdirs();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = str2.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            closeQuietly(str2);
                            closeQuietly(fileOutputStream);
                        } catch (IOException e2) {
                            e = e2;
                            throw new SharedLibraryLoadRuntimeException("Error extracting file: " + str + "\nTo: " + file.getAbsolutePath(), e);
                        }
                    } catch (IOException e3) {
                        e = e3;
                    } catch (Throwable th) {
                        th = th;
                        strCrc = null;
                        r1 = str2;
                        r0 = strCrc;
                        closeQuietly(r1);
                        closeQuietly(r0);
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = 0;
                    closeQuietly(r1);
                    closeQuietly(r0);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return file;
    }

    private Throwable loadFile(String str, String str2, File file) {
        try {
            System.load(extractFile(str, str2, file).getAbsolutePath());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }
}
