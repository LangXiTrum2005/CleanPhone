package com.afollestad.materialdialogs.prefs;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f51a) {
            case 0:
                return new MaterialDialogPreference$SavedState(parcel);
            case 1:
                return new MaterialEditTextPreference$SavedState(parcel);
            case 2:
                return new MaterialListPreference$SavedState(parcel);
            default:
                return new MaterialMultiSelectListPreference$SavedState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f51a) {
            case 0:
                return new MaterialDialogPreference$SavedState[i];
            case 1:
                return new MaterialEditTextPreference$SavedState[i];
            case 2:
                return new MaterialListPreference$SavedState[i];
            default:
                return new MaterialMultiSelectListPreference$SavedState[i];
        }
    }
}
