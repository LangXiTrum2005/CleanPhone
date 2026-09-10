package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import vir.arytenoidectomy;
import vir.competently;

/* JADX INFO: compiled from: PlaceholderDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f11474attabal = new wireman();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final attabal.InterfaceC0080attabal f11475saneness = new attabal.InterfaceC0080attabal() { // from class: vir.formularize
        @Override // androidx.media3.datasource.attabal.InterfaceC0080attabal
        public final androidx.media3.datasource.attabal createDataSource() {
            return androidx.media3.datasource.wireman.wireman();
        }
    };

    public static /* synthetic */ wireman wireman() {
        return new wireman();
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(competently competentlyVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        return null;
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.attabal
    public void close() {
    }

    @Override // androidx.media3.datasource.attabal
    public void dern(arytenoidectomy arytenoidectomyVar) {
    }
}
