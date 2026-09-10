package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C11074v;
import com.facebook.ads.redexgen.core.C1431Ib;
import com.facebook.ads.redexgen.core.IZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new IZ();
    public final List<C1431Ib> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(C1431Ib.A00(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, IZ iz) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C1431Ib> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C11074v c11074v) {
        int iA0I = c11074v.A0I();
        ArrayList arrayList = new ArrayList(iA0I);
        for (int i2 = 0; i2 < iA0I; i2++) {
            arrayList.add(C1431Ib.A02(c11074v));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.A00.get(i3).A04(parcel);
        }
    }
}
