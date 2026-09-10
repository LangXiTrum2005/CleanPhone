package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3942lB implements InterfaceC4118nB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f4639a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4639a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void extraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            parcelObtain.writeString(str);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            parcelObtain.writeString(str);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC2871Wx.K(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            parcelObtain.writeInt(i5);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(10, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onMessageChannelReady(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onMinimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(11, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onNavigationEvent(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            parcelObtain.writeInt(i);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onPostMessage(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            parcelObtain.writeString(str);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            parcelObtain.writeInt(i);
            AbstractC2871Wx.L(parcelObtain, uri, 0);
            parcelObtain.writeInt(z ? 1 : 0);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onUnminimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC4118nB.h1);
            AbstractC2871Wx.L(parcelObtain, bundle, 0);
            this.f4639a.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
