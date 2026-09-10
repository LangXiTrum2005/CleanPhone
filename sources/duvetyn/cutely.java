package duvetyn;

import com.ironsource.X3;
import java.io.IOException;
import okio.internal.ResourceFileSystem;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001bJ\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b#\u0010\u001bJ\u0015\u0010$\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001d¨\u0006%"}, d2 = {"Lduvetyn/cutely;", "", "<init>", "()V", "Lduvetyn/cord;", "path", "Lduvetyn/taiyuan;", "impromptu", "(Lduvetyn/cord;)Lduvetyn/taiyuan;", "", "competently", "(Lduvetyn/cord;)Z", X3.i.b, "Lduvetyn/impromptu;", "taiyuan", "(Lduvetyn/cord;)Lduvetyn/impromptu;", "mustCreate", "mustExist", "apical", "(Lduvetyn/cord;ZZ)Lduvetyn/impromptu;", "cutely", "Lduvetyn/supplicat;", "formularize", "(Lduvetyn/cord;)Lduvetyn/supplicat;", "dir", "", "wireman", "(Lduvetyn/cord;Z)V", "dern", "(Lduvetyn/cord;)V", "saneness", "source", "target", "attabal", "(Lduvetyn/cord;Lduvetyn/cord;)V", "beachfront", "marial", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class cutely {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final cord f25406dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final cutely f25407saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final cutely f25408wireman;

    static {
        cutely molybdeniteVar;
        try {
            Class.forName("java.nio.file.Files");
            molybdeniteVar = new graveside();
        } catch (ClassNotFoundException unused) {
            molybdeniteVar = new molybdenite();
        }
        f25407saneness = molybdeniteVar;
        cord.Companion companion = cord.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        f25406dern = cord.Companion.marial(companion, property, false, 1, null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        f25408wireman = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public abstract impromptu apical(cord file, boolean mustCreate, boolean mustExist) throws IOException;

    public abstract void attabal(cord source, cord target) throws IOException;

    public abstract void beachfront(cord path, boolean mustExist) throws IOException;

    public final boolean competently(cord path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return okio.internal.dern.saneness(this, path);
    }

    public final impromptu cutely(cord file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return apical(file, false, false);
    }

    public final void dern(cord dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        wireman(dir, false);
    }

    public abstract supplicat formularize(cord file) throws IOException;

    public abstract taiyuan impromptu(cord path) throws IOException;

    public final void marial(cord path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        beachfront(path, false);
    }

    public final void saneness(cord dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        okio.internal.dern.attabal(this, dir, mustCreate);
    }

    public abstract impromptu taiyuan(cord file) throws IOException;

    public abstract void wireman(cord dir, boolean mustCreate) throws IOException;
}
