package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4206oB implements InterfaceC4382qB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f4783a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4783a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final Bundle extraCommand(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeString(str);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC2340Cl.e(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean isEngagementSignalsApiAvailable(InterfaceC4118nB interfaceC4118nB, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean mayLaunchUrl(InterfaceC4118nB interfaceC4118nB, Uri uri, Bundle bundle, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            AbstractC2340Cl.X(parcelObtain, uri, 0);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            if (list == null) {
                parcelObtain.writeInt(-1);
            } else {
                int size = list.size();
                parcelObtain.writeInt(size);
                for (int i = 0; i < size; i++) {
                    AbstractC2340Cl.X(parcelObtain, (Parcelable) list.get(i), 0);
                }
            }
            this.f4783a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean newSession(InterfaceC4118nB interfaceC4118nB) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            this.f4783a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean newSessionWithExtras(InterfaceC4118nB interfaceC4118nB, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final int postMessage(InterfaceC4118nB interfaceC4118nB, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            parcelObtain.writeString(str);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean receiveFile(InterfaceC4118nB interfaceC4118nB, Uri uri, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            AbstractC2340Cl.X(parcelObtain, uri, 0);
            parcelObtain.writeInt(i);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean requestPostMessageChannel(InterfaceC4118nB interfaceC4118nB, Uri uri) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            AbstractC2340Cl.X(parcelObtain, uri, 0);
            this.f4783a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean requestPostMessageChannelWithExtras(InterfaceC4118nB interfaceC4118nB, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            AbstractC2340Cl.X(parcelObtain, uri, 0);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean setEngagementSignalsCallback(InterfaceC4118nB interfaceC4118nB, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            parcelObtain.writeStrongBinder(iBinder);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean updateVisuals(InterfaceC4118nB interfaceC4118nB, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean validateRelationship(InterfaceC4118nB interfaceC4118nB, int i, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeStrongInterface(interfaceC4118nB);
            parcelObtain.writeInt(i);
            AbstractC2340Cl.X(parcelObtain, uri, 0);
            AbstractC2340Cl.X(parcelObtain, bundle, 0);
            this.f4783a.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
    public final boolean warmup(long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4382qB.i1);
            parcelObtain.writeLong(j);
            this.f4783a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
