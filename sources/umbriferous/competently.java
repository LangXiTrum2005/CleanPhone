package umbriferous;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: BytesBackedNativeSessionFile.java */
/* JADX INFO: loaded from: classes3.dex */
public class competently implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f39082attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f39083dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f39084saneness;

    public competently(String str, String str2, byte[] bArr) {
        this.f39084saneness = str;
        this.f39083dern = str2;
        this.f39082attabal = bArr;
    }

    @Override // umbriferous.merc
    public amount.sealless.wireman.saneness attabal() {
        byte[] bArrDern = dern();
        if (bArrDern == null) {
            return null;
        }
        return amount.sealless.wireman.saneness.attabal().saneness(bArrDern).dern(this.f39084saneness).attabal();
    }

    public final byte[] dern() {
        if (wireman()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f39082attabal);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // umbriferous.merc
    public InputStream getStream() {
        if (wireman()) {
            return null;
        }
        return new ByteArrayInputStream(this.f39082attabal);
    }

    @Override // umbriferous.merc
    public String saneness() {
        return this.f39083dern;
    }

    public final boolean wireman() {
        byte[] bArr = this.f39082attabal;
        return bArr == null || bArr.length == 0;
    }
}
