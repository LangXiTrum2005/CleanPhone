package lampshade;

import android.content.Context;
import com.ironsource.S5;
import java.io.File;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataStoreFile.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "", S5.c.b, "Ljava/io/File;", "attabal", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class attabal {
    public static final File attabal(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
