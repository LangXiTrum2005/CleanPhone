package strother;

import android.os.Bundle;
import android.os.Parcel;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CueEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {
    public byte[] attabal(List<libya.attabal> list, long j) {
        ArrayList<Bundle> arrayListDern = decarock.dern.dern(list, new com.google.common.base.marial() { // from class: strother.dern
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return ((libya.attabal) obj).wireman();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListDern);
        bundle.putLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
