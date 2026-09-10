package com.afollestad.materialdialogs.prefs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
class MaterialDialogPreference$SavedState extends Preference.BaseSavedState {
    public static final Parcelable.Creator<MaterialDialogPreference$SavedState> CREATOR = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47a;
    public final Bundle b;

    public MaterialDialogPreference$SavedState(Parcel parcel) {
        super(parcel);
        this.f47a = parcel.readInt() == 1;
        this.b = parcel.readBundle();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f47a ? 1 : 0);
        parcel.writeBundle(this.b);
    }

    public MaterialDialogPreference$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
