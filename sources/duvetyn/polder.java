package duvetyn;

import com.ironsource.X3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.zip.Inflater;
import okio.internal.ZipFilesKt;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\"B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b$\u0010\u001fJ\u0017\u0010%\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,¨\u0006-"}, d2 = {"Lduvetyn/polder;", "Lduvetyn/cutely;", "Lduvetyn/cord;", "zipPath", "fileSystem", "", "Lokio/internal/impromptu;", "entries", "", "comment", "<init>", "(Lduvetyn/cord;Lduvetyn/cutely;Ljava/util/Map;Ljava/lang/String;)V", "path", "Lduvetyn/taiyuan;", "impromptu", "(Lduvetyn/cord;)Lduvetyn/taiyuan;", X3.i.b, "Lduvetyn/impromptu;", "taiyuan", "(Lduvetyn/cord;)Lduvetyn/impromptu;", "", "mustCreate", "mustExist", "apical", "(Lduvetyn/cord;ZZ)Lduvetyn/impromptu;", "Lduvetyn/supplicat;", "formularize", "(Lduvetyn/cord;)Lduvetyn/supplicat;", "dir", "", "wireman", "(Lduvetyn/cord;Z)V", "source", "target", "attabal", "(Lduvetyn/cord;Lduvetyn/cord;)V", "beachfront", "impassible", "(Lduvetyn/cord;)Lduvetyn/cord;", "marial", "Lduvetyn/cord;", "Lduvetyn/cutely;", "competently", "Ljava/util/Map;", "Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class polder extends cutely {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final cutely fileSystem;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Map<cord, okio.internal.impromptu> entries;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final String comment;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final cord zipPath;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final cord f25437cutely = cord.Companion.marial(cord.INSTANCE, "/", false, 1, null);

    public polder(cord zipPath, cutely fileSystem, Map<cord, okio.internal.impromptu> entries, String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    @Override // duvetyn.cutely
    public impromptu apical(cord file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // duvetyn.cutely
    public void attabal(cord source, cord target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // duvetyn.cutely
    public void beachfront(cord path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // duvetyn.cutely
    public supplicat formularize(cord file) throws Throwable {
        beachfront beachfrontVarWireman;
        Intrinsics.checkNotNullParameter(file, "file");
        okio.internal.impromptu impromptuVar = this.entries.get(impassible(file));
        if (impromptuVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        impromptu impromptuVarTaiyuan = this.fileSystem.taiyuan(this.zipPath);
        Throwable th = null;
        try {
            beachfrontVarWireman = adultoid.wireman(impromptuVarTaiyuan.polder(impromptuVar.getOffset()));
            if (impromptuVarTaiyuan != null) {
                try {
                    impromptuVarTaiyuan.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (impromptuVarTaiyuan != null) {
                try {
                    impromptuVarTaiyuan.close();
                } catch (Throwable th4) {
                    patroclinal.marial.attabal(th3, th4);
                }
            }
            beachfrontVarWireman = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.beachfront(beachfrontVarWireman);
        ZipFilesKt.apical(beachfrontVarWireman);
        return impromptuVar.getCompressionMethod() == 0 ? new okio.internal.competently(beachfrontVarWireman, impromptuVar.getSize(), true) : new okio.internal.competently(new arytenoidectomy(new okio.internal.competently(beachfrontVarWireman, impromptuVar.getCompressedSize(), true), new Inflater(true)), impromptuVar.getSize(), false);
    }

    public final cord impassible(cord path) {
        return f25437cutely.impassible(path, true);
    }

    @Override // duvetyn.cutely
    public taiyuan impromptu(cord path) throws Throwable {
        taiyuan taiyuanVarImpromptu;
        Throwable th;
        Intrinsics.checkNotNullParameter(path, "path");
        okio.internal.impromptu impromptuVar = this.entries.get(impassible(path));
        Throwable th2 = null;
        if (impromptuVar == null) {
            return null;
        }
        taiyuan taiyuanVar = new taiyuan(!impromptuVar.getIsDirectory(), impromptuVar.getIsDirectory(), null, impromptuVar.getIsDirectory() ? null : Long.valueOf(impromptuVar.getSize()), null, impromptuVar.getLastModifiedAtMillis(), null, null, 128, null);
        if (impromptuVar.getOffset() == -1) {
            return taiyuanVar;
        }
        impromptu impromptuVarTaiyuan = this.fileSystem.taiyuan(this.zipPath);
        try {
            beachfront beachfrontVarWireman = adultoid.wireman(impromptuVarTaiyuan.polder(impromptuVar.getOffset()));
            try {
                taiyuanVarImpromptu = ZipFilesKt.impromptu(beachfrontVarWireman, taiyuanVar);
                if (beachfrontVarWireman != null) {
                    try {
                        beachfrontVarWireman.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (Throwable th4) {
                if (beachfrontVarWireman != null) {
                    try {
                        beachfrontVarWireman.close();
                    } catch (Throwable th5) {
                        patroclinal.marial.attabal(th4, th5);
                    }
                }
                th = th4;
                taiyuanVarImpromptu = null;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.beachfront(taiyuanVarImpromptu);
            if (impromptuVarTaiyuan != null) {
                try {
                    impromptuVarTaiyuan.close();
                } catch (Throwable th6) {
                    th2 = th6;
                }
            }
            if (th2 != null) {
                throw th2;
            }
            Intrinsics.beachfront(taiyuanVarImpromptu);
            return taiyuanVarImpromptu;
        } catch (Throwable th7) {
            if (impromptuVarTaiyuan != null) {
                try {
                    impromptuVarTaiyuan.close();
                } catch (Throwable th8) {
                    patroclinal.marial.attabal(th7, th8);
                }
            }
            taiyuanVarImpromptu = null;
            th2 = th7;
        }
    }

    @Override // duvetyn.cutely
    public impromptu taiyuan(cord file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // duvetyn.cutely
    public void wireman(cord dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }
}
