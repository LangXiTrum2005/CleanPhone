package sulfarsenide;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: SQLiteCopyOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class marial implements iconoclasm.dern {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f38253adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final String f38254arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public androidx.room.attabal f38255graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f38256kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final iconoclasm.dern f38257molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final File f38258monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final int f38259polloi;

    public marial(Context context, String str, File file, int i, iconoclasm.dern dernVar) {
        this.f38256kowloon = context;
        this.f38254arytenoidectomy = str;
        this.f38258monoploid = file;
        this.f38259polloi = i;
        this.f38257molybdenite = dernVar;
    }

    public final void attabal(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f38254arytenoidectomy != null) {
            channel = Channels.newChannel(this.f38256kowloon.getAssets().open(this.f38254arytenoidectomy));
        } else {
            if (this.f38258monoploid == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f38258monoploid).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f38256kowloon.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        dispope.wireman.attabal(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    @Override // iconoclasm.dern, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f38257molybdenite.close();
        this.f38253adultoid = false;
    }

    public final void dern() {
        String databaseName = getDatabaseName();
        File databasePath = this.f38256kowloon.getDatabasePath(databaseName);
        androidx.room.attabal attabalVar = this.f38255graveside;
        dispope.attabal attabalVar2 = new dispope.attabal(databaseName, this.f38256kowloon.getFilesDir(), attabalVar == null || attabalVar.f13569taiyuan);
        try {
            attabalVar2.saneness();
            if (!databasePath.exists()) {
                try {
                    attabal(databasePath);
                    attabalVar2.dern();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            if (this.f38255graveside == null) {
                attabalVar2.dern();
                return;
            }
            try {
                int iDern = dispope.dern.dern(databasePath);
                int i = this.f38259polloi;
                if (iDern == i) {
                    attabalVar2.dern();
                } else {
                    if (this.f38255graveside.attabal(iDern, i)) {
                        attabalVar2.dern();
                        return;
                    }
                    if (this.f38256kowloon.deleteDatabase(databaseName)) {
                        try {
                            attabal(databasePath);
                        } catch (IOException unused) {
                        }
                    }
                    attabalVar2.dern();
                }
            } catch (IOException unused2) {
                attabalVar2.dern();
            }
        } catch (Throwable th) {
            attabalVar2.dern();
            throw th;
        }
    }

    @Override // iconoclasm.dern
    public String getDatabaseName() {
        return this.f38257molybdenite.getDatabaseName();
    }

    @Override // iconoclasm.dern
    public synchronized iconoclasm.saneness getWritableDatabase() {
        try {
            if (!this.f38253adultoid) {
                dern();
                this.f38253adultoid = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38257molybdenite.getWritableDatabase();
    }

    public void saneness(androidx.room.attabal attabalVar) {
        this.f38255graveside = attabalVar;
    }

    @Override // iconoclasm.dern
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f38257molybdenite.setWriteAheadLoggingEnabled(z);
    }
}
