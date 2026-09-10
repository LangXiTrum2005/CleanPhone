package sunlike;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/nio/file/Path;", "", "glob", "", "attabal", "(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/util/List;", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
public class marial extends saneness {
    public static final List<Path> attabal(Path path, String glob) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamAttabal = wireman.attabal(directoryStreamNewDirectoryStream);
            Intrinsics.beachfront(directoryStreamAttabal);
            List<Path> listMolet = CollectionsKt.molet(directoryStreamAttabal);
            interaction.saneness.attabal(directoryStreamNewDirectoryStream, null);
            return listMolet;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                interaction.saneness.attabal(directoryStreamNewDirectoryStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ List saneness(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return attabal(path, str);
    }
}
