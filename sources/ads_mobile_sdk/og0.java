package ads_mobile_sdk;

import com.google.common.base.marial;
import java.io.File;
import java.util.concurrent.ExecutorService;
import saneness.nesslerize;

/* JADX INFO: loaded from: classes.dex */
public final class og0 implements nesslerize {
    public final ExecutorService a;

    public og0(ExecutorService executorService) {
        this.a = executorService;
    }

    public final ng0 a(File file, byte[] bArr, marial marialVar) {
        return new ng0(file, this.a, new jg0(bArr), marialVar);
    }
}
