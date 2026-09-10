package p009u;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48880a;

    public /* synthetic */ a(int i2) {
        this.f48880a = i2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f48880a) {
            case 0:
                Charset charset = CrashlyticsReportPersistence.f20721e;
                return str.startsWith("event");
            default:
                Charset charset2 = CrashlyticsReportPersistence.f20721e;
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
