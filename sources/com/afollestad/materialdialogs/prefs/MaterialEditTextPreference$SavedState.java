package com.afollestad.materialdialogs.prefs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
class MaterialEditTextPreference$SavedState extends Preference.BaseSavedState {
    public static final Parcelable.Creator<MaterialEditTextPreference$SavedState> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48a;
    public final Bundle b;

    public MaterialEditTextPreference$SavedState(Parcel parcel) {
        super(parcel);
        this.f48a = parcel.readInt() == 1;
        this.b = parcel.readBundle();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f48a ? 1 : 0);
        parcel.writeBundle(this.b);
    }

    public MaterialEditTextPreference$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
