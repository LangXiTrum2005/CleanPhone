package duvetyn;

import com.ironsource.C3414a2;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\t\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0013\u0010(\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b'\u0010\u0012R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u00102\u001a\u0004\u0018\u00010/8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b3\u0010&R\u0011\u00105\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b5\u0010\"R\u0013\u00107\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b6\u0010\u0012¨\u00068"}, d2 = {"Lduvetyn/cord;", "", "Lokio/ByteString;", "bytes", "<init>", "(Lokio/ByteString;)V", "", "child", "triweekly", "(Ljava/lang/String;)Lduvetyn/cord;", "", "normalize", "impassible", "(Lduvetyn/cord;Z)Lduvetyn/cord;", C3414a2.d, "formularize", "(Lduvetyn/cord;)Lduvetyn/cord;", "cutely", "()Lduvetyn/cord;", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "arytenoidectomy", "()Ljava/nio/file/Path;", "", "attabal", "(Lduvetyn/cord;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "kowloon", "Lokio/ByteString;", "dern", "()Lokio/ByteString;", "wireman", "root", "", "marial", "()Ljava/util/List;", "segmentsBytes", "isAbsolute", "()Z", "", "monoploid", "()Ljava/lang/Character;", "volumeLetter", "taiyuan", "nameBytes", "name", "apical", "parent", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class cord implements Comparable<cord> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final String f25397monoploid;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final ByteString bytes;

    /* JADX INFO: renamed from: duvetyn.cord$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Path.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lduvetyn/cord$attabal;", "", "<init>", "()V", "", "", "normalize", "Lduvetyn/cord;", "saneness", "(Ljava/lang/String;Z)Lduvetyn/cord;", "Ljava/io/File;", "attabal", "(Ljava/io/File;Z)Lduvetyn/cord;", "Ljava/nio/file/Path;", "dern", "(Ljava/nio/file/Path;Z)Lduvetyn/cord;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ cord beachfront(Companion companion, Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.dern(path, z);
        }

        public static /* synthetic */ cord marial(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.saneness(str, z);
        }

        public static /* synthetic */ cord wireman(Companion companion, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.attabal(file, z);
        }

        public final cord attabal(File file, boolean z) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return saneness(string, z);
        }

        public final cord dern(Path path, boolean z) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return saneness(path.toString(), z);
        }

        public final cord saneness(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return okio.internal.wireman.apical(str, z);
        }

        public Companion() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f25397monoploid = separator;
    }

    public cord(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    public static /* synthetic */ cord kowloon(cord cordVar, cord cordVar2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cordVar.impassible(cordVar2, z);
    }

    public final cord apical() {
        if (Intrinsics.wireman(getBytes(), okio.internal.wireman.f34759wireman) || Intrinsics.wireman(getBytes(), okio.internal.wireman.f34755attabal) || Intrinsics.wireman(getBytes(), okio.internal.wireman.f34758saneness) || okio.internal.wireman.triweekly(this)) {
            return null;
        }
        int iFormularize = okio.internal.wireman.formularize(this);
        if (iFormularize == 2 && monoploid() != null) {
            if (getBytes().size() == 3) {
                return null;
            }
            return new cord(ByteString.substring$default(getBytes(), 0, 3, 1, null));
        }
        if (iFormularize == 1 && getBytes().startsWith(okio.internal.wireman.f34758saneness)) {
            return null;
        }
        if (iFormularize != -1 || monoploid() == null) {
            if (iFormularize == -1) {
                return new cord(okio.internal.wireman.f34759wireman);
            }
            return iFormularize == 0 ? new cord(ByteString.substring$default(getBytes(), 0, 1, 1, null)) : new cord(ByteString.substring$default(getBytes(), 0, iFormularize, 1, null));
        }
        if (getBytes().size() == 2) {
            return null;
        }
        return new cord(ByteString.substring$default(getBytes(), 0, 2, 1, null));
    }

    public final Path arytenoidectomy() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public int compareTo(cord other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    public final cord cutely() {
        return INSTANCE.saneness(toString(), true);
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final ByteString getBytes() {
        return this.bytes;
    }

    public boolean equals(Object other) {
        return (other instanceof cord) && Intrinsics.wireman(((cord) other).getBytes(), getBytes());
    }

    public final cord formularize(cord other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.wireman(wireman(), other.wireman())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> listMarial = marial();
        List<ByteString> listMarial2 = other.marial();
        int iMin = Math.min(listMarial.size(), listMarial2.size());
        int i = 0;
        while (i < iMin && Intrinsics.wireman(listMarial.get(i), listMarial2.get(i))) {
            i++;
        }
        if (i == iMin && getBytes().size() == other.getBytes().size()) {
            return Companion.marial(INSTANCE, ".", false, 1, null);
        }
        if (listMarial2.subList(i, listMarial2.size()).indexOf(okio.internal.wireman.f34757marial) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        wireman wiremanVar = new wireman();
        ByteString byteStringImpassible = okio.internal.wireman.impassible(other);
        if (byteStringImpassible == null && (byteStringImpassible = okio.internal.wireman.impassible(this)) == null) {
            byteStringImpassible = okio.internal.wireman.molybdenite(f25397monoploid);
        }
        int size = listMarial2.size();
        for (int i2 = i; i2 < size; i2++) {
            wiremanVar.sensatory(okio.internal.wireman.f34757marial);
            wiremanVar.sensatory(byteStringImpassible);
        }
        int size2 = listMarial.size();
        while (i < size2) {
            wiremanVar.sensatory(listMarial.get(i));
            wiremanVar.sensatory(byteStringImpassible);
            i++;
        }
        return okio.internal.wireman.monoploid(wiremanVar, false);
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final cord impassible(cord child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.wireman.cutely(this, child, normalize);
    }

    public final boolean isAbsolute() {
        return okio.internal.wireman.kowloon(this) != -1;
    }

    public final List<ByteString> marial() {
        ArrayList arrayList = new ArrayList();
        int iKowloon = okio.internal.wireman.kowloon(this);
        if (iKowloon == -1) {
            iKowloon = 0;
        } else if (iKowloon < getBytes().size() && getBytes().getByte(iKowloon) == 92) {
            iKowloon++;
        }
        int size = getBytes().size();
        int i = iKowloon;
        while (iKowloon < size) {
            if (getBytes().getByte(iKowloon) == 47 || getBytes().getByte(iKowloon) == 92) {
                arrayList.add(getBytes().substring(i, iKowloon));
                i = iKowloon + 1;
            }
            iKowloon++;
        }
        if (i < getBytes().size()) {
            arrayList.add(getBytes().substring(i, getBytes().size()));
        }
        return arrayList;
    }

    public final Character monoploid() {
        if (ByteString.indexOf$default(getBytes(), okio.internal.wireman.f34755attabal, 0, 2, (Object) null) != -1 || getBytes().size() < 2 || getBytes().getByte(1) != 58) {
            return null;
        }
        char c = (char) getBytes().getByte(0);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return null;
        }
        return Character.valueOf(c);
    }

    public final String name() {
        return taiyuan().utf8();
    }

    public final ByteString taiyuan() {
        int iFormularize = okio.internal.wireman.formularize(this);
        if (iFormularize != -1) {
            return ByteString.substring$default(getBytes(), iFormularize + 1, 0, 2, null);
        }
        return (monoploid() == null || getBytes().size() != 2) ? getBytes() : ByteString.EMPTY;
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return getBytes().utf8();
    }

    public final cord triweekly(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.wireman.cutely(this, okio.internal.wireman.monoploid(new wireman().writeUtf8(child), false), false);
    }

    public final cord wireman() {
        int iKowloon = okio.internal.wireman.kowloon(this);
        if (iKowloon == -1) {
            return null;
        }
        return new cord(getBytes().substring(0, iKowloon));
    }
}
