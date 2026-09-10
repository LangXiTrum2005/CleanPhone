package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC2486Ib extends Binder {
    public static final int b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AC f3225a;

    static {
        b = Ug0.f3833a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BinderC2486Ib(ArrayList arrayList) {
        this.f3225a = AC.j(arrayList);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        AC ac = this.f3225a;
        int size = ac.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < b) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) ac.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
