package strother;

import android.os.Bundle;
import android.os.Parcel;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;

/* JADX INFO: compiled from: CueDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {
    public marial attabal(long j, byte[] bArr, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i, i2);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new marial(decarock.dern.saneness(new com.google.common.base.marial() { // from class: strother.attabal
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return libya.attabal.saneness((Bundle) obj);
            }
        }, (ArrayList) decarock.attabal.marial(bundle.getParcelableArrayList("c"))), j, bundle.getLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D));
    }
}
