package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.a;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
class CachedContentIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18865a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f18866b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f18867c = new SparseBooleanArray();
    public final SparseBooleanArray d = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Storage f18868e;
    public Storage f;

    public static final class DatabaseStorage implements Storage {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f18869e = {"id", "key", TtmlNode.TAG_METADATA};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DatabaseProvider f18870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f18871b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18872c;
        public String d;

        public DatabaseStorage(DatabaseProvider databaseProvider) {
            this.f18870a = databaseProvider;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void a(CachedContent cachedContent, boolean z2) {
            SparseArray sparseArray = this.f18871b;
            int i2 = cachedContent.f18859a;
            if (z2) {
                sparseArray.delete(i2);
            } else {
                sparseArray.put(i2, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final boolean b() throws DatabaseIOException {
            try {
                SQLiteDatabase readableDatabase = this.f18870a.getReadableDatabase();
                String str = this.f18872c;
                str.getClass();
                return VersionTable.a(readableDatabase, str, 1) != -1;
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void c(HashMap map) throws DatabaseIOException {
            SparseArray sparseArray = this.f18871b;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f18870a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    try {
                        CachedContent cachedContent = (CachedContent) sparseArray.valueAt(i2);
                        if (cachedContent == null) {
                            int iKeyAt = sparseArray.keyAt(i2);
                            String str = this.d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            i(writableDatabase, cachedContent);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void d(long j) {
            String hexString = Long.toHexString(j);
            this.f18872c = hexString;
            this.d = a.C("ExoPlayerCacheIndex", hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void e(HashMap map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.f18870a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, (CachedContent) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f18871b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void f(CachedContent cachedContent) {
            this.f18871b.put(cachedContent.f18859a, cachedContent);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void g(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
            DatabaseProvider databaseProvider = this.f18870a;
            Assertions.d(this.f18871b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = databaseProvider.getReadableDatabase();
                String str = this.f18872c;
                str.getClass();
                if (VersionTable.a(readableDatabase, str, 1) != 1) {
                    SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        j(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = databaseProvider.getReadableDatabase();
                String str2 = this.d;
                str2.getClass();
                Cursor cursorQuery = readableDatabase2.query(str2, f18869e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i2 = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new CachedContent(i2, string, CachedContentIndex.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i2, string);
                    } catch (Throwable th2) {
                        if (cursorQuery == null) {
                            throw th2;
                        }
                        try {
                            cursorQuery.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                cursorQuery.close();
            } catch (SQLiteException e2) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void h() throws DatabaseIOException {
            DatabaseProvider databaseProvider = this.f18870a;
            String str = this.f18872c;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i2 = VersionTable.f17417a;
                    try {
                        if (Util.I(writableDatabase, "ExoPlayerVersions")) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (SQLException e2) {
                        throw new DatabaseIOException(e2);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e3) {
                throw new DatabaseIOException(e3);
            }
        }

        public final void i(SQLiteDatabase sQLiteDatabase, CachedContent cachedContent) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CachedContentIndex.b(cachedContent.f18862e, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(cachedContent.f18859a));
            contentValues.put("key", cachedContent.f18860b);
            contentValues.put(TtmlNode.TAG_METADATA, byteArray);
            String str = this.d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        public final void j(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            String str = this.f18872c;
            str.getClass();
            VersionTable.b(sQLiteDatabase, 1, str, 1);
            String str2 = this.d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    public static class LegacyStorage implements Storage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cipher f18873a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SecretKeySpec f18874b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicFile f18875c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ReusableBufferedOutputStream f18876e;

        public LegacyStorage(File file) {
            this.f18875c = new AtomicFile(file);
        }

        public static int i(CachedContent cachedContent, int i2) {
            int iHashCode = cachedContent.f18860b.hashCode() + (cachedContent.f18859a * 31);
            if (i2 < 2) {
                long jB = cachedContent.f18862e.b();
                return (iHashCode * 31) + ((int) (jB ^ (jB >>> 32)));
            }
            return cachedContent.f18862e.hashCode() + (iHashCode * 31);
        }

        public static CachedContent j(int i2, DataInputStream dataInputStream) throws IOException {
            DefaultContentMetadata defaultContentMetadataA;
            int i3 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i2 < 2) {
                long j = dataInputStream.readLong();
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                contentMetadataMutations.a(Long.valueOf(j), "exo_len");
                defaultContentMetadataA = DefaultContentMetadata.f18879c.a(contentMetadataMutations);
            } else {
                defaultContentMetadataA = CachedContentIndex.a(dataInputStream);
            }
            return new CachedContent(i3, utf, defaultContentMetadataA);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void a(CachedContent cachedContent, boolean z2) {
            this.d = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final boolean b() {
            AtomicFile atomicFile = this.f18875c;
            return atomicFile.f18889a.exists() || atomicFile.f18890b.exists();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void c(HashMap map) throws Throwable {
            if (this.d) {
                e(map);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void d(long j) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void e(HashMap map) throws Throwable {
            AtomicFile atomicFile = this.f18875c;
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamA = atomicFile.a();
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.f18876e;
                if (reusableBufferedOutputStream == null) {
                    this.f18876e = new ReusableBufferedOutputStream(outputStreamA);
                } else {
                    reusableBufferedOutputStream.a(outputStreamA);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.f18876e);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(0);
                    dataOutputStream2.writeInt(map.size());
                    int i2 = 0;
                    for (CachedContent cachedContent : map.values()) {
                        dataOutputStream2.writeInt(cachedContent.f18859a);
                        dataOutputStream2.writeUTF(cachedContent.f18860b);
                        CachedContentIndex.b(cachedContent.f18862e, dataOutputStream2);
                        i2 += i(cachedContent, 2);
                    }
                    dataOutputStream2.writeInt(i2);
                    dataOutputStream2.close();
                    atomicFile.f18890b.delete();
                    int i3 = Util.f18979a;
                    this.d = false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    Util.h(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void f(CachedContent cachedContent) {
            this.d = true;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0089 A[Catch: all -> 0x0072, IOException -> 0x0075, TRY_LEAVE, TryCatch #5 {IOException -> 0x0075, all -> 0x0072, blocks: (B:13:0x0039, B:18:0x0043, B:25:0x0055, B:26:0x005f, B:27:0x0066, B:34:0x007a, B:35:0x007f, B:36:0x0080, B:38:0x0089, B:40:0x008f, B:41:0x009e), top: B:62:0x0039 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void g(HashMap map, SparseArray sparseArray) throws Throwable {
            int i2;
            int i3;
            int i4;
            int i5;
            Assertions.d(!this.d);
            AtomicFile atomicFile = this.f18875c;
            File file = atomicFile.f18889a;
            File file2 = atomicFile.f18889a;
            boolean zExists = file.exists();
            File file3 = atomicFile.f18890b;
            if (zExists || file3.exists()) {
                DataInputStream dataInputStream = null;
                try {
                    if (file3.exists()) {
                        file2.delete();
                        file3.renameTo(file2);
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                    DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                    try {
                        int i6 = dataInputStream2.readInt();
                        if (i6 >= 0 && i6 <= 2) {
                            if ((dataInputStream2.readInt() & 1) == 0) {
                                i2 = dataInputStream2.readInt();
                                i4 = 0;
                                for (i3 = 0; i3 < i2; i3++) {
                                    CachedContent cachedContentJ = j(i6, dataInputStream2);
                                    String str = cachedContentJ.f18860b;
                                    map.put(str, cachedContentJ);
                                    sparseArray.put(cachedContentJ.f18859a, str);
                                    i4 += i(cachedContentJ, i6);
                                }
                                i5 = dataInputStream2.readInt();
                                boolean z2 = dataInputStream2.read() == -1;
                                if (i5 == i4 && z2) {
                                    Util.h(dataInputStream2);
                                    return;
                                }
                            } else {
                                Cipher cipher = this.f18873a;
                                if (cipher != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream2.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        SecretKeySpec secretKeySpec = this.f18874b;
                                        int i7 = Util.f18979a;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                        i2 = dataInputStream2.readInt();
                                        i4 = 0;
                                        while (i3 < i2) {
                                            CachedContent cachedContentJ2 = j(i6, dataInputStream2);
                                            String str2 = cachedContentJ2.f18860b;
                                            map.put(str2, cachedContentJ2);
                                            sparseArray.put(cachedContentJ2.f18859a, str2);
                                            i4 += i(cachedContentJ2, i6);
                                        }
                                        i5 = dataInputStream2.readInt();
                                        if (dataInputStream2.read() == -1) {
                                        }
                                        if (i5 == i4) {
                                            Util.h(dataInputStream2);
                                            return;
                                        }
                                    } catch (InvalidAlgorithmParameterException e2) {
                                        e = e2;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e3) {
                                        e = e3;
                                        throw new IllegalStateException(e);
                                    }
                                }
                            }
                        }
                        Util.h(dataInputStream2);
                    } catch (IOException unused) {
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            Util.h(dataInputStream);
                        }
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            Util.h(dataInputStream);
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                map.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public final void h() {
            AtomicFile atomicFile = this.f18875c;
            atomicFile.f18889a.delete();
            atomicFile.f18890b.delete();
        }
    }

    public interface Storage {
        void a(CachedContent cachedContent, boolean z2);

        boolean b();

        void c(HashMap map);

        void d(long j);

        void e(HashMap map);

        void f(CachedContent cachedContent);

        void g(HashMap map, SparseArray sparseArray);

        void h();
    }

    public CachedContentIndex(DatabaseProvider databaseProvider, File file) {
        DatabaseStorage databaseStorage = new DatabaseStorage(databaseProvider);
        LegacyStorage legacyStorage = file != null ? new LegacyStorage(new File(file, "cached_content_index.exi")) : null;
        this.f18868e = databaseStorage;
        this.f = legacyStorage;
    }

    public static DefaultContentMetadata a(DataInputStream dataInputStream) throws IOException {
        int i2 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String utf = dataInputStream.readUTF();
            int i4 = dataInputStream.readInt();
            if (i4 < 0) {
                throw new IOException(a.h(i4, "Invalid value size: "));
            }
            int iMin = Math.min(i4, 10485760);
            byte[] bArrCopyOf = Util.f;
            int i5 = 0;
            while (i5 != i4) {
                int i6 = i5 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                dataInputStream.readFully(bArrCopyOf, i5, iMin);
                iMin = Math.min(i4 - i6, 10485760);
                i5 = i6;
            }
            map.put(utf, bArrCopyOf);
        }
        return new DefaultContentMetadata(map);
    }

    public static void b(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = defaultContentMetadata.f18881b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final CachedContent c(String str) {
        return (CachedContent) this.f18865a.get(str);
    }

    public final CachedContent d(String str) {
        HashMap map = this.f18865a;
        CachedContent cachedContent = (CachedContent) map.get(str);
        if (cachedContent != null) {
            return cachedContent;
        }
        SparseArray sparseArray = this.f18866b;
        int size = sparseArray.size();
        int i2 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            iKeyAt = i2;
        }
        CachedContent cachedContent2 = new CachedContent(iKeyAt, str, DefaultContentMetadata.f18879c);
        map.put(str, cachedContent2);
        sparseArray.put(iKeyAt, str);
        this.d.put(iKeyAt, true);
        this.f18868e.f(cachedContent2);
        return cachedContent2;
    }

    public final void e(long j) {
        Storage storage;
        Storage storage2 = this.f18868e;
        storage2.d(j);
        Storage storage3 = this.f;
        if (storage3 != null) {
            storage3.d(j);
        }
        boolean zB = storage2.b();
        SparseArray sparseArray = this.f18866b;
        HashMap map = this.f18865a;
        if (zB || (storage = this.f) == null || !storage.b()) {
            storage2.g(map, sparseArray);
        } else {
            this.f.g(map, sparseArray);
            storage2.e(map);
        }
        Storage storage4 = this.f;
        if (storage4 != null) {
            storage4.h();
            this.f = null;
        }
    }

    public final void f(String str) {
        HashMap map = this.f18865a;
        CachedContent cachedContent = (CachedContent) map.get(str);
        if (cachedContent != null && cachedContent.f18861c.isEmpty() && cachedContent.d.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = this.d;
            int i2 = cachedContent.f18859a;
            boolean z2 = sparseBooleanArray.get(i2);
            this.f18868e.a(cachedContent, z2);
            SparseArray sparseArray = this.f18866b;
            if (z2) {
                sparseArray.remove(i2);
                sparseBooleanArray.delete(i2);
            } else {
                sparseArray.put(i2, null);
                this.f18867c.put(i2, true);
            }
        }
    }

    public final void g() {
        this.f18868e.c(this.f18865a);
        SparseBooleanArray sparseBooleanArray = this.f18867c;
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f18866b.remove(sparseBooleanArray.keyAt(i2));
        }
        sparseBooleanArray.clear();
        this.d.clear();
    }
}
