package androidx.multidex;

import android.content.SharedPreferences;
import android.support.v4.media.a;
import android.util.Log;
import com.p004ironsource.d9;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class MultiDexExtractor implements Closeable {
    public final File X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f7763Y;
    public final File Z;
    public final RandomAccessFile e0;
    public final FileChannel f0;
    public final FileLock g0;

    /* JADX INFO: renamed from: androidx.multidex.MultiDexExtractor$1, reason: invalid class name */
    class AnonymousClass1 implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    public static class ExtractedDex extends File {
        public long X;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.X = -1L;
        }
    }

    public MultiDexExtractor(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.X = file;
        this.Z = file2;
        this.f7763Y = d(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.e0 = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f0 = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.g0 = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                a(this.f0);
                throw e;
            } catch (Error e3) {
                e = e3;
                a(this.f0);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                a(this.f0);
                throw e;
            }
        } catch (IOException e5) {
            e = e5;
            a(this.e0);
            throw e;
        } catch (Error e6) {
            e = e6;
            a(this.e0);
            throw e;
        } catch (RuntimeException e7) {
            e = e7;
            a(this.e0);
            throw e;
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    public static void b(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(a.C("tmp-", str), ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i2 = inputStream.read(bArr); i2 != -1; i2 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i2);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    a(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            a(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static long d(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            ZipUtil.CentralDirectory centralDirectoryA = ZipUtil.a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = centralDirectoryA.f7765b;
            randomAccessFile.seek(centralDirectoryA.f7764a);
            byte[] bArr = new byte[16384];
            int i2 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            while (i2 != -1) {
                crc32.update(bArr, 0, i2);
                j -= (long) i2;
                if (j == 0) {
                    break;
                }
                i2 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void l(MultiDexApplication multiDexApplication, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = multiDexApplication.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j2);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i2 = 2;
        while (it.hasNext()) {
            ExtractedDex extractedDex = (ExtractedDex) it.next();
            editorEdit.putLong(a.h(i2, "dex.crc."), extractedDex.X);
            editorEdit.putLong("dex.time." + i2, extractedDex.lastModified());
            i2++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.g0.release();
        this.f0.close();
        this.e0.close();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    public final ArrayList h(MultiDexApplication multiDexApplication, boolean z2) throws Throwable {
        long jLastModified;
        ArrayList arrayListI;
        StringBuilder sb = new StringBuilder("MultiDexExtractor.load(");
        File file = this.X;
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(z2);
        sb.append(", )");
        Log.i("MultiDex", sb.toString());
        if (!this.g0.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z2) {
            if (z2) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            ArrayList arrayListK = k();
            jLastModified = file.lastModified();
            if (jLastModified == -1) {
                jLastModified--;
            }
            l(multiDexApplication, jLastModified, this.f7763Y, arrayListK);
            arrayListI = arrayListK;
        } else {
            SharedPreferences sharedPreferences = multiDexApplication.getSharedPreferences("multidex.version", 4);
            long j = sharedPreferences.getLong("timestamp", -1L);
            long jLastModified2 = file.lastModified();
            if (jLastModified2 == -1) {
                jLastModified2--;
            }
            if (j == jLastModified2 && sharedPreferences.getLong("crc", -1L) == this.f7763Y) {
                try {
                    arrayListI = i(multiDexApplication);
                } catch (IOException e2) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                    ArrayList arrayListK2 = k();
                    long jLastModified3 = file.lastModified();
                    if (jLastModified3 == -1) {
                        jLastModified3--;
                    }
                    l(multiDexApplication, jLastModified3, this.f7763Y, arrayListK2);
                    arrayListI = arrayListK2;
                }
            } else {
                if (z2) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                ArrayList arrayListK3 = k();
                jLastModified = file.lastModified();
                if (jLastModified == -1) {
                    jLastModified--;
                }
                l(multiDexApplication, jLastModified, this.f7763Y, arrayListK3);
                arrayListI = arrayListK3;
            }
        }
        Log.i("MultiDex", "load found " + arrayListI.size() + " secondary dex files");
        return arrayListI;
    }

    public final ArrayList i(MultiDexApplication multiDexApplication) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = this.X.getName() + ".classes";
        SharedPreferences sharedPreferences = multiDexApplication.getSharedPreferences("multidex.version", 4);
        int i2 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 - 1);
        for (int i3 = 2; i3 <= i2; i3++) {
            ExtractedDex extractedDex = new ExtractedDex(this.Z, str + i3 + ".zip");
            if (!extractedDex.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
            extractedDex.X = d(extractedDex);
            long j = sharedPreferences.getLong("dex.crc." + i3, -1L);
            long j2 = sharedPreferences.getLong("dex.time." + i3, -1L);
            long jLastModified = extractedDex.lastModified();
            if (j2 != jLastModified || j != extractedDex.X) {
                StringBuilder sb = new StringBuilder("Invalid extracted dex: ");
                sb.append(extractedDex);
                sb.append(" (key \"\"), expected modification time: ");
                sb.append(j2);
                androidx.datastore.preferences.protobuf.a.A(sb, ", modification time: ", jLastModified, ", expected crc: ");
                sb.append(j);
                sb.append(", file crc: ");
                sb.append(extractedDex.X);
                throw new IOException(sb.toString());
            }
            arrayList.add(extractedDex);
        }
        return arrayList;
    }

    public final ArrayList k() throws Throwable {
        Throwable th;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        File file = this.X;
        sb.append(file.getName());
        sb.append(".classes");
        String string = sb.toString();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        File file2 = this.Z;
        File[] fileArrListFiles = file2.listFiles(anonymousClass1);
        String str = "MultiDex";
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : fileArrListFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file3.getPath() + " of size " + file3.length());
                if (file3.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file3.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i2 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(file2, string + i2 + ".zip");
                arrayList.add(extractedDex);
                Log.i(str, "Extraction is needed for file " + extractedDex);
                int i3 = 0;
                boolean z3 = false;
                while (i3 < 3 && !z3) {
                    int i4 = i3 + 1;
                    b(zipFile, entry, extractedDex, string);
                    String str2 = str;
                    try {
                        extractedDex.X = d(extractedDex);
                        z2 = true;
                        str = str2;
                    } catch (IOException e2) {
                        try {
                            str = str2;
                            Log.w(str, "Failed to read crc from " + extractedDex.getAbsolutePath(), e2);
                            z2 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            str = str2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = str2;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z2 ? "succeeded" : d9.h.t);
                    sb2.append(" '");
                    sb2.append(extractedDex.getAbsolutePath());
                    sb2.append("': length ");
                    boolean z4 = z2;
                    sb2.append(extractedDex.length());
                    sb2.append(" - crc: ");
                    sb2.append(extractedDex.X);
                    Log.i(str, sb2.toString());
                    if (!z4) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w(str, "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                    i3 = i4;
                    z3 = z4;
                }
                if (!z3) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
                i2++;
                entry = zipFile.getEntry("classes" + i2 + ".dex");
                th = th;
                try {
                    zipFile.close();
                    throw th;
                } catch (IOException e3) {
                    Log.w(str, "Failed to close resource", e3);
                    throw th;
                }
            }
            try {
                zipFile.close();
            } catch (IOException e4) {
                Log.w(str, "Failed to close resource", e4);
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
