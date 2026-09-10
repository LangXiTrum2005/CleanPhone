package androidx.core.provider;

import com.applovin.impl.b8;
import com.applovin.impl.c8;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int X;

    public /* synthetic */ a(int i2) {
        this.X = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b2 = bArr[i2];
                    byte b3 = bArr2[i2];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
            case 1:
                return b8.a((c8) obj, (c8) obj2);
            case 2:
                return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
            case 3:
                Charset charset = CrashlyticsReportPersistence.f20721e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                Charset charset2 = CrashlyticsReportPersistence.f20721e;
                String name = ((File) obj).getName();
                int i3 = CrashlyticsReportPersistence.f;
                return name.substring(0, i3).compareTo(((File) obj2).getName().substring(0, i3));
        }
    }
}
