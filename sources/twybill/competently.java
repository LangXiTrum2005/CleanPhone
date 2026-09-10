package twybill;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.immediately;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import decarock.grimness;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: CachedContentIndex.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final HashMap<String, beachfront> f39004attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public dern f39005beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final SparseBooleanArray f39006dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public dern f39007marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final SparseArray<String> f39008saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final SparseBooleanArray f39009wireman;

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static final class attabal implements dern {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final String[] f39010marial = {"id", X3.i.W, TtmlNode.TAG_METADATA};

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final liable.attabal f39011attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f39012dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final SparseArray<beachfront> f39013saneness = new SparseArray<>();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f39014wireman;

        public attabal(liable.attabal attabalVar) {
            this.f39011attabal = attabalVar;
        }

        public static void cutely(liable.attabal attabalVar, String str) throws DatabaseIOException {
            try {
                String strTriweekly = triweekly(str);
                SQLiteDatabase writableDatabase = attabalVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    liable.dern.dern(writableDatabase, 1, str);
                    formularize(writableDatabase, strTriweekly);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        public static void formularize(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String triweekly(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        public final void apical(SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((String) decarock.attabal.marial(this.f39014wireman), "id = ?", new String[]{Integer.toString(i)});
        }

        @Override // twybill.competently.dern
        public boolean attabal() throws DatabaseIOException {
            try {
                return liable.dern.saneness(this.f39011attabal.getReadableDatabase(), 1, (String) decarock.attabal.marial(this.f39012dern)) != -1;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // twybill.competently.dern
        public void beachfront(beachfront beachfrontVar) {
            this.f39013saneness.put(beachfrontVar.f38997attabal, beachfrontVar);
        }

        @Override // twybill.competently.dern
        public void competently(HashMap<String, beachfront> map, SparseArray<String> sparseArray) throws IOException {
            decarock.attabal.competently(this.f39013saneness.size() == 0);
            try {
                if (liable.dern.saneness(this.f39011attabal.getReadableDatabase(), 1, (String) decarock.attabal.marial(this.f39012dern)) != 1) {
                    SQLiteDatabase writableDatabase = this.f39011attabal.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        kowloon(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorImpassible = impassible();
                while (cursorImpassible.moveToNext()) {
                    try {
                        beachfront beachfrontVar = new beachfront(cursorImpassible.getInt(0), (String) decarock.attabal.marial(cursorImpassible.getString(1)), competently.kowloon(new DataInputStream(new ByteArrayInputStream(cursorImpassible.getBlob(2)))));
                        map.put(beachfrontVar.f39000saneness, beachfrontVar);
                        sparseArray.put(beachfrontVar.f38997attabal, beachfrontVar.f39000saneness);
                    } catch (Throwable th2) {
                        if (cursorImpassible != null) {
                            try {
                                cursorImpassible.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                cursorImpassible.close();
            } catch (SQLiteException e) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e);
            }
        }

        @Override // twybill.competently.dern
        public void dern(long j) {
            String hexString = Long.toHexString(j);
            this.f39012dern = hexString;
            this.f39014wireman = triweekly(hexString);
        }

        public final Cursor impassible() {
            return this.f39011attabal.getReadableDatabase().query((String) decarock.attabal.marial(this.f39014wireman), f39010marial, null, null, null, null, null);
        }

        @Override // twybill.competently.dern
        public void impromptu() throws DatabaseIOException {
            cutely(this.f39011attabal, (String) decarock.attabal.marial(this.f39012dern));
        }

        public final void kowloon(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            liable.dern.wireman(sQLiteDatabase, 1, (String) decarock.attabal.marial(this.f39012dern), 1);
            formularize(sQLiteDatabase, (String) decarock.attabal.marial(this.f39014wireman));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f39014wireman + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // twybill.competently.dern
        public void marial(HashMap<String, beachfront> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f39011attabal.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    kowloon(writableDatabase);
                    Iterator<beachfront> it = map.values().iterator();
                    while (it.hasNext()) {
                        taiyuan(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f39013saneness.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // twybill.competently.dern
        public void saneness(HashMap<String, beachfront> map) throws IOException {
            if (this.f39013saneness.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f39011attabal.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.f39013saneness.size(); i++) {
                    try {
                        beachfront beachfrontVarValueAt = this.f39013saneness.valueAt(i);
                        if (beachfrontVarValueAt == null) {
                            apical(writableDatabase, this.f39013saneness.keyAt(i));
                        } else {
                            taiyuan(writableDatabase, beachfrontVarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f39013saneness.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        public final void taiyuan(SQLiteDatabase sQLiteDatabase, beachfront beachfrontVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            competently.polloi(beachfrontVar.wireman(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(beachfrontVar.f38997attabal));
            contentValues.put(X3.i.W, beachfrontVar.f39000saneness);
            contentValues.put(TtmlNode.TAG_METADATA, byteArray);
            sQLiteDatabase.replaceOrThrow((String) decarock.attabal.marial(this.f39014wireman), null, contentValues);
        }

        @Override // twybill.competently.dern
        public void wireman(beachfront beachfrontVar, boolean z) {
            if (z) {
                this.f39013saneness.delete(beachfrontVar.f38997attabal);
            } else {
                this.f39013saneness.put(beachfrontVar.f38997attabal, null);
            }
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public interface dern {
        boolean attabal() throws IOException;

        void beachfront(beachfront beachfrontVar);

        void competently(HashMap<String, beachfront> map, SparseArray<String> sparseArray) throws IOException;

        void dern(long j);

        void impromptu() throws IOException;

        void marial(HashMap<String, beachfront> map) throws IOException;

        void saneness(HashMap<String, beachfront> map) throws IOException;

        void wireman(beachfront beachfrontVar, boolean z);
    }

    public competently(liable.attabal attabalVar, File file, byte[] bArr, boolean z, boolean z2) {
        decarock.attabal.competently((attabalVar == null && file == null) ? false : true);
        this.f39004attabal = new HashMap<>();
        this.f39008saneness = new SparseArray<>();
        this.f39006dern = new SparseBooleanArray();
        this.f39009wireman = new SparseBooleanArray();
        attabal attabalVar2 = attabalVar != null ? new attabal(attabalVar) : null;
        saneness sanenessVar = file != null ? new saneness(new File(file, CachedContentIndex.FILE_NAME), bArr, z) : null;
        if (attabalVar2 == null || (sanenessVar != null && z2)) {
            this.f39007marial = (dern) grimness.impromptu(sanenessVar);
            this.f39005beachfront = attabalVar2;
        } else {
            this.f39007marial = attabalVar2;
            this.f39005beachfront = sanenessVar;
        }
    }

    public static int cutely(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    public static boolean impassible(String str) {
        return str.startsWith(CachedContentIndex.FILE_NAME);
    }

    public static cutely kowloon(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException("Invalid value size: " + i3);
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = grimness.f25081beachfront;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new cutely(map);
    }

    public static void polloi(cutely cutelyVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setBeachfront = cutelyVar.beachfront();
        dataOutputStream.writeInt(setBeachfront.size());
        for (Map.Entry<String, byte[]> entry : setBeachfront) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public beachfront apical(String str) {
        beachfront beachfrontVar = this.f39004attabal.get(str);
        return beachfrontVar == null ? dern(str) : beachfrontVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void arytenoidectomy() {
        immediately it = ImmutableSet.copyOf((Collection) this.f39004attabal.keySet()).iterator();
        while (it.hasNext()) {
            triweekly((String) it.next());
        }
    }

    public beachfront beachfront(String str) {
        return this.f39004attabal.get(str);
    }

    public Collection<beachfront> competently() {
        return Collections.unmodifiableCollection(this.f39004attabal.values());
    }

    public final beachfront dern(String str) {
        int iCutely = cutely(this.f39008saneness);
        beachfront beachfrontVar = new beachfront(iCutely, str);
        this.f39004attabal.put(str, beachfrontVar);
        this.f39008saneness.put(iCutely, str);
        this.f39009wireman.put(iCutely, true);
        this.f39007marial.beachfront(beachfrontVar);
        return beachfrontVar;
    }

    public void formularize(long j) throws IOException {
        dern dernVar;
        this.f39007marial.dern(j);
        dern dernVar2 = this.f39005beachfront;
        if (dernVar2 != null) {
            dernVar2.dern(j);
        }
        if (this.f39007marial.attabal() || (dernVar = this.f39005beachfront) == null || !dernVar.attabal()) {
            this.f39007marial.competently(this.f39004attabal, this.f39008saneness);
        } else {
            this.f39005beachfront.competently(this.f39004attabal, this.f39008saneness);
            this.f39007marial.marial(this.f39004attabal);
        }
        dern dernVar3 = this.f39005beachfront;
        if (dernVar3 != null) {
            dernVar3.impromptu();
            this.f39005beachfront = null;
        }
    }

    public impromptu impromptu(String str) {
        beachfront beachfrontVarBeachfront = beachfront(str);
        return beachfrontVarBeachfront != null ? beachfrontVarBeachfront.wireman() : cutely.f39022dern;
    }

    public int marial(String str) {
        return apical(str).f38997attabal;
    }

    public void monoploid() throws IOException {
        this.f39007marial.saneness(this.f39004attabal);
        int size = this.f39006dern.size();
        for (int i = 0; i < size; i++) {
            this.f39008saneness.remove(this.f39006dern.keyAt(i));
        }
        this.f39006dern.clear();
        this.f39009wireman.clear();
    }

    public String taiyuan(int i) {
        return this.f39008saneness.get(i);
    }

    public void triweekly(String str) {
        beachfront beachfrontVar = this.f39004attabal.get(str);
        if (beachfrontVar != null && beachfrontVar.competently() && beachfrontVar.taiyuan()) {
            this.f39004attabal.remove(str);
            int i = beachfrontVar.f38997attabal;
            boolean z = this.f39009wireman.get(i);
            this.f39007marial.wireman(beachfrontVar, z);
            if (z) {
                this.f39008saneness.remove(i);
                this.f39009wireman.delete(i);
            } else {
                this.f39008saneness.put(i, null);
                this.f39006dern.put(i, true);
            }
        }
    }

    public void wireman(String str, taiyuan taiyuanVar) {
        beachfront beachfrontVarApical = apical(str);
        if (beachfrontVarApical.saneness(taiyuanVar)) {
            this.f39007marial.beachfront(beachfrontVarApical);
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static class saneness implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f39015attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f39016beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public impassible f39017competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final SecretKeySpec f39018dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final decarock.saneness f39019marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Cipher f39020saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final SecureRandom f39021wireman;

        public saneness(File file, byte[] bArr, boolean z) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            decarock.attabal.competently((bArr == null && z) ? false : true);
            if (bArr != null) {
                decarock.attabal.attabal(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                decarock.attabal.attabal(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.f39015attabal = z;
            this.f39020saneness = cipher;
            this.f39018dern = secretKeySpec;
            this.f39021wireman = z ? new SecureRandom() : null;
            this.f39019marial = new decarock.saneness(file);
        }

        public final boolean apical(HashMap<String, beachfront> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f39019marial.dern()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f39019marial.wireman());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream2.readInt();
                    if (i >= 0 && i <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f39020saneness == null) {
                                grimness.formularize(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f39020saneness.init(2, (Key) grimness.impromptu(this.f39018dern), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f39020saneness));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f39015attabal) {
                            this.f39016beachfront = true;
                        }
                        int i2 = dataInputStream2.readInt();
                        int iTaiyuan = 0;
                        for (int i3 = 0; i3 < i2; i3++) {
                            beachfront beachfrontVarCutely = cutely(i, dataInputStream2);
                            map.put(beachfrontVarCutely.f39000saneness, beachfrontVarCutely);
                            sparseArray.put(beachfrontVarCutely.f38997attabal, beachfrontVarCutely.f39000saneness);
                            iTaiyuan += taiyuan(beachfrontVarCutely, i);
                        }
                        int i4 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (i4 == iTaiyuan && z) {
                            grimness.formularize(dataInputStream2);
                            return true;
                        }
                        grimness.formularize(dataInputStream2);
                        return false;
                    }
                    grimness.formularize(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        grimness.formularize(dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        grimness.formularize(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // twybill.competently.dern
        public boolean attabal() {
            return this.f39019marial.dern();
        }

        @Override // twybill.competently.dern
        public void beachfront(beachfront beachfrontVar) {
            this.f39016beachfront = true;
        }

        @Override // twybill.competently.dern
        public void competently(HashMap<String, beachfront> map, SparseArray<String> sparseArray) {
            decarock.attabal.competently(!this.f39016beachfront);
            if (apical(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f39019marial.attabal();
        }

        public final beachfront cutely(int i, DataInputStream dataInputStream) throws IOException {
            cutely cutelyVarKowloon;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                taiyuan taiyuanVar = new taiyuan();
                taiyuan.competently(taiyuanVar, j);
                cutelyVarKowloon = cutely.f39022dern.marial(taiyuanVar);
            } else {
                cutelyVarKowloon = competently.kowloon(dataInputStream);
            }
            return new beachfront(i2, utf, cutelyVarKowloon);
        }

        public final void formularize(beachfront beachfrontVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(beachfrontVar.f38997attabal);
            dataOutputStream.writeUTF(beachfrontVar.f39000saneness);
            competently.polloi(beachfrontVar.wireman(), dataOutputStream);
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
        public final void impassible(HashMap<String, beachfront> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamBeachfront = this.f39019marial.beachfront();
                impassible impassibleVar = this.f39017competently;
                if (impassibleVar == null) {
                    this.f39017competently = new impassible(outputStreamBeachfront);
                } else {
                    impassibleVar.attabal(outputStreamBeachfront);
                }
                impassible impassibleVar2 = this.f39017competently;
                DataOutputStream dataOutputStream2 = new DataOutputStream(impassibleVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(this.f39015attabal ? 1 : 0);
                    if (this.f39015attabal) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) grimness.impromptu(this.f39021wireman)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) grimness.impromptu(this.f39020saneness)).init(1, (Key) grimness.impromptu(this.f39018dern), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(impassibleVar2, this.f39020saneness));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    int iTaiyuan = 0;
                    for (beachfront beachfrontVar : map.values()) {
                        formularize(beachfrontVar, dataOutputStream2);
                        iTaiyuan += taiyuan(beachfrontVar, 2);
                    }
                    dataOutputStream2.writeInt(iTaiyuan);
                    this.f39019marial.saneness(dataOutputStream2);
                    grimness.formularize(null);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    grimness.formularize(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // twybill.competently.dern
        public void impromptu() {
            this.f39019marial.attabal();
        }

        @Override // twybill.competently.dern
        public void marial(HashMap<String, beachfront> map) throws Throwable {
            impassible(map);
            this.f39016beachfront = false;
        }

        @Override // twybill.competently.dern
        public void saneness(HashMap<String, beachfront> map) throws Throwable {
            if (this.f39016beachfront) {
                marial(map);
            }
        }

        public final int taiyuan(beachfront beachfrontVar, int i) {
            int i2;
            int iHashCode;
            int iHashCode2 = (beachfrontVar.f38997attabal * 31) + beachfrontVar.f39000saneness.hashCode();
            if (i < 2) {
                long jSaneness = impromptu.saneness(beachfrontVar.wireman());
                i2 = iHashCode2 * 31;
                iHashCode = (int) (jSaneness ^ (jSaneness >>> 32));
            } else {
                i2 = iHashCode2 * 31;
                iHashCode = beachfrontVar.wireman().hashCode();
            }
            return i2 + iHashCode;
        }

        @Override // twybill.competently.dern
        public void wireman(beachfront beachfrontVar, boolean z) {
            this.f39016beachfront = true;
        }

        @Override // twybill.competently.dern
        public void dern(long j) {
        }
    }
}
