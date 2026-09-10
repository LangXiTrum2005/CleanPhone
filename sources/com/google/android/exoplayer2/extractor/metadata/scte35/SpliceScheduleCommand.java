package com.google.android.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C1106Vk;
import com.facebook.ads.redexgen.core.C1108Vm;
import com.facebook.ads.redexgen.core.C1576fq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static String[] A01 = {"QtCZ3YM", "h34NOf9W6vgpobdLQ2oGlEh05TjGRd7m", "HvhGWd1zJYSEGXxl6D7A0DxUnFFCta", "DqPYtjv5NIQ4Rwx", "Z6grTdzpxvdSgrPYmiY2M1", "jLJejEC7jURSysz", "qxEadMmv1usOIAslWwQ5UJE1rpyJ7pzm", "kgSDNEp"};
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C1106Vk();
    public final List<C1108Vm> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C1108Vm.A00(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C1106Vk c1106Vk) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C1108Vm> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C1576fq c1576fq) {
        int iA0I = c1576fq.A0I();
        ArrayList arrayList = new ArrayList(iA0I);
        for (int i = 0; i < iA0I; i++) {
            arrayList.add(C1108Vm.A02(c1576fq));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C1108Vm c1108Vm = this.A00.get(i2);
            int i3 = A01[1].charAt(17);
            if (i3 != 50) {
                throw new RuntimeException();
            }
            A01[1] = "yGcUZN1necDQ6oeU22cionB2weilnTqD";
            c1108Vm.A04(parcel);
        }
    }
}
