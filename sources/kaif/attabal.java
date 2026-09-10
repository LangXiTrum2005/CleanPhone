package kaif;

import com.google.common.base.formularize;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: ByteSink.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class attabal {
    public abstract OutputStream attabal() throws IOException;

    public void saneness(byte[] bArr) throws Throwable {
        formularize.triweekly(bArr);
        marial marialVarAttabal = marial.attabal();
        try {
            OutputStream outputStream = (OutputStream) marialVarAttabal.saneness(attabal());
            outputStream.write(bArr);
            outputStream.flush();
            marialVarAttabal.close();
        } catch (Throwable th) {
            try {
                throw marialVarAttabal.dern(th);
            } catch (Throwable th2) {
                marialVarAttabal.close();
                throw th2;
            }
        }
    }
}
