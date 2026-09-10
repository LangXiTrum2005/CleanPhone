package vir;

import java.io.IOException;

/* JADX INFO: compiled from: DataSourceUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {
    public static void attabal(androidx.media3.datasource.attabal attabalVar) {
        if (attabalVar != null) {
            try {
                attabalVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
