package com.startapp.sdk.internal;

import android.telephony.CellInfo;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class oh implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CellInfo cellInfo = (CellInfo) obj;
        CellInfo cellInfo2 = (CellInfo) obj2;
        if (cellInfo.isRegistered() == cellInfo2.isRegistered()) {
            return ph.a(cellInfo2) - ph.a(cellInfo);
        }
        if (cellInfo.isRegistered()) {
            return -1;
        }
        return cellInfo2.isRegistered() ? 1 : 0;
    }
}
